package org.eclipse.emf.emfstore.teamprovider.recording;

import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.SerializationException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.emfstore.server.model.versioning.operations.AbstractOperation;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.RepositoryNotFoundException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.team.core.history.IFileRevision;
import org.xml.sax.InputSource;

public abstract class AbstractVCSProvider<T,R> implements IVCSProvider<T,R> {

	/**
	 * URI used to serialize EObject with the model util.
	 */
	public static final URI VIRTUAL_URI = URI.createURI("virtualUri");
	
	/*
	// TODO: uitext descriptions
	protected void merge(IResource resource, IProgressMonitor monitor)
	throws InvocationTargetException, InterruptedException {
				
	
		IRevision<T> headCommit = getHeadRevision(resource, monitor);
		IRepository<R> repository = getRepository(resource.getProject());
		IRevision<T> ancestorCommit = getAncestorRevision(rightCommit, headCommit, repository, monitor);
		
		String rightFile = getFile(repository, rightCommit, monitor);
		String headFile = getFile(repository, headCommit, monitor);
		String ancFile = getFile(repository, ancestorCommit, monitor);
		
		List<AbstractOperation> headOperations = getOperations(headFile);
		List<AbstractOperation> rightOperations = getOperations(rightFile);
	}*/

	public List<AbstractOperation> getRightOperations(IResource resource, IProgressMonitor monitor) {
		try {
			IRevision<T> rightCommit = getRightRevision(resource, monitor);
			String rightFile = getFile(resource, rightCommit, monitor);
			List<AbstractOperation> rightOperations = getOperations(rightFile);
			return rightOperations;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<AbstractOperation> getHeadOperations(IResource resource, IProgressMonitor monitor) {
		IRevision<T> rightCommit;
		try {
			rightCommit = getHeadRevision(resource, monitor);
			String rightFile = getFile(resource, rightCommit, monitor);
			List<AbstractOperation> headOperations = getOperations(rightFile);
			return headOperations;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}
	
	public List<AbstractOperation> getOperations(String s) {
		// TODO Auto-generated method stub
		EList<EObject> ops1 = null;
		try {
			ops1 = stringToEObject(s);
		} catch (SerializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<AbstractOperation> result = new ArrayList<AbstractOperation>();
		for (EObject obj : ops1) {
			if (obj instanceof AbstractOperation) {
				AbstractOperation op = (AbstractOperation) obj;
				result.add(op);
			}
		}
		
		return result;
	}
	
	/**
	 * Converts a {@link String} to an {@link EObject}. <b>Note</b>:
	 * {@link String} must be the result of
	 * {@link ModelUtil#eObjectToString(EObject)}
	 * 
	 * @param object
	 *            the {@link String} representation of the {@link EObject}
	 * @return the deserialized {@link EObject}
	 * @throws SerializationException
	 *             if deserialization fails
	 */
	public EList<EObject> stringToEObject(String object)
			throws SerializationException {
		if (object == null) {
			return null;
		}

		XMIResource res = (XMIResource) (new ResourceSetImpl())
				.createResource(VIRTUAL_URI);

		try {
			res.load(new InputSource(new StringReader(object)),
					null);
		} catch (UnsupportedEncodingException e) {
			// TODO;
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		EList<EObject> result = res.getContents();
		

		// TODO: added to resolve model element map in a CreateDeleteOp
		// check whether we can generalize this
		for (EObject o : result) {
			EcoreUtil.resolveAll(o);
		}

		res.getContents().remove(result);
		return result;
	}
}