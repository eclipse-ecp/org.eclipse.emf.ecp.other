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
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory
 * @model kind="package"
 * @generated
 */
public interface CoreModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/ecp/ecview/common/view";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreModelPackage eINSTANCE = org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YElement <em>YElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YElement
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYElement()
	 * @generated
	 */
	int YELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>YElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableImpl <em>YEmbeddable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddable()
	 * @generated
	 */
	int YEMBEDDABLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__CSS_CLASS = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__CSS_ID = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__INITIAL_VISIBLE = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__VISIBLE = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YEmbeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YLayoutImpl <em>YLayout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YLayoutImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYLayout()
	 * @generated
	 */
	int YLAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__ID = YEMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__CSS_CLASS = YEMBEDDABLE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__CSS_ID = YEMBEDDABLE__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__INITIAL_VISIBLE = YEMBEDDABLE__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__VISIBLE = YEMBEDDABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__ELEMENTS = YEMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YLayout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT_FEATURE_COUNT = YEMBEDDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl <em>YField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYField()
	 * @generated
	 */
	int YFIELD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__ID = YEMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__CSS_CLASS = YEMBEDDABLE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__CSS_ID = YEMBEDDABLE__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__INITIAL_VISIBLE = YEMBEDDABLE__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__VISIBLE = YEMBEDDABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__INITIAL_EDITABLE = YEMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__EDITABLE = YEMBEDDABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__INITIAL_ENABLED = YEMBEDDABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__ENABLED = YEMBEDDABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD_FEATURE_COUNT = YEMBEDDABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl <em>YView</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYView()
	 * @generated
	 */
	int YVIEW = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__CSS_CLASS = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__CSS_ID = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__MARGIN = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__ROOT = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__VIEW_NAME = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__CONTENT = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__BINDING_SET = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>YView</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewSetImpl <em>YView Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewSetImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYViewSet()
	 * @generated
	 */
	int YVIEW_SET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET__ID = YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET__VIEWS = YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YView Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCssAble <em>YCss Able</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YCssAble
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYCssAble()
	 * @generated
	 */
	int YCSS_ABLE = 6;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCSS_ABLE__CSS_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCSS_ABLE__CSS_ID = 1;

	/**
	 * The number of structural features of the '<em>YCss Able</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCSS_ABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YMarginable <em>YMarginable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YMarginable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYMarginable()
	 * @generated
	 */
	int YMARGINABLE = 7;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMARGINABLE__MARGIN = 0;

	/**
	 * The number of structural features of the '<em>YMarginable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMARGINABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable <em>YSpacingable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYSpacingable()
	 * @generated
	 */
	int YSPACINGABLE = 8;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPACINGABLE__SPACING = 0;

	/**
	 * The number of structural features of the '<em>YSpacingable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPACINGABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YHeightable <em>YHeightable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YHeightable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYHeightable()
	 * @generated
	 */
	int YHEIGHTABLE = 9;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHEIGHTABLE__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Height Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHEIGHTABLE__HEIGHT_UNIT = 1;

	/**
	 * The number of structural features of the '<em>YHeightable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHEIGHTABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YWidthable <em>YWidthable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YWidthable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYWidthable()
	 * @generated
	 */
	int YWIDTHABLE = 10;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YWIDTHABLE__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Width Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YWIDTHABLE__WIDTH_UNIT = 1;

	/**
	 * The number of structural features of the '<em>YWidthable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YWIDTHABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable <em>YVisibleable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYVisibleable()
	 * @generated
	 */
	int YVISIBLEABLE = 11;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBLEABLE__INITIAL_VISIBLE = 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBLEABLE__VISIBLE = 1;

	/**
	 * The number of structural features of the '<em>YVisibleable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBLEABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEditable <em>YEditable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEditable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEditable()
	 * @generated
	 */
	int YEDITABLE = 12;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEDITABLE__INITIAL_EDITABLE = 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEDITABLE__EDITABLE = 1;

	/**
	 * The number of structural features of the '<em>YEditable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEDITABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEnable <em>YEnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEnable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEnable()
	 * @generated
	 */
	int YENABLE = 13;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENABLE__INITIAL_ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENABLE__ENABLED = 1;

	/**
	 * The number of structural features of the '<em>YEnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YActionImpl <em>YAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YActionImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYAction()
	 * @generated
	 */
	int YACTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__ID = YEMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__CSS_CLASS = YEMBEDDABLE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__CSS_ID = YEMBEDDABLE__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__INITIAL_VISIBLE = YEMBEDDABLE__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__VISIBLE = YEMBEDDABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__INITIAL_ENABLED = YEMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__ENABLED = YEMBEDDABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION_FEATURE_COUNT = YEMBEDDABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable <em>YValue Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYValueBindable()
	 * @generated
	 */
	int YVALUE_BINDABLE = 15;

	/**
	 * The feature id for the '<em><b>Value Bindable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDABLE__VALUE_BINDABLE_VALUE = 0;

	/**
	 * The number of structural features of the '<em>YValue Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable <em>YSelection Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYSelectionBindable()
	 * @generated
	 */
	int YSELECTION_BINDABLE = 16;

	/**
	 * The feature id for the '<em><b>Selection Bindable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSELECTION_BINDABLE__SELECTION_BINDABLE_VALUE = 0;

	/**
	 * The number of structural features of the '<em>YSelection Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSELECTION_BINDABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YUnit <em>YUnit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YUnit
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYUnit()
	 * @generated
	 */
	int YUNIT = 17;

	/**
	 * The meta object id for the '<em>YURI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYURI()
	 * @generated
	 */
	int YURI = 18;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YElement <em>YElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YElement</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YElement
	 * @generated
	 */
	EClass getYElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YElement#getId()
	 * @see #getYElement()
	 * @generated
	 */
	EAttribute getYElement_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YLayout <em>YLayout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YLayout</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YLayout
	 * @generated
	 */
	EClass getYLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ecview.common.model.core.YLayout#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YLayout#getElements()
	 * @see #getYLayout()
	 * @generated
	 */
	EReference getYLayout_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YField <em>YField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YField</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YField
	 * @generated
	 */
	EClass getYField();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView <em>YView</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YView</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YView
	 * @generated
	 */
	EClass getYView();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YView#getRoot()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_Root();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YView#getViewName()
	 * @see #getYView()
	 * @generated
	 */
	EAttribute getYView_ViewName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YView#getContent()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_Content();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getBindingSet <em>Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Set</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YView#getBindingSet()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_BindingSet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YViewSet <em>YView Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YView Set</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YViewSet
	 * @generated
	 */
	EClass getYViewSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ecview.common.model.core.YViewSet#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YViewSet#getViews()
	 * @see #getYViewSet()
	 * @generated
	 */
	EReference getYViewSet_Views();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable <em>YEmbeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable
	 * @generated
	 */
	EClass getYEmbeddable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCssAble <em>YCss Able</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCss Able</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YCssAble
	 * @generated
	 */
	EClass getYCssAble();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCssAble#getCssClass <em>Css Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Css Class</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YCssAble#getCssClass()
	 * @see #getYCssAble()
	 * @generated
	 */
	EAttribute getYCssAble_CssClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCssAble#getCssID <em>Css ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Css ID</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YCssAble#getCssID()
	 * @see #getYCssAble()
	 * @generated
	 */
	EAttribute getYCssAble_CssID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YMarginable <em>YMarginable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMarginable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YMarginable
	 * @generated
	 */
	EClass getYMarginable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YMarginable#isMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YMarginable#isMargin()
	 * @see #getYMarginable()
	 * @generated
	 */
	EAttribute getYMarginable_Margin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable <em>YSpacingable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSpacingable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable
	 * @generated
	 */
	EClass getYSpacingable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable#isSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable#isSpacing()
	 * @see #getYSpacingable()
	 * @generated
	 */
	EAttribute getYSpacingable_Spacing();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YHeightable <em>YHeightable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YHeightable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YHeightable
	 * @generated
	 */
	EClass getYHeightable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YHeightable#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YHeightable#getHeight()
	 * @see #getYHeightable()
	 * @generated
	 */
	EAttribute getYHeightable_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YHeightable#getHeightUnit <em>Height Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height Unit</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YHeightable#getHeightUnit()
	 * @see #getYHeightable()
	 * @generated
	 */
	EAttribute getYHeightable_HeightUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YWidthable <em>YWidthable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YWidthable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YWidthable
	 * @generated
	 */
	EClass getYWidthable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YWidthable#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YWidthable#getWidth()
	 * @see #getYWidthable()
	 * @generated
	 */
	EAttribute getYWidthable_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YWidthable#getWidthUnit <em>Width Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Unit</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YWidthable#getWidthUnit()
	 * @see #getYWidthable()
	 * @generated
	 */
	EAttribute getYWidthable_WidthUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable <em>YVisibleable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVisibleable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable
	 * @generated
	 */
	EClass getYVisibleable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable#isInitialVisible <em>Initial Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Visible</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable#isInitialVisible()
	 * @see #getYVisibleable()
	 * @generated
	 */
	EAttribute getYVisibleable_InitialVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable#isVisible()
	 * @see #getYVisibleable()
	 * @generated
	 */
	EAttribute getYVisibleable_Visible();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEditable <em>YEditable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEditable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEditable
	 * @generated
	 */
	EClass getYEditable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEditable#isInitialEditable <em>Initial Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Editable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEditable#isInitialEditable()
	 * @see #getYEditable()
	 * @generated
	 */
	EAttribute getYEditable_InitialEditable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEditable#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEditable#isEditable()
	 * @see #getYEditable()
	 * @generated
	 */
	EAttribute getYEditable_Editable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEnable <em>YEnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEnable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEnable
	 * @generated
	 */
	EClass getYEnable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEnable#isInitialEnabled <em>Initial Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Enabled</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEnable#isInitialEnabled()
	 * @see #getYEnable()
	 * @generated
	 */
	EAttribute getYEnable_InitialEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEnable#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEnable#isEnabled()
	 * @see #getYEnable()
	 * @generated
	 */
	EAttribute getYEnable_Enabled();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YAction <em>YAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YAction</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YAction
	 * @generated
	 */
	EClass getYAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable <em>YValue Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YValue Bindable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable
	 * @generated
	 */
	EClass getYValueBindable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueBindableValue <em>Value Bindable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Bindable Value</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueBindableValue()
	 * @see #getYValueBindable()
	 * @generated
	 */
	EReference getYValueBindable_ValueBindableValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable <em>YSelection Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSelection Bindable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable
	 * @generated
	 */
	EClass getYSelectionBindable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable#getSelectionBindableValue <em>Selection Bindable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection Bindable Value</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable#getSelectionBindableValue()
	 * @see #getYSelectionBindable()
	 * @generated
	 */
	EReference getYSelectionBindable_SelectionBindableValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.ecp.ecview.common.model.core.YUnit <em>YUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YUnit</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YUnit
	 * @generated
	 */
	EEnum getYUnit();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>YURI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YURI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getYURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreModelFactory getCoreModelFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YElement <em>YElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YElement
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYElement()
		 * @generated
		 */
		EClass YELEMENT = eINSTANCE.getYElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YELEMENT__ID = eINSTANCE.getYElement_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YLayoutImpl <em>YLayout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YLayoutImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYLayout()
		 * @generated
		 */
		EClass YLAYOUT = eINSTANCE.getYLayout();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLAYOUT__ELEMENTS = eINSTANCE.getYLayout_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl <em>YField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYField()
		 * @generated
		 */
		EClass YFIELD = eINSTANCE.getYField();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl <em>YView</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYView()
		 * @generated
		 */
		EClass YVIEW = eINSTANCE.getYView();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__ROOT = eINSTANCE.getYView_Root();

		/**
		 * The meta object literal for the '<em><b>View Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVIEW__VIEW_NAME = eINSTANCE.getYView_ViewName();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__CONTENT = eINSTANCE.getYView_Content();

		/**
		 * The meta object literal for the '<em><b>Binding Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__BINDING_SET = eINSTANCE.getYView_BindingSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewSetImpl <em>YView Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YViewSetImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYViewSet()
		 * @generated
		 */
		EClass YVIEW_SET = eINSTANCE.getYViewSet();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW_SET__VIEWS = eINSTANCE.getYViewSet_Views();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableImpl <em>YEmbeddable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddable()
		 * @generated
		 */
		EClass YEMBEDDABLE = eINSTANCE.getYEmbeddable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCssAble <em>YCss Able</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YCssAble
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYCssAble()
		 * @generated
		 */
		EClass YCSS_ABLE = eINSTANCE.getYCssAble();

		/**
		 * The meta object literal for the '<em><b>Css Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCSS_ABLE__CSS_CLASS = eINSTANCE.getYCssAble_CssClass();

		/**
		 * The meta object literal for the '<em><b>Css ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCSS_ABLE__CSS_ID = eINSTANCE.getYCssAble_CssID();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YMarginable <em>YMarginable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YMarginable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYMarginable()
		 * @generated
		 */
		EClass YMARGINABLE = eINSTANCE.getYMarginable();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMARGINABLE__MARGIN = eINSTANCE.getYMarginable_Margin();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable <em>YSpacingable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYSpacingable()
		 * @generated
		 */
		EClass YSPACINGABLE = eINSTANCE.getYSpacingable();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSPACINGABLE__SPACING = eINSTANCE.getYSpacingable_Spacing();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YHeightable <em>YHeightable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YHeightable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYHeightable()
		 * @generated
		 */
		EClass YHEIGHTABLE = eINSTANCE.getYHeightable();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YHEIGHTABLE__HEIGHT = eINSTANCE.getYHeightable_Height();

		/**
		 * The meta object literal for the '<em><b>Height Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YHEIGHTABLE__HEIGHT_UNIT = eINSTANCE.getYHeightable_HeightUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YWidthable <em>YWidthable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YWidthable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYWidthable()
		 * @generated
		 */
		EClass YWIDTHABLE = eINSTANCE.getYWidthable();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YWIDTHABLE__WIDTH = eINSTANCE.getYWidthable_Width();

		/**
		 * The meta object literal for the '<em><b>Width Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YWIDTHABLE__WIDTH_UNIT = eINSTANCE.getYWidthable_WidthUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable <em>YVisibleable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYVisibleable()
		 * @generated
		 */
		EClass YVISIBLEABLE = eINSTANCE.getYVisibleable();

		/**
		 * The meta object literal for the '<em><b>Initial Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBLEABLE__INITIAL_VISIBLE = eINSTANCE.getYVisibleable_InitialVisible();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVISIBLEABLE__VISIBLE = eINSTANCE.getYVisibleable_Visible();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEditable <em>YEditable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEditable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEditable()
		 * @generated
		 */
		EClass YEDITABLE = eINSTANCE.getYEditable();

		/**
		 * The meta object literal for the '<em><b>Initial Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEDITABLE__INITIAL_EDITABLE = eINSTANCE.getYEditable_InitialEditable();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEDITABLE__EDITABLE = eINSTANCE.getYEditable_Editable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEnable <em>YEnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEnable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEnable()
		 * @generated
		 */
		EClass YENABLE = eINSTANCE.getYEnable();

		/**
		 * The meta object literal for the '<em><b>Initial Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YENABLE__INITIAL_ENABLED = eINSTANCE.getYEnable_InitialEnabled();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YENABLE__ENABLED = eINSTANCE.getYEnable_Enabled();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YActionImpl <em>YAction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YActionImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYAction()
		 * @generated
		 */
		EClass YACTION = eINSTANCE.getYAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable <em>YValue Bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYValueBindable()
		 * @generated
		 */
		EClass YVALUE_BINDABLE = eINSTANCE.getYValueBindable();

		/**
		 * The meta object literal for the '<em><b>Value Bindable Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVALUE_BINDABLE__VALUE_BINDABLE_VALUE = eINSTANCE.getYValueBindable_ValueBindableValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable <em>YSelection Bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYSelectionBindable()
		 * @generated
		 */
		EClass YSELECTION_BINDABLE = eINSTANCE.getYSelectionBindable();

		/**
		 * The meta object literal for the '<em><b>Selection Bindable Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSELECTION_BINDABLE__SELECTION_BINDABLE_VALUE = eINSTANCE.getYSelectionBindable_SelectionBindableValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YUnit <em>YUnit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YUnit
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYUnit()
		 * @generated
		 */
		EEnum YUNIT = eINSTANCE.getYUnit();

		/**
		 * The meta object literal for the '<em>YURI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYURI()
		 * @generated
		 */
		EDataType YURI = eINSTANCE.getYURI();

	}

} //UiModelPackage
