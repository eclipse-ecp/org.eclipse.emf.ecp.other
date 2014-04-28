/**
 */
package validation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import validation.*;

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
			case ValidationPackage.YMIN_LENGTH_VALIDATOR: return (EObject)createYMinLengthValidator();
			case ValidationPackage.YMAX_LENGTH_VALIDATOR: return (EObject)createYMaxLengthValidator();
			case ValidationPackage.YREGEXP_VALIDATOR: return (EObject)createYRegexpValidator();
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
