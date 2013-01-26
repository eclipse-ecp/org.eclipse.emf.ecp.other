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
package org.eclipse.emf.ecp.ecview.ui.presenter.ecp;

import java.util.Map;

import org.eclipse.emf.ecp.ecview.ui.core.editparts.context.ContextException;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.presentation.IRenderer;

/**
 * A special implementation for ECP that offers convenience methods.
 */
public class EcpRenderer implements IRenderer {

	public static final String UI_KIT_URI = "http://eclipse.org/emfclient/mekit";

	@Override
	public void render(IViewContext viewContext, Object rootLayout, Map<String, Object> options)
		throws ContextException {

	}

}
