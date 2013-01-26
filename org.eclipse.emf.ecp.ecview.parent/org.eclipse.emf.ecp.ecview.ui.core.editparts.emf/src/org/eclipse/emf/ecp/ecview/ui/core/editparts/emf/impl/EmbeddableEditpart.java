/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.core.editparts.emf.impl;

import org.eclipse.emf.ecp.ecview.ui.core.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.ui.core.model.core.YView;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.IViewEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.presentation.IWidgetPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * See {@link ElementEditpart}.
 * 
 * @param <M>
 */
public abstract class EmbeddableEditpart<M extends YEmbeddable> extends
		ElementEditpart<M> implements IEmbeddableEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmbeddableEditpart.class);
	private IWidgetPresentation<?> presentation;

	/**
	 * The default constructor.
	 */
	protected EmbeddableEditpart() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ILayoutEditpart getParent() {
		YLayout yParent = getModel().getParent();
		return yParent != null ? (ILayoutEditpart) getEditpart(yParent)
				: null;
	}

	@Override
	public IViewEditpart getView() {
		YView yView = getModel().getView();
		return yView != null ? (IViewEditpart) getEditpart(yView) : null;
	}

	/**
	 * Returns the instance of the presentation, but does not load it.
	 * 
	 * @param <A>
	 *            An instance of {@link IWidgetPresentation}
	 * @return presentation
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IWidgetPresentation<?>> A internalGetPresentation() {
		return (A) presentation;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IWidgetPresentation<?>> A getPresentation() {
		if (presentation == null) {
			presentation = createPresenter();
		}
		return (A) presentation;
	}

	/**
	 * Is called to created the presenter for this edit part.
	 */
	protected <A extends IWidgetPresentation<?>> A createPresenter() {
		IViewEditpart viewEditPart = getView();
		if (viewEditPart == null) {
			LOGGER.info("View is null");
			return null;
		}
		return DelegatingPresenterFactory.getInstance().createPresentation(
				viewEditPart.getContext(), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		try {
			// if directly attached to a view, then remove it
			IViewEditpart view = getView();
			if (view != null) {
				view.setContent(null);
			}

			// remove from the parent
			ILayoutEditpart parent = getParent();
			if (parent != null) {
				parent.removeElement(this);
			}

			// dispose the presenter
			//
			if (presentation != null) {
				presentation.dispose();
				presentation = null;
			}

		} finally {
			super.internalDispose();
		}
	}
}
