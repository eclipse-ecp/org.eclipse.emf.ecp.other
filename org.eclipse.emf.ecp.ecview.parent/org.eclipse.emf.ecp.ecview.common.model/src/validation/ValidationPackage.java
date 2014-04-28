/**
 */
package validation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see validation.ValidationFactory
 * @model kind="package"
 * @generated
 */
public interface ValidationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "validation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/ecp/ecview/common/validation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "validation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidationPackage eINSTANCE = validation.impl.ValidationPackageImpl.init();

	/**
	 * The meta object id for the '{@link validation.impl.YValidatorImpl <em>YValidator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see validation.impl.YValidatorImpl
	 * @see validation.impl.ValidationPackageImpl#getYValidator()
	 * @generated
	 */
	int YVALIDATOR = 0;

	/**
	 * The number of structural features of the '<em>YValidator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALIDATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link validation.impl.YMinLengthValidatorImpl <em>YMin Length Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see validation.impl.YMinLengthValidatorImpl
	 * @see validation.impl.ValidationPackageImpl#getYMinLengthValidator()
	 * @generated
	 */
	int YMIN_LENGTH_VALIDATOR = 1;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATOR__MIN_LENGTH = YVALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YMin Length Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATOR_FEATURE_COUNT = YVALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link validation.impl.YMaxLengthValidatorImpl <em>YMax Length Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see validation.impl.YMaxLengthValidatorImpl
	 * @see validation.impl.ValidationPackageImpl#getYMaxLengthValidator()
	 * @generated
	 */
	int YMAX_LENGTH_VALIDATOR = 2;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATOR__MAX_LENGTH = YVALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YMax Length Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATOR_FEATURE_COUNT = YVALIDATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link validation.impl.YRegexpValidatorImpl <em>YRegexp Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see validation.impl.YRegexpValidatorImpl
	 * @see validation.impl.ValidationPackageImpl#getYRegexpValidator()
	 * @generated
	 */
	int YREGEXP_VALIDATOR = 3;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATOR__REGEXP = YVALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YRegexp Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATOR_FEATURE_COUNT = YVALIDATOR_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link validation.YValidator <em>YValidator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YValidator</em>'.
	 * @see validation.YValidator
	 * @generated
	 */
	EClass getYValidator();

	/**
	 * Returns the meta object for class '{@link validation.YMinLengthValidator <em>YMin Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMin Length Validator</em>'.
	 * @see validation.YMinLengthValidator
	 * @generated
	 */
	EClass getYMinLengthValidator();

	/**
	 * Returns the meta object for the attribute '{@link validation.YMinLengthValidator#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see validation.YMinLengthValidator#getMinLength()
	 * @see #getYMinLengthValidator()
	 * @generated
	 */
	EAttribute getYMinLengthValidator_MinLength();

	/**
	 * Returns the meta object for class '{@link validation.YMaxLengthValidator <em>YMax Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMax Length Validator</em>'.
	 * @see validation.YMaxLengthValidator
	 * @generated
	 */
	EClass getYMaxLengthValidator();

	/**
	 * Returns the meta object for the attribute '{@link validation.YMaxLengthValidator#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see validation.YMaxLengthValidator#getMaxLength()
	 * @see #getYMaxLengthValidator()
	 * @generated
	 */
	EAttribute getYMaxLengthValidator_MaxLength();

	/**
	 * Returns the meta object for class '{@link validation.YRegexpValidator <em>YRegexp Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YRegexp Validator</em>'.
	 * @see validation.YRegexpValidator
	 * @generated
	 */
	EClass getYRegexpValidator();

	/**
	 * Returns the meta object for the attribute '{@link validation.YRegexpValidator#getRegexp <em>Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexp</em>'.
	 * @see validation.YRegexpValidator#getRegexp()
	 * @see #getYRegexpValidator()
	 * @generated
	 */
	EAttribute getYRegexpValidator_Regexp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValidationFactory getValidationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link validation.impl.YValidatorImpl <em>YValidator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see validation.impl.YValidatorImpl
		 * @see validation.impl.ValidationPackageImpl#getYValidator()
		 * @generated
		 */
		EClass YVALIDATOR = eINSTANCE.getYValidator();

		/**
		 * The meta object literal for the '{@link validation.impl.YMinLengthValidatorImpl <em>YMin Length Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see validation.impl.YMinLengthValidatorImpl
		 * @see validation.impl.ValidationPackageImpl#getYMinLengthValidator()
		 * @generated
		 */
		EClass YMIN_LENGTH_VALIDATOR = eINSTANCE.getYMinLengthValidator();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMIN_LENGTH_VALIDATOR__MIN_LENGTH = eINSTANCE.getYMinLengthValidator_MinLength();

		/**
		 * The meta object literal for the '{@link validation.impl.YMaxLengthValidatorImpl <em>YMax Length Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see validation.impl.YMaxLengthValidatorImpl
		 * @see validation.impl.ValidationPackageImpl#getYMaxLengthValidator()
		 * @generated
		 */
		EClass YMAX_LENGTH_VALIDATOR = eINSTANCE.getYMaxLengthValidator();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMAX_LENGTH_VALIDATOR__MAX_LENGTH = eINSTANCE.getYMaxLengthValidator_MaxLength();

		/**
		 * The meta object literal for the '{@link validation.impl.YRegexpValidatorImpl <em>YRegexp Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see validation.impl.YRegexpValidatorImpl
		 * @see validation.impl.ValidationPackageImpl#getYRegexpValidator()
		 * @generated
		 */
		EClass YREGEXP_VALIDATOR = eINSTANCE.getYRegexpValidator();

		/**
		 * The meta object literal for the '<em><b>Regexp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YREGEXP_VALIDATOR__REGEXP = eINSTANCE.getYRegexpValidator_Regexp();

	}

} //ValidationPackage
