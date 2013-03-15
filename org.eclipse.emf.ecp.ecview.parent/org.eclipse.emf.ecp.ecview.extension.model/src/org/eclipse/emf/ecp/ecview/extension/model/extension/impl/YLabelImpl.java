/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import java.net.URI;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.impl.YFieldImpl;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YLabelImpl#getValueBindingURIString <em>Value Binding URI String</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YLabelImpl#getDatadescription <em>Datadescription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YLabelImpl extends YFieldImpl implements YLabel {
	/**
	 * The default value of the '{@link #getValueBindingURIString() <em>Value Binding URI String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBindingURIString()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_BINDING_URI_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValueBindingURIString() <em>Value Binding URI String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueBindingURIString()
	 * @generated
	 * @ordered
	 */
	protected String valueBindingURIString = VALUE_BINDING_URI_STRING_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDatadescription() <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YLABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueBindingURIString() {
		return valueBindingURIString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBindingURIString(String newValueBindingURIString) {
		String oldValueBindingURIString = valueBindingURIString;
		valueBindingURIString = newValueBindingURIString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YLABEL__VALUE_BINDING_URI_STRING, oldValueBindingURIString, valueBindingURIString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription getDatadescription() {
		if (datadescription != null && ((EObject)datadescription).eIsProxy()) {
			InternalEObject oldDatadescription = (InternalEObject)datadescription;
			datadescription = (YDatadescription)eResolveProxy(oldDatadescription);
			if (datadescription != oldDatadescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YLABEL__DATADESCRIPTION, oldDatadescription, datadescription));
			}
		}
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription basicGetDatadescription() {
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatadescription(YDatadescription newDatadescription) {
		YDatadescription oldDatadescription = datadescription;
		datadescription = newDatadescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YLABEL__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getValueBindingURI() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionModelPackage.YLABEL__VALUE_BINDING_URI_STRING:
				return getValueBindingURIString();
			case ExtensionModelPackage.YLABEL__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
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
			case ExtensionModelPackage.YLABEL__VALUE_BINDING_URI_STRING:
				setValueBindingURIString((String)newValue);
				return;
			case ExtensionModelPackage.YLABEL__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
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
			case ExtensionModelPackage.YLABEL__VALUE_BINDING_URI_STRING:
				setValueBindingURIString(VALUE_BINDING_URI_STRING_EDEFAULT);
				return;
			case ExtensionModelPackage.YLABEL__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
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
			case ExtensionModelPackage.YLABEL__VALUE_BINDING_URI_STRING:
				return VALUE_BINDING_URI_STRING_EDEFAULT == null ? valueBindingURIString != null : !VALUE_BINDING_URI_STRING_EDEFAULT.equals(valueBindingURIString);
			case ExtensionModelPackage.YLABEL__DATADESCRIPTION:
				return datadescription != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YBindable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YLABEL__VALUE_BINDING_URI_STRING: return CoreModelPackage.YBINDABLE__VALUE_BINDING_URI_STRING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == YBindable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YBINDABLE__VALUE_BINDING_URI_STRING: return ExtensionModelPackage.YLABEL__VALUE_BINDING_URI_STRING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (valueBindingURIString: ");
		result.append(valueBindingURIString);
		result.append(')');
		return result.toString();
	}

} //YUiLabelImpl
