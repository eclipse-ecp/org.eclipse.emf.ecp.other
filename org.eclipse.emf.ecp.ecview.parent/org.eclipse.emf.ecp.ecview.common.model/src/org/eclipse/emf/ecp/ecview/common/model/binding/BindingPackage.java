/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;

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
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory
 * @model kind="package"
 * @generated
 */
public interface BindingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "binding";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/ecp/ecview/common/binding";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "binding";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BindingPackage eINSTANCE = org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingSetImpl <em>YBinding Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingSetImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindingSet()
	 * @generated
	 */
	int YBINDING_SET = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_SET__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_SET__BINDINGS = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YBinding Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_SET_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingEndpointImpl <em>YBinding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindingEndpoint()
	 * @generated
	 */
	int YBINDING_ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_ENDPOINT__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The number of structural features of the '<em>YBinding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_ENDPOINT_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl <em>YBinding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBinding()
	 * @generated
	 */
	int YBINDING = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING__TARGET_VALUE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING__MODEL_VALUE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YBinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet <em>YBinding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBinding Set</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet
	 * @generated
	 */
	EClass getYBindingSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet#getBindings()
	 * @see #getYBindingSet()
	 * @generated
	 */
	EReference getYBindingSet_Bindings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint <em>YBinding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBinding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint
	 * @generated
	 */
	EClass getYBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding <em>YBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBinding</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBinding
	 * @generated
	 */
	EClass getYBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Value</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getTargetValue()
	 * @see #getYBinding()
	 * @generated
	 */
	EReference getYBinding_TargetValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getModelValue <em>Model Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Value</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getModelValue()
	 * @see #getYBinding()
	 * @generated
	 */
	EReference getYBinding_ModelValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BindingFactory getBindingFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingSetImpl <em>YBinding Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingSetImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindingSet()
		 * @generated
		 */
		EClass YBINDING_SET = eINSTANCE.getYBindingSet();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBINDING_SET__BINDINGS = eINSTANCE.getYBindingSet_Bindings();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingEndpointImpl <em>YBinding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindingEndpoint()
		 * @generated
		 */
		EClass YBINDING_ENDPOINT = eINSTANCE.getYBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl <em>YBinding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBinding()
		 * @generated
		 */
		EClass YBINDING = eINSTANCE.getYBinding();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBINDING__TARGET_VALUE = eINSTANCE.getYBinding_TargetValue();

		/**
		 * The meta object literal for the '<em><b>Model Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBINDING__MODEL_VALUE = eINSTANCE.getYBinding_ModelValue();

	}

} //BindingPackage
