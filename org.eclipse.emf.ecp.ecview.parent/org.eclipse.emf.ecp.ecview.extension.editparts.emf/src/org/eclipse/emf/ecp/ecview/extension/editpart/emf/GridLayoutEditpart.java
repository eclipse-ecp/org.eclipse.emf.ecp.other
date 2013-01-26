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
package org.eclipse.emf.ecp.ecview.extension.editpart.emf;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.LayoutEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IGridLayoutEditpart;

/**
 * The implementation of the IUigridLayoutEditpart.
 */
public class GridLayoutEditpart extends LayoutEditpart<YGridLayout> implements IGridLayoutEditpart {

	@Override
	protected YGridLayout createModel() {
		return (YGridLayout) ExtensionModelFactory.eINSTANCE.createYGridLayout();
	}

}
