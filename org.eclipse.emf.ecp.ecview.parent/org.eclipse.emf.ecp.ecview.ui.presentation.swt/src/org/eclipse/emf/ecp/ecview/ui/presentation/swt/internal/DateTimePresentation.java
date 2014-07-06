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

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDateTime;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IDateTimeEditpart;
import org.eclipse.riena.ui.ridgets.IDateTimeRidget;
import org.eclipse.riena.ui.ridgets.IMarkableRidget;
import org.eclipse.riena.ui.ridgets.swt.SwtRidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class DateTimePresentation extends FieldPresentation {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory
			.getLogger(DateTimePresentation.class);
	private final YDateTime yDateTime;
	private Composite controlBase;
	private DateTime dateTime;
	private Label label;
	private IDateTimeRidget dateTimeRidget;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public DateTimePresentation(IElementEditpart editpart) {
		super((IDateTimeEditpart) editpart);
		this.yDateTime = (YDateTime) editpart.getModel();
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
			if (Util.isCssIdValid(yDateTime)) {
				setCSSId(controlBase, Util.getCssID(yDateTime));
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			label = new Label(controlBase, SWT.NONE);
			GridData labelGd = new GridData(SWT.BEGINNING, SWT.TOP, false, true);
			label.setLayoutData(labelGd);
			setCSSClass(label, CSS_CLASS__LABEL);

			dateTime = new DateTime(controlBase, SWT.BORDER);
			dateTimeRidget = (IDateTimeRidget) SwtRidgetFactory
					.createRidget(dateTime);
			dateTime.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

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

		if (Util.isCssClassValid(yDateTime)) {
			setCSSClass(dateTime, Util.getCssClass(yDateTime));
		} else {
			setCSSClass(dateTime, CSS_CLASS_CONTROL);
		}

		// creates the binding for the field
		createBindings(yDateTime, dateTimeRidget);
	}

	/**
	 * Creates the bindings for the given elements.
	 * 
	 * @param yField
	 * @param ridget
	 */
	protected void createBindings(YDateTime yField, IMarkableRidget ridget) {
		// create the model binding from ridget to ECView-model
		createModelBinding(castEObject(getModel()),
				ExtensionModelPackage.Literals.YDATE_TIME__VALUE, ridget,
				IDateTimeRidget.PROPERTY_DATE);

		// do further bindings
		super.createBindings(yField, ridget);
	}

	@Override
	public Control getWidget() {
		return controlBase;
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
		return yDateTime.getDatadescription() != null
				&& yDateTime.getDatadescription().getLabel() != null;
	}

	/**
	 * Returns the label.
	 * 
	 * @return
	 */
	public String getLabel() {
		return yDateTime.getDatadescription().getLabel();
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
		// return the observable value for text
		return EMFObservables.observeValue(castEObject(getModel()),
				ExtensionModelPackage.Literals.YDATE_TIME__VALUE);
	}

	/**
	 * @return the textRidget
	 */
	public IDateTimeRidget getRidget() {
		return dateTimeRidget;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			dateTime = null;
			dateTimeRidget = null;
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
}
