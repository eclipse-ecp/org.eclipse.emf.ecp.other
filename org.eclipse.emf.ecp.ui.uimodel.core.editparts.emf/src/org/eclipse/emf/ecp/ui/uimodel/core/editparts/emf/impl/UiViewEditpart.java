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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IViewPresentation;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation for {@link IUiViewEditpart}.
 * 
 * @param <M>
 */
public class UiViewEditpart<M extends YUiView> extends UiElementEditpart<M> implements IUiViewEditpart {

	private static final Logger LOGGER = LoggerFactory.getLogger(UiViewEditpart.class);
	private IUiEmbeddableEditpart content;
	private IViewContext context;
	private IViewPresentation<?> presentation;

	/**
	 * Default constructor.
	 */
	public UiViewEditpart() {

	}

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		M model = (M) UiModelFactory.eINSTANCE.createYUiView();

		return model;
	}

	@Override
	public IViewContext getContext() {
		return context;
	}

	@Override
	// BEGIN SUPRESS CATCH EXCEPTION
	public void setContext(IViewContext context) throws RuntimeException {
		// END SUPRESS CATCH EXCEPTION
		if (this.context == context) {
			return;
		}

		if (this.context != null && this.context.isRendered()) {
			throw new RuntimeException("Already rendered! Changing context not allowed!");
		}
		this.context = context;
	}

	@Override
	public String getName() {
		return getModel().getViewName();
	}

	@Override
	public void setContent(IUiEmbeddableEditpart content) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			M yView = getModel();
			YUiEmbeddable yElement = content != null ? (YUiEmbeddable) content.getModel() : null;
			yView.setContent(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	@Override
	public IUiEmbeddableEditpart getContent() {
		if (content == null) {
			loadContent();
		}
		return content;
	}

	/**
	 * Loads the content of the view.
	 */
	protected void loadContent() {
		if (content == null) {
			YUiEmbeddable yContent = getModel().getContent();
			internalSetContent((IUiEmbeddableEditpart) getEditpart(yContent));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should be set.
	 * 
	 * @param content The content to be set
	 */
	protected void internalSetContent(IUiEmbeddableEditpart content) {
		this.content = content;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case UiModelPackage.YUI_VIEW__CONTENT:
			YUiEmbeddable yNewContent = (YUiEmbeddable) notification.getNewValue();

			IUiEmbeddableEditpart editPart = (IUiEmbeddableEditpart) getEditpart(yNewContent);
			internalSetContent(editPart);

			// handle the presentation
			//
			if (isRendered()) {
				getPresentation().setContent(editPart != null ? editPart.getPresentation() : null);
			}

			// fire event
			firePropertyChangedEditpart(PROP_CONTENT, notification);
			break;
		default:
			break;
		}
	}

	/**
	 * Returns true, if the editpart is currently rendered.
	 * 
	 * @return
	 */
	private boolean isRendered() {
		return internalGetPresentation() != null && internalGetPresentation().isRendered();
	}

	@Override
	protected void internalDispose() {
		try {

			// remove from the parent
			IUiViewSetEditpart parent = getParent();
			if (parent != null) {
				parent.removeView(this);
			}

			// dispose the presenter
			//
			if (presentation != null) {
				presentation.dispose();
				presentation = null;
			}

			// lazy loading: edit parts also have to be disposed if they have not been loaded yet,
			// but exist in the model.
			if (getContent() != null) {
				content.dispose();
				content = null;
			}
		} finally {
			super.internalDispose();
		}
	}

	@Override
	public IUiViewSetEditpart getParent() {
		YUiViewSet yViewSet = getModel().getRoot();
		return yViewSet != null ? (IUiViewSetEditpart) getEditpart(yViewSet) : null;
	}

	/**
	 * Returns the instance of the presentation, but does not load it.
	 * 
	 * @param <A> An instance of {@link IWidgetPresentation}
	 * @return presentation
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IWidgetPresentation<?>> A internalGetPresentation() {
		return (A) presentation;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IViewPresentation<?>> A getPresentation() {
		if (presentation == null) {
			presentation = createPresentation();
		}
		return (A) presentation;
	}

	/**
	 * Is called to created the presenter for this edit part.
	 * 
	 * @param <A> An instance of {@link IViewPresentation}
	 * 
	 * @return The created presentation.
	 */
	protected <A extends IViewPresentation<?>> A createPresentation() {
		return DelegatingPresenterFactory.getInstance().createPresentation(getContext(), this);
	}
}