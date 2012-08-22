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
 * A representation of the model object '<em><b>YUi Css Able</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssID <em>Css ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiCssAble()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YUiCssAble extends EObject {
	/**
	 * Returns the value of the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Css Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css Class</em>' attribute.
	 * @see #setCssClass(String)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiCssAble_CssClass()
	 * @model
	 * @generated
	 */
	String getCssClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssClass <em>Css Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Css Class</em>' attribute.
	 * @see #getCssClass()
	 * @generated
	 */
	void setCssClass(String value);

	/**
	 * Returns the value of the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Css ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css ID</em>' attribute.
	 * @see #setCssID(String)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiCssAble_CssID()
	 * @model
	 * @generated
	 */
	String getCssID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssID <em>Css ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Css ID</em>' attribute.
	 * @see #getCssID()
	 * @generated
	 */
	void setCssID(String value);

} // YUiCssAble
