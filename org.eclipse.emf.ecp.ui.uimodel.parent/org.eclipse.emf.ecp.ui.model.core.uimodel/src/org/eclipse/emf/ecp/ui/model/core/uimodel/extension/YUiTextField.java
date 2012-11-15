/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension;

import org.eclipse.emf.ecp.ui.model.core.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDatatype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getBindsTo <em>Binds To</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getDatadescription <em>Datadescription</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiTextField()
 * @model
 * @generated
 */
public interface YUiTextField extends YUiInput {

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(YTextDatatype)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiTextField_Datatype()
	 * @model
	 * @generated
	 */
	YTextDatatype getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(YTextDatatype value);

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
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiTextField_Datadescription()
	 * @model
	 * @generated
	 */
	YDatadescription getDatadescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getDatadescription <em>Datadescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datadescription</em>' reference.
	 * @see #getDatadescription()
	 * @generated
	 */
	void setDatadescription(YDatadescription value);

	/**
	 * Returns the value of the '<em><b>Binds To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binds To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binds To</em>' attribute.
	 * @see #setBindsTo(String)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#getYUiTextField_BindsTo()
	 * @model
	 * @generated
	 */
	String getBindsTo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField#getBindsTo <em>Binds To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binds To</em>' attribute.
	 * @see #getBindsTo()
	 * @generated
	 */
	void setBindsTo(String value);
} // YUiTextField
