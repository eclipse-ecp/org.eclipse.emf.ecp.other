/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YValue Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getTargetEndpoint <em>Target Endpoint</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getModelEndpoint <em>Model Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYValueBinding()
 * @model
 * @generated
 */
public interface YValueBinding extends YBinding {
	/**
	 * Returns the value of the '<em><b>Target Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Endpoint</em>' containment reference.
	 * @see #setTargetEndpoint(YValueBindingEndpoint)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYValueBinding_TargetEndpoint()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	YValueBindingEndpoint getTargetEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getTargetEndpoint <em>Target Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Endpoint</em>' containment reference.
	 * @see #getTargetEndpoint()
	 * @generated
	 */
	void setTargetEndpoint(YValueBindingEndpoint value);

	/**
	 * Returns the value of the '<em><b>Model Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Endpoint</em>' containment reference.
	 * @see #setModelEndpoint(YValueBindingEndpoint)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYValueBinding_ModelEndpoint()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	YValueBindingEndpoint getModelEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getModelEndpoint <em>Model Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Endpoint</em>' containment reference.
	 * @see #getModelEndpoint()
	 * @generated
	 */
	void setModelEndpoint(YValueBindingEndpoint value);

} // YValueBinding
