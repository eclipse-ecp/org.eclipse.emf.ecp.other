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
package org.eclipse.emf.ecp.ecview.ui.core.model.datatypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/ecp/ecview/datatypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase <em>YDt Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYDtBase()
	 * @generated
	 */
	int YDT_BASE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_BASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_BASE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_BASE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>YDt Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_BASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatatype <em>YDatatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatatype
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYDatatype()
	 * @generated
	 */
	int YDATATYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATATYPE__ID = YDT_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATATYPE__NAME = YDT_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATATYPE__DESCRIPTION = YDT_BASE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>YDatatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATATYPE_FEATURE_COUNT = YDT_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTextDatatypeImpl <em>YText Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTextDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYTextDatatype()
	 * @generated
	 */
	int YTEXT_DATATYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__ID = YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__NAME = YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__DESCRIPTION = YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__MAXLENGTH = YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__MINLENGTH = YDATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regexpression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__REGEXPRESSION = YDATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YText Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE_FEATURE_COUNT = YDATATYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YDatadescriptionImpl <em>YDatadescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YDatadescriptionImpl
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYDatadescription()
	 * @generated
	 */
	int YDATADESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATADESCRIPTION__ID = YDT_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATADESCRIPTION__NAME = YDT_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATADESCRIPTION__DESCRIPTION = YDT_BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATADESCRIPTION__LABEL = YDT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label I1 8n Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATADESCRIPTION__LABEL_I1_8N_KEY = YDT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YDatadescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATADESCRIPTION_FEATURE_COUNT = YDT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTextAreaDatatypeImpl <em>YText Area Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTextAreaDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYTextAreaDatatype()
	 * @generated
	 */
	int YTEXT_AREA_DATATYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE__ID = YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE__NAME = YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE__DESCRIPTION = YDATATYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>YText Area Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE_FEATURE_COUNT = YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YNumericDatatypeImpl <em>YNumeric Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YNumericDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYNumericDatatype()
	 * @generated
	 */
	int YNUMERIC_DATATYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__ID = YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__NAME = YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__DESCRIPTION = YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__GROUPING = YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mark Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__MARK_NEGATIVE = YDATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YNumeric Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE_FEATURE_COUNT = YDATATYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YDecimalDatatypeImpl <em>YDecimal Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YDecimalDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYDecimalDatatype()
	 * @generated
	 */
	int YDECIMAL_DATATYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_DATATYPE__ID = YNUMERIC_DATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_DATATYPE__NAME = YNUMERIC_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_DATATYPE__DESCRIPTION = YNUMERIC_DATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_DATATYPE__GROUPING = YNUMERIC_DATATYPE__GROUPING;

	/**
	 * The feature id for the '<em><b>Mark Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_DATATYPE__MARK_NEGATIVE = YNUMERIC_DATATYPE__MARK_NEGATIVE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_DATATYPE__PRECISION = YNUMERIC_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YDecimal Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_DATATYPE_FEATURE_COUNT = YNUMERIC_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTableDatatypeImpl <em>YTable Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTableDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYTableDatatype()
	 * @generated
	 */
	int YTABLE_DATATYPE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE_DATATYPE__ID = YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE_DATATYPE__NAME = YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE_DATATYPE__DESCRIPTION = YDATATYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>YTable Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE_DATATYPE_FEATURE_COUNT = YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YCheckBoxDatatypeImpl <em>YCheck Box Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YCheckBoxDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYCheckBoxDatatype()
	 * @generated
	 */
	int YCHECK_BOX_DATATYPE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DATATYPE__ID = YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DATATYPE__NAME = YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DATATYPE__DESCRIPTION = YDATATYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>YCheck Box Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DATATYPE_FEATURE_COUNT = YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YComboBoxDatatypeImpl <em>YCombo Box Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YComboBoxDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYComboBoxDatatype()
	 * @generated
	 */
	int YCOMBO_BOX_DATATYPE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX_DATATYPE__ID = YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX_DATATYPE__NAME = YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX_DATATYPE__DESCRIPTION = YDATATYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>YCombo Box Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX_DATATYPE_FEATURE_COUNT = YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YListDataTypeImpl <em>YList Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YListDataTypeImpl
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYListDataType()
	 * @generated
	 */
	int YLIST_DATA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_DATA_TYPE__ID = YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_DATA_TYPE__NAME = YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_DATA_TYPE__DESCRIPTION = YDATATYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>YList Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_DATA_TYPE_FEATURE_COUNT = YDATATYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase <em>YDt Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDt Base</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase
	 * @generated
	 */
	EClass getYDtBase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase#getId()
	 * @see #getYDtBase()
	 * @generated
	 */
	EAttribute getYDtBase_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase#getName()
	 * @see #getYDtBase()
	 * @generated
	 */
	EAttribute getYDtBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase#getDescription()
	 * @see #getYDtBase()
	 * @generated
	 */
	EAttribute getYDtBase_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype <em>YText Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype
	 * @generated
	 */
	EClass getYTextDatatype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getMaxlength()
	 * @see #getYTextDatatype()
	 * @generated
	 */
	EAttribute getYTextDatatype_Maxlength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getMinlength <em>Minlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minlength</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getMinlength()
	 * @see #getYTextDatatype()
	 * @generated
	 */
	EAttribute getYTextDatatype_Minlength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getRegexpression <em>Regexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexpression</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextDatatype#getRegexpression()
	 * @see #getYTextDatatype()
	 * @generated
	 */
	EAttribute getYTextDatatype_Regexpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatatype <em>YDatatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDatatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatatype
	 * @generated
	 */
	EClass getYDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatadescription <em>YDatadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDatadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatadescription
	 * @generated
	 */
	EClass getYDatadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatadescription#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatadescription#getLabel()
	 * @see #getYDatadescription()
	 * @generated
	 */
	EAttribute getYDatadescription_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatadescription#getLabelI18nKey <em>Label I1 8n Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label I1 8n Key</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatadescription#getLabelI18nKey()
	 * @see #getYDatadescription()
	 * @generated
	 */
	EAttribute getYDatadescription_LabelI18nKey();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextAreaDatatype <em>YText Area Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText Area Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTextAreaDatatype
	 * @generated
	 */
	EClass getYTextAreaDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YNumericDatatype <em>YNumeric Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YNumeric Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YNumericDatatype
	 * @generated
	 */
	EClass getYNumericDatatype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YNumericDatatype#isGrouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YNumericDatatype#isGrouping()
	 * @see #getYNumericDatatype()
	 * @generated
	 */
	EAttribute getYNumericDatatype_Grouping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YNumericDatatype#isMarkNegative <em>Mark Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mark Negative</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YNumericDatatype#isMarkNegative()
	 * @see #getYNumericDatatype()
	 * @generated
	 */
	EAttribute getYNumericDatatype_MarkNegative();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDecimalDatatype <em>YDecimal Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDecimal Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDecimalDatatype
	 * @generated
	 */
	EClass getYDecimalDatatype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDecimalDatatype#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDecimalDatatype#getPrecision()
	 * @see #getYDecimalDatatype()
	 * @generated
	 */
	EAttribute getYDecimalDatatype_Precision();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTableDatatype <em>YTable Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTable Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YTableDatatype
	 * @generated
	 */
	EClass getYTableDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YCheckBoxDatatype <em>YCheck Box Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCheck Box Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YCheckBoxDatatype
	 * @generated
	 */
	EClass getYCheckBoxDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YComboBoxDatatype <em>YCombo Box Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCombo Box Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YComboBoxDatatype
	 * @generated
	 */
	EClass getYComboBoxDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YListDataType <em>YList Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YList Data Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YListDataType
	 * @generated
	 */
	EClass getYListDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase <em>YDt Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDtBase
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYDtBase()
		 * @generated
		 */
		EClass YDT_BASE = eINSTANCE.getYDtBase();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDT_BASE__ID = eINSTANCE.getYDtBase_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDT_BASE__NAME = eINSTANCE.getYDtBase_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDT_BASE__DESCRIPTION = eINSTANCE.getYDtBase_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTextDatatypeImpl <em>YText Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTextDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYTextDatatype()
		 * @generated
		 */
		EClass YTEXT_DATATYPE = eINSTANCE.getYTextDatatype();

		/**
		 * The meta object literal for the '<em><b>Maxlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_DATATYPE__MAXLENGTH = eINSTANCE.getYTextDatatype_Maxlength();

		/**
		 * The meta object literal for the '<em><b>Minlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_DATATYPE__MINLENGTH = eINSTANCE.getYTextDatatype_Minlength();

		/**
		 * The meta object literal for the '<em><b>Regexpression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_DATATYPE__REGEXPRESSION = eINSTANCE.getYTextDatatype_Regexpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatatype <em>YDatatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.YDatatype
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYDatatype()
		 * @generated
		 */
		EClass YDATATYPE = eINSTANCE.getYDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YDatadescriptionImpl <em>YDatadescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YDatadescriptionImpl
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYDatadescription()
		 * @generated
		 */
		EClass YDATADESCRIPTION = eINSTANCE.getYDatadescription();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDATADESCRIPTION__LABEL = eINSTANCE.getYDatadescription_Label();

		/**
		 * The meta object literal for the '<em><b>Label I1 8n Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDATADESCRIPTION__LABEL_I1_8N_KEY = eINSTANCE.getYDatadescription_LabelI18nKey();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTextAreaDatatypeImpl <em>YText Area Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTextAreaDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYTextAreaDatatype()
		 * @generated
		 */
		EClass YTEXT_AREA_DATATYPE = eINSTANCE.getYTextAreaDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YNumericDatatypeImpl <em>YNumeric Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YNumericDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYNumericDatatype()
		 * @generated
		 */
		EClass YNUMERIC_DATATYPE = eINSTANCE.getYNumericDatatype();

		/**
		 * The meta object literal for the '<em><b>Grouping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YNUMERIC_DATATYPE__GROUPING = eINSTANCE.getYNumericDatatype_Grouping();

		/**
		 * The meta object literal for the '<em><b>Mark Negative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YNUMERIC_DATATYPE__MARK_NEGATIVE = eINSTANCE.getYNumericDatatype_MarkNegative();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YDecimalDatatypeImpl <em>YDecimal Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YDecimalDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYDecimalDatatype()
		 * @generated
		 */
		EClass YDECIMAL_DATATYPE = eINSTANCE.getYDecimalDatatype();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDECIMAL_DATATYPE__PRECISION = eINSTANCE.getYDecimalDatatype_Precision();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTableDatatypeImpl <em>YTable Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YTableDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYTableDatatype()
		 * @generated
		 */
		EClass YTABLE_DATATYPE = eINSTANCE.getYTableDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YCheckBoxDatatypeImpl <em>YCheck Box Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YCheckBoxDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYCheckBoxDatatype()
		 * @generated
		 */
		EClass YCHECK_BOX_DATATYPE = eINSTANCE.getYCheckBoxDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YComboBoxDatatypeImpl <em>YCombo Box Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YComboBoxDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYComboBoxDatatype()
		 * @generated
		 */
		EClass YCOMBO_BOX_DATATYPE = eINSTANCE.getYComboBoxDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YListDataTypeImpl <em>YList Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.YListDataTypeImpl
		 * @see org.eclipse.emf.ecp.ecview.ui.core.model.datatypes.impl.DatatypesPackageImpl#getYListDataType()
		 * @generated
		 */
		EClass YLIST_DATA_TYPE = eINSTANCE.getYListDataType();

	}

} //DatatypesPackage
