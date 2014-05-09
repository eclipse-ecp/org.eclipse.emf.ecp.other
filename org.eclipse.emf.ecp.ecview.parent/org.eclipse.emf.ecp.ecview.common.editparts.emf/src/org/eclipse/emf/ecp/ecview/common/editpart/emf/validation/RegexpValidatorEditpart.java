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

import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.validator.RegexValidator;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IRegexpValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IValidationConfig;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;

public class RegexpValidatorEditpart extends
		ValidatorEditpart<YRegexpValidator> implements IRegexpValidatorEditpart {

	private ValidationConfigToValidatorBridge bridgeObserver;

	public static boolean isValidRegExpression(String regexp) {
		return regexp != null && !regexp.equals("");
	}

	public RegexpValidatorEditpart() {
		super(
				ValidationPackage.Literals.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION);
	}

	@Override
	protected YRegexpValidator createModel() {
		return ValidationFactory.eINSTANCE.createYRegexpValidator();
	}

	@Override
	protected IValidator createValidator() {
		return new RegexValidator(getModel());
	}

	@Override
	public void setConfig(IValidationConfig config) {
		YRegexpValidationConfig validatable = (YRegexpValidationConfig) config
				.getValidationSettings();
		// create an observer that transfers the changes at the validatable to
		// the validator
		bridgeObserver = ValidationConfigToValidatorBridge
				.createObserver(
						validatable,
						ValidationPackage.Literals.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION,
						getModel(),
						ValidationPackage.Literals.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION);
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
