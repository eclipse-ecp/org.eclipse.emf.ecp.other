/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.*;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;

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
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage
 * @generated
 */
public class UimodelExtensionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UimodelExtensionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimodelExtensionSwitch() {
		if (modelPackage == null) {
			modelPackage = UimodelExtensionPackage.eINSTANCE;
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
			case UimodelExtensionPackage.YUI_TEXT_FIELD: {
				YUiTextField yUiTextField = (YUiTextField)theEObject;
				T result = caseYUiTextField(yUiTextField);
				if (result == null) result = caseYUiField(yUiTextField);
				if (result == null) result = caseYUiEmbeddable(yUiTextField);
				if (result == null) result = caseYUiElement(yUiTextField);
				if (result == null) result = caseYUiCssAble(yUiTextField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_GRID_LAYOUT: {
				YUiGridLayout yUiGridLayout = (YUiGridLayout)theEObject;
				T result = caseYUiGridLayout(yUiGridLayout);
				if (result == null) result = caseYUiLayout(yUiGridLayout);
				if (result == null) result = caseYUiEmbeddable(yUiGridLayout);
				if (result == null) result = caseYUiElement(yUiGridLayout);
				if (result == null) result = caseYUiCssAble(yUiGridLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL: {
				YUiGridLayoutCell yUiGridLayoutCell = (YUiGridLayoutCell)theEObject;
				T result = caseYUiGridLayoutCell(yUiGridLayoutCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE: {
				YUiGridLayoutCellStyle yUiGridLayoutCellStyle = (YUiGridLayoutCellStyle)theEObject;
				T result = caseYUiGridLayoutCellStyle(yUiGridLayoutCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_SPAN_INFO: {
				YUiSpanInfo yUiSpanInfo = (YUiSpanInfo)theEObject;
				T result = caseYUiSpanInfo(yUiSpanInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Text Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiTextField(YUiTextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Grid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Grid Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiGridLayout(YUiGridLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Grid Layout Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Grid Layout Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiGridLayoutCell(YUiGridLayoutCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Grid Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Grid Layout Cell Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiGridLayoutCellStyle(YUiGridLayoutCellStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Span Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Span Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiSpanInfo(YUiSpanInfo object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>YUi Css Able</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Css Able</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiCssAble(YUiCssAble object) {
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

} //UimodelExtensionSwitch
