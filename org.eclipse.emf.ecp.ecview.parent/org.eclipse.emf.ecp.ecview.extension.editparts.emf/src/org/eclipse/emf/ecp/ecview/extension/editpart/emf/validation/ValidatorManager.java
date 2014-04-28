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
package org.eclipse.emf.ecp.ecview.extension.editpart.emf.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IValidatorManager;
import org.eclipse.emf.ecp.ecview.common.validation.MaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.validation.MinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.validation.RegexValidator;

public class ValidatorManager implements IValidatorManager {

	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage()
					.getNsURI();
			return uriString.equals(ValidationPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(ValidationPackage.eNS_URI);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IValidator> A createValidator(Object element) {
		if (element instanceof YMinLengthValidator) {
			YMinLengthValidator yValidator = (YMinLengthValidator) element;
			return (A) new MinLengthValidator(yValidator.getMinLength());
		} else if (element instanceof YMaxLengthValidator) {
			YMaxLengthValidator yValidator = (YMaxLengthValidator) element;
			return (A) new MaxLengthValidator(yValidator.getMaxLength());
		} else if (element instanceof YRegexpValidator) {
			YRegexpValidator yValidator = (YRegexpValidator) element;
			return (A) new RegexValidator(yValidator.getRegexp());
		}

		throw new RuntimeException("No valdidator available for " + element);
	}

}
