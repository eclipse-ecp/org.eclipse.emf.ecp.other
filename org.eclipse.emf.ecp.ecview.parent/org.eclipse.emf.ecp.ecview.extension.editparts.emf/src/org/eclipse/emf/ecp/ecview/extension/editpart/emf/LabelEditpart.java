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

import org.eclipse.emf.ecp.ecview.common.editpart.emf.EmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ILabelEditpart;

/**
 * The implementation of the IUiLabelEditpart.
 */
@SuppressWarnings("restriction")
public class LabelEditpart extends EmbeddableEditpart<YLabel> implements
		ILabelEditpart {

	@Override
	protected YLabel createModel() {
		return (YLabel) ExtensionModelFactory.eINSTANCE.createYLabel();
	}

}
