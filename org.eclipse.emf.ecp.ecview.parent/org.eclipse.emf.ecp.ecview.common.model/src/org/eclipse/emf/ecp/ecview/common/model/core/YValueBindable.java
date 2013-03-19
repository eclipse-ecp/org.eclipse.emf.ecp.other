/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YValue Bindable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueEndpoint <em>Value Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYValueBindable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YValueBindable {
	/**
	 * Returns the value of the '<em><b>Value Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Endpoint</em>' reference.
	 * @see #setValueEndpoint(YEmbeddableBindingEndpoint)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYValueBindable_ValueEndpoint()
	 * @model
	 * @generated
	 */
	YEmbeddableBindingEndpoint getValueEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueEndpoint <em>Value Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Endpoint</em>' reference.
	 * @see #getValueEndpoint()
	 * @generated
	 */
	void setValueEndpoint(YEmbeddableBindingEndpoint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YEmbeddableBindingEndpoint getOrCreateValueEndpoint();

} // YValueBindable
