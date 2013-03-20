/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.model.core.impl;

import java.net.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YAction;
import org.eclipse.emf.ecp.ecview.common.model.core.YContextBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YHeightable;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable;
import org.eclipse.emf.ecp.ecview.common.model.core.YUnit;
import org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;
import org.eclipse.emf.ecp.ecview.common.model.core.YWidthable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreModelPackageImpl extends EPackageImpl implements CoreModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yViewSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEmbeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCssAbleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yMarginableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySpacingableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yHeightableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yWidthableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVisibleableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEditableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yValueBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySelectionBindableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yContextBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEmbeddableBindingEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEmbeddableValueEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yEmbeddableSelectionEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yuriEDataType = null;

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
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoreModelPackageImpl() {
		super(eNS_URI, CoreModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CoreModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoreModelPackage init() {
		if (isInited) return (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);

		// Obtain or create and register package
		CoreModelPackageImpl theCoreModelPackage = (CoreModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CoreModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CoreModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BindingPackageImpl theBindingPackage = (BindingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI) instanceof BindingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI) : BindingPackage.eINSTANCE);

		// Create package meta-data objects
		theCoreModelPackage.createPackageContents();
		theBindingPackage.createPackageContents();

		// Initialize created meta-data
		theCoreModelPackage.initializePackageContents();
		theBindingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCoreModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoreModelPackage.eNS_URI, theCoreModelPackage);
		return theCoreModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYElement() {
		return yElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYElement_Id() {
		return (EAttribute)yElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYLayout() {
		return yLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLayout_Elements() {
		return (EReference)yLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYField() {
		return yFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYView() {
		return yViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYView_Root() {
		return (EReference)yViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYView_ViewName() {
		return (EAttribute)yViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYView_Content() {
		return (EReference)yViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYView_BindingSet() {
		return (EReference)yViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYViewSet() {
		return yViewSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYViewSet_Views() {
		return (EReference)yViewSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEmbeddable() {
		return yEmbeddableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCssAble() {
		return yCssAbleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCssAble_CssClass() {
		return (EAttribute)yCssAbleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCssAble_CssID() {
		return (EAttribute)yCssAbleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYMarginable() {
		return yMarginableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYMarginable_Margin() {
		return (EAttribute)yMarginableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSpacingable() {
		return ySpacingableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSpacingable_Spacing() {
		return (EAttribute)ySpacingableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYHeightable() {
		return yHeightableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYHeightable_Height() {
		return (EAttribute)yHeightableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYHeightable_HeightUnit() {
		return (EAttribute)yHeightableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYWidthable() {
		return yWidthableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYWidthable_Width() {
		return (EAttribute)yWidthableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYWidthable_WidthUnit() {
		return (EAttribute)yWidthableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVisibleable() {
		return yVisibleableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibleable_InitialVisible() {
		return (EAttribute)yVisibleableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVisibleable_Visible() {
		return (EAttribute)yVisibleableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEditable() {
		return yEditableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEditable_InitialEditable() {
		return (EAttribute)yEditableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEditable_Editable() {
		return (EAttribute)yEditableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEnable() {
		return yEnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnable_InitialEnabled() {
		return (EAttribute)yEnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYEnable_Enabled() {
		return (EAttribute)yEnableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYAction() {
		return yActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYValueBindable() {
		return yValueBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSelectionBindable() {
		return ySelectionBindableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYContextBindingEndpoint() {
		return yContextBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYContextBindingEndpoint_UrlString() {
		return (EAttribute)yContextBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEmbeddableBindingEndpoint() {
		return yEmbeddableBindingEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYEmbeddableBindingEndpoint_Element() {
		return (EReference)yEmbeddableBindingEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEmbeddableValueEndpoint() {
		return yEmbeddableValueEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYEmbeddableSelectionEndpoint() {
		return yEmbeddableSelectionEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYUnit() {
		return yUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYURI() {
		return yuriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModelFactory getCoreModelFactory() {
		return (CoreModelFactory)getEFactoryInstance();
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
		yElementEClass = createEClass(YELEMENT);
		createEAttribute(yElementEClass, YELEMENT__ID);

		yLayoutEClass = createEClass(YLAYOUT);
		createEReference(yLayoutEClass, YLAYOUT__ELEMENTS);

		yFieldEClass = createEClass(YFIELD);

		yViewEClass = createEClass(YVIEW);
		createEReference(yViewEClass, YVIEW__ROOT);
		createEAttribute(yViewEClass, YVIEW__VIEW_NAME);
		createEReference(yViewEClass, YVIEW__CONTENT);
		createEReference(yViewEClass, YVIEW__BINDING_SET);

		yViewSetEClass = createEClass(YVIEW_SET);
		createEReference(yViewSetEClass, YVIEW_SET__VIEWS);

		yEmbeddableEClass = createEClass(YEMBEDDABLE);

		yCssAbleEClass = createEClass(YCSS_ABLE);
		createEAttribute(yCssAbleEClass, YCSS_ABLE__CSS_CLASS);
		createEAttribute(yCssAbleEClass, YCSS_ABLE__CSS_ID);

		yMarginableEClass = createEClass(YMARGINABLE);
		createEAttribute(yMarginableEClass, YMARGINABLE__MARGIN);

		ySpacingableEClass = createEClass(YSPACINGABLE);
		createEAttribute(ySpacingableEClass, YSPACINGABLE__SPACING);

		yHeightableEClass = createEClass(YHEIGHTABLE);
		createEAttribute(yHeightableEClass, YHEIGHTABLE__HEIGHT);
		createEAttribute(yHeightableEClass, YHEIGHTABLE__HEIGHT_UNIT);

		yWidthableEClass = createEClass(YWIDTHABLE);
		createEAttribute(yWidthableEClass, YWIDTHABLE__WIDTH);
		createEAttribute(yWidthableEClass, YWIDTHABLE__WIDTH_UNIT);

		yVisibleableEClass = createEClass(YVISIBLEABLE);
		createEAttribute(yVisibleableEClass, YVISIBLEABLE__INITIAL_VISIBLE);
		createEAttribute(yVisibleableEClass, YVISIBLEABLE__VISIBLE);

		yEditableEClass = createEClass(YEDITABLE);
		createEAttribute(yEditableEClass, YEDITABLE__INITIAL_EDITABLE);
		createEAttribute(yEditableEClass, YEDITABLE__EDITABLE);

		yEnableEClass = createEClass(YENABLE);
		createEAttribute(yEnableEClass, YENABLE__INITIAL_ENABLED);
		createEAttribute(yEnableEClass, YENABLE__ENABLED);

		yActionEClass = createEClass(YACTION);

		yValueBindableEClass = createEClass(YVALUE_BINDABLE);

		ySelectionBindableEClass = createEClass(YSELECTION_BINDABLE);

		yContextBindingEndpointEClass = createEClass(YCONTEXT_BINDING_ENDPOINT);
		createEAttribute(yContextBindingEndpointEClass, YCONTEXT_BINDING_ENDPOINT__URL_STRING);

		yEmbeddableBindingEndpointEClass = createEClass(YEMBEDDABLE_BINDING_ENDPOINT);
		createEReference(yEmbeddableBindingEndpointEClass, YEMBEDDABLE_BINDING_ENDPOINT__ELEMENT);

		yEmbeddableValueEndpointEClass = createEClass(YEMBEDDABLE_VALUE_ENDPOINT);

		yEmbeddableSelectionEndpointEClass = createEClass(YEMBEDDABLE_SELECTION_ENDPOINT);

		// Create enums
		yUnitEEnum = createEEnum(YUNIT);

		// Create data types
		yuriEDataType = createEDataType(YURI);
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
		BindingPackage theBindingPackage = (BindingPackage)EPackage.Registry.INSTANCE.getEPackage(BindingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yLayoutEClass.getESuperTypes().add(this.getYEmbeddable());
		yFieldEClass.getESuperTypes().add(this.getYEmbeddable());
		yFieldEClass.getESuperTypes().add(this.getYEditable());
		yFieldEClass.getESuperTypes().add(this.getYEnable());
		yViewEClass.getESuperTypes().add(this.getYElement());
		yViewEClass.getESuperTypes().add(this.getYCssAble());
		yViewEClass.getESuperTypes().add(this.getYMarginable());
		yViewSetEClass.getESuperTypes().add(this.getYElement());
		yEmbeddableEClass.getESuperTypes().add(this.getYElement());
		yEmbeddableEClass.getESuperTypes().add(this.getYCssAble());
		yEmbeddableEClass.getESuperTypes().add(this.getYVisibleable());
		yActionEClass.getESuperTypes().add(this.getYEmbeddable());
		yActionEClass.getESuperTypes().add(this.getYEnable());
		yContextBindingEndpointEClass.getESuperTypes().add(theBindingPackage.getYBindingEndpoint());
		yEmbeddableBindingEndpointEClass.getESuperTypes().add(theBindingPackage.getYBindingEndpoint());
		yEmbeddableValueEndpointEClass.getESuperTypes().add(this.getYEmbeddableBindingEndpoint());
		yEmbeddableSelectionEndpointEClass.getESuperTypes().add(this.getYEmbeddableBindingEndpoint());

		// Initialize classes and features; add operations and parameters
		initEClass(yElementEClass, YElement.class, "YElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, YElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yLayoutEClass, YLayout.class, "YLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYLayout_Elements(), this.getYEmbeddable(), null, "elements", null, 0, -1, YLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yFieldEClass, YField.class, "YField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yViewEClass, YView.class, "YView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYView_Root(), this.getYViewSet(), this.getYViewSet_Views(), "root", null, 1, 1, YView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYView_ViewName(), ecorePackage.getEString(), "viewName", null, 0, 1, YView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYView_Content(), this.getYEmbeddable(), null, "content", null, 0, 1, YView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYView_BindingSet(), theBindingPackage.getYBindingSet(), null, "bindingSet", null, 0, 1, YView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yViewEClass, theBindingPackage.getYBindingSet(), "getOrCreateBindingSet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yViewSetEClass, YViewSet.class, "YViewSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYViewSet_Views(), this.getYView(), this.getYView_Root(), "views", null, 0, -1, YViewSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEmbeddableEClass, YEmbeddable.class, "YEmbeddable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(yEmbeddableEClass, this.getYLayout(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(yEmbeddableEClass, this.getYView(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yCssAbleEClass, YCssAble.class, "YCssAble", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYCssAble_CssClass(), ecorePackage.getEString(), "cssClass", null, 0, 1, YCssAble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYCssAble_CssID(), ecorePackage.getEString(), "cssID", null, 0, 1, YCssAble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yMarginableEClass, YMarginable.class, "YMarginable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYMarginable_Margin(), ecorePackage.getEBoolean(), "margin", null, 0, 1, YMarginable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ySpacingableEClass, YSpacingable.class, "YSpacingable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYSpacingable_Spacing(), ecorePackage.getEBoolean(), "spacing", null, 0, 1, YSpacingable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yHeightableEClass, YHeightable.class, "YHeightable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYHeightable_Height(), ecorePackage.getEInt(), "height", null, 0, 1, YHeightable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYHeightable_HeightUnit(), this.getYUnit(), "heightUnit", null, 0, 1, YHeightable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yWidthableEClass, YWidthable.class, "YWidthable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYWidthable_Width(), ecorePackage.getEInt(), "width", null, 0, 1, YWidthable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYWidthable_WidthUnit(), this.getYUnit(), "widthUnit", null, 0, 1, YWidthable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yVisibleableEClass, YVisibleable.class, "YVisibleable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYVisibleable_InitialVisible(), ecorePackage.getEBoolean(), "initialVisible", "true", 0, 1, YVisibleable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVisibleable_Visible(), ecorePackage.getEBoolean(), "visible", null, 0, 1, YVisibleable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(yEditableEClass, YEditable.class, "YEditable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYEditable_InitialEditable(), ecorePackage.getEBoolean(), "initialEditable", "true", 0, 1, YEditable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEditable_Editable(), ecorePackage.getEBoolean(), "editable", null, 0, 1, YEditable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(yEnableEClass, YEnable.class, "YEnable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYEnable_InitialEnabled(), ecorePackage.getEBoolean(), "initialEnabled", "true", 0, 1, YEnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYEnable_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, YEnable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(yActionEClass, YAction.class, "YAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yValueBindableEClass, YValueBindable.class, "YValueBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(yValueBindableEClass, this.getYEmbeddableValueEndpoint(), "createValueEndpoint", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ySelectionBindableEClass, YSelectionBindable.class, "YSelectionBindable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yContextBindingEndpointEClass, YContextBindingEndpoint.class, "YContextBindingEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYContextBindingEndpoint_UrlString(), ecorePackage.getEString(), "urlString", null, 1, 1, YContextBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEmbeddableBindingEndpointEClass, YEmbeddableBindingEndpoint.class, "YEmbeddableBindingEndpoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYEmbeddableBindingEndpoint_Element(), this.getYEmbeddable(), null, "element", null, 1, 1, YEmbeddableBindingEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yEmbeddableValueEndpointEClass, YEmbeddableValueEndpoint.class, "YEmbeddableValueEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yEmbeddableSelectionEndpointEClass, YEmbeddableSelectionEndpoint.class, "YEmbeddableSelectionEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(yUnitEEnum, YUnit.class, "YUnit");
		addEEnumLiteral(yUnitEEnum, YUnit.PIXEL);
		addEEnumLiteral(yUnitEEnum, YUnit.EM);

		// Initialize data types
		initEDataType(yuriEDataType, URI.class, "YURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //UiModelPackageImpl
