/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.DatatypesFactory;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YCheckBoxDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YComboBoxDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDecimalDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YListDataType;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTableDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextAreaDatatype;
import org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesPackageImpl extends EPackageImpl implements DatatypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDtBaseEClass = null;

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
	private EClass yDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDatadescriptionEClass = null;

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
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.DatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesPackageImpl() {
		super(eNS_URI, DatatypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatatypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesPackage init() {
		if (isInited) return (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, theDatatypesPackage);
		return theDatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDtBase() {
		return yDtBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDtBase_Id() {
		return (EAttribute)yDtBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDtBase_Name() {
		return (EAttribute)yDtBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDtBase_Description() {
		return (EAttribute)yDtBaseEClass.getEStructuralFeatures().get(2);
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
	public EClass getYDatatype() {
		return yDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDatadescription() {
		return yDatadescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDatadescription_Label() {
		return (EAttribute)yDatadescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDatadescription_LabelI18nKey() {
		return (EAttribute)yDatadescriptionEClass.getEStructuralFeatures().get(1);
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
	public DatatypesFactory getDatatypesFactory() {
		return (DatatypesFactory)getEFactoryInstance();
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
		yDtBaseEClass = createEClass(YDT_BASE);
		createEAttribute(yDtBaseEClass, YDT_BASE__ID);
		createEAttribute(yDtBaseEClass, YDT_BASE__NAME);
		createEAttribute(yDtBaseEClass, YDT_BASE__DESCRIPTION);

		yTextDatatypeEClass = createEClass(YTEXT_DATATYPE);
		createEAttribute(yTextDatatypeEClass, YTEXT_DATATYPE__MAXLENGTH);
		createEAttribute(yTextDatatypeEClass, YTEXT_DATATYPE__MINLENGTH);
		createEAttribute(yTextDatatypeEClass, YTEXT_DATATYPE__REGEXPRESSION);

		yDatatypeEClass = createEClass(YDATATYPE);

		yDatadescriptionEClass = createEClass(YDATADESCRIPTION);
		createEAttribute(yDatadescriptionEClass, YDATADESCRIPTION__LABEL);
		createEAttribute(yDatadescriptionEClass, YDATADESCRIPTION__LABEL_I1_8N_KEY);

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yTextDatatypeEClass.getESuperTypes().add(this.getYDatatype());
		yDatatypeEClass.getESuperTypes().add(this.getYDtBase());
		yDatadescriptionEClass.getESuperTypes().add(this.getYDtBase());
		yTextAreaDatatypeEClass.getESuperTypes().add(this.getYDatatype());
		yNumericDatatypeEClass.getESuperTypes().add(this.getYDatatype());
		yDecimalDatatypeEClass.getESuperTypes().add(this.getYNumericDatatype());
		yTableDatatypeEClass.getESuperTypes().add(this.getYDatatype());
		yCheckBoxDatatypeEClass.getESuperTypes().add(this.getYDatatype());
		yComboBoxDatatypeEClass.getESuperTypes().add(this.getYDatatype());
		yListDataTypeEClass.getESuperTypes().add(this.getYDatatype());

		// Initialize classes and features; add operations and parameters
		initEClass(yDtBaseEClass, YDtBase.class, "YDtBase", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYDtBase_Id(), ecorePackage.getEString(), "id", null, 1, 1, YDtBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYDtBase_Name(), ecorePackage.getEString(), "name", null, 0, 1, YDtBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYDtBase_Description(), ecorePackage.getEString(), "description", null, 0, 1, YDtBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTextDatatypeEClass, YTextDatatype.class, "YTextDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYTextDatatype_Maxlength(), ecorePackage.getEInt(), "maxlength", null, 0, 1, YTextDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTextDatatype_Minlength(), ecorePackage.getEInt(), "minlength", null, 0, 1, YTextDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTextDatatype_Regexpression(), ecorePackage.getEString(), "regexpression", null, 0, 1, YTextDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yDatatypeEClass, YDatatype.class, "YDatatype", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yDatadescriptionEClass, YDatadescription.class, "YDatadescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYDatadescription_Label(), ecorePackage.getEString(), "label", null, 0, 1, YDatadescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYDatadescription_LabelI18nKey(), ecorePackage.getEString(), "labelI18nKey", null, 0, 1, YDatadescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);
	}

} //DatatypesPackageImpl
