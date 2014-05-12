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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.visibility.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YRegexpRule;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;

public class RegexpRule extends AbstractVisibilityRule {

	private Pattern pattern;
	private boolean complete;
	private Matcher matcher;
	private String value;

	@Override
	public void initialize(Object model) {
		super.initialize(model);
		YRegexpRule yRule = (YRegexpRule) model;
		pattern = Pattern.compile(yRule.getRegExpression());
		complete = true;
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
	public IStatus doFire() {
		boolean result = false;
		if (value == null || value.isEmpty()) {
			return IStatus.OK;
		}
		if (complete) {
			result = getMatcher(value).matches();
		} else {
			result = getMatcher(value).find();
		}

		return result ? IStatus.OK : IStatus.ERROR;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		String oldValue = this.value;
		this.value = value;

		if (!StringUtils.equals(oldValue, value)) {
			fireRuleDirty();
		}
	}

}
