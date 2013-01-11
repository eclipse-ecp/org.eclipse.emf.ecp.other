/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;

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
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface UimodelExtensionPackage extends EPackage {
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
	String eNS_URI = "http://eclipse.org/emf/emfclient/uimodel/basicExtension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basicextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UimodelExtensionPackage eINSTANCE = org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiInputImpl <em>YUi Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiInputImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiInput()
	 * @generated
	 */
	int YUI_INPUT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_INPUT__ID = UiModelPackage.YUI_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_INPUT__CSS_CLASS = UiModelPackage.YUI_FIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_INPUT__CSS_ID = UiModelPackage.YUI_FIELD__CSS_ID;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_INPUT__READONLY = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_INPUT__ENABLED = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_INPUT__REQUIRED = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_INPUT__VISIBLE = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YUi Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_INPUT_FEATURE_COUNT = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextFieldImpl <em>YUi Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextFieldImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiTextField()
	 * @generated
	 */
	int YUI_TEXT_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__ID = YUI_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__CSS_CLASS = YUI_INPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__CSS_ID = YUI_INPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__READONLY = YUI_INPUT__READONLY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__ENABLED = YUI_INPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__REQUIRED = YUI_INPUT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__VISIBLE = YUI_INPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__DATATYPE = YUI_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binds To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__BINDS_TO = YUI_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__DATADESCRIPTION = YUI_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YUi Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD_FEATURE_COUNT = YUI_INPUT_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutImpl <em>YUi Grid Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiGridLayout()
	 * @generated
	 */
	int YUI_GRID_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__ID = UiModelPackage.YUI_LAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__CSS_CLASS = UiModelPackage.YUI_LAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__CSS_ID = UiModelPackage.YUI_LAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__ELEMENTS = UiModelPackage.YUI_LAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__SPACING = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__MARGIN = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__CELL_STYLES = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__COLUMNS = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__FILL_HORIZONTAL = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__FILL_VERTICAL = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>YUi Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT_FEATURE_COUNT = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl <em>YUi Grid Layout Cell Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiGridLayoutCellStyle()
	 * @generated
	 */
	int YUI_GRID_LAYOUT_CELL_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT_CELL_STYLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Span Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO = 2;

	/**
	 * The number of structural features of the '<em>YUi Grid Layout Cell Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT_CELL_STYLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutCellStyleImpl <em>YUi Horizontal Layout Cell Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutCellStyleImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiHorizontalLayoutCellStyle()
	 * @generated
	 */
	int YUI_HORIZONTAL_LAYOUT_CELL_STYLE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiSpanInfoImpl <em>YUi Span Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiSpanInfoImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiSpanInfo()
	 * @generated
	 */
	int YUI_SPAN_INFO = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTableImpl <em>YUi Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTableImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiTable()
	 * @generated
	 */
	int YUI_TABLE = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiLabelImpl <em>YUi Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiLabelImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiLabel()
	 * @generated
	 */
	int YUI_LABEL = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextAreaImpl <em>YUi Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextAreaImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiTextArea()
	 * @generated
	 */
	int YUI_TEXT_AREA = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiCheckBoxImpl <em>YUi Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiCheckBoxImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiCheckBox()
	 * @generated
	 */
	int YUI_CHECK_BOX = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiNumericFieldImpl <em>YUi Numeric Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiNumericFieldImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiNumericField()
	 * @generated
	 */
	int YUI_NUMERIC_FIELD = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiDecimalFieldImpl <em>YUi Decimal Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiDecimalFieldImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiDecimalField()
	 * @generated
	 */
	int YUI_DECIMAL_FIELD = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiComboBoxImpl <em>YUi Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiComboBoxImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiComboBox()
	 * @generated
	 */
	int YUI_COMBO_BOX = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiListImpl <em>YUi List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiListImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiList()
	 * @generated
	 */
	int YUI_LIST = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutImpl <em>YUi Horizontal Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiHorizontalLayout()
	 * @generated
	 */
	int YUI_HORIZONTAL_LAYOUT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT__ID = UiModelPackage.YUI_LAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT__CSS_CLASS = UiModelPackage.YUI_LAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT__CSS_ID = UiModelPackage.YUI_LAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT__ELEMENTS = UiModelPackage.YUI_LAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT__SPACING = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT__MARGIN = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT__CELL_STYLES = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT__FILL_HORIZONTAL = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YUi Horizontal Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT_FEATURE_COUNT = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT_CELL_STYLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT_CELL_STYLE__ALIGNMENT = 1;

	/**
	 * The number of structural features of the '<em>YUi Horizontal Layout Cell Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_HORIZONTAL_LAYOUT_CELL_STYLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiVerticalLayoutImpl <em>YUi Vertical Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiVerticalLayoutImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiVerticalLayout()
	 * @generated
	 */
	int YUI_VERTICAL_LAYOUT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT__ID = UiModelPackage.YUI_LAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT__CSS_CLASS = UiModelPackage.YUI_LAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT__CSS_ID = UiModelPackage.YUI_LAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT__ELEMENTS = UiModelPackage.YUI_LAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT__SPACING = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT__MARGIN = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT__CELL_STYLES = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT__FILL_VERTICAL = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YUi Vertical Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT_FEATURE_COUNT = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiVerticalLayoutCellStyleImpl <em>YUi Vertical Layout Cell Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiVerticalLayoutCellStyleImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiVerticalLayoutCellStyle()
	 * @generated
	 */
	int YUI_VERTICAL_LAYOUT_CELL_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT_CELL_STYLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT_CELL_STYLE__ALIGNMENT = 1;

	/**
	 * The number of structural features of the '<em>YUi Vertical Layout Cell Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_VERTICAL_LAYOUT_CELL_STYLE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Column From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_SPAN_INFO__COLUMN_FROM = 0;

	/**
	 * The feature id for the '<em><b>Row From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_SPAN_INFO__ROW_FROM = 1;

	/**
	 * The feature id for the '<em><b>Column To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_SPAN_INFO__COLUMN_TO = 2;

	/**
	 * The feature id for the '<em><b>Row To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_SPAN_INFO__ROW_TO = 3;

	/**
	 * The number of structural features of the '<em>YUi Span Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_SPAN_INFO_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__ID = YUI_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__CSS_CLASS = YUI_INPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__CSS_ID = YUI_INPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__READONLY = YUI_INPUT__READONLY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__ENABLED = YUI_INPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__REQUIRED = YUI_INPUT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__VISIBLE = YUI_INPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__DATATYPE = YUI_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__DATADESCRIPTION = YUI_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YUi Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE_FEATURE_COUNT = YUI_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LABEL__ID = UiModelPackage.YUI_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LABEL__CSS_CLASS = UiModelPackage.YUI_FIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LABEL__CSS_ID = UiModelPackage.YUI_FIELD__CSS_ID;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LABEL__DATADESCRIPTION = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YUi Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LABEL_FEATURE_COUNT = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_AREA__ID = YUI_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_AREA__CSS_CLASS = YUI_INPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_AREA__CSS_ID = YUI_INPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_AREA__READONLY = YUI_INPUT__READONLY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_AREA__ENABLED = YUI_INPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_AREA__REQUIRED = YUI_INPUT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_AREA__VISIBLE = YUI_INPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_AREA__DATADESCRIPTION = YUI_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_AREA__DATATYPE = YUI_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YUi Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_AREA_FEATURE_COUNT = YUI_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CHECK_BOX__ID = YUI_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CHECK_BOX__CSS_CLASS = YUI_INPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CHECK_BOX__CSS_ID = YUI_INPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CHECK_BOX__READONLY = YUI_INPUT__READONLY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CHECK_BOX__ENABLED = YUI_INPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CHECK_BOX__REQUIRED = YUI_INPUT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CHECK_BOX__VISIBLE = YUI_INPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CHECK_BOX__DATADESCRIPTION = YUI_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CHECK_BOX__DATATYPE = YUI_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YUi Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_CHECK_BOX_FEATURE_COUNT = YUI_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_DECIMAL_FIELD__ID = YUI_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_DECIMAL_FIELD__CSS_CLASS = YUI_INPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_DECIMAL_FIELD__CSS_ID = YUI_INPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_DECIMAL_FIELD__READONLY = YUI_INPUT__READONLY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_DECIMAL_FIELD__ENABLED = YUI_INPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_DECIMAL_FIELD__REQUIRED = YUI_INPUT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_DECIMAL_FIELD__VISIBLE = YUI_INPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_DECIMAL_FIELD__DATATYPE = YUI_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_DECIMAL_FIELD__DATADESCRIPTION = YUI_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YUi Decimal Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_DECIMAL_FIELD_FEATURE_COUNT = YUI_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_NUMERIC_FIELD__ID = YUI_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_NUMERIC_FIELD__CSS_CLASS = YUI_INPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_NUMERIC_FIELD__CSS_ID = YUI_INPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_NUMERIC_FIELD__READONLY = YUI_INPUT__READONLY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_NUMERIC_FIELD__ENABLED = YUI_INPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_NUMERIC_FIELD__REQUIRED = YUI_INPUT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_NUMERIC_FIELD__VISIBLE = YUI_INPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_NUMERIC_FIELD__DATATYPE = YUI_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_NUMERIC_FIELD__DATADESCRIPTION = YUI_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YUi Numeric Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_NUMERIC_FIELD_FEATURE_COUNT = YUI_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_COMBO_BOX__ID = YUI_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_COMBO_BOX__CSS_CLASS = YUI_INPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_COMBO_BOX__CSS_ID = YUI_INPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_COMBO_BOX__READONLY = YUI_INPUT__READONLY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_COMBO_BOX__ENABLED = YUI_INPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_COMBO_BOX__REQUIRED = YUI_INPUT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_COMBO_BOX__VISIBLE = YUI_INPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_COMBO_BOX__DATADESCRIPTION = YUI_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_COMBO_BOX__DATATYPE = YUI_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YUi Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_COMBO_BOX_FEATURE_COUNT = YUI_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LIST__ID = YUI_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LIST__CSS_CLASS = YUI_INPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LIST__CSS_ID = YUI_INPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LIST__READONLY = YUI_INPUT__READONLY;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LIST__ENABLED = YUI_INPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LIST__REQUIRED = YUI_INPUT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LIST__VISIBLE = YUI_INPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LIST__DATADESCRIPTION = YUI_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LIST__DATATYPE = YUI_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YUi List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_LIST_FEATURE_COUNT = YUI_INPUT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment <em>YUi Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiAlignment()
	 * @generated
	 */
	int YUI_ALIGNMENT = 17;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField <em>YUi Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Text Field</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField
	 * @generated
	 */
	EClass getYUiTextField();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getDatatype()
	 * @see #getYUiTextField()
	 * @generated
	 */
	EReference getYUiTextField_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getDatadescription()
	 * @see #getYUiTextField()
	 * @generated
	 */
	EReference getYUiTextField_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getBindsTo <em>Binds To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binds To</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getBindsTo()
	 * @see #getYUiTextField()
	 * @generated
	 */
	EAttribute getYUiTextField_BindsTo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout <em>YUi Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Grid Layout</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout
	 * @generated
	 */
	EClass getYUiGridLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#getCellStyles <em>Cell Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Styles</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#getCellStyles()
	 * @see #getYUiGridLayout()
	 * @generated
	 */
	EReference getYUiGridLayout_CellStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#getColumns()
	 * @see #getYUiGridLayout()
	 * @generated
	 */
	EAttribute getYUiGridLayout_Columns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#isFillHorizontal <em>Fill Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Horizontal</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#isFillHorizontal()
	 * @see #getYUiGridLayout()
	 * @generated
	 */
	EAttribute getYUiGridLayout_FillHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#isFillVertical <em>Fill Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Vertical</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#isFillVertical()
	 * @see #getYUiGridLayout()
	 * @generated
	 */
	EAttribute getYUiGridLayout_FillVertical();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle <em>YUi Grid Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Grid Layout Cell Style</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle
	 * @generated
	 */
	EClass getYUiGridLayoutCellStyle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getTarget()
	 * @see #getYUiGridLayoutCellStyle()
	 * @generated
	 */
	EReference getYUiGridLayoutCellStyle_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getAlignment()
	 * @see #getYUiGridLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYUiGridLayoutCellStyle_Alignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getSpanInfo <em>Span Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Span Info</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#getSpanInfo()
	 * @see #getYUiGridLayoutCellStyle()
	 * @generated
	 */
	EReference getYUiGridLayoutCellStyle_SpanInfo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle <em>YUi Horizontal Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Horizontal Layout Cell Style</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle
	 * @generated
	 */
	EClass getYUiHorizontalLayoutCellStyle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle#getTarget()
	 * @see #getYUiHorizontalLayoutCellStyle()
	 * @generated
	 */
	EReference getYUiHorizontalLayoutCellStyle_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle#getAlignment()
	 * @see #getYUiHorizontalLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYUiHorizontalLayoutCellStyle_Alignment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayout <em>YUi Vertical Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Vertical Layout</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayout
	 * @generated
	 */
	EClass getYUiVerticalLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayout#getCellStyles <em>Cell Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Styles</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayout#getCellStyles()
	 * @see #getYUiVerticalLayout()
	 * @generated
	 */
	EReference getYUiVerticalLayout_CellStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayout#isFillVertical <em>Fill Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Vertical</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayout#isFillVertical()
	 * @see #getYUiVerticalLayout()
	 * @generated
	 */
	EAttribute getYUiVerticalLayout_FillVertical();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayoutCellStyle <em>YUi Vertical Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Vertical Layout Cell Style</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayoutCellStyle
	 * @generated
	 */
	EClass getYUiVerticalLayoutCellStyle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayoutCellStyle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayoutCellStyle#getTarget()
	 * @see #getYUiVerticalLayoutCellStyle()
	 * @generated
	 */
	EReference getYUiVerticalLayoutCellStyle_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayoutCellStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayoutCellStyle#getAlignment()
	 * @see #getYUiVerticalLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYUiVerticalLayoutCellStyle_Alignment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo <em>YUi Span Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Span Info</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo
	 * @generated
	 */
	EClass getYUiSpanInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getColumnFrom <em>Column From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column From</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getColumnFrom()
	 * @see #getYUiSpanInfo()
	 * @generated
	 */
	EAttribute getYUiSpanInfo_ColumnFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getRowFrom <em>Row From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row From</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getRowFrom()
	 * @see #getYUiSpanInfo()
	 * @generated
	 */
	EAttribute getYUiSpanInfo_RowFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getColumnTo <em>Column To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column To</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getColumnTo()
	 * @see #getYUiSpanInfo()
	 * @generated
	 */
	EAttribute getYUiSpanInfo_ColumnTo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getRowTo <em>Row To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row To</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo#getRowTo()
	 * @see #getYUiSpanInfo()
	 * @generated
	 */
	EAttribute getYUiSpanInfo_RowTo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable <em>YUi Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Table</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable
	 * @generated
	 */
	EClass getYUiTable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable#getDatatype()
	 * @see #getYUiTable()
	 * @generated
	 */
	EReference getYUiTable_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable#getDatadescription()
	 * @see #getYUiTable()
	 * @generated
	 */
	EReference getYUiTable_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel <em>YUi Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Label</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel
	 * @generated
	 */
	EClass getYUiLabel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel#getDatadescription()
	 * @see #getYUiLabel()
	 * @generated
	 */
	EReference getYUiLabel_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea <em>YUi Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Text Area</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea
	 * @generated
	 */
	EClass getYUiTextArea();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea#getDatadescription()
	 * @see #getYUiTextArea()
	 * @generated
	 */
	EReference getYUiTextArea_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea#getDatatype()
	 * @see #getYUiTextArea()
	 * @generated
	 */
	EReference getYUiTextArea_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox <em>YUi Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Check Box</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox
	 * @generated
	 */
	EClass getYUiCheckBox();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox#getDatadescription()
	 * @see #getYUiCheckBox()
	 * @generated
	 */
	EReference getYUiCheckBox_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox#getDatatype()
	 * @see #getYUiCheckBox()
	 * @generated
	 */
	EReference getYUiCheckBox_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput <em>YUi Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Input</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput
	 * @generated
	 */
	EClass getYUiInput();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput#isReadonly()
	 * @see #getYUiInput()
	 * @generated
	 */
	EAttribute getYUiInput_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput#isEnabled()
	 * @see #getYUiInput()
	 * @generated
	 */
	EAttribute getYUiInput_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput#isRequired()
	 * @see #getYUiInput()
	 * @generated
	 */
	EAttribute getYUiInput_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput#isVisible()
	 * @see #getYUiInput()
	 * @generated
	 */
	EAttribute getYUiInput_Visible();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiDecimalField <em>YUi Decimal Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Decimal Field</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiDecimalField
	 * @generated
	 */
	EClass getYUiDecimalField();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiDecimalField#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiDecimalField#getDatatype()
	 * @see #getYUiDecimalField()
	 * @generated
	 */
	EReference getYUiDecimalField_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiDecimalField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiDecimalField#getDatadescription()
	 * @see #getYUiDecimalField()
	 * @generated
	 */
	EReference getYUiDecimalField_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiNumericField <em>YUi Numeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Numeric Field</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiNumericField
	 * @generated
	 */
	EClass getYUiNumericField();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiNumericField#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiNumericField#getDatatype()
	 * @see #getYUiNumericField()
	 * @generated
	 */
	EReference getYUiNumericField_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiNumericField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiNumericField#getDatadescription()
	 * @see #getYUiNumericField()
	 * @generated
	 */
	EReference getYUiNumericField_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiComboBox <em>YUi Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Combo Box</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiComboBox
	 * @generated
	 */
	EClass getYUiComboBox();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiComboBox#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiComboBox#getDatadescription()
	 * @see #getYUiComboBox()
	 * @generated
	 */
	EReference getYUiComboBox_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiComboBox#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiComboBox#getDatatype()
	 * @see #getYUiComboBox()
	 * @generated
	 */
	EReference getYUiComboBox_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiList <em>YUi List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi List</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiList
	 * @generated
	 */
	EClass getYUiList();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiList#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiList#getDatadescription()
	 * @see #getYUiList()
	 * @generated
	 */
	EReference getYUiList_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiList#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiList#getDatatype()
	 * @see #getYUiList()
	 * @generated
	 */
	EReference getYUiList_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayout <em>YUi Horizontal Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Horizontal Layout</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayout
	 * @generated
	 */
	EClass getYUiHorizontalLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayout#getCellStyles <em>Cell Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Styles</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayout#getCellStyles()
	 * @see #getYUiHorizontalLayout()
	 * @generated
	 */
	EReference getYUiHorizontalLayout_CellStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayout#isFillHorizontal <em>Fill Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Horizontal</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayout#isFillHorizontal()
	 * @see #getYUiHorizontalLayout()
	 * @generated
	 */
	EAttribute getYUiHorizontalLayout_FillHorizontal();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment <em>YUi Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YUi Alignment</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment
	 * @generated
	 */
	EEnum getYUiAlignment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UimodelExtensionFactory getUimodelExtensionFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextFieldImpl <em>YUi Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextFieldImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiTextField()
		 * @generated
		 */
		EClass YUI_TEXT_FIELD = eINSTANCE.getYUiTextField();
		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_TEXT_FIELD__DATATYPE = eINSTANCE.getYUiTextField_Datatype();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_TEXT_FIELD__DATADESCRIPTION = eINSTANCE.getYUiTextField_Datadescription();
		/**
		 * The meta object literal for the '<em><b>Binds To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_TEXT_FIELD__BINDS_TO = eINSTANCE.getYUiTextField_BindsTo();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutImpl <em>YUi Grid Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiGridLayout()
		 * @generated
		 */
		EClass YUI_GRID_LAYOUT = eINSTANCE.getYUiGridLayout();
		/**
		 * The meta object literal for the '<em><b>Cell Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_GRID_LAYOUT__CELL_STYLES = eINSTANCE.getYUiGridLayout_CellStyles();
		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_GRID_LAYOUT__COLUMNS = eINSTANCE.getYUiGridLayout_Columns();
		/**
		 * The meta object literal for the '<em><b>Fill Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_GRID_LAYOUT__FILL_HORIZONTAL = eINSTANCE.getYUiGridLayout_FillHorizontal();
		/**
		 * The meta object literal for the '<em><b>Fill Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_GRID_LAYOUT__FILL_VERTICAL = eINSTANCE.getYUiGridLayout_FillVertical();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl <em>YUi Grid Layout Cell Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiGridLayoutCellStyle()
		 * @generated
		 */
		EClass YUI_GRID_LAYOUT_CELL_STYLE = eINSTANCE.getYUiGridLayoutCellStyle();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_GRID_LAYOUT_CELL_STYLE__TARGET = eINSTANCE.getYUiGridLayoutCellStyle_Target();
		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT = eINSTANCE.getYUiGridLayoutCellStyle_Alignment();
		/**
		 * The meta object literal for the '<em><b>Span Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO = eINSTANCE.getYUiGridLayoutCellStyle_SpanInfo();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutCellStyleImpl <em>YUi Horizontal Layout Cell Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutCellStyleImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiHorizontalLayoutCellStyle()
		 * @generated
		 */
		EClass YUI_HORIZONTAL_LAYOUT_CELL_STYLE = eINSTANCE.getYUiHorizontalLayoutCellStyle();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_HORIZONTAL_LAYOUT_CELL_STYLE__TARGET = eINSTANCE.getYUiHorizontalLayoutCellStyle_Target();
		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_HORIZONTAL_LAYOUT_CELL_STYLE__ALIGNMENT = eINSTANCE.getYUiHorizontalLayoutCellStyle_Alignment();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiVerticalLayoutImpl <em>YUi Vertical Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiVerticalLayoutImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiVerticalLayout()
		 * @generated
		 */
		EClass YUI_VERTICAL_LAYOUT = eINSTANCE.getYUiVerticalLayout();
		/**
		 * The meta object literal for the '<em><b>Cell Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_VERTICAL_LAYOUT__CELL_STYLES = eINSTANCE.getYUiVerticalLayout_CellStyles();
		/**
		 * The meta object literal for the '<em><b>Fill Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_VERTICAL_LAYOUT__FILL_VERTICAL = eINSTANCE.getYUiVerticalLayout_FillVertical();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiVerticalLayoutCellStyleImpl <em>YUi Vertical Layout Cell Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiVerticalLayoutCellStyleImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiVerticalLayoutCellStyle()
		 * @generated
		 */
		EClass YUI_VERTICAL_LAYOUT_CELL_STYLE = eINSTANCE.getYUiVerticalLayoutCellStyle();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_VERTICAL_LAYOUT_CELL_STYLE__TARGET = eINSTANCE.getYUiVerticalLayoutCellStyle_Target();
		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_VERTICAL_LAYOUT_CELL_STYLE__ALIGNMENT = eINSTANCE.getYUiVerticalLayoutCellStyle_Alignment();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiSpanInfoImpl <em>YUi Span Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiSpanInfoImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiSpanInfo()
		 * @generated
		 */
		EClass YUI_SPAN_INFO = eINSTANCE.getYUiSpanInfo();
		/**
		 * The meta object literal for the '<em><b>Column From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_SPAN_INFO__COLUMN_FROM = eINSTANCE.getYUiSpanInfo_ColumnFrom();
		/**
		 * The meta object literal for the '<em><b>Row From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_SPAN_INFO__ROW_FROM = eINSTANCE.getYUiSpanInfo_RowFrom();
		/**
		 * The meta object literal for the '<em><b>Column To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_SPAN_INFO__COLUMN_TO = eINSTANCE.getYUiSpanInfo_ColumnTo();
		/**
		 * The meta object literal for the '<em><b>Row To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_SPAN_INFO__ROW_TO = eINSTANCE.getYUiSpanInfo_RowTo();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTableImpl <em>YUi Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTableImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiTable()
		 * @generated
		 */
		EClass YUI_TABLE = eINSTANCE.getYUiTable();
		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_TABLE__DATATYPE = eINSTANCE.getYUiTable_Datatype();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_TABLE__DATADESCRIPTION = eINSTANCE.getYUiTable_Datadescription();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiLabelImpl <em>YUi Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiLabelImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiLabel()
		 * @generated
		 */
		EClass YUI_LABEL = eINSTANCE.getYUiLabel();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_LABEL__DATADESCRIPTION = eINSTANCE.getYUiLabel_Datadescription();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextAreaImpl <em>YUi Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextAreaImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiTextArea()
		 * @generated
		 */
		EClass YUI_TEXT_AREA = eINSTANCE.getYUiTextArea();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_TEXT_AREA__DATADESCRIPTION = eINSTANCE.getYUiTextArea_Datadescription();
		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_TEXT_AREA__DATATYPE = eINSTANCE.getYUiTextArea_Datatype();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiCheckBoxImpl <em>YUi Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiCheckBoxImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiCheckBox()
		 * @generated
		 */
		EClass YUI_CHECK_BOX = eINSTANCE.getYUiCheckBox();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_CHECK_BOX__DATADESCRIPTION = eINSTANCE.getYUiCheckBox_Datadescription();
		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_CHECK_BOX__DATATYPE = eINSTANCE.getYUiCheckBox_Datatype();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiInputImpl <em>YUi Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiInputImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiInput()
		 * @generated
		 */
		EClass YUI_INPUT = eINSTANCE.getYUiInput();
		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_INPUT__READONLY = eINSTANCE.getYUiInput_Readonly();
		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_INPUT__ENABLED = eINSTANCE.getYUiInput_Enabled();
		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_INPUT__REQUIRED = eINSTANCE.getYUiInput_Required();
		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_INPUT__VISIBLE = eINSTANCE.getYUiInput_Visible();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiDecimalFieldImpl <em>YUi Decimal Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiDecimalFieldImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiDecimalField()
		 * @generated
		 */
		EClass YUI_DECIMAL_FIELD = eINSTANCE.getYUiDecimalField();
		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_DECIMAL_FIELD__DATATYPE = eINSTANCE.getYUiDecimalField_Datatype();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_DECIMAL_FIELD__DATADESCRIPTION = eINSTANCE.getYUiDecimalField_Datadescription();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiNumericFieldImpl <em>YUi Numeric Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiNumericFieldImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiNumericField()
		 * @generated
		 */
		EClass YUI_NUMERIC_FIELD = eINSTANCE.getYUiNumericField();
		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_NUMERIC_FIELD__DATATYPE = eINSTANCE.getYUiNumericField_Datatype();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_NUMERIC_FIELD__DATADESCRIPTION = eINSTANCE.getYUiNumericField_Datadescription();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiComboBoxImpl <em>YUi Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiComboBoxImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiComboBox()
		 * @generated
		 */
		EClass YUI_COMBO_BOX = eINSTANCE.getYUiComboBox();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_COMBO_BOX__DATADESCRIPTION = eINSTANCE.getYUiComboBox_Datadescription();
		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_COMBO_BOX__DATATYPE = eINSTANCE.getYUiComboBox_Datatype();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiListImpl <em>YUi List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiListImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiList()
		 * @generated
		 */
		EClass YUI_LIST = eINSTANCE.getYUiList();
		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_LIST__DATADESCRIPTION = eINSTANCE.getYUiList_Datadescription();
		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_LIST__DATATYPE = eINSTANCE.getYUiList_Datatype();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutImpl <em>YUi Horizontal Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiHorizontalLayout()
		 * @generated
		 */
		EClass YUI_HORIZONTAL_LAYOUT = eINSTANCE.getYUiHorizontalLayout();
		/**
		 * The meta object literal for the '<em><b>Cell Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YUI_HORIZONTAL_LAYOUT__CELL_STYLES = eINSTANCE.getYUiHorizontalLayout_CellStyles();
		/**
		 * The meta object literal for the '<em><b>Fill Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_HORIZONTAL_LAYOUT__FILL_HORIZONTAL = eINSTANCE.getYUiHorizontalLayout_FillHorizontal();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment <em>YUi Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiAlignment()
		 * @generated
		 */
		EEnum YUI_ALIGNMENT = eINSTANCE.getYUiAlignment();

	}

} //UimodelExtensionPackage
