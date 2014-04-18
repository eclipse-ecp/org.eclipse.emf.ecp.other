/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YList Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingImpl#getTargetEndpoint <em>Target Endpoint</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingImpl#getModelEndpoint <em>Model Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YListBindingImpl extends YBindingImpl implements YListBinding {
	/**
	 * The cached value of the '{@link #getTargetEndpoint() <em>Target Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEndpoint()
	 * @generated
	 * @ordered
	 */
	protected YListBindingEndpoint targetEndpoint;

	/**
	 * The cached value of the '{@link #getModelEndpoint() <em>Model Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelEndpoint()
	 * @generated
	 * @ordered
	 */
	protected YListBindingEndpoint modelEndpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YListBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BindingPackage.Literals.YLIST_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YListBindingEndpoint getTargetEndpoint() {
		return targetEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetEndpoint(YListBindingEndpoint newTargetEndpoint, NotificationChain msgs) {
		YListBindingEndpoint oldTargetEndpoint = targetEndpoint;
		targetEndpoint = newTargetEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BindingPackage.YLIST_BINDING__TARGET_ENDPOINT, oldTargetEndpoint, newTargetEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEndpoint(YListBindingEndpoint newTargetEndpoint) {
		if (newTargetEndpoint != targetEndpoint) {
			NotificationChain msgs = null;
			if (targetEndpoint != null)
				msgs = ((InternalEObject)targetEndpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YLIST_BINDING__TARGET_ENDPOINT, null, msgs);
			if (newTargetEndpoint != null)
				msgs = ((InternalEObject)newTargetEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YLIST_BINDING__TARGET_ENDPOINT, null, msgs);
			msgs = basicSetTargetEndpoint(newTargetEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YLIST_BINDING__TARGET_ENDPOINT, newTargetEndpoint, newTargetEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YListBindingEndpoint getModelEndpoint() {
		return modelEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelEndpoint(YListBindingEndpoint newModelEndpoint, NotificationChain msgs) {
		YListBindingEndpoint oldModelEndpoint = modelEndpoint;
		modelEndpoint = newModelEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BindingPackage.YLIST_BINDING__MODEL_ENDPOINT, oldModelEndpoint, newModelEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelEndpoint(YListBindingEndpoint newModelEndpoint) {
		if (newModelEndpoint != modelEndpoint) {
			NotificationChain msgs = null;
			if (modelEndpoint != null)
				msgs = ((InternalEObject)modelEndpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YLIST_BINDING__MODEL_ENDPOINT, null, msgs);
			if (newModelEndpoint != null)
				msgs = ((InternalEObject)newModelEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BindingPackage.YLIST_BINDING__MODEL_ENDPOINT, null, msgs);
			msgs = basicSetModelEndpoint(newModelEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YLIST_BINDING__MODEL_ENDPOINT, newModelEndpoint, newModelEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BindingPackage.YLIST_BINDING__TARGET_ENDPOINT:
				return basicSetTargetEndpoint(null, msgs);
			case BindingPackage.YLIST_BINDING__MODEL_ENDPOINT:
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
			case BindingPackage.YLIST_BINDING__TARGET_ENDPOINT:
				return getTargetEndpoint();
			case BindingPackage.YLIST_BINDING__MODEL_ENDPOINT:
				return getModelEndpoint();
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
			case BindingPackage.YLIST_BINDING__TARGET_ENDPOINT:
				setTargetEndpoint((YListBindingEndpoint)newValue);
				return;
			case BindingPackage.YLIST_BINDING__MODEL_ENDPOINT:
				setModelEndpoint((YListBindingEndpoint)newValue);
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
			case BindingPackage.YLIST_BINDING__TARGET_ENDPOINT:
				setTargetEndpoint((YListBindingEndpoint)null);
				return;
			case BindingPackage.YLIST_BINDING__MODEL_ENDPOINT:
				setModelEndpoint((YListBindingEndpoint)null);
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
			case BindingPackage.YLIST_BINDING__TARGET_ENDPOINT:
				return targetEndpoint != null;
			case BindingPackage.YLIST_BINDING__MODEL_ENDPOINT:
				return modelEndpoint != null;
		}
		return super.eIsSet(featureID);
	}

} //YListBindingImpl
