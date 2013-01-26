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
package org.eclipse.emf.ecp.ecview.ui.core.model.core;

import java.net.URI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Bindable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.ui.core.model.core.YBindable#getValueBindingURIString <em>Value Binding URI String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.CoreModelPackage#getYBindable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YBindable extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Binding URI String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Binding URI String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Binding URI String</em>' attribute.
	 * @see #setValueBindingURIString(String)
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.CoreModelPackage#getYBindable_ValueBindingURIString()
	 * @model
	 * @generated
	 */
	String getValueBindingURIString();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.core.YBindable#getValueBindingURIString <em>Value Binding URI String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Binding URI String</em>' attribute.
	 * @see #getValueBindingURIString()
	 * @generated
	 */
	void setValueBindingURIString(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 */
	URI getValueBindingURI();

} // YUiBindable
