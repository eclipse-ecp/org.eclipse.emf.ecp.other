/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IComboBoxEditpart;
import org.eclipse.riena.ui.ridgets.IComboRidget;
import org.eclipse.riena.ui.ridgets.swt.SwtRidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * This presenter is responsible to render a comboBox field on the given layout.
 */
public class ComboBoxPresentation extends AbstractSWTWidgetPresenter {

	private final YComboBox yComboBox;
	private Composite controlBase;
	private Combo comboBox;
	private Label label;
	private IComboRidget comboBoxRidget;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public ComboBoxPresentation(IElementEditpart editpart) {
		super((IComboBoxEditpart) editpart);
		this.yComboBox = (YComboBox) editpart.getModel();
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
			if (Util.isCssIdValid(yComboBox)) {
				setCSSId(controlBase, Util.getCssID(yComboBox));
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			label = new Label(controlBase, SWT.NONE);
			label.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, false,
					true));
			setCSSClass(label, CSS_CLASS__LABEL);

			comboBox = new Combo(controlBase, SWT.READ_ONLY);
			comboBox.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			comboBoxRidget = (IComboRidget) SwtRidgetFactory
					.createRidget(comboBox);

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

		if (Util.isCssClassValid(yComboBox)) {
			setCSSClass(comboBox, Util.getCssClass(yComboBox));
		} else {
			setCSSClass(comboBox, CSS_CLASS__CONTROL);
		}

		// creates the binding for the field
		createBindings(yComboBox, comboBoxRidget);

//		Util.updateMarkableRidget(comboBoxRidget, yComboBox);
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
		return yComboBox.getDatadescription() != null
				&& yComboBox.getDatadescription().getLabel() != null;
	}

	/**
	 * Returns the label.
	 * 
	 * @return
	 */
	public String getLabel() {
		return yComboBox.getDatadescription().getLabel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			comboBox = null;
			comboBoxRidget = null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		// unrender the ui control
		unrender();
	}
}