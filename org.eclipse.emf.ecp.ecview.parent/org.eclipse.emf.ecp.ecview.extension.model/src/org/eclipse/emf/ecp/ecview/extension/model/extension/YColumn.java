/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension;

import org.eclipse.emf.ecp.ecview.common.model.core.YElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YColumn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#isOrderable <em>Orderable</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#isCollapsed <em>Collapsed</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#isCollapsible <em>Collapsible</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#getExpandRatio <em>Expand Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYColumn()
 * @model
 * @generated
 */
public interface YColumn extends YElement {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYColumn_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYColumn_Visible()
	 * @model default="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Orderable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orderable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderable</em>' attribute.
	 * @see #setOrderable(boolean)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYColumn_Orderable()
	 * @model default="true"
	 * @generated
	 */
	boolean isOrderable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#isOrderable <em>Orderable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orderable</em>' attribute.
	 * @see #isOrderable()
	 * @generated
	 */
	void setOrderable(boolean value);

	/**
	 * Returns the value of the '<em><b>Collapsed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collapsed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapsed</em>' attribute.
	 * @see #setCollapsed(boolean)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYColumn_Collapsed()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollapsed();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#isCollapsed <em>Collapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsed</em>' attribute.
	 * @see #isCollapsed()
	 * @generated
	 */
	void setCollapsed(boolean value);

	/**
	 * Returns the value of the '<em><b>Collapsible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collapsible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapsible</em>' attribute.
	 * @see #setCollapsible(boolean)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYColumn_Collapsible()
	 * @model default="true"
	 * @generated
	 */
	boolean isCollapsible();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#isCollapsible <em>Collapsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsible</em>' attribute.
	 * @see #isCollapsible()
	 * @generated
	 */
	void setCollapsible(boolean value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"LEFT"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecp.ecview.extension.model.extension.YFlatAlignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YFlatAlignment
	 * @see #setAlignment(YFlatAlignment)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYColumn_Alignment()
	 * @model default="LEFT"
	 * @generated
	 */
	YFlatAlignment getAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.YFlatAlignment
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(YFlatAlignment value);

	/**
	 * Returns the value of the '<em><b>Expand Ratio</b></em>' attribute.
	 * The default value is <code>"-1.0f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expand Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expand Ratio</em>' attribute.
	 * @see #setExpandRatio(float)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYColumn_ExpandRatio()
	 * @model default="-1.0f"
	 * @generated
	 */
	float getExpandRatio();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YColumn#getExpandRatio <em>Expand Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expand Ratio</em>' attribute.
	 * @see #getExpandRatio()
	 * @generated
	 */
	void setExpandRatio(float value);

} // YColumn
