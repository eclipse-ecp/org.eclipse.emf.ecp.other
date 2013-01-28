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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.PersonImpl
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.AddressImpl
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 0;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.CountryImpl
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Iso Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ISO_CODE = 0;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Person#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Person#getAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Address();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_Country();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Country#getIsoCode <em>Iso Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Code</em>'.
	 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.Country#getIsoCode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_IsoCode();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.PersonImpl
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ADDRESS = eINSTANCE.getPerson_Address();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.AddressImpl
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.CountryImpl
		 * @see org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.impl.TestmodelPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Iso Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__ISO_CODE = eINSTANCE.getCountry_IsoCode();

	}

} //TestmodelPackage
