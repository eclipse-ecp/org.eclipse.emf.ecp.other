/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.emf.ecp.ecview.common.model.core.YElement;

import org.eclipse.emf.ecp.ecview.common.model.visibility.*;

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
 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage
 * @generated
 */
public class VisibilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisibilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilitySwitch() {
		if (modelPackage == null) {
			modelPackage = VisibilityPackage.eINSTANCE;
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR: {
				YVisibilityProcessor yVisibilityProcessor = (YVisibilityProcessor)theEObject;
				T result = caseYVisibilityProcessor(yVisibilityProcessor);
				if (result == null) result = caseYElement(yVisibilityProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisibilityPackage.YRULED_VISIBILITY_PROCESSOR: {
				YRuledVisibilityProcessor yRuledVisibilityProcessor = (YRuledVisibilityProcessor)theEObject;
				T result = caseYRuledVisibilityProcessor(yRuledVisibilityProcessor);
				if (result == null) result = caseYVisibilityProcessor(yRuledVisibilityProcessor);
				if (result == null) result = caseYElement(yRuledVisibilityProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisibilityPackage.YVISIBILITY_RULE: {
				YVisibilityRule yVisibilityRule = (YVisibilityRule)theEObject;
				T result = caseYVisibilityRule(yVisibilityRule);
				if (result == null) result = caseYElement(yVisibilityRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisibilityPackage.YVISIBILITY_PROPERTIES: {
				YVisibilityProperties yVisibilityProperties = (YVisibilityProperties)theEObject;
				T result = caseYVisibilityProperties(yVisibilityProperties);
				if (result == null) result = caseYElement(yVisibilityProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VisibilityPackage.YCOLOR: {
				YColor yColor = (YColor)theEObject;
				T result = caseYColor(yColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVisibility Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVisibility Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVisibilityProcessor(YVisibilityProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YRuled Visibility Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YRuled Visibility Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYRuledVisibilityProcessor(YRuledVisibilityProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVisibility Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVisibility Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVisibilityRule(YVisibilityRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVisibility Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVisibility Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVisibilityProperties(YVisibilityProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YColor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YColor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYColor(YColor object) {
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

} //VisibilitySwitch
