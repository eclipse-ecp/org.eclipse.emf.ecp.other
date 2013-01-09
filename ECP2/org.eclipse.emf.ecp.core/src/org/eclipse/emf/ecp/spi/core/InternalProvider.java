/**
 * Copyright (c) 2011 Eike Stepper (Berlin, Germany) and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.ecp.spi.core;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.util.ECPModelContext;
import org.eclipse.emf.ecp.core.util.ECPModelContextProvider;
import org.eclipse.emf.ecp.core.util.ECPProviderAware;
import org.eclipse.emf.ecp.spi.core.util.AdapterProvider;
import org.eclipse.emf.ecp.spi.core.util.InternalChildrenList;
import org.eclipse.emf.ecp.spi.core.util.InternalRegistryElement;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author Eike Stepper
 * @author Eugen Neufeld
 */
public interface InternalProvider extends ECPProvider, ECPProviderAware, ECPModelContextProvider,
	InternalRegistryElement, AdapterProvider {
	/**
	 * Possible lifecycle events.
	 * 
	 * @author Eike Stepper
	 */
	public enum LifecycleEvent {
		/**
		 * Called on create.
		 */
		CREATE,
		/**
		 * Called on initialization.
		 */
		INIT,
		/**
		 * Called on disposal.
		 */
		DISPOSE,
		/**
		 * Called when removed.
		 */
		REMOVE;
	}

	/**
	 * {@link ComposedAdapterFactory} to use.
	 */
	ComposedAdapterFactory EMF_ADAPTER_FACTORY = new ComposedAdapterFactory(
		ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	/**
	 * Allows access of the corresponding UI Adapter.
	 * 
	 * @return the UIProvider for this provider
	 */
	AdapterProvider getUIProvider();

	/**
	 * Allows to set the uiProvider.
	 * 
	 * @param uiProvider the uiProvider to set
	 */
	void setUIProvider(AdapterProvider uiProvider);

	/**
	 * This method creates an editing domain each time it is called.
	 * 
	 * @param project the {@link InternalProject} to create the domain for.
	 * @return the created {@link EditingDomain}
	 */
	EditingDomain createEditingDomain(InternalProject project);

	/**
	 * Whether this provider is slow or not. Slow objects are handled differently.
	 * 
	 * @param parent to check
	 * @return true if slow, false otherwise
	 */
	boolean isSlow(Object parent);

	/**
	 * Fills the elements of a certain parent object, depending on the context into the childrenList.
	 * 
	 * @param context the context to use
	 * @param parent the parent to read the children from
	 * @param childrenList the list to fill
	 */
	void fillChildren(ECPModelContext context, Object parent, InternalChildrenList childrenList);

	/**
	 * This method is called to handle a specific life cycle.
	 * 
	 * @param context the context to handle the lifecycle for
	 * @param event the lifecycle event to handle
	 */
	void handleLifecycle(ECPModelContext context, LifecycleEvent event);

	/**
	 * This method returns an {@link EList} of the root elements.
	 * 
	 * @param project the project to get the root elements for
	 * @return list of root elements of this project
	 */
	EList<? extends Object> getElements(InternalProject project);

	/**
	 * {@link EPackage}s that are not supported by this provider.
	 * 
	 * @param ePackages
	 *            packages to filter from
	 * @param repository the repository to check
	 * @return a {@link Collection} of {@link EPackage}s that are not supported
	 */
	Collection<EPackage> getUnsupportedEPackages(Collection<EPackage> ePackages, InternalRepository repository);

	/**
	 * Return all {@link EObject}s that this provider supports for linking them to the modelElement and the provided
	 * eReference.
	 * 
	 * @param project
	 *            - the project the call is from
	 * @param modelElement
	 *            - {@link EObject} to add the {@link EReference} to
	 * @param eReference
	 *            - the {@link EReference} to add
	 * @return {@link Iterator} of {@link EObject} that can be linked
	 */
	Iterator<EObject> getLinkElements(InternalProject project, EObject modelElement, EReference eReference);

	/**
	 * This method manually triggers the save of the model data.
	 * 
	 * @param project the project to save the model data for
	 */
	void doSave(InternalProject project);

	/**
	 * This method checks, whether the model is in a dirty state.
	 * 
	 * @param project the project to check the dirty state for
	 * @return true if model is dirty, false otherwise
	 */
	boolean isDirty(InternalProject project);

	/**
	 * This method checks, whether a specific project has autosave or not.
	 * 
	 * @param project the project to check
	 * @return true if autosave is enabled, false otherwise
	 */
	boolean hasAutosave(InternalProject project);

	/**
	 * Deletes a collection of EObjects from the model.
	 * 
	 * @param project the project from where to delete
	 * @param eObjects the {@link Collection} if {@link EObject}s to delete
	 */
	void delete(InternalProject project, Collection<EObject> eObjects);

	/**
	 * This method clones a project.
	 * 
	 * @param projectToClone the project to be cloned
	 * @param targetProject the project to add the cloned data to
	 */
	void cloneProject(final InternalProject projectToClone, InternalProject targetProject);

	/**
	 * Checks whether the data of the project still exists, method is called on startup. {@link DefaultProvider}
	 * implements this by returning true, adopt if needed.
	 * 
	 * @param project {@link InternalProject} to check
	 * @return true if data exists, false otherwise
	 */
	boolean modelExists(InternalProject project);

	/**
	 * Method checking whether an object is the root of the model container.
	 * 
	 * @param project to check the root container for
	 * @return a {@link Notifier} that is the model root of this project
	 */
	Notifier getRoot(InternalProject project);

	/**
	 * Array of all ECPProjects based on this ECPProvider which are open.
	 * 
	 * @return open projects using this ECPProvider
	 */
	ECPProject[] getOpenProjects();
}
