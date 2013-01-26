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
package org.eclipse.emf.ecp.ecview.common.presentation;

import java.util.Map;

import org.eclipse.emf.ecp.ecview.common.context.ContextException;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;

/**
 * Is used to render the the given view part based on the information of the view context.
 */
public interface IRenderer {

	/**
	 * Is called to render the given view part based on the view context.
	 * 
	 * @param viewContext the context that is responsible to define the UI kit an to offer additional information to the
	 *            edit part
	 * @param rootLayout the root layout that should the base for all UI elements
	 * @param options rendering options. Depend on the underlying UI-Kit
	 * @throws ContextException if the view can not be rendered
	 */
	void render(IViewContext viewContext, Object rootLayout, Map<String, Object> options) throws ContextException;

}
