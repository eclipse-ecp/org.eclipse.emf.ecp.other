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

import org.eclipse.emf.ecp.ecview.common.validation.IStatus;

/**
 * A rule that fires true, if a value is "true". False otherwise.
 */
public class BooleanValueRule extends AbstractVisibilityRule {

	private boolean value;

	@Override
	public IStatus doFire() {
		return value ? IStatus.OK : IStatus.ERROR;
	}

	/**
	 * Returns if the value of the rule.
	 * 
	 * @return
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * Sets the value to the rule.
	 * 
	 * @param value
	 */
	public void setValue(boolean value) {
		boolean oldValue = this.value;
		this.value = value;

		if (oldValue != this.value) {
			fireRuleDirty();
		}
	}
}
