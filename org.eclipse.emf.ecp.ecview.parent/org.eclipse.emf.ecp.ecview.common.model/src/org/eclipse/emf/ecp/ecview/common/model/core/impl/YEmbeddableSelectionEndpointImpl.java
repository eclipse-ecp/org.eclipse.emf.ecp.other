/**
 */
package org.eclipse.emf.ecp.ecview.common.model.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingEndpointImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableSelectionEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YSelectionBindable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YEmbeddable Selection Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableSelectionEndpointImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YEmbeddableSelectionEndpointImpl#getAttributePath <em>Attribute Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YEmbeddableSelectionEndpointImpl extends YValueBindingEndpointImpl implements YEmbeddableSelectionEndpoint {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected YSelectionBindable element;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YEmbeddableSelectionEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YEMBEDDABLE_SELECTION_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSelectionBindable getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (YSelectionBindable)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YSelectionBindable basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(YSelectionBindable newElement, NotificationChain msgs) {
		YSelectionBindable oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(YSelectionBindable newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, CoreModelPackage.YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT, YSelectionBindable.class, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, CoreModelPackage.YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT, YSelectionBindable.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT, newElement, newElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ATTRIBUTE_PATH, oldAttributePath, attributePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT:
				if (element != null)
					msgs = ((InternalEObject)element).eInverseRemove(this, CoreModelPackage.YSELECTION_BINDABLE__SELECTION_BINDING_ENDPOINT, YSelectionBindable.class, msgs);
				return basicSetElement((YSelectionBindable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT:
				return basicSetElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ATTRIBUTE_PATH:
				return getAttributePath();
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
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT:
				setElement((YSelectionBindable)newValue);
				return;
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ATTRIBUTE_PATH:
				setAttributePath((String)newValue);
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
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT:
				setElement((YSelectionBindable)null);
				return;
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ATTRIBUTE_PATH:
				setAttributePath(ATTRIBUTE_PATH_EDEFAULT);
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
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ELEMENT:
				return element != null;
			case CoreModelPackage.YEMBEDDABLE_SELECTION_ENDPOINT__ATTRIBUTE_PATH:
				return ATTRIBUTE_PATH_EDEFAULT == null ? attributePath != null : !ATTRIBUTE_PATH_EDEFAULT.equals(attributePath);
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isBindsElement(YElement element) {
		return element == getElement();
	}

} //YEmbeddableSelectionEndpointImpl
