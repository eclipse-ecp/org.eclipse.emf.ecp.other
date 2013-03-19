/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YSelection Bindable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable#getSelectionBindableValue <em>Selection Bindable Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYSelectionBindable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YSelectionBindable {
	/**
	 * Returns the value of the '<em><b>Selection Bindable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Bindable Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Bindable Value</em>' reference.
	 * @see #setSelectionBindableValue(YBindingEndpoint)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYSelectionBindable_SelectionBindableValue()
	 * @model
	 * @generated
	 */
	YBindingEndpoint getSelectionBindableValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable#getSelectionBindableValue <em>Selection Bindable Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Bindable Value</em>' reference.
	 * @see #getSelectionBindableValue()
	 * @generated
	 */
	void setSelectionBindableValue(YBindingEndpoint value);

} // YSelectionBindable
