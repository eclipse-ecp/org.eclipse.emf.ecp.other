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
package org.eclipse.emf.ecp.ui.uimodel.editparts.emf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiLayoutEditpart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * See {@link UiElementEditpart}
 * 
 * @param <M>
 */
public class UiEmbeddableEditpart<M extends YUiEmbeddable> extends UiElementEditpart<M> implements
	IUiEmbeddableEditpart {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(UiEmbeddableEditpart.class);
	private IUiLayoutEditpart parent;

	protected UiEmbeddableEditpart() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IUiLayoutEditpart getParent() {
		if (parent == null) {
			loadParent();
		}
		return parent;
	}

	/**
	 * Loads the parent of the embeddable.
	 */
	protected void loadParent() {
		if (parent == null) {
			YUiLayout yParent = getModel().getParent();
			internalSetParent((IUiLayoutEditpart) getEditpart(yParent));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		this.parent = null;

		super.dispose();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void handleModel_Set(int featureId, Notification notification) {
		checkDisposed();

		checkDisposed();

		switch (featureId) {
		case UiModelPackage.YUI_EMBEDDABLE__PARENT:
			YUiEmbeddable yParent = (YUiEmbeddable) notification.getNewValue();
			internalSetParent((IUiLayoutEditpart) getEditpart(yParent));
			break;
		}
	}

	/**
	 * Is invoked by a model change and the parent of the edit part should be set.
	 * 
	 * @param parent
	 */
	protected void internalSetParent(IUiLayoutEditpart parent) {
		this.parent = parent;
	}

}
