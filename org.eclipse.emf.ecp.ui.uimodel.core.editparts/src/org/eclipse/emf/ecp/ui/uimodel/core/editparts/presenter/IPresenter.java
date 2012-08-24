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
 * An abstraction for any kind of logic that will create and prepare ui elements for the user interface. Implementations
 * of that abstraction will be ui-kit specific.
 */
public interface IPresenter {

	/**
	 * Passes the edit part that should be presented to the presenter. This method must only be called once.
	 * 
	 * @param uiContext Containing information about the current ui instance
	 * @param editpart The editpart that should be presented at the ui
	 */
	void present(IViewContext uiContext, IUiElementEditpart editpart);

}
