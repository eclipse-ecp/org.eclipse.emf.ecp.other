/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi Span Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YSpanInfoImpl#getColumnFrom <em>Column From</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YSpanInfoImpl#getRowFrom <em>Row From</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YSpanInfoImpl#getColumnTo <em>Column To</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YSpanInfoImpl#getRowTo <em>Row To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YSpanInfoImpl extends EObjectImpl implements YSpanInfo {
	/**
	 * The default value of the '{@link #getColumnFrom() <em>Column From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnFrom()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_FROM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumnFrom() <em>Column From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnFrom()
	 * @generated
	 * @ordered
	 */
	protected int columnFrom = COLUMN_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowFrom() <em>Row From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowFrom()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_FROM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowFrom() <em>Row From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowFrom()
	 * @generated
	 * @ordered
	 */
	protected int rowFrom = ROW_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnTo() <em>Column To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnTo()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_TO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumnTo() <em>Column To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnTo()
	 * @generated
	 * @ordered
	 */
	protected int columnTo = COLUMN_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowTo() <em>Row To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowTo()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_TO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowTo() <em>Row To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowTo()
	 * @generated
	 * @ordered
	 */
	protected int rowTo = ROW_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YSpanInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YSPAN_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumnFrom() {
		return columnFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnFrom(int newColumnFrom) {
		int oldColumnFrom = columnFrom;
		columnFrom = newColumnFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSPAN_INFO__COLUMN_FROM, oldColumnFrom, columnFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowFrom() {
		return rowFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowFrom(int newRowFrom) {
		int oldRowFrom = rowFrom;
		rowFrom = newRowFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSPAN_INFO__ROW_FROM, oldRowFrom, rowFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumnTo() {
		return columnTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnTo(int newColumnTo) {
		int oldColumnTo = columnTo;
		columnTo = newColumnTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSPAN_INFO__COLUMN_TO, oldColumnTo, columnTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowTo() {
		return rowTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowTo(int newRowTo) {
		int oldRowTo = rowTo;
		rowTo = newRowTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YSPAN_INFO__ROW_TO, oldRowTo, rowTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionModelPackage.YSPAN_INFO__COLUMN_FROM:
				return getColumnFrom();
			case ExtensionModelPackage.YSPAN_INFO__ROW_FROM:
				return getRowFrom();
			case ExtensionModelPackage.YSPAN_INFO__COLUMN_TO:
				return getColumnTo();
			case ExtensionModelPackage.YSPAN_INFO__ROW_TO:
				return getRowTo();
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
			case ExtensionModelPackage.YSPAN_INFO__COLUMN_FROM:
				setColumnFrom((Integer)newValue);
				return;
			case ExtensionModelPackage.YSPAN_INFO__ROW_FROM:
				setRowFrom((Integer)newValue);
				return;
			case ExtensionModelPackage.YSPAN_INFO__COLUMN_TO:
				setColumnTo((Integer)newValue);
				return;
			case ExtensionModelPackage.YSPAN_INFO__ROW_TO:
				setRowTo((Integer)newValue);
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
			case ExtensionModelPackage.YSPAN_INFO__COLUMN_FROM:
				setColumnFrom(COLUMN_FROM_EDEFAULT);
				return;
			case ExtensionModelPackage.YSPAN_INFO__ROW_FROM:
				setRowFrom(ROW_FROM_EDEFAULT);
				return;
			case ExtensionModelPackage.YSPAN_INFO__COLUMN_TO:
				setColumnTo(COLUMN_TO_EDEFAULT);
				return;
			case ExtensionModelPackage.YSPAN_INFO__ROW_TO:
				setRowTo(ROW_TO_EDEFAULT);
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
			case ExtensionModelPackage.YSPAN_INFO__COLUMN_FROM:
				return columnFrom != COLUMN_FROM_EDEFAULT;
			case ExtensionModelPackage.YSPAN_INFO__ROW_FROM:
				return rowFrom != ROW_FROM_EDEFAULT;
			case ExtensionModelPackage.YSPAN_INFO__COLUMN_TO:
				return columnTo != COLUMN_TO_EDEFAULT;
			case ExtensionModelPackage.YSPAN_INFO__ROW_TO:
				return rowTo != ROW_TO_EDEFAULT;
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
		result.append(" (columnFrom: ");
		result.append(columnFrom);
		result.append(", rowFrom: ");
		result.append(rowFrom);
		result.append(", columnTo: ");
		result.append(columnTo);
		result.append(", rowTo: ");
		result.append(rowTo);
		result.append(')');
		return result.toString();
	}

} //YUiSpanInfoImpl
