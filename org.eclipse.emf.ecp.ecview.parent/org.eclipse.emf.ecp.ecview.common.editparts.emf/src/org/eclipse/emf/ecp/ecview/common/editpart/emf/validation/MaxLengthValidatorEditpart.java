package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.validator.MaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMaxLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;

public class MaxLengthValidatorEditpart extends
		ValidatorEditpart<YMaxLengthValidator> implements
		IMaxLengthValidatorEditpart {

	public MaxLengthValidatorEditpart() {
		super(ValidationPackage.Literals.YMAX_LENGTH_VALIDATOR__MAX_LENGTH);
	}

	@Override
	protected YMaxLengthValidator createModel() {
		return ValidationFactory.eINSTANCE.createYMaxLengthValidator();
	}

	@Override
	protected IValidator createValidator() {
		return new MaxLengthValidator(getModel());
	}

}
