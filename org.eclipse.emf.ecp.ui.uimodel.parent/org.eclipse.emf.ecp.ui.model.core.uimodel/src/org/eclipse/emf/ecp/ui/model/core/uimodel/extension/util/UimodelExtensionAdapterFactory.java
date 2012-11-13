/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiMarginable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiSpacingable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.*;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage
 * @generated
 */
public class UimodelExtensionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UimodelExtensionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UimodelExtensionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UimodelExtensionPackage.eINSTANCE;
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
	protected UimodelExtensionSwitch<Adapter> modelSwitch =
		new UimodelExtensionSwitch<Adapter>() {
			@Override
			public Adapter caseYUiTextField(YUiTextField object) {
				return createYUiTextFieldAdapter();
			}
			@Override
			public Adapter caseYUiGridLayout(YUiGridLayout object) {
				return createYUiGridLayoutAdapter();
			}
			@Override
			public Adapter caseYUiGridLayoutCellStyle(YUiGridLayoutCellStyle object) {
				return createYUiGridLayoutCellStyleAdapter();
			}
			@Override
			public Adapter caseYUiSpanInfo(YUiSpanInfo object) {
				return createYUiSpanInfoAdapter();
			}
			@Override
			public Adapter caseYUiTable(YUiTable object) {
				return createYUiTableAdapter();
			}
			@Override
			public Adapter caseYUiLabel(YUiLabel object) {
				return createYUiLabelAdapter();
			}
			@Override
			public Adapter caseYUiElement(YUiElement object) {
				return createYUiElementAdapter();
			}
			@Override
			public Adapter caseYUiCssAble(YUiCssAble object) {
				return createYUiCssAbleAdapter();
			}
			@Override
			public Adapter caseYUiEmbeddable(YUiEmbeddable object) {
				return createYUiEmbeddableAdapter();
			}
			@Override
			public Adapter caseYUiField(YUiField object) {
				return createYUiFieldAdapter();
			}
			@Override
			public Adapter caseYUiLayout(YUiLayout object) {
				return createYUiLayoutAdapter();
			}
			@Override
			public Adapter caseYUiSpacingable(YUiSpacingable object) {
				return createYUiSpacingableAdapter();
			}
			@Override
			public Adapter caseYUiMarginable(YUiMarginable object) {
				return createYUiMarginableAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField <em>YUi Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField
	 * @generated
	 */
	public Adapter createYUiTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout <em>YUi Grid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout
	 * @generated
	 */
	public Adapter createYUiGridLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle <em>YUi Grid Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle
	 * @generated
	 */
	public Adapter createYUiGridLayoutCellStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo <em>YUi Span Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo
	 * @generated
	 */
	public Adapter createYUiSpanInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable <em>YUi Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable
	 * @generated
	 */
	public Adapter createYUiTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel <em>YUi Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel
	 * @generated
	 */
	public Adapter createYUiLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement <em>YUi Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement
	 * @generated
	 */
	public Adapter createYUiElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble <em>YUi Css Able</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble
	 * @generated
	 */
	public Adapter createYUiCssAbleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable <em>YUi Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable
	 * @generated
	 */
	public Adapter createYUiEmbeddableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField <em>YUi Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField
	 * @generated
	 */
	public Adapter createYUiFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout <em>YUi Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout
	 * @generated
	 */
	public Adapter createYUiLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiSpacingable <em>YUi Spacingable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiSpacingable
	 * @generated
	 */
	public Adapter createYUiSpacingableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiMarginable <em>YUi Marginable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiMarginable
	 * @generated
	 */
	public Adapter createYUiMarginableAdapter() {
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

} //UimodelExtensionAdapterFactory
