/**
 */
package org.eclipse.emf.ecp.ui.model.core.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YNumericDatatype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YNumeric Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YNumericDatatypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YNumericDatatypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YNumericDatatypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YNumericDatatypeImpl#isGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YNumericDatatypeImpl#isMarkNegative <em>Mark Negative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YNumericDatatypeImpl extends EObjectImpl implements YNumericDatatype {
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
	 * The default value of the '{@link #isGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrouping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUPING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGrouping() <em>Grouping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGrouping()
	 * @generated
	 * @ordered
	 */
	protected boolean grouping = GROUPING_EDEFAULT;

	/**
	 * The default value of the '{@link #isMarkNegative() <em>Mark Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkNegative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARK_NEGATIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMarkNegative() <em>Mark Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkNegative()
	 * @generated
	 * @ordered
	 */
	protected boolean markNegative = MARK_NEGATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YNumericDatatypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.YNUMERIC_DATATYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YNUMERIC_DATATYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YNUMERIC_DATATYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YNUMERIC_DATATYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrouping() {
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrouping(boolean newGrouping) {
		boolean oldGrouping = grouping;
		grouping = newGrouping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YNUMERIC_DATATYPE__GROUPING, oldGrouping, grouping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMarkNegative() {
		return markNegative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkNegative(boolean newMarkNegative) {
		boolean oldMarkNegative = markNegative;
		markNegative = newMarkNegative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YNUMERIC_DATATYPE__MARK_NEGATIVE, oldMarkNegative, markNegative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.YNUMERIC_DATATYPE__ID:
				return getId();
			case DatatypesPackage.YNUMERIC_DATATYPE__NAME:
				return getName();
			case DatatypesPackage.YNUMERIC_DATATYPE__DESCRIPTION:
				return getDescription();
			case DatatypesPackage.YNUMERIC_DATATYPE__GROUPING:
				return isGrouping();
			case DatatypesPackage.YNUMERIC_DATATYPE__MARK_NEGATIVE:
				return isMarkNegative();
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
			case DatatypesPackage.YNUMERIC_DATATYPE__ID:
				setId((String)newValue);
				return;
			case DatatypesPackage.YNUMERIC_DATATYPE__NAME:
				setName((String)newValue);
				return;
			case DatatypesPackage.YNUMERIC_DATATYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DatatypesPackage.YNUMERIC_DATATYPE__GROUPING:
				setGrouping((Boolean)newValue);
				return;
			case DatatypesPackage.YNUMERIC_DATATYPE__MARK_NEGATIVE:
				setMarkNegative((Boolean)newValue);
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
			case DatatypesPackage.YNUMERIC_DATATYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DatatypesPackage.YNUMERIC_DATATYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatatypesPackage.YNUMERIC_DATATYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DatatypesPackage.YNUMERIC_DATATYPE__GROUPING:
				setGrouping(GROUPING_EDEFAULT);
				return;
			case DatatypesPackage.YNUMERIC_DATATYPE__MARK_NEGATIVE:
				setMarkNegative(MARK_NEGATIVE_EDEFAULT);
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
			case DatatypesPackage.YNUMERIC_DATATYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DatatypesPackage.YNUMERIC_DATATYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatatypesPackage.YNUMERIC_DATATYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DatatypesPackage.YNUMERIC_DATATYPE__GROUPING:
				return grouping != GROUPING_EDEFAULT;
			case DatatypesPackage.YNUMERIC_DATATYPE__MARK_NEGATIVE:
				return markNegative != MARK_NEGATIVE_EDEFAULT;
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
		result.append(", grouping: ");
		result.append(grouping);
		result.append(", markNegative: ");
		result.append(markNegative);
		result.append(')');
		return result.toString();
	}

} //YNumericDatatypeImpl
