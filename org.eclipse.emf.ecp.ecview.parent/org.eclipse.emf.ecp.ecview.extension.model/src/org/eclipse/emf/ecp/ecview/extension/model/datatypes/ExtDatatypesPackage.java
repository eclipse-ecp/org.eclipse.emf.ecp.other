/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.datatypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__MAXLENGTH = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__MINLENGTH = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regexpression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DATATYPE__REGEXPRESSION = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 2;

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
	 * The number of structural features of the '<em>YText Area Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__GROUPING = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mark Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE__MARK_NEGATIVE = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YNumeric Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_DATATYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 2;

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
	 * The number of structural features of the '<em>YList Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_DATA_TYPE_FEATURE_COUNT = DatatypesPackage.YDATATYPE_FEATURE_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype#getMaxlength()
	 * @see #getYTextDatatype()
	 * @generated
	 */
	EAttribute getYTextDatatype_Maxlength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype#getMinlength <em>Minlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minlength</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype#getMinlength()
	 * @see #getYTextDatatype()
	 * @generated
	 */
	EAttribute getYTextDatatype_Minlength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype#getRegexpression <em>Regexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexpression</em>'.
	 * @see org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype#getRegexpression()
	 * @see #getYTextDatatype()
	 * @generated
	 */
	EAttribute getYTextDatatype_Regexpression();

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

	}

} //ExtDatatypesPackage
