/**
 */
package org.eclipse.emf.ecp.ecview.ui.core.model.extension.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YElement;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YField;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YSpacingable;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.*;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YHorizontalLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YInput;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YList;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YSpanInfo;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YVerticalLayoutCellStyle;

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
 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.ExtensionModelPackage
 * @generated
 */
public class ExtensionModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtensionModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ExtensionModelPackage.eINSTANCE;
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
			case ExtensionModelPackage.YTEXT_FIELD: {
				YTextField yTextField = (YTextField)theEObject;
				T result = caseYTextField(yTextField);
				if (result == null) result = caseYInput(yTextField);
				if (result == null) result = caseYBindable(yTextField);
				if (result == null) result = caseYField(yTextField);
				if (result == null) result = caseYEmbeddable(yTextField);
				if (result == null) result = caseYElement(yTextField);
				if (result == null) result = caseYCssAble(yTextField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YGRID_LAYOUT: {
				YGridLayout yGridLayout = (YGridLayout)theEObject;
				T result = caseYGridLayout(yGridLayout);
				if (result == null) result = caseYLayout(yGridLayout);
				if (result == null) result = caseYSpacingable(yGridLayout);
				if (result == null) result = caseYMarginable(yGridLayout);
				if (result == null) result = caseYEmbeddable(yGridLayout);
				if (result == null) result = caseYElement(yGridLayout);
				if (result == null) result = caseYCssAble(yGridLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YGRID_LAYOUT_CELL_STYLE: {
				YGridLayoutCellStyle yGridLayoutCellStyle = (YGridLayoutCellStyle)theEObject;
				T result = caseYGridLayoutCellStyle(yGridLayoutCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT: {
				YHorizontalLayout yHorizontalLayout = (YHorizontalLayout)theEObject;
				T result = caseYHorizontalLayout(yHorizontalLayout);
				if (result == null) result = caseYLayout(yHorizontalLayout);
				if (result == null) result = caseYSpacingable(yHorizontalLayout);
				if (result == null) result = caseYMarginable(yHorizontalLayout);
				if (result == null) result = caseYEmbeddable(yHorizontalLayout);
				if (result == null) result = caseYElement(yHorizontalLayout);
				if (result == null) result = caseYCssAble(yHorizontalLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YHORIZONTAL_LAYOUT_CELL_STYLE: {
				YHorizontalLayoutCellStyle yHorizontalLayoutCellStyle = (YHorizontalLayoutCellStyle)theEObject;
				T result = caseYHorizontalLayoutCellStyle(yHorizontalLayoutCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YVERTICAL_LAYOUT: {
				YVerticalLayout yVerticalLayout = (YVerticalLayout)theEObject;
				T result = caseYVerticalLayout(yVerticalLayout);
				if (result == null) result = caseYLayout(yVerticalLayout);
				if (result == null) result = caseYSpacingable(yVerticalLayout);
				if (result == null) result = caseYMarginable(yVerticalLayout);
				if (result == null) result = caseYEmbeddable(yVerticalLayout);
				if (result == null) result = caseYElement(yVerticalLayout);
				if (result == null) result = caseYCssAble(yVerticalLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YVERTICAL_LAYOUT_CELL_STYLE: {
				YVerticalLayoutCellStyle yVerticalLayoutCellStyle = (YVerticalLayoutCellStyle)theEObject;
				T result = caseYVerticalLayoutCellStyle(yVerticalLayoutCellStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YSPAN_INFO: {
				YSpanInfo ySpanInfo = (YSpanInfo)theEObject;
				T result = caseYSpanInfo(ySpanInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTABLE: {
				YTable yTable = (YTable)theEObject;
				T result = caseYTable(yTable);
				if (result == null) result = caseYInput(yTable);
				if (result == null) result = caseYBindable(yTable);
				if (result == null) result = caseYField(yTable);
				if (result == null) result = caseYEmbeddable(yTable);
				if (result == null) result = caseYElement(yTable);
				if (result == null) result = caseYCssAble(yTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YLABEL: {
				YLabel yLabel = (YLabel)theEObject;
				T result = caseYLabel(yLabel);
				if (result == null) result = caseYField(yLabel);
				if (result == null) result = caseYBindable(yLabel);
				if (result == null) result = caseYEmbeddable(yLabel);
				if (result == null) result = caseYElement(yLabel);
				if (result == null) result = caseYCssAble(yLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTEXT_AREA: {
				YTextArea yTextArea = (YTextArea)theEObject;
				T result = caseYTextArea(yTextArea);
				if (result == null) result = caseYInput(yTextArea);
				if (result == null) result = caseYBindable(yTextArea);
				if (result == null) result = caseYField(yTextArea);
				if (result == null) result = caseYEmbeddable(yTextArea);
				if (result == null) result = caseYElement(yTextArea);
				if (result == null) result = caseYCssAble(yTextArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YCHECK_BOX: {
				YCheckBox yCheckBox = (YCheckBox)theEObject;
				T result = caseYCheckBox(yCheckBox);
				if (result == null) result = caseYInput(yCheckBox);
				if (result == null) result = caseYBindable(yCheckBox);
				if (result == null) result = caseYField(yCheckBox);
				if (result == null) result = caseYEmbeddable(yCheckBox);
				if (result == null) result = caseYElement(yCheckBox);
				if (result == null) result = caseYCssAble(yCheckBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YINPUT: {
				YInput yInput = (YInput)theEObject;
				T result = caseYInput(yInput);
				if (result == null) result = caseYField(yInput);
				if (result == null) result = caseYEmbeddable(yInput);
				if (result == null) result = caseYElement(yInput);
				if (result == null) result = caseYCssAble(yInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YDECIMAL_FIELD: {
				YDecimalField yDecimalField = (YDecimalField)theEObject;
				T result = caseYDecimalField(yDecimalField);
				if (result == null) result = caseYInput(yDecimalField);
				if (result == null) result = caseYBindable(yDecimalField);
				if (result == null) result = caseYField(yDecimalField);
				if (result == null) result = caseYEmbeddable(yDecimalField);
				if (result == null) result = caseYElement(yDecimalField);
				if (result == null) result = caseYCssAble(yDecimalField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YNUMERIC_FIELD: {
				YNumericField yNumericField = (YNumericField)theEObject;
				T result = caseYNumericField(yNumericField);
				if (result == null) result = caseYInput(yNumericField);
				if (result == null) result = caseYBindable(yNumericField);
				if (result == null) result = caseYField(yNumericField);
				if (result == null) result = caseYEmbeddable(yNumericField);
				if (result == null) result = caseYElement(yNumericField);
				if (result == null) result = caseYCssAble(yNumericField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YCOMBO_BOX: {
				YComboBox yComboBox = (YComboBox)theEObject;
				T result = caseYComboBox(yComboBox);
				if (result == null) result = caseYInput(yComboBox);
				if (result == null) result = caseYBindable(yComboBox);
				if (result == null) result = caseYField(yComboBox);
				if (result == null) result = caseYEmbeddable(yComboBox);
				if (result == null) result = caseYElement(yComboBox);
				if (result == null) result = caseYCssAble(yComboBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YLIST: {
				YList yList = (YList)theEObject;
				T result = caseYList(yList);
				if (result == null) result = caseYInput(yList);
				if (result == null) result = caseYBindable(yList);
				if (result == null) result = caseYField(yList);
				if (result == null) result = caseYEmbeddable(yList);
				if (result == null) result = caseYElement(yList);
				if (result == null) result = caseYCssAble(yList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YText Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YText Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTextField(YTextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YGrid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YGrid Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYGridLayout(YGridLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YGrid Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YGrid Layout Cell Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYGridLayoutCellStyle(YGridLayoutCellStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YHorizontal Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YHorizontal Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYHorizontalLayout(YHorizontalLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YHorizontal Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YHorizontal Layout Cell Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYHorizontalLayoutCellStyle(YHorizontalLayoutCellStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVertical Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVertical Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVerticalLayout(YVerticalLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YVertical Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVertical Layout Cell Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVerticalLayoutCellStyle(YVerticalLayoutCellStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YSpan Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YSpan Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYSpanInfo(YSpanInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTable(YTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YLabel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YLabel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYLabel(YLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YText Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YText Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTextArea(YTextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCheck Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCheck Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCheckBox(YCheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YInput</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YInput</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYInput(YInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDecimal Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDecimal Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDecimalField(YDecimalField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YNumeric Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YNumeric Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYNumericField(YNumericField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCombo Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCombo Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYComboBox(YComboBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YList</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YList</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYList(YList object) {
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

} //ExtensionModelSwitch
