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

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ICheckboxEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.IBindingManager;
import org.eclipse.riena.ui.ridgets.IToggleButtonRidget;
import org.eclipse.riena.ui.ridgets.swt.SwtRidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * This presenter is responsible to render a checkBox field on the given layout.
 */
public class CheckBoxPresentation extends FieldPresentation {

	private final YCheckBox yCheckBox;
	private Composite controlBase;
	private Button checkBox;
	private Label label;
	private IToggleButtonRidget checkBoxRidget;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public CheckBoxPresentation(IElementEditpart editpart) {
		super((ICheckboxEditpart) editpart);
		this.yCheckBox = (YCheckBox) editpart.getModel();
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
			if (Util.isCssIdValid(yCheckBox)) {
				setCSSId(controlBase, Util.getCssID(yCheckBox));
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			label = new Label(controlBase, SWT.NONE);
			label.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, false,
					false));
			setCSSClass(label, CSS_CLASS__LABEL);

			checkBox = new Button(controlBase, SWT.CHECK);
			checkBox.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, false,
					false));
			checkBoxRidget = (IToggleButtonRidget) SwtRidgetFactory
					.createRidget(checkBox);

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

		if (Util.isCssClassValid(yCheckBox)) {
			setCSSClass(checkBox, Util.getCssClass(yCheckBox));
		} else {
			setCSSClass(checkBox, CSS_CLASS__CONTROL);
		}

		// creates the binding for the field
		createBindings(yCheckBox, checkBoxRidget);
	}

	/**
	 * Creates the bindings for the given elements.
	 * 
	 * @param yField
	 * @param ridget
	 */
	protected void createBindings(YCheckBox yField, IToggleButtonRidget ridget) {

		super.createBindings((YField) yField, ridget);

		IBindingManager bindingManager = getBindingManager();
		// bind the value of yText to textRidget
		IObservableValue modelObservable = EMFObservables.observeValue(
				castEObject(getModel()),
				ExtensionModelPackage.Literals.YCHECK_BOX__VALUE);
		IObservableValue uiObservable = BeansObservables.observeValue(ridget,
				IToggleButtonRidget.PROPERTY_SELECTED);
		bindingManager.bind(uiObservable, modelObservable);
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
		return yCheckBox.getDatadescription() != null
				&& yCheckBox.getDatadescription().getLabel() != null;
	}

	/**
	 * Returns the label.
	 * 
	 * @return
	 */
	public String getLabel() {
		return yCheckBox.getDatadescription().getLabel();
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
		return BeansObservables.observeValue(checkBox,
				IToggleButtonRidget.PROPERTY_SELECTED);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			checkBox = null;
			checkBoxRidget = null;
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
