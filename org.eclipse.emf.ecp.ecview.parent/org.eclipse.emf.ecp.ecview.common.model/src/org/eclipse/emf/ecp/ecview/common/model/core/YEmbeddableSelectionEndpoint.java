/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YEmbeddable Selection Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint#getAttributePath <em>Attribute Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYEmbeddableSelectionEndpoint()
 * @model
 * @generated
 */
public interface YEmbeddableSelectionEndpoint extends YValueBindingEndpoint, YEmbeddableBindingEndpoint {

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable#getSelectionBindingEndpoint <em>Selection Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(YSelectionBindable)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYEmbeddableSelectionEndpoint_Element()
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable#getSelectionBindingEndpoint
	 * @model opposite="selectionBindingEndpoint" required="true"
	 * @generated
	 */
	YSelectionBindable getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(YSelectionBindable value);

	/**
	 * Returns the value of the '<em><b>Attribute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Path</em>' attribute.
	 * @see #setAttributePath(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYEmbeddableSelectionEndpoint_AttributePath()
	 * @model
	 * @generated
	 */
	String getAttributePath();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint#getAttributePath <em>Attribute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Path</em>' attribute.
	 * @see #getAttributePath()
	 * @generated
	 */
	void setAttributePath(String value);
} // YEmbeddableSelectionEndpoint
