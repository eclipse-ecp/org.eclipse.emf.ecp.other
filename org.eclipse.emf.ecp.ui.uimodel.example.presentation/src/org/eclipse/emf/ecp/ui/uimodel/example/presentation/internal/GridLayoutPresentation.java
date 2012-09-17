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

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class GridLayoutPresentation extends AbstractSWTLayoutPresenter {

	private final IUiLayoutEditpart editpart;
	private Composite composite;
	private GridLayout layout;
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
		if (composite == null) {
			composite = new Composite((Composite) parent, SWT.BORDER);
			layout = new GridLayout(modelAccess.getColumns(), true);
			composite.setLayout(layout);

			renderChildren();
		}

		return composite;
	}

	/**
	 * Is called to render the children.
	 */
	protected void renderChildren() {
		for (IUiEmbeddableEditpart childEditpart : editpart.getElements()) {
			childEditpart.getPresenter().createWidget(composite);
		}
	}

	@Override
	public Composite getWidget() {
		return composite;
	}

	@Override
	public boolean isRendered() {
		return composite != null;
	}

	@Override
	protected void internalDispose() {
		unrender();
	}

	@Override
	public void unrender() {
		if (composite != null) {
			composite.dispose();
			composite = null;
		}
	}

	/**
	 * Is called to create the widget for the given presentation
	 * 
	 * @param childPresentation
	 * @return
	 */
	protected Control createChildWidget(IWidgetPresentation<?> childPresentation) {
		Control control = (Control) childPresentation.createWidget(composite);
		control.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));
		return control;
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
		Control control = (Control) createChildWidget(presentation);
		Control[] children = composite.getChildren();
		if (index > children.length) {
			throw new RuntimeException(String.format("Insert at index %d not possible. Children count = %d", index,
				children.length));
		}

		if (index == children.length) {
			// nothing to do. Control was added at the end.
		} else {
			// determine the next control, and move the given control before it.
			Control nextControl = children[index];
			control.moveAbove(nextControl);
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

		Control control = (Control) presentation.getWidget();
		Control[] children = composite.getChildren();
		if (newIndex < oldIndex) {
			// determine the next control, and move the given control before it.
			Control nextControl = children[newIndex];
			control.moveAbove(nextControl);
		} else {
			// determine the previous control, and move the given control after it.
			Control previousControl = children[newIndex];
			control.moveBelow(previousControl);
		}
	}

	@SuppressWarnings("unused")
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
