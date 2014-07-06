/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.common.model.core.YSpacingable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YForm Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YFormLayout#getCellStyles <em>Cell Styles</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YFormLayout#isFillVertical <em>Fill Vertical</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYFormLayout()
 * @model
 * @generated
 */
public interface YFormLayout extends YLayout, YSpacingable, YMarginable {
	/**
	 * Returns the value of the '<em><b>Cell Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.ecview.extension.model.extension.YFormLayoutCellStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Styles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Styles</em>' containment reference list.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYFormLayout_CellStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<YFormLayoutCellStyle> getCellStyles();

	/**
	 * Returns the value of the '<em><b>Fill Vertical</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false, then the width of all elements contained in the grid layout will be decreased to their preferred height or their miminum height. If no alignment is defined for a child, this setting will become its default.
	 * Eg if child has not a alignment, the vertical alignment will become FILL if fillVertical is true. Otherwise the ui-kit default will be used as the vertical alignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fill Vertical</em>' attribute.
	 * @see #setFillVertical(boolean)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYFormLayout_FillVertical()
	 * @model default="true"
	 * @generated
	 */
	boolean isFillVertical();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YFormLayout#isFillVertical <em>Fill Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Vertical</em>' attribute.
	 * @see #isFillVertical()
	 * @generated
	 */
	void setFillVertical(boolean value);

} // YFormLayout
