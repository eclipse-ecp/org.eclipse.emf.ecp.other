/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.ecview.common.model.binding.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BindingFactoryImpl extends EFactoryImpl implements BindingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BindingFactory init() {
		try {
			BindingFactory theBindingFactory = (BindingFactory)EPackage.Registry.INSTANCE.getEFactory(BindingPackage.eNS_URI);
			if (theBindingFactory != null) {
				return theBindingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BindingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BindingPackage.YBINDING_SET: return (EObject)createYBindingSet();
			case BindingPackage.YBEAN_BINDING_ENDPOINT: return (EObject)createYBeanBindingEndpoint();
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT: return (EObject)createYDetailValueBindingEndpoint();
			case BindingPackage.YVALUE_BINDING: return (EObject)createYValueBinding();
			case BindingPackage.YLIST_BINDING: return (EObject)createYListBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingSet createYBindingSet() {
		YBindingSetImpl yBindingSet = new YBindingSetImpl();
		return yBindingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YValueBinding createYValueBinding() {
		YValueBindingImpl yValueBinding = new YValueBindingImpl();
		return yValueBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YListBinding createYListBinding() {
		YListBindingImpl yListBinding = new YListBindingImpl();
		return yListBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBeanBindingEndpoint createYBeanBindingEndpoint() {
		YBeanBindingEndpointImpl yBeanBindingEndpoint = new YBeanBindingEndpointImpl();
		return yBeanBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YDetailValueBindingEndpoint createYDetailValueBindingEndpoint() {
		YDetailValueBindingEndpointImpl yDetailValueBindingEndpoint = new YDetailValueBindingEndpointImpl();
		return yDetailValueBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingPackage getBindingPackage() {
		return (BindingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BindingPackage getPackage() {
		return BindingPackage.eINSTANCE;
	}

} //BindingFactoryImpl
