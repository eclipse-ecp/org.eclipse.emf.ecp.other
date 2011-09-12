/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering, Technische Universitaet Muenchen. All rights
 * reserved. This program and the accompanying materials are made available under the terms of the Eclipse Public
 * License v1.0 which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.teamprovider.recording.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.emfstore.teamprovider.recording.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * This ResourceFactroy wrapper is used to loaded another resource than the default one. Ecore files have often links to
 * other Ecore files, this liks begin with platform://... so the default ResourceFactory wants to load the Ecore file
 * from the workspace. But if this file is an EMF Store managed file, the content from the EMF Store should be loaded.
 * To handle this issue is this class responsible.
 * 
 * @author emueller
 */
public class ResourceFactoryRegistry implements Resource.Factory, Resource.Factory.Registry {

	/**
	 * The initial resource factory is kept if a file is not EMF Store managed, so the initial resource factory has to
	 * handle the file.
	 */
	private static Map<String, Object> initialResourceFactory = new HashMap<String, Object>();
	private static IResourceChangeListener resourceChangeListener;
	
	/**
	 * The Resource.Factory.Registry will be manipulated, so that the EMFStoreResourceFactoryWrapper will be responsible
	 * for Ecore files.
	 */
	public static void replaceSupportedFactories() {
		Map<String, Object> extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		Object ecoreFactory = extensionToFactoryMap.get("ecore");
		for (String key : extensionToFactoryMap.keySet()) {
			Object currentFactory = extensionToFactoryMap.get(key);
			if (ecoreFactory == currentFactory) {
				// remember initial ResourceFactory
				initialResourceFactory.put(key, currentFactory);

				// replace factory in registry with an EMF Store adapted one.
				extensionToFactoryMap.put(key, new ResourceFactoryRegistry());
			}
		}
	}

	public static URI CURRENT_URI;

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.resource.Resource.Factory#createResource(org.eclipse.emf.common.util.URI)
	 */
	public Resource createResource(final URI uri) {
	
		// file was not a EMFStore Resource - use initial resource factory
		Object object = initialResourceFactory.get("ecore");
		Factory factory = null;
		if (object instanceof Resource.Factory.Registry) {
			Resource.Factory.Registry registry = (Resource.Factory.Registry) object;
			factory = registry.getFactory(uri);

		} else if (object instanceof Resource.Factory.Descriptor) {
			Resource.Factory.Descriptor descriptor = (Resource.Factory.Descriptor) object;
			factory = descriptor.createFactory();
		}

		XMIResource xmiResource = (XMIResource) factory.createResource(uri);
		IFile artifactFile = FileUtil.getFile(xmiResource.getURI());
		
		// file has been marked to be put under recorder control
		if (ArtifactRegistry.getInstance().isFlagged(uri)) {
			Artifact artifact = new Artifact(xmiResource);
			ArtifactRegistry.getInstance().addVersionedArtifact(artifact);
			artifact.initialize();
			IFile historyFile = FileUtil.getHistoryFile(artifactFile);
			Activator.VCS_PROVIDER.addToVCS(historyFile);						
			ArtifactRegistry.getInstance().removeFlag(uri);

		} else if (ArtifactRegistry.getInstance().isRegistered(uri)) {
			Artifact versionedArtifact = ArtifactRegistry.getInstance().getVersionedArtifact(uri);
			if (!versionedArtifact.isInitialized()) {
				versionedArtifact.initialize(xmiResource);
			}			
		}
		
		CURRENT_URI = uri;
		
		// TODO: this is UI code!
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		if (win != null) {
			IWorkbenchPage page = win.getActivePage();
			//the active part
			// IWorkbenchPart active = page.getActivePart();
			page.addPartListener(new RecorderPartListener(artifactFile));
		}

		return xmiResource;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.resource.Resource.Factory.Registry#getFactory(org.eclipse.emf.common.util.URI)
	 */
	public Factory getFactory(URI uri) {
		return this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.resource.Resource.Factory.Registry#getFactory(org.eclipse.emf.common.util.URI,
	 *      java.lang.String)
	 */
	public Factory getFactory(URI uri, String contentType) {
		return this;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.resource.Resource.Factory.Registry#getProtocolToFactoryMap()
	 */
	public Map<String, Object> getProtocolToFactoryMap() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.resource.Resource.Factory.Registry#getExtensionToFactoryMap()
	 */
	public Map<String, Object> getExtensionToFactoryMap() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecore.resource.Resource.Factory.Registry#getContentTypeToFactoryMap()
	 */
	public Map<String, Object> getContentTypeToFactoryMap() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Object getDefaultFactory(String extension) {
		return initialResourceFactory.get(extension);
	}
}
