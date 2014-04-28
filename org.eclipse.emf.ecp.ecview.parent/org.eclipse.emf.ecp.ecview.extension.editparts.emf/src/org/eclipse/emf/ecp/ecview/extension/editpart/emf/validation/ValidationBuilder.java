package org.eclipse.emf.ecp.ecview.extension.editpart.emf.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidatable;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.validation.DelegatingValidatorManager;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;
import org.eclipse.emf.ecp.ecview.common.validation.MaxLengthValidator;

public class ValidationBuilder {

	public List<IValidator> getValidators(Object dt) {
		List<IValidator> result = new ArrayList<>();

		if (dt instanceof YMinLengthValidatable) {
			YMinLengthValidatable validatable = (YMinLengthValidatable) dt;
			if (validatable.getMinLength() >= 0) {
				YMinLengthValidator yValidator = ValidationFactory.eINSTANCE
						.createYMinLengthValidator();
				yValidator.setMinLength(validatable.getMinLength());
				result.add(DelegatingValidatorManager.getInstance()
						.createValidator(yValidator));
			}
		}

		if (dt instanceof YMaxLengthValidator) {
			YMaxLengthValidator va = (YMaxLengthValidator) dt;
			if (va.getMaxLength() >= 0) {
				result.add(new MaxLengthValidator(va.getMaxLength()));
			}
		}

		return result;
	}

}
