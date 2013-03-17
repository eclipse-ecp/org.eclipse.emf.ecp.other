/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecp.ecview.common.model.binding.YBindableValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YValue Bindable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueBindableValue <em>Value Bindable Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYValueBindable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YValueBindable {
	/**
	 * Returns the value of the '<em><b>Value Bindable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Bindable Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Bindable Value</em>' reference.
	 * @see #setValueBindableValue(YBindableValue)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYValueBindable_ValueBindableValue()
	 * @model
	 * @generated
	 */
	YBindableValue getValueBindableValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueBindableValue <em>Value Bindable Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Bindable Value</em>' reference.
	 * @see #getValueBindableValue()
	 * @generated
	 */
	void setValueBindableValue(YBindableValue value);

} // YValueBindable
