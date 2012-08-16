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
package org.eclipse.emf.ecp.ui.model.uimodel;

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
 * @see org.eclipse.emf.ecp.ui.model.uimodel.UiModelFactory
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
	UiModelPackage eINSTANCE = org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiElement <em>YUi Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiElement
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiElement()
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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiEmbeddableImpl <em>YUi Embeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiEmbeddableImpl
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiEmbeddable()
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
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_EMBEDDABLE__PARENT = YUI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YUi Embeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_EMBEDDABLE_FEATURE_COUNT = YUI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiLayoutImpl <em>YUi Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiLayoutImpl
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiLayout()
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
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LAYOUT__PARENT = YUI_EMBEDDABLE__PARENT;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiFieldImpl <em>YUi Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiFieldImpl
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiField()
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
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_FIELD__PARENT = YUI_EMBEDDABLE__PARENT;

	/**
	 * The number of structural features of the '<em>YUi Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_FIELD_FEATURE_COUNT = YUI_EMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiViewImpl <em>YUi View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiViewImpl
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiView()
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
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW__PARENT = YUI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW__ELEMENTS = YUI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW__VIEW_NAME = YUI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YUi View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VIEW_FEATURE_COUNT = YUI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiRootImpl <em>YUi Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiRootImpl
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiRoot()
	 * @generated
	 */
	int YUI_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_ROOT__ID = YUI_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_ROOT__VIEWS = YUI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YUi Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_ROOT_FEATURE_COUNT = YUI_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiElement <em>YUi Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Element</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiElement
	 * @generated
	 */
	EClass getYUiElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiElement#getId()
	 * @see #getYUiElement()
	 * @generated
	 */
	EAttribute getYUiElement_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout <em>YUi Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Layout</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout
	 * @generated
	 */
	EClass getYUiLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout#getElements()
	 * @see #getYUiLayout()
	 * @generated
	 */
	EReference getYUiLayout_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiField <em>YUi Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Field</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiField
	 * @generated
	 */
	EClass getYUiField();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiView <em>YUi View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi View</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiView
	 * @generated
	 */
	EClass getYUiView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiView#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiView#getViewName()
	 * @see #getYUiView()
	 * @generated
	 */
	EAttribute getYUiView_ViewName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiRoot <em>YUi Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Root</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiRoot
	 * @generated
	 */
	EClass getYUiRoot();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiRoot#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Views</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiRoot#getViews()
	 * @see #getYUiRoot()
	 * @generated
	 */
	EReference getYUiRoot_Views();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiEmbeddable <em>YUi Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Embeddable</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiEmbeddable
	 * @generated
	 */
	EClass getYUiEmbeddable();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiEmbeddable#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiEmbeddable#getParent()
	 * @see #getYUiEmbeddable()
	 * @generated
	 */
	EReference getYUiEmbeddable_Parent();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiElement <em>YUi Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiElement
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiElement()
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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiLayoutImpl <em>YUi Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiLayoutImpl
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiLayout()
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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiFieldImpl <em>YUi Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiFieldImpl
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiField()
		 * @generated
		 */
		EClass YUI_FIELD = eINSTANCE.getYUiField();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiViewImpl <em>YUi View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiViewImpl
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiView()
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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiRootImpl <em>YUi Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiRootImpl
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiRoot()
		 * @generated
		 */
		EClass YUI_ROOT = eINSTANCE.getYUiRoot();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_ROOT__VIEWS = eINSTANCE.getYUiRoot_Views();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiEmbeddableImpl <em>YUi Embeddable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.YUiEmbeddableImpl
		 * @see org.eclipse.emf.ecp.ui.model.uimodel.impl.UiModelPackageImpl#getYUiEmbeddable()
		 * @generated
		 */
		EClass YUI_EMBEDDABLE = eINSTANCE.getYUiEmbeddable();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_EMBEDDABLE__PARENT = eINSTANCE.getYUiEmbeddable_Parent();

	}

} //UiModelPackage
