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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Horizontal Layout Cell Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle#getAlignment <em>Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiHorizontalLayoutCellStyle()
 * @model
 * @generated
 */
public interface YUiHorizontalLayoutCellStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(YUiEmbeddable)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiHorizontalLayoutCellStyle_Target()
	 * @model required="true"
	 * @generated
	 */
	YUiEmbeddable getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(YUiEmbeddable value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The alignment of the ui element relative to its grid cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment
	 * @see #setAlignment(YUiAlignment)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiHorizontalLayoutCellStyle_Alignment()
	 * @model default="UNDEFINED"
	 * @generated
	 */
	YUiAlignment getAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(YUiAlignment value);

} // YUiHorizontalLayoutCellStyle
