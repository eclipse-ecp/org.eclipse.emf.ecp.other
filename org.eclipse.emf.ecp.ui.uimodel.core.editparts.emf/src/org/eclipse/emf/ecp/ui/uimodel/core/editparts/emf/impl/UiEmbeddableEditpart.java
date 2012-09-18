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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * See {@link UiElementEditpart}
 * 
 * @param <M>
 */
public abstract class UiEmbeddableEditpart<M extends YUiEmbeddable> extends UiElementEditpart<M> implements
	IUiEmbeddableEditpart {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(UiEmbeddableEditpart.class);
	private IWidgetPresentation<?> presenter;

	protected UiEmbeddableEditpart() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IUiLayoutEditpart getParent() {
		YUiLayout yParent = getModel().getParent();
		return yParent != null ? (IUiLayoutEditpart) getEditpart(yParent) : null;
	}

	@Override
	public IUiViewEditpart getView() {
		YUiView yView = getModel().getView();
		return yView != null ? (IUiViewEditpart) getEditpart(yView) : null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IWidgetPresentation<?>> A getPresentation() {
		if (presenter == null) {
			presenter = createPresenter();
		}
		return (A) presenter;
	}

	/**
	 * Is called to created the presenter for this edit part.
	 */
	protected <A extends IWidgetPresentation<?>> A createPresenter() {
		return DelegatingPresenterFactory.getInstance().createPresentation(getView().getContext(), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		try {
			// if directly attached to a view, then remove it
			IUiViewEditpart view = getView();
			if (view != null) {
				view.setContent(null);
			}

			// remove from the parent
			IUiLayoutEditpart parent = getParent();
			if (parent != null) {
				parent.removeElement(this);
			}

			// dispose the presenter
			//
			if (presenter != null) {
				presenter.dispose();
				presenter = null;
			}

		} finally {
			super.internalDispose();
		}
	}
}
