/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.*;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YBrowserDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YCheckBoxDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YComboBoxDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeFormat;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDecimalDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YListDataType;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YOptionsGroupDataType;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YProgressBarDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTabSheetDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTableDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextAreaDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTreeDatatype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtDatatypesFactoryImpl extends EFactoryImpl implements ExtDatatypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtDatatypesFactory init() {
		try {
			ExtDatatypesFactory theExtDatatypesFactory = (ExtDatatypesFactory)EPackage.Registry.INSTANCE.getEFactory(ExtDatatypesPackage.eNS_URI);
			if (theExtDatatypesFactory != null) {
				return theExtDatatypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtDatatypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtDatatypesFactoryImpl() {
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
			case ExtDatatypesPackage.YTEXT_DATATYPE: return createYTextDatatype();
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE: return createYTextAreaDatatype();
			case ExtDatatypesPackage.YNUMERIC_DATATYPE: return createYNumericDatatype();
			case ExtDatatypesPackage.YDECIMAL_DATATYPE: return createYDecimalDatatype();
			case ExtDatatypesPackage.YTABLE_DATATYPE: return createYTableDatatype();
			case ExtDatatypesPackage.YCHECK_BOX_DATATYPE: return createYCheckBoxDatatype();
			case ExtDatatypesPackage.YCOMBO_BOX_DATATYPE: return createYComboBoxDatatype();
			case ExtDatatypesPackage.YLIST_DATA_TYPE: return createYListDataType();
			case ExtDatatypesPackage.YOPTIONS_GROUP_DATA_TYPE: return createYOptionsGroupDataType();
			case ExtDatatypesPackage.YBROWSER_DATATYPE: return createYBrowserDatatype();
			case ExtDatatypesPackage.YDATE_TIME_DATATYPE: return createYDateTimeDatatype();
			case ExtDatatypesPackage.YTREE_DATATYPE: return createYTreeDatatype();
			case ExtDatatypesPackage.YPROGRESS_BAR_DATATYPE: return createYProgressBarDatatype();
			case ExtDatatypesPackage.YTAB_SHEET_DATATYPE: return createYTabSheetDatatype();
			case ExtDatatypesPackage.YMASTER_DETAIL_DATATYPE: return createYMasterDetailDatatype();
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
			case ExtDatatypesPackage.YDATE_TIME_FORMAT:
				return createYDateTimeFormatFromString(eDataType, initialValue);
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
			case ExtDatatypesPackage.YDATE_TIME_FORMAT:
				return convertYDateTimeFormatToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextDatatype createYTextDatatype() {
		YTextDatatypeImpl yTextDatatype = new YTextDatatypeImpl();
		return yTextDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextAreaDatatype createYTextAreaDatatype() {
		YTextAreaDatatypeImpl yTextAreaDatatype = new YTextAreaDatatypeImpl();
		return yTextAreaDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNumericDatatype createYNumericDatatype() {
		YNumericDatatypeImpl yNumericDatatype = new YNumericDatatypeImpl();
		return yNumericDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDecimalDatatype createYDecimalDatatype() {
		YDecimalDatatypeImpl yDecimalDatatype = new YDecimalDatatypeImpl();
		return yDecimalDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTableDatatype createYTableDatatype() {
		YTableDatatypeImpl yTableDatatype = new YTableDatatypeImpl();
		return yTableDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCheckBoxDatatype createYCheckBoxDatatype() {
		YCheckBoxDatatypeImpl yCheckBoxDatatype = new YCheckBoxDatatypeImpl();
		return yCheckBoxDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YComboBoxDatatype createYComboBoxDatatype() {
		YComboBoxDatatypeImpl yComboBoxDatatype = new YComboBoxDatatypeImpl();
		return yComboBoxDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YListDataType createYListDataType() {
		YListDataTypeImpl yListDataType = new YListDataTypeImpl();
		return yListDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YOptionsGroupDataType createYOptionsGroupDataType() {
		YOptionsGroupDataTypeImpl yOptionsGroupDataType = new YOptionsGroupDataTypeImpl();
		return yOptionsGroupDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBrowserDatatype createYBrowserDatatype() {
		YBrowserDatatypeImpl yBrowserDatatype = new YBrowserDatatypeImpl();
		return yBrowserDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDateTimeDatatype createYDateTimeDatatype() {
		YDateTimeDatatypeImpl yDateTimeDatatype = new YDateTimeDatatypeImpl();
		return yDateTimeDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTreeDatatype createYTreeDatatype() {
		YTreeDatatypeImpl yTreeDatatype = new YTreeDatatypeImpl();
		return yTreeDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YProgressBarDatatype createYProgressBarDatatype() {
		YProgressBarDatatypeImpl yProgressBarDatatype = new YProgressBarDatatypeImpl();
		return yProgressBarDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTabSheetDatatype createYTabSheetDatatype() {
		YTabSheetDatatypeImpl yTabSheetDatatype = new YTabSheetDatatypeImpl();
		return yTabSheetDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YMasterDetailDatatype createYMasterDetailDatatype() {
		YMasterDetailDatatypeImpl yMasterDetailDatatype = new YMasterDetailDatatypeImpl();
		return yMasterDetailDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDateTimeFormat createYDateTimeFormatFromString(EDataType eDataType, String initialValue) {
		YDateTimeFormat result = YDateTimeFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYDateTimeFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtDatatypesPackage getExtDatatypesPackage() {
		return (ExtDatatypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtDatatypesPackage getPackage() {
		return ExtDatatypesPackage.eINSTANCE;
	}

} //ExtDatatypesFactoryImpl
