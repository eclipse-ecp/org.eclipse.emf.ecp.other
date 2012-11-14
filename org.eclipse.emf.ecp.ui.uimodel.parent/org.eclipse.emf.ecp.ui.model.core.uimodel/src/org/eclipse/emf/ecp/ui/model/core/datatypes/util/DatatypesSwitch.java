/**
 */
package org.eclipse.emf.ecp.ui.model.core.datatypes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ui.model.core.datatypes.*;
import org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType;

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
 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesSwitch() {
		if (modelPackage == null) {
			modelPackage = DatatypesPackage.eINSTANCE;
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
			case DatatypesPackage.YDT_BASE: {
				YDtBase yDtBase = (YDtBase)theEObject;
				T result = caseYDtBase(yDtBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.YTEXT_DTYPE: {
				YTextDType yTextDType = (YTextDType)theEObject;
				T result = caseYTextDType(yTextDType);
				if (result == null) result = caseYDtDatatype(yTextDType);
				if (result == null) result = caseYDtBase(yTextDType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.YDT_DATATYPE: {
				YDtDatatype yDtDatatype = (YDtDatatype)theEObject;
				T result = caseYDtDatatype(yDtDatatype);
				if (result == null) result = caseYDtBase(yDtDatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.YDT_DATADESCRIPTION: {
				YDtDatadescription yDtDatadescription = (YDtDatadescription)theEObject;
				T result = caseYDtDatadescription(yDtDatadescription);
				if (result == null) result = caseYDtBase(yDtDatadescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.YTEXT_DDESC: {
				YTextDDesc yTextDDesc = (YTextDDesc)theEObject;
				T result = caseYTextDDesc(yTextDDesc);
				if (result == null) result = caseYDtDatadescription(yTextDDesc);
				if (result == null) result = caseYDtBase(yTextDDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.YLABEL_DDESC: {
				YLabelDDesc yLabelDDesc = (YLabelDDesc)theEObject;
				T result = caseYLabelDDesc(yLabelDDesc);
				if (result == null) result = caseYDtDatadescription(yLabelDDesc);
				if (result == null) result = caseYDtBase(yLabelDDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.YTEXT_AREA_DTYPE: {
				YTextAreaDType yTextAreaDType = (YTextAreaDType)theEObject;
				T result = caseYTextAreaDType(yTextAreaDType);
				if (result == null) result = caseYDtDatatype(yTextAreaDType);
				if (result == null) result = caseYDtBase(yTextAreaDType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.YTEXT_AREA_DDESC: {
				YTextAreaDDesc yTextAreaDDesc = (YTextAreaDDesc)theEObject;
				T result = caseYTextAreaDDesc(yTextAreaDDesc);
				if (result == null) result = caseYDtDatadescription(yTextAreaDDesc);
				if (result == null) result = caseYDtBase(yTextAreaDDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatatypesPackage.YCHECK_BOX_DDESC: {
				YCheckBoxDDesc yCheckBoxDDesc = (YCheckBoxDDesc)theEObject;
				T result = caseYCheckBoxDDesc(yCheckBoxDDesc);
				if (result == null) result = caseYDtDatadescription(yCheckBoxDDesc);
				if (result == null) result = caseYDtBase(yCheckBoxDDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>YText DType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YText DType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTextDType(YTextDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDt Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDt Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDtDatatype(YDtDatatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDt Datadescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDt Datadescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDtDatadescription(YDtDatadescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YText DDesc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YText DDesc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTextDDesc(YTextDDesc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YLabel DDesc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YLabel DDesc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYLabelDDesc(YLabelDDesc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YText Area DType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YText Area DType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTextAreaDType(YTextAreaDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YText Area DDesc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YText Area DDesc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTextAreaDDesc(YTextAreaDDesc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCheck Box DDesc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCheck Box DDesc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCheckBoxDDesc(YCheckBoxDDesc object) {
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

} //DatatypesSwitch
