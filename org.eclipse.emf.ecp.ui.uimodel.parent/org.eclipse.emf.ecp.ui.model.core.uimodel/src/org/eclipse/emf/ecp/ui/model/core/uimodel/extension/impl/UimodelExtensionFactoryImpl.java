/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.*;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiDecimalField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiNumericField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UimodelExtensionFactoryImpl extends EFactoryImpl implements UimodelExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UimodelExtensionFactory init() {
		try {
			UimodelExtensionFactory theUimodelExtensionFactory = (UimodelExtensionFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclipse.org/emf/emfclient/uimodel/basicExtension"); 
			if (theUimodelExtensionFactory != null) {
				return theUimodelExtensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UimodelExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimodelExtensionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UimodelExtensionPackage.YUI_TEXT_FIELD: return createYUiTextField();
			case UimodelExtensionPackage.YUI_GRID_LAYOUT: return createYUiGridLayout();
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE: return createYUiGridLayoutCellStyle();
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT: return createYUiHorizontalLayout();
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT_CELL_STYLE: return createYUiHorizontalLayoutCellStyle();
			case UimodelExtensionPackage.YUI_VERTICAL_LAYOUT: return createYUiVerticalLayout();
			case UimodelExtensionPackage.YUI_VERTICAL_LAYOUT_CELL_STYLE: return createYUiVerticalLayoutCellStyle();
			case UimodelExtensionPackage.YUI_SPAN_INFO: return createYUiSpanInfo();
			case UimodelExtensionPackage.YUI_TABLE: return createYUiTable();
			case UimodelExtensionPackage.YUI_LABEL: return createYUiLabel();
			case UimodelExtensionPackage.YUI_TEXT_AREA: return createYUiTextArea();
			case UimodelExtensionPackage.YUI_CHECK_BOX: return createYUiCheckBox();
			case UimodelExtensionPackage.YUI_DECIMAL_FIELD: return createYUiDecimalField();
			case UimodelExtensionPackage.YUI_NUMERIC_FIELD: return createYUiNumericField();
			case UimodelExtensionPackage.YUI_COMBO_BOX: return createYUiComboBox();
			case UimodelExtensionPackage.YUI_LIST: return createYUiList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UimodelExtensionPackage.YUI_ALIGNMENT:
				return createYUiAlignmentFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UimodelExtensionPackage.YUI_ALIGNMENT:
				return convertYUiAlignmentToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiTextField createYUiTextField() {
		YUiTextFieldImpl yUiTextField = new YUiTextFieldImpl();
		return yUiTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiGridLayout createYUiGridLayout() {
		YUiGridLayoutImpl yUiGridLayout = new YUiGridLayoutImpl();
		return yUiGridLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiGridLayoutCellStyle createYUiGridLayoutCellStyle() {
		YUiGridLayoutCellStyleImpl yUiGridLayoutCellStyle = new YUiGridLayoutCellStyleImpl();
		return yUiGridLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiHorizontalLayoutCellStyle createYUiHorizontalLayoutCellStyle() {
		YUiHorizontalLayoutCellStyleImpl yUiHorizontalLayoutCellStyle = new YUiHorizontalLayoutCellStyleImpl();
		return yUiHorizontalLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiVerticalLayout createYUiVerticalLayout() {
		YUiVerticalLayoutImpl yUiVerticalLayout = new YUiVerticalLayoutImpl();
		return yUiVerticalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiVerticalLayoutCellStyle createYUiVerticalLayoutCellStyle() {
		YUiVerticalLayoutCellStyleImpl yUiVerticalLayoutCellStyle = new YUiVerticalLayoutCellStyleImpl();
		return yUiVerticalLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiSpanInfo createYUiSpanInfo() {
		YUiSpanInfoImpl yUiSpanInfo = new YUiSpanInfoImpl();
		return yUiSpanInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiTable createYUiTable() {
		YUiTableImpl yUiTable = new YUiTableImpl();
		return yUiTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiLabel createYUiLabel() {
		YUiLabelImpl yUiLabel = new YUiLabelImpl();
		return yUiLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiTextArea createYUiTextArea() {
		YUiTextAreaImpl yUiTextArea = new YUiTextAreaImpl();
		return yUiTextArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiCheckBox createYUiCheckBox() {
		YUiCheckBoxImpl yUiCheckBox = new YUiCheckBoxImpl();
		return yUiCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiDecimalField createYUiDecimalField() {
		YUiDecimalFieldImpl yUiDecimalField = new YUiDecimalFieldImpl();
		return yUiDecimalField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiNumericField createYUiNumericField() {
		YUiNumericFieldImpl yUiNumericField = new YUiNumericFieldImpl();
		return yUiNumericField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiComboBox createYUiComboBox() {
		YUiComboBoxImpl yUiComboBox = new YUiComboBoxImpl();
		return yUiComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiList createYUiList() {
		YUiListImpl yUiList = new YUiListImpl();
		return yUiList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiHorizontalLayout createYUiHorizontalLayout() {
		YUiHorizontalLayoutImpl yUiHorizontalLayout = new YUiHorizontalLayoutImpl();
		return yUiHorizontalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiAlignment createYUiAlignmentFromString(EDataType eDataType, String initialValue) {
		YUiAlignment result = YUiAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYUiAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimodelExtensionPackage getUimodelExtensionPackage() {
		return (UimodelExtensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UimodelExtensionPackage getPackage() {
		return UimodelExtensionPackage.eINSTANCE;
	}

} //UimodelExtensionFactoryImpl
