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

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiMarginable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiSpacingable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Horizontal Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayout#getCellStyles <em>Cell Styles</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayout#isFillHorizontal <em>Fill Horizontal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiHorizontalLayout()
 * @model
 * @generated
 */
public interface YUiHorizontalLayout extends YUiLayout, YUiSpacingable, YUiMarginable {
	/**
	 * Returns the value of the '<em><b>Cell Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Styles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Styles</em>' containment reference list.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiHorizontalLayout_CellStyles()
	 * @model containment="true"
	 * @generated
	 */
	EList<YUiHorizontalLayoutCellStyle> getCellStyles();

	/**
	 * Returns the value of the '<em><b>Fill Horizontal</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false, then the width of all elements contained in the grid layout will be decreased to their preferred width or their miminum width. If no alignment is defined for a child, this setting will become its default.
	 * Eg if child has not a alignment, the horizontal alignment will become FILL if fillHorizontal is true. Otherwise the ui-kit default will be used as the horizontal alignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fill Horizontal</em>' attribute.
	 * @see #setFillHorizontal(boolean)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiHorizontalLayout_FillHorizontal()
	 * @model default="true"
	 * @generated
	 */
	boolean isFillHorizontal();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayout#isFillHorizontal <em>Fill Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Horizontal</em>' attribute.
	 * @see #isFillHorizontal()
	 * @generated
	 */
	void setFillHorizontal(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YUiHorizontalLayoutCellStyle getCellStyle(YUiEmbeddable element);

} // YUiHorizontalLayout
