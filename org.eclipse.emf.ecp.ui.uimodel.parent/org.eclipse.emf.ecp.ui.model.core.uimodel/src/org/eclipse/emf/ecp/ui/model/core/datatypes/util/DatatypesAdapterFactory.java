/**
 */
package org.eclipse.emf.ecp.ui.model.core.datatypes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.model.core.datatypes.*;
import org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatatypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatatypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypesSwitch<Adapter> modelSwitch =
		new DatatypesSwitch<Adapter>() {
			@Override
			public Adapter caseYDtBase(YDtBase object) {
				return createYDtBaseAdapter();
			}
			@Override
			public Adapter caseYTextDType(YTextDType object) {
				return createYTextDTypeAdapter();
			}
			@Override
			public Adapter caseYDtDatatype(YDtDatatype object) {
				return createYDtDatatypeAdapter();
			}
			@Override
			public Adapter caseYDtDatadescription(YDtDatadescription object) {
				return createYDtDatadescriptionAdapter();
			}
			@Override
			public Adapter caseYTextDDesc(YTextDDesc object) {
				return createYTextDDescAdapter();
			}
			@Override
			public Adapter caseYLabelDDesc(YLabelDDesc object) {
				return createYLabelDDescAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase <em>YDt Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase
	 * @generated
	 */
	public Adapter createYDtBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType <em>YText DType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDType
	 * @generated
	 */
	public Adapter createYTextDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatatype <em>YDt Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatatype
	 * @generated
	 */
	public Adapter createYDtDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription <em>YDt Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDtDatadescription
	 * @generated
	 */
	public Adapter createYDtDatadescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc <em>YText DDesc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc
	 * @generated
	 */
	public Adapter createYTextDDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YLabelDDesc <em>YLabel DDesc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YLabelDDesc
	 * @generated
	 */
	public Adapter createYLabelDDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DatatypesAdapterFactory
