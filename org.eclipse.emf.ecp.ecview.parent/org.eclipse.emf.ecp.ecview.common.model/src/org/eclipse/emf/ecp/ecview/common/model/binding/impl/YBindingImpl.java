/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YBinding</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl#getModelToTargetStrategy <em>Model To Target Strategy</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl#getTargetToModelStrategy <em>Target To Model Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class YBindingImpl extends MinimalEObjectImpl.Container implements YBinding {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelToTargetStrategy() <em>Model To Target Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelToTargetStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final YBindingUpdateStrategy MODEL_TO_TARGET_STRATEGY_EDEFAULT = YBindingUpdateStrategy.UPDATE;

	/**
	 * The cached value of the '{@link #getModelToTargetStrategy() <em>Model To Target Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelToTargetStrategy()
	 * @generated
	 * @ordered
	 */
	protected YBindingUpdateStrategy modelToTargetStrategy = MODEL_TO_TARGET_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetToModelStrategy() <em>Target To Model Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetToModelStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final YBindingUpdateStrategy TARGET_TO_MODEL_STRATEGY_EDEFAULT = YBindingUpdateStrategy.UPDATE;

	/**
	 * The cached value of the '{@link #getTargetToModelStrategy() <em>Target To Model Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetToModelStrategy()
	 * @generated
	 * @ordered
	 */
	protected YBindingUpdateStrategy targetToModelStrategy = TARGET_TO_MODEL_STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BindingPackage.Literals.YBINDING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YBINDING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingUpdateStrategy getModelToTargetStrategy() {
		return modelToTargetStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelToTargetStrategy(YBindingUpdateStrategy newModelToTargetStrategy) {
		YBindingUpdateStrategy oldModelToTargetStrategy = modelToTargetStrategy;
		modelToTargetStrategy = newModelToTargetStrategy == null ? MODEL_TO_TARGET_STRATEGY_EDEFAULT : newModelToTargetStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YBINDING__MODEL_TO_TARGET_STRATEGY, oldModelToTargetStrategy, modelToTargetStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingUpdateStrategy getTargetToModelStrategy() {
		return targetToModelStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetToModelStrategy(YBindingUpdateStrategy newTargetToModelStrategy) {
		YBindingUpdateStrategy oldTargetToModelStrategy = targetToModelStrategy;
		targetToModelStrategy = newTargetToModelStrategy == null ? TARGET_TO_MODEL_STRATEGY_EDEFAULT : newTargetToModelStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.YBINDING__TARGET_TO_MODEL_STRATEGY, oldTargetToModelStrategy, targetToModelStrategy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingSet getBindingSetGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YBindingSet getBindingSet() {
		return (YBindingSet) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBindsElementGen(YElement element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> Returns true, if the binding binds the given
	 * element at one of its endpoints.
	 * 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isBindsElement(YElement element) {
		return getModelEndpoint() != null
				&& getModelEndpoint().isBindsElement(element)
				|| getTargetEndpoint() != null
				&& getTargetEndpoint().isBindsElement(element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingEndpoint getTargetEndpoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingEndpoint getModelEndpoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BindingPackage.YBINDING__ID:
				return getId();
			case BindingPackage.YBINDING__MODEL_TO_TARGET_STRATEGY:
				return getModelToTargetStrategy();
			case BindingPackage.YBINDING__TARGET_TO_MODEL_STRATEGY:
				return getTargetToModelStrategy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BindingPackage.YBINDING__ID:
				setId((String)newValue);
				return;
			case BindingPackage.YBINDING__MODEL_TO_TARGET_STRATEGY:
				setModelToTargetStrategy((YBindingUpdateStrategy)newValue);
				return;
			case BindingPackage.YBINDING__TARGET_TO_MODEL_STRATEGY:
				setTargetToModelStrategy((YBindingUpdateStrategy)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BindingPackage.YBINDING__ID:
				setId(ID_EDEFAULT);
				return;
			case BindingPackage.YBINDING__MODEL_TO_TARGET_STRATEGY:
				setModelToTargetStrategy(MODEL_TO_TARGET_STRATEGY_EDEFAULT);
				return;
			case BindingPackage.YBINDING__TARGET_TO_MODEL_STRATEGY:
				setTargetToModelStrategy(TARGET_TO_MODEL_STRATEGY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BindingPackage.YBINDING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BindingPackage.YBINDING__MODEL_TO_TARGET_STRATEGY:
				return modelToTargetStrategy != MODEL_TO_TARGET_STRATEGY_EDEFAULT;
			case BindingPackage.YBINDING__TARGET_TO_MODEL_STRATEGY:
				return targetToModelStrategy != TARGET_TO_MODEL_STRATEGY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", modelToTargetStrategy: ");
		result.append(modelToTargetStrategy);
		result.append(", targetToModelStrategy: ");
		result.append(targetToModelStrategy);
		result.append(')');
		return result.toString();
	}

} // YBindingImpl
