package org.eclipse.emf.emfstore.teamprovider.recording.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.emfstore.client.ui.dialogs.merge.DecisionManager;
import org.eclipse.emf.emfstore.client.ui.dialogs.merge.MergeWizard;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.impl.ProjectImpl;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.common.model.util.SerializationException;
import org.eclipse.emf.emfstore.server.model.versioning.ChangePackage;
import org.eclipse.emf.emfstore.server.model.versioning.PrimaryVersionSpec;
import org.eclipse.emf.emfstore.server.model.versioning.VersioningFactory;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.teamprovider.recording.IVCSProvider;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;

public class ArtifactMerger<T, R> {

	private IResource resource;
	private final Project project;
	private XMIResource historyResource;
	private final XMIResource xmiResource;
	private IVCSProvider<T, R> provider;
	
	public ArtifactMerger(IVCSProvider<T, R> provider, IResource resource,
			Artifact artifact) {
		this.resource = resource;
		this.xmiResource = artifact.getModelResource();
		this.historyResource = artifact.getHistoryResource();
		this.project = artifact.getCollection();
		this.provider = provider;
	}
	
	public void merge() {
		try {
			String artifactFile = provider.getMyModelResourceFile(FileUtil.getFile(xmiResource.getURI()), new NullProgressMonitor());
			EObject stringToEObject = ModelUtil.stringToEObject(artifactFile);
			writeToXMIResource(Collections.singletonList(stringToEObject), xmiResource);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (RepositoryNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SerializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List myOperations = provider.getMyOperations(resource, new NullProgressMonitor());
		List theirOperations = provider.getHeadOperations(resource, new NullProgressMonitor());
		List<AbstractOperation> mergeResult = callMergeDialog(myOperations, theirOperations);
		// if mergeResult is empty, file have been auto-merged
		try {
			Artifact artifact = ArtifactRegistry.getInstance().getVersionedArtifact(ResourceFactoryRegistry.CURRENT_URI);
			applyMergeResult(artifact, myOperations, theirOperations, mergeResult);
			// resolve conflict on ecore
			IFile artifactFile = FileUtil.getFile(xmiResource.getURI());
			provider.resolveConflict(artifactFile);
			this.historyResource.getContents().clear();
			this.historyResource.getContents().addAll(mergeResult);
			this.historyResource.save(null);
			provider.resolveConflict(FileUtil.getHistoryFile(artifactFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Applies a list of operations to the project. The change tracking is
	 * stopped and the operations are added to the projectspace.
	 * 
	 * @see #applyOperationsWithRecording(List, boolean)
	 * @param operations
	 *            list of operations
	 * @param addOperation
	 *            true if operation should be saved in project space.
	 */
	public void applyOperations(List<AbstractOperation> operations) {
		// TODO: API
		((ProjectImpl) project).getChangeNotifier().disableNotifications(true);
		try {
			for (AbstractOperation operation : operations) {
				operation.apply(project);
			}
		} finally {
			((ProjectImpl) project).getChangeNotifier().disableNotifications(false);
		}
	}
	
	private ChangePackage createChangePackage(List<AbstractOperation> operations) {
		ChangePackage changePackage = VersioningFactory.eINSTANCE.createChangePackage();

		for (EObject o : operations) {
			AbstractOperation copy = (AbstractOperation) EcoreUtil.copy(o);
			changePackage.getOperations().add(copy);
		}
		
		return changePackage;
	}

	private List<AbstractOperation> callMergeDialog(List<AbstractOperation> myOperations, 
			List<AbstractOperation> theirOperations) {
		
		ChangePackage myChangePackage = createChangePackage(myOperations);
		ChangePackage theirChangePackage = createChangePackage(theirOperations);
		
		PrimaryVersionSpec dummy = VersioningFactory.eINSTANCE.createPrimaryVersionSpec();
		
		DecisionManager mgr = new DecisionManager(project, 
				myChangePackage, Collections.singletonList(theirChangePackage), 
				dummy, dummy);
		mgr.calcResult();
		List<AbstractOperation> mergeResult = new ArrayList<AbstractOperation>();
	
		if (mgr.getConflicts().size() > 0 ) {
			MergeWizard mergeWizard = new MergeWizard(mgr);
			WizardDialog mergeDialog = new WizardDialog(Display.getCurrent().getActiveShell(), mergeWizard);
			mergeDialog.create();
			// TODO: handle cancel case
			mergeDialog.open();

			// generate merge result and apply to local workspace
			List<AbstractOperation> acceptedMine = mgr.getAcceptedMine();
			List<AbstractOperation> rejectedTheirs = mgr.getRejectedTheirs();
		
			for (AbstractOperation operationToReverse : rejectedTheirs) {
				mergeResult.add(0, operationToReverse.reverse());
			}
			
			mergeResult.addAll(acceptedMine);
		} 
		
		return mergeResult;
	}
	
	/**
	 * Applies the given merge result upon the given {@link Artifact}. 
	 * @param artifact the {@link Artifact} upon which to apply the merge result
	 * @param myOperations the local operations
	 * @param theirOperations the incoming operations
	 * @param mergeResult the merge result as determined by the user
	 * @throws IOException
	 */
	private void applyMergeResult(Artifact artifact, List<AbstractOperation> myOperations, 
			List<AbstractOperation> theirOperations, List<AbstractOperation> mergeResult) 
		throws IOException {
		
		ChangePackage myChangePackage = createChangePackage(myOperations);
		ChangePackage theirChangePackage = createChangePackage(theirOperations);
		
		// revert our changes
		artifact.revert(myChangePackage.getOperations());

		applyOperations(theirChangePackage.getOperations());
		applyOperations(mergeResult);

		// write merge result back to model resource
		List<EObject> modelElements = ModelUtil.clone(project.getModelElements());

		try {
			writeToXMIResource(mergeResult, historyResource);
		} catch (IOException e) {
			throw new IOException(String.format("Can not write merge result {0} to history resource {1}. Reason: {2}", 
					mergeResult, historyResource, e.getMessage())); 
		}
		
		try {
			writeToXMIResource(modelElements, xmiResource);
		} catch (IOException e) {
			throw new IOException(String.format("Can not write model elements {0} to resource {1}. Reason: {2}", 
					modelElements, xmiResource, e.getMessage())); 
		}
	}

	/**
	 * Write 
	 * @param modelElements
	 * @param resource
	 * @throws IOException
	 */
	private void writeToXMIResource(List<? extends EObject> modelElements, XMIResource resource) throws IOException {
		resource.getContents().clear();
		resource.getContents().addAll(modelElements);
		resource.save(null);
	}
}
