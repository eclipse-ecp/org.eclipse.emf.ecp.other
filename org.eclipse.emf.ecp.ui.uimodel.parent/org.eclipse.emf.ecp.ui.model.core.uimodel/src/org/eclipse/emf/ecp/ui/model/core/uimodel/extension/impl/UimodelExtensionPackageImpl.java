/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCell;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiGridLayoutEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiGridLayoutCellEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiGridLayoutCellStyleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiSpanInfoEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yUiAlignmentEEnum = null;

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
	public EClass getYUiGridLayout() {
		return yUiGridLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiGridLayout_CellStyles() {
		return (EReference)yUiGridLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiGridLayout_Columns() {
		return (EAttribute)yUiGridLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiGridLayoutCell() {
		return yUiGridLayoutCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiGridLayoutCellStyle() {
		return yUiGridLayoutCellStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiGridLayoutCellStyle_Target() {
		return (EReference)yUiGridLayoutCellStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiGridLayoutCellStyle_Alignment() {
		return (EAttribute)yUiGridLayoutCellStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiGridLayoutCellStyle_GrabHorizontal() {
		return (EAttribute)yUiGridLayoutCellStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiGridLayoutCellStyle_GrabVertical() {
		return (EAttribute)yUiGridLayoutCellStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiGridLayoutCellStyle_SpanInfo() {
		return (EReference)yUiGridLayoutCellStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiSpanInfo() {
		return yUiSpanInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiSpanInfo_ColumnFrom() {
		return (EAttribute)yUiSpanInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiSpanInfo_RowFrom() {
		return (EAttribute)yUiSpanInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiSpanInfo_ColumnTo() {
		return (EAttribute)yUiSpanInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiSpanInfo_RowTo() {
		return (EAttribute)yUiSpanInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYUiAlignment() {
		return yUiAlignmentEEnum;
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

		yUiGridLayoutEClass = createEClass(YUI_GRID_LAYOUT);
		createEReference(yUiGridLayoutEClass, YUI_GRID_LAYOUT__CELL_STYLES);
		createEAttribute(yUiGridLayoutEClass, YUI_GRID_LAYOUT__COLUMNS);

		yUiGridLayoutCellEClass = createEClass(YUI_GRID_LAYOUT_CELL);

		yUiGridLayoutCellStyleEClass = createEClass(YUI_GRID_LAYOUT_CELL_STYLE);
		createEReference(yUiGridLayoutCellStyleEClass, YUI_GRID_LAYOUT_CELL_STYLE__TARGET);
		createEAttribute(yUiGridLayoutCellStyleEClass, YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT);
		createEAttribute(yUiGridLayoutCellStyleEClass, YUI_GRID_LAYOUT_CELL_STYLE__GRAB_HORIZONTAL);
		createEAttribute(yUiGridLayoutCellStyleEClass, YUI_GRID_LAYOUT_CELL_STYLE__GRAB_VERTICAL);
		createEReference(yUiGridLayoutCellStyleEClass, YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO);

		yUiSpanInfoEClass = createEClass(YUI_SPAN_INFO);
		createEAttribute(yUiSpanInfoEClass, YUI_SPAN_INFO__COLUMN_FROM);
		createEAttribute(yUiSpanInfoEClass, YUI_SPAN_INFO__ROW_FROM);
		createEAttribute(yUiSpanInfoEClass, YUI_SPAN_INFO__COLUMN_TO);
		createEAttribute(yUiSpanInfoEClass, YUI_SPAN_INFO__ROW_TO);

		// Create enums
		yUiAlignmentEEnum = createEEnum(YUI_ALIGNMENT);
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
		yUiGridLayoutEClass.getESuperTypes().add(theUiModelPackage.getYUiLayout());
		yUiGridLayoutEClass.getESuperTypes().add(theUiModelPackage.getYUiSpacingable());
		yUiGridLayoutEClass.getESuperTypes().add(theUiModelPackage.getYUiMarginable());

		// Initialize classes and features; add operations and parameters
		initEClass(yUiTextFieldEClass, YUiTextField.class, "YUiTextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yUiGridLayoutEClass, YUiGridLayout.class, "YUiGridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiGridLayout_CellStyles(), this.getYUiGridLayoutCellStyle(), null, "cellStyles", null, 0, -1, YUiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiGridLayout_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, YUiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiGridLayoutCellEClass, YUiGridLayoutCell.class, "YUiGridLayoutCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yUiGridLayoutCellStyleEClass, YUiGridLayoutCellStyle.class, "YUiGridLayoutCellStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiGridLayoutCellStyle_Target(), theUiModelPackage.getYUiEmbeddable(), null, "target", null, 1, 1, YUiGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiGridLayoutCellStyle_Alignment(), this.getYUiAlignment(), "alignment", null, 0, 1, YUiGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiGridLayoutCellStyle_GrabHorizontal(), ecorePackage.getEBoolean(), "grabHorizontal", null, 0, 1, YUiGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiGridLayoutCellStyle_GrabVertical(), ecorePackage.getEBoolean(), "grabVertical", null, 0, 1, YUiGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYUiGridLayoutCellStyle_SpanInfo(), this.getYUiSpanInfo(), null, "spanInfo", null, 0, 1, YUiGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiSpanInfoEClass, YUiSpanInfo.class, "YUiSpanInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYUiSpanInfo_ColumnFrom(), ecorePackage.getEInt(), "columnFrom", null, 0, 1, YUiSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiSpanInfo_RowFrom(), ecorePackage.getEInt(), "rowFrom", null, 0, 1, YUiSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiSpanInfo_ColumnTo(), ecorePackage.getEInt(), "columnTo", null, 0, 1, YUiSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiSpanInfo_RowTo(), ecorePackage.getEInt(), "rowTo", null, 0, 1, YUiSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(yUiAlignmentEEnum, YUiAlignment.class, "YUiAlignment");
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.BOTTOM_LEFT);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.BOTTOM_CENTER);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.BOTTOM_RIGHT);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.BOTTOM_FILL);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.MIDDLE_LEFT);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.MIDDLE_CENTER);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.MIDDLE_RIGHT);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.MIDDLE_FILL);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.TOP_LEFT);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.TOP_CENTER);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.TOP_RIGHT);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.TOP_FILL);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.FILL_FILL);

		// Create resource
		createResource(eNS_URI);
	}

} //UimodelExtensionPackageImpl
