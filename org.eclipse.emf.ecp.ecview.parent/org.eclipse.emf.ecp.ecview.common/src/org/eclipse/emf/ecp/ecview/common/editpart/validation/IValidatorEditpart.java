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
package org.eclipse.emf.ecp.ecview.common.editpart.validation;

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.validation.IValidationConfig;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;

/**
 * An editpart responsible to handle validations. If the set config was
 * disposed, the validator editpart will not handle this. It is the issue of the
 * parent editparts to handle this.
 */
public interface IValidatorEditpart extends IElementEditpart {

	/**
	 * Returns the validator for this editpart.
	 * 
	 * @return
	 */
	<A extends IValidator> A getValidator();

	/**
	 * Registers the validation config at the validator editpart. The config
	 * provides information how the validator has to validate an UI element. For
	 * instance the maxLength of a MaxLengthValidator.
	 * 
	 * @param config
	 */
	void setConfig(IValidationConfig config);

}
