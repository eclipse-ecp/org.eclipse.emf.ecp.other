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
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo;
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
			case UimodelExtensionPackage.YUI_SPAN_INFO: return createYUiSpanInfo();
			case UimodelExtensionPackage.YUI_TABLE: return createYUiTable();
			case UimodelExtensionPackage.YUI_LABEL: return createYUiLabel();
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
