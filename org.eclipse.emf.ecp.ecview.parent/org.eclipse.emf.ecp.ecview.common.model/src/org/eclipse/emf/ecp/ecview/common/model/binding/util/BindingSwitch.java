/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ecview.common.model.binding.*;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;

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
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage
 * @generated
 */
public class BindingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BindingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingSwitch() {
		if (modelPackage == null) {
			modelPackage = BindingPackage.eINSTANCE;
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
			case BindingPackage.YBINDING_SET: {
				YBindingSet yBindingSet = (YBindingSet)theEObject;
				T result = caseYBindingSet(yBindingSet);
				if (result == null) result = caseYElement(yBindingSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YBINDING_ENDPOINT: {
				YBindingEndpoint yBindingEndpoint = (YBindingEndpoint)theEObject;
				T result = caseYBindingEndpoint(yBindingEndpoint);
				if (result == null) result = caseYElement(yBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YVALUE_BINDING_ENDPOINT: {
				YValueBindingEndpoint yValueBindingEndpoint = (YValueBindingEndpoint)theEObject;
				T result = caseYValueBindingEndpoint(yValueBindingEndpoint);
				if (result == null) result = caseYBindingEndpoint(yValueBindingEndpoint);
				if (result == null) result = caseYElement(yValueBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YBEAN_VALUE_BINDING_ENDPOINT: {
				YBeanValueBindingEndpoint yBeanValueBindingEndpoint = (YBeanValueBindingEndpoint)theEObject;
				T result = caseYBeanValueBindingEndpoint(yBeanValueBindingEndpoint);
				if (result == null) result = caseYValueBindingEndpoint(yBeanValueBindingEndpoint);
				if (result == null) result = caseYBindingEndpoint(yBeanValueBindingEndpoint);
				if (result == null) result = caseYElement(yBeanValueBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT: {
				YDetailValueBindingEndpoint yDetailValueBindingEndpoint = (YDetailValueBindingEndpoint)theEObject;
				T result = caseYDetailValueBindingEndpoint(yDetailValueBindingEndpoint);
				if (result == null) result = caseYValueBindingEndpoint(yDetailValueBindingEndpoint);
				if (result == null) result = caseYBindingEndpoint(yDetailValueBindingEndpoint);
				if (result == null) result = caseYElement(yDetailValueBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YLIST_BINDING_ENDPOINT: {
				YListBindingEndpoint yListBindingEndpoint = (YListBindingEndpoint)theEObject;
				T result = caseYListBindingEndpoint(yListBindingEndpoint);
				if (result == null) result = caseYBindingEndpoint(yListBindingEndpoint);
				if (result == null) result = caseYElement(yListBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YBINDING: {
				YBinding yBinding = (YBinding)theEObject;
				T result = caseYBinding(yBinding);
				if (result == null) result = caseYElement(yBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YVALUE_BINDING: {
				YValueBinding yValueBinding = (YValueBinding)theEObject;
				T result = caseYValueBinding(yValueBinding);
				if (result == null) result = caseYBinding(yValueBinding);
				if (result == null) result = caseYElement(yValueBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YLIST_BINDING: {
				YListBinding yListBinding = (YListBinding)theEObject;
				T result = caseYListBinding(yListBinding);
				if (result == null) result = caseYBinding(yListBinding);
				if (result == null) result = caseYElement(yListBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YENUM_LIST_BINDING_ENDPOINT: {
				YEnumListBindingEndpoint yEnumListBindingEndpoint = (YEnumListBindingEndpoint)theEObject;
				T result = caseYEnumListBindingEndpoint(yEnumListBindingEndpoint);
				if (result == null) result = caseYListBindingEndpoint(yEnumListBindingEndpoint);
				if (result == null) result = caseYBindingEndpoint(yEnumListBindingEndpoint);
				if (result == null) result = caseYElement(yEnumListBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBinding Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBinding Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBindingSet(YBindingSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBinding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBinding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBindingEndpoint(YBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YValue Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YValue Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYValueBindingEndpoint(YValueBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBean Value Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBean Value Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBeanValueBindingEndpoint(YBeanValueBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YList Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YList Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYListBindingEndpoint(YListBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBinding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBinding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBinding(YBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YValue Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YValue Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYValueBinding(YValueBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YList Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YList Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYListBinding(YListBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEnum List Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEnum List Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEnumListBindingEndpoint(YEnumListBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDetail Value Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDetail Value Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDetailValueBindingEndpoint(YDetailValueBindingEndpoint object) {
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

} //BindingSwitch
