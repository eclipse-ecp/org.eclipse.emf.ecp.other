/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YDetail Value Binding Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YDetailValueBindingEndpointImpl#getMasterObservable <em>Master Observable</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YDetailValueBindingEndpointImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YDetailValueBindingEndpointImpl#getPropertyPath <em>Property Path</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YDetailValueBindingEndpointImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YDetailValueBindingEndpointImpl extends YValueBindingEndpointImpl implements YDetailValueBindingEndpoint {
	/**
	 * The cached value of the '{@link #getMasterObservable() <em>Master Observable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterObservable()
	 * @generated
	 * @ordered
	 */
	protected YValueBindingEndpoint masterObservable;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> features;

	/**
	 * The default value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyPath() <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected String propertyPath = PROPERTY_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YDetailValueBindingEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BindingPackage.Literals.YDETAIL_VALUE_BINDING_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YValueBindingEndpoint getMasterObservable() {
		if (masterObservable != null && masterObservable.eIsProxy()) {
			InternalEObject oldMasterObservable = (InternalEObject)masterObservable;
			masterObservable = (YValueBindingEndpoint)eResolveProxy(oldMasterObservable);
			if (masterObservable != oldMasterObservable) {
				InternalEObject newMasterObservable = (InternalEObject)masterObservable;
				NotificationChain msgs = oldMasterObservable.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE, null, null);
				if (newMasterObservable.eInternalContainer() == null) {
					msgs = newMasterObservable.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE, oldMasterObservable, masterObservable));
			}
		}
		return masterObservable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YValueBindingEndpoint basicGetMasterObservable() {
		return masterObservable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterObservable(YValueBindingEndpoint newMasterObservable, NotificationChain msgs) {
		YValueBindingEndpoint oldMasterObservable = masterObservable;
		masterObservable = newMasterObservable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE, oldMasterObservable, newMasterObservable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterObservable(YValueBindingEndpoint newMasterObservable) {
		if (newMasterObservable != masterObservable) {
			NotificationChain msgs = null;
			if (masterObservable != null)
				msgs = ((InternalEObject)masterObservable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE, null, msgs);
			if (newMasterObservable != null)
				msgs = ((InternalEObject)newMasterObservable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE, null, msgs);
			msgs = basicSetMasterObservable(newMasterObservable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE, newMasterObservable, newMasterObservable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EStructuralFeature>(EStructuralFeature.class, this, BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyPath() {
		return propertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyPath(String newPropertyPath) {
		String oldPropertyPath = propertyPath;
		propertyPath = newPropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH, oldPropertyPath, propertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Class<?> newType) {
		Class<?> oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE:
				return basicSetMasterObservable(null, msgs);
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
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE:
				if (resolve) return getMasterObservable();
				return basicGetMasterObservable();
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__FEATURES:
				return getFeatures();
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH:
				return getPropertyPath();
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE:
				setMasterObservable((YValueBindingEndpoint)newValue);
				return;
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EStructuralFeature>)newValue);
				return;
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH:
				setPropertyPath((String)newValue);
				return;
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__TYPE:
				setType((Class<?>)newValue);
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
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE:
				setMasterObservable((YValueBindingEndpoint)null);
				return;
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__FEATURES:
				getFeatures().clear();
				return;
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH:
				setPropertyPath(PROPERTY_PATH_EDEFAULT);
				return;
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__TYPE:
				setType((Class<?>)null);
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
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE:
				return masterObservable != null;
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__FEATURES:
				return features != null && !features.isEmpty();
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH:
				return PROPERTY_PATH_EDEFAULT == null ? propertyPath != null : !PROPERTY_PATH_EDEFAULT.equals(propertyPath);
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT__TYPE:
				return type != null;
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
		result.append(" (propertyPath: ");
		result.append(propertyPath);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //YDetailValueBindingEndpointImpl
