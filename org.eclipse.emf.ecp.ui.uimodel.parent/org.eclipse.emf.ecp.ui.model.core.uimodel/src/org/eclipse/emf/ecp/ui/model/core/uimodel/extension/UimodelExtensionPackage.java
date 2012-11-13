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
	int YUI_TEXT_FIELD__ID = UiModelPackage.YUI_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__CSS_CLASS = UiModelPackage.YUI_FIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__CSS_ID = UiModelPackage.YUI_FIELD__CSS_ID;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__DATADESCRIPTION = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binds To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__BINDS_TO = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YUi Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD_FEATURE_COUNT = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 2;


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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiSpanInfoImpl <em>YUi Span Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiSpanInfoImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiSpanInfo()
	 * @generated
	 */
	int YUI_SPAN_INFO = 3;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTableImpl <em>YUi Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTableImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiTable()
	 * @generated
	 */
	int YUI_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__ID = UiModelPackage.YUI_FIELD__ID;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__CSS_CLASS = UiModelPackage.YUI_FIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE__CSS_ID = UiModelPackage.YUI_FIELD__CSS_ID;

	/**
	 * The number of structural features of the '<em>YUi Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TABLE_FEATURE_COUNT = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiLabelImpl <em>YUi Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiLabelImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiLabel()
	 * @generated
	 */
	int YUI_LABEL = 5;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment <em>YUi Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiAlignment()
	 * @generated
	 */
	int YUI_ALIGNMENT = 6;


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
