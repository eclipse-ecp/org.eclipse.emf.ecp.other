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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;
import org.eclipse.emf.ecp.ecview.common.validation.IValidationCodes;
import org.eclipse.emf.ecp.ecview.common.validation.Status;
import org.eclipse.emf.ecp.ecview.common.validation.StringValidator;

/**
 * Validates the string value if it matches the given regular expression.
 */
public class RegexValidator extends StringValidator {

	private Pattern pattern;
	private Matcher matcher = null;
	private String regexp;

	public RegexValidator(YRegexpValidator yValidator) {
		this(yValidator, null);
	}

	public RegexValidator(YRegexpValidator yValidator, String message) {
		super(message);
		updateParameter(yValidator);
	}

	/**
	 * Get a new or reused matcher for the pattern
	 * 
	 * @param value
	 *            the string to find matches in
	 * @return Matcher for the string
	 */
	private Matcher getMatcher(String value) {
		if (matcher == null) {
			matcher = pattern.matcher(value);
		} else {
			matcher.reset(value);
		}
		return matcher;
	}

	@Override
	public IStatus doValidate(String value) {
		if (value == null || value.isEmpty()) {
			return IStatus.OK;
		}

		if (!getMatcher(value).matches()) {
			return Status.createStatus(IValidationCodes.STRING_REGEXP,
					getClass(), IStatus.Severity.ERROR, getMessage(value));
		}
		return IStatus.OK;
	}

	protected String getMessage(String value) {
		return this.message != null ? this.message : String.format(
				"The value %s does not match the pattern %s", value, regexp);
	}

	@Override
	public void updateParameter(Object model) {
		YRegexpValidator yValidator = (YRegexpValidator) model;
		this.regexp = yValidator.getRegexp();
		this.pattern = Pattern.compile(regexp != null ? regexp : "");
		this.matcher = null;
	};

}