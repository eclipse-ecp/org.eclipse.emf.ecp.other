/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.datatypes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDtBase;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidationConfig;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage
 * @generated
 */
public class ExtDatatypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtDatatypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtDatatypesSwitch() {
		if (modelPackage == null) {
			modelPackage = ExtDatatypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExtDatatypesPackage.YTEXT_DATATYPE: {
				YTextDatatype yTextDatatype = (YTextDatatype)theEObject;
				T result = caseYTextDatatype(yTextDatatype);
				if (result == null) result = caseYDatatype(yTextDatatype);
				if (result == null) result = caseYMaxLengthValidationConfig(yTextDatatype);
				if (result == null) result = caseYMinLengthValidationConfig(yTextDatatype);
				if (result == null) result = caseYRegexpValidationConfig(yTextDatatype);
				if (result == null) result = caseYDtBase(yTextDatatype);
				if (result == null) result = caseYValidationConfig(yTextDatatype);
				if (result == null) result = caseYElement(yTextDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YTEXT_AREA_DATATYPE: {
				YTextAreaDatatype yTextAreaDatatype = (YTextAreaDatatype)theEObject;
				T result = caseYTextAreaDatatype(yTextAreaDatatype);
				if (result == null) result = caseYDatatype(yTextAreaDatatype);
				if (result == null) result = caseYMinLengthValidationConfig(yTextAreaDatatype);
				if (result == null) result = caseYMaxLengthValidationConfig(yTextAreaDatatype);
				if (result == null) result = caseYRegexpValidationConfig(yTextAreaDatatype);
				if (result == null) result = caseYDtBase(yTextAreaDatatype);
				if (result == null) result = caseYValidationConfig(yTextAreaDatatype);
				if (result == null) result = caseYElement(yTextAreaDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YNUMERIC_DATATYPE: {
				YNumericDatatype yNumericDatatype = (YNumericDatatype)theEObject;
				T result = caseYNumericDatatype(yNumericDatatype);
				if (result == null) result = caseYDatatype(yNumericDatatype);
				if (result == null) result = caseYRegexpValidationConfig(yNumericDatatype);
				if (result == null) result = caseYDtBase(yNumericDatatype);
				if (result == null) result = caseYValidationConfig(yNumericDatatype);
				if (result == null) result = caseYElement(yNumericDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YDECIMAL_DATATYPE: {
				YDecimalDatatype yDecimalDatatype = (YDecimalDatatype)theEObject;
				T result = caseYDecimalDatatype(yDecimalDatatype);
				if (result == null) result = caseYNumericDatatype(yDecimalDatatype);
				if (result == null) result = caseYDatatype(yDecimalDatatype);
				if (result == null) result = caseYRegexpValidationConfig(yDecimalDatatype);
				if (result == null) result = caseYDtBase(yDecimalDatatype);
				if (result == null) result = caseYValidationConfig(yDecimalDatatype);
				if (result == null) result = caseYElement(yDecimalDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YTABLE_DATATYPE: {
				YTableDatatype yTableDatatype = (YTableDatatype)theEObject;
				T result = caseYTableDatatype(yTableDatatype);
				if (result == null) result = caseYDatatype(yTableDatatype);
				if (result == null) result = caseYDtBase(yTableDatatype);
				if (result == null) result = caseYElement(yTableDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YCHECK_BOX_DATATYPE: {
				YCheckBoxDatatype yCheckBoxDatatype = (YCheckBoxDatatype)theEObject;
				T result = caseYCheckBoxDatatype(yCheckBoxDatatype);
				if (result == null) result = caseYDatatype(yCheckBoxDatatype);
				if (result == null) result = caseYDtBase(yCheckBoxDatatype);
				if (result == null) result = caseYElement(yCheckBoxDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YCOMBO_BOX_DATATYPE: {
				YComboBoxDatatype yComboBoxDatatype = (YComboBoxDatatype)theEObject;
				T result = caseYComboBoxDatatype(yComboBoxDatatype);
				if (result == null) result = caseYDatatype(yComboBoxDatatype);
				if (result == null) result = caseYDtBase(yComboBoxDatatype);
				if (result == null) result = caseYElement(yComboBoxDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YLIST_DATA_TYPE: {
				YListDataType yListDataType = (YListDataType)theEObject;
				T result = caseYListDataType(yListDataType);
				if (result == null) result = caseYDatatype(yListDataType);
				if (result == null) result = caseYDtBase(yListDataType);
				if (result == null) result = caseYElement(yListDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YOPTIONS_GROUP_DATA_TYPE: {
				YOptionsGroupDataType yOptionsGroupDataType = (YOptionsGroupDataType)theEObject;
				T result = caseYOptionsGroupDataType(yOptionsGroupDataType);
				if (result == null) result = caseYDatatype(yOptionsGroupDataType);
				if (result == null) result = caseYDtBase(yOptionsGroupDataType);
				if (result == null) result = caseYElement(yOptionsGroupDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YBROWSER_DATATYPE: {
				YBrowserDatatype yBrowserDatatype = (YBrowserDatatype)theEObject;
				T result = caseYBrowserDatatype(yBrowserDatatype);
				if (result == null) result = caseYDatatype(yBrowserDatatype);
				if (result == null) result = caseYDtBase(yBrowserDatatype);
				if (result == null) result = caseYElement(yBrowserDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YDATE_TIME_DATATYPE: {
				YDateTimeDatatype yDateTimeDatatype = (YDateTimeDatatype)theEObject;
				T result = caseYDateTimeDatatype(yDateTimeDatatype);
				if (result == null) result = caseYDatatype(yDateTimeDatatype);
				if (result == null) result = caseYDtBase(yDateTimeDatatype);
				if (result == null) result = caseYElement(yDateTimeDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YTREE_DATATYPE: {
				YTreeDatatype yTreeDatatype = (YTreeDatatype)theEObject;
				T result = caseYTreeDatatype(yTreeDatatype);
				if (result == null) result = caseYDatatype(yTreeDatatype);
				if (result == null) result = caseYDtBase(yTreeDatatype);
				if (result == null) result = caseYElement(yTreeDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YPROGRESS_BAR_DATATYPE: {
				YProgressBarDatatype yProgressBarDatatype = (YProgressBarDatatype)theEObject;
				T result = caseYProgressBarDatatype(yProgressBarDatatype);
				if (result == null) result = caseYDatatype(yProgressBarDatatype);
				if (result == null) result = caseYDtBase(yProgressBarDatatype);
				if (result == null) result = caseYElement(yProgressBarDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtDatatypesPackage.YTAB_SHEET_DATATYPE: {
				YTabSheetDatatype yTabSheetDatatype = (YTabSheetDatatype)theEObject;
				T result = caseYTabSheetDatatype(yTabSheetDatatype);
				if (result == null) result = caseYDatatype(yTabSheetDatatype);
				if (result == null) result = caseYDtBase(yTabSheetDatatype);
				if (result == null) result = caseYElement(yTabSheetDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YText Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YText Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTextDatatype(YTextDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YText Area Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YText Area Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTextAreaDatatype(YTextAreaDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YNumeric Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YNumeric Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYNumericDatatype(YNumericDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDecimal Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDecimal Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDecimalDatatype(YDecimalDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTable Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTable Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTableDatatype(YTableDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCheck Box Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCheck Box Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCheckBoxDatatype(YCheckBoxDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCombo Box Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCombo Box Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYComboBoxDatatype(YComboBoxDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YList Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YList Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYListDataType(YListDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YOptions Group Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YOptions Group Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYOptionsGroupDataType(YOptionsGroupDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBrowser Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBrowser Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBrowserDatatype(YBrowserDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDate Time Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDate Time Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDateTimeDatatype(YDateTimeDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTree Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTree Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTreeDatatype(YTreeDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YProgress Bar Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YProgress Bar Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYProgressBarDatatype(YProgressBarDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTab Sheet Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTab Sheet Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTabSheetDatatype(YTabSheetDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYElement(YElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDt Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDt Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDtBase(YDtBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDatatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDatatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDatatype(YDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YValidation Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YValidation Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYValidationConfig(YValidationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMax Length Validation Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMax Length Validation Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMaxLengthValidationConfig(YMaxLengthValidationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMin Length Validation Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMin Length Validation Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMinLengthValidationConfig(YMinLengthValidationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YRegexp Validation Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YRegexp Validation Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYRegexpValidationConfig(YRegexpValidationConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExtDatatypesSwitch
