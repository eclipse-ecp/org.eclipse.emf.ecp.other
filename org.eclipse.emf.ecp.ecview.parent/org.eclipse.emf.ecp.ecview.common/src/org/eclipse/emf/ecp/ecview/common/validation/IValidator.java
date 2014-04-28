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
	 * Checks if the given value is valid.
	 * 
	 * @param value
	 * @return
	 */
	IStatus validate(Object value);

}
