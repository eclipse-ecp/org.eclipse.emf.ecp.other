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
package org.eclipse.emf.ecp.ecview.common.editpart.emf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.IDialogEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindableEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YDialog;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ecview.common.presentation.IDialogPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DialogEditpart extends ElementEditpart<YDialog> implements
		IDialogEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmbeddableEditpart.class);
	private IDialogPresentation<?> presentation;
	private IEmbeddableEditpart content;

	/**
	 * The default constructor.
	 */
	protected DialogEditpart() {
	}

	@Override
	protected YDialog createModel() {
		return (YDialog) CoreModelFactory.eINSTANCE.createYDialog();
	}

	@Override
	public IViewEditpart getParent() {
		return getView();
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
	public <A extends IDialogPresentation<?>> A getPresentation() {
		if (presentation == null) {
			presentation = createPresenter();
			presentation.setContent(getContent());
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

	@Override
	public void requestRender() {
		if (getParent() != null) {
			getParent().openDialog(this, null);
		} else {
			unrender();
		}
	}

	@Override
	public Object render(Object parentWidget) {
		return getPresentation().createWidget(parentWidget);
	}

	@Override
	public void requestUnrender() {
		if (getParent() != null) {
			getParent().closeDialog(this);
		} else {
			unrender();
		}
	}

	@Override
	public void unrender() {
		getPresentation().unrender();
	}

	@Override
	public boolean isRendered() {
		return internalGetPresentation() != null
				&& internalGetPresentation().isRendered();
	}

	@Override
	public Object getWidget() {
		return getPresentation().getWidget();
	}

	@Override
	public void requestDispose() {
		if (getParent() != null) {
			getParent().closeDialog(this);
		} else {
			dispose();
		}
	}

	@Override
	public void renderChild(IEmbeddableEditpart child) {
		if (child != content) {
			return;
		}

		getPresentation().setContent(child);
	}

	@Override
	public void unrenderChild(IEmbeddableEditpart child) {
		if (child != content) {
			return;
		}

		// first remove the child presentation from the current presentation
		getPresentation().setContent(null);

		// then tell the child editpart to unrender its own presentation
		child.unrender();
	}

	@Override
	public void disposeChild(IEmbeddableEditpart child) {
		if (child != content) {
			return;
		}

		// first remove the child presentation from the current presentation
		getPresentation().setContent(null);

		// then tell the child editpart to dispose itself
		child.dispose();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case CoreModelPackage.YDIALOG__CONTENT:
			IEmbeddableEditpart oldContent = content;
			if (oldContent != null) {
				oldContent.dispose();
				internalSetContent(null);
				if (isRendered()) {
					getPresentation().setContent(null);
				}
			}

			YEmbeddable yNewContent = (YEmbeddable) notification.getNewValue();
			IEmbeddableEditpart editPart = (IEmbeddableEditpart) getEditpart(yNewContent);
			internalSetContent(editPart);

			// handle the presentation
			//
			if (isRendered()) {
				getPresentation().setContent(editPart);
			}

			break;
		default:
			break;
		}
	}

	public void setContent(IEmbeddableEditpart content) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			YDialog yDialog = getModel();
			YEmbeddable yElement = content != null ? (YEmbeddable) content
					.getModel() : null;
			yDialog.setContent(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public IEmbeddableEditpart getContent() {
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
			YEmbeddable yContent = getModel().getContent();
			internalSetContent((IEmbeddableEditpart) getEditpart(yContent));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param content
	 *            The content to be set
	 */
	protected void internalSetContent(IEmbeddableEditpart content) {
		this.content = content;
	}

	@Override
	public void setInputDataBindingEndpoint(
			IBindableEndpointEditpart bindingEndpoint) {
		IDialogPresentation<?> presentation = getPresentation();
		presentation.setInputDataBindingEndpoint(bindingEndpoint);
	}
}
