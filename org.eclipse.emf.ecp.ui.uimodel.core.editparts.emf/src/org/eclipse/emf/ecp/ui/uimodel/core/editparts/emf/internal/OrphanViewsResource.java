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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.internal;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * A special resource used for orphan views.
 */
public class OrphanViewsResource extends ResourceImpl {

	public OrphanViewsResource(URI uri) {
		super(uri);
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
		// ignore
	}

	public static class OrphanViewsResourceFactory implements Resource.Factory {
		@Override
		public Resource createResource(URI uri) {
			return new OrphanViewsResource(uri);
		}
	}
}
