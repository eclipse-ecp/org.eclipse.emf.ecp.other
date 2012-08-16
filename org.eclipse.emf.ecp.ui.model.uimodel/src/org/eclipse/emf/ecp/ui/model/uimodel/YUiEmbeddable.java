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
package org.eclipse.emf.ecp.ui.model.uimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Embeddable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiEmbeddable#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage#getYUiEmbeddable()
 * @model abstract="true"
 * @generated
 */
public interface YUiEmbeddable extends YUiElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(YUiLayout)
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage#getYUiEmbeddable_Parent()
	 * @see org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout#getElements
	 * @model opposite="elements" required="true" transient="false"
	 * @generated
	 */
	YUiLayout getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.uimodel.YUiEmbeddable#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(YUiLayout value);

} // YUiEmbeddable
