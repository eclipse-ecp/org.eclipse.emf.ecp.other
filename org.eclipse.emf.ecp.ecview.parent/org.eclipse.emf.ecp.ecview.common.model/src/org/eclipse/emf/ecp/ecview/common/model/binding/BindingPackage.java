/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindableValue <em>YBindable Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindableValue
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindableValue()
	 * @generated
	 */
	int YBINDABLE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDABLE_VALUE__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The number of structural features of the '<em>YBindable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBINDABLE_VALUE_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YContextBindableValueImpl <em>YContext Bindable Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YContextBindableValueImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYContextBindableValue()
	 * @generated
	 */
	int YCONTEXT_BINDABLE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_BINDABLE_VALUE__ID = YBINDABLE_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Url String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_BINDABLE_VALUE__URL_STRING = YBINDABLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YContext Bindable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCONTEXT_BINDABLE_VALUE_FEATURE_COUNT = YBINDABLE_VALUE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YEmbeddableBindableValueImpl <em>YEmbeddable Bindable Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YEmbeddableBindableValueImpl
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYEmbeddableBindableValue()
	 * @generated
	 */
	int YEMBEDDABLE_BINDABLE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_BINDABLE_VALUE__ID = YBINDABLE_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_BINDABLE_VALUE__ELEMENT = YBINDABLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YEmbeddable Bindable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEMBEDDABLE_BINDABLE_VALUE_FEATURE_COUNT = YBINDABLE_VALUE_FEATURE_COUNT + 1;


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
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindableValue <em>YBindable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBindable Value</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindableValue
	 * @generated
	 */
	EClass getYBindableValue();

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
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YContextBindableValue <em>YContext Bindable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YContext Bindable Value</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YContextBindableValue
	 * @generated
	 */
	EClass getYContextBindableValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YContextBindableValue#getUrlString <em>Url String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url String</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YContextBindableValue#getUrlString()
	 * @see #getYContextBindableValue()
	 * @generated
	 */
	EAttribute getYContextBindableValue_UrlString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YEmbeddableBindableValue <em>YEmbeddable Bindable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YEmbeddable Bindable Value</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YEmbeddableBindableValue
	 * @generated
	 */
	EClass getYEmbeddableBindableValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YEmbeddableBindableValue#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YEmbeddableBindableValue#getElement()
	 * @see #getYEmbeddableBindableValue()
	 * @generated
	 */
	EReference getYEmbeddableBindableValue_Element();

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
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.YBindableValue <em>YBindable Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.YBindableValue
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYBindableValue()
		 * @generated
		 */
		EClass YBINDABLE_VALUE = eINSTANCE.getYBindableValue();

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

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YContextBindableValueImpl <em>YContext Bindable Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YContextBindableValueImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYContextBindableValue()
		 * @generated
		 */
		EClass YCONTEXT_BINDABLE_VALUE = eINSTANCE.getYContextBindableValue();

		/**
		 * The meta object literal for the '<em><b>Url String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCONTEXT_BINDABLE_VALUE__URL_STRING = eINSTANCE.getYContextBindableValue_UrlString();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecp.ecview.common.model.binding.impl.YEmbeddableBindableValueImpl <em>YEmbeddable Bindable Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.YEmbeddableBindableValueImpl
		 * @see org.eclipse.emf.ecp.ecview.common.model.binding.impl.BindingPackageImpl#getYEmbeddableBindableValue()
		 * @generated
		 */
		EClass YEMBEDDABLE_BINDABLE_VALUE = eINSTANCE.getYEmbeddableBindableValue();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEMBEDDABLE_BINDABLE_VALUE__ELEMENT = eINSTANCE.getYEmbeddableBindableValue_Element();

	}

} //BindingPackage
