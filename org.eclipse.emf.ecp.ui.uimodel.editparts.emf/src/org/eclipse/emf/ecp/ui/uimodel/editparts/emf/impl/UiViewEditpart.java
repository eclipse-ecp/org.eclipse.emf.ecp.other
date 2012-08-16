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
package org.eclipse.emf.ecp.ui.uimodel.editparts.emf.impl;

import org.eclipse.emf.ecp.ui.model.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiViewEditpart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UiViewEditpart<M extends YUiView> extends UiLayoutEditpart<M> implements IUiViewEditpart {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(UiViewEditpart.class);

	protected UiViewEditpart() {

	}

	@Override
	public String getName() {
		return getModel().getViewName();
	}

}
