/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;

/**
 * <em><b>YUi Text Field</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTextFieldImpl#getValueEndpoint
 * <em>Value Endpoint</em>}</li>
 * <li>
 * {@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTextFieldImpl#getDatatype
 * <em>Datatype</em>}</li>
 * <li>
 * {@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YTextFieldImpl#getDatadescription
 * <em>Datadescription</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class YTextFieldImpl extends YInputImpl implements YTextField {
	/**
	 * The cached value of the '{@link #getValueEndpoint()
	 * <em>Value Endpoint</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getValueEndpoint()
	 * @generated
	 * @ordered
	 */
	protected YEmbeddableBindingEndpoint valueEndpoint;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected YTextDatatype datatype;

	/**
	 * The cached value of the '{@link #getDatadescription()
	 * <em>Datadescription</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDatadescription()
	 * @generated
	 * @ordered
	 */
	protected YDatadescription datadescription;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected YTextFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YTEXT_FIELD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YEmbeddableBindingEndpoint getValueEndpoint() {
		if (valueEndpoint != null && ((EObject) valueEndpoint).eIsProxy()) {
			InternalEObject oldValueEndpoint = (InternalEObject) valueEndpoint;
			valueEndpoint = (YEmbeddableBindingEndpoint) eResolveProxy(oldValueEndpoint);
			if (valueEndpoint != oldValueEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtensionModelPackage.YTEXT_FIELD__VALUE_ENDPOINT,
							oldValueEndpoint, valueEndpoint));
			}
		}
		return valueEndpoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YEmbeddableBindingEndpoint basicGetValueEndpoint() {
		return valueEndpoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValueEndpoint(YEmbeddableBindingEndpoint newValueEndpoint) {
		YEmbeddableBindingEndpoint oldValueEndpoint = valueEndpoint;
		valueEndpoint = newValueEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtensionModelPackage.YTEXT_FIELD__VALUE_ENDPOINT,
					oldValueEndpoint, valueEndpoint));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YTextDatatype getDatatype() {
		if (datatype != null && ((EObject) datatype).eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject) datatype;
			datatype = (YTextDatatype) eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtensionModelPackage.YTEXT_FIELD__DATATYPE,
							oldDatatype, datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YTextDatatype basicGetDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDatatype(YTextDatatype newDatatype) {
		YTextDatatype oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtensionModelPackage.YTEXT_FIELD__DATATYPE, oldDatatype,
					datatype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YDatadescription getDatadescription() {
		if (datadescription != null && ((EObject) datadescription).eIsProxy()) {
			InternalEObject oldDatadescription = (InternalEObject) datadescription;
			datadescription = (YDatadescription) eResolveProxy(oldDatadescription);
			if (datadescription != oldDatadescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtensionModelPackage.YTEXT_FIELD__DATADESCRIPTION,
							oldDatadescription, datadescription));
			}
		}
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YDatadescription basicGetDatadescription() {
		return datadescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDatadescription(YDatadescription newDatadescription) {
		YDatadescription oldDatadescription = datadescription;
		datadescription = newDatadescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtensionModelPackage.YTEXT_FIELD__DATADESCRIPTION,
					oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public YEmbeddableBindingEndpoint getOrCreateValueEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YEmbeddableBindingEndpoint getOrCreateValueEndpoint() {
		YEmbeddableBindingEndpoint ep = getValueEndpoint();
		if (ep == null) {
			ep = CoreModelFactory.eINSTANCE.createYEmbeddableBindingEndpoint();
			ep.setElement(this);
			setValueEndpoint(ep);
		}
		return getValueEndpoint();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtensionModelPackage.YTEXT_FIELD__VALUE_ENDPOINT:
			if (resolve)
				return getValueEndpoint();
			return basicGetValueEndpoint();
		case ExtensionModelPackage.YTEXT_FIELD__DATATYPE:
			if (resolve)
				return getDatatype();
			return basicGetDatatype();
		case ExtensionModelPackage.YTEXT_FIELD__DATADESCRIPTION:
			if (resolve)
				return getDatadescription();
			return basicGetDatadescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExtensionModelPackage.YTEXT_FIELD__VALUE_ENDPOINT:
			setValueEndpoint((YEmbeddableBindingEndpoint) newValue);
			return;
		case ExtensionModelPackage.YTEXT_FIELD__DATATYPE:
			setDatatype((YTextDatatype) newValue);
			return;
		case ExtensionModelPackage.YTEXT_FIELD__DATADESCRIPTION:
			setDatadescription((YDatadescription) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ExtensionModelPackage.YTEXT_FIELD__VALUE_ENDPOINT:
			setValueEndpoint((YEmbeddableBindingEndpoint) null);
			return;
		case ExtensionModelPackage.YTEXT_FIELD__DATATYPE:
			setDatatype((YTextDatatype) null);
			return;
		case ExtensionModelPackage.YTEXT_FIELD__DATADESCRIPTION:
			setDatadescription((YDatadescription) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ExtensionModelPackage.YTEXT_FIELD__VALUE_ENDPOINT:
			return valueEndpoint != null;
		case ExtensionModelPackage.YTEXT_FIELD__DATATYPE:
			return datatype != null;
		case ExtensionModelPackage.YTEXT_FIELD__DATADESCRIPTION:
			return datadescription != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YValueBindable.class) {
			switch (derivedFeatureID) {
			case ExtensionModelPackage.YTEXT_FIELD__VALUE_ENDPOINT:
				return CoreModelPackage.YVALUE_BINDABLE__VALUE_ENDPOINT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == YValueBindable.class) {
			switch (baseFeatureID) {
			case CoreModelPackage.YVALUE_BINDABLE__VALUE_ENDPOINT:
				return ExtensionModelPackage.YTEXT_FIELD__VALUE_ENDPOINT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // YUiTextFieldImpl
