/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YSelection Bindable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable#getSelectionBindingEndpoint <em>Selection Binding Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYSelectionBindable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YSelectionBindable extends YBindable {

	/**
	 * Returns the value of the '<em><b>Selection Binding Endpoint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Binding Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Binding Endpoint</em>' reference.
	 * @see #setSelectionBindingEndpoint(YEmbeddableSelectionEndpoint)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYSelectionBindable_SelectionBindingEndpoint()
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint#getElement
	 * @model opposite="element"
	 * @generated
	 */
	YEmbeddableSelectionEndpoint getSelectionBindingEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable#getSelectionBindingEndpoint <em>Selection Binding Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Binding Endpoint</em>' reference.
	 * @see #getSelectionBindingEndpoint()
	 * @generated
	 */
	void setSelectionBindingEndpoint(YEmbeddableSelectionEndpoint value);

} // YSelectionBindable
