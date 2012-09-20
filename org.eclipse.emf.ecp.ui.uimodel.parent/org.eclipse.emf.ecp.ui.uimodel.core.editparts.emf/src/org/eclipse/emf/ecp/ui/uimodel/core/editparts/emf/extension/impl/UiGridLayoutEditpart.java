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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl;

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.UiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiGridLayoutEditpart;

/**
 * The implementation of the IUigridLayoutEditpart.
 */
public class UiGridLayoutEditpart extends UiLayoutEditpart<YUiGridLayout> implements IUiGridLayoutEditpart {

	@Override
	protected YUiGridLayout createModel() {
		return (YUiGridLayout) UimodelExtensionFactory.eINSTANCE.createYUiGridLayout();
	}

}
