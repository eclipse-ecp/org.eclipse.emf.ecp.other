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

import org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;

public class DecimalValueRule extends AbstractVisibilityRule {

	private double value;
	private YDecimalValueRuleOption option;
	private double referenceValue;

	@Override
	public void initialize(Object model) {
		super.initialize(model);
		YDecimalValueRule yRule = (YDecimalValueRule) model;
		option = yRule.getOption();
		referenceValue = yRule.getReferenceValue();
	}

	@Override
	public IStatus doFire() {
		IStatus result = null;
		switch (option) {
		case EQUAL:
			result = referenceValue == value ? IStatus.OK : IStatus.ERROR;
			break;
		case GREATER:
			result = referenceValue < value ? IStatus.OK : IStatus.ERROR;
			break;
		case GREATER_EQUAL:
			result = referenceValue <= value ? IStatus.OK : IStatus.ERROR;
			break;
		case LOWER:
			result = referenceValue > value ? IStatus.OK : IStatus.ERROR;
			break;
		case LOWER_EQUAL:
			result = referenceValue >= value ? IStatus.OK : IStatus.ERROR;
			break;
		case NOT_EQUAL:
			result = referenceValue != value ? IStatus.OK : IStatus.ERROR;
			break;
		default:
			throw new IllegalArgumentException(option
					+ " is not a valid option!");
		}
		return result;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

}
