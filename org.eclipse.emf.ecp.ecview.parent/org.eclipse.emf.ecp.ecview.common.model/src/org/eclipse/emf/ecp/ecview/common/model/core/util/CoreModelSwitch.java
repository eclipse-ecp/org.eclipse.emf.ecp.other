/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.model.core.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ecview.common.model.core.*;

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
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage
 * @generated
 */
public class CoreModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoreModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModelSwitch() {
		if (modelPackage == null) {
			modelPackage = CoreModelPackage.eINSTANCE;
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
			case CoreModelPackage.YELEMENT: {
				YElement yElement = (YElement)theEObject;
				T result = caseYElement(yElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YLAYOUT: {
				YLayout yLayout = (YLayout)theEObject;
				T result = caseYLayout(yLayout);
				if (result == null) result = caseYEmbeddable(yLayout);
				if (result == null) result = caseYElement(yLayout);
				if (result == null) result = caseYCssAble(yLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YFIELD: {
				YField yField = (YField)theEObject;
				T result = caseYField(yField);
				if (result == null) result = caseYEmbeddable(yField);
				if (result == null) result = caseYElement(yField);
				if (result == null) result = caseYCssAble(yField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YVIEW: {
				YView yView = (YView)theEObject;
				T result = caseYView(yView);
				if (result == null) result = caseYElement(yView);
				if (result == null) result = caseYCssAble(yView);
				if (result == null) result = caseYMarginable(yView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YVIEW_SET: {
				YViewSet yViewSet = (YViewSet)theEObject;
				T result = caseYViewSet(yViewSet);
				if (result == null) result = caseYElement(yViewSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE: {
				YEmbeddable yEmbeddable = (YEmbeddable)theEObject;
				T result = caseYEmbeddable(yEmbeddable);
				if (result == null) result = caseYElement(yEmbeddable);
				if (result == null) result = caseYCssAble(yEmbeddable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YCSS_ABLE: {
				YCssAble yCssAble = (YCssAble)theEObject;
				T result = caseYCssAble(yCssAble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YMARGINABLE: {
				YMarginable yMarginable = (YMarginable)theEObject;
				T result = caseYMarginable(yMarginable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YSPACINGABLE: {
				YSpacingable ySpacingable = (YSpacingable)theEObject;
				T result = caseYSpacingable(ySpacingable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YHEIGHTABLE: {
				YHeightable yHeightable = (YHeightable)theEObject;
				T result = caseYHeightable(yHeightable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YWIDTHABLE: {
				YWidthable yWidthable = (YWidthable)theEObject;
				T result = caseYWidthable(yWidthable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YBINDABLE: {
				YBindable yBindable = (YBindable)theEObject;
				T result = caseYBindable(yBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>YLayout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YLayout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYLayout(YLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYField(YField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YView</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YView</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYView(YView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YView Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YView Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYViewSet(YViewSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddable(YEmbeddable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCss Able</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCss Able</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCssAble(YCssAble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMarginable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMarginable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMarginable(YMarginable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSpacingable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSpacingable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSpacingable(YSpacingable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YHeightable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YHeightable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYHeightable(YHeightable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YWidthable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YWidthable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYWidthable(YWidthable object) {
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

} //UiModelSwitch
