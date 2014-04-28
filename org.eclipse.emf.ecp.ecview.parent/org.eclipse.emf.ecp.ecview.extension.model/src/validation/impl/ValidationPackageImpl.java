/**
 */
package validation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage;

import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;

import org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl;

import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl;
import validation.ValidationFactory;
import validation.ValidationPackage;
import validation.YMaxLengthValidator;
import validation.YMinLengthValidator;
import validation.YRegexpValidator;
import validation.YValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationPackageImpl extends EPackageImpl implements ValidationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yMinLengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yMaxLengthValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yRegexpValidatorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see validation.ValidationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValidationPackageImpl() {
		super(eNS_URI, ValidationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ValidationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValidationPackage init() {
		if (isInited) return (ValidationPackage)EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI);

		// Obtain or create and register package
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValidationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValidationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExtDatatypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ExtensionModelPackageImpl theExtensionModelPackage = (ExtensionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionModelPackage.eNS_URI) instanceof ExtensionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionModelPackage.eNS_URI) : ExtensionModelPackage.eINSTANCE);

		// Create package meta-data objects
		theValidationPackage.createPackageContents();
		theExtensionModelPackage.createPackageContents();

		// Initialize created meta-data
		theValidationPackage.initializePackageContents();
		theExtensionModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValidationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValidationPackage.eNS_URI, theValidationPackage);
		return theValidationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYValidator() {
		return yValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMinLengthValidator() {
		return yMinLengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMinLengthValidator_MinLength() {
		return (EAttribute)yMinLengthValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMaxLengthValidator() {
		return yMaxLengthValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMaxLengthValidator_MaxLength() {
		return (EAttribute)yMaxLengthValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYRegexpValidator() {
		return yRegexpValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYRegexpValidator_Regexp() {
		return (EAttribute)yRegexpValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationFactory getValidationFactory() {
		return (ValidationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		yValidatorEClass = createEClass(YVALIDATOR);

		yMinLengthValidatorEClass = createEClass(YMIN_LENGTH_VALIDATOR);
		createEAttribute(yMinLengthValidatorEClass, YMIN_LENGTH_VALIDATOR__MIN_LENGTH);

		yMaxLengthValidatorEClass = createEClass(YMAX_LENGTH_VALIDATOR);
		createEAttribute(yMaxLengthValidatorEClass, YMAX_LENGTH_VALIDATOR__MAX_LENGTH);

		yRegexpValidatorEClass = createEClass(YREGEXP_VALIDATOR);
		createEAttribute(yRegexpValidatorEClass, YREGEXP_VALIDATOR__REGEXP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yMinLengthValidatorEClass.getESuperTypes().add(this.getYValidator());
		yMaxLengthValidatorEClass.getESuperTypes().add(this.getYValidator());
		yRegexpValidatorEClass.getESuperTypes().add(this.getYValidator());

		// Initialize classes and features; add operations and parameters
		initEClass(yValidatorEClass, YValidator.class, "YValidator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yMinLengthValidatorEClass, YMinLengthValidator.class, "YMinLengthValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYMinLengthValidator_MinLength(), ecorePackage.getEInt(), "minLength", null, 1, 1, YMinLengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yMaxLengthValidatorEClass, YMaxLengthValidator.class, "YMaxLengthValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYMaxLengthValidator_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 1, 1, YMaxLengthValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yRegexpValidatorEClass, YRegexpValidator.class, "YRegexpValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYRegexpValidator_Regexp(), ecorePackage.getEString(), "regexp", null, 1, 1, YRegexpValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ValidationPackageImpl
