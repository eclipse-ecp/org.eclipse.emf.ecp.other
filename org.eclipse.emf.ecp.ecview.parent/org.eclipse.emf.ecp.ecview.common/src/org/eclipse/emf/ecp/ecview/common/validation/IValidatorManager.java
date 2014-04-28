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
 * Is responsible to return validators based on the given element.
 */
public interface IValidatorManager {

	/**
	 * Returns true, if the factory can be used for the given element.
	 * 
	 * @param modelElement
	 *            Any kind of object that contains information how to create the
	 *            validators.
	 * @return result True if the manager can be used for the modelElement
	 */
	boolean isFor(Object modelElement);

	/**
	 * Tries to create an validator for the given element.
	 * 
	 * @param <A>
	 *            An instance of {@link IValidator}
	 * @param modelElement
	 *            Any kind of object that contains information how to create the
	 *            validator.
	 * @return validator The created validator.
	 */
	<A extends IValidator> A createValidator(Object modelElement);

}