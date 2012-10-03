/**
 */
package org.eclipse.emf.ecp.ui.model.core.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YText DType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDTypeImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDTypeImpl#getMaxlength <em>Maxlength</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDTypeImpl#getMinlength <em>Minlength</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDTypeImpl#getRegexpression <em>Regexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YTextDTypeImpl extends EObjectImpl implements YTextDType {
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
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxlength() <em>Maxlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxlength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXLENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxlength() <em>Maxlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxlength()
	 * @generated
	 * @ordered
	 */
	protected int maxlength = MAXLENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinlength() <em>Minlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinlength()
	 * @generated
	 * @ordered
	 */
	protected static final int MINLENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinlength() <em>Minlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinlength()
	 * @generated
	 * @ordered
	 */
	protected int minlength = MINLENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegexpression() <em>Regexpression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexpression()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegexpression() <em>Regexpression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexpression()
	 * @generated
	 * @ordered
	 */
	protected String regexpression = REGEXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YTextDTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.YTEXT_DTYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YTEXT_DTYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YTEXT_DTYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YTEXT_DTYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YTEXT_DTYPE__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxlength() {
		return maxlength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxlength(int newMaxlength) {
		int oldMaxlength = maxlength;
		maxlength = newMaxlength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YTEXT_DTYPE__MAXLENGTH, oldMaxlength, maxlength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinlength() {
		return minlength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinlength(int newMinlength) {
		int oldMinlength = minlength;
		minlength = newMinlength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YTEXT_DTYPE__MINLENGTH, oldMinlength, minlength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegexpression() {
		return regexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegexpression(String newRegexpression) {
		String oldRegexpression = regexpression;
		regexpression = newRegexpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.YTEXT_DTYPE__REGEXPRESSION, oldRegexpression, regexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.YTEXT_DTYPE__ID:
				return getId();
			case DatatypesPackage.YTEXT_DTYPE__NAME:
				return getName();
			case DatatypesPackage.YTEXT_DTYPE__DESCRIPTION:
				return getDescription();
			case DatatypesPackage.YTEXT_DTYPE__REQUIRED:
				return isRequired();
			case DatatypesPackage.YTEXT_DTYPE__MAXLENGTH:
				return getMaxlength();
			case DatatypesPackage.YTEXT_DTYPE__MINLENGTH:
				return getMinlength();
			case DatatypesPackage.YTEXT_DTYPE__REGEXPRESSION:
				return getRegexpression();
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
			case DatatypesPackage.YTEXT_DTYPE__ID:
				setId((String)newValue);
				return;
			case DatatypesPackage.YTEXT_DTYPE__NAME:
				setName((String)newValue);
				return;
			case DatatypesPackage.YTEXT_DTYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DatatypesPackage.YTEXT_DTYPE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case DatatypesPackage.YTEXT_DTYPE__MAXLENGTH:
				setMaxlength((Integer)newValue);
				return;
			case DatatypesPackage.YTEXT_DTYPE__MINLENGTH:
				setMinlength((Integer)newValue);
				return;
			case DatatypesPackage.YTEXT_DTYPE__REGEXPRESSION:
				setRegexpression((String)newValue);
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
			case DatatypesPackage.YTEXT_DTYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DatatypesPackage.YTEXT_DTYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatatypesPackage.YTEXT_DTYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DatatypesPackage.YTEXT_DTYPE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case DatatypesPackage.YTEXT_DTYPE__MAXLENGTH:
				setMaxlength(MAXLENGTH_EDEFAULT);
				return;
			case DatatypesPackage.YTEXT_DTYPE__MINLENGTH:
				setMinlength(MINLENGTH_EDEFAULT);
				return;
			case DatatypesPackage.YTEXT_DTYPE__REGEXPRESSION:
				setRegexpression(REGEXPRESSION_EDEFAULT);
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
			case DatatypesPackage.YTEXT_DTYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DatatypesPackage.YTEXT_DTYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatatypesPackage.YTEXT_DTYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DatatypesPackage.YTEXT_DTYPE__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case DatatypesPackage.YTEXT_DTYPE__MAXLENGTH:
				return maxlength != MAXLENGTH_EDEFAULT;
			case DatatypesPackage.YTEXT_DTYPE__MINLENGTH:
				return minlength != MINLENGTH_EDEFAULT;
			case DatatypesPackage.YTEXT_DTYPE__REGEXPRESSION:
				return REGEXPRESSION_EDEFAULT == null ? regexpression != null : !REGEXPRESSION_EDEFAULT.equals(regexpression);
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
		result.append(", required: ");
		result.append(required);
		result.append(", maxlength: ");
		result.append(maxlength);
		result.append(", minlength: ");
		result.append(minlength);
		result.append(", regexpression: ");
		result.append(regexpression);
		result.append(')');
		return result.toString();
	}

} //YTextDTypeImpl
