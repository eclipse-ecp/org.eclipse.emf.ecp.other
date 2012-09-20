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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewSetContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An implementation of {@link IUiViewEditpart}.
 * 
 * @param <M>
 */
public class UiViewSetEditpart<M extends YUiViewSet> extends UiElementEditpart<M> implements IUiViewSetEditpart {

	private static final Logger LOGGER = LoggerFactory.getLogger(UiViewSetEditpart.class);

	private List<IUiViewEditpart> uiViewEditparts;

	private IViewSetContext context;

	/**
	 * The default constructor.
	 */
	protected UiViewSetEditpart() {

	}

	@Override
	public IViewSetContext getContext() {
		return context;
	}

	@Override
	public void setContext(IViewSetContext context) {
		if (this.context == context) {
			return;
		}

		if (this.context != null) {
			throw new RuntimeException("Changing context not allowed!");
		}
		this.context = context;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		M model = (M) UiModelFactory.eINSTANCE.createYUiViewSet();
		return model;
	}

	@Override
	public List<IUiViewEditpart> getViews() {
		if (uiViewEditparts == null) {
			internalLoadViews();
		}

		return Collections.unmodifiableList(uiViewEditparts);
	}

	@Override
	protected void internalDispose() {
		try {
			// lazy loading: view parts also have to be disposed if they have not been loaded yet,
			// but exist in the model.
			if (uiViewEditparts != null || getModel().getViews().size() > 0) {
				List<IUiViewEditpart> tempViews = getViews();
				synchronized (uiViewEditparts) {
					for (IUiViewEditpart editpart : tempViews.toArray(new IUiViewEditpart[tempViews.size()])) {
						editpart.dispose();
					}
				}
				uiViewEditparts = null;
			}
		} finally {
			super.internalDispose();
		}
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
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
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
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelAdd(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case UiModelPackage.YUI_VIEW_SET__VIEWS:
			YUiView yElement = (YUiView) notification.getNewValue();
			internalAddElement((IUiViewEditpart) getEditpart(yElement));
			break;
		default:
			break;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case UiModelPackage.YUI_VIEW_SET__VIEWS:
			YUiView yElement = (YUiView) notification.getOldValue();
			internalRemoveElement((IUiViewEditpart) getEditpart(yElement));
			break;
		default:
			break;
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the list of elements.
	 * 
	 * @param editpart The editpart to be added
	 */
	protected void internalAddElement(IUiViewEditpart editpart) {
		checkDisposed();

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
	 * @param editpart The editpart to be removed
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
