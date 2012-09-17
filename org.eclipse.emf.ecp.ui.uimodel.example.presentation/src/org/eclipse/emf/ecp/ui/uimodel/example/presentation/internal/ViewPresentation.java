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

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IViewPresentation;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class ViewPresentation extends AbstractDisposable implements IViewPresentation<Control> {

	private static final Logger logger = LoggerFactory.getLogger(ViewPresentation.class);

	private final IUiViewEditpart editpart;
	@SuppressWarnings("unused")
	private final YUiView model;
	private Composite viewComposite;

	public ViewPresentation(IUiViewEditpart editpart) {
		this.editpart = editpart;
		this.model = (YUiView) editpart.getModel();
	}

	/**
	 * Returns the editpart the presenter will render for.
	 * 
	 * @return
	 */
	public IUiElementEditpart getEditpart() {
		checkDisposed();
		return editpart;
	}

	@Override
	public void render() {
		checkDisposed();

		Composite parent = (Composite) editpart.getContext().getRootLayout();
		viewComposite = new Composite(parent, SWT.NONE);
		applyViewLayout(viewComposite);

		// render the content
		//
		renderContent();
	}

	/**
	 * Is called to render the content.
	 */
	protected void renderContent() {
		IUiEmbeddableEditpart contentEditPart = editpart.getContent();
		if (contentEditPart != null) {
			IWidgetPresentation<Control> contentPresenter = contentEditPart.getPresenter();
			Control contentControl = contentPresenter.createWidget(viewComposite);
			contentControl.setLayoutData(null);
		} else {
			logger.warn("Content is null");
		}
	}

	/**
	 * Applies the layout to the root composite.
	 */
	protected void applyViewLayout(Composite composite) {
		composite.setLayout(new FillLayout());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Control createWidget(Object parent) {
		return viewComposite;
	}

	@Override
	public Control getWidget() {
		return viewComposite;
	}

	@Override
	public boolean isRendered() {
		return viewComposite != null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (viewComposite != null) {
			viewComposite.dispose();
			viewComposite = null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		if (viewComposite != null) {
			unrender();
		}
	}

	// @Override
	// public void propertyChange(PropertyChangeEvent event) {
	// checkDisposed();
	//
	// if (viewComposite != null) {
	// if (event.getPropertyName().equals(IUiViewEditpart.PROP_CONTENT)) {
	// IUiEmbeddableEditpart oldValue = (IUiEmbeddableEditpart) event.getOldValue();
	// IUiEmbeddableEditpart newValue = (IUiEmbeddableEditpart) event.getNewValue();
	// if (oldValue == newValue) {
	// return;
	// }
	//
	// if (oldValue != null && newValue == null) {
	// unrenderContent();
	// } else if (oldValue == null && newValue != null) {
	// renderContent();
	// } else if (oldValue != null && newValue != null) {
	// // first unrender the old content and then render the new one
	// unrenderContent();
	// renderContent();
	// }
	// }
	// }
	// }
}
