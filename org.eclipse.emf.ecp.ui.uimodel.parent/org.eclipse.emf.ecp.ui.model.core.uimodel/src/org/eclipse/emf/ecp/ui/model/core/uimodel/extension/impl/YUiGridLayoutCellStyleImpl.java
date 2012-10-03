/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi Grid Layout Cell Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#getSpanInfo <em>Span Info</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#isPackHorizontal <em>Pack Horizontal</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiGridLayoutCellStyleImpl#isPackVertical <em>Pack Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YUiGridLayoutCellStyleImpl extends EObjectImpl implements YUiGridLayoutCellStyle {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected YUiEmbeddable target;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final YUiAlignment ALIGNMENT_EDEFAULT = YUiAlignment.UNDEFINED;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected YUiAlignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpanInfo() <em>Span Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpanInfo()
	 * @generated
	 * @ordered
	 */
	protected YUiSpanInfo spanInfo;

	/**
	 * The default value of the '{@link #isPackHorizontal() <em>Pack Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPackHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PACK_HORIZONTAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPackHorizontal() <em>Pack Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPackHorizontal()
	 * @generated
	 * @ordered
	 */
	protected boolean packHorizontal = PACK_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPackVertical() <em>Pack Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPackVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PACK_VERTICAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPackVertical() <em>Pack Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPackVertical()
	 * @generated
	 * @ordered
	 */
	protected boolean packVertical = PACK_VERTICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YUiGridLayoutCellStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimodelExtensionPackage.Literals.YUI_GRID_LAYOUT_CELL_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPackHorizontal() {
		return packHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackHorizontal(boolean newPackHorizontal) {
		boolean oldPackHorizontal = packHorizontal;
		packHorizontal = newPackHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__PACK_HORIZONTAL, oldPackHorizontal, packHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPackVertical() {
		return packVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackVertical(boolean newPackVertical) {
		boolean oldPackVertical = packVertical;
		packVertical = newPackVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__PACK_VERTICAL, oldPackVertical, packVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiEmbeddable getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (YUiEmbeddable)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiEmbeddable basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(YUiEmbeddable newTarget) {
		YUiEmbeddable oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiAlignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(YUiAlignment newAlignment) {
		YUiAlignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiSpanInfo getSpanInfo() {
		return spanInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpanInfo(YUiSpanInfo newSpanInfo, NotificationChain msgs) {
		YUiSpanInfo oldSpanInfo = spanInfo;
		spanInfo = newSpanInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO, oldSpanInfo, newSpanInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpanInfo(YUiSpanInfo newSpanInfo) {
		if (newSpanInfo != spanInfo) {
			NotificationChain msgs = null;
			if (spanInfo != null)
				msgs = ((InternalEObject)spanInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO, null, msgs);
			if (newSpanInfo != null)
				msgs = ((InternalEObject)newSpanInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO, null, msgs);
			msgs = basicSetSpanInfo(newSpanInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO, newSpanInfo, newSpanInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				return basicSetSpanInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				return getAlignment();
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				return getSpanInfo();
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__PACK_HORIZONTAL:
				return isPackHorizontal();
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__PACK_VERTICAL:
				return isPackVertical();
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
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET:
				setTarget((YUiEmbeddable)newValue);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				setAlignment((YUiAlignment)newValue);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				setSpanInfo((YUiSpanInfo)newValue);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__PACK_HORIZONTAL:
				setPackHorizontal((Boolean)newValue);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__PACK_VERTICAL:
				setPackVertical((Boolean)newValue);
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
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET:
				setTarget((YUiEmbeddable)null);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				setSpanInfo((YUiSpanInfo)null);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__PACK_HORIZONTAL:
				setPackHorizontal(PACK_HORIZONTAL_EDEFAULT);
				return;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__PACK_VERTICAL:
				setPackVertical(PACK_VERTICAL_EDEFAULT);
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
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__TARGET:
				return target != null;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO:
				return spanInfo != null;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__PACK_HORIZONTAL:
				return packHorizontal != PACK_HORIZONTAL_EDEFAULT;
			case UimodelExtensionPackage.YUI_GRID_LAYOUT_CELL_STYLE__PACK_VERTICAL:
				return packVertical != PACK_VERTICAL_EDEFAULT;
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
		result.append(" (alignment: ");
		result.append(alignment);
		result.append(", packHorizontal: ");
		result.append(packHorizontal);
		result.append(", packVertical: ");
		result.append(packVertical);
		result.append(')');
		return result.toString();
	}

} //YUiGridLayoutCellStyleImpl
