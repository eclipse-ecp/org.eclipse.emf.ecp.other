/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.model.datatypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;

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
 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesFactory
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
	String eNS_URI = "http://eclipse.org/emf/ecp/ecview/common/datatypes";

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
	DatatypesPackage eINSTANCE = org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDtBase <em>YDt Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDtBase
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.DatatypesPackageImpl#getYDtBase()
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
	int YDT_BASE__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_BASE__NAME = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_BASE__DESCRIPTION = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YDt Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDT_BASE_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype <em>YDatatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.DatatypesPackageImpl#getYDatatype()
	 * @generated
	 */
	int YDATATYPE = 1;

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
	 * The feature id for the '<em><b>Validators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATATYPE__VALIDATORS = YDT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YDatatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATATYPE_FEATURE_COUNT = YDT_BASE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.YDatadescriptionImpl <em>YDatadescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.YDatadescriptionImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.DatatypesPackageImpl#getYDatadescription()
	 * @generated
	 */
	int YDATADESCRIPTION = 2;

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
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDtBase <em>YDt Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDt Base</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDtBase
	 * @generated
	 */
	EClass getYDtBase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDtBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDtBase#getName()
	 * @see #getYDtBase()
	 * @generated
	 */
	EAttribute getYDtBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDtBase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDtBase#getDescription()
	 * @see #getYDtBase()
	 * @generated
	 */
	EAttribute getYDtBase_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype <em>YDatatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDatatype</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype
	 * @generated
	 */
	EClass getYDatatype();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype#getValidators <em>Validators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Validators</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype#getValidators()
	 * @see #getYDatatype()
	 * @generated
	 */
	EReference getYDatatype_Validators();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription <em>YDatadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDatadescription</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription
	 * @generated
	 */
	EClass getYDatadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription#getLabel()
	 * @see #getYDatadescription()
	 * @generated
	 */
	EAttribute getYDatadescription_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription#getLabelI18nKey <em>Label I1 8n Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label I1 8n Key</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription#getLabelI18nKey()
	 * @see #getYDatadescription()
	 * @generated
	 */
	EAttribute getYDatadescription_LabelI18nKey();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDtBase <em>YDt Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDtBase
		 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.DatatypesPackageImpl#getYDtBase()
		 * @generated
		 */
		EClass YDT_BASE = eINSTANCE.getYDtBase();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype <em>YDatatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype
		 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.DatatypesPackageImpl#getYDatatype()
		 * @generated
		 */
		EClass YDATATYPE = eINSTANCE.getYDatatype();

		/**
		 * The meta object literal for the '<em><b>Validators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YDATATYPE__VALIDATORS = eINSTANCE.getYDatatype_Validators();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.YDatadescriptionImpl <em>YDatadescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.YDatadescriptionImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.datatypes.impl.DatatypesPackageImpl#getYDatadescription()
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

	}

} //DatatypesPackage
