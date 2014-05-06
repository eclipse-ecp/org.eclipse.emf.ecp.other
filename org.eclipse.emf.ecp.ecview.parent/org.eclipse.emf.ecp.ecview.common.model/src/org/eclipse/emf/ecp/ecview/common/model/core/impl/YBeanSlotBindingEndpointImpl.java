/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingEndpointImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YBean Slot Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YBeanSlotBindingEndpointImpl#getAttributePath <em>Attribute Path</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YBeanSlotBindingEndpointImpl#getBeanSlot <em>Bean Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YBeanSlotBindingEndpointImpl extends YValueBindingEndpointImpl implements YBeanSlotBindingEndpoint {
	/**
	 * The default value of the '{@link #getAttributePath() <em>Attribute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributePath() <em>Attribute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributePath()
	 * @generated
	 * @ordered
	 */
	protected String attributePath = ATTRIBUTE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBeanSlot() <em>Bean Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanSlot()
	 * @generated
	 * @ordered
	 */
	protected YBeanSlot beanSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YBeanSlotBindingEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YBEAN_SLOT_BINDING_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributePath() {
		return attributePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributePath(String newAttributePath) {
		String oldAttributePath = attributePath;
		attributePath = newAttributePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YBEAN_SLOT_BINDING_ENDPOINT__ATTRIBUTE_PATH, oldAttributePath, attributePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBeanSlot getBeanSlot() {
		if (beanSlot != null && beanSlot.eIsProxy()) {
			InternalEObject oldBeanSlot = (InternalEObject)beanSlot;
			beanSlot = (YBeanSlot)eResolveProxy(oldBeanSlot);
			if (beanSlot != oldBeanSlot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YBEAN_SLOT_BINDING_ENDPOINT__BEAN_SLOT, oldBeanSlot, beanSlot));
			}
		}
		return beanSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBeanSlot basicGetBeanSlot() {
		return beanSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeanSlot(YBeanSlot newBeanSlot) {
		YBeanSlot oldBeanSlot = beanSlot;
		beanSlot = newBeanSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YBEAN_SLOT_BINDING_ENDPOINT__BEAN_SLOT, oldBeanSlot, beanSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YBEAN_SLOT_BINDING_ENDPOINT__ATTRIBUTE_PATH:
				return getAttributePath();
			case CoreModelPackage.YBEAN_SLOT_BINDING_ENDPOINT__BEAN_SLOT:
				if (resolve) return getBeanSlot();
				return basicGetBeanSlot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreModelPackage.YBEAN_SLOT_BINDING_ENDPOINT__ATTRIBUTE_PATH:
				setAttributePath((String)newValue);
				return;
			case CoreModelPackage.YBEAN_SLOT_BINDING_ENDPOINT__BEAN_SLOT:
				setBeanSlot((YBeanSlot)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoreModelPackage.YBEAN_SLOT_BINDING_ENDPOINT__ATTRIBUTE_PATH:
				setAttributePath(ATTRIBUTE_PATH_EDEFAULT);
				return;
			case CoreModelPackage.YBEAN_SLOT_BINDING_ENDPOINT__BEAN_SLOT:
				setBeanSlot((YBeanSlot)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoreModelPackage.YBEAN_SLOT_BINDING_ENDPOINT__ATTRIBUTE_PATH:
				return ATTRIBUTE_PATH_EDEFAULT == null ? attributePath != null : !ATTRIBUTE_PATH_EDEFAULT.equals(attributePath);
			case CoreModelPackage.YBEAN_SLOT_BINDING_ENDPOINT__BEAN_SLOT:
				return beanSlot != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (attributePath: ");
		result.append(attributePath);
		result.append(')');
		return result.toString();
	}

} //YBeanSlotBindingEndpointImpl
