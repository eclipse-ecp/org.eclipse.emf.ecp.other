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

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ContextException;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;

/**
 * Is used to render the the given view part based on the information of the view context.
 */
public interface IRenderer {

	/**
	 * Is called to render the given view part based on the view context.
	 * 
	 * @param viewContext the context that is responsible to define the ui kit an to offer additional information to the
	 *            edit part
	 * @param viewEditpart the edit part that should become rendered
	 * @throws if the view can not be rendered
	 */
	void render(IViewContext viewContext, IUiViewEditpart viewEditpart) throws ContextException;

}
