/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.model.core.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YEditable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEnable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.impl.custom.ChangeAdapter;
import org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YUi Field</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl#isInitialEditable <em>Initial Editable</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl#isInitialEnabled <em>Initial Enabled</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl#getInternalValidators <em>Internal Validators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YFieldImpl extends YEmbeddableImpl implements YField {
	/**
	 * The default value of the '{@link #isInitialEditable() <em>Initial Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isInitialEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_EDITABLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isInitialEditable() <em>Initial Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isInitialEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean initialEditable = INITIAL_EDITABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isInitialEnabled() <em>Initial Enabled</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isInitialEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIAL_ENABLED_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isInitialEnabled() <em>Initial Enabled</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isInitialEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean initialEnabled = INITIAL_ENABLED_EDEFAULT;
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<YValidator> validators;
	/**
	 * The cached value of the '{@link #getInternalValidators() <em>Internal Validators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<YValidator> internalValidators;
	/**
	 * A list with all value change listeners registered.
	 * 
	 * @generated NOT
	 */
	private List<YValueChangeListener> valueChangeListeners;

	/**
	 * The change adapter which observe changing values.
	 * 
	 * @generated NOT
	 */
	private ChangeAdapter valueChangeAdapter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.YFIELD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialEditable() {
		return initialEditable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialEditable(boolean newInitialEditable) {
		boolean oldInitialEditable = initialEditable;
		initialEditable = newInitialEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YFIELD__INITIAL_EDITABLE, oldInitialEditable, initialEditable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YFIELD__EDITABLE, oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialEnabled() {
		return initialEnabled;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialEnabled(boolean newInitialEnabled) {
		boolean oldInitialEnabled = initialEnabled;
		initialEnabled = newInitialEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YFIELD__INITIAL_ENABLED, oldInitialEnabled, initialEnabled));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.YFIELD__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YValidator> getValidators() {
		if (validators == null) {
			validators = new EObjectContainmentEList.Resolving<YValidator>(YValidator.class, this, CoreModelPackage.YFIELD__VALIDATORS);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YValidator> getInternalValidators() {
		if (internalValidators == null) {
			internalValidators = new EObjectContainmentEList.Resolving<YValidator>(YValidator.class, this, CoreModelPackage.YFIELD__INTERNAL_VALIDATORS);
		}
		return internalValidators;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addValueChangeListenerGen(YValueChangeListener listener) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeValueChangeListenerGen(YValueChangeListener listener) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates the value change adapter if not present yet.
	 */
	protected void ensureValueChangeAdapter() {
		if (valueChangeAdapter == null) {
			valueChangeListeners = new ArrayList<YValueChangeListener>();
			valueChangeAdapter = new ChangeAdapter(
					createNewChangeAdapterConfig()) {
				@Override
				protected void handleSet(Notification msg) {
					YValueChangeListener.Event event = new YValueChangeListener.Event(
							YFieldImpl.this, msg.getOldValue(),
							msg.getNewValue());
					for (YValueChangeListener listener : valueChangeListeners
							.toArray(new YValueChangeListener[valueChangeListeners
									.size()])) {
						listener.valueChanged(event);
					}

				}
			};
			eAdapters().add(valueChangeAdapter);
		}
	}

	/**
	 * Returns a new instance of the change adapter config. Has to be overridden
	 * by subclasses.
	 * 
	 * @return
	 * 
	 * @generated NOT
	 */
	protected ChangeAdapter.Config createNewChangeAdapterConfig() {
		throw new UnsupportedOperationException("Not implemented by subclass!");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean addValueChangeListener(YValueChangeListener listener) {
		ensureValueChangeAdapter();

		return getValueChangeListeners().add(listener);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean removeValueChangeListener(YValueChangeListener listener) {
		if (valueChangeListeners == null) {
			return false;
		}

		boolean result = valueChangeListeners.remove(listener);

		disposeValueChangeAdapter();

		return result;
	}

	/**
	 * Disposes the value change adapter.
	 * 
	 * @generated NOT
	 */
	protected void disposeValueChangeAdapter() {
		if (valueChangeListeners != null && valueChangeListeners.size() == 0) {
			valueChangeListeners = null;
			eAdapters().remove(valueChangeAdapter);
			valueChangeAdapter = null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAllValueChangListenersGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Removes all value change listeners.
	 * 
	 * @generated NOT
	 */
	public void removeAllValueChangListeners() {
		if (valueChangeListeners != null) {
			valueChangeListeners.clear();
			disposeValueChangeAdapter();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.YFIELD__VALIDATORS:
				return ((InternalEList<?>)getValidators()).basicRemove(otherEnd, msgs);
			case CoreModelPackage.YFIELD__INTERNAL_VALIDATORS:
				return ((InternalEList<?>)getInternalValidators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * Returns a list of all available value change listeners.
	 * 
	 * @return
	 */
	protected List<YValueChangeListener> getValueChangeListeners() {
		return valueChangeListeners != null ? valueChangeListeners
				: Collections.<YValueChangeListener> emptyList();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.YFIELD__INITIAL_EDITABLE:
				return isInitialEditable();
			case CoreModelPackage.YFIELD__EDITABLE:
				return isEditable();
			case CoreModelPackage.YFIELD__INITIAL_ENABLED:
				return isInitialEnabled();
			case CoreModelPackage.YFIELD__ENABLED:
				return isEnabled();
			case CoreModelPackage.YFIELD__VALIDATORS:
				return getValidators();
			case CoreModelPackage.YFIELD__INTERNAL_VALIDATORS:
				return getInternalValidators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreModelPackage.YFIELD__INITIAL_EDITABLE:
				setInitialEditable((Boolean)newValue);
				return;
			case CoreModelPackage.YFIELD__EDITABLE:
				setEditable((Boolean)newValue);
				return;
			case CoreModelPackage.YFIELD__INITIAL_ENABLED:
				setInitialEnabled((Boolean)newValue);
				return;
			case CoreModelPackage.YFIELD__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case CoreModelPackage.YFIELD__VALIDATORS:
				getValidators().clear();
				getValidators().addAll((Collection<? extends YValidator>)newValue);
				return;
			case CoreModelPackage.YFIELD__INTERNAL_VALIDATORS:
				getInternalValidators().clear();
				getInternalValidators().addAll((Collection<? extends YValidator>)newValue);
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
			case CoreModelPackage.YFIELD__INITIAL_EDITABLE:
				setInitialEditable(INITIAL_EDITABLE_EDEFAULT);
				return;
			case CoreModelPackage.YFIELD__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case CoreModelPackage.YFIELD__INITIAL_ENABLED:
				setInitialEnabled(INITIAL_ENABLED_EDEFAULT);
				return;
			case CoreModelPackage.YFIELD__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case CoreModelPackage.YFIELD__VALIDATORS:
				getValidators().clear();
				return;
			case CoreModelPackage.YFIELD__INTERNAL_VALIDATORS:
				getInternalValidators().clear();
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
			case CoreModelPackage.YFIELD__INITIAL_EDITABLE:
				return initialEditable != INITIAL_EDITABLE_EDEFAULT;
			case CoreModelPackage.YFIELD__EDITABLE:
				return editable != EDITABLE_EDEFAULT;
			case CoreModelPackage.YFIELD__INITIAL_ENABLED:
				return initialEnabled != INITIAL_ENABLED_EDEFAULT;
			case CoreModelPackage.YFIELD__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case CoreModelPackage.YFIELD__VALIDATORS:
				return validators != null && !validators.isEmpty();
			case CoreModelPackage.YFIELD__INTERNAL_VALIDATORS:
				return internalValidators != null && !internalValidators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YEditable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YFIELD__INITIAL_EDITABLE: return CoreModelPackage.YEDITABLE__INITIAL_EDITABLE;
				case CoreModelPackage.YFIELD__EDITABLE: return CoreModelPackage.YEDITABLE__EDITABLE;
				default: return -1;
			}
		}
		if (baseClass == YEnable.class) {
			switch (derivedFeatureID) {
				case CoreModelPackage.YFIELD__INITIAL_ENABLED: return CoreModelPackage.YENABLE__INITIAL_ENABLED;
				case CoreModelPackage.YFIELD__ENABLED: return CoreModelPackage.YENABLE__ENABLED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == YEditable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YEDITABLE__INITIAL_EDITABLE: return CoreModelPackage.YFIELD__INITIAL_EDITABLE;
				case CoreModelPackage.YEDITABLE__EDITABLE: return CoreModelPackage.YFIELD__EDITABLE;
				default: return -1;
			}
		}
		if (baseClass == YEnable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YENABLE__INITIAL_ENABLED: return CoreModelPackage.YFIELD__INITIAL_ENABLED;
				case CoreModelPackage.YENABLE__ENABLED: return CoreModelPackage.YFIELD__ENABLED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initialEditable: ");
		result.append(initialEditable);
		result.append(", editable: ");
		result.append(editable);
		result.append(", initialEnabled: ");
		result.append(initialEnabled);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} // YUiFieldImpl
