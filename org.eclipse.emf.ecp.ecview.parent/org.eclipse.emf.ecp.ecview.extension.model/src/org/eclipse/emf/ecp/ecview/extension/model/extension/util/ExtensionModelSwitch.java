/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ecview.common.model.core.YAction;
import org.eclipse.emf.ecp.ecview.common.model.core.YActivateable;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YMultiSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable;
import org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.*;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YButton;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDateTime;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YInput;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YList;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YOptionsGroup;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YProgressBar;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTab;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YToggleButton;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTree;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayoutCellStyle;

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
 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage
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
			case ExtensionModelPackage.YINPUT: {
				YInput yInput = (YInput)theEObject;
				T result = caseYInput(yInput);
				if (result == null) result = caseYField(yInput);
				if (result == null) result = caseYEmbeddable(yInput);
				if (result == null) result = caseYEditable(yInput);
				if (result == null) result = caseYEnable(yInput);
				if (result == null) result = caseYElement(yInput);
				if (result == null) result = caseYCssAble(yInput);
				if (result == null) result = caseYVisibleable(yInput);
				if (result == null) result = caseYVisibilityProcessable(yInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTEXT_FIELD: {
				YTextField yTextField = (YTextField)theEObject;
				T result = caseYTextField(yTextField);
				if (result == null) result = caseYInput(yTextField);
				if (result == null) result = caseYValueBindable(yTextField);
				if (result == null) result = caseYField(yTextField);
				if (result == null) result = caseYBindable(yTextField);
				if (result == null) result = caseYEmbeddable(yTextField);
				if (result == null) result = caseYEditable(yTextField);
				if (result == null) result = caseYEnable(yTextField);
				if (result == null) result = caseYElement(yTextField);
				if (result == null) result = caseYCssAble(yTextField);
				if (result == null) result = caseYVisibleable(yTextField);
				if (result == null) result = caseYVisibilityProcessable(yTextField);
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
				if (result == null) result = caseYVisibleable(yGridLayout);
				if (result == null) result = caseYVisibilityProcessable(yGridLayout);
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
				if (result == null) result = caseYVisibleable(yHorizontalLayout);
				if (result == null) result = caseYVisibilityProcessable(yHorizontalLayout);
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
				if (result == null) result = caseYVisibleable(yVerticalLayout);
				if (result == null) result = caseYVisibilityProcessable(yVerticalLayout);
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
				if (result == null) result = caseYCollectionBindable(yTable);
				if (result == null) result = caseYSelectionBindable(yTable);
				if (result == null) result = caseYMultiSelectionBindable(yTable);
				if (result == null) result = caseYField(yTable);
				if (result == null) result = caseYBindable(yTable);
				if (result == null) result = caseYEmbeddable(yTable);
				if (result == null) result = caseYEditable(yTable);
				if (result == null) result = caseYEnable(yTable);
				if (result == null) result = caseYElement(yTable);
				if (result == null) result = caseYCssAble(yTable);
				if (result == null) result = caseYVisibleable(yTable);
				if (result == null) result = caseYVisibilityProcessable(yTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTREE: {
				YTree yTree = (YTree)theEObject;
				T result = caseYTree(yTree);
				if (result == null) result = caseYInput(yTree);
				if (result == null) result = caseYCollectionBindable(yTree);
				if (result == null) result = caseYSelectionBindable(yTree);
				if (result == null) result = caseYMultiSelectionBindable(yTree);
				if (result == null) result = caseYField(yTree);
				if (result == null) result = caseYBindable(yTree);
				if (result == null) result = caseYEmbeddable(yTree);
				if (result == null) result = caseYEditable(yTree);
				if (result == null) result = caseYEnable(yTree);
				if (result == null) result = caseYElement(yTree);
				if (result == null) result = caseYCssAble(yTree);
				if (result == null) result = caseYVisibleable(yTree);
				if (result == null) result = caseYVisibilityProcessable(yTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YOPTIONS_GROUP: {
				YOptionsGroup yOptionsGroup = (YOptionsGroup)theEObject;
				T result = caseYOptionsGroup(yOptionsGroup);
				if (result == null) result = caseYInput(yOptionsGroup);
				if (result == null) result = caseYCollectionBindable(yOptionsGroup);
				if (result == null) result = caseYSelectionBindable(yOptionsGroup);
				if (result == null) result = caseYMultiSelectionBindable(yOptionsGroup);
				if (result == null) result = caseYField(yOptionsGroup);
				if (result == null) result = caseYBindable(yOptionsGroup);
				if (result == null) result = caseYEmbeddable(yOptionsGroup);
				if (result == null) result = caseYEditable(yOptionsGroup);
				if (result == null) result = caseYEnable(yOptionsGroup);
				if (result == null) result = caseYElement(yOptionsGroup);
				if (result == null) result = caseYCssAble(yOptionsGroup);
				if (result == null) result = caseYVisibleable(yOptionsGroup);
				if (result == null) result = caseYVisibilityProcessable(yOptionsGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YLIST: {
				YList yList = (YList)theEObject;
				T result = caseYList(yList);
				if (result == null) result = caseYInput(yList);
				if (result == null) result = caseYCollectionBindable(yList);
				if (result == null) result = caseYSelectionBindable(yList);
				if (result == null) result = caseYMultiSelectionBindable(yList);
				if (result == null) result = caseYField(yList);
				if (result == null) result = caseYBindable(yList);
				if (result == null) result = caseYEmbeddable(yList);
				if (result == null) result = caseYEditable(yList);
				if (result == null) result = caseYEnable(yList);
				if (result == null) result = caseYElement(yList);
				if (result == null) result = caseYCssAble(yList);
				if (result == null) result = caseYVisibleable(yList);
				if (result == null) result = caseYVisibilityProcessable(yList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YLABEL: {
				YLabel yLabel = (YLabel)theEObject;
				T result = caseYLabel(yLabel);
				if (result == null) result = caseYField(yLabel);
				if (result == null) result = caseYValueBindable(yLabel);
				if (result == null) result = caseYEmbeddable(yLabel);
				if (result == null) result = caseYEditable(yLabel);
				if (result == null) result = caseYEnable(yLabel);
				if (result == null) result = caseYBindable(yLabel);
				if (result == null) result = caseYElement(yLabel);
				if (result == null) result = caseYCssAble(yLabel);
				if (result == null) result = caseYVisibleable(yLabel);
				if (result == null) result = caseYVisibilityProcessable(yLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTEXT_AREA: {
				YTextArea yTextArea = (YTextArea)theEObject;
				T result = caseYTextArea(yTextArea);
				if (result == null) result = caseYInput(yTextArea);
				if (result == null) result = caseYValueBindable(yTextArea);
				if (result == null) result = caseYField(yTextArea);
				if (result == null) result = caseYBindable(yTextArea);
				if (result == null) result = caseYEmbeddable(yTextArea);
				if (result == null) result = caseYEditable(yTextArea);
				if (result == null) result = caseYEnable(yTextArea);
				if (result == null) result = caseYElement(yTextArea);
				if (result == null) result = caseYCssAble(yTextArea);
				if (result == null) result = caseYVisibleable(yTextArea);
				if (result == null) result = caseYVisibilityProcessable(yTextArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YCHECK_BOX: {
				YCheckBox yCheckBox = (YCheckBox)theEObject;
				T result = caseYCheckBox(yCheckBox);
				if (result == null) result = caseYInput(yCheckBox);
				if (result == null) result = caseYValueBindable(yCheckBox);
				if (result == null) result = caseYField(yCheckBox);
				if (result == null) result = caseYBindable(yCheckBox);
				if (result == null) result = caseYEmbeddable(yCheckBox);
				if (result == null) result = caseYEditable(yCheckBox);
				if (result == null) result = caseYEnable(yCheckBox);
				if (result == null) result = caseYElement(yCheckBox);
				if (result == null) result = caseYCssAble(yCheckBox);
				if (result == null) result = caseYVisibleable(yCheckBox);
				if (result == null) result = caseYVisibilityProcessable(yCheckBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YBROWSER: {
				YBrowser yBrowser = (YBrowser)theEObject;
				T result = caseYBrowser(yBrowser);
				if (result == null) result = caseYInput(yBrowser);
				if (result == null) result = caseYValueBindable(yBrowser);
				if (result == null) result = caseYField(yBrowser);
				if (result == null) result = caseYBindable(yBrowser);
				if (result == null) result = caseYEmbeddable(yBrowser);
				if (result == null) result = caseYEditable(yBrowser);
				if (result == null) result = caseYEnable(yBrowser);
				if (result == null) result = caseYElement(yBrowser);
				if (result == null) result = caseYCssAble(yBrowser);
				if (result == null) result = caseYVisibleable(yBrowser);
				if (result == null) result = caseYVisibilityProcessable(yBrowser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YDATE_TIME: {
				YDateTime yDateTime = (YDateTime)theEObject;
				T result = caseYDateTime(yDateTime);
				if (result == null) result = caseYInput(yDateTime);
				if (result == null) result = caseYValueBindable(yDateTime);
				if (result == null) result = caseYField(yDateTime);
				if (result == null) result = caseYBindable(yDateTime);
				if (result == null) result = caseYEmbeddable(yDateTime);
				if (result == null) result = caseYEditable(yDateTime);
				if (result == null) result = caseYEnable(yDateTime);
				if (result == null) result = caseYElement(yDateTime);
				if (result == null) result = caseYCssAble(yDateTime);
				if (result == null) result = caseYVisibleable(yDateTime);
				if (result == null) result = caseYVisibilityProcessable(yDateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YDECIMAL_FIELD: {
				YDecimalField yDecimalField = (YDecimalField)theEObject;
				T result = caseYDecimalField(yDecimalField);
				if (result == null) result = caseYInput(yDecimalField);
				if (result == null) result = caseYValueBindable(yDecimalField);
				if (result == null) result = caseYField(yDecimalField);
				if (result == null) result = caseYBindable(yDecimalField);
				if (result == null) result = caseYEmbeddable(yDecimalField);
				if (result == null) result = caseYEditable(yDecimalField);
				if (result == null) result = caseYEnable(yDecimalField);
				if (result == null) result = caseYElement(yDecimalField);
				if (result == null) result = caseYCssAble(yDecimalField);
				if (result == null) result = caseYVisibleable(yDecimalField);
				if (result == null) result = caseYVisibilityProcessable(yDecimalField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YNUMERIC_FIELD: {
				YNumericField yNumericField = (YNumericField)theEObject;
				T result = caseYNumericField(yNumericField);
				if (result == null) result = caseYInput(yNumericField);
				if (result == null) result = caseYValueBindable(yNumericField);
				if (result == null) result = caseYField(yNumericField);
				if (result == null) result = caseYBindable(yNumericField);
				if (result == null) result = caseYEmbeddable(yNumericField);
				if (result == null) result = caseYEditable(yNumericField);
				if (result == null) result = caseYEnable(yNumericField);
				if (result == null) result = caseYElement(yNumericField);
				if (result == null) result = caseYCssAble(yNumericField);
				if (result == null) result = caseYVisibleable(yNumericField);
				if (result == null) result = caseYVisibilityProcessable(yNumericField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YCOMBO_BOX: {
				YComboBox yComboBox = (YComboBox)theEObject;
				T result = caseYComboBox(yComboBox);
				if (result == null) result = caseYInput(yComboBox);
				if (result == null) result = caseYCollectionBindable(yComboBox);
				if (result == null) result = caseYSelectionBindable(yComboBox);
				if (result == null) result = caseYField(yComboBox);
				if (result == null) result = caseYBindable(yComboBox);
				if (result == null) result = caseYEmbeddable(yComboBox);
				if (result == null) result = caseYEditable(yComboBox);
				if (result == null) result = caseYEnable(yComboBox);
				if (result == null) result = caseYElement(yComboBox);
				if (result == null) result = caseYCssAble(yComboBox);
				if (result == null) result = caseYVisibleable(yComboBox);
				if (result == null) result = caseYVisibilityProcessable(yComboBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YBUTTON: {
				YButton yButton = (YButton)theEObject;
				T result = caseYButton(yButton);
				if (result == null) result = caseYAction(yButton);
				if (result == null) result = caseYEmbeddable(yButton);
				if (result == null) result = caseYEnable(yButton);
				if (result == null) result = caseYElement(yButton);
				if (result == null) result = caseYCssAble(yButton);
				if (result == null) result = caseYVisibleable(yButton);
				if (result == null) result = caseYVisibilityProcessable(yButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTOGGLE_BUTTON: {
				YToggleButton yToggleButton = (YToggleButton)theEObject;
				T result = caseYToggleButton(yToggleButton);
				if (result == null) result = caseYAction(yToggleButton);
				if (result == null) result = caseYActivateable(yToggleButton);
				if (result == null) result = caseYEmbeddable(yToggleButton);
				if (result == null) result = caseYEnable(yToggleButton);
				if (result == null) result = caseYBindable(yToggleButton);
				if (result == null) result = caseYElement(yToggleButton);
				if (result == null) result = caseYCssAble(yToggleButton);
				if (result == null) result = caseYVisibleable(yToggleButton);
				if (result == null) result = caseYVisibilityProcessable(yToggleButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YPROGRESS_BAR: {
				YProgressBar yProgressBar = (YProgressBar)theEObject;
				T result = caseYProgressBar(yProgressBar);
				if (result == null) result = caseYInput(yProgressBar);
				if (result == null) result = caseYValueBindable(yProgressBar);
				if (result == null) result = caseYField(yProgressBar);
				if (result == null) result = caseYBindable(yProgressBar);
				if (result == null) result = caseYEmbeddable(yProgressBar);
				if (result == null) result = caseYEditable(yProgressBar);
				if (result == null) result = caseYEnable(yProgressBar);
				if (result == null) result = caseYElement(yProgressBar);
				if (result == null) result = caseYCssAble(yProgressBar);
				if (result == null) result = caseYVisibleable(yProgressBar);
				if (result == null) result = caseYVisibilityProcessable(yProgressBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTAB_SHEET: {
				YTabSheet yTabSheet = (YTabSheet)theEObject;
				T result = caseYTabSheet(yTabSheet);
				if (result == null) result = caseYEmbeddable(yTabSheet);
				if (result == null) result = caseYElement(yTabSheet);
				if (result == null) result = caseYCssAble(yTabSheet);
				if (result == null) result = caseYVisibleable(yTabSheet);
				if (result == null) result = caseYVisibilityProcessable(yTabSheet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YTAB: {
				YTab yTab = (YTab)theEObject;
				T result = caseYTab(yTab);
				if (result == null) result = caseYElement(yTab);
				if (result == null) result = caseYCssAble(yTab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExtensionModelPackage.YMASTER_DETAIL: {
				YMasterDetail yMasterDetail = (YMasterDetail)theEObject;
				T result = caseYMasterDetail(yMasterDetail);
				if (result == null) result = caseYInput(yMasterDetail);
				if (result == null) result = caseYCollectionBindable(yMasterDetail);
				if (result == null) result = caseYSelectionBindable(yMasterDetail);
				if (result == null) result = caseYField(yMasterDetail);
				if (result == null) result = caseYBindable(yMasterDetail);
				if (result == null) result = caseYEmbeddable(yMasterDetail);
				if (result == null) result = caseYEditable(yMasterDetail);
				if (result == null) result = caseYEnable(yMasterDetail);
				if (result == null) result = caseYElement(yMasterDetail);
				if (result == null) result = caseYCssAble(yMasterDetail);
				if (result == null) result = caseYVisibleable(yMasterDetail);
				if (result == null) result = caseYVisibilityProcessable(yMasterDetail);
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
	 * Returns the result of interpreting the object as an instance of '<em>YBrowser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBrowser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBrowser(YBrowser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YDate Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YDate Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYDateTime(YDateTime object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YButton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YButton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYButton(YButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YToggle Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YToggle Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYToggleButton(YToggleButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YProgress Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YProgress Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYProgressBar(YProgressBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTab Sheet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTab Sheet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTabSheet(YTabSheet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTab(YTab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YMaster Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YMaster Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYMasterDetail(YMasterDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YTree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YTree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYTree(YTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YOptions Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YOptions Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYOptionsGroup(YOptionsGroup object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>YVisibility Processable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YVisibility Processable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYVisibilityProcessable(YVisibilityProcessable object) {
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
