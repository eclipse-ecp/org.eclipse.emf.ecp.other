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
package org.eclipse.emf.ecp.ecview.extension.model.datatypes;

import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YNumeric Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype#isGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype#isMarkNegative <em>Mark Negative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage#getYNumericDatatype()
 * @model
 * @generated
 */
public interface YNumericDatatype extends YDatatype {
	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping</em>' attribute.
	 * @see #setGrouping(boolean)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage#getYNumericDatatype_Grouping()
	 * @model default="true"
	 * @generated
	 */
	boolean isGrouping();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype#isGrouping <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping</em>' attribute.
	 * @see #isGrouping()
	 * @generated
	 */
	void setGrouping(boolean value);

	/**
	 * Returns the value of the '<em><b>Mark Negative</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark Negative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark Negative</em>' attribute.
	 * @see #setMarkNegative(boolean)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage#getYNumericDatatype_MarkNegative()
	 * @model default="true"
	 * @generated
	 */
	boolean isMarkNegative();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype#isMarkNegative <em>Mark Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark Negative</em>' attribute.
	 * @see #isMarkNegative()
	 * @generated
	 */
	void setMarkNegative(boolean value);

} // YNumericDatatype
