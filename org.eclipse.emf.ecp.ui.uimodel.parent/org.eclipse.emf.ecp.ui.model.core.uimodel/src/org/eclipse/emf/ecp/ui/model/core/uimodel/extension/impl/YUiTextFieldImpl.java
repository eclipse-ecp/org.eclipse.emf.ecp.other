/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDatatype;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi Text Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextFieldImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextFieldImpl#getBindsTo <em>Binds To</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextFieldImpl#getDatadescription <em>Datadescription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YUiTextFieldImpl extends YUiInputImpl implements YUiTextField {
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected YTextDatatype datatype;

	/**
	 * The default value of the '{@link #getBindsTo() <em>Binds To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindsTo()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDS_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBindsTo() <em>Binds To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindsTo()
	 * @generated
	 * @ordered
	 */
	protected String bindsTo = BINDS_TO_EDEFAULT;

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
	protected YUiTextFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimodelExtensionPackage.Literals.YUI_TEXT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextDatatype getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (YTextDatatype)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelExtensionPackage.YUI_TEXT_FIELD__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YTextDatatype basicGetDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(YTextDatatype newDatatype) {
		YTextDatatype oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_TEXT_FIELD__DATATYPE, oldDatatype, datatype));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelExtensionPackage.YUI_TEXT_FIELD__DATADESCRIPTION, oldDatadescription, datadescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_TEXT_FIELD__DATADESCRIPTION, oldDatadescription, datadescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBindsTo() {
		return bindsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindsTo(String newBindsTo) {
		String oldBindsTo = bindsTo;
		bindsTo = newBindsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_TEXT_FIELD__BINDS_TO, oldBindsTo, bindsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UimodelExtensionPackage.YUI_TEXT_FIELD__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
			case UimodelExtensionPackage.YUI_TEXT_FIELD__BINDS_TO:
				return getBindsTo();
			case UimodelExtensionPackage.YUI_TEXT_FIELD__DATADESCRIPTION:
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
			case UimodelExtensionPackage.YUI_TEXT_FIELD__DATATYPE:
				setDatatype((YTextDatatype)newValue);
				return;
			case UimodelExtensionPackage.YUI_TEXT_FIELD__BINDS_TO:
				setBindsTo((String)newValue);
				return;
			case UimodelExtensionPackage.YUI_TEXT_FIELD__DATADESCRIPTION:
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
			case UimodelExtensionPackage.YUI_TEXT_FIELD__DATATYPE:
				setDatatype((YTextDatatype)null);
				return;
			case UimodelExtensionPackage.YUI_TEXT_FIELD__BINDS_TO:
				setBindsTo(BINDS_TO_EDEFAULT);
				return;
			case UimodelExtensionPackage.YUI_TEXT_FIELD__DATADESCRIPTION:
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
			case UimodelExtensionPackage.YUI_TEXT_FIELD__DATATYPE:
				return datatype != null;
			case UimodelExtensionPackage.YUI_TEXT_FIELD__BINDS_TO:
				return BINDS_TO_EDEFAULT == null ? bindsTo != null : !BINDS_TO_EDEFAULT.equals(bindsTo);
			case UimodelExtensionPackage.YUI_TEXT_FIELD__DATADESCRIPTION:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bindsTo: ");
		result.append(bindsTo);
		result.append(')');
		return result.toString();
	}

} //YUiTextFieldImpl
