/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YDetailValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YValue Binding Endpoint</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class YValueBindingEndpointImpl extends YBindingEndpointImpl
		implements YValueBindingEndpoint {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YValueBindingEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BindingPackage.Literals.YVALUE_BINDING_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public YDetailValueBindingEndpoint createDetailValueEndpointGen() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> Creates a detail value endpoint. It may be used
	 * to observe detail values of this value endpoint.<!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public YDetailValueBindingEndpoint createDetailValueEndpoint() {
		YDetailValueBindingEndpoint result = BindingFactory.eINSTANCE
				.createYDetailValueBindingEndpoint();
		result.setMasterObservable(this);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BindingPackage.YVALUE_BINDING_ENDPOINT___CREATE_DETAIL_VALUE_ENDPOINT:
				return createDetailValueEndpoint();
		}
		return super.eInvoke(operationID, arguments);
	}

} // YValueBindingEndpointImpl
