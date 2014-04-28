/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YBrowserDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YCheckBoxDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YComboBoxDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeFormat;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDecimalDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YListDataType;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YOptionsGroupDataType;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YProgressBarDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTabSheetDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTableDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextAreaDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTreeDatatype;
import validation.ValidationPackage;
import validation.impl.ValidationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtDatatypesPackageImpl extends EPackageImpl implements ExtDatatypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTextDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTextAreaDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yNumericDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDecimalDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTableDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCheckBoxDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yComboBoxDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yListDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yOptionsGroupDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBrowserDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDateTimeDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTreeDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yProgressBarDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTabSheetDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yDateTimeFormatEEnum = null;

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
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtDatatypesPackageImpl() {
		super(eNS_URI, ExtDatatypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExtDatatypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtDatatypesPackage init() {
		if (isInited) return (ExtDatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(ExtDatatypesPackage.eNS_URI);

		// Obtain or create and register package
		ExtDatatypesPackageImpl theExtDatatypesPackage = (ExtDatatypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtDatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtDatatypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DatatypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) instanceof ValidationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI) : ValidationPackage.eINSTANCE);

		// Create package meta-data objects
		theExtDatatypesPackage.createPackageContents();
		theValidationPackage.createPackageContents();

		// Initialize created meta-data
		theExtDatatypesPackage.initializePackageContents();
		theValidationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtDatatypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtDatatypesPackage.eNS_URI, theExtDatatypesPackage);
		return theExtDatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTextDatatype() {
		return yTextDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTextDatatype_Maxlength() {
		return (EAttribute)yTextDatatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTextDatatype_Minlength() {
		return (EAttribute)yTextDatatypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTextDatatype_Regexpression() {
		return (EAttribute)yTextDatatypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTextAreaDatatype() {
		return yTextAreaDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYNumericDatatype() {
		return yNumericDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYNumericDatatype_Grouping() {
		return (EAttribute)yNumericDatatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYNumericDatatype_MarkNegative() {
		return (EAttribute)yNumericDatatypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDecimalDatatype() {
		return yDecimalDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDecimalDatatype_Precision() {
		return (EAttribute)yDecimalDatatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTableDatatype() {
		return yTableDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCheckBoxDatatype() {
		return yCheckBoxDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYComboBoxDatatype() {
		return yComboBoxDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYListDataType() {
		return yListDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYOptionsGroupDataType() {
		return yOptionsGroupDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBrowserDatatype() {
		return yBrowserDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDateTimeDatatype() {
		return yDateTimeDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDateTimeDatatype_Format() {
		return (EAttribute)yDateTimeDatatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTreeDatatype() {
		return yTreeDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYProgressBarDatatype() {
		return yProgressBarDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTabSheetDatatype() {
		return yTabSheetDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYDateTimeFormat() {
		return yDateTimeFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtDatatypesFactory getExtDatatypesFactory() {
		return (ExtDatatypesFactory)getEFactoryInstance();
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
		yTextDatatypeEClass = createEClass(YTEXT_DATATYPE);
		createEAttribute(yTextDatatypeEClass, YTEXT_DATATYPE__MAXLENGTH);
		createEAttribute(yTextDatatypeEClass, YTEXT_DATATYPE__MINLENGTH);
		createEAttribute(yTextDatatypeEClass, YTEXT_DATATYPE__REGEXPRESSION);

		yTextAreaDatatypeEClass = createEClass(YTEXT_AREA_DATATYPE);

		yNumericDatatypeEClass = createEClass(YNUMERIC_DATATYPE);
		createEAttribute(yNumericDatatypeEClass, YNUMERIC_DATATYPE__GROUPING);
		createEAttribute(yNumericDatatypeEClass, YNUMERIC_DATATYPE__MARK_NEGATIVE);

		yDecimalDatatypeEClass = createEClass(YDECIMAL_DATATYPE);
		createEAttribute(yDecimalDatatypeEClass, YDECIMAL_DATATYPE__PRECISION);

		yTableDatatypeEClass = createEClass(YTABLE_DATATYPE);

		yCheckBoxDatatypeEClass = createEClass(YCHECK_BOX_DATATYPE);

		yComboBoxDatatypeEClass = createEClass(YCOMBO_BOX_DATATYPE);

		yListDataTypeEClass = createEClass(YLIST_DATA_TYPE);

		yOptionsGroupDataTypeEClass = createEClass(YOPTIONS_GROUP_DATA_TYPE);

		yBrowserDatatypeEClass = createEClass(YBROWSER_DATATYPE);

		yDateTimeDatatypeEClass = createEClass(YDATE_TIME_DATATYPE);
		createEAttribute(yDateTimeDatatypeEClass, YDATE_TIME_DATATYPE__FORMAT);

		yTreeDatatypeEClass = createEClass(YTREE_DATATYPE);

		yProgressBarDatatypeEClass = createEClass(YPROGRESS_BAR_DATATYPE);

		yTabSheetDatatypeEClass = createEClass(YTAB_SHEET_DATATYPE);

		// Create enums
		yDateTimeFormatEEnum = createEEnum(YDATE_TIME_FORMAT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yTextDatatypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yTextAreaDatatypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yNumericDatatypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yDecimalDatatypeEClass.getESuperTypes().add(this.getYNumericDatatype());
		yTableDatatypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yCheckBoxDatatypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yComboBoxDatatypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yListDataTypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yOptionsGroupDataTypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yBrowserDatatypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yDateTimeDatatypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yTreeDatatypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yProgressBarDatatypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());
		yTabSheetDatatypeEClass.getESuperTypes().add(theDatatypesPackage.getYDatatype());

		// Initialize classes and features; add operations and parameters
		initEClass(yTextDatatypeEClass, YTextDatatype.class, "YTextDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYTextDatatype_Maxlength(), ecorePackage.getEInt(), "maxlength", "-1", 0, 1, YTextDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTextDatatype_Minlength(), ecorePackage.getEInt(), "minlength", "-1", 0, 1, YTextDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTextDatatype_Regexpression(), ecorePackage.getEString(), "regexpression", null, 0, 1, YTextDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTextAreaDatatypeEClass, YTextAreaDatatype.class, "YTextAreaDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yNumericDatatypeEClass, YNumericDatatype.class, "YNumericDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYNumericDatatype_Grouping(), ecorePackage.getEBoolean(), "grouping", "true", 0, 1, YNumericDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYNumericDatatype_MarkNegative(), ecorePackage.getEBoolean(), "markNegative", "true", 0, 1, YNumericDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yDecimalDatatypeEClass, YDecimalDatatype.class, "YDecimalDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYDecimalDatatype_Precision(), ecorePackage.getEInt(), "precision", "2", 0, 1, YDecimalDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTableDatatypeEClass, YTableDatatype.class, "YTableDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yCheckBoxDatatypeEClass, YCheckBoxDatatype.class, "YCheckBoxDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yComboBoxDatatypeEClass, YComboBoxDatatype.class, "YComboBoxDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yListDataTypeEClass, YListDataType.class, "YListDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yOptionsGroupDataTypeEClass, YOptionsGroupDataType.class, "YOptionsGroupDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yBrowserDatatypeEClass, YBrowserDatatype.class, "YBrowserDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yDateTimeDatatypeEClass, YDateTimeDatatype.class, "YDateTimeDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYDateTimeDatatype_Format(), this.getYDateTimeFormat(), "format", "DATE", 0, 1, YDateTimeDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTreeDatatypeEClass, YTreeDatatype.class, "YTreeDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yProgressBarDatatypeEClass, YProgressBarDatatype.class, "YProgressBarDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yTabSheetDatatypeEClass, YTabSheetDatatype.class, "YTabSheetDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(yDateTimeFormatEEnum, YDateTimeFormat.class, "YDateTimeFormat");
		addEEnumLiteral(yDateTimeFormatEEnum, YDateTimeFormat.DATE);
		addEEnumLiteral(yDateTimeFormatEEnum, YDateTimeFormat.TIME);
		addEEnumLiteral(yDateTimeFormatEEnum, YDateTimeFormat.DATE_TIME);

		// Create resource
		createResource(eNS_URI);
	}

} //ExtDatatypesPackageImpl
