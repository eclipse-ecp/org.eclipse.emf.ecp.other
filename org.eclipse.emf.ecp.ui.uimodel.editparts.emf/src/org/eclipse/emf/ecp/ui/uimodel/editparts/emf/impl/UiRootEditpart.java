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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiRoot;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiRootEditpart;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiViewEditpart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UiRootEditpart<M extends YUiRoot> extends UiElementEditpart<M> implements IUiRootEditpart {

	private static final Logger logger = LoggerFactory.getLogger(UiRootEditpart.class);

	private List<IUiViewEditpart> uiViewEditparts;

	protected UiRootEditpart() {

	}

	@Override
	public List<IUiViewEditpart> getViews() {
		if (uiViewEditparts == null) {
			internalLoadViews();
		}

		return (uiViewEditparts != null ? Collections.unmodifiableList(uiViewEditparts) : Collections
			.<IUiViewEditpart> emptyList());
	}

	@Override
	protected void internalDispose() {
		if (uiViewEditparts != null) {
			for (IUiViewEditpart editpart : uiViewEditparts) {
				editpart.dispose();
			}
			uiViewEditparts = null;
		}

		super.internalDispose();
	}

	@Override
	public void addView(IUiViewEditpart view) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			M yView = getModel();
			YUiView yElement = (YUiView) view.getModel();
			yView.getViews().add(yElement);
		} catch (RuntimeException e) {
			logger.error("{}", e);
			throw e;
		}
	}

	@Override
	public void removeView(IUiViewEditpart view) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			M yView = getModel();
			YUiView yElement = (YUiView) view.getModel();
			yView.getViews().remove(yElement);
		} catch (RuntimeException e) {
			logger.error("{}", e);
			throw e;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModel_Add(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case UiModelPackage.YUI_ROOT__VIEWS:
			YUiEmbeddable yElement = (YUiEmbeddable) notification.getNewValue();
			internalAddElement((IUiViewEditpart) getEditpart(yElement));
			break;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModel_Remove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case UiModelPackage.YUI_ROOT__VIEWS:
			YUiEmbeddable yElement = (YUiEmbeddable) notification.getOldValue();
			internalRemoveElement((IUiViewEditpart) getEditpart(yElement));
			break;
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the list of elements.
	 * 
	 * @param editpart
	 */
	protected void internalAddElement(IUiViewEditpart editpart) {
		checkDisposed();

		// set the parent
		//
		if (editpart.getParent() != null) {
			logger.warn("parent is not null for {}", editpart); //$NON-NLS-1$
		}

		if (uiViewEditparts == null) {
			internalLoadViews();
		}
		if (!uiViewEditparts.contains(editpart)) {
			uiViewEditparts.add(editpart);
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from the list of elements.
	 * 
	 * @param editpart
	 */
	protected void internalRemoveElement(IUiViewEditpart editpart) {
		checkDisposed();

		if (uiViewEditparts != null && editpart != null) {
			uiViewEditparts.remove(editpart);
		}
	}

	/**
	 * Is called to load and initialize all elements.
	 */
	protected void internalLoadViews() {
		checkDisposed();

		if (uiViewEditparts == null) {
			uiViewEditparts = new ArrayList<IUiViewEditpart>();
			for (YUiView yElement : getModel().getViews()) {
				IUiViewEditpart editPart = getEditpart(yElement);
				internalAddElement(editPart);
			}
		}
	}
}
