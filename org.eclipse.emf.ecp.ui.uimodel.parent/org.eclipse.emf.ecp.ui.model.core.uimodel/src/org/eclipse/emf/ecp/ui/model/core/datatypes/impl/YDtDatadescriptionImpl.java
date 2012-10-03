/**
 */
package org.eclipse.emf.ecp.ui.model.core.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YDt Datadescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YDtDatadescriptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YDtDatadescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YDtDatadescriptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YDtDatadescriptionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YDtDatadescriptionImpl#getLabelI18nKey <em>Label I1 8n Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YDtDatadescriptionImpl extends EObjectImpl implements YDtDatadescription {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelI18nKey() <em>Label I1 8n Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelI18nKey()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_I1_8N_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelI18nKey() <em>Label I1 8n Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelI18nKey()
	 * @generated
	 * @ordered
	 */
	protected String labelI18nKey = LABEL_I1_8N_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YDtDatadescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.YDT_DATADESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YDT_DATADESCRIPTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YDT_DATADESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YDT_DATADESCRIPTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YDT_DATADESCRIPTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelI18nKey() {
		return labelI18nKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelI18nKey(String newLabelI18nKey) {
		String oldLabelI18nKey = labelI18nKey;
		labelI18nKey = newLabelI18nKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YDT_DATADESCRIPTION__LABEL_I1_8N_KEY, oldLabelI18nKey, labelI18nKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.YDT_DATADESCRIPTION__ID:
				return getId();
			case DatatypesPackage.YDT_DATADESCRIPTION__NAME:
				return getName();
			case DatatypesPackage.YDT_DATADESCRIPTION__DESCRIPTION:
				return getDescription();
			case DatatypesPackage.YDT_DATADESCRIPTION__LABEL:
				return getLabel();
			case DatatypesPackage.YDT_DATADESCRIPTION__LABEL_I1_8N_KEY:
				return getLabelI18nKey();
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
			case DatatypesPackage.YDT_DATADESCRIPTION__ID:
				setId((String)newValue);
				return;
			case DatatypesPackage.YDT_DATADESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case DatatypesPackage.YDT_DATADESCRIPTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DatatypesPackage.YDT_DATADESCRIPTION__LABEL:
				setLabel((String)newValue);
				return;
			case DatatypesPackage.YDT_DATADESCRIPTION__LABEL_I1_8N_KEY:
				setLabelI18nKey((String)newValue);
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
			case DatatypesPackage.YDT_DATADESCRIPTION__ID:
				setId(ID_EDEFAULT);
				return;
			case DatatypesPackage.YDT_DATADESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatatypesPackage.YDT_DATADESCRIPTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DatatypesPackage.YDT_DATADESCRIPTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case DatatypesPackage.YDT_DATADESCRIPTION__LABEL_I1_8N_KEY:
				setLabelI18nKey(LABEL_I1_8N_KEY_EDEFAULT);
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
			case DatatypesPackage.YDT_DATADESCRIPTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DatatypesPackage.YDT_DATADESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatatypesPackage.YDT_DATADESCRIPTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DatatypesPackage.YDT_DATADESCRIPTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case DatatypesPackage.YDT_DATADESCRIPTION__LABEL_I1_8N_KEY:
				return LABEL_I1_8N_KEY_EDEFAULT == null ? labelI18nKey != null : !LABEL_I1_8N_KEY_EDEFAULT.equals(labelI18nKey);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", label: ");
		result.append(label);
		result.append(", labelI18nKey: ");
		result.append(labelI18nKey);
		result.append(')');
		return result.toString();
	}

} //YDtDatadescriptionImpl
