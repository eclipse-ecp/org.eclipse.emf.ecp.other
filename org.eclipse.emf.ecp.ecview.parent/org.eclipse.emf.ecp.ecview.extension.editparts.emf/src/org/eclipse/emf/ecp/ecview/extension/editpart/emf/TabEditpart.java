/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.extension.editpart.emf;

import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.EmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTab;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITabEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITabSheetEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.presentation.ITabPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("restriction")
public class TabEditpart extends ElementEditpart<YTab> implements ITabEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmbeddableEditpart.class);
	private ITabPresentation<?> presentation;

	/**
	 * The default constructor.
	 */
	protected TabEditpart() {
	}

	@Override
	protected YTab createModel() {
		return (YTab) ExtensionModelFactory.eINSTANCE.createYTab();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ITabSheetEditpart getParent() {
		YTabSheet yParent = getModel().getParent();
		return yParent != null ? (ITabSheetEditpart) getEditpart(yParent)
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
	public <A extends ITabPresentation<?>> A getPresentation() {
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
			ITabSheetEditpart parent = getParent();
			if (parent != null) {
				parent.removeTab(this);
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
