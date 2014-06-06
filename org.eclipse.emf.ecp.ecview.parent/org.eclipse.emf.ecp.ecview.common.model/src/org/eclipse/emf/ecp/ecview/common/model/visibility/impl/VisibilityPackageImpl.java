/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
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
import org.eclipse.emf.ecp.ecview.common.model.visibility.YBooleanValueRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YColor;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YDecimalValueRuleOption;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YRegexpRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YRuledVisibilityProcessor;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRule;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityRuleBindingEndpoint;

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
	private EClass yVisibilityRuleBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBooleanValueRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yRegexpRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDecimalValueRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yColorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yDecimalValueRuleOptionEEnum = null;

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
		EcorePackageImpl theEcorePackage = (EcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI) : EcorePackage.eINSTANCE);

		// Create package meta-data objects
		theVisibilityPackage.createPackageContents();
		theCoreModelPackage.createPackageContents();
		theValidationPackage.createPackageContents();
		theBindingPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theEcorePackage.createPackageContents();

		// Initialize created meta-data
		theVisibilityPackage.initializePackageContents();
		theCoreModelPackage.initializePackageContents();
		theValidationPackage.initializePackageContents();
		theBindingPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();

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
	public EReference getYVisibilityProcessor_Parent() {
		return (EReference)yVisibilityProcessorEClass.getEStructuralFeatures().get(1);
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
	public EReference getYVisibilityRule_BindingEndpoints() {
		return (EReference)yVisibilityRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityRule_MatchMeansFalse() {
		return (EAttribute)yVisibilityRuleEClass.getEStructuralFeatures().get(1);
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
	public EClass getYVisibilityRuleBindingEndpoint() {
		return yVisibilityRuleBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVisibilityRuleBindingEndpoint_Rule() {
		return (EReference)yVisibilityRuleBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibilityRuleBindingEndpoint_Attribute() {
		return (EAttribute)yVisibilityRuleBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBooleanValueRule() {
		return yBooleanValueRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYRegexpRule() {
		return yRegexpRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYRegexpRule_RegExpression() {
		return (EAttribute)yRegexpRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDecimalValueRule() {
		return yDecimalValueRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDecimalValueRule_Option() {
		return (EAttribute)yDecimalValueRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDecimalValueRule_ReferenceValue() {
		return (EAttribute)yDecimalValueRuleEClass.getEStructuralFeatures().get(1);
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
	public EEnum getYDecimalValueRuleOption() {
		return yDecimalValueRuleOptionEEnum;
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
		createEReference(yVisibilityProcessorEClass, YVISIBILITY_PROCESSOR__PARENT);

		yRuledVisibilityProcessorEClass = createEClass(YRULED_VISIBILITY_PROCESSOR);
		createEReference(yRuledVisibilityProcessorEClass, YRULED_VISIBILITY_PROCESSOR__RULE);

		yVisibilityRuleEClass = createEClass(YVISIBILITY_RULE);
		createEReference(yVisibilityRuleEClass, YVISIBILITY_RULE__BINDING_ENDPOINTS);
		createEAttribute(yVisibilityRuleEClass, YVISIBILITY_RULE__MATCH_MEANS_FALSE);

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

		yVisibilityRuleBindingEndpointEClass = createEClass(YVISIBILITY_RULE_BINDING_ENDPOINT);
		createEReference(yVisibilityRuleBindingEndpointEClass, YVISIBILITY_RULE_BINDING_ENDPOINT__RULE);
		createEAttribute(yVisibilityRuleBindingEndpointEClass, YVISIBILITY_RULE_BINDING_ENDPOINT__ATTRIBUTE);

		yBooleanValueRuleEClass = createEClass(YBOOLEAN_VALUE_RULE);

		yRegexpRuleEClass = createEClass(YREGEXP_RULE);
		createEAttribute(yRegexpRuleEClass, YREGEXP_RULE__REG_EXPRESSION);

		yDecimalValueRuleEClass = createEClass(YDECIMAL_VALUE_RULE);
		createEAttribute(yDecimalValueRuleEClass, YDECIMAL_VALUE_RULE__OPTION);
		createEAttribute(yDecimalValueRuleEClass, YDECIMAL_VALUE_RULE__REFERENCE_VALUE);

		// Create enums
		yColorTypeEEnum = createEEnum(YCOLOR_TYPE);
		yDecimalValueRuleOptionEEnum = createEEnum(YDECIMAL_VALUE_RULE_OPTION);
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
		BindingPackage theBindingPackage = (BindingPackage)EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yVisibilityProcessorEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yRuledVisibilityProcessorEClass.getESuperTypes().add(this.getYVisibilityProcessor());
		yVisibilityRuleEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yVisibilityPropertiesEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yVisibilityRuleBindingEndpointEClass.getESuperTypes().add(theBindingPackage.getYValueBindingEndpoint());
		yBooleanValueRuleEClass.getESuperTypes().add(this.getYVisibilityRule());
		yRegexpRuleEClass.getESuperTypes().add(this.getYVisibilityRule());
		yDecimalValueRuleEClass.getESuperTypes().add(this.getYVisibilityRule());

		// Initialize classes and features; add operations and parameters
		initEClass(yVisibilityProcessorEClass, YVisibilityProcessor.class, "YVisibilityProcessor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYVisibilityProcessor_OnMatch(), this.getYVisibilityProperties(), null, "onMatch", null, 1, 1, YVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYVisibilityProcessor_Parent(), theCoreModelPackage.getYVisibilityProcessable(), theCoreModelPackage.getYVisibilityProcessable_VisibilityProcessor(), "parent", null, 1, 1, YVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yRuledVisibilityProcessorEClass, YRuledVisibilityProcessor.class, "YRuledVisibilityProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYRuledVisibilityProcessor_Rule(), this.getYVisibilityRule(), null, "rule", null, 0, 1, YRuledVisibilityProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yVisibilityRuleEClass, YVisibilityRule.class, "YVisibilityRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYVisibilityRule_BindingEndpoints(), this.getYVisibilityRuleBindingEndpoint(), this.getYVisibilityRuleBindingEndpoint_Rule(), "bindingEndpoints", null, 0, -1, YVisibilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityRule_MatchMeansFalse(), ecorePackage.getEBoolean(), "matchMeansFalse", null, 0, 1, YVisibilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(yVisibilityRuleEClass, this.getYVisibilityRuleBindingEndpoint(), "createRuleEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attribute", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		initEClass(yVisibilityRuleBindingEndpointEClass, YVisibilityRuleBindingEndpoint.class, "YVisibilityRuleBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYVisibilityRuleBindingEndpoint_Rule(), this.getYVisibilityRule(), this.getYVisibilityRule_BindingEndpoints(), "rule", null, 1, 1, YVisibilityRuleBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibilityRuleBindingEndpoint_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, YVisibilityRuleBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yBooleanValueRuleEClass, YBooleanValueRule.class, "YBooleanValueRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(yBooleanValueRuleEClass, this.getYVisibilityRuleBindingEndpoint(), "createRuleEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yRegexpRuleEClass, YRegexpRule.class, "YRegexpRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYRegexpRule_RegExpression(), ecorePackage.getEString(), "regExpression", null, 0, 1, YRegexpRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yRegexpRuleEClass, this.getYVisibilityRuleBindingEndpoint(), "createRuleEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yDecimalValueRuleEClass, YDecimalValueRule.class, "YDecimalValueRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYDecimalValueRule_Option(), this.getYDecimalValueRuleOption(), "option", "EQUAL", 0, 1, YDecimalValueRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYDecimalValueRule_ReferenceValue(), ecorePackage.getEDouble(), "referenceValue", null, 0, 1, YDecimalValueRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yDecimalValueRuleEClass, this.getYVisibilityRuleBindingEndpoint(), "createRuleEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(yColorTypeEEnum, YColorType.class, "YColorType");
		addEEnumLiteral(yColorTypeEEnum, YColorType.THEME);
		addEEnumLiteral(yColorTypeEEnum, YColorType.RGB);

		initEEnum(yDecimalValueRuleOptionEEnum, YDecimalValueRuleOption.class, "YDecimalValueRuleOption");
		addEEnumLiteral(yDecimalValueRuleOptionEEnum, YDecimalValueRuleOption.EQUAL);
		addEEnumLiteral(yDecimalValueRuleOptionEEnum, YDecimalValueRuleOption.LOWER);
		addEEnumLiteral(yDecimalValueRuleOptionEEnum, YDecimalValueRuleOption.LOWER_EQUAL);
		addEEnumLiteral(yDecimalValueRuleOptionEEnum, YDecimalValueRuleOption.GREATER);
		addEEnumLiteral(yDecimalValueRuleOptionEEnum, YDecimalValueRuleOption.GREATER_EQUAL);
		addEEnumLiteral(yDecimalValueRuleOptionEEnum, YDecimalValueRuleOption.NOT_EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //VisibilityPackageImpl
