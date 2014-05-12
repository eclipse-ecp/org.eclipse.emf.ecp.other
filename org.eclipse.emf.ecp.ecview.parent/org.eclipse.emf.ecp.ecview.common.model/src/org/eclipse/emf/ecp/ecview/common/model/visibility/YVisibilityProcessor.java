/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility;

import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YVisibility Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor#getOnMatch <em>On Match</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYVisibilityProcessor()
 * @model abstract="true"
 * @generated
 */
public interface YVisibilityProcessor extends YElement {
	/**
	 * Returns the value of the '<em><b>On Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Match</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Match</em>' containment reference.
	 * @see #setOnMatch(YVisibilityProperties)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYVisibilityProcessor_OnMatch()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	YVisibilityProperties getOnMatch();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor#getOnMatch <em>On Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Match</em>' containment reference.
	 * @see #getOnMatch()
	 * @generated
	 */
	void setOnMatch(YVisibilityProperties value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable#getVisibilityProcessor <em>Visibility Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(YVisibilityProcessable)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYVisibilityProcessor_Parent()
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable#getVisibilityProcessor
	 * @model opposite="visibilityProcessor" required="true" transient="false"
	 * @generated
	 */
	YVisibilityProcessable getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(YVisibilityProcessable value);

} // YVisibilityProcessor
