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

import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.validator.MaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMaxLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IValidationConfig;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;

public class MaxLengthValidatorEditpart extends
		ValidatorEditpart<YMaxLengthValidator> implements
		IMaxLengthValidatorEditpart {

	private ValidationConfigToValidatorBridge bridgeObserver;

	public MaxLengthValidatorEditpart() {
		super(
				ValidationPackage.Literals.YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH);
	}

	@Override
	protected YMaxLengthValidator createModel() {
		return ValidationFactory.eINSTANCE.createYMaxLengthValidator();
	}

	@Override
	protected IValidator createValidator() {
		return new MaxLengthValidator(getModel());
	}

	@Override
	public void setConfig(IValidationConfig config) {
		YMaxLengthValidationConfig validatable = (YMaxLengthValidationConfig) config
				.getValidationSettings();
		// create an observer that transfers the changes at the validatable to
		// the validator
		bridgeObserver = ValidationConfigToValidatorBridge
				.createObserver(
						validatable,
						ValidationPackage.Literals.YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH,
						getModel(),
						ValidationPackage.Literals.YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH);
	}

	@Override
	protected void internalDispose() {
		try {
			if (bridgeObserver != null) {
				bridgeObserver.dispose();
				bridgeObserver = null;
			}
		} finally {
			super.internalDispose();
		}
	}

}
