package org.eclipse.emf.ecp.ecview.common.editpart.emf.datatypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart.DatatypeBridge;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.RegexpValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMaxLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMinLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IRegexpValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IValidationConfig;

/**
 * A temporary factory. It should be replaced by OSGi services later.
 */
public class ValidatorByConfigFactory {

	/**
	 * Creates a new minLengthValidator.
	 * 
	 * @return
	 */
	public static IMinLengthValidatorEditpart createMinLengthValidator(
			IValidationConfig config) {
		YMinLengthValidationConfig yValidationConfig = (YMinLengthValidationConfig) config
				.getValidationSettings();
		IMinLengthValidatorEditpart editpart = null;
		int minlength = yValidationConfig.getMinLength();
		if (minlength > 0) {
			YMinLengthValidator yValidator = ValidationFactory.eINSTANCE
					.createYMinLengthValidator();
			yValidator.setMinLength(minlength);
			editpart = ElementEditpart.getEditpart(yValidator);
			editpart.setConfig(config);
		}
		return editpart;
	}

	/**
	 * Creates a new maxLengthValidator.
	 * 
	 * @return
	 */
	public static IMaxLengthValidatorEditpart createMaxLengthValidator(
			IValidationConfig config) {
		YMaxLengthValidationConfig yValidationConfig = (YMaxLengthValidationConfig) config
				.getValidationSettings();
		IMaxLengthValidatorEditpart editpart = null;
		int maxlength = yValidationConfig.getMaxLength();
		if (maxlength > 0) {
			YMaxLengthValidator yValidator = ValidationFactory.eINSTANCE
					.createYMaxLengthValidator();
			yValidator.setMaxLength(maxlength);
			editpart = getEditpart(yValidator);
			editpart.setConfig(config);
		}
		return editpart;
	}

	/**
	 * Creates a new regExpressionValidator.
	 * 
	 * @return
	 */
	public static IRegexpValidatorEditpart createRegExpressionValidator(
			IValidationConfig config) {
		YRegexpValidationConfig yValidationConfig = (YRegexpValidationConfig) config
				.getValidationSettings();
		IRegexpValidatorEditpart editpart = null;
		String regexp = yValidationConfig.getRegExpression();
		if (RegexpValidatorEditpart.isValidRegExpression(regexp)) {
			YRegexpValidator yValidator = ValidationFactory.eINSTANCE
					.createYRegexpValidator();
			yValidator.setRegExpression(regexp);
			editpart = getEditpart(yValidator);
			editpart.setConfig(config);
		}
		return editpart;
	}

	/**
	 * See {@link ElementEditpart#getEditpart(YElement)}
	 * 
	 * @param yValidator
	 * @return
	 */
	private static <A extends IValidatorEditpart> A getEditpart(
			YElement yValidator) {
		return ElementEditpart.getEditpart(yValidator);
	}

	public static DatatypeEditpart.ValidatorDelta internalGetValidatorsDelta(
			IValidationConfig config, DatatypeBridge bridge,
			Notification notification) {

		List<IValidatorEditpart> toAdd = new ArrayList<IValidatorEditpart>();
		List<IValidatorEditpart> toRemove = new ArrayList<IValidatorEditpart>();

		List<IValidatorEditpart> activeValidators = bridge.getDatatypeValidators();
		if (notification.getFeature() == ValidationPackage.Literals.YMAX_LENGTH_VALIDATION_CONFIG__MAX_LENGTH) {
			int oldValue = notification.getOldIntValue();
			int newValue = notification.getNewIntValue();

			if (oldValue <= 0 && newValue > 0) {
				toAdd.add(createMaxLengthValidator(config));
			} else if (oldValue > 0 && newValue <= 0) {
				toRemove.addAll(findToRemoveValidators(activeValidators,
						YMaxLengthValidator.class));
			} else {
				// nothing to do -> Other changes of attributes are handled by
				// the ValidationConfigToValidatorBridge
			}
		} else if (notification.getFeature() == ValidationPackage.Literals.YMIN_LENGTH_VALIDATION_CONFIG__MIN_LENGTH) {
			int oldValue = notification.getOldIntValue();
			int newValue = notification.getNewIntValue();

			if (oldValue <= 0 && newValue > 0) {
				toAdd.add(createMinLengthValidator(config));
			} else if (oldValue > 0 && newValue <= 0) {
				toRemove.addAll(findToRemoveValidators(activeValidators,
						YMinLengthValidator.class));
			} else {
				// nothing to do -> Other changes of attributes are handled by
				// the ValidationConfigToValidatorBridge
			}
		} else if (notification.getFeature() == ValidationPackage.Literals.YREGEXP_VALIDATION_CONFIG__REG_EXPRESSION) {
			String oldValue = notification.getOldStringValue();
			String newValue = notification.getNewStringValue();

			if (!RegexpValidatorEditpart.isValidRegExpression(oldValue)
					&& RegexpValidatorEditpart.isValidRegExpression(newValue)) {
				toAdd.add(createRegExpressionValidator(config));
			} else if (RegexpValidatorEditpart.isValidRegExpression(oldValue)
					&& !RegexpValidatorEditpart.isValidRegExpression(newValue)) {
				toRemove.addAll(findToRemoveValidators(activeValidators,
						YRegexpValidator.class));
			} else {
				// nothing to do -> Other changes of attributes are handled by
				// the ValidationConfigToValidatorBridge
			}
		}

		return new DatatypeEditpart.ValidatorDelta(toAdd, toRemove);
	}

	/**
	 * Tries to find all validators of the given type. Each validator of the
	 * same type will then be removed.
	 * <p>
	 * Note: If we need detailed control of the validators to remove (for
	 * instance only validators that have been created by this instance of
	 * datatype editpart), then we have to add a "marker adapter" to the
	 * prepared {@link YValidator}. This marker adapter will keep a reference to
	 * this datatype editpart, and then we can separate validators that have
	 * been added by different editparts. For now, there is no need for it.
	 * 
	 * @param activeValidators
	 * @param oldValue
	 * @return
	 */
	protected static List<IValidatorEditpart> findToRemoveValidators(
			List<IValidatorEditpart> activeValidators,
			Class<? extends YValidator> clazz) {
		List<IValidatorEditpart> toRemove = new ArrayList<IValidatorEditpart>();
		for (IValidatorEditpart editpart : activeValidators) {
			if (editpart.getModel().getClass() == clazz) {
				toRemove.add(editpart);
			}
		}
		return toRemove;
	}

	/**
	 * Collects all validators.
	 * 
	 * @param result
	 * @return
	 */
	public static DatatypeEditpart.ValidatorDelta getAllValidators(
			IValidationConfig config) {

		List<IValidatorEditpart> toAdd = new ArrayList<IValidatorEditpart>();

		YValidationConfig yValidationConfig = (YValidationConfig) config
				.getValidationSettings();
		if (yValidationConfig instanceof YMinLengthValidationConfig) {
			IMinLengthValidatorEditpart minLength = createMinLengthValidator(config);
			if (minLength != null) {
				toAdd.add(minLength);
			}
		}

		if (yValidationConfig instanceof YMaxLengthValidationConfig) {
			IMaxLengthValidatorEditpart maxLength = createMaxLengthValidator(config);
			if (maxLength != null) {
				toAdd.add(maxLength);
			}
		}

		if (yValidationConfig instanceof YRegexpValidationConfig) {
			IRegexpValidatorEditpart regexp = createRegExpressionValidator(config);
			if (regexp != null) {
				toAdd.add(regexp);
			}
		}

		return new DatatypeEditpart.ValidatorDelta(toAdd, null);
	}

}
