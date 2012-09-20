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

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiTextFieldEditpart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class TextFieldPresentation extends AbstractSWTWidgetPresenter {

	private final IUiTextFieldEditpart editpart;
	private final ModelAccess modelAccess;
	private Composite controlBase;
	private Text control;

	/**
	 * Constructor.
	 * 
	 * @param editpart The editpart of that presenter
	 */
	public TextFieldPresentation(IUiElementEditpart editpart) {
		this.editpart = (IUiTextFieldEditpart) editpart;
		this.modelAccess = new ModelAccess((YUiTextField) editpart.getModel());
	}

	/**
	 * Returns the view context.
	 * 
	 * @return viewContext
	 */
	protected IViewContext getViewContext() {
		return editpart.getView().getContext();
	}

	/**
	 * Returns the editpart the presenter will render for.
	 * 
	 * @return editpart
	 */
	public IUiElementEditpart getEditpart() {
		return editpart;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Control createWidget(Object parent) {
		if (controlBase == null) {
			controlBase = new Composite((Composite) parent, SWT.NONE);
			controlBase.setLayout(new GridLayout(1, true));
			setCSSClass(controlBase, CSS_CLASS__CONTROL_BASE);

			control = new Text(controlBase, SWT.BORDER);
			control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			if (modelAccess.isCssIdValid()) {
				setCSSId(control, modelAccess.getCssID());
			} else {
				setCSSId(control, editpart.getId());
			}

			if (modelAccess.isCssClassValid()) {
				setCSSClass(control, modelAccess.getCssClass());
			} else {
				setCSSClass(control, CSS_CLASS__CONTROL);
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
			control = null;
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
		private final YUiTextField yText;

		public ModelAccess(YUiTextField yText) {
			super();
			this.yText = yText;
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yText.getCssClass();
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
			return yText.getCssID();
		}

		/**
		 * Returns true, if the css id is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssIdValid() {
			return getCssID() != null && !getCssID().equals("");
		}
	}
}
