/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YOpen Dialog Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YOpenDialogCommand#getDialog <em>Dialog</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YOpenDialogCommand#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYOpenDialogCommand()
 * @model
 * @generated
 */
public interface YOpenDialogCommand extends YCommand {
	/**
	 * Returns the value of the '<em><b>Dialog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialog</em>' reference.
	 * @see #setDialog(YDialog)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYOpenDialogCommand_Dialog()
	 * @model
	 * @generated
	 */
	YDialog getDialog();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YOpenDialogCommand#getDialog <em>Dialog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialog</em>' reference.
	 * @see #getDialog()
	 * @generated
	 */
	void setDialog(YDialog value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(Object)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYOpenDialogCommand_Trigger()
	 * @model
	 * @generated
	 */
	Object getTrigger();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YOpenDialogCommand#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	YView getView();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	YECViewModelValueBindingEndpoint createTriggerDialogEndpoint();

} // YOpenDialogCommand
