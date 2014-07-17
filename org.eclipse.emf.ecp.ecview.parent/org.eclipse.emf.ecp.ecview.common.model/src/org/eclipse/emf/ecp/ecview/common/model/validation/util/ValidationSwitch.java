/**
 */
package org.eclipse.emf.ecp.ecview.common.model.validation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.validation.*;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;

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
				if (result == null) result = caseYBindable(yValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YMIN_LENGTH_VALIDATOR: {
				YMinLengthValidator yMinLengthValidator = (YMinLengthValidator)theEObject;
				T result = caseYMinLengthValidator(yMinLengthValidator);
				if (result == null) result = caseYValidator(yMinLengthValidator);
				if (result == null) result = caseYMinLengthValidationConfig(yMinLengthValidator);
				if (result == null) result = caseYElement(yMinLengthValidator);
				if (result == null) result = caseYBindable(yMinLengthValidator);
				if (result == null) result = caseYValidationConfig(yMinLengthValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YMAX_LENGTH_VALIDATOR: {
				YMaxLengthValidator yMaxLengthValidator = (YMaxLengthValidator)theEObject;
				T result = caseYMaxLengthValidator(yMaxLengthValidator);
				if (result == null) result = caseYValidator(yMaxLengthValidator);
				if (result == null) result = caseYMaxLengthValidationConfig(yMaxLengthValidator);
				if (result == null) result = caseYElement(yMaxLengthValidator);
				if (result == null) result = caseYBindable(yMaxLengthValidator);
				if (result == null) result = caseYValidationConfig(yMaxLengthValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YREGEXP_VALIDATOR: {
				YRegexpValidator yRegexpValidator = (YRegexpValidator)theEObject;
				T result = caseYRegexpValidator(yRegexpValidator);
				if (result == null) result = caseYValidator(yRegexpValidator);
				if (result == null) result = caseYRegexpValidationConfig(yRegexpValidator);
				if (result == null) result = caseYElement(yRegexpValidator);
				if (result == null) result = caseYBindable(yRegexpValidator);
				if (result == null) result = caseYValidationConfig(yRegexpValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YCLASS_DELEGATE_VALIDATOR: {
				YClassDelegateValidator yClassDelegateValidator = (YClassDelegateValidator)theEObject;
				T result = caseYClassDelegateValidator(yClassDelegateValidator);
				if (result == null) result = caseYValidator(yClassDelegateValidator);
				if (result == null) result = caseYClassDelegateValidationConfig(yClassDelegateValidator);
				if (result == null) result = caseYElement(yClassDelegateValidator);
				if (result == null) result = caseYBindable(yClassDelegateValidator);
				if (result == null) result = caseYValidationConfig(yClassDelegateValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YVALIDATION_CONFIG: {
				YValidationConfig yValidationConfig = (YValidationConfig)theEObject;
				T result = caseYValidationConfig(yValidationConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YMIN_LENGTH_VALIDATION_CONFIG: {
				YMinLengthValidationConfig yMinLengthValidationConfig = (YMinLengthValidationConfig)theEObject;
				T result = caseYMinLengthValidationConfig(yMinLengthValidationConfig);
				if (result == null) result = caseYValidationConfig(yMinLengthValidationConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YMAX_LENGTH_VALIDATION_CONFIG: {
				YMaxLengthValidationConfig yMaxLengthValidationConfig = (YMaxLengthValidationConfig)theEObject;
				T result = caseYMaxLengthValidationConfig(yMaxLengthValidationConfig);
				if (result == null) result = caseYValidationConfig(yMaxLengthValidationConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YREGEXP_VALIDATION_CONFIG: {
				YRegexpValidationConfig yRegexpValidationConfig = (YRegexpValidationConfig)theEObject;
				T result = caseYRegexpValidationConfig(yRegexpValidationConfig);
				if (result == null) result = caseYValidationConfig(yRegexpValidationConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.YCLASS_DELEGATE_VALIDATION_CONFIG: {
				YClassDelegateValidationConfig yClassDelegateValidationConfig = (YClassDelegateValidationConfig)theEObject;
				T result = caseYClassDelegateValidationConfig(yClassDelegateValidationConfig);
				if (result == null) result = caseYValidationConfig(yClassDelegateValidationConfig);
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
	 * Returns the result of interpreting the object as an instance of '<em>YClass Delegate Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YClass Delegate Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYClassDelegateValidator(YClassDelegateValidator object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YClass Delegate Validation Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YClass Delegate Validation Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYClassDelegateValidationConfig(YClassDelegateValidationConfig object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YBindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBindable(YBindable object) {
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
