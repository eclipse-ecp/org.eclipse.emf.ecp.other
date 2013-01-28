/**
 */
package org.eclipse.emf.ecp.ecview.databinding.tests.emf.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Country#getIsoCode <em>Iso Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TestmodelPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends EObject {
	/**
	 * Returns the value of the '<em><b>Iso Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iso Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iso Code</em>' attribute.
	 * @see #setIsoCode(String)
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TestmodelPackage#getCountry_IsoCode()
	 * @model
	 * @generated
	 */
	String getIsoCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Country#getIsoCode <em>Iso Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso Code</em>' attribute.
	 * @see #getIsoCode()
	 * @generated
	 */
	void setIsoCode(String value);

} // Country
