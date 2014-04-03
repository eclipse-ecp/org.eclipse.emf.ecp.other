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
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueBindingEndpoint <em>Value Binding Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYValueBindable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YValueBindable extends YBindable {
	/**
	 * Returns the value of the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Binding Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Binding Endpoint</em>' reference.
	 * @see #setValueBindingEndpoint(YEmbeddableValueEndpoint)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYValueBindable_ValueBindingEndpoint()
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint#getElement
	 * @model opposite="element"
	 * @generated
	 */
	YEmbeddableValueEndpoint getValueBindingEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueBindingEndpoint <em>Value Binding Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Binding Endpoint</em>' reference.
	 * @see #getValueBindingEndpoint()
	 * @generated
	 */
	void setValueBindingEndpoint(YEmbeddableValueEndpoint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YEmbeddableValueEndpoint createValueEndpoint();

} // YValueBindable
