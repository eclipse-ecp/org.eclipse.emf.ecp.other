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
 * A validator is used to validate the given value.
 */
public interface IValidator {

	/**
	 * Is called to update the validation parameter of this validator. For
	 * instance the minLength of a MinLengthValidator.
	 * 
	 * @param model
	 */
	void updateParameter(Object model);

	/**
	 * Checks if the given value is valid.
	 * 
	 * @param value
	 * @return
	 */
	IStatus validateValue(Object value);

	/**
	 * Returns the expected type of the value. If <code>null</code> is returned,
	 * the type will not become checked.
	 * 
	 * @return type - the expected type of the value or <code>null</code>
	 */
	Class<?> getType();

}
