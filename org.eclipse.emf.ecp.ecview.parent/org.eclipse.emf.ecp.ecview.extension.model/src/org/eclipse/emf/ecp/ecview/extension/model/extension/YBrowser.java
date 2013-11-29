/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension;

import org.eclipse.emf.ecp.ecview.common.model.core.YValueBindable;

import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;

import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YBrowserDatatype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YBrowser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser#getDatadescription <em>Datadescription</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYBrowser()
 * @model
 * @generated
 */
public interface YBrowser extends YInput, YValueBindable {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(YBrowserDatatype)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYBrowser_Datatype()
	 * @model
	 * @generated
	 */
	YBrowserDatatype getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(YBrowserDatatype value);

	/**
	 * Returns the value of the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datadescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datadescription</em>' reference.
	 * @see #setDatadescription(YDatadescription)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYBrowser_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#getYBrowser_Value()
	 * @model transient="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // YBrowser
