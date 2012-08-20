/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.editparts.emf.common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.uimodel.editparts.emf.internal.OrphanViewsResource;

public class ResourceSetManager implements IResourceSetManager {

	private static IResourceSetManager instance = new ResourceSetManager();

	private ResourceSet resourceSet;

	/**
	 * Returns the instance of that manager.
	 * 
	 * @return the instance
	 */
	public static IResourceSetManager getInstance() {
		return instance;
	}

	@Override
	public Resource getResource(String uri) {
		return getResource(URI.createURI(uri));
	}

	@Override
	public Resource getResource(URI uri) {
		return getResourceSet().getResource(uri, true);
	}

	@Override
	public ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(ORPHAN_VIEWS_EXTENSION, new OrphanViewsResource.OrphanViewsResourceFactory());
			resourceSet.getPackageRegistry().put(UiModelPackage.eNS_URI, UiModelPackage.eINSTANCE);
		}
		return resourceSet;
	}

}
