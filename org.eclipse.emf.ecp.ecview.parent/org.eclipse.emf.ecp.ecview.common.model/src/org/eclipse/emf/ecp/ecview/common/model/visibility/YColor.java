/**
 */
package org.eclipse.emf.ecp.ecview.common.model.visibility;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YColor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getRed <em>Red</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getGreen <em>Green</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getBlue <em>Blue</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getThemeId <em>Theme Id</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYColor()
 * @model abstract="true"
 * @generated
 */
public interface YColor extends EObject {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(int)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYColor_Red()
	 * @model default="0"
	 * @generated
	 */
	int getRed();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(int value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(int)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYColor_Green()
	 * @model default="0"
	 * @generated
	 */
	int getGreen();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(int value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(int)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYColor_Blue()
	 * @model default="0"
	 * @generated
	 */
	int getBlue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(int value);

	/**
	 * Returns the value of the '<em><b>Theme Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theme Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme Id</em>' attribute.
	 * @see #setThemeId(String)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYColor_ThemeId()
	 * @model
	 * @generated
	 */
	String getThemeId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getThemeId <em>Theme Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme Id</em>' attribute.
	 * @see #getThemeId()
	 * @generated
	 */
	void setThemeId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType
	 * @see #setType(YColorType)
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.VisibilityPackage#getYColor_Type()
	 * @model required="true"
	 * @generated
	 */
	YColorType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.common.model.visibility.YColor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.ecp.ecview.common.model.visibility.YColorType
	 * @see #getType()
	 * @generated
	 */
	void setType(YColorType value);

} // YColor
