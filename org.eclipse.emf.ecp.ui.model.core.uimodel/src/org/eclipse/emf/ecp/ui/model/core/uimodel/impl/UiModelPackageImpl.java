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
package org.eclipse.emf.ecp.ui.model.core.uimodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiModelPackageImpl extends EPackageImpl implements UiModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiViewSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiEmbeddableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiCssAbleEClass = null;

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
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiModelPackageImpl() {
		super(eNS_URI, UiModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UiModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiModelPackage init() {
		if (isInited) return (UiModelPackage)EPackage.Registry.INSTANCE.getEPackage(UiModelPackage.eNS_URI);

		// Obtain or create and register package
		UiModelPackageImpl theUiModelPackage = (UiModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUiModelPackage.createPackageContents();

		// Initialize created meta-data
		theUiModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiModelPackage.eNS_URI, theUiModelPackage);
		return theUiModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiElement() {
		return yUiElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiElement_Id() {
		return (EAttribute)yUiElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiLayout() {
		return yUiLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiLayout_Elements() {
		return (EReference)yUiLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiField() {
		return yUiFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiView() {
		return yUiViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiView_ViewName() {
		return (EAttribute)yUiViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiView_Content() {
		return (EReference)yUiViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiViewSet() {
		return yUiViewSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiViewSet_Views() {
		return (EReference)yUiViewSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiView_Root() {
		return (EReference)yUiViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiEmbeddable() {
		return yUiEmbeddableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiCssAble() {
		return yUiCssAbleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiCssAble_CssClass() {
		return (EAttribute)yUiCssAbleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiCssAble_CssID() {
		return (EAttribute)yUiCssAbleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModelFactory getUiModelFactory() {
		return (UiModelFactory)getEFactoryInstance();
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
		yUiElementEClass = createEClass(YUI_ELEMENT);
		createEAttribute(yUiElementEClass, YUI_ELEMENT__ID);

		yUiLayoutEClass = createEClass(YUI_LAYOUT);
		createEReference(yUiLayoutEClass, YUI_LAYOUT__ELEMENTS);

		yUiFieldEClass = createEClass(YUI_FIELD);

		yUiViewEClass = createEClass(YUI_VIEW);
		createEReference(yUiViewEClass, YUI_VIEW__ROOT);
		createEAttribute(yUiViewEClass, YUI_VIEW__VIEW_NAME);
		createEReference(yUiViewEClass, YUI_VIEW__CONTENT);

		yUiViewSetEClass = createEClass(YUI_VIEW_SET);
		createEReference(yUiViewSetEClass, YUI_VIEW_SET__VIEWS);

		yUiEmbeddableEClass = createEClass(YUI_EMBEDDABLE);

		yUiCssAbleEClass = createEClass(YUI_CSS_ABLE);
		createEAttribute(yUiCssAbleEClass, YUI_CSS_ABLE__CSS_CLASS);
		createEAttribute(yUiCssAbleEClass, YUI_CSS_ABLE__CSS_ID);
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
		yUiLayoutEClass.getESuperTypes().add(this.getYUiEmbeddable());
		yUiFieldEClass.getESuperTypes().add(this.getYUiEmbeddable());
		yUiViewEClass.getESuperTypes().add(this.getYUiElement());
		yUiViewSetEClass.getESuperTypes().add(this.getYUiElement());
		yUiEmbeddableEClass.getESuperTypes().add(this.getYUiElement());
		yUiEmbeddableEClass.getESuperTypes().add(this.getYUiCssAble());

		// Initialize classes and features; add operations and parameters
		initEClass(yUiElementEClass, YUiElement.class, "YUiElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYUiElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, YUiElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiLayoutEClass, YUiLayout.class, "YUiLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiLayout_Elements(), this.getYUiEmbeddable(), null, "elements", null, 0, -1, YUiLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiFieldEClass, YUiField.class, "YUiField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yUiViewEClass, YUiView.class, "YUiView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiView_Root(), this.getYUiViewSet(), this.getYUiViewSet_Views(), "root", null, 1, 1, YUiView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiView_ViewName(), ecorePackage.getEString(), "viewName", null, 0, 1, YUiView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYUiView_Content(), this.getYUiEmbeddable(), null, "content", null, 0, 1, YUiView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiViewSetEClass, YUiViewSet.class, "YUiViewSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiViewSet_Views(), this.getYUiView(), this.getYUiView_Root(), "views", null, 0, -1, YUiViewSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiEmbeddableEClass, YUiEmbeddable.class, "YUiEmbeddable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(yUiEmbeddableEClass, this.getYUiLayout(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(yUiEmbeddableEClass, this.getYUiView(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yUiCssAbleEClass, YUiCssAble.class, "YUiCssAble", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYUiCssAble_CssClass(), ecorePackage.getEString(), "cssClass", null, 0, 1, YUiCssAble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiCssAble_CssID(), ecorePackage.getEString(), "cssID", null, 0, 1, YUiCssAble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UiModelPackageImpl
