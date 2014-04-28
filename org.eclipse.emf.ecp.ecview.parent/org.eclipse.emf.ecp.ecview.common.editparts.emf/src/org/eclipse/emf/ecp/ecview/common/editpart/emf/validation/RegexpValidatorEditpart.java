package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation;

import org.eclipse.emf.ecp.ecview.common.editpart.validation.IRegexpValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;

public class RegexpValidatorEditpart extends ValidatorEditpart<YRegexpValidator> implements
		IRegexpValidatorEditpart {

	@Override
	protected YRegexpValidator createModel() {
		return ValidationFactory.eINSTANCE.createYRegexpValidator();
	}

}
