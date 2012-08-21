/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UimodelExtensionPackageImpl extends EPackageImpl implements UimodelExtensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiTextFieldEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UimodelExtensionPackageImpl() {
		super(eNS_URI, UimodelExtensionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UimodelExtensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UimodelExtensionPackage init() {
		if (isInited) return (UimodelExtensionPackage)EPackage.Registry.INSTANCE.getEPackage(UimodelExtensionPackage.eNS_URI);

		// Obtain or create and register package
		UimodelExtensionPackageImpl theUimodelExtensionPackage = (UimodelExtensionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UimodelExtensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UimodelExtensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UiModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUimodelExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theUimodelExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUimodelExtensionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UimodelExtensionPackage.eNS_URI, theUimodelExtensionPackage);
		return theUimodelExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiTextField() {
		return yUiTextFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimodelExtensionFactory getUimodelExtensionFactory() {
		return (UimodelExtensionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		yUiTextFieldEClass = createEClass(YUI_TEXT_FIELD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UiModelPackage theUiModelPackage = (UiModelPackage)EPackage.Registry.INSTANCE.getEPackage(UiModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yUiTextFieldEClass.getESuperTypes().add(theUiModelPackage.getYUiField());

		// Initialize classes and features; add operations and parameters
		initEClass(yUiTextFieldEClass, YUiTextField.class, "YUiTextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //UimodelExtensionPackageImpl
