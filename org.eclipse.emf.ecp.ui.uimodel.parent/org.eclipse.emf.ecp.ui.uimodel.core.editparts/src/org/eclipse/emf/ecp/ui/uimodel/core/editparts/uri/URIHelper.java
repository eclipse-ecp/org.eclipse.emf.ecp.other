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

public class URIHelper {

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
	public static ViewsetScope viewsetContext() {
		return new ViewsetScope();
	}

}
