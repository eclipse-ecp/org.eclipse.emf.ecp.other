/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal;

import org.eclipse.e4.ui.css.swt.CSSSWTConstants;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ui.uimodel.css.core.dom.properties.css2.CssConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
@SuppressWarnings("restriction")
public class GridLayoutPresentation extends AbstractSWTLayoutPresenter {

	private final IUiLayoutEditpart editpart;
	private GridLayout layout;
	private Composite controlBase;
	private Composite control;
	private ModelAccess modelAccess;

	public GridLayoutPresentation(IUiElementEditpart editpart) {
		this.editpart = (IUiLayoutEditpart) editpart;
		this.modelAccess = new ModelAccess((YUiGridLayout) editpart.getModel());
	}

	/**
	 * Returns the view context.
	 * 
	 * @return
	 */
	protected IViewContext getViewContext() {
		return editpart.getView().getContext();
	}

	/**
	 * Returns the editpart the presenter will render for.
	 * 
	 * @return
	 */
	public IUiLayoutEditpart getEditpart() {
		return editpart;
	}

	@Override
	public Composite createWidget(Object parent) {
		if (controlBase == null) {
			controlBase = new Composite((Composite) parent, SWT.NONE);
			controlBase.setLayout(new GridLayout(1, true));

			if (modelAccess.isMargin()) {
				controlBase.setData(CSSSWTConstants.MARGIN_WRAPPER_KEY, CSSSWTConstants.MARGIN_WRAPPER_KEY);
			}

			control = new Composite(controlBase, SWT.NONE);
			control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			layout = new GridLayout(modelAccess.getColumns(), true);
			control.setLayout(layout);

			if (modelAccess.isCssIdValid()) {
				setCSSId(control, modelAccess.getCssID());
			}

			if (modelAccess.isCssClassValid()) {
				setCSSClass(control, modelAccess.getCssClass());
			}

			if (modelAccess.isSpacing()) {
				control.setData(CssConstants.SPACING_ENABLED, CssConstants.SPACING_ENABLED);
			}

			renderChildren();
		}

		return controlBase;
	}

	/**
	 * Is called to render the children.
	 */
	protected void renderChildren() {
		for (IUiEmbeddableEditpart childEditpart : editpart.getElements()) {
			childEditpart.getPresentation().createWidget(control);
		}
	}

	@Override
	public Composite getWidget() {
		return controlBase;
	}

	@Override
	public boolean isRendered() {
		return controlBase != null;
	}

	@Override
	protected void internalDispose() {
		unrender();
	}

	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			control = null;
		}
	}

	/**
	 * Is called to create the widget for the given presentation
	 * 
	 * @param childPresentation
	 * @return
	 */
	protected Control createChildWidget(IWidgetPresentation<?> childPresentation) {
		Control childControl = (Control) childPresentation.createWidget(control);
		childControl.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));
		return childControl;
	}

	@Override
	protected void internalAdd(IWidgetPresentation<?> presentation) {
		// render the widget
		createChildWidget(presentation);
	}

	@Override
	protected void internalRemove(IWidgetPresentation<?> presentation) {
		// unrender the presentation
		presentation.unrender();
	}

	@Override
	protected void internalInsert(IWidgetPresentation<?> presentation, int index) {
		// render the widget
		Control childControl = (Control) createChildWidget(presentation);
		Control[] children = control.getChildren();
		if (index > children.length) {
			throw new RuntimeException(String.format("Insert at index %d not possible. Children count = %d", index,
				children.length));
		}

		if (index == children.length) {
			// nothing to do. Control was added at the end.
		} else {
			// determine the next control, and move the given control before it.
			Control nextControl = children[index];
			childControl.moveAbove(nextControl);
		}
	}

	@Override
	protected void internalMove(IWidgetPresentation<?> presentation, int oldIndex, int newIndex) {

		if (!presentation.isRendered()) {
			throw new RuntimeException("Presentation is not rendered yet. Move not possible.");
		}

		if (oldIndex == newIndex) {
			return;
		}

		Control childControl = (Control) presentation.getWidget();
		Control[] children = control.getChildren();
		if (newIndex < oldIndex) {
			// determine the next control, and move the given control before it.
			Control nextControl = children[newIndex];
			childControl.moveAbove(nextControl);
		} else {
			// determine the previous control, and move the given control after it.
			Control previousControl = children[newIndex];
			childControl.moveBelow(previousControl);
		}
	}

	private static class ModelAccess {
		private final YUiGridLayout yLayout;

		public ModelAccess(YUiGridLayout yLayout) {
			super();
			this.yLayout = yLayout;
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yLayout.getCssClass();
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
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#isSpacing()
		 */
		public boolean isSpacing() {
			return yLayout.isSpacing();
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiCssAble#getCssID()
		 */
		public String getCssID() {
			return yLayout.getCssID();
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
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#isMargin()
		 */
		public boolean isMargin() {
			return yLayout.isMargin();
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout#getColumns()
		 */
		public int getColumns() {
			int columns = yLayout.getColumns();
			return columns <= 0 ? 2 : columns;
		}

	}
}
