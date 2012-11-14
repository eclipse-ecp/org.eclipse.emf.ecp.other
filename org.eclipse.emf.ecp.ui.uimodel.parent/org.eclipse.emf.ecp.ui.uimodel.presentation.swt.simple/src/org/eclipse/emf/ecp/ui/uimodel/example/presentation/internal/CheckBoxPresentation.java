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

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiCheckboxEditpart;
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

	private final ModelAccess modelAccess;
	private Composite controlBase;
	private Button checkBox;
	private Label label;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public CheckBoxPresentation(IUiElementEditpart editpart) {
		super((IUiCheckboxEditpart) editpart);
		this.modelAccess = new ModelAccess((YUiCheckBox) editpart.getModel());
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
			if (modelAccess.isCssIdValid()) {
				setCSSId(controlBase, modelAccess.getCssID());
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

			if (modelAccess.isCssClassValid()) {
				setCSSClass(checkBox, modelAccess.getCssClass());
			} else {
				setCSSClass(checkBox, CSS_CLASS__CONTROL);
			}

			if (modelAccess.isLabelValid()) {
				label.setText(modelAccess.getLabel());
			}
		}
		return controlBase;
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
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			checkBox = null;
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

	/**
	 * A helper class.
	 */
	private static class ModelAccess {
		private final YUiCheckBox yButton;

		public ModelAccess(YUiCheckBox yButton) {
			super();
			this.yButton = yButton;
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yButton.getCssClass();
		}

		/**
		 * Returns true, if the css class is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssClassValid() {
			return getCssClass() != null && !getCssClass().equals("");
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssID()
		 */
		public String getCssID() {
			return yButton.getCssID();
		}

		/**
		 * Returns true, if the css id is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssIdValid() {
			return getCssID() != null && !getCssID().equals("");
		}

		/**
		 * Returns true, if the label is valid.
		 * 
		 * @return
		 */
		public boolean isLabelValid() {
			return yButton.getDatadescription() != null
					&& yButton.getDatadescription().getLabel() != null;
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabel() {
			return yButton.getDatadescription().getLabel();
		}
	}
}
