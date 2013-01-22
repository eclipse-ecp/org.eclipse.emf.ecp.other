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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.uri;

import java.net.URI;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IServiceRegistry;

public class ServiceScope extends AbstractScope {

	public static final String URI_AUTHORITY = "service";
	private static final String SEGMENT_TEMPLATE = "service/%s";
	private final AccessibleScope parent;
	private final String selector;

	public ServiceScope(AccessibleScope parent, String selector) {
		this.parent = parent;
		this.selector = selector;

		setURISegment(String.format(SEGMENT_TEMPLATE, selector));
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends AccessibleScope> A root() {
		return (A) parent;
	}

	protected AccessibleScope getViewScope() {
		return root();
	}

	/**
	 * Returns the URI representation of this bean scope.
	 * 
	 * @return URI
	 */
	public URI toURI() {
		return URI.create(toURIString());
	}

	/**
	 * Returns the URI string of the produced string token.
	 * 
	 * @return String string
	 */
	public String toURIString() {
		return parent.getURISegment().concat(getURISegment());
	}

	/**
	 * Accesses the object in the given context that is described by the uri
	 * segment of this scope.
	 * 
	 * @param context
	 * @return
	 */
	public Object access(IServiceRegistry context) {
		return context.getService(selector);
	}

	public String toString() {
		return toURIString();
	}
}
