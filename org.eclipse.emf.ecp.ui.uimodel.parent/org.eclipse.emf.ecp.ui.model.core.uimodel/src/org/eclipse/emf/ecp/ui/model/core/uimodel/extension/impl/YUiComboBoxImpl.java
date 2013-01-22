/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl;

import java.net.URI;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YComboBoxDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiBindable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiComboBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi Combo Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiComboBoxImpl#getValueBindingURIString <em>Value Binding URI String</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiComboBoxImpl#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiComboBoxImpl#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YUiComboBoxImpl extends YUiInputImpl implements YUiComboBox {
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
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected YComboBoxDatatype datatype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YUiComboBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimodelExtensionPackage.Literals.YUI_COMBO_BOX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_COMBO_BOX__VALUE_BINDING_URI_STRING, oldValueBindingURIString, valueBindingURIString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDatadescription getDatadescription() {
		if (datadescription != null && datadescription.eIsProxy()) {
			InternalEObject oldDatadescription = (InternalEObject)datadescription;
			datadescription = (YDatadescription)eResolveProxy(oldDatadescription);
			if (datadescription != oldDatadescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelExtensionPackage.YUI_COMBO_BOX__DATADESCRIPTION, oldDatadescription, datadescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_COMBO_BOX__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YComboBoxDatatype getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (YComboBoxDatatype)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelExtensionPackage.YUI_COMBO_BOX__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YComboBoxDatatype basicGetDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(YComboBoxDatatype newDatatype) {
		YComboBoxDatatype oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_COMBO_BOX__DATATYPE, oldDatatype, datatype));
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
			case UimodelExtensionPackage.YUI_COMBO_BOX__VALUE_BINDING_URI_STRING:
				return getValueBindingURIString();
			case UimodelExtensionPackage.YUI_COMBO_BOX__DATADESCRIPTION:
				if (resolve) return getDatadescription();
				return basicGetDatadescription();
			case UimodelExtensionPackage.YUI_COMBO_BOX__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
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
			case UimodelExtensionPackage.YUI_COMBO_BOX__VALUE_BINDING_URI_STRING:
				setValueBindingURIString((String)newValue);
				return;
			case UimodelExtensionPackage.YUI_COMBO_BOX__DATADESCRIPTION:
				setDatadescription((YDatadescription)newValue);
				return;
			case UimodelExtensionPackage.YUI_COMBO_BOX__DATATYPE:
				setDatatype((YComboBoxDatatype)newValue);
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
			case UimodelExtensionPackage.YUI_COMBO_BOX__VALUE_BINDING_URI_STRING:
				setValueBindingURIString(VALUE_BINDING_URI_STRING_EDEFAULT);
				return;
			case UimodelExtensionPackage.YUI_COMBO_BOX__DATADESCRIPTION:
				setDatadescription((YDatadescription)null);
				return;
			case UimodelExtensionPackage.YUI_COMBO_BOX__DATATYPE:
				setDatatype((YComboBoxDatatype)null);
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
			case UimodelExtensionPackage.YUI_COMBO_BOX__VALUE_BINDING_URI_STRING:
				return VALUE_BINDING_URI_STRING_EDEFAULT == null ? valueBindingURIString != null : !VALUE_BINDING_URI_STRING_EDEFAULT.equals(valueBindingURIString);
			case UimodelExtensionPackage.YUI_COMBO_BOX__DATADESCRIPTION:
				return datadescription != null;
			case UimodelExtensionPackage.YUI_COMBO_BOX__DATATYPE:
				return datatype != null;
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
		if (baseClass == YUiBindable.class) {
			switch (derivedFeatureID) {
				case UimodelExtensionPackage.YUI_COMBO_BOX__VALUE_BINDING_URI_STRING: return UiModelPackage.YUI_BINDABLE__VALUE_BINDING_URI_STRING;
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
		if (baseClass == YUiBindable.class) {
			switch (baseFeatureID) {
				case UiModelPackage.YUI_BINDABLE__VALUE_BINDING_URI_STRING: return UimodelExtensionPackage.YUI_COMBO_BOX__VALUE_BINDING_URI_STRING;
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

} //YUiComboBoxImpl
