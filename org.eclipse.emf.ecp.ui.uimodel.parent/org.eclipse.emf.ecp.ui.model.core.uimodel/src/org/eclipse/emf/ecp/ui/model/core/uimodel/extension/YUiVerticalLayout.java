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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiMarginable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiSpacingable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Vertical Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayout#getCellStyles <em>Cell Styles</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayout#isFillVertical <em>Fill Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiVerticalLayout()
 * @model
 * @generated
 */
public interface YUiVerticalLayout extends YUiLayout, YUiSpacingable, YUiMarginable {
	/**
	 * Returns the value of the '<em><b>Cell Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayoutCellStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Styles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Styles</em>' containment reference list.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiVerticalLayout_CellStyles()
	 * @model containment="true"
	 * @generated
	 */
	EList<YUiVerticalLayoutCellStyle> getCellStyles();

	/**
	 * Returns the value of the '<em><b>Fill Vertical</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false, then the width of all elements contained in the grid layout will be decreased to their preferred height or their miminum height. If no alignment is defined for a child, this setting will become its default.
	 * Eg if child has not a alignment, the vertical alignment will become FILL if fillVertical is true. Otherwise the ui-kit default will be used as the vertical alignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fill Vertical</em>' attribute.
	 * @see #setFillVertical(boolean)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiVerticalLayout_FillVertical()
	 * @model default="true"
	 * @generated
	 */
	boolean isFillVertical();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiVerticalLayout#isFillVertical <em>Fill Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Vertical</em>' attribute.
	 * @see #isFillVertical()
	 * @generated
	 */
	void setFillVertical(boolean value);

} // YUiVerticalLayout
