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

/**
 * A special implementation for ECP that offers convenience methods.
 */
public class EcpRenderer implements IRenderer {

	public static final String UI_KIT_URI = "http://eclipse.org/emfclient/mekit";

	/**
	 * Renders the UI for the given composite and UI model.
	 * 
	 * @param composite
	 * @param yView
	 * @throws ContextException
	 */
	public void render(Composite composite, YUiView yView) throws ContextException {
		IUiViewEditpart viewEditpart = DelegatingEditPartManager.getInstance().getEditpart(yView);
		render(composite, viewEditpart);
	}

	/**
	 * Renders the UI for the given composite and edit part.
	 * 
	 * @param composite
	 * @param viewEditpart
	 * @throws ContextException
	 */
	public void render(Composite composite, IUiViewEditpart viewEditpart) throws ContextException {
		ViewContext viewContext = new ViewContext(viewEditpart);
		render(viewContext, composite);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void render(IViewContext viewContext, Object composite) throws ContextException {
		viewContext.render(UI_KIT_URI, composite);
	}

}
