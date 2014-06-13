/**
 */
package org.eclipse.emf.ecp.ecview.databinding.tests.emf.model;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TestmodelFactory
 * @model kind="package"
 * @generated
 */
public interface TestmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/ecp/ecview/databinding/emf/test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestmodelPackage eINSTANCE = org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TPersonImpl <em>TPerson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TPersonImpl
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getTPerson()
	 * @generated
	 */
	int TPERSON = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERSON__ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>TPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TPerson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TAddressImpl <em>TAddress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TAddressImpl
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getTAddress()
	 * @generated
	 */
	int TADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TADDRESS__COUNTRY = 0;

	/**
	 * The number of structural features of the '<em>TAddress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TADDRESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TAddress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TCountryImpl <em>TCountry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TCountryImpl
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getTCountry()
	 * @generated
	 */
	int TCOUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Iso Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTRY__ISO_CODE = 0;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTRY__CITIES = 1;

	/**
	 * The number of structural features of the '<em>TCountry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TCountry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOUNTRY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TListImpl <em>TList</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TListImpl
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getTList()
	 * @generated
	 */
	int TLIST = 3;

	/**
	 * The feature id for the '<em><b>TObject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST__TOBJECT = 0;

	/**
	 * The number of structural features of the '<em>TList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TPerson <em>TPerson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPerson</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TPerson
	 * @generated
	 */
	EClass getTPerson();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TPerson#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TPerson#getAddress()
	 * @see #getTPerson()
	 * @generated
	 */
	EReference getTPerson_Address();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TAddress <em>TAddress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAddress</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TAddress
	 * @generated
	 */
	EClass getTAddress();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TAddress#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TAddress#getCountry()
	 * @see #getTAddress()
	 * @generated
	 */
	EReference getTAddress_Country();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TCountry <em>TCountry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCountry</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TCountry
	 * @generated
	 */
	EClass getTCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TCountry#getIsoCode <em>Iso Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Code</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TCountry#getIsoCode()
	 * @see #getTCountry()
	 * @generated
	 */
	EAttribute getTCountry_IsoCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TCountry#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cities</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TCountry#getCities()
	 * @see #getTCountry()
	 * @generated
	 */
	EAttribute getTCountry_Cities();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TList <em>TList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TList</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TList
	 * @generated
	 */
	EClass getTList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TList#getTObject <em>TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TObject</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TList#getTObject()
	 * @see #getTList()
	 * @generated
	 */
	EAttribute getTList_TObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestmodelFactory getTestmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TPersonImpl <em>TPerson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TPersonImpl
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getTPerson()
		 * @generated
		 */
		EClass TPERSON = eINSTANCE.getTPerson();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPERSON__ADDRESS = eINSTANCE.getTPerson_Address();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TAddressImpl <em>TAddress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TAddressImpl
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getTAddress()
		 * @generated
		 */
		EClass TADDRESS = eINSTANCE.getTAddress();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TADDRESS__COUNTRY = eINSTANCE.getTAddress_Country();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TCountryImpl <em>TCountry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TCountryImpl
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getTCountry()
		 * @generated
		 */
		EClass TCOUNTRY = eINSTANCE.getTCountry();

		/**
		 * The meta object literal for the '<em><b>Iso Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCOUNTRY__ISO_CODE = eINSTANCE.getTCountry_IsoCode();

		/**
		 * The meta object literal for the '<em><b>Cities</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCOUNTRY__CITIES = eINSTANCE.getTCountry_Cities();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TListImpl <em>TList</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TListImpl
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getTList()
		 * @generated
		 */
		EClass TLIST = eINSTANCE.getTList();

		/**
		 * The meta object literal for the '<em><b>TObject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLIST__TOBJECT = eINSTANCE.getTList_TObject();

	}

} //TestmodelPackage
