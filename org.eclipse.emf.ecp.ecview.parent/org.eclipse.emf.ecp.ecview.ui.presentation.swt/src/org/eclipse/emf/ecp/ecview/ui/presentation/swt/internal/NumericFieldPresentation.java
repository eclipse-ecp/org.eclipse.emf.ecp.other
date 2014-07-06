/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.INumericFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ISWTBindingManager;
import org.eclipse.riena.ui.ridgets.INumericTextRidget;
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

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class NumericFieldPresentation extends FieldPresentation {

	private static final Logger logger = LoggerFactory
			.getLogger(NumericFieldPresentation.class);

	private final YNumericField yNumericTextField;
	private Composite controlBase;
	private Text numericText;
	private Label label;
	private INumericTextRidget numericRidget;
	private RienaEmfBridge bindingBridge;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public NumericFieldPresentation(IElementEditpart editpart) {
		super((INumericFieldEditpart) editpart);
		this.yNumericTextField = (YNumericField) editpart.getModel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Control createWidget(Object parent) {
		if (controlBase == null) {
			controlBase = new Composite((Composite) parent, SWT.NONE);
			controlBase.setLayout(new GridLayout(2, false));
			setCSSClass(controlBase, CSS_CLASS_CONTROL_BASE);
			if (Util.isCssIdValid(yNumericTextField)) {
				setCSSId(controlBase, Util.getCssID(yNumericTextField));
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			label = new Label(controlBase, SWT.NONE);
			GridData labelGd = new GridData(SWT.BEGINNING, SWT.TOP, false, true);
			label.setLayoutData(labelGd);
			setCSSClass(label, CSS_CLASS__LABEL);

			numericText = new Text(controlBase, SWT.BORDER);
			numericText.setData(UIControlsFactory.KEY_TYPE,
					UIControlsFactory.TYPE_NUMERIC);
			numericText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true));

			numericRidget = (INumericTextRidget) SwtRidgetFactory
					.createRidget(numericText);
			numericRidget.setConvertEmptyToZero(true);
			numericRidget
					.setModelToUIControlConverter(new ModelToRidgetConverter());
			numericRidget
					.setUIControlToModelConverter(new RidgetToModelConverter());

			// update style attributes
			//
			updateStyle();
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

		if (Util.isCssClassValid(yNumericTextField)) {
			setCSSClass(numericText, Util.getCssClass(yNumericTextField));
		} else {
			setCSSClass(numericText, CSS_CLASS_CONTROL);
		}

		// creates the binding for the field
		createBindings(yNumericTextField, numericRidget);

	}

	/**
	 * Creates the bindings for the given elements.
	 * 
	 * @param yField
	 * @param ridget
	 */
	protected void createBindings(YNumericField yField,
			INumericTextRidget ridget) {

		super.createBindings((YField) yField, ridget);

		ISWTBindingManager bindingManager = getBindingManager();
		bindingManager.bindGrouping(yField, ridget);
		bindingManager.bindMarkNegative(yField, ridget);

		bindingBridge = new RienaEmfBridge();

		// bind the ridget to the bridge
		ridget.bindToModel(bindingBridge, "value");

		// bind ECView model to bridge
		IObservableValue modelObservable = EMFObservables.observeValue(
				castEObject(getModel()),
				ExtensionModelPackage.Literals.YNUMERIC_FIELD__VALUE);
		IObservableValue bridgeObservable_model = BeansObservables
				.observeValue(bindingBridge, "value");
		bindingManager.bindValue(bridgeObservable_model, modelObservable);

		// // create the model binding from ridget to ECView-model
		// createModelBinding(castEObject(getModel()),
		// ExtensionModelPackage.Literals.YNUMERIC_FIELD__VALUE, ridget,
		// INumericTextRidget.PROPERTY_TEXT);
	}

	@Override
	public Control getWidget() {
		return controlBase;
	}

	public INumericTextRidget getRidget() {
		return numericRidget;
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
		return yNumericTextField.getDatadescription() != null
				&& yNumericTextField.getDatadescription().getLabel() != null;
	}

	/**
	 * Returns the label.
	 * 
	 * @return
	 */
	public String getLabel() {
		return yNumericTextField.getDatadescription().getLabel();
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
		// TODO add unit test
		// return the observable value for text
		return EMFObservables.observeValue(castEObject(getModel()),
				ExtensionModelPackage.Literals.YNUMERIC_FIELD__VALUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			numericText = null;
			numericRidget = null;
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
	 * Converts from model to ridget.
	 */
	private static class ModelToRidgetConverter implements IConverter {

		private final NumberFormat format = new DecimalFormat();

		@Override
		public Object getFromType() {
			return Long.class;
		}

		@Override
		public Object getToType() {
			return String.class;
		}

		@Override
		public Object convert(Object fromObject) {
			return format.format((Long) fromObject);
		}

	}

	/**
	 * Converts from ridget to model.
	 */
	private static class RidgetToModelConverter implements IConverter {

		private final NumberFormat format = new DecimalFormat();

		@Override
		public Object getFromType() {
			return String.class;
		}

		@Override
		public Object getToType() {
			return Long.class;
		}

		@Override
		public Object convert(Object fromObject) {
			try {
				return Long.valueOf(format.parse((String) fromObject)
						.longValue());
			} catch (ParseException e) {
				logger.error("{}", e);
				return new Long(0);
			}
		}

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
	private static class RienaEmfBridge extends AbstractBean {

		private long value;

		/**
		 * @return the value
		 */
		@SuppressWarnings("unused")
		public Long getValue() {
			return value;
		}

		/**
		 * @param value
		 *            the value to set
		 */
		@SuppressWarnings("unused")
		public void setValue(Long value) {
			firePropertyChanged("value", this.value, this.value = value);
		}

	}

}
