/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBean Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint#getBean <em>Bean</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint#getPropertyPath <em>Property Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYBeanBindingEndpoint()
 * @model
 * @generated
 */
public interface YBeanBindingEndpoint extends YValueBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean</em>' attribute.
	 * @see #setBean(Object)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYBeanBindingEndpoint_Bean()
	 * @model transient="true"
	 * @generated
	 */
	Object getBean();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint#getBean <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean</em>' attribute.
	 * @see #getBean()
	 * @generated
	 */
	void setBean(Object value);

	/**
	 * Returns the value of the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Path</em>' attribute.
	 * @see #setPropertyPath(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYBeanBindingEndpoint_PropertyPath()
	 * @model
	 * @generated
	 */
	String getPropertyPath();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint#getPropertyPath <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Path</em>' attribute.
	 * @see #getPropertyPath()
	 * @generated
	 */
	void setPropertyPath(String value);

} // YBeanBindingEndpoint
