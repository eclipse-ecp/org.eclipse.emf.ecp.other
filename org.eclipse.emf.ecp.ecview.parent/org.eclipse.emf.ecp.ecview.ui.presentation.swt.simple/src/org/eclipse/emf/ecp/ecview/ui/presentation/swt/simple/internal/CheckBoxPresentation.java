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
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.simple.internal;

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ICheckboxEditpart;
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
public class CheckBoxPresentation extends AbstractSWTWidgetPresenter {

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

		Util.updateMarkableRidget(checkBoxRidget, yCheckBox);
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
		// unrender the ui control
		unrender();
	}
}
