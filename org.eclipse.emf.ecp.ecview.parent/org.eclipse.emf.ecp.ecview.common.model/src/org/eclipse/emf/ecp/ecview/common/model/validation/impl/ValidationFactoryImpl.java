/**
 */
package org.eclipse.emf.ecp.ecview.common.model.validation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecp.ecview.common.model.validation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationFactoryImpl extends EFactoryImpl implements ValidationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValidationFactory init() {
		try {
			ValidationFactory theValidationFactory = (ValidationFactory)EPackage.Registry.INSTANCE.getEFactory(ValidationPackage.eNS_URI);
			if (theValidationFactory != null) {
				return theValidationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValidationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ValidationPackage.YMIN_LENGTH_VALIDATOR: return createYMinLengthValidator();
			case ValidationPackage.YMAX_LENGTH_VALIDATOR: return createYMaxLengthValidator();
			case ValidationPackage.YREGEXP_VALIDATOR: return createYRegexpValidator();
			case ValidationPackage.YVALIDATABLE: return createYValidatable();
			case ValidationPackage.YMIN_LENGTH_VALIDATABLE: return createYMinLengthValidatable();
			case ValidationPackage.YMAX_LENGTH_VALIDATABLE: return createYMaxLengthValidatable();
			case ValidationPackage.YREGEXP_VALIDATABLE: return createYRegexpValidatable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YMinLengthValidator createYMinLengthValidator() {
		YMinLengthValidatorImpl yMinLengthValidator = new YMinLengthValidatorImpl();
		return yMinLengthValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YMaxLengthValidator createYMaxLengthValidator() {
		YMaxLengthValidatorImpl yMaxLengthValidator = new YMaxLengthValidatorImpl();
		return yMaxLengthValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YRegexpValidator createYRegexpValidator() {
		YRegexpValidatorImpl yRegexpValidator = new YRegexpValidatorImpl();
		return yRegexpValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YValidatable createYValidatable() {
		YValidatableImpl yValidatable = new YValidatableImpl();
		return yValidatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YMinLengthValidatable createYMinLengthValidatable() {
		YMinLengthValidatableImpl yMinLengthValidatable = new YMinLengthValidatableImpl();
		return yMinLengthValidatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YMaxLengthValidatable createYMaxLengthValidatable() {
		YMaxLengthValidatableImpl yMaxLengthValidatable = new YMaxLengthValidatableImpl();
		return yMaxLengthValidatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YRegexpValidatable createYRegexpValidatable() {
		YRegexpValidatableImpl yRegexpValidatable = new YRegexpValidatableImpl();
		return yRegexpValidatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationPackage getValidationPackage() {
		return (ValidationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValidationPackage getPackage() {
		return ValidationPackage.eINSTANCE;
	}

} //ValidationFactoryImpl
