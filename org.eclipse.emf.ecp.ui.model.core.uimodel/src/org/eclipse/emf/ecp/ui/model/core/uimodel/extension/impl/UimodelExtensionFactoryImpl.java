/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UimodelExtensionFactoryImpl extends EFactoryImpl implements UimodelExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UimodelExtensionFactory init() {
		try {
			UimodelExtensionFactory theUimodelExtensionFactory = (UimodelExtensionFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclipse.org/emf/emfclient/uimodel/basicExtension"); 
			if (theUimodelExtensionFactory != null) {
				return theUimodelExtensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UimodelExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimodelExtensionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UimodelExtensionPackage.YUI_TEXT_FIELD: return createYUiTextField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YUiTextField createYUiTextField() {
		YUiTextFieldImpl yUiTextField = new YUiTextFieldImpl();
		return yUiTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimodelExtensionPackage getUimodelExtensionPackage() {
		return (UimodelExtensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UimodelExtensionPackage getPackage() {
		return UimodelExtensionPackage.eINSTANCE;
	}

} //UimodelExtensionFactoryImpl
