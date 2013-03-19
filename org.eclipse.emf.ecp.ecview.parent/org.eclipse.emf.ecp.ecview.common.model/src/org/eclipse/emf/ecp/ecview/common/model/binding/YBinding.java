/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;

import org.eclipse.emf.ecp.ecview.common.model.core.YElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBinding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getModelValue <em>Model Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYBinding()
 * @model
 * @generated
 */
public interface YBinding extends YElement {
	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value</em>' containment reference.
	 * @see #setTargetValue(YBindingEndpoint)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYBinding_TargetValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	YBindingEndpoint getTargetValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getTargetValue <em>Target Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' containment reference.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(YBindingEndpoint value);

	/**
	 * Returns the value of the '<em><b>Model Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Value</em>' containment reference.
	 * @see #setModelValue(YBindingEndpoint)
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage#getYBinding_ModelValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	YBindingEndpoint getModelValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getModelValue <em>Model Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Value</em>' containment reference.
	 * @see #getModelValue()
	 * @generated
	 */
	void setModelValue(YBindingEndpoint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YBindingSet getBindingSet();

} // YBinding
