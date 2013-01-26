/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.editpart.emf.common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * Handles the resources of the ui models.
 */
public interface IResourceManager {

	/**
	 * The file extension used for the orphan views resource.
	 */
	String ORPHAN_VIEWS_EXTENSION = "orphan";

	/**
	 * Is used to register orphan views.
	 */
	String ORPHAN_VIEW_RESOURCE_URI_STRING = "http://eclipse.org/emf/emfclient/uimodel.orphan";
	
	/**
	 * The URI to access the resource for orphan views from the resource set.
	 */
	URI ORPHAN_VIEW_RESOURCE_URI = URI.createURI(ORPHAN_VIEW_RESOURCE_URI_STRING);

	/**
	 * Returns the resource for the given uri.
	 * 
	 * @param uri the uri to be used to access the resource
	 * @return resource
	 */
	Resource getResource(String uri);

	/**
	 * Returns the resource for the given uri.
	 * 
	 * @param uri the uri to be used to access the resource
	 * @return resource
	 */
	Resource getResource(URI uri);

	/**
	 * Returns the resource set.
	 * 
	 * @return resourceSet
	 */
	ResourceSet getResourceSet();

}
