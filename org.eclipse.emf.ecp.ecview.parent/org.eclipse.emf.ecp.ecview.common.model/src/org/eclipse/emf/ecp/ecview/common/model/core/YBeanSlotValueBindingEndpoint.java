/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBean Slot Value Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint#getAttributePath <em>Attribute Path</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint#getBeanSlot <em>Bean Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYBeanSlotValueBindingEndpoint()
 * @model
 * @generated
 */
public interface YBeanSlotValueBindingEndpoint extends YValueBindingEndpoint {
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
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYBeanSlotValueBindingEndpoint_AttributePath()
	 * @model required="true"
	 * @generated
	 */
	String getAttributePath();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint#getAttributePath <em>Attribute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Path</em>' attribute.
	 * @see #getAttributePath()
	 * @generated
	 */
	void setAttributePath(String value);

	/**
	 * Returns the value of the '<em><b>Bean Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean Slot</em>' reference.
	 * @see #setBeanSlot(YBeanSlot)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYBeanSlotValueBindingEndpoint_BeanSlot()
	 * @model required="true"
	 * @generated
	 */
	YBeanSlot getBeanSlot();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotValueBindingEndpoint#getBeanSlot <em>Bean Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean Slot</em>' reference.
	 * @see #getBeanSlot()
	 * @generated
	 */
	void setBeanSlot(YBeanSlot value);

} // YBeanSlotValueBindingEndpoint
