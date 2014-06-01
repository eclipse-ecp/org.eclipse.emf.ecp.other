/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YContext Value Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YContextValueBindingEndpoint#getUrlString <em>Url String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYContextValueBindingEndpoint()
 * @model
 * @generated
 */
public interface YContextValueBindingEndpoint extends YValueBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Url String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url String</em>' attribute.
	 * @see #setUrlString(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYContextValueBindingEndpoint_UrlString()
	 * @model required="true"
	 * @generated
	 */
	String getUrlString();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YContextValueBindingEndpoint#getUrlString <em>Url String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url String</em>' attribute.
	 * @see #getUrlString()
	 * @generated
	 */
	void setUrlString(String value);

} // YContextValueBindingEndpoint
