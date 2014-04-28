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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.eclipse.emf.ecp.ecview.common.validation.DelegatingValidatorManager;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link IValidatorEditpart}.
 * 
 * @param <M>
 */
public abstract class ValidatorEditpart<M extends YValidator> extends ElementEditpart<M>
		implements IValidatorEditpart {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ValidatorEditpart.class);

	private IValidator validator;

	/**
	 * A default constructor.
	 */
	public ValidatorEditpart() {
	}

	@Override
	protected void internalDispose() {
		try {
		} finally {
			super.internalDispose();
		}
	}
	@Override
	public IValidator getValidator() {
		if (this.validator == null) {
			this.validator = DelegatingValidatorManager.getInstance()
					.createValidator(getModel());
		}
		return this.validator;
	}
}
