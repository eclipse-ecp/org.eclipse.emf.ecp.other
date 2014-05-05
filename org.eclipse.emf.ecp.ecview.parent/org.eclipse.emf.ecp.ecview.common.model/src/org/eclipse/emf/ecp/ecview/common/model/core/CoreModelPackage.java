/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
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
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage;

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
	int YEMBEDDABLE = 6;

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
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE__VISIBILITY_PROCESSOR = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>YEmbeddable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLAYOUT__VISIBILITY_PROCESSOR = YEMBEDDABLE__VISIBILITY_PROCESSOR;

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
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__VISIBILITY_PROCESSOR = YEMBEDDABLE__VISIBILITY_PROCESSOR;

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
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD__VALIDATORS = YEMBEDDABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>YField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFIELD_FEATURE_COUNT = YEMBEDDABLE_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__VISIBILITY_PROCESSOR = YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__ROOT = YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__VIEW_NAME = YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__CONTENT = YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__BINDING_SET = YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW__BEAN_SLOTS = YELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>YView</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 9;

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
	 * The feature id for the '<em><b>Bean Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET__BEAN_SLOTS = YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YView Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVIEW_SET_FEATURE_COUNT = YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YBeanSlotImpl <em>YBean Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YBeanSlotImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYBeanSlot()
	 * @generated
	 */
	int YBEAN_SLOT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT__VALUE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>YBean Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCssAble <em>YCss Able</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YCssAble
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYCssAble()
	 * @generated
	 */
	int YCSS_ABLE = 7;

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
	int YMARGINABLE = 8;

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
	int YSPACINGABLE = 9;

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
	int YHEIGHTABLE = 10;

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
	int YWIDTHABLE = 11;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivateable <em>YActivateable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YActivateable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYActivateable()
	 * @generated
	 */
	int YACTIVATEABLE = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable <em>YVisibleable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYVisibleable()
	 * @generated
	 */
	int YVISIBLEABLE = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEditable <em>YEditable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEditable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEditable()
	 * @generated
	 */
	int YEDITABLE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEnable <em>YEnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEnable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEnable()
	 * @generated
	 */
	int YENABLE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YActionImpl <em>YAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YActionImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYAction()
	 * @generated
	 */
	int YACTION = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBindable <em>YBindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YBindable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYBindable()
	 * @generated
	 */
	int YBINDABLE = 17;

	/**
	 * The number of structural features of the '<em>YBindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDABLE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Initial Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATEABLE__INITIAL_ACTIVATED = YBINDABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATEABLE__ACTIVATED = YBINDABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YActivateable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATEABLE_FEATURE_COUNT = YBINDABLE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTION__VISIBILITY_PROCESSOR = YEMBEDDABLE__VISIBILITY_PROCESSOR;

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
	int YVALUE_BINDABLE = 18;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT = YBINDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YValue Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDABLE_FEATURE_COUNT = YBINDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable <em>YSelection Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYSelectionBindable()
	 * @generated
	 */
	int YSELECTION_BINDABLE = 19;

	/**
	 * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT = YBINDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YSelection Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSELECTION_BINDABLE_FEATURE_COUNT = YBINDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable <em>YMulti Selection Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYMultiSelectionBindable()
	 * @generated
	 */
	int YMULTI_SELECTION_BINDABLE = 20;

	/**
	 * The feature id for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMULTI_SELECTION_BINDABLE__MULTI_SELECTION_BINDING_ENDPOINT = YBINDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YMulti Selection Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMULTI_SELECTION_BINDABLE_FEATURE_COUNT = YBINDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable <em>YCollection Bindable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYCollectionBindable()
	 * @generated
	 */
	int YCOLLECTION_BINDABLE = 21;

	/**
	 * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLLECTION_BINDABLE__COLLECTION_BINDING_ENDPOINT = YBINDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YCollection Bindable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLLECTION_BINDABLE_FEATURE_COUNT = YBINDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YContextBindingEndpointImpl <em>YContext Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YContextBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYContextBindingEndpoint()
	 * @generated
	 */
	int YCONTEXT_BINDING_ENDPOINT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_BINDING_ENDPOINT__ID = BindingPackage.YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Url String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_BINDING_ENDPOINT__URL_STRING = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YContext Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_BINDING_ENDPOINT_FEATURE_COUNT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YBeanSlotBindingEndpointImpl <em>YBean Slot Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YBeanSlotBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYBeanSlotBindingEndpoint()
	 * @generated
	 */
	int YBEAN_SLOT_BINDING_ENDPOINT = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_BINDING_ENDPOINT__ID = BindingPackage.YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Attribute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_BINDING_ENDPOINT__ATTRIBUTE_PATH = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bean Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_BINDING_ENDPOINT__BEAN_SLOT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YBean Slot Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_SLOT_BINDING_ENDPOINT_FEATURE_COUNT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint <em>YEmbeddable Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableBindingEndpoint()
	 * @generated
	 */
	int YEMBEDDABLE_BINDING_ENDPOINT = 24;

	/**
	 * The number of structural features of the '<em>YEmbeddable Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_BINDING_ENDPOINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableValueEndpointImpl <em>YEmbeddable Value Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableValueEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableValueEndpoint()
	 * @generated
	 */
	int YEMBEDDABLE_VALUE_ENDPOINT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_VALUE_ENDPOINT__ID = BindingPackage.YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YEmbeddable Value Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_VALUE_ENDPOINT_FEATURE_COUNT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableSelectionEndpointImpl <em>YEmbeddable Selection Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableSelectionEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableSelectionEndpoint()
	 * @generated
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT__ID = BindingPackage.YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YEmbeddable Selection Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_SELECTION_ENDPOINT_FEATURE_COUNT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableMultiSelectionEndpointImpl <em>YEmbeddable Multi Selection Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableMultiSelectionEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableMultiSelectionEndpoint()
	 * @generated
	 */
	int YEMBEDDABLE_MULTI_SELECTION_ENDPOINT = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__ID = BindingPackage.YLIST_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__ELEMENT = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YEmbeddable Multi Selection Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_MULTI_SELECTION_ENDPOINT_FEATURE_COUNT = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableCollectionEndpointImpl <em>YEmbeddable Collection Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableCollectionEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableCollectionEndpoint()
	 * @generated
	 */
	int YEMBEDDABLE_COLLECTION_ENDPOINT = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_COLLECTION_ENDPOINT__ID = BindingPackage.YLIST_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_COLLECTION_ENDPOINT__ELEMENT = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YEmbeddable Collection Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_COLLECTION_ENDPOINT_FEATURE_COUNT = BindingPackage.YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YActivatedEndpointImpl <em>YActivated Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YActivatedEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYActivatedEndpoint()
	 * @generated
	 */
	int YACTIVATED_ENDPOINT = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATED_ENDPOINT__ID = BindingPackage.YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATED_ENDPOINT__ELEMENT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YActivated Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YACTIVATED_ENDPOINT_FEATURE_COUNT = BindingPackage.YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDtWrapperImpl <em>YDt Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YDtWrapperImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYDtWrapper()
	 * @generated
	 */
	int YDT_WRAPPER = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The number of structural features of the '<em>YDt Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_WRAPPER_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable <em>YVisibility Processable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYVisibilityProcessable()
	 * @generated
	 */
	int YVISIBILITY_PROCESSABLE = 31;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSABLE__VISIBILITY_PROCESSOR = 0;

	/**
	 * The number of structural features of the '<em>YVisibility Processable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVISIBILITY_PROCESSABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YUnit <em>YUnit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YUnit
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYUnit()
	 * @generated
	 */
	int YUNIT = 32;

	/**
	 * The meta object id for the '<em>YURI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYURI()
	 * @generated
	 */
	int YURI = 33;


	/**
	 * The meta object id for the '<em>YValue Change Listener</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYValueChangeListener()
	 * @generated
	 */
	int YVALUE_CHANGE_LISTENER = 34;


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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ecview.common.model.core.YField#getValidators <em>Validators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validators</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YField#getValidators()
	 * @see #getYField()
	 * @generated
	 */
	EReference getYField_Validators();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ecview.common.model.core.YView#getBeanSlots <em>Bean Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean Slots</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YView#getBeanSlots()
	 * @see #getYView()
	 * @generated
	 */
	EReference getYView_BeanSlots();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ecview.common.model.core.YViewSet#getBeanSlots <em>Bean Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bean Slots</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YViewSet#getBeanSlots()
	 * @see #getYViewSet()
	 * @generated
	 */
	EReference getYViewSet_BeanSlots();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot <em>YBean Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBean Slot</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot
	 * @generated
	 */
	EClass getYBeanSlot();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot#getName()
	 * @see #getYBeanSlot()
	 * @generated
	 */
	EAttribute getYBeanSlot_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot#getValueType()
	 * @see #getYBeanSlot()
	 * @generated
	 */
	EAttribute getYBeanSlot_ValueType();

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
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivateable <em>YActivateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YActivateable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YActivateable
	 * @generated
	 */
	EClass getYActivateable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivateable#isInitialActivated <em>Initial Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Activated</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YActivateable#isInitialActivated()
	 * @see #getYActivateable()
	 * @generated
	 */
	EAttribute getYActivateable_InitialActivated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivateable#isActivated <em>Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activated</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YActivateable#isActivated()
	 * @see #getYActivateable()
	 * @generated
	 */
	EAttribute getYActivateable_Activated();

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
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBindable <em>YBindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBindable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YBindable
	 * @generated
	 */
	EClass getYBindable();

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
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueBindingEndpoint <em>Value Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueBindingEndpoint()
	 * @see #getYValueBindable()
	 * @generated
	 */
	EReference getYValueBindable_ValueBindingEndpoint();

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
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable#getSelectionBindingEndpoint <em>Selection Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable#getSelectionBindingEndpoint()
	 * @see #getYSelectionBindable()
	 * @generated
	 */
	EReference getYSelectionBindable_SelectionBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable <em>YMulti Selection Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMulti Selection Bindable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable
	 * @generated
	 */
	EClass getYMultiSelectionBindable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable#getMultiSelectionBindingEndpoint <em>Multi Selection Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Selection Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable#getMultiSelectionBindingEndpoint()
	 * @see #getYMultiSelectionBindable()
	 * @generated
	 */
	EReference getYMultiSelectionBindable_MultiSelectionBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable <em>YCollection Bindable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCollection Bindable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable
	 * @generated
	 */
	EClass getYCollectionBindable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable#getCollectionBindingEndpoint <em>Collection Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable#getCollectionBindingEndpoint()
	 * @see #getYCollectionBindable()
	 * @generated
	 */
	EReference getYCollectionBindable_CollectionBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YContextBindingEndpoint <em>YContext Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YContext Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YContextBindingEndpoint
	 * @generated
	 */
	EClass getYContextBindingEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YContextBindingEndpoint#getUrlString <em>Url String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url String</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YContextBindingEndpoint#getUrlString()
	 * @see #getYContextBindingEndpoint()
	 * @generated
	 */
	EAttribute getYContextBindingEndpoint_UrlString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotBindingEndpoint <em>YBean Slot Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBean Slot Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotBindingEndpoint
	 * @generated
	 */
	EClass getYBeanSlotBindingEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotBindingEndpoint#getAttributePath <em>Attribute Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Path</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotBindingEndpoint#getAttributePath()
	 * @see #getYBeanSlotBindingEndpoint()
	 * @generated
	 */
	EAttribute getYBeanSlotBindingEndpoint_AttributePath();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotBindingEndpoint#getBeanSlot <em>Bean Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bean Slot</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotBindingEndpoint#getBeanSlot()
	 * @see #getYBeanSlotBindingEndpoint()
	 * @generated
	 */
	EReference getYBeanSlotBindingEndpoint_BeanSlot();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint <em>YEmbeddable Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint
	 * @generated
	 */
	EClass getYEmbeddableBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint <em>YEmbeddable Value Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable Value Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint
	 * @generated
	 */
	EClass getYEmbeddableValueEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint#getElement()
	 * @see #getYEmbeddableValueEndpoint()
	 * @generated
	 */
	EReference getYEmbeddableValueEndpoint_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint <em>YEmbeddable Selection Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable Selection Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint
	 * @generated
	 */
	EClass getYEmbeddableSelectionEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint#getElement()
	 * @see #getYEmbeddableSelectionEndpoint()
	 * @generated
	 */
	EReference getYEmbeddableSelectionEndpoint_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableMultiSelectionEndpoint <em>YEmbeddable Multi Selection Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable Multi Selection Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableMultiSelectionEndpoint
	 * @generated
	 */
	EClass getYEmbeddableMultiSelectionEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableMultiSelectionEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableMultiSelectionEndpoint#getElement()
	 * @see #getYEmbeddableMultiSelectionEndpoint()
	 * @generated
	 */
	EReference getYEmbeddableMultiSelectionEndpoint_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableCollectionEndpoint <em>YEmbeddable Collection Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable Collection Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableCollectionEndpoint
	 * @generated
	 */
	EClass getYEmbeddableCollectionEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableCollectionEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableCollectionEndpoint#getElement()
	 * @see #getYEmbeddableCollectionEndpoint()
	 * @generated
	 */
	EReference getYEmbeddableCollectionEndpoint_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivatedEndpoint <em>YActivated Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YActivated Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YActivatedEndpoint
	 * @generated
	 */
	EClass getYActivatedEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivatedEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YActivatedEndpoint#getElement()
	 * @see #getYActivatedEndpoint()
	 * @generated
	 */
	EReference getYActivatedEndpoint_Element();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YDtWrapper <em>YDt Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDt Wrapper</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YDtWrapper
	 * @generated
	 */
	EClass getYDtWrapper();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable <em>YVisibility Processable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVisibility Processable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable
	 * @generated
	 */
	EClass getYVisibilityProcessable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable#getVisibilityProcessor <em>Visibility Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility Processor</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable#getVisibilityProcessor()
	 * @see #getYVisibilityProcessable()
	 * @generated
	 */
	EReference getYVisibilityProcessable_VisibilityProcessor();

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
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener <em>YValue Change Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YValue Change Listener</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener
	 * @model instanceClass="org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener"
	 * @generated
	 */
	EDataType getYValueChangeListener();

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
		 * The meta object literal for the '<em><b>Validators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YFIELD__VALIDATORS = eINSTANCE.getYField_Validators();

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
		 * The meta object literal for the '<em><b>Bean Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW__BEAN_SLOTS = eINSTANCE.getYView_BeanSlots();

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
		 * The meta object literal for the '<em><b>Bean Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVIEW_SET__BEAN_SLOTS = eINSTANCE.getYViewSet_BeanSlots();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YBeanSlotImpl <em>YBean Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YBeanSlotImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYBeanSlot()
		 * @generated
		 */
		EClass YBEAN_SLOT = eINSTANCE.getYBeanSlot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT__NAME = eINSTANCE.getYBeanSlot_Name();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT__VALUE_TYPE = eINSTANCE.getYBeanSlot_ValueType();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivateable <em>YActivateable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YActivateable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYActivateable()
		 * @generated
		 */
		EClass YACTIVATEABLE = eINSTANCE.getYActivateable();

		/**
		 * The meta object literal for the '<em><b>Initial Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YACTIVATEABLE__INITIAL_ACTIVATED = eINSTANCE.getYActivateable_InitialActivated();

		/**
		 * The meta object literal for the '<em><b>Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YACTIVATEABLE__ACTIVATED = eINSTANCE.getYActivateable_Activated();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBindable <em>YBindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YBindable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYBindable()
		 * @generated
		 */
		EClass YBINDABLE = eINSTANCE.getYBindable();

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
		 * The meta object literal for the '<em><b>Value Binding Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT = eINSTANCE.getYValueBindable_ValueBindingEndpoint();

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
		 * The meta object literal for the '<em><b>Selection Binding Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT = eINSTANCE.getYSelectionBindable_SelectionBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable <em>YMulti Selection Bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYMultiSelectionBindable()
		 * @generated
		 */
		EClass YMULTI_SELECTION_BINDABLE = eINSTANCE.getYMultiSelectionBindable();

		/**
		 * The meta object literal for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMULTI_SELECTION_BINDABLE__MULTI_SELECTION_BINDING_ENDPOINT = eINSTANCE.getYMultiSelectionBindable_MultiSelectionBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable <em>YCollection Bindable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYCollectionBindable()
		 * @generated
		 */
		EClass YCOLLECTION_BINDABLE = eINSTANCE.getYCollectionBindable();

		/**
		 * The meta object literal for the '<em><b>Collection Binding Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOLLECTION_BINDABLE__COLLECTION_BINDING_ENDPOINT = eINSTANCE.getYCollectionBindable_CollectionBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YContextBindingEndpointImpl <em>YContext Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YContextBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYContextBindingEndpoint()
		 * @generated
		 */
		EClass YCONTEXT_BINDING_ENDPOINT = eINSTANCE.getYContextBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Url String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCONTEXT_BINDING_ENDPOINT__URL_STRING = eINSTANCE.getYContextBindingEndpoint_UrlString();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YBeanSlotBindingEndpointImpl <em>YBean Slot Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YBeanSlotBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYBeanSlotBindingEndpoint()
		 * @generated
		 */
		EClass YBEAN_SLOT_BINDING_ENDPOINT = eINSTANCE.getYBeanSlotBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Attribute Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_SLOT_BINDING_ENDPOINT__ATTRIBUTE_PATH = eINSTANCE.getYBeanSlotBindingEndpoint_AttributePath();

		/**
		 * The meta object literal for the '<em><b>Bean Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBEAN_SLOT_BINDING_ENDPOINT__BEAN_SLOT = eINSTANCE.getYBeanSlotBindingEndpoint_BeanSlot();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint <em>YEmbeddable Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableBindingEndpoint()
		 * @generated
		 */
		EClass YEMBEDDABLE_BINDING_ENDPOINT = eINSTANCE.getYEmbeddableBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableValueEndpointImpl <em>YEmbeddable Value Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableValueEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableValueEndpoint()
		 * @generated
		 */
		EClass YEMBEDDABLE_VALUE_ENDPOINT = eINSTANCE.getYEmbeddableValueEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT = eINSTANCE.getYEmbeddableValueEndpoint_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableSelectionEndpointImpl <em>YEmbeddable Selection Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableSelectionEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableSelectionEndpoint()
		 * @generated
		 */
		EClass YEMBEDDABLE_SELECTION_ENDPOINT = eINSTANCE.getYEmbeddableSelectionEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT = eINSTANCE.getYEmbeddableSelectionEndpoint_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableMultiSelectionEndpointImpl <em>YEmbeddable Multi Selection Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableMultiSelectionEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableMultiSelectionEndpoint()
		 * @generated
		 */
		EClass YEMBEDDABLE_MULTI_SELECTION_ENDPOINT = eINSTANCE.getYEmbeddableMultiSelectionEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEMBEDDABLE_MULTI_SELECTION_ENDPOINT__ELEMENT = eINSTANCE.getYEmbeddableMultiSelectionEndpoint_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableCollectionEndpointImpl <em>YEmbeddable Collection Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableCollectionEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYEmbeddableCollectionEndpoint()
		 * @generated
		 */
		EClass YEMBEDDABLE_COLLECTION_ENDPOINT = eINSTANCE.getYEmbeddableCollectionEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEMBEDDABLE_COLLECTION_ENDPOINT__ELEMENT = eINSTANCE.getYEmbeddableCollectionEndpoint_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YActivatedEndpointImpl <em>YActivated Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YActivatedEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYActivatedEndpoint()
		 * @generated
		 */
		EClass YACTIVATED_ENDPOINT = eINSTANCE.getYActivatedEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YACTIVATED_ENDPOINT__ELEMENT = eINSTANCE.getYActivatedEndpoint_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YDtWrapperImpl <em>YDt Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.YDtWrapperImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYDtWrapper()
		 * @generated
		 */
		EClass YDT_WRAPPER = eINSTANCE.getYDtWrapper();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable <em>YVisibility Processable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYVisibilityProcessable()
		 * @generated
		 */
		EClass YVISIBILITY_PROCESSABLE = eINSTANCE.getYVisibilityProcessable();

		/**
		 * The meta object literal for the '<em><b>Visibility Processor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVISIBILITY_PROCESSABLE__VISIBILITY_PROCESSOR = eINSTANCE.getYVisibilityProcessable_VisibilityProcessor();

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

		/**
		 * The meta object literal for the '<em>YValue Change Listener</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener
		 * @see org.eclipse.emf.ecp.ecview.common.model.core.impl.CoreModelPackageImpl#getYValueChangeListener()
		 * @generated
		 */
		EDataType YVALUE_CHANGE_LISTENER = eINSTANCE.getYValueChangeListener();

	}

} //UiModelPackage
