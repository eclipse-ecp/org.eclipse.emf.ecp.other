package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation;

import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMaxLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;

public class MaxLengthValidatorEditpart extends
		ValidatorEditpart<YMaxLengthValidator> implements
		IMaxLengthValidatorEditpart {

	@Override
	protected YMaxLengthValidator createModel() {
		return ValidationFactory.eINSTANCE.createYMaxLengthValidator();
	}

}
