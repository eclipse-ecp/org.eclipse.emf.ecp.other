/**
 */
package org.eclipse.emf.ecp.ecview.ui.core.model.extension.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YBindable;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YCssAble;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YElement;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YField;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YMarginable;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YSpacingable;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.*;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YHorizontalLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YInput;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YList;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YSpanInfo;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YVerticalLayoutCellStyle;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.ExtensionModelPackage
 * @generated
 */
public class ExtensionModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExtensionModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExtensionModelPackage.eINSTANCE;
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
	protected ExtensionModelSwitch<Adapter> modelSwitch =
		new ExtensionModelSwitch<Adapter>() {
			@Override
			public Adapter caseYTextField(YTextField object) {
				return createYTextFieldAdapter();
			}
			@Override
			public Adapter caseYGridLayout(YGridLayout object) {
				return createYGridLayoutAdapter();
			}
			@Override
			public Adapter caseYGridLayoutCellStyle(YGridLayoutCellStyle object) {
				return createYGridLayoutCellStyleAdapter();
			}
			@Override
			public Adapter caseYHorizontalLayout(YHorizontalLayout object) {
				return createYHorizontalLayoutAdapter();
			}
			@Override
			public Adapter caseYHorizontalLayoutCellStyle(YHorizontalLayoutCellStyle object) {
				return createYHorizontalLayoutCellStyleAdapter();
			}
			@Override
			public Adapter caseYVerticalLayout(YVerticalLayout object) {
				return createYVerticalLayoutAdapter();
			}
			@Override
			public Adapter caseYVerticalLayoutCellStyle(YVerticalLayoutCellStyle object) {
				return createYVerticalLayoutCellStyleAdapter();
			}
			@Override
			public Adapter caseYSpanInfo(YSpanInfo object) {
				return createYSpanInfoAdapter();
			}
			@Override
			public Adapter caseYTable(YTable object) {
				return createYTableAdapter();
			}
			@Override
			public Adapter caseYLabel(YLabel object) {
				return createYLabelAdapter();
			}
			@Override
			public Adapter caseYTextArea(YTextArea object) {
				return createYTextAreaAdapter();
			}
			@Override
			public Adapter caseYCheckBox(YCheckBox object) {
				return createYCheckBoxAdapter();
			}
			@Override
			public Adapter caseYInput(YInput object) {
				return createYInputAdapter();
			}
			@Override
			public Adapter caseYDecimalField(YDecimalField object) {
				return createYDecimalFieldAdapter();
			}
			@Override
			public Adapter caseYNumericField(YNumericField object) {
				return createYNumericFieldAdapter();
			}
			@Override
			public Adapter caseYComboBox(YComboBox object) {
				return createYComboBoxAdapter();
			}
			@Override
			public Adapter caseYList(YList object) {
				return createYListAdapter();
			}
			@Override
			public Adapter caseYElement(YElement object) {
				return createYElementAdapter();
			}
			@Override
			public Adapter caseYCssAble(YCssAble object) {
				return createYCssAbleAdapter();
			}
			@Override
			public Adapter caseYEmbeddable(YEmbeddable object) {
				return createYEmbeddableAdapter();
			}
			@Override
			public Adapter caseYField(YField object) {
				return createYFieldAdapter();
			}
			@Override
			public Adapter caseYBindable(YBindable object) {
				return createYBindableAdapter();
			}
			@Override
			public Adapter caseYLayout(YLayout object) {
				return createYLayoutAdapter();
			}
			@Override
			public Adapter caseYSpacingable(YSpacingable object) {
				return createYSpacingableAdapter();
			}
			@Override
			public Adapter caseYMarginable(YMarginable object) {
				return createYMarginableAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTextField <em>YText Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTextField
	 * @generated
	 */
	public Adapter createYTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YGridLayout <em>YGrid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YGridLayout
	 * @generated
	 */
	public Adapter createYGridLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YGridLayoutCellStyle <em>YGrid Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YGridLayoutCellStyle
	 * @generated
	 */
	public Adapter createYGridLayoutCellStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YHorizontalLayout <em>YHorizontal Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YHorizontalLayout
	 * @generated
	 */
	public Adapter createYHorizontalLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YHorizontalLayoutCellStyle <em>YHorizontal Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YHorizontalLayoutCellStyle
	 * @generated
	 */
	public Adapter createYHorizontalLayoutCellStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YVerticalLayout <em>YVertical Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YVerticalLayout
	 * @generated
	 */
	public Adapter createYVerticalLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YVerticalLayoutCellStyle <em>YVertical Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YVerticalLayoutCellStyle
	 * @generated
	 */
	public Adapter createYVerticalLayoutCellStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YSpanInfo <em>YSpan Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YSpanInfo
	 * @generated
	 */
	public Adapter createYSpanInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTable <em>YTable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTable
	 * @generated
	 */
	public Adapter createYTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YLabel <em>YLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YLabel
	 * @generated
	 */
	public Adapter createYLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTextArea <em>YText Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YTextArea
	 * @generated
	 */
	public Adapter createYTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YCheckBox <em>YCheck Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YCheckBox
	 * @generated
	 */
	public Adapter createYCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YInput <em>YInput</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YInput
	 * @generated
	 */
	public Adapter createYInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YDecimalField <em>YDecimal Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YDecimalField
	 * @generated
	 */
	public Adapter createYDecimalFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YNumericField <em>YNumeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YNumericField
	 * @generated
	 */
	public Adapter createYNumericFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YComboBox <em>YCombo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YComboBox
	 * @generated
	 */
	public Adapter createYComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.extension.YList <em>YList</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.extension.YList
	 * @generated
	 */
	public Adapter createYListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.core.YElement <em>YElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.YElement
	 * @generated
	 */
	public Adapter createYElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.core.YCssAble <em>YCss Able</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.YCssAble
	 * @generated
	 */
	public Adapter createYCssAbleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.core.YEmbeddable <em>YEmbeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.YEmbeddable
	 * @generated
	 */
	public Adapter createYEmbeddableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.core.YField <em>YField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.YField
	 * @generated
	 */
	public Adapter createYFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.core.YBindable <em>YBindable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.YBindable
	 * @generated
	 */
	public Adapter createYBindableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.core.YLayout <em>YLayout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.YLayout
	 * @generated
	 */
	public Adapter createYLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.core.YSpacingable <em>YSpacingable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.YSpacingable
	 * @generated
	 */
	public Adapter createYSpacingableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecp.ecview.ui.core.model.core.YMarginable <em>YMarginable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecp.ecview.ui.core.model.core.YMarginable
	 * @generated
	 */
	public Adapter createYMarginableAdapter() {
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

} //ExtensionModelAdapterFactory
