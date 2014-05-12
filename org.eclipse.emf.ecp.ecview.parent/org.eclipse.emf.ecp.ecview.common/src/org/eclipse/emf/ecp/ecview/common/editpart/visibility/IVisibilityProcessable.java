/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.editpart.visibility;

/**
 * An element that can handle visibility properties.
 */
public interface IVisibilityProcessable {

	/**
	 * Is called to apply the visibility properties. If <code>null</code> is
	 * passed, it means the same as {@link #resetVisibilityProperties()}.
	 * 
	 * @param properties
	 */
	void apply(IVisibilityPropertiesEditpart properties);

	/**
	 * Is called to reset the currently set visibility properties.
	 */
	void resetVisibilityProperties();

}
