/**
 */
package org.eclipse.emf.ecp.ui.model.core.datatypes.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.model.core.datatypes.*;
import org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YCheckBoxDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDecimalDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YDtBase;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTableDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDatatype;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDatatype;

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
			public Adapter caseYTextDatatype(YTextDatatype object) {
				return createYTextDatatypeAdapter();
			}
			@Override
			public Adapter caseYDatatype(YDatatype object) {
				return createYDatatypeAdapter();
			}
			@Override
			public Adapter caseYDatadescription(YDatadescription object) {
				return createYDatadescriptionAdapter();
			}
			@Override
			public Adapter caseYTextAreaDatatype(YTextAreaDatatype object) {
				return createYTextAreaDatatypeAdapter();
			}
			@Override
			public Adapter caseYNumericDatatype(YNumericDatatype object) {
				return createYNumericDatatypeAdapter();
			}
			@Override
			public Adapter caseYDecimalDatatype(YDecimalDatatype object) {
				return createYDecimalDatatypeAdapter();
			}
			@Override
			public Adapter caseYTableDatatype(YTableDatatype object) {
				return createYTableDatatypeAdapter();
			}
			@Override
			public Adapter caseYCheckBoxDatatype(YCheckBoxDatatype object) {
				return createYCheckBoxDatatypeAdapter();
			}
			@Override
			public Adapter caseYComboBoxDatatype(YComboBoxDatatype object) {
				return createYComboBoxDatatypeAdapter();
			}
			@Override
			public Adapter caseYListDataType(YListDataType object) {
				return createYListDataTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDatatype <em>YText Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDatatype
	 * @generated
	 */
	public Adapter createYTextDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDatatype <em>YDatatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDatatype
	 * @generated
	 */
	public Adapter createYDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDatadescription <em>YDatadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDatadescription
	 * @generated
	 */
	public Adapter createYDatadescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDatatype <em>YText Area Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTextAreaDatatype
	 * @generated
	 */
	public Adapter createYTextAreaDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YNumericDatatype <em>YNumeric Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YNumericDatatype
	 * @generated
	 */
	public Adapter createYNumericDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YDecimalDatatype <em>YDecimal Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YDecimalDatatype
	 * @generated
	 */
	public Adapter createYDecimalDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YTableDatatype <em>YTable Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YTableDatatype
	 * @generated
	 */
	public Adapter createYTableDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YCheckBoxDatatype <em>YCheck Box Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YCheckBoxDatatype
	 * @generated
	 */
	public Adapter createYCheckBoxDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YComboBoxDatatype <em>YCombo Box Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YComboBoxDatatype
	 * @generated
	 */
	public Adapter createYComboBoxDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.datatypes.YListDataType <em>YList Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.datatypes.YListDataType
	 * @generated
	 */
	public Adapter createYListDataTypeAdapter() {
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
