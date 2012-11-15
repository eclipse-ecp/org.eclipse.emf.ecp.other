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

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiDecimalField;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiNumericFieldEditpart;
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

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class DecimalFieldPresentation extends AbstractSWTWidgetPresenter {

	private final YUiDecimalField yDecimalTextField;
	private Composite controlBase;
	private Text decimalText;
	private Label label;
	private IDecimalTextRidget decimalRidget;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public DecimalFieldPresentation(IUiElementEditpart editpart) {
		super((IUiNumericFieldEditpart) editpart);
		this.yDecimalTextField = (YUiDecimalField) editpart.getModel();
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
					UIControlsFactory.TYPE_NUMERIC);
			decimalRidget = (IDecimalTextRidget) SwtRidgetFactory
					.createRidget(decimalText);
			decimalText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true));

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

		if (Util.isCssClassValid(yDecimalTextField)) {
			setCSSClass(decimalText, Util.getCssClass(yDecimalTextField));
		} else {
			setCSSClass(decimalText, CSS_CLASS__CONTROL);
		}

		Util.updateMarkableRidget(decimalRidget, yDecimalTextField);
		Util.updateDecimalRidget(decimalRidget, yDecimalTextField.getDatatype());
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			decimalText = null;
			decimalRidget = null;
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
