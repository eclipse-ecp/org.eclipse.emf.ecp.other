/*******************************************************************************
 * Copyright (c) 2011-2012 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 ******************************************************************************/
package org.eclipse.emf.ecp.internal.ui;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * @author Eugen Neufeld
 * 
 */
public class ECPViewerFilter extends ViewerFilter {

	private String searchTerm;

	/**
	 * Sets the search term for this name filter.
	 * 
	 * @param searchTerm
	 *            the search term
	 */
	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	protected String getSearchTerm() {
		return searchTerm;
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return true;
	}

}
