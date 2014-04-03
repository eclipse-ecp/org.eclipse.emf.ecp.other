/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YActivateable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivateable#isInitialActivated <em>Initial Activated</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivateable#isActivated <em>Activated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYActivateable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YActivateable extends YBindable {
	/**
	 * Returns the value of the '<em><b>Initial Activated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Activated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Activated</em>' attribute.
	 * @see #setInitialActivated(boolean)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYActivateable_InitialActivated()
	 * @model default="true"
	 * @generated
	 */
	boolean isInitialActivated();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivateable#isInitialActivated <em>Initial Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Activated</em>' attribute.
	 * @see #isInitialActivated()
	 * @generated
	 */
	void setInitialActivated(boolean value);

	/**
	 * Returns the value of the '<em><b>Activated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activated</em>' attribute.
	 * @see #setActivated(boolean)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYActivateable_Activated()
	 * @model default="true" transient="true" derived="true"
	 * @generated
	 */
	boolean isActivated();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YActivateable#isActivated <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activated</em>' attribute.
	 * @see #isActivated()
	 * @generated
	 */
	void setActivated(boolean value);

} // YActivateable
