/**
 */
package org.eclipse.emf.ecp.ecview.common.model.validation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.validation.*;

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
 * @see org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage
 * @generated
 */
public class ValidationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValidationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationSwitch() {
		if (modelPackage == null) {
			modelPackage = ValidationPackage.eINSTANCE;
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
			case ValidationPackage.YVALIDATOR: {
				YValidator yValidator = (YValidator)theEObject;
				T result = caseYValidator(yValidator);
				if (result == null) result = caseYElement(yValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YMIN_LENGTH_VALIDATOR: {
				YMinLengthValidator yMinLengthValidator = (YMinLengthValidator)theEObject;
				T result = caseYMinLengthValidator(yMinLengthValidator);
				if (result == null) result = caseYValidator(yMinLengthValidator);
				if (result == null) result = caseYMinLengthValidatable(yMinLengthValidator);
				if (result == null) result = caseYElement(yMinLengthValidator);
				if (result == null) result = caseYValidatable(yMinLengthValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YMAX_LENGTH_VALIDATOR: {
				YMaxLengthValidator yMaxLengthValidator = (YMaxLengthValidator)theEObject;
				T result = caseYMaxLengthValidator(yMaxLengthValidator);
				if (result == null) result = caseYValidator(yMaxLengthValidator);
				if (result == null) result = caseYMaxLengthValidatable(yMaxLengthValidator);
				if (result == null) result = caseYElement(yMaxLengthValidator);
				if (result == null) result = caseYValidatable(yMaxLengthValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YREGEXP_VALIDATOR: {
				YRegexpValidator yRegexpValidator = (YRegexpValidator)theEObject;
				T result = caseYRegexpValidator(yRegexpValidator);
				if (result == null) result = caseYValidator(yRegexpValidator);
				if (result == null) result = caseYRegexpValidatable(yRegexpValidator);
				if (result == null) result = caseYElement(yRegexpValidator);
				if (result == null) result = caseYValidatable(yRegexpValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YVALIDATABLE: {
				YValidatable yValidatable = (YValidatable)theEObject;
				T result = caseYValidatable(yValidatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YMIN_LENGTH_VALIDATABLE: {
				YMinLengthValidatable yMinLengthValidatable = (YMinLengthValidatable)theEObject;
				T result = caseYMinLengthValidatable(yMinLengthValidatable);
				if (result == null) result = caseYValidatable(yMinLengthValidatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YMAX_LENGTH_VALIDATABLE: {
				YMaxLengthValidatable yMaxLengthValidatable = (YMaxLengthValidatable)theEObject;
				T result = caseYMaxLengthValidatable(yMaxLengthValidatable);
				if (result == null) result = caseYValidatable(yMaxLengthValidatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YREGEXP_VALIDATABLE: {
				YRegexpValidatable yRegexpValidatable = (YRegexpValidatable)theEObject;
				T result = caseYRegexpValidatable(yRegexpValidatable);
				if (result == null) result = caseYValidatable(yRegexpValidatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YValidator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YValidator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYValidator(YValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMin Length Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMin Length Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMinLengthValidator(YMinLengthValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMax Length Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMax Length Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMaxLengthValidator(YMaxLengthValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YRegexp Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YRegexp Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYRegexpValidator(YRegexpValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YValidatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YValidatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYValidatable(YValidatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMin Length Validatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMin Length Validatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMinLengthValidatable(YMinLengthValidatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMax Length Validatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMax Length Validatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMaxLengthValidatable(YMaxLengthValidatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YRegexp Validatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YRegexp Validatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYRegexpValidatable(YRegexpValidatable object) {
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

} //ValidationSwitch
