/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecp.ecview.common.model.binding.*;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YListBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding;

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
			case BindingPackage.YBINDING_SET: return createYBindingSet();
			case BindingPackage.YBEAN_BINDING_ENDPOINT: return createYBeanBindingEndpoint();
			case BindingPackage.YDETAIL_VALUE_BINDING_ENDPOINT: return createYDetailValueBindingEndpoint();
			case BindingPackage.YVALUE_BINDING: return createYValueBinding();
			case BindingPackage.YLIST_BINDING: return createYListBinding();
			case BindingPackage.YENUM_LIST_BINDING_ENDPOINT: return createYEnumListBindingEndpoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BindingPackage.YBINDING_UPDATE_STRATEGY:
				return createYBindingUpdateStrategyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BindingPackage.YBINDING_UPDATE_STRATEGY:
				return convertYBindingUpdateStrategyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public YEnumListBindingEndpoint createYEnumListBindingEndpoint() {
		YEnumListBindingEndpointImpl yEnumListBindingEndpoint = new YEnumListBindingEndpointImpl();
		return yEnumListBindingEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YBindingUpdateStrategy createYBindingUpdateStrategyFromString(EDataType eDataType, String initialValue) {
		YBindingUpdateStrategy result = YBindingUpdateStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYBindingUpdateStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
