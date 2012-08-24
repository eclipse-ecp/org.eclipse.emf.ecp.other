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
package org.eclipse.emf.ecp.ui.uimodel.presenter.ecp;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ContextException;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presenter.IRenderer;
import org.eclipse.swt.widgets.Composite;

public class EcpRenderer implements IRenderer {

	/**
	 * Renders the UI for the given composite and UI model.
	 * 
	 * @param composite
	 * @param yView
	 * @throws ContextException
	 */
	public void render(Composite composite, YUiView yView) throws ContextException {
		IUiViewEditpart viewEditpart = DelegatingEditPartManager.getInstance().getEditpart(yView);
		ViewContext viewContext = new ViewContext();
		viewContext.setRootLayout(composite);
		viewContext.setViewEditpart(viewEditpart);

		render(viewContext, viewEditpart);
	}

	/**
	 * Renders the UI for the given composite and edit part.
	 * 
	 * @param composite
	 * @param viewEditpart
	 * @throws ContextException
	 */
	public void render(Composite composite, IUiViewEditpart viewEditpart) throws ContextException {
		ViewContext viewContext = new ViewContext();
		viewContext.setRootLayout(composite);
		viewContext.setViewEditpart(viewEditpart);

		render(viewContext, viewEditpart);
	}

	@Override
	public void render(IViewContext viewContext, IUiViewEditpart viewEditpart) throws ContextException {

	}

}
