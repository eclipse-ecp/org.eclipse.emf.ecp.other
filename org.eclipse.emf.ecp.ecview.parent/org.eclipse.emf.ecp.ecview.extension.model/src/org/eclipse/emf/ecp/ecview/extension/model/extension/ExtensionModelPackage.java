/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;

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
 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/ecp/ecview/extension/view";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionModelPackage eINSTANCE = org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YInputImpl <em>YInput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YInputImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYInput()
	 * @generated
	 */
	int YINPUT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__ID = CoreModelPackage.YFIELD__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__CSS_CLASS = CoreModelPackage.YFIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__CSS_ID = CoreModelPackage.YFIELD__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__INITIAL_VISIBLE = CoreModelPackage.YFIELD__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__VISIBLE = CoreModelPackage.YFIELD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__INITIAL_EDITABLE = CoreModelPackage.YFIELD__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__EDITABLE = CoreModelPackage.YFIELD__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__INITIAL_ENABLED = CoreModelPackage.YFIELD__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__ENABLED = CoreModelPackage.YFIELD__ENABLED;

	/**
	 * The number of structural features of the '<em>YInput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT_FEATURE_COUNT = CoreModelPackage.YFIELD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTextFieldImpl <em>YText Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTextFieldImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYTextField()
	 * @generated
	 */
	int YTEXT_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Value Bindable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__VALUE_BINDABLE_VALUE = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__DATATYPE = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YText Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutImpl <em>YGrid Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYGridLayout()
	 * @generated
	 */
	int YGRID_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__ID = CoreModelPackage.YLAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__CSS_CLASS = CoreModelPackage.YLAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__CSS_ID = CoreModelPackage.YLAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__INITIAL_VISIBLE = CoreModelPackage.YLAYOUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__VISIBLE = CoreModelPackage.YLAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__ELEMENTS = CoreModelPackage.YLAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__SPACING = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__MARGIN = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__CELL_STYLES = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__COLUMNS = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__FILL_HORIZONTAL = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__FILL_VERTICAL = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>YGrid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT_FEATURE_COUNT = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutCellStyleImpl <em>YGrid Layout Cell Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutCellStyleImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYGridLayoutCellStyle()
	 * @generated
	 */
	int YGRID_LAYOUT_CELL_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT_CELL_STYLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT_CELL_STYLE__ALIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Span Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT_CELL_STYLE__SPAN_INFO = 2;

	/**
	 * The number of structural features of the '<em>YGrid Layout Cell Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT_CELL_STYLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YHorizontalLayoutImpl <em>YHorizontal Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YHorizontalLayoutImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYHorizontalLayout()
	 * @generated
	 */
	int YHORIZONTAL_LAYOUT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__ID = CoreModelPackage.YLAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__CSS_CLASS = CoreModelPackage.YLAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__CSS_ID = CoreModelPackage.YLAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__INITIAL_VISIBLE = CoreModelPackage.YLAYOUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__VISIBLE = CoreModelPackage.YLAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__ELEMENTS = CoreModelPackage.YLAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__SPACING = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__MARGIN = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__CELL_STYLES = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__FILL_HORIZONTAL = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YHorizontal Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT_FEATURE_COUNT = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YHorizontalLayoutCellStyleImpl <em>YHorizontal Layout Cell Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YHorizontalLayoutCellStyleImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYHorizontalLayoutCellStyle()
	 * @generated
	 */
	int YHORIZONTAL_LAYOUT_CELL_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT_CELL_STYLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT_CELL_STYLE__ALIGNMENT = 1;

	/**
	 * The number of structural features of the '<em>YHorizontal Layout Cell Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT_CELL_STYLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YVerticalLayoutImpl <em>YVertical Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YVerticalLayoutImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYVerticalLayout()
	 * @generated
	 */
	int YVERTICAL_LAYOUT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__ID = CoreModelPackage.YLAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__CSS_CLASS = CoreModelPackage.YLAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__CSS_ID = CoreModelPackage.YLAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__INITIAL_VISIBLE = CoreModelPackage.YLAYOUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__VISIBLE = CoreModelPackage.YLAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__ELEMENTS = CoreModelPackage.YLAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__SPACING = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__MARGIN = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__CELL_STYLES = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__FILL_VERTICAL = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YVertical Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT_FEATURE_COUNT = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YVerticalLayoutCellStyleImpl <em>YVertical Layout Cell Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YVerticalLayoutCellStyleImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYVerticalLayoutCellStyle()
	 * @generated
	 */
	int YVERTICAL_LAYOUT_CELL_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT_CELL_STYLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT_CELL_STYLE__ALIGNMENT = 1;

	/**
	 * The number of structural features of the '<em>YVertical Layout Cell Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT_CELL_STYLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YSpanInfoImpl <em>YSpan Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YSpanInfoImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYSpanInfo()
	 * @generated
	 */
	int YSPAN_INFO = 7;

	/**
	 * The feature id for the '<em><b>Column From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPAN_INFO__COLUMN_FROM = 0;

	/**
	 * The feature id for the '<em><b>Row From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPAN_INFO__ROW_FROM = 1;

	/**
	 * The feature id for the '<em><b>Column To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPAN_INFO__COLUMN_TO = 2;

	/**
	 * The feature id for the '<em><b>Row To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPAN_INFO__ROW_TO = 3;

	/**
	 * The number of structural features of the '<em>YSpan Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPAN_INFO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl <em>YTable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYTable()
	 * @generated
	 */
	int YTABLE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__DATATYPE = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YTable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YLabelImpl <em>YLabel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YLabelImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYLabel()
	 * @generated
	 */
	int YLABEL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__ID = CoreModelPackage.YFIELD__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__CSS_CLASS = CoreModelPackage.YFIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__CSS_ID = CoreModelPackage.YFIELD__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__INITIAL_VISIBLE = CoreModelPackage.YFIELD__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__VISIBLE = CoreModelPackage.YFIELD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__INITIAL_EDITABLE = CoreModelPackage.YFIELD__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__EDITABLE = CoreModelPackage.YFIELD__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__INITIAL_ENABLED = CoreModelPackage.YFIELD__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__ENABLED = CoreModelPackage.YFIELD__ENABLED;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__DATADESCRIPTION = CoreModelPackage.YFIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YLabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL_FEATURE_COUNT = CoreModelPackage.YFIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTextAreaImpl <em>YText Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTextAreaImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYTextArea()
	 * @generated
	 */
	int YTEXT_AREA = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__DATATYPE = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YText Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YCheckBoxImpl <em>YCheck Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YCheckBoxImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYCheckBox()
	 * @generated
	 */
	int YCHECK_BOX = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__DATATYPE = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YCheck Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YDecimalFieldImpl <em>YDecimal Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YDecimalFieldImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYDecimalField()
	 * @generated
	 */
	int YDECIMAL_FIELD = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__DATATYPE = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YDecimal Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YNumericFieldImpl <em>YNumeric Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YNumericFieldImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYNumericField()
	 * @generated
	 */
	int YNUMERIC_FIELD = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__DATATYPE = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YNumeric Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YComboBoxImpl <em>YCombo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YComboBoxImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYComboBox()
	 * @generated
	 */
	int YCOMBO_BOX = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__DATATYPE = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YCombo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YListImpl <em>YList</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YListImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYList()
	 * @generated
	 */
	int YLIST = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__DATATYPE = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YButtonImpl <em>YButton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YButtonImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYButton()
	 * @generated
	 */
	int YBUTTON = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__ID = CoreModelPackage.YACTION__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__CSS_CLASS = CoreModelPackage.YACTION__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__CSS_ID = CoreModelPackage.YACTION__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__INITIAL_VISIBLE = CoreModelPackage.YACTION__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__VISIBLE = CoreModelPackage.YACTION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__INITIAL_ENABLED = CoreModelPackage.YACTION__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__ENABLED = CoreModelPackage.YACTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__DATADESCRIPTION = CoreModelPackage.YACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__TYPE = CoreModelPackage.YACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Click Listeners</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__CLICK_LISTENERS = CoreModelPackage.YACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YButton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON_FEATURE_COUNT = CoreModelPackage.YACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '<em>YButton Click Listener</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.listener.IButtonClickListener
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYButtonClickListener()
	 * @generated
	 */
	int YBUTTON_CLICK_LISTENER = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment <em>YAlignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYAlignment()
	 * @generated
	 */
	int YALIGNMENT = 18;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YButtonType <em>YButton Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YButtonType
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYButtonType()
	 * @generated
	 */
	int YBUTTON_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField <em>YText Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText Field</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField
	 * @generated
	 */
	EClass getYTextField();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField#getDatatype()
	 * @see #getYTextField()
	 * @generated
	 */
	EReference getYTextField_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField#getDatadescription()
	 * @see #getYTextField()
	 * @generated
	 */
	EReference getYTextField_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout <em>YGrid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGrid Layout</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout
	 * @generated
	 */
	EClass getYGridLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout#getCellStyles <em>Cell Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Styles</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout#getCellStyles()
	 * @see #getYGridLayout()
	 * @generated
	 */
	EReference getYGridLayout_CellStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout#getColumns()
	 * @see #getYGridLayout()
	 * @generated
	 */
	EAttribute getYGridLayout_Columns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout#isFillHorizontal <em>Fill Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Horizontal</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout#isFillHorizontal()
	 * @see #getYGridLayout()
	 * @generated
	 */
	EAttribute getYGridLayout_FillHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout#isFillVertical <em>Fill Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Vertical</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout#isFillVertical()
	 * @see #getYGridLayout()
	 * @generated
	 */
	EAttribute getYGridLayout_FillVertical();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle <em>YGrid Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGrid Layout Cell Style</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle
	 * @generated
	 */
	EClass getYGridLayoutCellStyle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getTarget()
	 * @see #getYGridLayoutCellStyle()
	 * @generated
	 */
	EReference getYGridLayoutCellStyle_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getAlignment()
	 * @see #getYGridLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYGridLayoutCellStyle_Alignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getSpanInfo <em>Span Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Span Info</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle#getSpanInfo()
	 * @see #getYGridLayoutCellStyle()
	 * @generated
	 */
	EReference getYGridLayoutCellStyle_SpanInfo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout <em>YHorizontal Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YHorizontal Layout</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout
	 * @generated
	 */
	EClass getYHorizontalLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout#getCellStyles <em>Cell Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Styles</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout#getCellStyles()
	 * @see #getYHorizontalLayout()
	 * @generated
	 */
	EReference getYHorizontalLayout_CellStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout#isFillHorizontal <em>Fill Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Horizontal</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout#isFillHorizontal()
	 * @see #getYHorizontalLayout()
	 * @generated
	 */
	EAttribute getYHorizontalLayout_FillHorizontal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle <em>YHorizontal Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YHorizontal Layout Cell Style</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle
	 * @generated
	 */
	EClass getYHorizontalLayoutCellStyle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle#getTarget()
	 * @see #getYHorizontalLayoutCellStyle()
	 * @generated
	 */
	EReference getYHorizontalLayoutCellStyle_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle#getAlignment()
	 * @see #getYHorizontalLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYHorizontalLayoutCellStyle_Alignment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout <em>YVertical Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVertical Layout</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout
	 * @generated
	 */
	EClass getYVerticalLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout#getCellStyles <em>Cell Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Styles</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout#getCellStyles()
	 * @see #getYVerticalLayout()
	 * @generated
	 */
	EReference getYVerticalLayout_CellStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout#isFillVertical <em>Fill Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Vertical</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout#isFillVertical()
	 * @see #getYVerticalLayout()
	 * @generated
	 */
	EAttribute getYVerticalLayout_FillVertical();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayoutCellStyle <em>YVertical Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVertical Layout Cell Style</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayoutCellStyle
	 * @generated
	 */
	EClass getYVerticalLayoutCellStyle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayoutCellStyle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayoutCellStyle#getTarget()
	 * @see #getYVerticalLayoutCellStyle()
	 * @generated
	 */
	EReference getYVerticalLayoutCellStyle_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayoutCellStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayoutCellStyle#getAlignment()
	 * @see #getYVerticalLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYVerticalLayoutCellStyle_Alignment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo <em>YSpan Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSpan Info</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo
	 * @generated
	 */
	EClass getYSpanInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo#getColumnFrom <em>Column From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column From</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo#getColumnFrom()
	 * @see #getYSpanInfo()
	 * @generated
	 */
	EAttribute getYSpanInfo_ColumnFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo#getRowFrom <em>Row From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row From</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo#getRowFrom()
	 * @see #getYSpanInfo()
	 * @generated
	 */
	EAttribute getYSpanInfo_RowFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo#getColumnTo <em>Column To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column To</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo#getColumnTo()
	 * @see #getYSpanInfo()
	 * @generated
	 */
	EAttribute getYSpanInfo_ColumnTo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo#getRowTo <em>Row To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row To</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo#getRowTo()
	 * @see #getYSpanInfo()
	 * @generated
	 */
	EAttribute getYSpanInfo_RowTo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTable <em>YTable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTable
	 * @generated
	 */
	EClass getYTable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTable#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTable#getDatatype()
	 * @see #getYTable()
	 * @generated
	 */
	EReference getYTable_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTable#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTable#getDatadescription()
	 * @see #getYTable()
	 * @generated
	 */
	EReference getYTable_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel <em>YLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YLabel</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel
	 * @generated
	 */
	EClass getYLabel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel#getDatadescription()
	 * @see #getYLabel()
	 * @generated
	 */
	EReference getYLabel_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea <em>YText Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText Area</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea
	 * @generated
	 */
	EClass getYTextArea();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea#getDatadescription()
	 * @see #getYTextArea()
	 * @generated
	 */
	EReference getYTextArea_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea#getDatatype()
	 * @see #getYTextArea()
	 * @generated
	 */
	EReference getYTextArea_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox <em>YCheck Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCheck Box</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox
	 * @generated
	 */
	EClass getYCheckBox();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox#getDatadescription()
	 * @see #getYCheckBox()
	 * @generated
	 */
	EReference getYCheckBox_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox#getDatatype()
	 * @see #getYCheckBox()
	 * @generated
	 */
	EReference getYCheckBox_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YInput <em>YInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YInput</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YInput
	 * @generated
	 */
	EClass getYInput();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField <em>YDecimal Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDecimal Field</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField
	 * @generated
	 */
	EClass getYDecimalField();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField#getDatatype()
	 * @see #getYDecimalField()
	 * @generated
	 */
	EReference getYDecimalField_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField#getDatadescription()
	 * @see #getYDecimalField()
	 * @generated
	 */
	EReference getYDecimalField_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField <em>YNumeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YNumeric Field</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField
	 * @generated
	 */
	EClass getYNumericField();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField#getDatatype()
	 * @see #getYNumericField()
	 * @generated
	 */
	EReference getYNumericField_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField#getDatadescription()
	 * @see #getYNumericField()
	 * @generated
	 */
	EReference getYNumericField_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox <em>YCombo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCombo Box</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox
	 * @generated
	 */
	EClass getYComboBox();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox#getDatadescription()
	 * @see #getYComboBox()
	 * @generated
	 */
	EReference getYComboBox_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox#getDatatype()
	 * @see #getYComboBox()
	 * @generated
	 */
	EReference getYComboBox_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YList <em>YList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YList</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YList
	 * @generated
	 */
	EClass getYList();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YList#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YList#getDatadescription()
	 * @see #getYList()
	 * @generated
	 */
	EReference getYList_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YList#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YList#getDatatype()
	 * @see #getYList()
	 * @generated
	 */
	EReference getYList_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YButton <em>YButton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YButton</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YButton
	 * @generated
	 */
	EClass getYButton();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YButton#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YButton#getDatadescription()
	 * @see #getYButton()
	 * @generated
	 */
	EReference getYButton_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YButton#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YButton#getType()
	 * @see #getYButton()
	 * @generated
	 */
	EAttribute getYButton_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YButton#getClickListeners <em>Click Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Click Listeners</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YButton#getClickListeners()
	 * @see #getYButton()
	 * @generated
	 */
	EAttribute getYButton_ClickListeners();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.listener.IButtonClickListener <em>YButton Click Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YButton Click Listener</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.listener.IButtonClickListener
	 * @model instanceClass="org.eclipse.emf.ecp.ecview.extension.model.extension.listener.IButtonClickListener"
	 * @generated
	 */
	EDataType getYButtonClickListener();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment <em>YAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YAlignment</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment
	 * @generated
	 */
	EEnum getYAlignment();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YButtonType <em>YButton Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YButton Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YButtonType
	 * @generated
	 */
	EEnum getYButtonType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionModelFactory getExtensionModelFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTextFieldImpl <em>YText Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTextFieldImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYTextField()
		 * @generated
		 */
		EClass YTEXT_FIELD = eINSTANCE.getYTextField();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTEXT_FIELD__DATATYPE = eINSTANCE.getYTextField_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTEXT_FIELD__DATADESCRIPTION = eINSTANCE.getYTextField_Datadescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutImpl <em>YGrid Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYGridLayout()
		 * @generated
		 */
		EClass YGRID_LAYOUT = eINSTANCE.getYGridLayout();

		/**
		 * The meta object literal for the '<em><b>Cell Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGRID_LAYOUT__CELL_STYLES = eINSTANCE.getYGridLayout_CellStyles();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGRID_LAYOUT__COLUMNS = eINSTANCE.getYGridLayout_Columns();

		/**
		 * The meta object literal for the '<em><b>Fill Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGRID_LAYOUT__FILL_HORIZONTAL = eINSTANCE.getYGridLayout_FillHorizontal();

		/**
		 * The meta object literal for the '<em><b>Fill Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGRID_LAYOUT__FILL_VERTICAL = eINSTANCE.getYGridLayout_FillVertical();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutCellStyleImpl <em>YGrid Layout Cell Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutCellStyleImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYGridLayoutCellStyle()
		 * @generated
		 */
		EClass YGRID_LAYOUT_CELL_STYLE = eINSTANCE.getYGridLayoutCellStyle();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGRID_LAYOUT_CELL_STYLE__TARGET = eINSTANCE.getYGridLayoutCellStyle_Target();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGRID_LAYOUT_CELL_STYLE__ALIGNMENT = eINSTANCE.getYGridLayoutCellStyle_Alignment();

		/**
		 * The meta object literal for the '<em><b>Span Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGRID_LAYOUT_CELL_STYLE__SPAN_INFO = eINSTANCE.getYGridLayoutCellStyle_SpanInfo();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YHorizontalLayoutImpl <em>YHorizontal Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YHorizontalLayoutImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYHorizontalLayout()
		 * @generated
		 */
		EClass YHORIZONTAL_LAYOUT = eINSTANCE.getYHorizontalLayout();

		/**
		 * The meta object literal for the '<em><b>Cell Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YHORIZONTAL_LAYOUT__CELL_STYLES = eINSTANCE.getYHorizontalLayout_CellStyles();

		/**
		 * The meta object literal for the '<em><b>Fill Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YHORIZONTAL_LAYOUT__FILL_HORIZONTAL = eINSTANCE.getYHorizontalLayout_FillHorizontal();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YHorizontalLayoutCellStyleImpl <em>YHorizontal Layout Cell Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YHorizontalLayoutCellStyleImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYHorizontalLayoutCellStyle()
		 * @generated
		 */
		EClass YHORIZONTAL_LAYOUT_CELL_STYLE = eINSTANCE.getYHorizontalLayoutCellStyle();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YHORIZONTAL_LAYOUT_CELL_STYLE__TARGET = eINSTANCE.getYHorizontalLayoutCellStyle_Target();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YHORIZONTAL_LAYOUT_CELL_STYLE__ALIGNMENT = eINSTANCE.getYHorizontalLayoutCellStyle_Alignment();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YVerticalLayoutImpl <em>YVertical Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YVerticalLayoutImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYVerticalLayout()
		 * @generated
		 */
		EClass YVERTICAL_LAYOUT = eINSTANCE.getYVerticalLayout();

		/**
		 * The meta object literal for the '<em><b>Cell Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVERTICAL_LAYOUT__CELL_STYLES = eINSTANCE.getYVerticalLayout_CellStyles();

		/**
		 * The meta object literal for the '<em><b>Fill Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVERTICAL_LAYOUT__FILL_VERTICAL = eINSTANCE.getYVerticalLayout_FillVertical();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YVerticalLayoutCellStyleImpl <em>YVertical Layout Cell Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YVerticalLayoutCellStyleImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYVerticalLayoutCellStyle()
		 * @generated
		 */
		EClass YVERTICAL_LAYOUT_CELL_STYLE = eINSTANCE.getYVerticalLayoutCellStyle();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVERTICAL_LAYOUT_CELL_STYLE__TARGET = eINSTANCE.getYVerticalLayoutCellStyle_Target();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVERTICAL_LAYOUT_CELL_STYLE__ALIGNMENT = eINSTANCE.getYVerticalLayoutCellStyle_Alignment();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YSpanInfoImpl <em>YSpan Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YSpanInfoImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYSpanInfo()
		 * @generated
		 */
		EClass YSPAN_INFO = eINSTANCE.getYSpanInfo();

		/**
		 * The meta object literal for the '<em><b>Column From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSPAN_INFO__COLUMN_FROM = eINSTANCE.getYSpanInfo_ColumnFrom();

		/**
		 * The meta object literal for the '<em><b>Row From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSPAN_INFO__ROW_FROM = eINSTANCE.getYSpanInfo_RowFrom();

		/**
		 * The meta object literal for the '<em><b>Column To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSPAN_INFO__COLUMN_TO = eINSTANCE.getYSpanInfo_ColumnTo();

		/**
		 * The meta object literal for the '<em><b>Row To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSPAN_INFO__ROW_TO = eINSTANCE.getYSpanInfo_RowTo();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl <em>YTable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTableImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYTable()
		 * @generated
		 */
		EClass YTABLE = eINSTANCE.getYTable();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTABLE__DATATYPE = eINSTANCE.getYTable_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTABLE__DATADESCRIPTION = eINSTANCE.getYTable_Datadescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YLabelImpl <em>YLabel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YLabelImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYLabel()
		 * @generated
		 */
		EClass YLABEL = eINSTANCE.getYLabel();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLABEL__DATADESCRIPTION = eINSTANCE.getYLabel_Datadescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTextAreaImpl <em>YText Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTextAreaImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYTextArea()
		 * @generated
		 */
		EClass YTEXT_AREA = eINSTANCE.getYTextArea();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTEXT_AREA__DATADESCRIPTION = eINSTANCE.getYTextArea_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTEXT_AREA__DATATYPE = eINSTANCE.getYTextArea_Datatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YCheckBoxImpl <em>YCheck Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YCheckBoxImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYCheckBox()
		 * @generated
		 */
		EClass YCHECK_BOX = eINSTANCE.getYCheckBox();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCHECK_BOX__DATADESCRIPTION = eINSTANCE.getYCheckBox_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCHECK_BOX__DATATYPE = eINSTANCE.getYCheckBox_Datatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YInputImpl <em>YInput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YInputImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYInput()
		 * @generated
		 */
		EClass YINPUT = eINSTANCE.getYInput();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YDecimalFieldImpl <em>YDecimal Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YDecimalFieldImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYDecimalField()
		 * @generated
		 */
		EClass YDECIMAL_FIELD = eINSTANCE.getYDecimalField();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YDECIMAL_FIELD__DATATYPE = eINSTANCE.getYDecimalField_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YDECIMAL_FIELD__DATADESCRIPTION = eINSTANCE.getYDecimalField_Datadescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YNumericFieldImpl <em>YNumeric Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YNumericFieldImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYNumericField()
		 * @generated
		 */
		EClass YNUMERIC_FIELD = eINSTANCE.getYNumericField();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YNUMERIC_FIELD__DATATYPE = eINSTANCE.getYNumericField_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YNUMERIC_FIELD__DATADESCRIPTION = eINSTANCE.getYNumericField_Datadescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YComboBoxImpl <em>YCombo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YComboBoxImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYComboBox()
		 * @generated
		 */
		EClass YCOMBO_BOX = eINSTANCE.getYComboBox();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOMBO_BOX__DATADESCRIPTION = eINSTANCE.getYComboBox_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOMBO_BOX__DATATYPE = eINSTANCE.getYComboBox_Datatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YListImpl <em>YList</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YListImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYList()
		 * @generated
		 */
		EClass YLIST = eINSTANCE.getYList();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLIST__DATADESCRIPTION = eINSTANCE.getYList_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLIST__DATATYPE = eINSTANCE.getYList_Datatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YButtonImpl <em>YButton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YButtonImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYButton()
		 * @generated
		 */
		EClass YBUTTON = eINSTANCE.getYButton();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBUTTON__DATADESCRIPTION = eINSTANCE.getYButton_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBUTTON__TYPE = eINSTANCE.getYButton_Type();

		/**
		 * The meta object literal for the '<em><b>Click Listeners</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBUTTON__CLICK_LISTENERS = eINSTANCE.getYButton_ClickListeners();

		/**
		 * The meta object literal for the '<em>YButton Click Listener</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.listener.IButtonClickListener
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYButtonClickListener()
		 * @generated
		 */
		EDataType YBUTTON_CLICK_LISTENER = eINSTANCE.getYButtonClickListener();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment <em>YAlignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYAlignment()
		 * @generated
		 */
		EEnum YALIGNMENT = eINSTANCE.getYAlignment();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YButtonType <em>YButton Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YButtonType
		 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.impl.ExtensionModelPackageImpl#getYButtonType()
		 * @generated
		 */
		EEnum YBUTTON_TYPE = eINSTANCE.getYButtonType();

	}

} //ExtensionModelPackage
