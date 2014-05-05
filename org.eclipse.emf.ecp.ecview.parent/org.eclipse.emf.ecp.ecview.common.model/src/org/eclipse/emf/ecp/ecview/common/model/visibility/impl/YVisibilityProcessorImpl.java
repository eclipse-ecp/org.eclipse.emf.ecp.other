/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProcessor;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YVisibilityProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YVisibility Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityProcessorImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityProcessorImpl#getOnMatch <em>On Match</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class YVisibilityProcessorImpl extends MinimalEObjectImpl.Container implements YVisibilityProcessor {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnMatch() <em>On Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMatch()
	 * @generated
	 * @ordered
	 */
	protected YVisibilityProperties onMatch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YVisibilityProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisibilityPackage.Literals.YVISIBILITY_PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROCESSOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVisibilityProperties getOnMatch() {
		if (onMatch != null && onMatch.eIsProxy()) {
			InternalEObject oldOnMatch = (InternalEObject)onMatch;
			onMatch = (YVisibilityProperties)eResolveProxy(oldOnMatch);
			if (onMatch != oldOnMatch) {
				InternalEObject newOnMatch = (InternalEObject)onMatch;
				NotificationChain msgs = oldOnMatch.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH, null, null);
				if (newOnMatch.eInternalContainer() == null) {
					msgs = newOnMatch.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH, oldOnMatch, onMatch));
			}
		}
		return onMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVisibilityProperties basicGetOnMatch() {
		return onMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnMatch(YVisibilityProperties newOnMatch, NotificationChain msgs) {
		YVisibilityProperties oldOnMatch = onMatch;
		onMatch = newOnMatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH, oldOnMatch, newOnMatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnMatch(YVisibilityProperties newOnMatch) {
		if (newOnMatch != onMatch) {
			NotificationChain msgs = null;
			if (onMatch != null)
				msgs = ((InternalEObject)onMatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH, null, msgs);
			if (newOnMatch != null)
				msgs = ((InternalEObject)newOnMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH, null, msgs);
			msgs = basicSetOnMatch(newOnMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH, newOnMatch, newOnMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH:
				return basicSetOnMatch(null, msgs);
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ID:
				return getId();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH:
				if (resolve) return getOnMatch();
				return basicGetOnMatch();
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ID:
				setId((String)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH:
				setOnMatch((YVisibilityProperties)newValue);
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ID:
				setId(ID_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH:
				setOnMatch((YVisibilityProperties)null);
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH:
				return onMatch != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //YVisibilityProcessorImpl
