/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
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
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.*;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YAction;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YHeightable;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable;
import org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;
import org.eclipse.emf.ecp.ecview.common.model.core.YWidthable;

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
				if (result == null) result = caseYVisibleable(yLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YFIELD: {
				YField yField = (YField)theEObject;
				T result = caseYField(yField);
				if (result == null) result = caseYEmbeddable(yField);
				if (result == null) result = caseYEditable(yField);
				if (result == null) result = caseYEnable(yField);
				if (result == null) result = caseYElement(yField);
				if (result == null) result = caseYCssAble(yField);
				if (result == null) result = caseYVisibleable(yField);
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
				if (result == null) result = caseYVisibleable(yEmbeddable);
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
			case CoreModelPackage.YACTIVATEABLE: {
				YActivateable yActivateable = (YActivateable)theEObject;
				T result = caseYActivateable(yActivateable);
				if (result == null) result = caseYBindable(yActivateable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YVISIBLEABLE: {
				YVisibleable yVisibleable = (YVisibleable)theEObject;
				T result = caseYVisibleable(yVisibleable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEDITABLE: {
				YEditable yEditable = (YEditable)theEObject;
				T result = caseYEditable(yEditable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YENABLE: {
				YEnable yEnable = (YEnable)theEObject;
				T result = caseYEnable(yEnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YACTION: {
				YAction yAction = (YAction)theEObject;
				T result = caseYAction(yAction);
				if (result == null) result = caseYEmbeddable(yAction);
				if (result == null) result = caseYEnable(yAction);
				if (result == null) result = caseYElement(yAction);
				if (result == null) result = caseYCssAble(yAction);
				if (result == null) result = caseYVisibleable(yAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YBINDABLE: {
				YBindable yBindable = (YBindable)theEObject;
				T result = caseYBindable(yBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YVALUE_BINDABLE: {
				YValueBindable yValueBindable = (YValueBindable)theEObject;
				T result = caseYValueBindable(yValueBindable);
				if (result == null) result = caseYBindable(yValueBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YSELECTION_BINDABLE: {
				YSelectionBindable ySelectionBindable = (YSelectionBindable)theEObject;
				T result = caseYSelectionBindable(ySelectionBindable);
				if (result == null) result = caseYBindable(ySelectionBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YMULTI_SELECTION_BINDABLE: {
				YMultiSelectionBindable yMultiSelectionBindable = (YMultiSelectionBindable)theEObject;
				T result = caseYMultiSelectionBindable(yMultiSelectionBindable);
				if (result == null) result = caseYBindable(yMultiSelectionBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YCOLLECTION_BINDABLE: {
				YCollectionBindable yCollectionBindable = (YCollectionBindable)theEObject;
				T result = caseYCollectionBindable(yCollectionBindable);
				if (result == null) result = caseYBindable(yCollectionBindable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YCONTEXT_BINDING_ENDPOINT: {
				YContextBindingEndpoint yContextBindingEndpoint = (YContextBindingEndpoint)theEObject;
				T result = caseYContextBindingEndpoint(yContextBindingEndpoint);
				if (result == null) result = caseYValueBindingEndpoint(yContextBindingEndpoint);
				if (result == null) result = caseYBindingEndpoint(yContextBindingEndpoint);
				if (result == null) result = caseYElement(yContextBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE_BINDING_ENDPOINT: {
				YEmbeddableBindingEndpoint yEmbeddableBindingEndpoint = (YEmbeddableBindingEndpoint)theEObject;
				T result = caseYEmbeddableBindingEndpoint(yEmbeddableBindingEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT: {
				YEmbeddableValueEndpoint yEmbeddableValueEndpoint = (YEmbeddableValueEndpoint)theEObject;
				T result = caseYEmbeddableValueEndpoint(yEmbeddableValueEndpoint);
				if (result == null) result = caseYValueBindingEndpoint(yEmbeddableValueEndpoint);
				if (result == null) result = caseYEmbeddableBindingEndpoint(yEmbeddableValueEndpoint);
				if (result == null) result = caseYBindingEndpoint(yEmbeddableValueEndpoint);
				if (result == null) result = caseYElement(yEmbeddableValueEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT: {
				YEmbeddableSelectionEndpoint yEmbeddableSelectionEndpoint = (YEmbeddableSelectionEndpoint)theEObject;
				T result = caseYEmbeddableSelectionEndpoint(yEmbeddableSelectionEndpoint);
				if (result == null) result = caseYValueBindingEndpoint(yEmbeddableSelectionEndpoint);
				if (result == null) result = caseYEmbeddableBindingEndpoint(yEmbeddableSelectionEndpoint);
				if (result == null) result = caseYBindingEndpoint(yEmbeddableSelectionEndpoint);
				if (result == null) result = caseYElement(yEmbeddableSelectionEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE_MULTI_SELECTION_ENDPOINT: {
				YEmbeddableMultiSelectionEndpoint yEmbeddableMultiSelectionEndpoint = (YEmbeddableMultiSelectionEndpoint)theEObject;
				T result = caseYEmbeddableMultiSelectionEndpoint(yEmbeddableMultiSelectionEndpoint);
				if (result == null) result = caseYListBindingEndpoint(yEmbeddableMultiSelectionEndpoint);
				if (result == null) result = caseYEmbeddableBindingEndpoint(yEmbeddableMultiSelectionEndpoint);
				if (result == null) result = caseYBindingEndpoint(yEmbeddableMultiSelectionEndpoint);
				if (result == null) result = caseYElement(yEmbeddableMultiSelectionEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YEMBEDDABLE_COLLECTION_ENDPOINT: {
				YEmbeddableCollectionEndpoint yEmbeddableCollectionEndpoint = (YEmbeddableCollectionEndpoint)theEObject;
				T result = caseYEmbeddableCollectionEndpoint(yEmbeddableCollectionEndpoint);
				if (result == null) result = caseYListBindingEndpoint(yEmbeddableCollectionEndpoint);
				if (result == null) result = caseYEmbeddableBindingEndpoint(yEmbeddableCollectionEndpoint);
				if (result == null) result = caseYBindingEndpoint(yEmbeddableCollectionEndpoint);
				if (result == null) result = caseYElement(yEmbeddableCollectionEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CoreModelPackage.YACTIVATED_ENDPOINT: {
				YActivatedEndpoint yActivatedEndpoint = (YActivatedEndpoint)theEObject;
				T result = caseYActivatedEndpoint(yActivatedEndpoint);
				if (result == null) result = caseYValueBindingEndpoint(yActivatedEndpoint);
				if (result == null) result = caseYEmbeddableBindingEndpoint(yActivatedEndpoint);
				if (result == null) result = caseYBindingEndpoint(yActivatedEndpoint);
				if (result == null) result = caseYElement(yActivatedEndpoint);
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
	 * Returns the result of interpreting the object as an instance of '<em>YActivateable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YActivateable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYActivateable(YActivateable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVisibleable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVisibleable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVisibleable(YVisibleable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEditable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEditable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEditable(YEditable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEnable(YEnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYAction(YAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YValue Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YValue Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYValueBindable(YValueBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSelection Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSelection Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSelectionBindable(YSelectionBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMulti Selection Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMulti Selection Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMultiSelectionBindable(YMultiSelectionBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCollection Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCollection Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCollectionBindable(YCollectionBindable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YContext Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YContext Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYContextBindingEndpoint(YContextBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable Binding Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable Binding Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddableBindingEndpoint(YEmbeddableBindingEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable Value Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable Value Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddableValueEndpoint(YEmbeddableValueEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable Selection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable Selection Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddableSelectionEndpoint(YEmbeddableSelectionEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable Multi Selection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable Multi Selection Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddableMultiSelectionEndpoint(YEmbeddableMultiSelectionEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable Collection Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable Collection Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddableCollectionEndpoint(YEmbeddableCollectionEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YActivated Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YActivated Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYActivatedEndpoint(YActivatedEndpoint object) {
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
