/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.ecview.common.model.core.YAction;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.extension.model.extension.listener.YButtonClickListener;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YButton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YButton#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YButton#getClickListeners <em>Click Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYButton()
 * @model
 * @generated
 */
public interface YButton extends YAction {
	/**
	 * Returns the value of the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datadescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datadescription</em>' reference.
	 * @see #setDatadescription(YDatadescription)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYButton_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YButton#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the value of the '<em><b>Click Listeners</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.ecview.extension.model.extension.listener.YButtonClickListener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Click Listeners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Click Listeners</em>' attribute list.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYButton_ClickListeners()
	 * @model dataType="org.eclipse.emf.ecp.ecview.extension.model.extension.YButtonClickListener" transient="true"
	 * @generated
	 */
	EList<YButtonClickListener> getClickListeners();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerDataType="org.eclipse.emf.ecp.ecview.extension.model.extension.YButtonClickListener"
	 * @generated
	 */
	void addClickListener(YButtonClickListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerDataType="org.eclipse.emf.ecp.ecview.extension.model.extension.YButtonClickListener"
	 * @generated
	 */
	void removeClickListener(YButtonClickListener listener);

} // YButton
