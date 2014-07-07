/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YVisibilityProcessable;
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
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityProcessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityProcessorImpl#getOnMatch <em>On Match</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YVisibilityProcessorImpl#getParent <em>Parent</em>}</li>
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROCESSOR__NAME, oldName, name));
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
	public YVisibilityProcessable getParent() {
		if (eContainerFeatureID() != VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT) return null;
		return (YVisibilityProcessable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YVisibilityProcessable basicGetParent() {
		if (eContainerFeatureID() != VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT) return null;
		return (YVisibilityProcessable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(YVisibilityProcessable newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(YVisibilityProcessable newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, CoreModelPackage.YVISIBILITY_PROCESSABLE__VISIBILITY_PROCESSOR, YVisibilityProcessable.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((YVisibilityProcessable)otherEnd, msgs);
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH:
				return basicSetOnMatch(null, msgs);
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT:
				return eInternalContainer().eInverseRemove(this, CoreModelPackage.YVISIBILITY_PROCESSABLE__VISIBILITY_PROCESSOR, YVisibilityProcessable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__NAME:
				return getName();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH:
				if (resolve) return getOnMatch();
				return basicGetOnMatch();
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH:
				setOnMatch((YVisibilityProperties)newValue);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT:
				setParent((YVisibilityProcessable)newValue);
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH:
				setOnMatch((YVisibilityProperties)null);
				return;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT:
				setParent((YVisibilityProcessable)null);
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
			case VisibilityPackage.YVISIBILITY_PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisibilityPackage.YVISIBILITY_PROCESSOR__ON_MATCH:
				return onMatch != null;
			case VisibilityPackage.YVISIBILITY_PROCESSOR__PARENT:
				return basicGetParent() != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //YVisibilityProcessorImpl
