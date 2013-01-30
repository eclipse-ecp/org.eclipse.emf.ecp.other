/**
 */
package org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TAddress;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TCountry;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TestmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAddress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TAddressImpl#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAddressImpl extends MinimalEObjectImpl.Container implements TAddress {
	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected TCountry country;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestmodelPackage.Literals.TADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCountry getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (TCountry)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestmodelPackage.TADDRESS__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCountry basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(TCountry newCountry) {
		TCountry oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestmodelPackage.TADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestmodelPackage.TADDRESS__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
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
			case TestmodelPackage.TADDRESS__COUNTRY:
				setCountry((TCountry)newValue);
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
			case TestmodelPackage.TADDRESS__COUNTRY:
				setCountry((TCountry)null);
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
			case TestmodelPackage.TADDRESS__COUNTRY:
				return country != null;
		}
		return super.eIsSet(featureID);
	}

} //TAddressImpl
