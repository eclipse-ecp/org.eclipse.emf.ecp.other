/**
 */
package validation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import validation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see validation.ValidationPackage
 * @generated
 */
public class ValidationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValidationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ValidationPackage.eINSTANCE;
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
	protected ValidationSwitch<Adapter> modelSwitch =
		new ValidationSwitch<Adapter>() {
			@Override
			public Adapter caseYValidator(YValidator object) {
				return createYValidatorAdapter();
			}
			@Override
			public Adapter caseYMinLengthValidator(YMinLengthValidator object) {
				return createYMinLengthValidatorAdapter();
			}
			@Override
			public Adapter caseYMaxLengthValidator(YMaxLengthValidator object) {
				return createYMaxLengthValidatorAdapter();
			}
			@Override
			public Adapter caseYRegexpValidator(YRegexpValidator object) {
				return createYRegexpValidatorAdapter();
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
	 * Creates a new adapter for an object of class '{@link validation.YValidator <em>YValidator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see validation.YValidator
	 * @generated
	 */
	public Adapter createYValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link validation.YMinLengthValidator <em>YMin Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see validation.YMinLengthValidator
	 * @generated
	 */
	public Adapter createYMinLengthValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link validation.YMaxLengthValidator <em>YMax Length Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see validation.YMaxLengthValidator
	 * @generated
	 */
	public Adapter createYMaxLengthValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link validation.YRegexpValidator <em>YRegexp Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see validation.YRegexpValidator
	 * @generated
	 */
	public Adapter createYRegexpValidatorAdapter() {
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

} //ValidationAdapterFactory
