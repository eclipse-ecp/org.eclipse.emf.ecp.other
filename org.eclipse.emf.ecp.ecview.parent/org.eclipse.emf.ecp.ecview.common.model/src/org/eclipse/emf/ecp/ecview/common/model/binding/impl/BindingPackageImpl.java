/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy;
import org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.DatatypesPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.impl.ValidationPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.impl.VisibilityPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BindingPackageImpl extends EPackageImpl implements BindingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBindingSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yValueBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yListBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yValueBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yListBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yBindingUpdateStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBeanBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDetailValueBindingEndpointEClass = null;

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
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BindingPackageImpl() {
		super(eNS_URI, BindingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BindingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BindingPackage init() {
		if (isInited) return (BindingPackage)EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI);

		// Obtain or create and register package
		BindingPackageImpl theBindingPackage = (BindingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BindingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BindingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CoreModelPackageImpl theCoreModelPackage = (CoreModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI) instanceof CoreModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI) : CoreModelPackage.eINSTANCE);
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) instanceof ValidationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) : ValidationPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		VisibilityPackageImpl theVisibilityPackage = (VisibilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI) instanceof VisibilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisibilityPackage.eNS_URI) : VisibilityPackage.eINSTANCE);

		// Create package meta-data objects
		theBindingPackage.createPackageContents();
		theCoreModelPackage.createPackageContents();
		theValidationPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theVisibilityPackage.createPackageContents();

		// Initialize created meta-data
		theBindingPackage.initializePackageContents();
		theCoreModelPackage.initializePackageContents();
		theValidationPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theVisibilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBindingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BindingPackage.eNS_URI, theBindingPackage);
		return theBindingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBindingSet() {
		return yBindingSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYBindingSet_Bindings() {
		return (EReference)yBindingSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBindingEndpoint() {
		return yBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYValueBindingEndpoint() {
		return yValueBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYListBindingEndpoint() {
		return yListBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBinding() {
		return yBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBinding_ModelToTargetStrategy() {
		return (EAttribute)yBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBinding_TargetToModelStrategy() {
		return (EAttribute)yBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYValueBinding() {
		return yValueBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYValueBinding_TargetEndpoint() {
		return (EReference)yValueBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYValueBinding_ModelEndpoint() {
		return (EReference)yValueBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYListBinding() {
		return yListBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYListBinding_TargetEndpoint() {
		return (EReference)yListBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYListBinding_ModelEndpoint() {
		return (EReference)yListBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYBindingUpdateStrategy() {
		return yBindingUpdateStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBeanBindingEndpoint() {
		return yBeanBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanBindingEndpoint_Bean() {
		return (EAttribute)yBeanBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBeanBindingEndpoint_PropertyPath() {
		return (EAttribute)yBeanBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDetailValueBindingEndpoint() {
		return yDetailValueBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDetailValueBindingEndpoint_MasterObservable() {
		return (EReference)yDetailValueBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDetailValueBindingEndpoint_PropertyPath() {
		return (EAttribute)yDetailValueBindingEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDetailValueBindingEndpoint_Type() {
		return (EAttribute)yDetailValueBindingEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDetailValueBindingEndpoint_EmfNSUri() {
		return (EAttribute)yDetailValueBindingEndpointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingFactory getBindingFactory() {
		return (BindingFactory)getEFactoryInstance();
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
		yBindingSetEClass = createEClass(YBINDING_SET);
		createEReference(yBindingSetEClass, YBINDING_SET__BINDINGS);

		yBindingEndpointEClass = createEClass(YBINDING_ENDPOINT);

		yValueBindingEndpointEClass = createEClass(YVALUE_BINDING_ENDPOINT);

		yBeanBindingEndpointEClass = createEClass(YBEAN_BINDING_ENDPOINT);
		createEAttribute(yBeanBindingEndpointEClass, YBEAN_BINDING_ENDPOINT__BEAN);
		createEAttribute(yBeanBindingEndpointEClass, YBEAN_BINDING_ENDPOINT__PROPERTY_PATH);

		yDetailValueBindingEndpointEClass = createEClass(YDETAIL_VALUE_BINDING_ENDPOINT);
		createEReference(yDetailValueBindingEndpointEClass, YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE);
		createEAttribute(yDetailValueBindingEndpointEClass, YDETAIL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH);
		createEAttribute(yDetailValueBindingEndpointEClass, YDETAIL_VALUE_BINDING_ENDPOINT__TYPE);
		createEAttribute(yDetailValueBindingEndpointEClass, YDETAIL_VALUE_BINDING_ENDPOINT__EMF_NS_URI);

		yListBindingEndpointEClass = createEClass(YLIST_BINDING_ENDPOINT);

		yBindingEClass = createEClass(YBINDING);
		createEAttribute(yBindingEClass, YBINDING__MODEL_TO_TARGET_STRATEGY);
		createEAttribute(yBindingEClass, YBINDING__TARGET_TO_MODEL_STRATEGY);

		yValueBindingEClass = createEClass(YVALUE_BINDING);
		createEReference(yValueBindingEClass, YVALUE_BINDING__TARGET_ENDPOINT);
		createEReference(yValueBindingEClass, YVALUE_BINDING__MODEL_ENDPOINT);

		yListBindingEClass = createEClass(YLIST_BINDING);
		createEReference(yListBindingEClass, YLIST_BINDING__TARGET_ENDPOINT);
		createEReference(yListBindingEClass, YLIST_BINDING__MODEL_ENDPOINT);

		// Create enums
		yBindingUpdateStrategyEEnum = createEEnum(YBINDING_UPDATE_STRATEGY);
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
		yBindingSetEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yBindingEndpointEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yValueBindingEndpointEClass.getESuperTypes().add(this.getYBindingEndpoint());
		yBeanBindingEndpointEClass.getESuperTypes().add(this.getYValueBindingEndpoint());
		yDetailValueBindingEndpointEClass.getESuperTypes().add(this.getYValueBindingEndpoint());
		yListBindingEndpointEClass.getESuperTypes().add(this.getYBindingEndpoint());
		yBindingEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yValueBindingEClass.getESuperTypes().add(this.getYBinding());
		yListBindingEClass.getESuperTypes().add(this.getYBinding());

		// Initialize classes and features; add operations and parameters
		initEClass(yBindingSetEClass, YBindingSet.class, "YBindingSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYBindingSet_Bindings(), this.getYBinding(), null, "bindings", null, 0, -1, YBindingSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(yBindingSetEClass, this.getYValueBinding(), "addBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYValueBindingEndpoint(), "targetValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYValueBindingEndpoint(), "modelValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingSetEClass, this.getYListBinding(), "addBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYListBindingEndpoint(), "targetValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYListBindingEndpoint(), "modelValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingSetEClass, this.getYValueBinding(), "addBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYValueBindingEndpoint(), "targetValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYValueBindingEndpoint(), "modelValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBindingUpdateStrategy(), "targetToModelStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBindingUpdateStrategy(), "modelToTargetStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingSetEClass, this.getYListBinding(), "addBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYListBindingEndpoint(), "targetValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYListBindingEndpoint(), "modelValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBindingUpdateStrategy(), "targetToModelStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBindingUpdateStrategy(), "modelToTargetStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(yBindingSetEClass, theCoreModelPackage.getYView(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingSetEClass, null, "addBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBinding(), "binding", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingSetEClass, null, "removeBinding", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYBinding(), "binding", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yBindingEndpointEClass, YBindingEndpoint.class, "YBindingEndpoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(yBindingEndpointEClass, this.getYBinding(), "getBinding", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingEndpointEClass, ecorePackage.getEBoolean(), "isBindsElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCoreModelPackage.getYElement(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yValueBindingEndpointEClass, YValueBindingEndpoint.class, "YValueBindingEndpoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(yValueBindingEndpointEClass, this.getYDetailValueBindingEndpoint(), "createDetailValueEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yBeanBindingEndpointEClass, YBeanBindingEndpoint.class, "YBeanBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYBeanBindingEndpoint_Bean(), ecorePackage.getEJavaObject(), "bean", null, 0, 1, YBeanBindingEndpoint.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBeanBindingEndpoint_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, YBeanBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yDetailValueBindingEndpointEClass, YDetailValueBindingEndpoint.class, "YDetailValueBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYDetailValueBindingEndpoint_MasterObservable(), this.getYValueBindingEndpoint(), null, "masterObservable", null, 0, 1, YDetailValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYDetailValueBindingEndpoint_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 0, 1, YDetailValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYDetailValueBindingEndpoint_Type(), g1, "type", null, 1, 1, YDetailValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYDetailValueBindingEndpoint_EmfNSUri(), ecorePackage.getEString(), "emfNSUri", null, 0, 1, YDetailValueBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yListBindingEndpointEClass, YListBindingEndpoint.class, "YListBindingEndpoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yBindingEClass, YBinding.class, "YBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYBinding_ModelToTargetStrategy(), this.getYBindingUpdateStrategy(), "modelToTargetStrategy", "UPDATE", 0, 1, YBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBinding_TargetToModelStrategy(), this.getYBindingUpdateStrategy(), "targetToModelStrategy", "UPDATE", 0, 1, YBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yBindingEClass, this.getYBindingSet(), "getBindingSet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yBindingEClass, ecorePackage.getEBoolean(), "isBindsElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCoreModelPackage.getYElement(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(yBindingEClass, this.getYBindingEndpoint(), "getTargetEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(yBindingEClass, this.getYBindingEndpoint(), "getModelEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yValueBindingEClass, YValueBinding.class, "YValueBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYValueBinding_TargetEndpoint(), this.getYValueBindingEndpoint(), null, "targetEndpoint", null, 1, 1, YValueBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYValueBinding_ModelEndpoint(), this.getYValueBindingEndpoint(), null, "modelEndpoint", null, 1, 1, YValueBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yListBindingEClass, YListBinding.class, "YListBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYListBinding_TargetEndpoint(), this.getYListBindingEndpoint(), null, "targetEndpoint", null, 1, 1, YListBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYListBinding_ModelEndpoint(), this.getYListBindingEndpoint(), null, "modelEndpoint", null, 1, 1, YListBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(yBindingUpdateStrategyEEnum, YBindingUpdateStrategy.class, "YBindingUpdateStrategy");
		addEEnumLiteral(yBindingUpdateStrategyEEnum, YBindingUpdateStrategy.UPDATE);
		addEEnumLiteral(yBindingUpdateStrategyEEnum, YBindingUpdateStrategy.ON_REQUEST);
		addEEnumLiteral(yBindingUpdateStrategyEEnum, YBindingUpdateStrategy.NEVER);

		// Create resource
		createResource(eNS_URI);
	}

} //BindingPackageImpl
