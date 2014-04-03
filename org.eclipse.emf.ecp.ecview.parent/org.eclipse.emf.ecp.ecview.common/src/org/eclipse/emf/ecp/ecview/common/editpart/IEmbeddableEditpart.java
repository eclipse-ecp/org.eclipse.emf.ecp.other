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
package org.eclipse.emf.ecp.ecview.common.editpart;

import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;

/**
 * An IUiEmbeddableEditpart is an abstraction of editparts that can be added to a {@link ILayoutEditpart}.</br>
 * They have an assigned parent, that must never be <code>null</code> if the IUiEmbeddableEditpart is attached to its
 * parent.
 */
public interface IEmbeddableEditpart extends IElementEditpart {

	/**
	 * Name for "parent" property.
	 */
	String PROP_PARENT = "parent";
	/**
	 * Name for "cssClass" property.
	 */
	String PROP_CSSCLASS = "cssClass";
	/**
	 * Name for "cssID" property.
	 */
	String PROP_CSSID = "cssID";

	/**
	 * Returns the parent of this embeddable edit part.<br>
	 * Will be <code>null</code> for the layout that is attached to the view as content.
	 * 
	 * @return editpart The parent editpart
	 */
	ILayoutEditpart getParent();

	/**
	 * Returns the view edit part of this embeddable edit part.<br>
	 * May be <code>null</code> as far as this element and no of its parents are attached to a view.
	 * 
	 * @return editpart The view editpart
	 */
	IViewEditpart getView();

	/**
	 * Returns the widget presentation for the edit part.
	 * 
	 * @param <A> An instance of {@link IWidgetPresentation}
	 * @return presentation The presentation of that editpart used to render the UI.
	 */
	<A extends IWidgetPresentation<?>> A getPresentation();

}
