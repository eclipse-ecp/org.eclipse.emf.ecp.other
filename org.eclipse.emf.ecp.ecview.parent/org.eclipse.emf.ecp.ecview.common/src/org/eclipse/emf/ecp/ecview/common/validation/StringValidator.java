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

/**
 * A validator that returns true by default, if the given value is not a String.
 */
public abstract class StringValidator implements IValidator {

	protected final String message;

	public StringValidator() {
		this.message = null;
	}

	public StringValidator(String message) {
		this.message = message;
	}

	@Override
	public Class<?> getType() {
		return String.class;
	}

	@Override
	public IStatus validateValue(Object value) {
		if (!(value instanceof String)) {
			return IStatus.OK;
		}

		return doValidate((String) value);
	}

	/**
	 * Delegates the given value.
	 * 
	 * @param value
	 * @return IStatus - the validation status.
	 */
	protected abstract IStatus doValidate(String value);

}
