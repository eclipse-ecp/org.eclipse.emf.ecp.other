/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.extension.editpart.emf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.LayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.presentation.ILayoutPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IGridLayoutEditpart;

/**
 * The implementation of the IUigridLayoutEditpart.
 */
@SuppressWarnings("restriction")
public class GridLayoutEditpart extends LayoutEditpart<YGridLayout> implements IGridLayoutEditpart {

	@Override
	protected YGridLayout createModel() {
		return (YGridLayout) ExtensionModelFactory.eINSTANCE.createYGridLayout();
	}

	
	@Override
	protected void handleModelMove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case ExtensionModelPackage.YGRID_LAYOUT__COLUMNS:
		case ExtensionModelPackage.YGRID_LAYOUT__MARGIN:
		case ExtensionModelPackage.YGRID_LAYOUT__FILL_HORIZONTAL:
		case ExtensionModelPackage.YGRID_LAYOUT__FILL_VERTICAL:
		case ExtensionModelPackage.YGRID_LAYOUT__SPACING:
			// handle the presentation
			//
			if (isPresentationPresent()) {
				ILayoutPresentation<?> presenter = getPresentation();
				presenter.unrender();
			}
			break;
		default:
			break;
		}
	}

	
}
