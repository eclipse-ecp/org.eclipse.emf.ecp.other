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

/**
 * An IUiEmbeddableEditpart is an abstraction of editparts that can be added to a {@link IUiLayoutEditpart}.</br>
 * They have an assigned parent, that must never be <code>null</code> if the IUiEmbeddableEditpart is attached to its
 * parent.
 */
public interface IUiEmbeddableEditpart extends IUiElementEditpart {

	/**
	 * Returns the parent of this embeddable edit part.<br>
	 * Will be <code>null</code> for the layout that is attached to the view as content.
	 * 
	 * @return
	 */
	IUiLayoutEditpart getParent();

	/**
	 * Returns the view edit part of this embeddable edit part.<br>
	 * May be <code>null</code> as far as this element and no of its parents are attached to a view.
	 * 
	 * @return
	 */
	IUiViewEditpart getView();

}
