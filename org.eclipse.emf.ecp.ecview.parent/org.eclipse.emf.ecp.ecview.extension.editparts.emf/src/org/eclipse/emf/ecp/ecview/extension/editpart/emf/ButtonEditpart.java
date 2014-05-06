/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.extension.editpart.emf;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.ActionEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YButton;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IButtonEditpart;

/**
 * The implementation of the IButtonEditpart.
 */
@SuppressWarnings("restriction")
public class ButtonEditpart extends ActionEditpart<YButton> implements
		IButtonEditpart {

	protected YButton createModel() {
		return (YButton) ExtensionModelFactory.eINSTANCE
				.createYButton();
	}

}
