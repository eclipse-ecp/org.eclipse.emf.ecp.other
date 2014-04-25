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
package org.eclipse.emf.ecp.ecview.ui.core.editparts.extension;

import java.util.List;

import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;

/**
 * The abstraction for a tab sheet.
 */
public interface ITabSheetEditpart extends IEmbeddableEditpart {

	/**
	 * Returns an unmodifiable list with all tabs contained in the tabsheet.
	 * 
	 * @return elements The children editparts contained in this tabsheet
	 */
	List<ITabEditpart> getTabs();

	/**
	 * Adds a tab to the tabsheet. Adding the same tab twice has no
	 * effect.
	 * 
	 * @param tab
	 *            The editpart to be added.
	 */
	void addTab(ITabEditpart tab);

	/**
	 * Removes a tab from the tabsheet.
	 * 
	 * @param element
	 *            The editpart to be removed.
	 */
	void removeTab(ITabEditpart tab);

}
