/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.conversion.StringToNumberConverter;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.ecview.common.binding.IECViewBindingManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IDecimalFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ISWTBindingManager;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.binding.EMFNullToBoolConverter;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.binding.EMFNullToIntConverter;
import org.eclipse.riena.ui.ridgets.IDecimalTextRidget;
import org.eclipse.riena.ui.ridgets.swt.SwtRidgetFactory;
import org.eclipse.riena.ui.swt.utils.UIControlsFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ibm.icu.text.NumberFormat;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class DecimalFieldPresentation extends FieldPresentation {

	private static final Logger logger = LoggerFactory
			.getLogger(DecimalFieldPresentation.class);

	private final YDecimalField yDecimalTextField;
	private Composite controlBase;
	private Text decimalText;
	private Label label;
	private IDecimalTextRidget ridget;
	private RidgetController ridgetController;

	private IObservableValue emfModelObservable;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public DecimalFieldPresentation(IElementEditpart editpart) {
		super((IDecimalFieldEditpart) editpart);
		this.yDecimalTextField = (YDecimalField) editpart.getModel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Control createWidget(Object parent) {
		if (controlBase == null) {
			controlBase = new Composite((Composite) parent, SWT.NONE);
			controlBase.setLayout(new GridLayout(2, false));
			setCSSClass(controlBase, CSS_CLASS__CONTROL_BASE);
			if (Util.isCssIdValid(yDecimalTextField)) {
				setCSSId(controlBase, Util.getCssID(yDecimalTextField));
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			label = new Label(controlBase, SWT.NONE);
			GridData labelGd = new GridData(SWT.BEGINNING, SWT.TOP, false, true);
			label.setLayoutData(labelGd);
			setCSSClass(label, CSS_CLASS__LABEL);

			decimalText = new Text(controlBase, SWT.BORDER);
			decimalText.setData(UIControlsFactory.KEY_TYPE,
					UIControlsFactory.TYPE_DECIMAL);
			ridget = (IDecimalTextRidget) SwtRidgetFactory
					.createRidget(decimalText);
			decimalText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true));

			// updates the style
			updateStyle();

			// creates the binding for the field
			createBindings(yDecimalTextField, ridget);
		}
		return controlBase;
	}

	/**
	 * Updates the control style attributes.
	 */
	private void updateStyle() {
		if (isLabelValid()) {
			label.setText(getLabel());
		}

		if (Util.isCssClassValid(yDecimalTextField)) {
			setCSSClass(decimalText, Util.getCssClass(yDecimalTextField));
		} else {
			setCSSClass(decimalText, CSS_CLASS__CONTROL);
		}
	}

	/**
	 * Creates the bindings for the given elements.
	 * 
	 * @param yField
	 * @param ridget
	 */
	protected void createBindings(YDecimalField yField,
			IDecimalTextRidget ridget) {

		super.createBindings((YField) yField, ridget);

		ISWTBindingManager bindingManager = getBindingManager();
		bindingManager.bindGrouping(yField, ridget);
		bindingManager.bindMarkNegative(yField, ridget);

		// bind the model and ridget to the controller
		//
		ridgetController = new RidgetController();

		// bind the ridget to the bridge
		ridget.bindToModel(ridgetController, "value");
		ridget.setConvertEmptyToZero(true);

		// bind ECView model to bridge
		emfModelObservable = EMFObservables.observeValue(
				castEObject(getModel()),
				ExtensionModelPackage.Literals.YDECIMAL_FIELD__VALUE);
		IObservableValue bridgeObservable_model = BeansObservables
				.observeValue(ridgetController, "value");
		bindingManager.bindValue(bridgeObservable_model, emfModelObservable);

		// bind others
		//
		bindGrouping(bindingManager, yDecimalTextField, ridgetController);
		bindMarkNegative(bindingManager, yDecimalTextField, ridgetController);
		bindPrecision(bindingManager, yDecimalTextField, ridgetController);
	}

	/**
	 * Binds the grouping from the emf model to the ridget controller.
	 * 
	 * @param bindingManager
	 * @param yField
	 * @param controller
	 */
	public void bindGrouping(ISWTBindingManager bindingManager,
			YDecimalField yField, RidgetController controller) {
		IObservableValue masterObservable = new WritableValue();
		masterObservable.setValue(yField);
		IObservableValue modelObservable = EMFProperties.value(
				FeaturePath.fromList(new EStructuralFeature[] {
						ExtensionModelPackage.eINSTANCE
								.getYDecimalField_Datatype(),
						ExtDatatypesPackage.eINSTANCE
								.getYNumericDatatype_Grouping() }))
				.observeDetail(masterObservable);
		IObservableValue uiObservable = BeansObservables.observeValue(
				controller, "grouping");
		bindingManager
				.bindValue(
						uiObservable,
						modelObservable,
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE),
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE)
								.setConverter(new EMFNullToBoolConverter(
										ExtDatatypesPackage.Literals.YNUMERIC_DATATYPE__GROUPING,
										IECViewBindingManager.DEFAULT_GROUPING)));
	}

	/**
	 * Binds the markNegative from the emf model to the ridget controller.
	 * 
	 * @param bindingManager
	 * @param yField
	 * @param controller
	 */
	public void bindMarkNegative(ISWTBindingManager bindingManager,
			YDecimalField yField, RidgetController controller) {
		IObservableValue masterObservable = new WritableValue();
		masterObservable.setValue(yField);
		IObservableValue modelObservable = EMFProperties.value(
				FeaturePath.fromList(new EStructuralFeature[] {
						ExtensionModelPackage.eINSTANCE
								.getYDecimalField_Datatype(),
						ExtDatatypesPackage.eINSTANCE
								.getYNumericDatatype_MarkNegative() }))
				.observeDetail(masterObservable);
		IObservableValue uiObservable = BeansObservables.observeValue(
				controller, "markNegative");
		bindingManager
				.bindValue(
						uiObservable,
						modelObservable,
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE),
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE)
								.setConverter(new EMFNullToBoolConverter(
										ExtDatatypesPackage.Literals.YNUMERIC_DATATYPE__MARK_NEGATIVE,
										IECViewBindingManager.DEFAULT_MARK_NEGATIVE)));
	}

	/**
	 * Binds the precision from the emf model to the ridget controller.
	 * 
	 * @param bindingManager
	 * @param yField
	 * @param controller
	 */
	protected void bindPrecision(ISWTBindingManager bindingManager,
			YDecimalField yField, RidgetController controller) {
		IObservableValue masterObservable = new WritableValue();
		masterObservable.setValue(yField);
		IObservableValue modelObservable = EMFProperties.value(
				FeaturePath.fromList(new EStructuralFeature[] {
						ExtensionModelPackage.eINSTANCE
								.getYDecimalField_Datatype(),
						ExtDatatypesPackage.eINSTANCE
								.getYDecimalDatatype_Precision() }))
				.observeDetail(masterObservable);
		IObservableValue uiObservable = PojoObservables.observeValue(
				controller, "precision");
		bindingManager
				.bindValue(
						uiObservable,
						modelObservable,
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE),
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_UPDATE)
								.setConverter(new EMFNullToIntConverter(
										ExtDatatypesPackage.Literals.YDECIMAL_DATATYPE__PRECISION,
										IECViewBindingManager.DEFAULT_PRECISION)));
	}

	@Override
	public Control getWidget() {
		return controlBase;
	}

	public IDecimalTextRidget getRidget() {
		return ridget;
	}

	@Override
	public boolean isRendered() {
		return controlBase != null;
	}

	/**
	 * Returns true, if the label is valid.
	 * 
	 * @return
	 */
	public boolean isLabelValid() {
		return yDecimalTextField.getDatadescription() != null
				&& yDecimalTextField.getDatadescription().getLabel() != null;
	}

	/**
	 * Returns the label.
	 * 
	 * @return
	 */
	public String getLabel() {
		return yDecimalTextField.getDatadescription().getLabel();
	}

	@Override
	protected IObservable internalGetObservableEndpoint(
			YEmbeddableBindingEndpoint bindableValue) {
		if (bindableValue == null) {
			throw new NullPointerException("BindableValue must not be null!");
		}

		if (bindableValue instanceof YEmbeddableValueEndpoint) {
			return internalGetValueEndpoint();
		}
		throw new IllegalArgumentException("Not a valid input: "
				+ bindableValue);
	}

	/**
	 * Returns the observable to observe value.
	 * 
	 * @return
	 */
	protected IObservableValue internalGetValueEndpoint() {
		return EMFObservables.observeValue(castEObject(getModel()),
				ExtensionModelPackage.Literals.YDECIMAL_FIELD__VALUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			decimalText = null;
			ridget = null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		super.internalDispose();

		// unrender the ui control
		unrender();
	}

	/**
	 * This class is used to bridge EMF and Riena. Riena does not deal with
	 * Objects as databinding types. And EMFObservables need to return an
	 * instance of EStructuralFeature as type. So this class enables a proper
	 * binding.
	 * <p>
	 * Two different bindings will be used on this bridge.<br>
	 * bridge <-> ridget by ridget.bindToValue()<br>
	 * ECViewModel <-> bridge by bindingmanager.bindValue()
	 * 
	 */
	@SuppressWarnings("unused")
	private class RidgetController extends AbstractBean {

		private double value;
		private int precision;
		private boolean grouping;
		private boolean markNegative;

		/**
		 * @return the value
		 */
		public Double getValue() {
			return value;
		}

		/**
		 * Sets the value from the model.
		 * 
		 * @param value
		 *            the value to set
		 */
		public void setValue(Double value) {
			// double oldValue = this.value;
			firePropertyChanged("value", this.value, this.value = value);

			// if the text value was adjusted by the ridget, then write back the
			// value to the model
			// This can not be done automatically by databinding since
			// decimalRidget.setPrecision()
			// will invoke rebind. And rebind transfers model -> ridget and so
			// the
			// ridget is in updateMode what prohibits a value update in
			// databinding
			final NumberFormat nf = NumberFormat.getNumberInstance();
			nf.setMaximumFractionDigits(precision);

			Double result = (Double) StringToNumberConverter
					.toDouble(nf, false).convert(ridget.getText());
			if (!result.equals(this.value)) {
				this.value = result;
				yDecimalTextField.setValue(result);
			}
		}

		/**
		 * Is bound to EMFmodel and fetches changes to precision.
		 * 
		 * @param precision
		 */
		public void setPrecision(int precision) {
			this.precision = precision;

			String currentValue = ridget.getText();
			ridget.setPrecision(precision);

			// if the text value was adjusted by the ridget, then write back the
			// value to the model
			// This can not be done automatically by databinding since
			// decimalRidget.setPrecision()
			// will invoke rebind. And rebind transfers model -> ridget and so
			// the
			// ridget is in updateMode what prohibits a value update in
			// databinding
			if (!currentValue.equals(ridget.getText())) {
				final NumberFormat nf = NumberFormat.getNumberInstance();
				nf.setMaximumFractionDigits(precision);

				Double result = (Double) StringToNumberConverter.toDouble(nf,
						false).convert(ridget.getText());
				ridgetController.setValue(result);
			}
		}

		/**
		 * Is bound to EMFmodel and fetches changes to precision.
		 * 
		 * @return precision
		 */
		public int getPrecision() {
			return precision;
		}

		/**
		 * Is bound to EMFmodel and fetches changes to grouping.
		 * 
		 * @param precision
		 */
		public void setGrouping(boolean grouping) {
			this.grouping = grouping;

			ridget.setGrouping(grouping);
		}

		/**
		 * Is bound to EMFmodel and fetches changes to grouping.
		 * 
		 * @return precision
		 */
		public boolean isGrouping() {
			return grouping;
		}

		/**
		 * Is bound to EMFmodel and fetches changes to markNegative.
		 * 
		 * @param precision
		 */
		public void setMarkNegative(boolean markNegative) {
			this.markNegative = markNegative;

			ridget.setMarkNegative(markNegative);
		}

		/**
		 * Is bound to EMFmodel and fetches changes to markNegative.
		 * 
		 * @return precision
		 */
		public boolean isMarkNegative() {
			return markNegative;
		}

	}

	// /**
	// * Converts from model to ridget.
	// */
	// private static class ModelToRidgetConverter implements IConverter {
	//
	// private final NumberFormat format = new DecimalFormat();
	//
	// @Override
	// public Object getFromType() {
	// return Double.class;
	// }
	//
	// @Override
	// public Object getToType() {
	// return String.class;
	// }
	//
	// @Override
	// public Object convert(Object fromObject) {
	// return format.format((Double) fromObject);
	// }
	//
	// }
	//
	// /**
	// * Converts from ridget to model.
	// */
	// private static class RidgetToModelConverter implements IConverter {
	//
	// private final NumberFormat format = new DecimalFormat();
	//
	// @Override
	// public Object getFromType() {
	// return String.class;
	// }
	//
	// @Override
	// public Object getToType() {
	// return Double.class;
	// }
	//
	// @Override
	// public Object convert(Object fromObject) {
	// try {
	// return Double.valueOf(format.parse((String) fromObject)
	// .doubleValue());
	// } catch (ParseException e) {
	// logger.error("{}", e);
	// return new Long(0);
	// }
	// }
	//
	// }
}
