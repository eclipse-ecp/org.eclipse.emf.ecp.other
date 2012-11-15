/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage
 * @generated
 */
public interface UimodelExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UimodelExtensionFactory eINSTANCE = org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>YUi Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Text Field</em>'.
	 * @generated
	 */
	YUiTextField createYUiTextField();

	/**
	 * Returns a new object of class '<em>YUi Grid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Grid Layout</em>'.
	 * @generated
	 */
	YUiGridLayout createYUiGridLayout();

	/**
	 * Returns a new object of class '<em>YUi Grid Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Grid Layout Cell Style</em>'.
	 * @generated
	 */
	YUiGridLayoutCellStyle createYUiGridLayoutCellStyle();

	/**
	 * Returns a new object of class '<em>YUi Span Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Span Info</em>'.
	 * @generated
	 */
	YUiSpanInfo createYUiSpanInfo();

	/**
	 * Returns a new object of class '<em>YUi Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Table</em>'.
	 * @generated
	 */
	YUiTable createYUiTable();

	/**
	 * Returns a new object of class '<em>YUi Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Label</em>'.
	 * @generated
	 */
	YUiLabel createYUiLabel();

	/**
	 * Returns a new object of class '<em>YUi Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Text Area</em>'.
	 * @generated
	 */
	YUiTextArea createYUiTextArea();

	/**
	 * Returns a new object of class '<em>YUi Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Check Box</em>'.
	 * @generated
	 */
	YUiCheckBox createYUiCheckBox();

	/**
	 * Returns a new object of class '<em>YUi Decimal Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Decimal Field</em>'.
	 * @generated
	 */
	YUiDecimalField createYUiDecimalField();

	/**
	 * Returns a new object of class '<em>YUi Numeric Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Numeric Field</em>'.
	 * @generated
	 */
	YUiNumericField createYUiNumericField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UimodelExtensionPackage getUimodelExtensionPackage();

} //UimodelExtensionFactory
