/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.uimodel.core.editparts;

import java.util.List;

/**
 * An IUiLayoutEditpart is an abstraction of a uiElementContainer. Itself can contain {@link IUiEmbeddableEditpart} and
 * so layouts can also contain other layouts.
 */
public interface IUiLayoutEditpart extends IUiEmbeddableEditpart {

	/**
	 * Returns an unmodifiable list with all children contained in the layout.
	 * 
	 * @return
	 */
	List<IUiEmbeddableEditpart> getElements();

	/**
	 * Adds an element to the layout. Adding the same element twice has no effect.
	 * 
	 * @param element
	 */
	void addElement(IUiEmbeddableEditpart element);

	/**
	 * Removes an element from the layout.
	 * 
	 * @param element
	 */
	void removeElement(IUiEmbeddableEditpart element);

}
