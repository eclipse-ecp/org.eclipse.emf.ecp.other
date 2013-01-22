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

import org.eclipse.emf.ecp.ui.model.core.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDatatype;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiBindable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiTextArea()
 * @model
 * @generated
 */
public interface YUiTextArea extends YUiInput, YUiBindable {
	/**
	 * Returns the value of the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datadescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datadescription</em>' reference.
	 * @see #setDatadescription(YDatadescription)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiTextArea_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(YTextAreaDatatype)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiTextArea_Datatype()
	 * @model
	 * @generated
	 */
	YTextAreaDatatype getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(YTextAreaDatatype value);

} // YUiTextArea
