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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.common.IResourceSetManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.common.ResourceSetManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UiViewEditpart<M extends YUiView> extends UiElementEditpart<M> implements IUiViewEditpart {

	private static final Logger logger = LoggerFactory.getLogger(UiViewEditpart.class);
	private IUiEmbeddableEditpart content;

	protected UiViewEditpart() {

	}

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		M model = (M) UiModelFactory.eINSTANCE.createYUiView();

		// add model to orphan resource
		Resource resource = ResourceSetManager.getInstance().getResource(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI);
		resource.getContents().add(model);

		return model;
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
			YUiEmbeddable yElement = (YUiEmbeddable) content.getModel();
			yView.setContent(yElement);
		} catch (RuntimeException e) {
			logger.error("{}", e);
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
	 * @param parent
	 */
	protected void internalSetContent(IUiEmbeddableEditpart content) {
		this.content = content;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void handleModel_Set(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case UiModelPackage.YUI_VIEW__CONTENT:
			YUiEmbeddable yContent = (YUiEmbeddable) notification.getNewValue();
			internalSetContent((IUiEmbeddableEditpart) getEditpart(yContent));
			break;
		}
	}
}
