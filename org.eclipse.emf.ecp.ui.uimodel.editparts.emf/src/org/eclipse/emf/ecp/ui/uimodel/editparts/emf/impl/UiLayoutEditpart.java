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
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiLayoutEditpart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UiLayoutEditpart<M extends YUiLayout> extends UiEmbeddableEditpart<M> implements IUiLayoutEditpart {

	private static final Logger logger = LoggerFactory.getLogger(UiLayoutEditpart.class);

	private List<IUiEmbeddableEditpart> uiElementEditparts;

	protected UiLayoutEditpart() {

	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		return (M) UiModelFactory.eINSTANCE.createYUiLayout();
	}

	@Override
	public List<IUiEmbeddableEditpart> getElements() {
		if(uiElementEditparts == null){
			internalLoadElements();
		}
		
		return (uiElementEditparts != null ? Collections.unmodifiableList(uiElementEditparts) : Collections
			.<IUiEmbeddableEditpart> emptyList());
	}

	@Override
	protected void internalDispose() {
		if (uiElementEditparts != null) {
			for (IUiEmbeddableEditpart editpart : uiElementEditparts) {
				editpart.dispose();
			}
			uiElementEditparts = null;
		}

		super.internalDispose();
	}

	@Override
	public void addElement(IUiEmbeddableEditpart element) {
		try {
			checkDisposed();

			// add the element by using the model
			//
			M yLayout = getModel();
			YUiEmbeddable yElement = (YUiEmbeddable) element.getModel();
			yLayout.getElements().add(yElement);
		} catch (RuntimeException e) {
			logger.error("{}", e);
			throw e;
		}
	}

	@Override
	public void removeElement(IUiEmbeddableEditpart element) {
		try {
			checkDisposed();

			// remove the element by using the model
			//
			M yLayout = getModel();
			YUiEmbeddable yElement = (YUiEmbeddable) element.getModel();
			yLayout.getElements().remove(yElement);
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
		case UiModelPackage.YUI_LAYOUT__ELEMENTS:
			YUiEmbeddable yElement = (YUiEmbeddable) notification.getNewValue();
			internalAddElement((IUiEmbeddableEditpart) getEditpart(yElement));
			break;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModel_Remove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case UiModelPackage.YUI_LAYOUT__ELEMENTS:
			YUiEmbeddable yElement = (YUiEmbeddable) notification.getOldValue();
			internalRemoveElement((IUiEmbeddableEditpart) getEditpart(yElement));
			break;
		}
	}

	/**
	 * Is called to change the internal state and add the given editpart to the list of elements.
	 * 
	 * @param editpart
	 */
	protected void internalAddElement(IUiEmbeddableEditpart editpart) {
		checkDisposed();

		if (uiElementEditparts == null) {
			internalLoadElements();
		}
		if (!uiElementEditparts.contains(editpart)) {
			uiElementEditparts.add(editpart);
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from the list of elements.
	 * 
	 * @param editpart
	 */
	protected void internalRemoveElement(IUiEmbeddableEditpart editpart) {
		checkDisposed();

		if (uiElementEditparts != null && editpart != null) {
			uiElementEditparts.remove(editpart);
		}
	}

	/**
	 * Is called to load and initialize all elements.
	 */
	protected void internalLoadElements() {
		checkDisposed();

		if (uiElementEditparts == null) {
			uiElementEditparts = new ArrayList<IUiEmbeddableEditpart>();
			for (YUiEmbeddable yElement : getModel().getElements()) {
				IUiEmbeddableEditpart editPart = getEditpart(yElement);
				internalAddElement(editPart);
			}
		}
	}
}
