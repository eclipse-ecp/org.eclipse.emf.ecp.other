package org.eclipse.emf.emfstore.teamprovider.recording;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.RepositoryNotFoundException;
import org.eclipse.team.core.history.IFileRevision;

public interface IVCSProvider<T,R> {

	// TODO: no exceptions
	boolean clearHistFile(IFile historyFile) throws IOException;
	
	String getArtifactFile(IResource resource, IProgressMonitor monitor) throws IOException, InterruptedException, RepositoryNotFoundException;
	
	void pullHook();
	
	void resolveConflict(IFile file);
	
	void addToVCS(IFile file);
	
	IRepository<R> getRepository(IResource resource)
	throws RepositoryNotFoundException;

	// TODO: replace IOException
	IRevision<T> getRightRevision(IResource resource, IProgressMonitor monitor)
	throws IOException, InterruptedException;
	
	// TODO: replace IOException
	IRevision<T> getHeadRevision(IResource resource, IProgressMonitor monitor)
	throws IOException, InterruptedException;
	
	IRevision<T> getAncestorRevision(IRevision<T> rightRevision, IRevision<T> headRevision,
			IRepository<R> repository, IProgressMonitor monitor) 
	throws IOException, InterruptedException;

	IFileRevision getFileRevision(IRepository<R> repository,
			IRevision<T> revision, String objectId);
	
	// TODO: hiden, wenn moeglich, nur eine methode statt zwei
	List<AbstractOperation> getRightOperations(IResource resource, IProgressMonitor monitor);
	List<AbstractOperation> getHeadOperations(IResource resource, IProgressMonitor monitor);
	
	// TODO: rename
	String getFile(IResource resource, IRevision<T> revision, IProgressMonitor monitor);
}
