/**
 */
package org.eclipse.emf.ecp.ui.model.core.datatypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesFactory
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
	String eNS_URI = "http://eclipse.org/emf/emfclient/uimodel/datatypes";

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
	DatatypesPackage eINSTANCE = org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase <em>YDt Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYDtBase()
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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatatype <em>YDt Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatatype
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYDtDatatype()
	 * @generated
	 */
	int YDT_DATATYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_DATATYPE__ID = YDT_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_DATATYPE__NAME = YDT_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_DATATYPE__DESCRIPTION = YDT_BASE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>YDt Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_DATATYPE_FEATURE_COUNT = YDT_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDTypeImpl <em>YText DType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDTypeImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYTextDType()
	 * @generated
	 */
	int YTEXT_DTYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DTYPE__ID = YDT_DATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DTYPE__NAME = YDT_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DTYPE__DESCRIPTION = YDT_DATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DTYPE__REQUIRED = YDT_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DTYPE__MAXLENGTH = YDT_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DTYPE__MINLENGTH = YDT_DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Regexpression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DTYPE__REGEXPRESSION = YDT_DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YText DType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DTYPE_FEATURE_COUNT = YDT_DATATYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YDtDatadescriptionImpl <em>YDt Datadescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YDtDatadescriptionImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYDtDatadescription()
	 * @generated
	 */
	int YDT_DATADESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_DATADESCRIPTION__ID = YDT_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_DATADESCRIPTION__NAME = YDT_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_DATADESCRIPTION__DESCRIPTION = YDT_BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_DATADESCRIPTION__LABEL = YDT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label I1 8n Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_DATADESCRIPTION__LABEL_I1_8N_KEY = YDT_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YDt Datadescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_DATADESCRIPTION_FEATURE_COUNT = YDT_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDDescImpl <em>YText DDesc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDDescImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYTextDDesc()
	 * @generated
	 */
	int YTEXT_DDESC = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DDESC__ID = YDT_DATADESCRIPTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DDESC__NAME = YDT_DATADESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DDESC__DESCRIPTION = YDT_DATADESCRIPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DDESC__LABEL = YDT_DATADESCRIPTION__LABEL;

	/**
	 * The feature id for the '<em><b>Label I1 8n Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DDESC__LABEL_I1_8N_KEY = YDT_DATADESCRIPTION__LABEL_I1_8N_KEY;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DDESC__DATATYPE = YDT_DATADESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YText DDesc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_DDESC_FEATURE_COUNT = YDT_DATADESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YLabelDDescImpl <em>YLabel DDesc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YLabelDDescImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYLabelDDesc()
	 * @generated
	 */
	int YLABEL_DDESC = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL_DDESC__ID = YDT_DATADESCRIPTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL_DDESC__NAME = YDT_DATADESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL_DDESC__DESCRIPTION = YDT_DATADESCRIPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL_DDESC__LABEL = YDT_DATADESCRIPTION__LABEL;

	/**
	 * The feature id for the '<em><b>Label I1 8n Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL_DDESC__LABEL_I1_8N_KEY = YDT_DATADESCRIPTION__LABEL_I1_8N_KEY;

	/**
	 * The number of structural features of the '<em>YLabel DDesc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL_DDESC_FEATURE_COUNT = YDT_DATADESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextAreaDTypeImpl <em>YText Area DType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextAreaDTypeImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYTextAreaDType()
	 * @generated
	 */
	int YTEXT_AREA_DTYPE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DTYPE__ID = YDT_DATATYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DTYPE__NAME = YDT_DATATYPE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DTYPE__DESCRIPTION = YDT_DATATYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DTYPE__REQUIRED = YDT_DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YText Area DType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DTYPE_FEATURE_COUNT = YDT_DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextAreaDDescImpl <em>YText Area DDesc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextAreaDDescImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYTextAreaDDesc()
	 * @generated
	 */
	int YTEXT_AREA_DDESC = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DDESC__ID = YDT_DATADESCRIPTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DDESC__NAME = YDT_DATADESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DDESC__DESCRIPTION = YDT_DATADESCRIPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DDESC__LABEL = YDT_DATADESCRIPTION__LABEL;

	/**
	 * The feature id for the '<em><b>Label I1 8n Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DDESC__LABEL_I1_8N_KEY = YDT_DATADESCRIPTION__LABEL_I1_8N_KEY;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DDESC__DATATYPE = YDT_DATADESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YText Area DDesc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_DDESC_FEATURE_COUNT = YDT_DATADESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YCheckBoxDDescImpl <em>YCheck Box DDesc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YCheckBoxDDescImpl
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYCheckBoxDDesc()
	 * @generated
	 */
	int YCHECK_BOX_DDESC = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DDESC__ID = YDT_DATADESCRIPTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DDESC__NAME = YDT_DATADESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DDESC__DESCRIPTION = YDT_DATADESCRIPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DDESC__LABEL = YDT_DATADESCRIPTION__LABEL;

	/**
	 * The feature id for the '<em><b>Label I1 8n Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DDESC__LABEL_I1_8N_KEY = YDT_DATADESCRIPTION__LABEL_I1_8N_KEY;

	/**
	 * The number of structural features of the '<em>YCheck Box DDesc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_DDESC_FEATURE_COUNT = YDT_DATADESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase <em>YDt Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDt Base</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase
	 * @generated
	 */
	EClass getYDtBase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase#getId()
	 * @see #getYDtBase()
	 * @generated
	 */
	EAttribute getYDtBase_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase#getName()
	 * @see #getYDtBase()
	 * @generated
	 */
	EAttribute getYDtBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase#getDescription()
	 * @see #getYDtBase()
	 * @generated
	 */
	EAttribute getYDtBase_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType <em>YText DType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText DType</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType
	 * @generated
	 */
	EClass getYTextDType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#isRequired()
	 * @see #getYTextDType()
	 * @generated
	 */
	EAttribute getYTextDType_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getMaxlength()
	 * @see #getYTextDType()
	 * @generated
	 */
	EAttribute getYTextDType_Maxlength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getMinlength <em>Minlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minlength</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getMinlength()
	 * @see #getYTextDType()
	 * @generated
	 */
	EAttribute getYTextDType_Minlength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getRegexpression <em>Regexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexpression</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType#getRegexpression()
	 * @see #getYTextDType()
	 * @generated
	 */
	EAttribute getYTextDType_Regexpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatatype <em>YDt Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDt Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatatype
	 * @generated
	 */
	EClass getYDtDatatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription <em>YDt Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDt Datadescription</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription
	 * @generated
	 */
	EClass getYDtDatadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription#getLabel()
	 * @see #getYDtDatadescription()
	 * @generated
	 */
	EAttribute getYDtDatadescription_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription#getLabelI18nKey <em>Label I1 8n Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label I1 8n Key</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription#getLabelI18nKey()
	 * @see #getYDtDatadescription()
	 * @generated
	 */
	EAttribute getYDtDatadescription_LabelI18nKey();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc <em>YText DDesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText DDesc</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc
	 * @generated
	 */
	EClass getYTextDDesc();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc#getDatatype()
	 * @see #getYTextDDesc()
	 * @generated
	 */
	EReference getYTextDDesc_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YLabelDDesc <em>YLabel DDesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YLabel DDesc</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YLabelDDesc
	 * @generated
	 */
	EClass getYLabelDDesc();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDType <em>YText Area DType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText Area DType</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDType
	 * @generated
	 */
	EClass getYTextAreaDType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDType#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDType#isRequired()
	 * @see #getYTextAreaDType()
	 * @generated
	 */
	EAttribute getYTextAreaDType_Required();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDDesc <em>YText Area DDesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText Area DDesc</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDDesc
	 * @generated
	 */
	EClass getYTextAreaDDesc();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDDesc#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDDesc#getDatatype()
	 * @see #getYTextAreaDDesc()
	 * @generated
	 */
	EReference getYTextAreaDDesc_Datatype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YCheckBoxDDesc <em>YCheck Box DDesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCheck Box DDesc</em>'.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YCheckBoxDDesc
	 * @generated
	 */
	EClass getYCheckBoxDDesc();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase <em>YDt Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYDtBase()
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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDTypeImpl <em>YText DType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDTypeImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYTextDType()
		 * @generated
		 */
		EClass YTEXT_DTYPE = eINSTANCE.getYTextDType();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_DTYPE__REQUIRED = eINSTANCE.getYTextDType_Required();

		/**
		 * The meta object literal for the '<em><b>Maxlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_DTYPE__MAXLENGTH = eINSTANCE.getYTextDType_Maxlength();

		/**
		 * The meta object literal for the '<em><b>Minlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_DTYPE__MINLENGTH = eINSTANCE.getYTextDType_Minlength();

		/**
		 * The meta object literal for the '<em><b>Regexpression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_DTYPE__REGEXPRESSION = eINSTANCE.getYTextDType_Regexpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatatype <em>YDt Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatatype
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYDtDatatype()
		 * @generated
		 */
		EClass YDT_DATATYPE = eINSTANCE.getYDtDatatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YDtDatadescriptionImpl <em>YDt Datadescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YDtDatadescriptionImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYDtDatadescription()
		 * @generated
		 */
		EClass YDT_DATADESCRIPTION = eINSTANCE.getYDtDatadescription();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDT_DATADESCRIPTION__LABEL = eINSTANCE.getYDtDatadescription_Label();

		/**
		 * The meta object literal for the '<em><b>Label I1 8n Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDT_DATADESCRIPTION__LABEL_I1_8N_KEY = eINSTANCE.getYDtDatadescription_LabelI18nKey();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDDescImpl <em>YText DDesc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextDDescImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYTextDDesc()
		 * @generated
		 */
		EClass YTEXT_DDESC = eINSTANCE.getYTextDDesc();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTEXT_DDESC__DATATYPE = eINSTANCE.getYTextDDesc_Datatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YLabelDDescImpl <em>YLabel DDesc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YLabelDDescImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYLabelDDesc()
		 * @generated
		 */
		EClass YLABEL_DDESC = eINSTANCE.getYLabelDDesc();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextAreaDTypeImpl <em>YText Area DType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextAreaDTypeImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYTextAreaDType()
		 * @generated
		 */
		EClass YTEXT_AREA_DTYPE = eINSTANCE.getYTextAreaDType();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_AREA_DTYPE__REQUIRED = eINSTANCE.getYTextAreaDType_Required();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextAreaDDescImpl <em>YText Area DDesc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YTextAreaDDescImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYTextAreaDDesc()
		 * @generated
		 */
		EClass YTEXT_AREA_DDESC = eINSTANCE.getYTextAreaDDesc();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTEXT_AREA_DDESC__DATATYPE = eINSTANCE.getYTextAreaDDesc_Datatype();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YCheckBoxDDescImpl <em>YCheck Box DDesc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.YCheckBoxDDescImpl
		 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.impl.DatatypesPackageImpl#getYCheckBoxDDesc()
		 * @generated
		 */
		EClass YCHECK_BOX_DDESC = eINSTANCE.getYCheckBoxDDesc();

	}

} //DatatypesPackage
