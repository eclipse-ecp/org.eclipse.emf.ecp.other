/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YButton;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDateTime;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YList;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YOptionsGroup;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YProgressBar;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSelectionType;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTab;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YToggleButton;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTree;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.listener.YButtonClickListener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionModelFactoryImpl extends EFactoryImpl implements ExtensionModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtensionModelFactory init() {
		try {
			ExtensionModelFactory theExtensionModelFactory = (ExtensionModelFactory)EPackage.Registry.INSTANCE.getEFactory(ExtensionModelPackage.eNS_URI);
			if (theExtensionModelFactory != null) {
				return theExtensionModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExtensionModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelFactoryImpl() {
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
			case ExtensionModelPackage.YTEXT_FIELD: return createYTextField();
			case ExtensionModelPackage.YGRID_LAYOUT: return createYGridLayout();
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE: return createYGridLayoutCellStyle();
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT: return createYHorizontalLayout();
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT_CELL_STYLE: return createYHorizontalLayoutCellStyle();
			case ExtensionModelPackage.YVERTICAL_LAYOUT: return createYVerticalLayout();
			case ExtensionModelPackage.YVERTICAL_LAYOUT_CELL_STYLE: return createYVerticalLayoutCellStyle();
			case ExtensionModelPackage.YSPAN_INFO: return createYSpanInfo();
			case ExtensionModelPackage.YTABLE: return createYTable();
			case ExtensionModelPackage.YTREE: return createYTree();
			case ExtensionModelPackage.YOPTIONS_GROUP: return createYOptionsGroup();
			case ExtensionModelPackage.YLIST: return createYList();
			case ExtensionModelPackage.YLABEL: return createYLabel();
			case ExtensionModelPackage.YTEXT_AREA: return createYTextArea();
			case ExtensionModelPackage.YCHECK_BOX: return createYCheckBox();
			case ExtensionModelPackage.YBROWSER: return createYBrowser();
			case ExtensionModelPackage.YDATE_TIME: return createYDateTime();
			case ExtensionModelPackage.YDECIMAL_FIELD: return createYDecimalField();
			case ExtensionModelPackage.YNUMERIC_FIELD: return createYNumericField();
			case ExtensionModelPackage.YCOMBO_BOX: return createYComboBox();
			case ExtensionModelPackage.YBUTTON: return createYButton();
			case ExtensionModelPackage.YTOGGLE_BUTTON: return createYToggleButton();
			case ExtensionModelPackage.YPROGRESS_BAR: return createYProgressBar();
			case ExtensionModelPackage.YTAB_SHEET: return createYTabSheet();
			case ExtensionModelPackage.YTAB: return createYTab();
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
			case ExtensionModelPackage.YALIGNMENT:
				return createYAlignmentFromString(eDataType, initialValue);
			case ExtensionModelPackage.YSELECTION_TYPE:
				return createYSelectionTypeFromString(eDataType, initialValue);
			case ExtensionModelPackage.YBUTTON_CLICK_LISTENER:
				return createYButtonClickListenerFromString(eDataType, initialValue);
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
			case ExtensionModelPackage.YALIGNMENT:
				return convertYAlignmentToString(eDataType, instanceValue);
			case ExtensionModelPackage.YSELECTION_TYPE:
				return convertYSelectionTypeToString(eDataType, instanceValue);
			case ExtensionModelPackage.YBUTTON_CLICK_LISTENER:
				return convertYButtonClickListenerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextField createYTextField() {
		YTextFieldImpl yTextField = new YTextFieldImpl();
		return yTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGridLayout createYGridLayout() {
		YGridLayoutImpl yGridLayout = new YGridLayoutImpl();
		return yGridLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YGridLayoutCellStyle createYGridLayoutCellStyle() {
		YGridLayoutCellStyleImpl yGridLayoutCellStyle = new YGridLayoutCellStyleImpl();
		return yGridLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YHorizontalLayout createYHorizontalLayout() {
		YHorizontalLayoutImpl yHorizontalLayout = new YHorizontalLayoutImpl();
		return yHorizontalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YHorizontalLayoutCellStyle createYHorizontalLayoutCellStyle() {
		YHorizontalLayoutCellStyleImpl yHorizontalLayoutCellStyle = new YHorizontalLayoutCellStyleImpl();
		return yHorizontalLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVerticalLayout createYVerticalLayout() {
		YVerticalLayoutImpl yVerticalLayout = new YVerticalLayoutImpl();
		return yVerticalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVerticalLayoutCellStyle createYVerticalLayoutCellStyle() {
		YVerticalLayoutCellStyleImpl yVerticalLayoutCellStyle = new YVerticalLayoutCellStyleImpl();
		return yVerticalLayoutCellStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSpanInfo createYSpanInfo() {
		YSpanInfoImpl ySpanInfo = new YSpanInfoImpl();
		return ySpanInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTable createYTable() {
		YTableImpl yTable = new YTableImpl();
		return yTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YLabel createYLabel() {
		YLabelImpl yLabel = new YLabelImpl();
		return yLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextArea createYTextArea() {
		YTextAreaImpl yTextArea = new YTextAreaImpl();
		return yTextArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCheckBox createYCheckBox() {
		YCheckBoxImpl yCheckBox = new YCheckBoxImpl();
		return yCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBrowser createYBrowser() {
		YBrowserImpl yBrowser = new YBrowserImpl();
		return yBrowser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDateTime createYDateTime() {
		YDateTimeImpl yDateTime = new YDateTimeImpl();
		return yDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDecimalField createYDecimalField() {
		YDecimalFieldImpl yDecimalField = new YDecimalFieldImpl();
		return yDecimalField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YNumericField createYNumericField() {
		YNumericFieldImpl yNumericField = new YNumericFieldImpl();
		return yNumericField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YComboBox createYComboBox() {
		YComboBoxImpl yComboBox = new YComboBoxImpl();
		return yComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YList createYList() {
		YListImpl yList = new YListImpl();
		return yList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YButton createYButton() {
		YButtonImpl yButton = new YButtonImpl();
		return yButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YToggleButton createYToggleButton() {
		YToggleButtonImpl yToggleButton = new YToggleButtonImpl();
		return yToggleButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YProgressBar createYProgressBar() {
		YProgressBarImpl yProgressBar = new YProgressBarImpl();
		return yProgressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTabSheet createYTabSheet() {
		YTabSheetImpl yTabSheet = new YTabSheetImpl();
		return yTabSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTab createYTab() {
		YTabImpl yTab = new YTabImpl();
		return yTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTree createYTree() {
		YTreeImpl yTree = new YTreeImpl();
		return yTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YOptionsGroup createYOptionsGroup() {
		YOptionsGroupImpl yOptionsGroup = new YOptionsGroupImpl();
		return yOptionsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAlignment createYAlignmentFromString(EDataType eDataType, String initialValue) {
		YAlignment result = YAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSelectionType createYSelectionTypeFromString(EDataType eDataType, String initialValue) {
		YSelectionType result = YSelectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYSelectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YButtonClickListener createYButtonClickListenerFromString(EDataType eDataType, String initialValue) {
		return (YButtonClickListener)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYButtonClickListenerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelPackage getExtensionModelPackage() {
		return (ExtensionModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExtensionModelPackage getPackage() {
		return ExtensionModelPackage.eINSTANCE;
	}

} //ExtensionModelFactoryImpl
