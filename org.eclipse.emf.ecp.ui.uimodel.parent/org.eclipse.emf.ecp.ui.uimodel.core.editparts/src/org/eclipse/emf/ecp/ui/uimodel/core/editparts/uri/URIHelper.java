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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class URIHelper {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory
			.getLogger(URIHelper.class);

	/**
	 * Creates a new view context scope.
	 * 
	 * @return
	 */
	public static ViewScope view() {
		return new ViewScope();
	}

	/**
	 * Creates a new view set context scope.
	 * 
	 * @return
	 */
	public static ViewsetScope viewset() {
		return new ViewsetScope();
	}

	/**
	 * Uses the uriString to create the {@link AccessibleScope} based on that
	 * information.
	 * 
	 * @param uriString
	 * @return
	 */
	public static <A extends AccessibleScope> A toScope(String uriString) {
		return toScope(URI.create(uriString));
	}

	/**
	 * Uses the uri to create the {@link AccessibleScope} based on that
	 * information.
	 * 
	 * @param uriString
	 * @return
	 */
	public static <A extends AccessibleScope> A toScope(URI uri) {
		A scope = null;
		if (ViewScope.SCHEMA.equals(uri.getScheme())) {
			scope = parse(uri, view());
		} else if (ViewsetScope.SCHEMA.equals(uri.getScheme())) {
			scope = parse(uri, viewset());
		}
		return scope;
	}

	/**
	 * Parses the uri and invokes the related methods on the viewScope.
	 * 
	 * @param uri
	 * @param viewScope
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private static <A extends AccessibleScope> A parse(URI uri,
			AccessibleScope viewScope) {

		// uri.getPath() always starts with "/", but as selector within the
		// context it is used without therefor the creation of selector-String
		//
		String selector = uri.getPath().substring(1);
		if (BeanScope.URI_AUTHORITY.equals(uri.getAuthority())) {
			viewScope.bean(selector).fragment(uri.getFragment());
		} else if (ServiceScope.URI_AUTHORITY.equals(uri.getAuthority())) {
			viewScope.service(selector);
		}
		return (A) viewScope;
	}

}
