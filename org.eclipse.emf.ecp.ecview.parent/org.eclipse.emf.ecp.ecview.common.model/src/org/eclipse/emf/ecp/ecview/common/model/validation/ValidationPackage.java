/**
 */
package org.eclipse.emf.ecp.ecview.common.model.validation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory
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
	ValidationPackage eINSTANCE = org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.impl.YValidatorImpl <em>YValidator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.YValidatorImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYValidator()
	 * @generated
	 */
	int YVALIDATOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALIDATOR__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The number of structural features of the '<em>YValidator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALIDATOR_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.impl.YMinLengthValidatorImpl <em>YMin Length Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.YMinLengthValidatorImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYMinLengthValidator()
	 * @generated
	 */
	int YMIN_LENGTH_VALIDATOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATOR__ID = YVALIDATOR__ID;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.impl.YMaxLengthValidatorImpl <em>YMax Length Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.YMaxLengthValidatorImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYMaxLengthValidator()
	 * @generated
	 */
	int YMAX_LENGTH_VALIDATOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATOR__ID = YVALIDATOR__ID;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.impl.YRegexpValidatorImpl <em>YRegexp Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.YRegexpValidatorImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYRegexpValidator()
	 * @generated
	 */
	int YREGEXP_VALIDATOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATOR__ID = YVALIDATOR__ID;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YValidatable <em>YValidatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YValidatable
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYValidatable()
	 * @generated
	 */
	int YVALIDATABLE = 4;

	/**
	 * The number of structural features of the '<em>YValidatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALIDATABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidatable <em>YMin Length Validatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidatable
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYMinLengthValidatable()
	 * @generated
	 */
	int YMIN_LENGTH_VALIDATABLE = 5;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATABLE__MIN_LENGTH = YVALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YMin Length Validatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMIN_LENGTH_VALIDATABLE_FEATURE_COUNT = YVALIDATABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidatable <em>YMax Length Validatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidatable
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYMaxLengthValidatable()
	 * @generated
	 */
	int YMAX_LENGTH_VALIDATABLE = 6;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATABLE__MAX_LENGTH = YVALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YMax Length Validatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMAX_LENGTH_VALIDATABLE_FEATURE_COUNT = YVALIDATABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidatable <em>YRegexp Validatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidatable
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYRegexpValidatable()
	 * @generated
	 */
	int YREGEXP_VALIDATABLE = 7;

	/**
	 * The feature id for the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATABLE__REG_EXPRESSION = YVALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YRegexp Validatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YREGEXP_VALIDATABLE_FEATURE_COUNT = YVALIDATABLE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YValidator <em>YValidator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YValidator</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YValidator
	 * @generated
	 */
	EClass getYValidator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator <em>YMin Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMin Length Validator</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator
	 * @generated
	 */
	EClass getYMinLengthValidator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator#getMinLength()
	 * @see #getYMinLengthValidator()
	 * @generated
	 */
	EAttribute getYMinLengthValidator_MinLength();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator <em>YMax Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMax Length Validator</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator
	 * @generated
	 */
	EClass getYMaxLengthValidator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator#getMaxLength()
	 * @see #getYMaxLengthValidator()
	 * @generated
	 */
	EAttribute getYMaxLengthValidator_MaxLength();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator <em>YRegexp Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YRegexp Validator</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator
	 * @generated
	 */
	EClass getYRegexpValidator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator#getRegexp <em>Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexp</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator#getRegexp()
	 * @see #getYRegexpValidator()
	 * @generated
	 */
	EAttribute getYRegexpValidator_Regexp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YValidatable <em>YValidatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YValidatable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YValidatable
	 * @generated
	 */
	EClass getYValidatable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidatable <em>YMin Length Validatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMin Length Validatable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidatable
	 * @generated
	 */
	EClass getYMinLengthValidatable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidatable#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidatable#getMinLength()
	 * @see #getYMinLengthValidatable()
	 * @generated
	 */
	EAttribute getYMinLengthValidatable_MinLength();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidatable <em>YMax Length Validatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMax Length Validatable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidatable
	 * @generated
	 */
	EClass getYMaxLengthValidatable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidatable#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidatable#getMaxLength()
	 * @see #getYMaxLengthValidatable()
	 * @generated
	 */
	EAttribute getYMaxLengthValidatable_MaxLength();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidatable <em>YRegexp Validatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YRegexp Validatable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidatable
	 * @generated
	 */
	EClass getYRegexpValidatable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidatable#getRegExpression <em>Reg Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Expression</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidatable#getRegExpression()
	 * @see #getYRegexpValidatable()
	 * @generated
	 */
	EAttribute getYRegexpValidatable_RegExpression();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.impl.YValidatorImpl <em>YValidator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.YValidatorImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYValidator()
		 * @generated
		 */
		EClass YVALIDATOR = eINSTANCE.getYValidator();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.impl.YMinLengthValidatorImpl <em>YMin Length Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.YMinLengthValidatorImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYMinLengthValidator()
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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.impl.YMaxLengthValidatorImpl <em>YMax Length Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.YMaxLengthValidatorImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYMaxLengthValidator()
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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.impl.YRegexpValidatorImpl <em>YRegexp Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.YRegexpValidatorImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYRegexpValidator()
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

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YValidatable <em>YValidatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YValidatable
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYValidatable()
		 * @generated
		 */
		EClass YVALIDATABLE = eINSTANCE.getYValidatable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidatable <em>YMin Length Validatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidatable
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYMinLengthValidatable()
		 * @generated
		 */
		EClass YMIN_LENGTH_VALIDATABLE = eINSTANCE.getYMinLengthValidatable();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMIN_LENGTH_VALIDATABLE__MIN_LENGTH = eINSTANCE.getYMinLengthValidatable_MinLength();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidatable <em>YMax Length Validatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidatable
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYMaxLengthValidatable()
		 * @generated
		 */
		EClass YMAX_LENGTH_VALIDATABLE = eINSTANCE.getYMaxLengthValidatable();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMAX_LENGTH_VALIDATABLE__MAX_LENGTH = eINSTANCE.getYMaxLengthValidatable_MaxLength();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidatable <em>YRegexp Validatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidatable
		 * @see org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl#getYRegexpValidatable()
		 * @generated
		 */
		EClass YREGEXP_VALIDATABLE = eINSTANCE.getYRegexpValidatable();

		/**
		 * The meta object literal for the '<em><b>Reg Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YREGEXP_VALIDATABLE__REG_EXPRESSION = eINSTANCE.getYRegexpValidatable_RegExpression();

	}

} //ValidationPackage
