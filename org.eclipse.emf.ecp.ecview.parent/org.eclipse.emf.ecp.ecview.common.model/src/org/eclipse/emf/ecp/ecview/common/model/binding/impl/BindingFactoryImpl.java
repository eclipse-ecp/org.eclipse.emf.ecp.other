/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YContextBindableValue;
import org.eclipse.emf.ecp.ecview.common.model.binding.YEmbeddableBindableValue;

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
			case BindingPackage.YBINDING: return (EObject)createYBinding();
			case BindingPackage.YCONTEXT_BINDABLE_VALUE: return (EObject)createYContextBindableValue();
			case BindingPackage.YEMBEDDABLE_BINDABLE_VALUE: return (EObject)createYEmbeddableBindableValue();
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
	public YBinding createYBinding() {
		YBindingImpl yBinding = new YBindingImpl();
		return yBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YContextBindableValue createYContextBindableValue() {
		YContextBindableValueImpl yContextBindableValue = new YContextBindableValueImpl();
		return yContextBindableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YEmbeddableBindableValue createYEmbeddableBindableValue() {
		YEmbeddableBindableValueImpl yEmbeddableBindableValue = new YEmbeddableBindableValueImpl();
		return yEmbeddableBindableValue;
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
