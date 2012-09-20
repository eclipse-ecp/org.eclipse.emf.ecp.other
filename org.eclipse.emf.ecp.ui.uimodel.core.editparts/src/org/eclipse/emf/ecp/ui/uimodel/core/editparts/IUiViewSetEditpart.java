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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts;

import java.util.List;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewSetContext;

/**
 * An IUiRootEditpart is a container for views. They can be put there and also be accessed again, but the root does not
 * control the lifecycle of the views. Removing / deleting the root will never delete the referenced views.
 */
public interface IUiViewSetEditpart extends IUiElementEditpart {

	/**
	 * Returns the view set context. It offers access to more view set related information.
	 * 
	 * @return context The viewSet context
	 */
	IViewSetContext getContext();

	/**
	 * Sets the view set context. It offers access to more view related information.
	 * 
	 * @param context The viewSet context
	 */
	void setContext(IViewSetContext context);

	/**
	 * Returns an unmodifiable list with all views referenced by the root. The root does not control the lifecycle of
	 * the views.
	 * 
	 * @return view The contained views
	 */
	List<IUiViewEditpart> getViews();

	/**
	 * Adds a view to the root. Adding the same view twice has no effect.
	 * 
	 * @param view The view editpart to be added
	 */
	void addView(IUiViewEditpart view);

	/**
	 * Removes a view from the root.
	 * 
	 * @param view The view editpart to be removed
	 */
	void removeView(IUiViewEditpart view);

}
