/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YValue Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingImpl#getTargetEndpoint <em>Target Endpoint</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingImpl#getModelEndpoint <em>Model Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YValueBindingImpl extends YBindingImpl implements YValueBinding {
	/**
	 * The cached value of the '{@link #getTargetEndpoint() <em>Target Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEndpoint()
	 * @generated
	 * @ordered
	 */
	protected YValueBindingEndpoint targetEndpoint;

	/**
	 * The cached value of the '{@link #getModelEndpoint() <em>Model Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelEndpoint()
	 * @generated
	 * @ordered
	 */
	protected YValueBindingEndpoint modelEndpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YValueBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BindingPackage.Literals.YVALUE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YValueBindingEndpoint getTargetEndpoint() {
		if (targetEndpoint != null && targetEndpoint.eIsProxy()) {
			InternalEObject oldTargetEndpoint = (InternalEObject)targetEndpoint;
			targetEndpoint = (YValueBindingEndpoint)eResolveProxy(oldTargetEndpoint);
			if (targetEndpoint != oldTargetEndpoint) {
				InternalEObject newTargetEndpoint = (InternalEObject)targetEndpoint;
				NotificationChain msgs = oldTargetEndpoint.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT, null, null);
				if (newTargetEndpoint.eInternalContainer() == null) {
					msgs = newTargetEndpoint.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT, oldTargetEndpoint, targetEndpoint));
			}
		}
		return targetEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YValueBindingEndpoint basicGetTargetEndpoint() {
		return targetEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetEndpoint(YValueBindingEndpoint newTargetEndpoint, NotificationChain msgs) {
		YValueBindingEndpoint oldTargetEndpoint = targetEndpoint;
		targetEndpoint = newTargetEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT, oldTargetEndpoint, newTargetEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEndpoint(YValueBindingEndpoint newTargetEndpoint) {
		if (newTargetEndpoint != targetEndpoint) {
			NotificationChain msgs = null;
			if (targetEndpoint != null)
				msgs = ((InternalEObject)targetEndpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT, null, msgs);
			if (newTargetEndpoint != null)
				msgs = ((InternalEObject)newTargetEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT, null, msgs);
			msgs = basicSetTargetEndpoint(newTargetEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT, newTargetEndpoint, newTargetEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YValueBindingEndpoint getModelEndpoint() {
		if (modelEndpoint != null && modelEndpoint.eIsProxy()) {
			InternalEObject oldModelEndpoint = (InternalEObject)modelEndpoint;
			modelEndpoint = (YValueBindingEndpoint)eResolveProxy(oldModelEndpoint);
			if (modelEndpoint != oldModelEndpoint) {
				InternalEObject newModelEndpoint = (InternalEObject)modelEndpoint;
				NotificationChain msgs = oldModelEndpoint.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT, null, null);
				if (newModelEndpoint.eInternalContainer() == null) {
					msgs = newModelEndpoint.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT, oldModelEndpoint, modelEndpoint));
			}
		}
		return modelEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YValueBindingEndpoint basicGetModelEndpoint() {
		return modelEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelEndpoint(YValueBindingEndpoint newModelEndpoint, NotificationChain msgs) {
		YValueBindingEndpoint oldModelEndpoint = modelEndpoint;
		modelEndpoint = newModelEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT, oldModelEndpoint, newModelEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelEndpoint(YValueBindingEndpoint newModelEndpoint) {
		if (newModelEndpoint != modelEndpoint) {
			NotificationChain msgs = null;
			if (modelEndpoint != null)
				msgs = ((InternalEObject)modelEndpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT, null, msgs);
			if (newModelEndpoint != null)
				msgs = ((InternalEObject)newModelEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT, null, msgs);
			msgs = basicSetModelEndpoint(newModelEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT, newModelEndpoint, newModelEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT:
				return basicSetTargetEndpoint(null, msgs);
			case BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT:
				return basicSetModelEndpoint(null, msgs);
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
			case BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT:
				if (resolve) return getTargetEndpoint();
				return basicGetTargetEndpoint();
			case BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT:
				if (resolve) return getModelEndpoint();
				return basicGetModelEndpoint();
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
			case BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT:
				setTargetEndpoint((YValueBindingEndpoint)newValue);
				return;
			case BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT:
				setModelEndpoint((YValueBindingEndpoint)newValue);
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
			case BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT:
				setTargetEndpoint((YValueBindingEndpoint)null);
				return;
			case BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT:
				setModelEndpoint((YValueBindingEndpoint)null);
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
			case BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT:
				return targetEndpoint != null;
			case BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT:
				return modelEndpoint != null;
		}
		return super.eIsSet(featureID);
	}

} //YValueBindingImpl
