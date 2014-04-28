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
package org.eclipse.emf.ecp.ecview.common.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validates the string value if it matches the given regular expression.
 */
public class RegexValidator extends StringValidator {

	private Pattern pattern;
	private Matcher matcher = null;
	private String regexp;

	/**
	 * Creates a validator to check that the regular expression matches the
	 * string to validate.
	 * 
	 * @param regexp
	 *            the regular expression
	 */
	public RegexValidator(String regexp) {
		this(regexp, null);
	}

	/**
	 * Creates a validator to check that the regular expression matches the
	 * string to validate.
	 * 
	 * @param regexp
	 *            the regular expression
	 * @param errorMessage
	 *            the message if the value does not validate.
	 */
	public RegexValidator(String regexp, String errorMessage) {
		super(errorMessage);
		this.regexp = regexp;
		this.pattern = Pattern.compile(regexp);
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

}