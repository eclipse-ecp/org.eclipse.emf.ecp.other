/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YCollection Bindable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable#getCollectionBindingEndpoint <em>Collection Binding Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYCollectionBindable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YCollectionBindable extends YBindable {
	/**
	 * Returns the value of the '<em><b>Collection Binding Endpoint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableCollectionEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Binding Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Binding Endpoint</em>' reference.
	 * @see #setCollectionBindingEndpoint(YEmbeddableCollectionEndpoint)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYCollectionBindable_CollectionBindingEndpoint()
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableCollectionEndpoint#getElement
	 * @model opposite="element"
	 * @generated
	 */
	YEmbeddableCollectionEndpoint getCollectionBindingEndpoint();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YCollectionBindable#getCollectionBindingEndpoint <em>Collection Binding Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Binding Endpoint</em>' reference.
	 * @see #getCollectionBindingEndpoint()
	 * @generated
	 */
	void setCollectionBindingEndpoint(YEmbeddableCollectionEndpoint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YEmbeddableCollectionEndpoint createCollectionEndpoint();

} // YCollectionBindable
