/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core;

import org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBean Slot List Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint#getAttributePath <em>Attribute Path</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint#getBeanSlot <em>Bean Slot</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint#getCollectionType <em>Collection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYBeanSlotListBindingEndpoint()
 * @model
 * @generated
 */
public interface YBeanSlotListBindingEndpoint extends YListBindingEndpoint {
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
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYBeanSlotListBindingEndpoint_AttributePath()
	 * @model required="true"
	 * @generated
	 */
	String getAttributePath();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint#getAttributePath <em>Attribute Path</em>}' attribute.
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
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYBeanSlotListBindingEndpoint_BeanSlot()
	 * @model required="true"
	 * @generated
	 */
	YBeanSlot getBeanSlot();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint#getBeanSlot <em>Bean Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean Slot</em>' reference.
	 * @see #getBeanSlot()
	 * @generated
	 */
	void setBeanSlot(YBeanSlot value);

	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Type</em>' attribute.
	 * @see #setCollectionType(Class)
	 * @see org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage#getYBeanSlotListBindingEndpoint_CollectionType()
	 * @model required="true"
	 * @generated
	 */
	Class<?> getCollectionType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint#getCollectionType <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' attribute.
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(Class<?> value);

} // YBeanSlotListBindingEndpoint
