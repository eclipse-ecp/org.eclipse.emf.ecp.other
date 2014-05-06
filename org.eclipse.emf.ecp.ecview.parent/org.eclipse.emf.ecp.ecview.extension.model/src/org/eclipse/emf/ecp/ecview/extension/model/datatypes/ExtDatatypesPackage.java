/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.datatypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage;

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
 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface ExtDatatypesPackage extends EPackage {
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
	String eNS_URI = "http://eclipse.org/emf/ecp/ecview/extension/datatypes";

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
	ExtDatatypesPackage eINSTANCE = org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTextDatatypeImpl <em>YText Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTextDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYTextDatatype()
	 * @generated
	 */
	int YTEXT_DATATYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__MAX_LENGTH = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__MIN_LENGTH = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__REG_EXPRESSION = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YText Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTextAreaDatatypeImpl <em>YText Area Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTextAreaDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYTextAreaDatatype()
	 * @generated
	 */
	int YTEXT_AREA_DATATYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE__MIN_LENGTH = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE__MAX_LENGTH = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE__REG_EXPRESSION = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YText Area Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YNumericDatatypeImpl <em>YNumeric Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YNumericDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYNumericDatatype()
	 * @generated
	 */
	int YNUMERIC_DATATYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__REG_EXPRESSION = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__GROUPING = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mark Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__MARK_NEGATIVE = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YNumeric Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YDecimalDatatypeImpl <em>YDecimal Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YDecimalDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYDecimalDatatype()
	 * @generated
	 */
	int YDECIMAL_DATATYPE = 3;

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
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_DATATYPE__VALIDATORS = YNUMERIC_DATATYPE__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Reg Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_DATATYPE__REG_EXPRESSION = YNUMERIC_DATATYPE__REG_EXPRESSION;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTableDatatypeImpl <em>YTable Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTableDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYTableDatatype()
	 * @generated
	 */
	int YTABLE_DATATYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE_DATATYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE_DATATYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE_DATATYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE_DATATYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The number of structural features of the '<em>YTable Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YCheckBoxDatatypeImpl <em>YCheck Box Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YCheckBoxDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYCheckBoxDatatype()
	 * @generated
	 */
	int YCHECK_BOX_DATATYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DATATYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DATATYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DATATYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DATATYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The number of structural features of the '<em>YCheck Box Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YComboBoxDatatypeImpl <em>YCombo Box Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YComboBoxDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYComboBoxDatatype()
	 * @generated
	 */
	int YCOMBO_BOX_DATATYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX_DATATYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX_DATATYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX_DATATYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX_DATATYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The number of structural features of the '<em>YCombo Box Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YListDataTypeImpl <em>YList Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YListDataTypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYListDataType()
	 * @generated
	 */
	int YLIST_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_DATA_TYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_DATA_TYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_DATA_TYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_DATA_TYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The number of structural features of the '<em>YList Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_DATA_TYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YOptionsGroupDataTypeImpl <em>YOptions Group Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YOptionsGroupDataTypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYOptionsGroupDataType()
	 * @generated
	 */
	int YOPTIONS_GROUP_DATA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP_DATA_TYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP_DATA_TYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP_DATA_TYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP_DATA_TYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The number of structural features of the '<em>YOptions Group Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP_DATA_TYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YBrowserDatatypeImpl <em>YBrowser Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YBrowserDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYBrowserDatatype()
	 * @generated
	 */
	int YBROWSER_DATATYPE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER_DATATYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER_DATATYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER_DATATYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER_DATATYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The number of structural features of the '<em>YBrowser Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YDateTimeDatatypeImpl <em>YDate Time Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YDateTimeDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYDateTimeDatatype()
	 * @generated
	 */
	int YDATE_TIME_DATATYPE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME_DATATYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME_DATATYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME_DATATYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME_DATATYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME_DATATYPE__FORMAT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YDate Time Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTreeDatatypeImpl <em>YTree Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTreeDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYTreeDatatype()
	 * @generated
	 */
	int YTREE_DATATYPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE_DATATYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE_DATATYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE_DATATYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE_DATATYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The number of structural features of the '<em>YTree Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YProgressBarDatatypeImpl <em>YProgress Bar Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YProgressBarDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYProgressBarDatatype()
	 * @generated
	 */
	int YPROGRESS_BAR_DATATYPE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR_DATATYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR_DATATYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR_DATATYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR_DATATYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The number of structural features of the '<em>YProgress Bar Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTabSheetDatatypeImpl <em>YTab Sheet Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTabSheetDatatypeImpl
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYTabSheetDatatype()
	 * @generated
	 */
	int YTAB_SHEET_DATATYPE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET_DATATYPE__ID = DatatypesPackage.YDATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET_DATATYPE__NAME = DatatypesPackage.YDATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET_DATATYPE__DESCRIPTION = DatatypesPackage.YDATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET_DATATYPE__VALIDATORS = DatatypesPackage.YDATATYPE__VALIDATORS;

	/**
	 * The number of structural features of the '<em>YTab Sheet Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeFormat <em>YDate Time Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeFormat
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYDateTimeFormat()
	 * @generated
	 */
	int YDATE_TIME_FORMAT = 14;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype <em>YText Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype
	 * @generated
	 */
	EClass getYTextDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextAreaDatatype <em>YText Area Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText Area Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextAreaDatatype
	 * @generated
	 */
	EClass getYTextAreaDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype <em>YNumeric Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YNumeric Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype
	 * @generated
	 */
	EClass getYNumericDatatype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype#isGrouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype#isGrouping()
	 * @see #getYNumericDatatype()
	 * @generated
	 */
	EAttribute getYNumericDatatype_Grouping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype#isMarkNegative <em>Mark Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mark Negative</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype#isMarkNegative()
	 * @see #getYNumericDatatype()
	 * @generated
	 */
	EAttribute getYNumericDatatype_MarkNegative();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDecimalDatatype <em>YDecimal Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDecimal Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDecimalDatatype
	 * @generated
	 */
	EClass getYDecimalDatatype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDecimalDatatype#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDecimalDatatype#getPrecision()
	 * @see #getYDecimalDatatype()
	 * @generated
	 */
	EAttribute getYDecimalDatatype_Precision();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTableDatatype <em>YTable Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTable Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTableDatatype
	 * @generated
	 */
	EClass getYTableDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YCheckBoxDatatype <em>YCheck Box Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCheck Box Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YCheckBoxDatatype
	 * @generated
	 */
	EClass getYCheckBoxDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YComboBoxDatatype <em>YCombo Box Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCombo Box Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YComboBoxDatatype
	 * @generated
	 */
	EClass getYComboBoxDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YListDataType <em>YList Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YList Data Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YListDataType
	 * @generated
	 */
	EClass getYListDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YOptionsGroupDataType <em>YOptions Group Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YOptions Group Data Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YOptionsGroupDataType
	 * @generated
	 */
	EClass getYOptionsGroupDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YBrowserDatatype <em>YBrowser Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBrowser Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YBrowserDatatype
	 * @generated
	 */
	EClass getYBrowserDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeDatatype <em>YDate Time Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDate Time Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeDatatype
	 * @generated
	 */
	EClass getYDateTimeDatatype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeDatatype#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeDatatype#getFormat()
	 * @see #getYDateTimeDatatype()
	 * @generated
	 */
	EAttribute getYDateTimeDatatype_Format();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTreeDatatype <em>YTree Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTree Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTreeDatatype
	 * @generated
	 */
	EClass getYTreeDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YProgressBarDatatype <em>YProgress Bar Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YProgress Bar Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YProgressBarDatatype
	 * @generated
	 */
	EClass getYProgressBarDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTabSheetDatatype <em>YTab Sheet Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTab Sheet Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTabSheetDatatype
	 * @generated
	 */
	EClass getYTabSheetDatatype();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeFormat <em>YDate Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YDate Time Format</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeFormat
	 * @generated
	 */
	EEnum getYDateTimeFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtDatatypesFactory getExtDatatypesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTextDatatypeImpl <em>YText Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTextDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYTextDatatype()
		 * @generated
		 */
		EClass YTEXT_DATATYPE = eINSTANCE.getYTextDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTextAreaDatatypeImpl <em>YText Area Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTextAreaDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYTextAreaDatatype()
		 * @generated
		 */
		EClass YTEXT_AREA_DATATYPE = eINSTANCE.getYTextAreaDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YNumericDatatypeImpl <em>YNumeric Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YNumericDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYNumericDatatype()
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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YDecimalDatatypeImpl <em>YDecimal Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YDecimalDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYDecimalDatatype()
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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTableDatatypeImpl <em>YTable Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTableDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYTableDatatype()
		 * @generated
		 */
		EClass YTABLE_DATATYPE = eINSTANCE.getYTableDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YCheckBoxDatatypeImpl <em>YCheck Box Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YCheckBoxDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYCheckBoxDatatype()
		 * @generated
		 */
		EClass YCHECK_BOX_DATATYPE = eINSTANCE.getYCheckBoxDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YComboBoxDatatypeImpl <em>YCombo Box Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YComboBoxDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYComboBoxDatatype()
		 * @generated
		 */
		EClass YCOMBO_BOX_DATATYPE = eINSTANCE.getYComboBoxDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YListDataTypeImpl <em>YList Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YListDataTypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYListDataType()
		 * @generated
		 */
		EClass YLIST_DATA_TYPE = eINSTANCE.getYListDataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YOptionsGroupDataTypeImpl <em>YOptions Group Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YOptionsGroupDataTypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYOptionsGroupDataType()
		 * @generated
		 */
		EClass YOPTIONS_GROUP_DATA_TYPE = eINSTANCE.getYOptionsGroupDataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YBrowserDatatypeImpl <em>YBrowser Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YBrowserDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYBrowserDatatype()
		 * @generated
		 */
		EClass YBROWSER_DATATYPE = eINSTANCE.getYBrowserDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YDateTimeDatatypeImpl <em>YDate Time Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YDateTimeDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYDateTimeDatatype()
		 * @generated
		 */
		EClass YDATE_TIME_DATATYPE = eINSTANCE.getYDateTimeDatatype();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDATE_TIME_DATATYPE__FORMAT = eINSTANCE.getYDateTimeDatatype_Format();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTreeDatatypeImpl <em>YTree Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTreeDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYTreeDatatype()
		 * @generated
		 */
		EClass YTREE_DATATYPE = eINSTANCE.getYTreeDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YProgressBarDatatypeImpl <em>YProgress Bar Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YProgressBarDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYProgressBarDatatype()
		 * @generated
		 */
		EClass YPROGRESS_BAR_DATATYPE = eINSTANCE.getYProgressBarDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTabSheetDatatypeImpl <em>YTab Sheet Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.YTabSheetDatatypeImpl
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYTabSheetDatatype()
		 * @generated
		 */
		EClass YTAB_SHEET_DATATYPE = eINSTANCE.getYTabSheetDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeFormat <em>YDate Time Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDateTimeFormat
		 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl#getYDateTimeFormat()
		 * @generated
		 */
		EEnum YDATE_TIME_FORMAT = eINSTANCE.getYDateTimeFormat();

	}

} //ExtDatatypesPackage
