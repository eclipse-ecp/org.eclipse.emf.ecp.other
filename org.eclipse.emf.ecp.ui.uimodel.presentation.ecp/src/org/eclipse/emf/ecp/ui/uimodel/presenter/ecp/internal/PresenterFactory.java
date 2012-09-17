/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.presenter.ecp.internal;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiTextFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presenter.IPresenter;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presenter.IPresenterFactory;

public class PresenterFactory implements IPresenterFactory {

	@Override
	public boolean isFor(IViewContext uiContext, IUiElementEditpart editpart) {
		return false;
	}

	@Override
	public <A extends IPresenter<?,?>> A createPresenter(IViewContext uiContext, IUiElementEditpart editpart) {
		if (editpart instanceof IUiTextFieldEditpart) {

		}
		return null;
	}

}
