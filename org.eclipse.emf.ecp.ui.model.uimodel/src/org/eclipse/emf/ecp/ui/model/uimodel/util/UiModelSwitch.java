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
package org.eclipse.emf.ecp.ui.model.uimodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ui.model.uimodel.*;
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiRoot;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiView;

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
 * @see org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage
 * @generated
 */
public class UiModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiModelSwitch() {
		if (modelPackage == null) {
			modelPackage = UiModelPackage.eINSTANCE;
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
			case UiModelPackage.YUI_ELEMENT: {
				YUiElement yUiElement = (YUiElement)theEObject;
				T result = caseYUiElement(yUiElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.YUI_LAYOUT: {
				YUiLayout yUiLayout = (YUiLayout)theEObject;
				T result = caseYUiLayout(yUiLayout);
				if (result == null) result = caseYUiEmbeddable(yUiLayout);
				if (result == null) result = caseYUiElement(yUiLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.YUI_FIELD: {
				YUiField yUiField = (YUiField)theEObject;
				T result = caseYUiField(yUiField);
				if (result == null) result = caseYUiEmbeddable(yUiField);
				if (result == null) result = caseYUiElement(yUiField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.YUI_VIEW: {
				YUiView yUiView = (YUiView)theEObject;
				T result = caseYUiView(yUiView);
				if (result == null) result = caseYUiLayout(yUiView);
				if (result == null) result = caseYUiEmbeddable(yUiView);
				if (result == null) result = caseYUiElement(yUiView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.YUI_ROOT: {
				YUiRoot yUiRoot = (YUiRoot)theEObject;
				T result = caseYUiRoot(yUiRoot);
				if (result == null) result = caseYUiElement(yUiRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiModelPackage.YUI_EMBEDDABLE: {
				YUiEmbeddable yUiEmbeddable = (YUiEmbeddable)theEObject;
				T result = caseYUiEmbeddable(yUiEmbeddable);
				if (result == null) result = caseYUiElement(yUiEmbeddable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiElement(YUiElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiLayout(YUiLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiField(YUiField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiView(YUiView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiRoot(YUiRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Embeddable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiEmbeddable(YUiEmbeddable object) {
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
