/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.DatatypesPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityFactory;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YColor;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YRuledVisibilityProcessor;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisibilityPackageImpl extends EPackageImpl implements VisibilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVisibilityProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yRuledVisibilityProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVisibilityRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVisibilityPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yColorTypeEEnum = null;

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
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisibilityPackageImpl() {
		super(eNS_URI, VisibilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VisibilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisibilityPackage init() {
		if (isInited) return (VisibilityPackage)EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI);

		// Obtain or create and register package
		VisibilityPackageImpl theVisibilityPackage = (VisibilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisibilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisibilityPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CoreModelPackageImpl theCoreModelPackage = (CoreModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI) instanceof CoreModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI) : CoreModelPackage.eINSTANCE);
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) instanceof ValidationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) : ValidationPackage.eINSTANCE);
		BindingPackageImpl theBindingPackage = (BindingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI) instanceof BindingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI) : BindingPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theVisibilityPackage.createPackageContents();
		theCoreModelPackage.createPackageContents();
		theValidationPackage.createPackageContents();
		theBindingPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theVisibilityPackage.initializePackageContents();
		theCoreModelPackage.initializePackageContents();
		theValidationPackage.initializePackageContents();
		theBindingPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVisibilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisibilityPackage.eNS_URI, theVisibilityPackage);
		return theVisibilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVisibilityProcessor() {
		return yVisibilityProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVisibilityProcessor_OnMatch() {
		return (EReference)yVisibilityProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYRuledVisibilityProcessor() {
		return yRuledVisibilityProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYRuledVisibilityProcessor_Rule() {
		return (EReference)yRuledVisibilityProcessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVisibilityRule() {
		return yVisibilityRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVisibilityProperties() {
		return yVisibilityPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Visible() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Editable() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Enabled() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Border() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Bold() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Italic() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Strikethrough() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityProperties_Underline() {
		return (EAttribute)yVisibilityPropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVisibilityProperties_BackgroundColor() {
		return (EReference)yVisibilityPropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVisibilityProperties_ForegroundColor() {
		return (EReference)yVisibilityPropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYColor() {
		return yColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColor_Red() {
		return (EAttribute)yColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColor_Green() {
		return (EAttribute)yColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColor_Blue() {
		return (EAttribute)yColorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColor_ThemeId() {
		return (EAttribute)yColorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYColor_Type() {
		return (EAttribute)yColorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYColorType() {
		return yColorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityFactory getVisibilityFactory() {
		return (VisibilityFactory)getEFactoryInstance();
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
		yVisibilityProcessorEClass = createEClass(YVISIBILITY_PROCESSOR);
		createEReference(yVisibilityProcessorEClass, YVISIBILITY_PROCESSOR__ON_MATCH);

		yRuledVisibilityProcessorEClass = createEClass(YRULED_VISIBILITY_PROCESSOR);
		createEReference(yRuledVisibilityProcessorEClass, YRULED_VISIBILITY_PROCESSOR__RULE);

		yVisibilityRuleEClass = createEClass(YVISIBILITY_RULE);

		yVisibilityPropertiesEClass = createEClass(YVISIBILITY_PROPERTIES);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__VISIBLE);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__EDITABLE);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__ENABLED);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__BORDER);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__BOLD);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__ITALIC);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__STRIKETHROUGH);
		createEAttribute(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__UNDERLINE);
		createEReference(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__BACKGROUND_COLOR);
		createEReference(yVisibilityPropertiesEClass, YVISIBILITY_PROPERTIES__FOREGROUND_COLOR);

		yColorEClass = createEClass(YCOLOR);
		createEAttribute(yColorEClass, YCOLOR__RED);
		createEAttribute(yColorEClass, YCOLOR__GREEN);
		createEAttribute(yColorEClass, YCOLOR__BLUE);
		createEAttribute(yColorEClass, YCOLOR__THEME_ID);
		createEAttribute(yColorEClass, YCOLOR__TYPE);

		// Create enums
		yColorTypeEEnum = createEEnum(YCOLOR_TYPE);
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

		// Obtain other dependent packages
		CoreModelPackage theCoreModelPackage = (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yVisibilityProcessorEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yRuledVisibilityProcessorEClass.getESuperTypes().add(this.getYVisibilityProcessor());
		yVisibilityRuleEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yVisibilityPropertiesEClass.getESuperTypes().add(theCoreModelPackage.getYElement());

		// Initialize classes and features; add operations and parameters
		initEClass(yVisibilityProcessorEClass, YVisibilityProcessor.class, "YVisibilityProcessor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYVisibilityProcessor_OnMatch(), this.getYVisibilityProperties(), null, "onMatch", null, 1, 1, YVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yRuledVisibilityProcessorEClass, YRuledVisibilityProcessor.class, "YRuledVisibilityProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYRuledVisibilityProcessor_Rule(), this.getYVisibilityRule(), null, "rule", null, 0, 1, YRuledVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yVisibilityRuleEClass, YVisibilityRule.class, "YVisibilityRule", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yVisibilityPropertiesEClass, YVisibilityProperties.class, "YVisibilityProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYVisibilityProperties_Visible(), ecorePackage.getEBoolean(), "visible", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Editable(), ecorePackage.getEBoolean(), "editable", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Border(), ecorePackage.getEBoolean(), "border", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Bold(), ecorePackage.getEBoolean(), "bold", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Italic(), ecorePackage.getEBoolean(), "italic", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Strikethrough(), ecorePackage.getEBoolean(), "strikethrough", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityProperties_Underline(), ecorePackage.getEBoolean(), "underline", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYVisibilityProperties_BackgroundColor(), this.getYColor(), null, "backgroundColor", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYVisibilityProperties_ForegroundColor(), this.getYColor(), null, "foregroundColor", null, 0, 1, YVisibilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yColorEClass, YColor.class, "YColor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYColor_Red(), ecorePackage.getEInt(), "red", "0", 0, 1, YColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYColor_Green(), ecorePackage.getEInt(), "green", "0", 0, 1, YColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYColor_Blue(), ecorePackage.getEInt(), "blue", "0", 0, 1, YColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYColor_ThemeId(), ecorePackage.getEString(), "themeId", null, 0, 1, YColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYColor_Type(), this.getYColorType(), "type", null, 1, 1, YColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(yColorTypeEEnum, YColorType.class, "YColorType");
		addEEnumLiteral(yColorTypeEEnum, YColorType.THEME);
		addEEnumLiteral(yColorTypeEEnum, YColorType.RGB);

		// Create resource
		createResource(eNS_URI);
	}

} //VisibilityPackageImpl