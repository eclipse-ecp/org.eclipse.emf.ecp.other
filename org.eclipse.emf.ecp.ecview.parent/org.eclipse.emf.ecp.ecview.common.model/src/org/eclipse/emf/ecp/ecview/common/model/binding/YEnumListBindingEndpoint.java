/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YEnum List Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YEnumListBindingEndpoint#getEnum <em>Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYEnumListBindingEndpoint()
 * @model
 * @generated
 */
public interface YEnumListBindingEndpoint extends YListBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute.
	 * @see #setEnum(Class)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYEnumListBindingEndpoint_Enum()
	 * @model required="true"
	 * @generated
	 */
	Class<?> getEnum();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YEnumListBindingEndpoint#getEnum <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' attribute.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(Class<?> value);

} // YEnumListBindingEndpoint
