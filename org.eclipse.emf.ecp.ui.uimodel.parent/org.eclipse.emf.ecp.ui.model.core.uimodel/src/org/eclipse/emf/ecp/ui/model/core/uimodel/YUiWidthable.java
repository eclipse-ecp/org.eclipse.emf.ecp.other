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
package org.eclipse.emf.ecp.ui.model.core.uimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Widthable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiWidthable#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiWidthable#getWidthUnit <em>Width Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiWidthable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YUiWidthable extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiWidthable_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiWidthable#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Width Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Unit</em>' attribute.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiUnit
	 * @see #setWidthUnit(YUiUnit)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiWidthable_WidthUnit()
	 * @model
	 * @generated
	 */
	YUiUnit getWidthUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiWidthable#getWidthUnit <em>Width Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Unit</em>' attribute.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiUnit
	 * @see #getWidthUnit()
	 * @generated
	 */
	void setWidthUnit(YUiUnit value);

} // YUiWidthable
