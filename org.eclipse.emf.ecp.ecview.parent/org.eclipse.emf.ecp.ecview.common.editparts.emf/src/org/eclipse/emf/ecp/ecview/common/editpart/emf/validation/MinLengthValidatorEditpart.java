package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.validator.MinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMinLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;

public class MinLengthValidatorEditpart extends
		ValidatorEditpart<YMinLengthValidator> implements
		IMinLengthValidatorEditpart {

	public MinLengthValidatorEditpart() {
		super(ValidationPackage.Literals.YMIN_LENGTH_VALIDATABLE__MIN_LENGTH);
	}

	@Override
	protected YMinLengthValidator createModel() {
		return ValidationFactory.eINSTANCE.createYMinLengthValidator();
	}

	@Override
	protected IValidator createValidator() {
		return new MinLengthValidator(getModel());
	}

}
