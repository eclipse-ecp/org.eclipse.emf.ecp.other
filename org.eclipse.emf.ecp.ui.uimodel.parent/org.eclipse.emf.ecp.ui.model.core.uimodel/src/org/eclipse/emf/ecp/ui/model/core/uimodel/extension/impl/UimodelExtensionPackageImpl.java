/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiDecimalField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiInput;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiNumericField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea;
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
	private EClass yUiTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiTextAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiDecimalFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yUiNumericFieldEClass = null;

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
		DatatypesPackage.eINSTANCE.eClass();

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
	public EReference getYUiTextField_Datatype() {
		return (EReference)yUiTextFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiTextField_Datadescription() {
		return (EReference)yUiTextFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiTextField_BindsTo() {
		return (EAttribute)yUiTextFieldEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getYUiGridLayout_FillHorizontal() {
		return (EAttribute)yUiGridLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiGridLayout_FillVertical() {
		return (EAttribute)yUiGridLayoutEClass.getEStructuralFeatures().get(3);
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
	public EReference getYUiGridLayoutCellStyle_SpanInfo() {
		return (EReference)yUiGridLayoutCellStyleEClass.getEStructuralFeatures().get(2);
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
	public EClass getYUiTable() {
		return yUiTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiTable_Datatype() {
		return (EReference)yUiTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiTable_Datadescription() {
		return (EReference)yUiTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiLabel() {
		return yUiLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiLabel_Datadescription() {
		return (EReference)yUiLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiTextArea() {
		return yUiTextAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiTextArea_Datadescription() {
		return (EReference)yUiTextAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiTextArea_Datatype() {
		return (EReference)yUiTextAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiCheckBox() {
		return yUiCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiCheckBox_Datadescription() {
		return (EReference)yUiCheckBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiCheckBox_Datatype() {
		return (EReference)yUiCheckBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiInput() {
		return yUiInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiInput_Readonly() {
		return (EAttribute)yUiInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiInput_Enabled() {
		return (EAttribute)yUiInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiInput_Required() {
		return (EAttribute)yUiInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYUiInput_Visible() {
		return (EAttribute)yUiInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiDecimalField() {
		return yUiDecimalFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiDecimalField_Datatype() {
		return (EReference)yUiDecimalFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiDecimalField_Datadescription() {
		return (EReference)yUiDecimalFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYUiNumericField() {
		return yUiNumericFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiNumericField_Datatype() {
		return (EReference)yUiNumericFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYUiNumericField_Datadescription() {
		return (EReference)yUiNumericFieldEClass.getEStructuralFeatures().get(1);
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
		createEReference(yUiTextFieldEClass, YUI_TEXT_FIELD__DATATYPE);
		createEAttribute(yUiTextFieldEClass, YUI_TEXT_FIELD__BINDS_TO);
		createEReference(yUiTextFieldEClass, YUI_TEXT_FIELD__DATADESCRIPTION);

		yUiGridLayoutEClass = createEClass(YUI_GRID_LAYOUT);
		createEReference(yUiGridLayoutEClass, YUI_GRID_LAYOUT__CELL_STYLES);
		createEAttribute(yUiGridLayoutEClass, YUI_GRID_LAYOUT__COLUMNS);
		createEAttribute(yUiGridLayoutEClass, YUI_GRID_LAYOUT__FILL_HORIZONTAL);
		createEAttribute(yUiGridLayoutEClass, YUI_GRID_LAYOUT__FILL_VERTICAL);

		yUiGridLayoutCellStyleEClass = createEClass(YUI_GRID_LAYOUT_CELL_STYLE);
		createEReference(yUiGridLayoutCellStyleEClass, YUI_GRID_LAYOUT_CELL_STYLE__TARGET);
		createEAttribute(yUiGridLayoutCellStyleEClass, YUI_GRID_LAYOUT_CELL_STYLE__ALIGNMENT);
		createEReference(yUiGridLayoutCellStyleEClass, YUI_GRID_LAYOUT_CELL_STYLE__SPAN_INFO);

		yUiSpanInfoEClass = createEClass(YUI_SPAN_INFO);
		createEAttribute(yUiSpanInfoEClass, YUI_SPAN_INFO__COLUMN_FROM);
		createEAttribute(yUiSpanInfoEClass, YUI_SPAN_INFO__ROW_FROM);
		createEAttribute(yUiSpanInfoEClass, YUI_SPAN_INFO__COLUMN_TO);
		createEAttribute(yUiSpanInfoEClass, YUI_SPAN_INFO__ROW_TO);

		yUiTableEClass = createEClass(YUI_TABLE);
		createEReference(yUiTableEClass, YUI_TABLE__DATATYPE);
		createEReference(yUiTableEClass, YUI_TABLE__DATADESCRIPTION);

		yUiLabelEClass = createEClass(YUI_LABEL);
		createEReference(yUiLabelEClass, YUI_LABEL__DATADESCRIPTION);

		yUiTextAreaEClass = createEClass(YUI_TEXT_AREA);
		createEReference(yUiTextAreaEClass, YUI_TEXT_AREA__DATADESCRIPTION);
		createEReference(yUiTextAreaEClass, YUI_TEXT_AREA__DATATYPE);

		yUiCheckBoxEClass = createEClass(YUI_CHECK_BOX);
		createEReference(yUiCheckBoxEClass, YUI_CHECK_BOX__DATADESCRIPTION);
		createEReference(yUiCheckBoxEClass, YUI_CHECK_BOX__DATATYPE);

		yUiInputEClass = createEClass(YUI_INPUT);
		createEAttribute(yUiInputEClass, YUI_INPUT__READONLY);
		createEAttribute(yUiInputEClass, YUI_INPUT__ENABLED);
		createEAttribute(yUiInputEClass, YUI_INPUT__REQUIRED);
		createEAttribute(yUiInputEClass, YUI_INPUT__VISIBLE);

		yUiDecimalFieldEClass = createEClass(YUI_DECIMAL_FIELD);
		createEReference(yUiDecimalFieldEClass, YUI_DECIMAL_FIELD__DATATYPE);
		createEReference(yUiDecimalFieldEClass, YUI_DECIMAL_FIELD__DATADESCRIPTION);

		yUiNumericFieldEClass = createEClass(YUI_NUMERIC_FIELD);
		createEReference(yUiNumericFieldEClass, YUI_NUMERIC_FIELD__DATATYPE);
		createEReference(yUiNumericFieldEClass, YUI_NUMERIC_FIELD__DATADESCRIPTION);

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
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
		UiModelPackage theUiModelPackage = (UiModelPackage)EPackage.Registry.INSTANCE.getEPackage(UiModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yUiTextFieldEClass.getESuperTypes().add(this.getYUiInput());
		yUiGridLayoutEClass.getESuperTypes().add(theUiModelPackage.getYUiLayout());
		yUiGridLayoutEClass.getESuperTypes().add(theUiModelPackage.getYUiSpacingable());
		yUiGridLayoutEClass.getESuperTypes().add(theUiModelPackage.getYUiMarginable());
		yUiTableEClass.getESuperTypes().add(this.getYUiInput());
		yUiLabelEClass.getESuperTypes().add(theUiModelPackage.getYUiField());
		yUiTextAreaEClass.getESuperTypes().add(this.getYUiInput());
		yUiCheckBoxEClass.getESuperTypes().add(this.getYUiInput());
		yUiInputEClass.getESuperTypes().add(theUiModelPackage.getYUiField());
		yUiDecimalFieldEClass.getESuperTypes().add(this.getYUiInput());
		yUiNumericFieldEClass.getESuperTypes().add(this.getYUiInput());

		// Initialize classes and features; add operations and parameters
		initEClass(yUiTextFieldEClass, YUiTextField.class, "YUiTextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiTextField_Datatype(), theDatatypesPackage.getYTextDatatype(), null, "datatype", null, 0, 1, YUiTextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiTextField_BindsTo(), ecorePackage.getEString(), "bindsTo", null, 0, 1, YUiTextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYUiTextField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YUiTextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiGridLayoutEClass, YUiGridLayout.class, "YUiGridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiGridLayout_CellStyles(), this.getYUiGridLayoutCellStyle(), null, "cellStyles", null, 0, -1, YUiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiGridLayout_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, YUiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiGridLayout_FillHorizontal(), ecorePackage.getEBoolean(), "fillHorizontal", "true", 0, 1, YUiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiGridLayout_FillVertical(), ecorePackage.getEBoolean(), "fillVertical", "true", 0, 1, YUiGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiGridLayoutCellStyleEClass, YUiGridLayoutCellStyle.class, "YUiGridLayoutCellStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiGridLayoutCellStyle_Target(), theUiModelPackage.getYUiEmbeddable(), null, "target", null, 1, 1, YUiGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiGridLayoutCellStyle_Alignment(), this.getYUiAlignment(), "alignment", "UNDEFINED", 0, 1, YUiGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYUiGridLayoutCellStyle_SpanInfo(), this.getYUiSpanInfo(), null, "spanInfo", null, 0, 1, YUiGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiSpanInfoEClass, YUiSpanInfo.class, "YUiSpanInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYUiSpanInfo_ColumnFrom(), ecorePackage.getEInt(), "columnFrom", null, 0, 1, YUiSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiSpanInfo_RowFrom(), ecorePackage.getEInt(), "rowFrom", null, 0, 1, YUiSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiSpanInfo_ColumnTo(), ecorePackage.getEInt(), "columnTo", null, 0, 1, YUiSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiSpanInfo_RowTo(), ecorePackage.getEInt(), "rowTo", null, 0, 1, YUiSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiTableEClass, YUiTable.class, "YUiTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiTable_Datatype(), theDatatypesPackage.getYTableDatatype(), null, "datatype", null, 0, 1, YUiTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYUiTable_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YUiTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiLabelEClass, YUiLabel.class, "YUiLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiLabel_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YUiLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiTextAreaEClass, YUiTextArea.class, "YUiTextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiTextArea_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YUiTextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYUiTextArea_Datatype(), theDatatypesPackage.getYTextAreaDatatype(), null, "datatype", null, 0, 1, YUiTextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiCheckBoxEClass, YUiCheckBox.class, "YUiCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiCheckBox_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YUiCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYUiCheckBox_Datatype(), theDatatypesPackage.getYCheckBoxDatatype(), null, "datatype", null, 0, 1, YUiCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiInputEClass, YUiInput.class, "YUiInput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYUiInput_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 0, 1, YUiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiInput_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, YUiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiInput_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, YUiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYUiInput_Visible(), ecorePackage.getEBoolean(), "visible", null, 0, 1, YUiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiDecimalFieldEClass, YUiDecimalField.class, "YUiDecimalField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiDecimalField_Datatype(), theDatatypesPackage.getYDecimalDatatype(), null, "datatype", null, 0, 1, YUiDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYUiDecimalField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YUiDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yUiNumericFieldEClass, YUiNumericField.class, "YUiNumericField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYUiNumericField_Datatype(), theDatatypesPackage.getYNumericDatatype(), null, "datatype", null, 0, 1, YUiNumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYUiNumericField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YUiNumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.FILL_LEFT);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.FILL_CENTER);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.FILL_RIGHT);
		addEEnumLiteral(yUiAlignmentEEnum, YUiAlignment.UNDEFINED);

		// Create resource
		createResource(eNS_URI);
	}

} //UimodelExtensionPackageImpl
