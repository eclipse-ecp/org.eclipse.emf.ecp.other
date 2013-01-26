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
package org.eclipse.emf.ecp.ecview.example.presentation.swt.simple;

import java.util.Map;

import org.eclipse.emf.ecp.ecview.ui.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.IViewEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.context.ContextException;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.context.ViewContext;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.presentation.IRenderer;
import org.eclipse.swt.widgets.Composite;

/**
 * A special implementation for ECP that offers convenience methods.
 */
public class SimpleSwtRenderer implements IRenderer {

	/**
	 * URI specifying the simple SWT presentation.
	 */
	public static final String UI_KIT_URI = "http://eclipse.org/emfclient/example";
	/**
	 * The CSS files may be passed as Set<URL> to the renderer.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public static final String RENDERING_OPTION__CSS_FILES = "org.eclipse.emf.ecp.ecview.ui.example.presentation.cssFileURLs";

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Renders the UI for the given composite and UI model.
	 * 
	 * @param composite The composite the should be the parent for the rendered UI
	 * @param yView The view model.
	 * @param options rendering options
	 * @throws ContextException e
	 */
	public void render(Composite composite, YUiView yView, Map<String, Object> options) throws ContextException {
		IViewEditpart viewEditpart = DelegatingEditPartManager.getInstance().getEditpart(yView);
		render(composite, viewEditpart, options);
	}

	/**
	 * Renders the UI for the given composite and edit part.
	 * 
	 * @param composite The composite the should be the parent for the rendered UI
	 * @param viewEditpart The viewEditPart that should become rendered
	 * @param options rendering options
	 * @throws ContextException e
	 */
	public void render(Composite composite, IViewEditpart viewEditpart, Map<String, Object> options)
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
