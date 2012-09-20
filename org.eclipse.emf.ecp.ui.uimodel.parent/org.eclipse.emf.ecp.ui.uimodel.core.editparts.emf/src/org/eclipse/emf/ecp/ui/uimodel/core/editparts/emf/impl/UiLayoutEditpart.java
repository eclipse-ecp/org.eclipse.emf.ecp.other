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
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.ILayoutPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An implementation of {@link IUiLayoutEditpart}.
 * 
 * @param <M>
 */
public class UiLayoutEditpart<M extends YUiLayout> extends UiEmbeddableEditpart<M> implements IUiLayoutEditpart {

	private static final Logger LOGGER = LoggerFactory.getLogger(UiLayoutEditpart.class);

	private List<IUiEmbeddableEditpart> uiElementEditparts;

	/**
	 * Default constructor.
	 */
	public UiLayoutEditpart() {

	}

	@SuppressWarnings("unchecked")
	@Override
	protected M createModel() {
		return (M) UiModelFactory.eINSTANCE.createYUiLayout();
	}

	@Override
	public List<IUiEmbeddableEditpart> getElements() {
		if (uiElementEditparts == null) {
			internalLoadElements();
		}
		return Collections.unmodifiableList(uiElementEditparts);
	}

	@Override
	protected void internalDispose() {
		try {
			// lazy loading: edit parts also have to be disposed if they have not been loaded yet,
			// but exist in the model.
			if (uiElementEditparts != null || getModel().getElements().size() > 0) {
				List<IUiEmbeddableEditpart> tempElements = getElements();
				synchronized (uiElementEditparts) {
					for (IUiEmbeddableEditpart editpart : tempElements.toArray(new IUiEmbeddableEditpart[tempElements
						.size()])) {
						editpart.dispose();
					}
				}
				uiElementEditparts = null;
			}
		} finally {
			super.internalDispose();
		}
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
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) { 
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
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
		case UiModelPackage.YUI_LAYOUT__ELEMENTS:
			YUiEmbeddable yElement = (YUiEmbeddable) notification.getNewValue();

			IUiEmbeddableEditpart editPart = (IUiEmbeddableEditpart) getEditpart(yElement);
			internalAddElement(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				ILayoutPresentation<?> presenter = getPresentation();
				int index = notification.getPosition();
				if (index < 0 || index >= getElements().size() - 1) {
					presenter.add(editPart.getPresentation());
				} else {
					presenter.insert(editPart.getPresentation(), index);
				}
			}
			break;
		default:
			break;
		}
	}

	@Override
	protected void handleModelMove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case UiModelPackage.YUI_LAYOUT__ELEMENTS:
			YUiEmbeddable yElement = (YUiEmbeddable) notification.getNewValue();

			IUiEmbeddableEditpart editPart = (IUiEmbeddableEditpart) getEditpart(yElement);
			internalMoveElement(editPart, notification.getPosition());

			// handle the presentation
			//
			if (isPresentationPresent()) {
				ILayoutPresentation<?> presenter = getPresentation();
				presenter.move(editPart.getPresentation(), notification.getPosition());
			}
			break;
		default:
			break;
		}
	}

	/**
	 * Returns true, if the presenter is present.
	 * 
	 * @return
	 */
	private boolean isPresentationPresent() {
		return internalGetPresentation() != null;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void handleModelRemove(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case UiModelPackage.YUI_LAYOUT__ELEMENTS:
			YUiEmbeddable yElement = (YUiEmbeddable) notification.getOldValue();

			IUiEmbeddableEditpart editPart = (IUiEmbeddableEditpart) getEditpart(yElement);
			internalRemoveElement(editPart);

			// handle the presentation
			//
			if (isPresentationPresent()) {
				ILayoutPresentation<?> presenter = getPresentation();
				presenter.remove(editPart.getPresentation());
			}
			break;
		default:
			break;
		}
	}

	// /**
	// * {@inheritDoc}
	// */
	// protected void handleModel_Move(int featureId, Notification notification) {
	// checkDisposed();
	//
	// switch (featureId) {
	// case UiModelPackage.YUI_LAYOUT__ELEMENTS:
	// YUiEmbeddable yElement = (YUiEmbeddable) notification.getNewValue();
	// internalAddElement((IUiEmbeddableEditpart) getEditpart(yElement));
	// break;
	// }
	// }

	/**
	 * Is called to change the internal state and add the given editpart to the list of elements.
	 * 
	 * @param editpart The editpart to be added
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
	 * Is called to change the internal state and to move the given editpart in the list of elements.
	 * 
	 * @param editpart The editpart to be inserted
	 * @param index The index to move the element.
	 */
	protected void internalMoveElement(IUiEmbeddableEditpart editpart, int index) {
		checkDisposed();

		if (uiElementEditparts == null) {
			internalLoadElements();
		} else if (!uiElementEditparts.contains(editpart)) {
			throw new RuntimeException(String.format("Editpart %s is not contained in elements", editpart.getId()));
		} else {
			uiElementEditparts.remove(editpart);
			uiElementEditparts.add(index, editpart);
		}
	}

	/**
	 * Is called to change the internal state and remove the given editpart from the list of elements.
	 * 
	 * @param editpart The editpart to be removed
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
