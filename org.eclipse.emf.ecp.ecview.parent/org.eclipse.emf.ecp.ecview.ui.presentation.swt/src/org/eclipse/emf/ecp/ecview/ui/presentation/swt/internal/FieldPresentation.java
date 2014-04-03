/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public abstract class FieldPresentation extends AbstractSWTWidgetPresenter {

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public FieldPresentation(IElementEditpart editpart) {
		super((IFieldEditpart) editpart);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
	}

}
