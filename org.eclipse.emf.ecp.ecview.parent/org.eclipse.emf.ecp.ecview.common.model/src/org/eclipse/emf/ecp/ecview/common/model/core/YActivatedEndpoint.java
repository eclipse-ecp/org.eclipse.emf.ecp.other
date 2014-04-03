/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YActivated Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivatedEndpoint#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYActivatedEndpoint()
 * @model
 * @generated
 */
public interface YActivatedEndpoint extends YEmbeddableBindingEndpoint {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(YActivateable)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYActivatedEndpoint_Element()
	 * @model required="true"
	 * @generated
	 */
	YActivateable getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivatedEndpoint#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(YActivateable value);

} // YActivatedEndpoint
