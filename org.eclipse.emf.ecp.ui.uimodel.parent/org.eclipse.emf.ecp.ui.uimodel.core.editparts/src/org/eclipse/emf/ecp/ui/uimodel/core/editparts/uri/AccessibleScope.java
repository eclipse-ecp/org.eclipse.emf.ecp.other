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

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IAccessible;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AccessibleScope extends AbstractScope {

	private static final Logger logger = LoggerFactory
			.getLogger(AccessibleScope.class);

	protected BeanScope beanScope;
	protected ServiceScope serviceScope;

	protected AccessibleScope(String schema) {
		setURISegment(schema);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends AccessibleScope> A root() {
		return (A) this;
	}

	/**
	 * Returns an URI that points to the most deep element expressed in that
	 * scope.
	 * 
	 * @return
	 */
	public URI toFullURI() {
		if (beanScope != null) {
			FragmentScope fragmentScope = beanScope.getFragmentScope();
			return fragmentScope != null ? fragmentScope.toURI() : beanScope
					.toURI();
		} else if (serviceScope != null) {
			return serviceScope.toURI();
		}
		return null;
	}

	/**
	 * Returns the bean scope. If the scope does not have a bean scope then
	 * <code>null</code> is returned.
	 * 
	 * @return
	 */
	public BeanScope getBeanScope() {
		return beanScope;
	}

	/**
	 * Returns the service scope. If the scope does not have a service scope
	 * then <code>null</code> is returned.
	 * 
	 * @return
	 */
	public ServiceScope getServiceScope() {
		return serviceScope;
	}

	/**
	 * Creates a bean scope for the given selector.
	 * 
	 * @param selector
	 * @return
	 */
	public BeanScope bean(String selector) {
		if (serviceScope != null) {
			logger.error("ServiceScope was already defined!");
		}
		beanScope = new BeanScope(this, selector);
		return beanScope;
	}

	/**
	 * Creates a service scope for the given selector.
	 * 
	 * @param selector
	 * @return
	 */
	public ServiceScope service(String selector) {
		if (beanScope != null) {
			logger.error("BeanScope was already defined!");
		}
		serviceScope = new ServiceScope(this, selector);
		return serviceScope;
	}

	/**
	 * Accesses the object in the given context that is described by the uri of
	 * this scope.
	 * 
	 * @param context
	 * @return
	 */
	public abstract Object access(IAccessible context);

	/**
	 * Returns the URI representation of the bean scope string token if exists.
	 * Otherwise it returns 'null'
	 * 
	 * @return URI
	 */
	public URI toBeanURI() {
		return beanScope != null ? beanScope.toURI() : null;
	}

	/**
	 * Returns the URI representation of the bean fragment scope string token if
	 * exists. Otherwise it returns 'null'
	 * 
	 * @return URI
	 */
	public URI toBeanFragmentURI() {
		if (beanScope != null) {
			FragmentScope fragmentScope = beanScope.getFragmentScope();
			return fragmentScope != null ? fragmentScope.toURI() : null;
		}
		return null;
	}

	/**
	 * Returns the String representation of the fragment scope string token
	 * within the bean scope if exists. Otherwise it returns 'null'
	 * 
	 * @return URI
	 */
	public String getBeanFragment() {
		if (beanScope != null) {
			FragmentScope fragmentScope = beanScope.getFragmentScope();
			return fragmentScope != null ? fragmentScope.getURISegment() : "";
		}
		return "";
	}

	/**
	 * Returns the URI representation of the service scope string token if
	 * exists. Otherwise it returns 'null'
	 * 
	 * @return URI
	 */
	public URI toServiceURI() {
		return serviceScope != null ? serviceScope.toURI() : null;
	}

	public String toString() {
		return getURISegment();
	}

}
