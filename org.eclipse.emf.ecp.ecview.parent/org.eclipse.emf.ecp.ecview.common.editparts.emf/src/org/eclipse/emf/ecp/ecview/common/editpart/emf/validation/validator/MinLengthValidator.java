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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.validator;

import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;
import org.eclipse.emf.ecp.ecview.common.validation.IValidationCodes;
import org.eclipse.emf.ecp.ecview.common.validation.Status;
import org.eclipse.emf.ecp.ecview.common.validation.StringValidator;

public class MinLengthValidator extends StringValidator {

	private int minLength;

	public MinLengthValidator(YMinLengthValidationConfig yValidator) {
		this(yValidator, null);
	}

	public MinLengthValidator(YMinLengthValidationConfig yValidator,
			String message) {
		super(message);
		updateParameter(yValidator);
	}

	@Override
	public IStatus doValidate(String value) {
		if (value.trim().length() < minLength) {
			return Status.createStatus(IValidationCodes.STRING_MIN_LENGTH,
					getClass(), IStatus.Severity.ERROR, createMessage(value));
		}

		return IStatus.OK;
	}

	/**
	 * Creates the message.
	 * 
	 * @param value
	 * @return
	 */
	protected String createMessage(String value) {
		return this.message != null ? message : String.format(
				"Minimum length is %d. Length of %s is %d", minLength, value,
				value.trim().length());
	};

	@Override
	public void updateParameter(Object model) {
		YMinLengthValidationConfig yValidator = (YMinLengthValidationConfig) model;
		this.minLength = yValidator.getMinLength();
	};

}
