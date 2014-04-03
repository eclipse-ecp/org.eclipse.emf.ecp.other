/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YEmbeddable Value Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYEmbeddableValueEndpoint()
 * @model
 * @generated
 */
public interface YEmbeddableValueEndpoint extends YEmbeddableBindingEndpoint {

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueBindingEndpoint <em>Value Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(YValueBindable)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYEmbeddableValueEndpoint_Element()
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable#getValueBindingEndpoint
	 * @model opposite="valueBindingEndpoint" required="true"
	 * @generated
	 */
	YValueBindable getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(YValueBindable value);
} // YEmbeddableValueEndpoint
