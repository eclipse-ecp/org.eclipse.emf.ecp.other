/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YColor;
import org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YColor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YColorImpl#getRed <em>Red</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YColorImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YColorImpl#getBlue <em>Blue</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YColorImpl#getThemeId <em>Theme Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.impl.YColorImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class YColorImpl extends MinimalEObjectImpl.Container implements YColor {
	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final int RED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected int red = RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final int GREEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected int green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final int BLUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected int blue = BLUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThemeId() <em>Theme Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThemeId()
	 * @generated
	 * @ordered
	 */
	protected static final String THEME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThemeId() <em>Theme Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThemeId()
	 * @generated
	 * @ordered
	 */
	protected String themeId = THEME_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final YColorType TYPE_EDEFAULT = YColorType.THEME;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected YColorType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisibilityPackage.Literals.YCOLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(int newRed) {
		int oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YCOLOR__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(int newGreen) {
		int oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YCOLOR__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBlue() {
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(int newBlue) {
		int oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YCOLOR__BLUE, oldBlue, blue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThemeId() {
		return themeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThemeId(String newThemeId) {
		String oldThemeId = themeId;
		themeId = newThemeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YCOLOR__THEME_ID, oldThemeId, themeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YColorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(YColorType newType) {
		YColorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisibilityPackage.YCOLOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisibilityPackage.YCOLOR__RED:
				return getRed();
			case VisibilityPackage.YCOLOR__GREEN:
				return getGreen();
			case VisibilityPackage.YCOLOR__BLUE:
				return getBlue();
			case VisibilityPackage.YCOLOR__THEME_ID:
				return getThemeId();
			case VisibilityPackage.YCOLOR__TYPE:
				return getType();
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
			case VisibilityPackage.YCOLOR__RED:
				setRed((Integer)newValue);
				return;
			case VisibilityPackage.YCOLOR__GREEN:
				setGreen((Integer)newValue);
				return;
			case VisibilityPackage.YCOLOR__BLUE:
				setBlue((Integer)newValue);
				return;
			case VisibilityPackage.YCOLOR__THEME_ID:
				setThemeId((String)newValue);
				return;
			case VisibilityPackage.YCOLOR__TYPE:
				setType((YColorType)newValue);
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
			case VisibilityPackage.YCOLOR__RED:
				setRed(RED_EDEFAULT);
				return;
			case VisibilityPackage.YCOLOR__GREEN:
				setGreen(GREEN_EDEFAULT);
				return;
			case VisibilityPackage.YCOLOR__BLUE:
				setBlue(BLUE_EDEFAULT);
				return;
			case VisibilityPackage.YCOLOR__THEME_ID:
				setThemeId(THEME_ID_EDEFAULT);
				return;
			case VisibilityPackage.YCOLOR__TYPE:
				setType(TYPE_EDEFAULT);
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
			case VisibilityPackage.YCOLOR__RED:
				return red != RED_EDEFAULT;
			case VisibilityPackage.YCOLOR__GREEN:
				return green != GREEN_EDEFAULT;
			case VisibilityPackage.YCOLOR__BLUE:
				return blue != BLUE_EDEFAULT;
			case VisibilityPackage.YCOLOR__THEME_ID:
				return THEME_ID_EDEFAULT == null ? themeId != null : !THEME_ID_EDEFAULT.equals(themeId);
			case VisibilityPackage.YCOLOR__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (red: ");
		result.append(red);
		result.append(", green: ");
		result.append(green);
		result.append(", blue: ");
		result.append(blue);
		result.append(", themeId: ");
		result.append(themeId);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //YColorImpl
