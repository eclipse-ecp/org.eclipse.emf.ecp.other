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
package org.eclipse.emf.ecp.ecview.extension.model.extension;

import org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextAreaDatatype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYTextArea()
 * @model
 * @generated
 */
public interface YTextArea extends YInput, YValueBindable {
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
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYTextArea_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea#getDatadescription <em>Datadescription</em>}' reference.
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
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYTextArea_Datatype()
	 * @model
	 * @generated
	 */
	YTextAreaDatatype getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(YTextAreaDatatype value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYTextArea_Value()
	 * @model transient="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // YUiTextArea
