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
package org.eclipse.emf.ecp.ui.uimodel.example.presentation;

import java.util.Map;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ContextException;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IRenderer;
import org.eclipse.swt.widgets.Composite;

/**
 * A special implementation for ECP that offers convenience methods.
 */
public class SimpleSwtRenderer implements IRenderer {

	public static final String UI_KIT_URI = "http://eclipse.org/emfclient/example";
	/**
	 * The CSS files may be passed as Set<URL> to the renderer.
	 */
	public static final String RENDERING_OPTION__CSS_FILES = "org.eclipse.emf.ecp.ui.uimodel.example.presentation.cssFileURLs";

	/**
	 * Renders the UI for the given composite and UI model.
	 * 
	 * @param composite
	 * @param yView
	 * @param options rendering options
	 * @throws ContextException
	 */
	public void render(Composite composite, YUiView yView, Map<String, Object> options) throws ContextException {
		IUiViewEditpart viewEditpart = DelegatingEditPartManager.getInstance().getEditpart(yView);
		render(composite, viewEditpart, options);
	}

	/**
	 * Renders the UI for the given composite and edit part.
	 * 
	 * @param composite
	 * @param viewEditpart
	 * @param options rendering options
	 * @throws ContextException
	 */
	public void render(Composite composite, IUiViewEditpart viewEditpart, Map<String, Object> options)
		throws ContextException {
		ViewContext viewContext = new ViewContext(viewEditpart);
		render(viewContext, composite, options);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void render(IViewContext viewContext, Object composite, Map<String, Object> options) throws ContextException {
		viewContext.render(UI_KIT_URI, composite, options);
	}

}
