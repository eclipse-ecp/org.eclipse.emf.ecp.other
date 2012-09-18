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
package org.eclipse.emf.ecp.ui.model.core.uimodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory
 * @model kind="package"
 * @generated
 */
public interface UiModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uimodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfclient/uimodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uimodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiModelPackage eINSTANCE = org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement <em>YUi Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiElement()
	 * @generated
	 */
	int YUI_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>YUi Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiEmbeddableImpl <em>YUi Embeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiEmbeddableImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiEmbeddable()
	 * @generated
	 */
	int YUI_EMBEDDABLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_EMBEDDABLE__ID = YUI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_EMBEDDABLE__CSS_CLASS = YUI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_EMBEDDABLE__CSS_ID = YUI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YUi Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_EMBEDDABLE_FEATURE_COUNT = YUI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiLayoutImpl <em>YUi Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiLayoutImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiLayout()
	 * @generated
	 */
	int YUI_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LAYOUT__ID = YUI_EMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LAYOUT__CSS_CLASS = YUI_EMBEDDABLE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LAYOUT__CSS_ID = YUI_EMBEDDABLE__CSS_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LAYOUT__ELEMENTS = YUI_EMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YUi Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LAYOUT_FEATURE_COUNT = YUI_EMBEDDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiFieldImpl <em>YUi Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiFieldImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiField()
	 * @generated
	 */
	int YUI_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_FIELD__ID = YUI_EMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_FIELD__CSS_CLASS = YUI_EMBEDDABLE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_FIELD__CSS_ID = YUI_EMBEDDABLE__CSS_ID;

	/**
	 * The number of structural features of the '<em>YUi Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_FIELD_FEATURE_COUNT = YUI_EMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewImpl <em>YUi View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiView()
	 * @generated
	 */
	int YUI_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW__ID = YUI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW__CSS_CLASS = YUI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW__CSS_ID = YUI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW__ROOT = YUI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW__VIEW_NAME = YUI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW__CONTENT = YUI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW__MARGIN = YUI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>YUi View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW_FEATURE_COUNT = YUI_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewSetImpl <em>YUi View Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewSetImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiViewSet()
	 * @generated
	 */
	int YUI_VIEW_SET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW_SET__ID = YUI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW_SET__VIEWS = YUI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YUi View Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW_SET_FEATURE_COUNT = YUI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble <em>YUi Css Able</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiCssAble()
	 * @generated
	 */
	int YUI_CSS_ABLE = 6;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CSS_ABLE__CSS_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CSS_ABLE__CSS_ID = 1;

	/**
	 * The number of structural features of the '<em>YUi Css Able</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CSS_ABLE_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement <em>YUi Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Element</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement
	 * @generated
	 */
	EClass getYUiElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement#getId()
	 * @see #getYUiElement()
	 * @generated
	 */
	EAttribute getYUiElement_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout <em>YUi Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Layout</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout
	 * @generated
	 */
	EClass getYUiLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout#getElements()
	 * @see #getYUiLayout()
	 * @generated
	 */
	EReference getYUiLayout_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField <em>YUi Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Field</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField
	 * @generated
	 */
	EClass getYUiField();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView <em>YUi View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi View</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView
	 * @generated
	 */
	EClass getYUiView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getViewName()
	 * @see #getYUiView()
	 * @generated
	 */
	EAttribute getYUiView_ViewName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getContent()
	 * @see #getYUiView()
	 * @generated
	 */
	EReference getYUiView_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#isMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#isMargin()
	 * @see #getYUiView()
	 * @generated
	 */
	EAttribute getYUiView_Margin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet <em>YUi View Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi View Set</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet
	 * @generated
	 */
	EClass getYUiViewSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet#getViews()
	 * @see #getYUiViewSet()
	 * @generated
	 */
	EReference getYUiViewSet_Views();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView#getRoot()
	 * @see #getYUiView()
	 * @generated
	 */
	EReference getYUiView_Root();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable <em>YUi Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Embeddable</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable
	 * @generated
	 */
	EClass getYUiEmbeddable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble <em>YUi Css Able</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Css Able</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble
	 * @generated
	 */
	EClass getYUiCssAble();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssClass <em>Css Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Css Class</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssClass()
	 * @see #getYUiCssAble()
	 * @generated
	 */
	EAttribute getYUiCssAble_CssClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssID <em>Css ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Css ID</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssID()
	 * @see #getYUiCssAble()
	 * @generated
	 */
	EAttribute getYUiCssAble_CssID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiModelFactory getUiModelFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement <em>YUi Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiElement()
		 * @generated
		 */
		EClass YUI_ELEMENT = eINSTANCE.getYUiElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_ELEMENT__ID = eINSTANCE.getYUiElement_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiLayoutImpl <em>YUi Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiLayoutImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiLayout()
		 * @generated
		 */
		EClass YUI_LAYOUT = eINSTANCE.getYUiLayout();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_LAYOUT__ELEMENTS = eINSTANCE.getYUiLayout_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiFieldImpl <em>YUi Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiFieldImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiField()
		 * @generated
		 */
		EClass YUI_FIELD = eINSTANCE.getYUiField();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewImpl <em>YUi View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiView()
		 * @generated
		 */
		EClass YUI_VIEW = eINSTANCE.getYUiView();

		/**
		 * The meta object literal for the '<em><b>View Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_VIEW__VIEW_NAME = eINSTANCE.getYUiView_ViewName();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_VIEW__CONTENT = eINSTANCE.getYUiView_Content();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_VIEW__MARGIN = eINSTANCE.getYUiView_Margin();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewSetImpl <em>YUi View Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiViewSetImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiViewSet()
		 * @generated
		 */
		EClass YUI_VIEW_SET = eINSTANCE.getYUiViewSet();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_VIEW_SET__VIEWS = eINSTANCE.getYUiViewSet_Views();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_VIEW__ROOT = eINSTANCE.getYUiView_Root();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiEmbeddableImpl <em>YUi Embeddable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiEmbeddableImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiEmbeddable()
		 * @generated
		 */
		EClass YUI_EMBEDDABLE = eINSTANCE.getYUiEmbeddable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble <em>YUi Css Able</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.impl.UiModelPackageImpl#getYUiCssAble()
		 * @generated
		 */
		EClass YUI_CSS_ABLE = eINSTANCE.getYUiCssAble();

		/**
		 * The meta object literal for the '<em><b>Css Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_CSS_ABLE__CSS_CLASS = eINSTANCE.getYUiCssAble_CssClass();

		/**
		 * The meta object literal for the '<em><b>Css ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_CSS_ABLE__CSS_ID = eINSTANCE.getYUiCssAble_CssID();

	}

} //UiModelPackage
