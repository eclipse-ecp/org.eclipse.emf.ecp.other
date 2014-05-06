package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.validator.RegexValidator;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IRegexpValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;

public class RegexpValidatorEditpart extends
		ValidatorEditpart<YRegexpValidator> implements IRegexpValidatorEditpart {

	public RegexpValidatorEditpart() {
		super(ValidationPackage.Literals.YREGEXP_VALIDATABLE__REG_EXPRESSION);
	}

	@Override
	protected YRegexpValidator createModel() {
		return ValidationFactory.eINSTANCE.createYRegexpValidator();
	}

	@Override
	protected IValidator createValidator() {
		return new RegexValidator(getModel());
	}

}
