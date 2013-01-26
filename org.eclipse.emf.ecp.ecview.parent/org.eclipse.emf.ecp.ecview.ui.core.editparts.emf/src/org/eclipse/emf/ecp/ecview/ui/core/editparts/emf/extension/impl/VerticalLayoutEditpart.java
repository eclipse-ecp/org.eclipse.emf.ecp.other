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
package org.eclipse.emf.ecp.ecview.ui.core.editparts.emf.extension.impl;

import org.eclipse.emf.ecp.ecview.ui.core.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.emf.impl.LayoutEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IVerticalLayoutEditpart;

/**
 * The implementation of the IUigridLayoutEditpart.
 */
public class VerticalLayoutEditpart extends LayoutEditpart<YVerticalLayout> implements IVerticalLayoutEditpart {

	@Override
	protected YVerticalLayout createModel() {
		return (YVerticalLayout) ExtensionModelFactory.eINSTANCE.createYVerticalLayout();
	}

}
