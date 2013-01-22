/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiBindable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiMarginable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiSpacingable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.*;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiDecimalField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiNumericField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea;
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
				if (result == null) result = caseYUiInput(yUiTextField);
				if (result == null) result = caseYUiBindable(yUiTextField);
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
				if (result == null) result = caseYUiSpacingable(yUiGridLayout);
				if (result == null) result = caseYUiMarginable(yUiGridLayout);
				if (result == null) result = caseYUiEmbeddable(yUiGridLayout);
				if (result == null) result = caseYUiElement(yUiGridLayout);
				if (result == null) result = caseYUiCssAble(yUiGridLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE: {
				YUiGridLayoutCellStyle yUiGridLayoutCellStyle = (YUiGridLayoutCellStyle)theEObject;
				T result = caseYUiGridLayoutCellStyle(yUiGridLayoutCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT: {
				YUiHorizontalLayout yUiHorizontalLayout = (YUiHorizontalLayout)theEObject;
				T result = caseYUiHorizontalLayout(yUiHorizontalLayout);
				if (result == null) result = caseYUiLayout(yUiHorizontalLayout);
				if (result == null) result = caseYUiSpacingable(yUiHorizontalLayout);
				if (result == null) result = caseYUiMarginable(yUiHorizontalLayout);
				if (result == null) result = caseYUiEmbeddable(yUiHorizontalLayout);
				if (result == null) result = caseYUiElement(yUiHorizontalLayout);
				if (result == null) result = caseYUiCssAble(yUiHorizontalLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT_CELL_STYLE: {
				YUiHorizontalLayoutCellStyle yUiHorizontalLayoutCellStyle = (YUiHorizontalLayoutCellStyle)theEObject;
				T result = caseYUiHorizontalLayoutCellStyle(yUiHorizontalLayoutCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_VERTICAL_LAYOUT: {
				YUiVerticalLayout yUiVerticalLayout = (YUiVerticalLayout)theEObject;
				T result = caseYUiVerticalLayout(yUiVerticalLayout);
				if (result == null) result = caseYUiLayout(yUiVerticalLayout);
				if (result == null) result = caseYUiSpacingable(yUiVerticalLayout);
				if (result == null) result = caseYUiMarginable(yUiVerticalLayout);
				if (result == null) result = caseYUiEmbeddable(yUiVerticalLayout);
				if (result == null) result = caseYUiElement(yUiVerticalLayout);
				if (result == null) result = caseYUiCssAble(yUiVerticalLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_VERTICAL_LAYOUT_CELL_STYLE: {
				YUiVerticalLayoutCellStyle yUiVerticalLayoutCellStyle = (YUiVerticalLayoutCellStyle)theEObject;
				T result = caseYUiVerticalLayoutCellStyle(yUiVerticalLayoutCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_SPAN_INFO: {
				YUiSpanInfo yUiSpanInfo = (YUiSpanInfo)theEObject;
				T result = caseYUiSpanInfo(yUiSpanInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_TABLE: {
				YUiTable yUiTable = (YUiTable)theEObject;
				T result = caseYUiTable(yUiTable);
				if (result == null) result = caseYUiInput(yUiTable);
				if (result == null) result = caseYUiBindable(yUiTable);
				if (result == null) result = caseYUiField(yUiTable);
				if (result == null) result = caseYUiEmbeddable(yUiTable);
				if (result == null) result = caseYUiElement(yUiTable);
				if (result == null) result = caseYUiCssAble(yUiTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_LABEL: {
				YUiLabel yUiLabel = (YUiLabel)theEObject;
				T result = caseYUiLabel(yUiLabel);
				if (result == null) result = caseYUiField(yUiLabel);
				if (result == null) result = caseYUiBindable(yUiLabel);
				if (result == null) result = caseYUiEmbeddable(yUiLabel);
				if (result == null) result = caseYUiElement(yUiLabel);
				if (result == null) result = caseYUiCssAble(yUiLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_TEXT_AREA: {
				YUiTextArea yUiTextArea = (YUiTextArea)theEObject;
				T result = caseYUiTextArea(yUiTextArea);
				if (result == null) result = caseYUiInput(yUiTextArea);
				if (result == null) result = caseYUiBindable(yUiTextArea);
				if (result == null) result = caseYUiField(yUiTextArea);
				if (result == null) result = caseYUiEmbeddable(yUiTextArea);
				if (result == null) result = caseYUiElement(yUiTextArea);
				if (result == null) result = caseYUiCssAble(yUiTextArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_CHECK_BOX: {
				YUiCheckBox yUiCheckBox = (YUiCheckBox)theEObject;
				T result = caseYUiCheckBox(yUiCheckBox);
				if (result == null) result = caseYUiInput(yUiCheckBox);
				if (result == null) result = caseYUiBindable(yUiCheckBox);
				if (result == null) result = caseYUiField(yUiCheckBox);
				if (result == null) result = caseYUiEmbeddable(yUiCheckBox);
				if (result == null) result = caseYUiElement(yUiCheckBox);
				if (result == null) result = caseYUiCssAble(yUiCheckBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_INPUT: {
				YUiInput yUiInput = (YUiInput)theEObject;
				T result = caseYUiInput(yUiInput);
				if (result == null) result = caseYUiField(yUiInput);
				if (result == null) result = caseYUiEmbeddable(yUiInput);
				if (result == null) result = caseYUiElement(yUiInput);
				if (result == null) result = caseYUiCssAble(yUiInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_DECIMAL_FIELD: {
				YUiDecimalField yUiDecimalField = (YUiDecimalField)theEObject;
				T result = caseYUiDecimalField(yUiDecimalField);
				if (result == null) result = caseYUiInput(yUiDecimalField);
				if (result == null) result = caseYUiBindable(yUiDecimalField);
				if (result == null) result = caseYUiField(yUiDecimalField);
				if (result == null) result = caseYUiEmbeddable(yUiDecimalField);
				if (result == null) result = caseYUiElement(yUiDecimalField);
				if (result == null) result = caseYUiCssAble(yUiDecimalField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_NUMERIC_FIELD: {
				YUiNumericField yUiNumericField = (YUiNumericField)theEObject;
				T result = caseYUiNumericField(yUiNumericField);
				if (result == null) result = caseYUiInput(yUiNumericField);
				if (result == null) result = caseYUiBindable(yUiNumericField);
				if (result == null) result = caseYUiField(yUiNumericField);
				if (result == null) result = caseYUiEmbeddable(yUiNumericField);
				if (result == null) result = caseYUiElement(yUiNumericField);
				if (result == null) result = caseYUiCssAble(yUiNumericField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_COMBO_BOX: {
				YUiComboBox yUiComboBox = (YUiComboBox)theEObject;
				T result = caseYUiComboBox(yUiComboBox);
				if (result == null) result = caseYUiInput(yUiComboBox);
				if (result == null) result = caseYUiBindable(yUiComboBox);
				if (result == null) result = caseYUiField(yUiComboBox);
				if (result == null) result = caseYUiEmbeddable(yUiComboBox);
				if (result == null) result = caseYUiElement(yUiComboBox);
				if (result == null) result = caseYUiCssAble(yUiComboBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UimodelExtensionPackage.YUI_LIST: {
				YUiList yUiList = (YUiList)theEObject;
				T result = caseYUiList(yUiList);
				if (result == null) result = caseYUiInput(yUiList);
				if (result == null) result = caseYUiBindable(yUiList);
				if (result == null) result = caseYUiField(yUiList);
				if (result == null) result = caseYUiEmbeddable(yUiList);
				if (result == null) result = caseYUiElement(yUiList);
				if (result == null) result = caseYUiCssAble(yUiList);
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
	 * Returns the result of interpreting the object as an instance of '<em>YUi Horizontal Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Horizontal Layout Cell Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiHorizontalLayoutCellStyle(YUiHorizontalLayoutCellStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Vertical Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Vertical Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiVerticalLayout(YUiVerticalLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Vertical Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Vertical Layout Cell Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiVerticalLayoutCellStyle(YUiVerticalLayoutCellStyle object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YUi Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiTable(YUiTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiLabel(YUiLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiTextArea(YUiTextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Check Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiCheckBox(YUiCheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiInput(YUiInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Decimal Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Decimal Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiDecimalField(YUiDecimalField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Numeric Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Numeric Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiNumericField(YUiNumericField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Combo Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiComboBox(YUiComboBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiList(YUiList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Horizontal Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Horizontal Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiHorizontalLayout(YUiHorizontalLayout object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YUi Bindable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Bindable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiBindable(YUiBindable object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YUi Spacingable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Spacingable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiSpacingable(YUiSpacingable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YUi Marginable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YUi Marginable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYUiMarginable(YUiMarginable object) {
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
