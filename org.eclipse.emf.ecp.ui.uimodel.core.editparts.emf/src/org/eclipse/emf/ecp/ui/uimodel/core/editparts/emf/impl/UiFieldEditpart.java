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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl;

import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiFieldEditpart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UiFieldEditpart<M extends YUiField> extends UiEmbeddableEditpart<M> implements IUiFieldEditpart {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(UiFieldEditpart.class);

	protected UiFieldEditpart() {
	}

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		return (M) UiModelFactory.eINSTANCE.createYUiField();
	}

}
