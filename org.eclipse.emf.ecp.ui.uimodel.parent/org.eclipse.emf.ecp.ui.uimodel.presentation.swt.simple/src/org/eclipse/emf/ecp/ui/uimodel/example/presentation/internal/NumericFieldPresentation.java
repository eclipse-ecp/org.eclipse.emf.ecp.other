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
package org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal;

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiNumericField;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiNumericFieldEditpart;
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

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class NumericFieldPresentation extends AbstractSWTWidgetPresenter {

	private final YUiNumericField yNumericTextField;
	private Composite controlBase;
	private Text numericText;
	private Label label;
	private INumericTextRidget numericRidget;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public NumericFieldPresentation(IUiElementEditpart editpart) {
		super((IUiNumericFieldEditpart) editpart);
		this.yNumericTextField = (YUiNumericField) editpart.getModel();
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
			numericRidget = (INumericTextRidget) SwtRidgetFactory
					.createRidget(numericText);
			numericText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

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
			setCSSClass(numericText, CSS_CLASS__CONTROL);
		}

		Util.updateMarkableRidget(numericRidget, yNumericTextField);
		Util.updateNumericRidget(numericRidget, yNumericTextField.getDatatype());
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
		// unrender the ui control
		unrender();
	}
}
