/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface UimodelExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/emfclient/uimodel/basicExtension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basicextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UimodelExtensionPackage eINSTANCE = org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextFieldImpl <em>YUi Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextFieldImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiTextField()
	 * @generated
	 */
	int YUI_TEXT_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD__ID = UiModelPackage.YUI_FIELD__ID;

	/**
	 * The number of structural features of the '<em>YUi Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YUI_TEXT_FIELD_FEATURE_COUNT = UiModelPackage.YUI_FIELD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField <em>YUi Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YUi Text Field</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField
	 * @generated
	 */
	EClass getYUiTextField();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UimodelExtensionFactory getUimodelExtensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextFieldImpl <em>YUi Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiTextFieldImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.UimodelExtensionPackageImpl#getYUiTextField()
		 * @generated
		 */
		EClass YUI_TEXT_FIELD = eINSTANCE.getYUiTextField();

	}

} //UimodelExtensionPackage
