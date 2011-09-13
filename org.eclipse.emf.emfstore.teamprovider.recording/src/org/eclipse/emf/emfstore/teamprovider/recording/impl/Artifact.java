package org.eclipse.emf.emfstore.teamprovider.recording.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.emfstore.client.model.impl.OperationRecorder;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.impl.ProjectImpl;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.teamprovider.recording.Activator;

public class Artifact {

	private XMIResource xmiResource;
	private XMIResource historyResource;
	private Project collection;
	private OperationRecorder operationRecorder;
	private OperationPersister operationPersister;
	private boolean isInitialized;
	private Project project;
	private List<AbstractOperation> operations;

	/**
	 * Constructor.
	 * @param modelResource the model resource
	 */
	public Artifact(XMIResource modelResource) {
		this.xmiResource = modelResource;
	}
	
	public void initialize() {
		if (getModelResource() != null) {
			initialize(getModelResource());
		}
	}
	
	public void initialize(XMIResource xmiResource) {
		this.xmiResource = xmiResource;
		try {
			project = new ProjectImpl(getModelResource());
			collection = project;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		operationRecorder = new OperationRecorder(getCollection(), getCollection().getChangeNotifier());
		URI historyUri = getModelResource().getURI().trimFileExtension().appendFileExtension("hist");
		
		/**
		 * read history file, put all operations read into operations list attribute
		 * -> revert should be possible after restart
		 */
		// TODo
//		IFile file = root.getFile(new Path(historyFilePath)) ;
//		historyUri = URI.createFileURI(historyUri);
		ResourceSet resourceSet = getModelResource().getResourceSet() == null ? new ResourceSetImpl() : getModelResource().getResourceSet();
		this.historyResource = ((XMIResource) resourceSet.createResource(historyUri));
		
		try {
			historyResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		operationPersister = new OperationPersister(getModelResource(), getHistoryResource());
		operationRecorder.addOperationRecorderListener(operationPersister);		
		operationRecorder.startChangeRecording();
		isInitialized = true;
		
		if (ArtifactRegistry.getInstance().isMarkedForClearHistory(xmiResource.getURI())) {
			try {
				Activator.VCS_PROVIDER.clearHistFile(FileUtil.getFile(xmiResource.getURI()));
				ArtifactRegistry.getInstance().removeClearHistory(xmiResource.getURI());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void dispose() {
		// TODO: in which cases are the recorder and the persister null?
		if (operationRecorder != null){
			operationRecorder.stopChangeRecording();
			operationRecorder.removeOperationRecorderListener(operationPersister);
		}

		if (operationPersister != null){
			operationPersister.dispose();
		}
		
		this.collection = null;
		operationRecorder = null;
		operationPersister = null;		
		isInitialized = false;
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.emfstore.client.model.ProjectSpace#undoLastOperation()
	 */
	private void undoLastOperation() {
		if (!this.operations.isEmpty()) {
			List<AbstractOperation> operations = this.operations;
			AbstractOperation lastOperation = operations
					.get(operations.size() - 1);
			((ProjectImpl) project).getChangeNotifier().disableNotifications(true);
			try {
				lastOperation.reverse().apply(project);
			} finally {
				((ProjectImpl) project).getChangeNotifier().disableNotifications(false);
			}
			operations.remove(lastOperation);
		}
	}
	
	/**
	 * Reverts the 
	 * @param operations
	 */
	public void revert(List<AbstractOperation> operations) {
		this.operations = operations; 
		while (!this.operations.isEmpty()) {
			undoLastOperation();
		}
	}

	public boolean isInitialized() {
		return isInitialized;
	}
	
	public URI getURI() {
		return getModelResource().getURI();
	}

	// TODO: hide
	public Project getCollection() {
		return collection;
	}

	/**
	 * Returns the history resource of this artifact.
	 * @return the history resource
	 */
	public XMIResource getHistoryResource() {
		return historyResource;
	}
	
	/**
	 * Returns the model resource of this artifact.
	 * @return the model resource
	 */
	public XMIResource getModelResource() {
		return xmiResource;
	}
}
