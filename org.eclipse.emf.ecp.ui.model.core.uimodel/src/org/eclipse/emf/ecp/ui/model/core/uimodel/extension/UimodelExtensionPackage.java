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
	 * The number of structural features of the '<em>YUi Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD_FEATURE_COUNT = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 0;


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
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__CELL_STYLES = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__SPACING = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__MARGIN = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT__COLUMNS = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YUi Grid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT_FEATURE_COUNT = UiModelPackage.YUI_LAYOUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellImpl <em>YUi Grid Layout Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiGridLayoutCell()
	 * @generated
	 */
	int YUI_GRID_LAYOUT_CELL = 2;

	/**
	 * The number of structural features of the '<em>YUi Grid Layout Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT_CELL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl <em>YUi Grid Layout Cell Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiGridLayoutCellStyle()
	 * @generated
	 */
	int YUI_GRID_LAYOUT_CELL_STYLE = 3;

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
	 * The feature id for the '<em><b>Grab Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL = 2;

	/**
	 * The feature id for the '<em><b>Grab Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL = 3;

	/**
	 * The feature id for the '<em><b>Span Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO = 4;

	/**
	 * The number of structural features of the '<em>YUi Grid Layout Cell Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_GRID_LAYOUT_CELL_STYLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiSpanInfoImpl <em>YUi Span Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiSpanInfoImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiSpanInfo()
	 * @generated
	 */
	int YUI_SPAN_INFO = 4;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment <em>YUi Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiAlignment()
	 * @generated
	 */
	int YUI_ALIGNMENT = 5;


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
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#isSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#isSpacing()
	 * @see #getYUiGridLayout()
	 * @generated
	 */
	EAttribute getYUiGridLayout_Spacing();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#isMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#isMargin()
	 * @see #getYUiGridLayout()
	 * @generated
	 */
	EAttribute getYUiGridLayout_Margin();

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
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCell <em>YUi Grid Layout Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Grid Layout Cell</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCell
	 * @generated
	 */
	EClass getYUiGridLayoutCell();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#isGrabHorizontal <em>Grab Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Horizontal</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#isGrabHorizontal()
	 * @see #getYUiGridLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYUiGridLayoutCellStyle_GrabHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#isGrabVertical <em>Grab Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Vertical</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle#isGrabVertical()
	 * @see #getYUiGridLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYUiGridLayoutCellStyle_GrabVertical();

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
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_GRID_LAYOUT__SPACING = eINSTANCE.getYUiGridLayout_Spacing();
		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_GRID_LAYOUT__MARGIN = eINSTANCE.getYUiGridLayout_Margin();
		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_GRID_LAYOUT__COLUMNS = eINSTANCE.getYUiGridLayout_Columns();
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellImpl <em>YUi Grid Layout Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiGridLayoutCell()
		 * @generated
		 */
		EClass YUI_GRID_LAYOUT_CELL = eINSTANCE.getYUiGridLayoutCell();
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
		 * The meta object literal for the '<em><b>Grab Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL = eINSTANCE.getYUiGridLayoutCellStyle_GrabHorizontal();
		/**
		 * The meta object literal for the '<em><b>Grab Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL = eINSTANCE.getYUiGridLayoutCellStyle_GrabVertical();
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
