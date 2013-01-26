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
package org.eclipse.emf.ecp.ecview.ui.core.model.extension;

import org.eclipse.emf.ecp.ecview.ui.core.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YCheckBoxDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatadescription;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YCheckBox#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YCheckBox#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.ExtensionModelPackage#getYCheckBox()
 * @model
 * @generated
 */
public interface YCheckBox extends YInput, YBindable {
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
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.ExtensionModelPackage#getYCheckBox_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YCheckBox#getDatadescription <em>Datadescription</em>}' reference.
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
	 * @see #setDatatype(YCheckBoxDatatype)
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.ExtensionModelPackage#getYCheckBox_Datatype()
	 * @model
	 * @generated
	 */
	YCheckBoxDatatype getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YCheckBox#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(YCheckBoxDatatype value);

} // YUiCheckBox
