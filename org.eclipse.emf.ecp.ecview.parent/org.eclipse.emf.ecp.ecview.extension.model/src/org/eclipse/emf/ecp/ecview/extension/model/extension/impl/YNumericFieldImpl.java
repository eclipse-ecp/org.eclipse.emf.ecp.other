/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YUi Numeric Field</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YNumericFieldImpl#getValueBindingEndpoint <em>Value Binding Endpoint</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YNumericFieldImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YNumericFieldImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YNumericFieldImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YNumericFieldImpl extends YInputImpl implements YNumericField {
	/**
	 * The cached value of the '{@link #getValueBindingEndpoint() <em>Value Binding Endpoint</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getValueBindingEndpoint()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddableValueEndpoint valueBindingEndpoint;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected YNumericDatatype datatype;

	/**
	 * The cached value of the '{@link #getDatadescription() <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final long VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected long value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YNumericFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YNUMERIC_FIELD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableValueEndpoint getValueBindingEndpoint() {
		if (valueBindingEndpoint != null && valueBindingEndpoint.eIsProxy()) {
			InternalEObject oldValueBindingEndpoint = (InternalEObject)valueBindingEndpoint;
			valueBindingEndpoint = (YEmbeddableValueEndpoint)eResolveProxy(oldValueBindingEndpoint);
			if (valueBindingEndpoint != oldValueBindingEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT, oldValueBindingEndpoint, valueBindingEndpoint));
			}
		}
		return valueBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableValueEndpoint basicGetValueBindingEndpoint() {
		return valueBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueBindingEndpoint(
			YEmbeddableValueEndpoint newValueBindingEndpoint,
			NotificationChain msgs) {
		YEmbeddableValueEndpoint oldValueBindingEndpoint = valueBindingEndpoint;
		valueBindingEndpoint = newValueBindingEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT, oldValueBindingEndpoint, newValueBindingEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueBindingEndpoint(
			YEmbeddableValueEndpoint newValueBindingEndpoint) {
		if (newValueBindingEndpoint != valueBindingEndpoint) {
			NotificationChain msgs = null;
			if (valueBindingEndpoint != null)
				msgs = ((InternalEObject)valueBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT, YEmbeddableValueEndpoint.class, msgs);
			if (newValueBindingEndpoint != null)
				msgs = ((InternalEObject)newValueBindingEndpoint).eInverseAdd(this, CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT, YEmbeddableValueEndpoint.class, msgs);
			msgs = basicSetValueBindingEndpoint(newValueBindingEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT, newValueBindingEndpoint, newValueBindingEndpoint));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YNumericDatatype getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (YNumericDatatype)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YNUMERIC_FIELD__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YNumericDatatype basicGetDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(YNumericDatatype newDatatype) {
		YNumericDatatype oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YNUMERIC_FIELD__DATATYPE, oldDatatype, datatype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription getDatadescription() {
		if (datadescription != null && datadescription.eIsProxy()) {
			InternalEObject oldDatadescription = (InternalEObject)datadescription;
			datadescription = (YDatadescription)eResolveProxy(oldDatadescription);
			if (datadescription != oldDatadescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionModelPackage.YNUMERIC_FIELD__DATADESCRIPTION, oldDatadescription, datadescription));
			}
		}
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription basicGetDatadescription() {
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatadescription(YDatadescription newDatadescription) {
		YDatadescription oldDatadescription = datadescription;
		datadescription = newDatadescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YNUMERIC_FIELD__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(long newValue) {
		long oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YNUMERIC_FIELD__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableValueEndpoint createValueEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Creates a new instance of value endpoint with a reference to that
	 * embeddable.
	 * 
	 * @generated NOT
	 */
	public YEmbeddableValueEndpoint createValueEndpoint() {
		YEmbeddableValueEndpoint ep = CoreModelFactory.eINSTANCE
				.createYEmbeddableValueEndpoint();
		ep.setElement(this);
		return ep;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT:
				if (valueBindingEndpoint != null)
					msgs = ((InternalEObject)valueBindingEndpoint).eInverseRemove(this, CoreModelPackage.YEMBEDDABLE_VALUE_ENDPOINT__ELEMENT, YEmbeddableValueEndpoint.class, msgs);
				return basicSetValueBindingEndpoint((YEmbeddableValueEndpoint)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT:
				return basicSetValueBindingEndpoint(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT:
				if (resolve) return getValueBindingEndpoint();
				return basicGetValueBindingEndpoint();
			case ExtensionModelPackage.YNUMERIC_FIELD__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
			case ExtensionModelPackage.YNUMERIC_FIELD__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case ExtensionModelPackage.YNUMERIC_FIELD__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void eSetGen(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT:
				setValueBindingEndpoint((YEmbeddableValueEndpoint)newValue);
				return;
			case ExtensionModelPackage.YNUMERIC_FIELD__DATATYPE:
				setDatatype((YNumericDatatype)newValue);
				return;
			case ExtensionModelPackage.YNUMERIC_FIELD__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case ExtensionModelPackage.YNUMERIC_FIELD__VALUE:
				setValue((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT:
			setValueBindingEndpoint((YEmbeddableValueEndpoint) newValue);
			return;
		case ExtensionModelPackage.YNUMERIC_FIELD__DATATYPE:
			setDatatype((YNumericDatatype) newValue);
			return;
		case ExtensionModelPackage.YNUMERIC_FIELD__DATADESCRIPTION:
			setDatadescription((YDatadescription) newValue);
			return;
		case ExtensionModelPackage.YNUMERIC_FIELD__VALUE:
			setValue(((Number) newValue).longValue());
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
			case ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT:
				setValueBindingEndpoint((YEmbeddableValueEndpoint)null);
				return;
			case ExtensionModelPackage.YNUMERIC_FIELD__DATATYPE:
				setDatatype((YNumericDatatype)null);
				return;
			case ExtensionModelPackage.YNUMERIC_FIELD__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case ExtensionModelPackage.YNUMERIC_FIELD__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT:
				return valueBindingEndpoint != null;
			case ExtensionModelPackage.YNUMERIC_FIELD__DATATYPE:
				return datatype != null;
			case ExtensionModelPackage.YNUMERIC_FIELD__DATADESCRIPTION:
				return datadescription != null;
			case ExtensionModelPackage.YNUMERIC_FIELD__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YBindable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YValueBindable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT: return CoreModelPackage.YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT;
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
		if (baseClass == YBindable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == YValueBindable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YVALUE_BINDABLE__VALUE_BINDING_ENDPOINT: return ExtensionModelPackage.YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == YBindable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == YValueBindable.class) {
			switch (baseOperationID) {
				case CoreModelPackage.YVALUE_BINDABLE___CREATE_VALUE_ENDPOINT: return ExtensionModelPackage.YNUMERIC_FIELD___CREATE_VALUE_ENDPOINT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExtensionModelPackage.YNUMERIC_FIELD___CREATE_VALUE_ENDPOINT:
				return createValueEndpoint();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * Sets the label by creating a new datadescription.
	 * 
	 * @param label
	 */
	public void setLabel(String label) {
		YDatadescription ds = getDatadescription();
		if (ds == null) {
			setDatadescription(createDatadescription(label));
		} else {
			ds.setLabel(label);
		}
	}

	/**
	 * Sets the label i18nKey by creating a new datadescription.
	 * 
	 * @param label
	 */
	public void setLabelI18nKey(String i18nKey) {
		YDatadescription ds = getDatadescription();
		if (ds == null) {
			setDatadescription(createDatadescriptionForI18n(i18nKey));
		} else {
			ds.setLabelI18nKey(i18nKey);
		}
	}

} // YUiNumericFieldImpl
