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
	 * Returns a new object of class '<em>YUi Horizontal Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Horizontal Layout</em>'.
	 * @generated
	 */
	YUiHorizontalLayout createYUiHorizontalLayout();

	/**
	 * Returns a new object of class '<em>YUi Horizontal Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Horizontal Layout Cell Style</em>'.
	 * @generated
	 */
	YUiHorizontalLayoutCellStyle createYUiHorizontalLayoutCellStyle();

	/**
	 * Returns a new object of class '<em>YUi Vertical Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Vertical Layout</em>'.
	 * @generated
	 */
	YUiVerticalLayout createYUiVerticalLayout();

	/**
	 * Returns a new object of class '<em>YUi Vertical Layout Cell Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Vertical Layout Cell Style</em>'.
	 * @generated
	 */
	YUiVerticalLayoutCellStyle createYUiVerticalLayoutCellStyle();

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
	 * Returns a new object of class '<em>YUi Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi Combo Box</em>'.
	 * @generated
	 */
	YUiComboBox createYUiComboBox();

	/**
	 * Returns a new object of class '<em>YUi List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>YUi List</em>'.
	 * @generated
	 */
	YUiList createYUiList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UimodelExtensionPackage getUimodelExtensionPackage();

} //UimodelExtensionFactory
