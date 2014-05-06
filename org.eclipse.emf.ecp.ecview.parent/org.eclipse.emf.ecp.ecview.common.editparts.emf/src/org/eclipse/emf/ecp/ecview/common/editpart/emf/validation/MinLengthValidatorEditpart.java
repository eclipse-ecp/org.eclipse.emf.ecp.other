package org.eclipse.emf.ecp.ecview.common.editpart.emf.validation;

import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.validator.MinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMinLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IValidationConfig;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;

public class MinLengthValidatorEditpart extends
		ValidatorEditpart<YMinLengthValidator> implements
		IMinLengthValidatorEditpart {

	private ValidationConfigToValidatorBridge bridgeObserver;

	public MinLengthValidatorEditpart() {
		super(
				ValidationPackage.Literals.YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH);
	}

	@Override
	protected YMinLengthValidator createModel() {
		return ValidationFactory.eINSTANCE.createYMinLengthValidator();
	}

	@Override
	protected IValidator createValidator() {
		checkDisposed();

		return new MinLengthValidator(getModel());
	}

	@Override
	public void setConfig(IValidationConfig config) {
		checkDisposed();

		YMinLengthValidationConfig validatable = (YMinLengthValidationConfig) config
				.getValidationSettings();

		// create an observer that transfers the changes at the validatable to
		// the validator
		bridgeObserver = ValidationConfigToValidatorBridge
				.createObserver(
						validatable,
						ValidationPackage.Literals.YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH,
						getModel(),
						ValidationPackage.Literals.YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH);
	}

	@Override
	protected void internalDispose() {
		try {
			if (bridgeObserver != null) {
				bridgeObserver.dispose();
				bridgeObserver = null;
			}
		} finally {
			super.internalDispose();
		}
	}
}
