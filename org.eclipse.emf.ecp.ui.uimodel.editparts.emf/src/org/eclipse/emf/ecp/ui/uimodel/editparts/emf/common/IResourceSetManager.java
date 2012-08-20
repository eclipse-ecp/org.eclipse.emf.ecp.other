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

/**
 * Handles the resources of the ui models.
 */
public interface IResourceSetManager {

	public static final String ORPHAN_VIEWS_EXTENSION = "orphan";

	/**
	 * Is used to register orphan views.
	 */
	public static final String ORPHAN_VIEW_RESOURCE_URI_STRING = "http://eclipse.org/emf/emfclient/uimodel.orphan";
	public static final URI ORPHAN_VIEW_RESOURCE_URI = URI.createURI(ORPHAN_VIEW_RESOURCE_URI_STRING);

	/**
	 * Returns the resource for the given uri.
	 * 
	 * @param uri
	 * @return
	 */
	Resource getResource(String uri);

	/**
	 * Returns the resource for the given uri.
	 * 
	 * @param uri
	 * @return
	 */
	Resource getResource(URI uri);

	/**
	 * Returns the resource set.
	 * 
	 * @return
	 */
	ResourceSet getResourceSet();

}
