/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingEndpointImpl <em>YValue Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYValueBindingEndpoint()
	 * @generated
	 */
	int YVALUE_BINDING_ENDPOINT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING_ENDPOINT__ID = YBINDING_ENDPOINT__ID;

	/**
	 * The number of structural features of the '<em>YValue Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING_ENDPOINT_FEATURE_COUNT = YBINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBeanValueBindingEndpointImpl <em>YBean Value Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBeanValueBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBeanValueBindingEndpoint()
	 * @generated
	 */
	int YBEAN_VALUE_BINDING_ENDPOINT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_VALUE_BINDING_ENDPOINT__ID = YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_VALUE_BINDING_ENDPOINT__BEAN = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_VALUE_BINDING_ENDPOINT__PROPERTY_PATH = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YBean Value Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBEAN_VALUE_BINDING_ENDPOINT_FEATURE_COUNT = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingEndpointImpl <em>YList Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYListBindingEndpoint()
	 * @generated
	 */
	int YLIST_BINDING_ENDPOINT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl <em>YBinding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBindingImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBinding()
	 * @generated
	 */
	int YBINDING = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingImpl <em>YValue Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYValueBinding()
	 * @generated
	 */
	int YVALUE_BINDING = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingImpl <em>YList Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYListBinding()
	 * @generated
	 */
	int YLIST_BINDING = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YDetailValueBindingEndpointImpl <em>YDetail Value Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YDetailValueBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYDetailValueBindingEndpoint()
	 * @generated
	 */
	int YDETAIL_VALUE_BINDING_ENDPOINT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDETAIL_VALUE_BINDING_ENDPOINT__ID = YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Master Observable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDETAIL_VALUE_BINDING_ENDPOINT__FEATURES = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDETAIL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDETAIL_VALUE_BINDING_ENDPOINT__TYPE = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YDetail Value Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDETAIL_VALUE_BINDING_ENDPOINT_FEATURE_COUNT = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING_ENDPOINT__ID = YBINDING_ENDPOINT__ID;

	/**
	 * The number of structural features of the '<em>YList Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING_ENDPOINT_FEATURE_COUNT = YBINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Model To Target Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING__MODEL_TO_TARGET_STRATEGY = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target To Model Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING__TARGET_TO_MODEL_STRATEGY = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YBinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDING_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING__ID = YBINDING__ID;

	/**
	 * The feature id for the '<em><b>Model To Target Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING__MODEL_TO_TARGET_STRATEGY = YBINDING__MODEL_TO_TARGET_STRATEGY;

	/**
	 * The feature id for the '<em><b>Target To Model Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING__TARGET_TO_MODEL_STRATEGY = YBINDING__TARGET_TO_MODEL_STRATEGY;

	/**
	 * The feature id for the '<em><b>Target Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING__TARGET_ENDPOINT = YBINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING__MODEL_ENDPOINT = YBINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YValue Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVALUE_BINDING_FEATURE_COUNT = YBINDING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING__ID = YBINDING__ID;

	/**
	 * The feature id for the '<em><b>Model To Target Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING__MODEL_TO_TARGET_STRATEGY = YBINDING__MODEL_TO_TARGET_STRATEGY;

	/**
	 * The feature id for the '<em><b>Target To Model Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING__TARGET_TO_MODEL_STRATEGY = YBINDING__TARGET_TO_MODEL_STRATEGY;

	/**
	 * The feature id for the '<em><b>Target Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING__TARGET_ENDPOINT = YBINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING__MODEL_ENDPOINT = YBINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>YList Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_BINDING_FEATURE_COUNT = YBINDING_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YEnumListBindingEndpointImpl <em>YEnum List Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YEnumListBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYEnumListBindingEndpoint()
	 * @generated
	 */
	int YENUM_LIST_BINDING_ENDPOINT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUM_LIST_BINDING_ENDPOINT__ID = YLIST_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUM_LIST_BINDING_ENDPOINT__ENUM = YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YEnum List Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YENUM_LIST_BINDING_ENDPOINT_FEATURE_COUNT = YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YECViewModelValueBindingEndpointImpl <em>YEC View Model Value Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YECViewModelValueBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYECViewModelValueBindingEndpoint()
	 * @generated
	 */
	int YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__ID = YVALUE_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__ELEMENT = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__FEATURES = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__TYPE = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YEC View Model Value Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT_FEATURE_COUNT = YVALUE_BINDING_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YECViewModelListBindingEndpointImpl <em>YEC View Model List Binding Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YECViewModelListBindingEndpointImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYECViewModelListBindingEndpoint()
	 * @generated
	 */
	int YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__ID = YLIST_BINDING_ENDPOINT__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__ELEMENT = YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__FEATURES = YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__PROPERTY_PATH = YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE = YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YEC View Model List Binding Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT_FEATURE_COUNT = YLIST_BINDING_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy <em>YBinding Update Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindingUpdateStrategy()
	 * @generated
	 */
	int YBINDING_UPDATE_STRATEGY = 12;


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
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint <em>YValue Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YValue Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint
	 * @generated
	 */
	EClass getYValueBindingEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBeanValueBindingEndpoint <em>YBean Value Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBean Value Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBeanValueBindingEndpoint
	 * @generated
	 */
	EClass getYBeanValueBindingEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBeanValueBindingEndpoint#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBeanValueBindingEndpoint#getBean()
	 * @see #getYBeanValueBindingEndpoint()
	 * @generated
	 */
	EAttribute getYBeanValueBindingEndpoint_Bean();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBeanValueBindingEndpoint#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBeanValueBindingEndpoint#getPropertyPath()
	 * @see #getYBeanValueBindingEndpoint()
	 * @generated
	 */
	EAttribute getYBeanValueBindingEndpoint_PropertyPath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint <em>YList Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YList Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YListBindingEndpoint
	 * @generated
	 */
	EClass getYListBindingEndpoint();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getModelToTargetStrategy <em>Model To Target Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model To Target Strategy</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getModelToTargetStrategy()
	 * @see #getYBinding()
	 * @generated
	 */
	EAttribute getYBinding_ModelToTargetStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getTargetToModelStrategy <em>Target To Model Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target To Model Strategy</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBinding#getTargetToModelStrategy()
	 * @see #getYBinding()
	 * @generated
	 */
	EAttribute getYBinding_TargetToModelStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding <em>YValue Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YValue Binding</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding
	 * @generated
	 */
	EClass getYValueBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getTargetEndpoint <em>Target Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getTargetEndpoint()
	 * @see #getYValueBinding()
	 * @generated
	 */
	EReference getYValueBinding_TargetEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getModelEndpoint <em>Model Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding#getModelEndpoint()
	 * @see #getYValueBinding()
	 * @generated
	 */
	EReference getYValueBinding_ModelEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding <em>YList Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YList Binding</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding
	 * @generated
	 */
	EClass getYListBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding#getTargetEndpoint <em>Target Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding#getTargetEndpoint()
	 * @see #getYListBinding()
	 * @generated
	 */
	EReference getYListBinding_TargetEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding#getModelEndpoint <em>Model Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding#getModelEndpoint()
	 * @see #getYListBinding()
	 * @generated
	 */
	EReference getYListBinding_ModelEndpoint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YEnumListBindingEndpoint <em>YEnum List Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEnum List Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YEnumListBindingEndpoint
	 * @generated
	 */
	EClass getYEnumListBindingEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YEnumListBindingEndpoint#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YEnumListBindingEndpoint#getEnum()
	 * @see #getYEnumListBindingEndpoint()
	 * @generated
	 */
	EAttribute getYEnumListBindingEndpoint_Enum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint <em>YEC View Model Value Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEC View Model Value Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint
	 * @generated
	 */
	EClass getYECViewModelValueBindingEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getElement()
	 * @see #getYECViewModelValueBindingEndpoint()
	 * @generated
	 */
	EReference getYECViewModelValueBindingEndpoint_Element();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getFeatures()
	 * @see #getYECViewModelValueBindingEndpoint()
	 * @generated
	 */
	EReference getYECViewModelValueBindingEndpoint_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getPropertyPath()
	 * @see #getYECViewModelValueBindingEndpoint()
	 * @generated
	 */
	EAttribute getYECViewModelValueBindingEndpoint_PropertyPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelValueBindingEndpoint#getType()
	 * @see #getYECViewModelValueBindingEndpoint()
	 * @generated
	 */
	EAttribute getYECViewModelValueBindingEndpoint_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint <em>YEC View Model List Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEC View Model List Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint
	 * @generated
	 */
	EClass getYECViewModelListBindingEndpoint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint#getElement()
	 * @see #getYECViewModelListBindingEndpoint()
	 * @generated
	 */
	EReference getYECViewModelListBindingEndpoint_Element();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint#getFeatures()
	 * @see #getYECViewModelListBindingEndpoint()
	 * @generated
	 */
	EReference getYECViewModelListBindingEndpoint_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint#getPropertyPath()
	 * @see #getYECViewModelListBindingEndpoint()
	 * @generated
	 */
	EAttribute getYECViewModelListBindingEndpoint_PropertyPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YECViewModelListBindingEndpoint#getType()
	 * @see #getYECViewModelListBindingEndpoint()
	 * @generated
	 */
	EAttribute getYECViewModelListBindingEndpoint_Type();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy <em>YBinding Update Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YBinding Update Strategy</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy
	 * @generated
	 */
	EEnum getYBindingUpdateStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint <em>YDetail Value Binding Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDetail Value Binding Endpoint</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint
	 * @generated
	 */
	EClass getYDetailValueBindingEndpoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getMasterObservable <em>Master Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Observable</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getMasterObservable()
	 * @see #getYDetailValueBindingEndpoint()
	 * @generated
	 */
	EReference getYDetailValueBindingEndpoint_MasterObservable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getFeatures()
	 * @see #getYDetailValueBindingEndpoint()
	 * @generated
	 */
	EReference getYDetailValueBindingEndpoint_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getPropertyPath()
	 * @see #getYDetailValueBindingEndpoint()
	 * @generated
	 */
	EAttribute getYDetailValueBindingEndpoint_PropertyPath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint#getType()
	 * @see #getYDetailValueBindingEndpoint()
	 * @generated
	 */
	EAttribute getYDetailValueBindingEndpoint_Type();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingEndpointImpl <em>YValue Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYValueBindingEndpoint()
		 * @generated
		 */
		EClass YVALUE_BINDING_ENDPOINT = eINSTANCE.getYValueBindingEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBeanValueBindingEndpointImpl <em>YBean Value Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YBeanValueBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBeanValueBindingEndpoint()
		 * @generated
		 */
		EClass YBEAN_VALUE_BINDING_ENDPOINT = eINSTANCE.getYBeanValueBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_VALUE_BINDING_ENDPOINT__BEAN = eINSTANCE.getYBeanValueBindingEndpoint_Bean();

		/**
		 * The meta object literal for the '<em><b>Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBEAN_VALUE_BINDING_ENDPOINT__PROPERTY_PATH = eINSTANCE.getYBeanValueBindingEndpoint_PropertyPath();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingEndpointImpl <em>YList Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYListBindingEndpoint()
		 * @generated
		 */
		EClass YLIST_BINDING_ENDPOINT = eINSTANCE.getYListBindingEndpoint();

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
		 * The meta object literal for the '<em><b>Model To Target Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBINDING__MODEL_TO_TARGET_STRATEGY = eINSTANCE.getYBinding_ModelToTargetStrategy();

		/**
		 * The meta object literal for the '<em><b>Target To Model Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBINDING__TARGET_TO_MODEL_STRATEGY = eINSTANCE.getYBinding_TargetToModelStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingImpl <em>YValue Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YValueBindingImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYValueBinding()
		 * @generated
		 */
		EClass YVALUE_BINDING = eINSTANCE.getYValueBinding();

		/**
		 * The meta object literal for the '<em><b>Target Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVALUE_BINDING__TARGET_ENDPOINT = eINSTANCE.getYValueBinding_TargetEndpoint();

		/**
		 * The meta object literal for the '<em><b>Model Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVALUE_BINDING__MODEL_ENDPOINT = eINSTANCE.getYValueBinding_ModelEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingImpl <em>YList Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YListBindingImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYListBinding()
		 * @generated
		 */
		EClass YLIST_BINDING = eINSTANCE.getYListBinding();

		/**
		 * The meta object literal for the '<em><b>Target Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLIST_BINDING__TARGET_ENDPOINT = eINSTANCE.getYListBinding_TargetEndpoint();

		/**
		 * The meta object literal for the '<em><b>Model Endpoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLIST_BINDING__MODEL_ENDPOINT = eINSTANCE.getYListBinding_ModelEndpoint();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YEnumListBindingEndpointImpl <em>YEnum List Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YEnumListBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYEnumListBindingEndpoint()
		 * @generated
		 */
		EClass YENUM_LIST_BINDING_ENDPOINT = eINSTANCE.getYEnumListBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YENUM_LIST_BINDING_ENDPOINT__ENUM = eINSTANCE.getYEnumListBindingEndpoint_Enum();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YECViewModelValueBindingEndpointImpl <em>YEC View Model Value Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YECViewModelValueBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYECViewModelValueBindingEndpoint()
		 * @generated
		 */
		EClass YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT = eINSTANCE.getYECViewModelValueBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__ELEMENT = eINSTANCE.getYECViewModelValueBindingEndpoint_Element();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__FEATURES = eINSTANCE.getYECViewModelValueBindingEndpoint_Features();

		/**
		 * The meta object literal for the '<em><b>Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH = eINSTANCE.getYECViewModelValueBindingEndpoint_PropertyPath();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEC_VIEW_MODEL_VALUE_BINDING_ENDPOINT__TYPE = eINSTANCE.getYECViewModelValueBindingEndpoint_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YECViewModelListBindingEndpointImpl <em>YEC View Model List Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YECViewModelListBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYECViewModelListBindingEndpoint()
		 * @generated
		 */
		EClass YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT = eINSTANCE.getYECViewModelListBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__ELEMENT = eINSTANCE.getYECViewModelListBindingEndpoint_Element();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__FEATURES = eINSTANCE.getYECViewModelListBindingEndpoint_Features();

		/**
		 * The meta object literal for the '<em><b>Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__PROPERTY_PATH = eINSTANCE.getYECViewModelListBindingEndpoint_PropertyPath();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEC_VIEW_MODEL_LIST_BINDING_ENDPOINT__TYPE = eINSTANCE.getYECViewModelListBindingEndpoint_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy <em>YBinding Update Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindingUpdateStrategy()
		 * @generated
		 */
		EEnum YBINDING_UPDATE_STRATEGY = eINSTANCE.getYBindingUpdateStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YDetailValueBindingEndpointImpl <em>YDetail Value Binding Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YDetailValueBindingEndpointImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYDetailValueBindingEndpoint()
		 * @generated
		 */
		EClass YDETAIL_VALUE_BINDING_ENDPOINT = eINSTANCE.getYDetailValueBindingEndpoint();

		/**
		 * The meta object literal for the '<em><b>Master Observable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YDETAIL_VALUE_BINDING_ENDPOINT__MASTER_OBSERVABLE = eINSTANCE.getYDetailValueBindingEndpoint_MasterObservable();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YDETAIL_VALUE_BINDING_ENDPOINT__FEATURES = eINSTANCE.getYDetailValueBindingEndpoint_Features();

		/**
		 * The meta object literal for the '<em><b>Property Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDETAIL_VALUE_BINDING_ENDPOINT__PROPERTY_PATH = eINSTANCE.getYDetailValueBindingEndpoint_PropertyPath();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDETAIL_VALUE_BINDING_ENDPOINT__TYPE = eINSTANCE.getYDetailValueBindingEndpoint_Type();

	}

} //BindingPackage
