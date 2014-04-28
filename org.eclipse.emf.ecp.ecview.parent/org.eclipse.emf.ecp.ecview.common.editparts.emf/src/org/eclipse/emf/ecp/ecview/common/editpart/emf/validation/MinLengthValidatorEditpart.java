package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation;

import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMinLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;

public class MinLengthValidatorEditpart extends
		ValidatorEditpart<YMinLengthValidator> implements
		IMinLengthValidatorEditpart {

	@Override
	protected YMinLengthValidator createModel() {
		return ValidationFactory.eINSTANCE.createYMinLengthValidator();
	}

}
