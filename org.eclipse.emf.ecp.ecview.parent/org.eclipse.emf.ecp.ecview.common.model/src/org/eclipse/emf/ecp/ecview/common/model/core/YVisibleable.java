/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YVisibleable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable#isInitialVisible <em>Initial Visible</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable#isVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYVisibleable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YVisibleable {
	/**
	 * Returns the value of the '<em><b>Initial Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Visible</em>' attribute.
	 * @see #setInitialVisible(boolean)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYVisibleable_InitialVisible()
	 * @model default="true"
	 * @generated
	 */
	boolean isInitialVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable#isInitialVisible <em>Initial Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Visible</em>' attribute.
	 * @see #isInitialVisible()
	 * @generated
	 */
	void setInitialVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYVisibleable_Visible()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YVisibleable#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

} // YVisibleable
