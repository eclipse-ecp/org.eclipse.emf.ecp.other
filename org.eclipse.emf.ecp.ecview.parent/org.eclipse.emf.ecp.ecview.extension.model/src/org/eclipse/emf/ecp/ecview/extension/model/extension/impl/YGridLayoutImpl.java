/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable;
import org.eclipse.emf.ecp.ecview.common.model.core.impl.YLayoutImpl;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YUi Grid Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutImpl#isSpacing <em>Spacing</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutImpl#isMargin <em>Margin</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutImpl#getCellStyles <em>Cell Styles</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutImpl#isFillHorizontal <em>Fill Horizontal</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.impl.YGridLayoutImpl#isFillVertical <em>Fill Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YGridLayoutImpl extends YLayoutImpl implements YGridLayout {
	/**
	 * The default value of the '{@link #isSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPACING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpacing()
	 * @generated
	 * @ordered
	 */
	protected boolean spacing = SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARGIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected boolean margin = MARGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCellStyles() <em>Cell Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<YGridLayoutCellStyle> cellStyles;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected int columns = COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #isFillHorizontal() <em>Fill Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_HORIZONTAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFillHorizontal() <em>Fill Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillHorizontal()
	 * @generated
	 * @ordered
	 */
	protected boolean fillHorizontal = FILL_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isFillVertical() <em>Fill Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillVertical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_VERTICAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFillVertical() <em>Fill Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillVertical()
	 * @generated
	 * @ordered
	 */
	protected boolean fillVertical = FILL_VERTICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YGridLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionModelPackage.Literals.YGRID_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YGridLayoutCellStyle> getCellStyles() {
		if (cellStyles == null) {
			cellStyles = new EObjectContainmentEList<YGridLayoutCellStyle>(YGridLayoutCellStyle.class, this, ExtensionModelPackage.YGRID_LAYOUT__CELL_STYLES);
		}
		return cellStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacing(boolean newSpacing) {
		boolean oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YGRID_LAYOUT__SPACING, oldSpacing, spacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(boolean newMargin) {
		boolean oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YGRID_LAYOUT__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YGRID_LAYOUT__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFillHorizontal() {
		return fillHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillHorizontal(boolean newFillHorizontal) {
		boolean oldFillHorizontal = fillHorizontal;
		fillHorizontal = newFillHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YGRID_LAYOUT__FILL_HORIZONTAL, oldFillHorizontal, fillHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFillVertical() {
		return fillVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillVertical(boolean newFillVertical) {
		boolean oldFillVertical = fillVertical;
		fillVertical = newFillVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionModelPackage.YGRID_LAYOUT__FILL_VERTICAL, oldFillVertical, fillVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionModelPackage.YGRID_LAYOUT__CELL_STYLES:
				return ((InternalEList<?>)getCellStyles()).basicRemove(otherEnd, msgs);
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
			case ExtensionModelPackage.YGRID_LAYOUT__SPACING:
				return isSpacing();
			case ExtensionModelPackage.YGRID_LAYOUT__MARGIN:
				return isMargin();
			case ExtensionModelPackage.YGRID_LAYOUT__CELL_STYLES:
				return getCellStyles();
			case ExtensionModelPackage.YGRID_LAYOUT__COLUMNS:
				return getColumns();
			case ExtensionModelPackage.YGRID_LAYOUT__FILL_HORIZONTAL:
				return isFillHorizontal();
			case ExtensionModelPackage.YGRID_LAYOUT__FILL_VERTICAL:
				return isFillVertical();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtensionModelPackage.YGRID_LAYOUT__SPACING:
				setSpacing((Boolean)newValue);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT__MARGIN:
				setMargin((Boolean)newValue);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT__CELL_STYLES:
				getCellStyles().clear();
				getCellStyles().addAll((Collection<? extends YGridLayoutCellStyle>)newValue);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT__FILL_HORIZONTAL:
				setFillHorizontal((Boolean)newValue);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT__FILL_VERTICAL:
				setFillVertical((Boolean)newValue);
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
			case ExtensionModelPackage.YGRID_LAYOUT__SPACING:
				setSpacing(SPACING_EDEFAULT);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT__MARGIN:
				setMargin(MARGIN_EDEFAULT);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT__CELL_STYLES:
				getCellStyles().clear();
				return;
			case ExtensionModelPackage.YGRID_LAYOUT__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT__FILL_HORIZONTAL:
				setFillHorizontal(FILL_HORIZONTAL_EDEFAULT);
				return;
			case ExtensionModelPackage.YGRID_LAYOUT__FILL_VERTICAL:
				setFillVertical(FILL_VERTICAL_EDEFAULT);
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
			case ExtensionModelPackage.YGRID_LAYOUT__SPACING:
				return spacing != SPACING_EDEFAULT;
			case ExtensionModelPackage.YGRID_LAYOUT__MARGIN:
				return margin != MARGIN_EDEFAULT;
			case ExtensionModelPackage.YGRID_LAYOUT__CELL_STYLES:
				return cellStyles != null && !cellStyles.isEmpty();
			case ExtensionModelPackage.YGRID_LAYOUT__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case ExtensionModelPackage.YGRID_LAYOUT__FILL_HORIZONTAL:
				return fillHorizontal != FILL_HORIZONTAL_EDEFAULT;
			case ExtensionModelPackage.YGRID_LAYOUT__FILL_VERTICAL:
				return fillVertical != FILL_VERTICAL_EDEFAULT;
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
		if (baseClass == YSpacingable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YGRID_LAYOUT__SPACING: return CoreModelPackage.YSPACINGABLE__SPACING;
				default: return -1;
			}
		}
		if (baseClass == YMarginable.class) {
			switch (derivedFeatureID) {
				case ExtensionModelPackage.YGRID_LAYOUT__MARGIN: return CoreModelPackage.YMARGINABLE__MARGIN;
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
		if (baseClass == YSpacingable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YSPACINGABLE__SPACING: return ExtensionModelPackage.YGRID_LAYOUT__SPACING;
				default: return -1;
			}
		}
		if (baseClass == YMarginable.class) {
			switch (baseFeatureID) {
				case CoreModelPackage.YMARGINABLE__MARGIN: return ExtensionModelPackage.YGRID_LAYOUT__MARGIN;
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
		result.append(" (spacing: ");
		result.append(spacing);
		result.append(", margin: ");
		result.append(margin);
		result.append(", columns: ");
		result.append(columns);
		result.append(", fillHorizontal: ");
		result.append(fillHorizontal);
		result.append(", fillVertical: ");
		result.append(fillVertical);
		result.append(')');
		return result.toString();
	}

} //YUiGridLayoutImpl
