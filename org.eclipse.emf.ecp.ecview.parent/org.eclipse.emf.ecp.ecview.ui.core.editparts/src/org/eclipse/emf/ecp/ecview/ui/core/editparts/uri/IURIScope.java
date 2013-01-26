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
package org.eclipse.emf.ecp.ecview.ui.core.editparts.uri;

/**
 * URI scopes are used to build an accessor for a given URI.
 */
public interface IURIScope {

	/**
	 * Returns the segment that is contributed by the current scope to the
	 * resulting URI.
	 * <p>
	 * For that scope may provide "bean/org.my.bean" to an URI that results in
	 * <code>"view://bean/org.my.bean#person.address.country"</code>.
	 * 
	 * @return String
	 */
	public String getURISegment();

	/**
	 * Returns the view scope or view set scope. <br>
	 * Is part of fluent API.
	 * 
	 * @return root scope
	 */
	public <A extends AccessibleScope> A root();

}
