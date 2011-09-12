package org.eclipse.emf.emfstore.teamprovider.recording.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.compare.ITypedElement;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
//import org.eclipse.egit.core.internal.storage.GitFileRevision;
//import org.eclipse.egit.core.project.RepositoryMapping;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.emf.emfstore.teamprovider.recording.Activator;
import org.eclipse.emf.emfstore.teamprovider.recording.IRevision;
import org.eclipse.emf.emfstore.teamprovider.recording.IVCSProvider;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
//import org.eclipse.jgit.api.AddCommand;
//import org.eclipse.jgit.api.RebaseCommand;
//import org.eclipse.jgit.dircache.DirCacheEntry;
//import org.eclipse.jgit.dircache.DirCacheIterator;
//import org.eclipse.jgit.lib.Constants;
//import org.eclipse.jgit.lib.ObjectId;
//import org.eclipse.jgit.lib.Repository;
//import org.eclipse.jgit.lib.RepositoryState;
//import org.eclipse.jgit.revwalk.RevCommit;
//import org.eclipse.jgit.revwalk.RevWalk;
//import org.eclipse.jgit.revwalk.filter.RevFilter;
//import org.eclipse.jgit.treewalk.AbstractTreeIterator;
//import org.eclipse.jgit.treewalk.FileTreeIterator;
//import org.eclipse.jgit.treewalk.TreeWalk;
//import org.eclipse.jgit.treewalk.filter.AndTreeFilter;
//import org.eclipse.jgit.treewalk.filter.NotIgnoredFilter;
//import org.eclipse.jgit.treewalk.filter.OrTreeFilter;
//import org.eclipse.jgit.treewalk.filter.PathFilter;
//import org.eclipse.jgit.treewalk.filter.TreeFilter;
//import org.eclipse.jgit.util.IO;
//import org.eclipse.jgit.util.RawParseUtils;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.team.core.history.IFileRevision;
import org.xml.sax.InputSource;

public class ArtifactMerger {

	private IResource resource;
	private final Project project;
	private XMIResource historyResource;
	private final XMIResource xmiResource;
	
	public ArtifactMerger(IResource resource, XMIResource xmiResource, XMIResource historyResource, Project project) {
		this.resource = resource;
		this.xmiResource = xmiResource;
		this.historyResource =historyResource;
		this.project = project;
		// TODO
		IVCSProvider provider = Activator.VCS_PROVIDER;
		
		try {
			String artifactFile = provider.getArtifactFile(FileUtil.getFile(xmiResource.getURI()), new NullProgressMonitor());
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
		List myOperations = provider.getRightOperations(resource, new NullProgressMonitor());
		List theirOperations = provider.getHeadOperations(resource, new NullProgressMonitor());
		List<AbstractOperation> mergeResult = callMergeDialog(myOperations, theirOperations);
		try {
			merge(myOperations, theirOperations, mergeResult);
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

	private List<AbstractOperation> callMergeDialog(List<AbstractOperation> myOperations, List<AbstractOperation> theirOperations) {
		
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
			
			return mergeResult;
			
//			artifact.getpSpace().
			////////////////////////////////////////
			
			/*
			 * merge result muss auf ecore angewendet werden
			 * 
			 * history file = ancestor commit + ausgewaehlte ops, neu schreiben, konflikt als geloest markieren
			 * (sowohl ecore, als auch evtl. history)
			 */
		} 
		
		return mergeResult;
	}
	
	private void merge(List<AbstractOperation> myOperations, List<AbstractOperation> theirOperations, List<AbstractOperation> mergeResult) 
		throws IOException {
		// fetch currently selected artifact
		// TODO: is there an other, more reasonable way, to fetch the artifact
		
		ChangePackage myChangePackage = createChangePackage(myOperations);
		ChangePackage theirChangePackage = createChangePackage(theirOperations);
		
		
		Artifact artifact = ArtifactRegistry.getInstance().getVersionedArtifact(ResourceFactoryRegistry.CURRENT_URI);

		// revert our changes
		artifact.getOperations().clear();
		artifact.getOperations().addAll((Collection<? extends AbstractOperation>) myChangePackage.getOperations());
		artifact.revert();

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
