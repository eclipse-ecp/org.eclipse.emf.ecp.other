/*******************************************************************************
 * Copyright (c) 2012 Florian Pirchner and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.presenter;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;

/**
 * Is responsible to return presenter based on the given element.
 */
public interface IPresenterFactory {

	/**
	 * Returns true, if the factory can be used for the given element.
	 * 
	 * @param uiContext contains information about the current ui instance
	 * @param editpart the editpart for which a presenter should be created.
	 * @return
	 */
	boolean isFor(IViewContext uiContext, IUiElementEditpart editpart);

	/**
	 * Is used to create a new instance of a presenter.
	 * 
	 * @param uiContext contains information about the current ui instance
	 * @param editpart the editpart for which a presenter should be created.
	 * @return
	 */
	<A extends IPresenter> A createPresenter(IViewContext uiContext, IUiElementEditpart editpart);

}