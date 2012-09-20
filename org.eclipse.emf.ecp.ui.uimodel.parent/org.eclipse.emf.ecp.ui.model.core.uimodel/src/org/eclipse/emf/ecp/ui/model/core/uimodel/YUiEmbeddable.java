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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Embeddable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiEmbeddable()
 * @model abstract="true"
 * @generated
 */
public interface YUiEmbeddable extends YUiElement, YUiCssAble {
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YUiLayout getParent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YUiView getView();

} // YUiEmbeddable
