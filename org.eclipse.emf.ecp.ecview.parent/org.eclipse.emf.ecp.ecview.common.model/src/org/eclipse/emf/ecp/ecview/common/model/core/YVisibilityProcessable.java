/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YVisibility Processable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable#getVisibilityProcessor <em>Visibility Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYVisibilityProcessable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YVisibilityProcessable extends EObject {

	/**
	 * Returns the value of the '<em><b>Visibility Processor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility Processor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Processor</em>' containment reference.
	 * @see #setVisibilityProcessor(YVisibilityProcessor)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYVisibilityProcessable_VisibilityProcessor()
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor#getParent
	 * @model opposite="parent" containment="true" resolveProxies="true"
	 * @generated
	 */
	YVisibilityProcessor getVisibilityProcessor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable#getVisibilityProcessor <em>Visibility Processor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility Processor</em>' containment reference.
	 * @see #getVisibilityProcessor()
	 * @generated
	 */
	void setVisibilityProcessor(YVisibilityProcessor value);
} // YVisibilityProcessable
