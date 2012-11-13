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

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiLabelEditpart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class LabelPresentation extends AbstractSWTWidgetPresenter {

	private final ModelAccess modelAccess;
	private Composite controlBase;
	private Label label;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public LabelPresentation(IUiElementEditpart editpart) {
		super((IUiLabelEditpart) editpart);
		this.modelAccess = new ModelAccess((YUiLabel) editpart.getModel());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Control createWidget(Object parent) {
		if (controlBase == null) {
			controlBase = new Composite((Composite) parent, SWT.NONE);
			controlBase.setLayout(new GridLayout(1, false));
			setCSSClass(controlBase, CSS_CLASS__CONTROL_BASE);
			if (modelAccess.isCssIdValid()) {
				setCSSId(controlBase, modelAccess.getCssID());
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			label = new Label(controlBase, SWT.NONE);
			label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			setCSSClass(label, CSS_CLASS__LABEL);

			if (modelAccess.isCssClassValid()) {
				setCSSClass(label, modelAccess.getCssClass());
			} else {
				setCSSClass(label, CSS_CLASS__CONTROL);
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
			label = null;
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
		private final YUiLabel yUiLabel;

		public ModelAccess(YUiLabel yUiLabel) {
			super();
			this.yUiLabel = yUiLabel;
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yUiLabel.getCssClass();
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
			return yUiLabel.getCssID();
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
			return yUiLabel.getDatadescription() != null
					&& yUiLabel.getDatadescription().getLabel() != null;
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabel() {
			return yUiLabel.getDatadescription().getLabel();
		}
	}
}
