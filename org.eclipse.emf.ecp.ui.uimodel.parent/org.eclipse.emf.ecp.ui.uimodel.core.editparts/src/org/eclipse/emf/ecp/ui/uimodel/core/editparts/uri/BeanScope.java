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

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IBeanRegistry;

public class BeanScope extends AbstractScope {

	public static final String URI_AUTHORITY = "bean";
	private static final String SEGMENT_TEMPLATE = "bean/%s";
	private final AccessibleScope parent;
	private final String selector;

	private FragmentScope fragmentScope;

	public BeanScope(AccessibleScope parent, String selector) {
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
	 * Returns the fragment scope including the given fragment. <br>
	 * Is part of fluent API.
	 * 
	 * @param fragment
	 * @return
	 */
	public FragmentScope fragment(String fragment) {
		if (fragment == null || fragment.equals("")) {
			return null;
		}
		fragmentScope = new FragmentScope(this, fragment);
		return fragmentScope;
	}

	/**
	 * Accesses the object in the given context that is described by the uri
	 * segment of this scope.
	 * 
	 * @param context
	 * @return
	 */
	public Object access(IBeanRegistry accessible) {
		Object result = null;
		Object bean = accessible.getBean(selector);
		if (fragmentScope != null) {
			result = fragmentScope.access(bean);
		} else {
			result = bean;
		}
		return result;
	}

	/**
	 * Returns the fragment scope
	 * 
	 * @return FragmentScope
	 */
	public FragmentScope getFragmentScope() {
		return fragmentScope;
	}

	public String toString() {
		return toURIString();
	}

}
