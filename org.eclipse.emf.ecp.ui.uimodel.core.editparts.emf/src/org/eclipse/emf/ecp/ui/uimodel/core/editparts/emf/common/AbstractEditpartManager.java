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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.common;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpartProvider;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.UiElementEditpart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract base implementation of {@link IEditPartManager}.
 */
public abstract class AbstractEditpartManager implements IEditPartManager {
	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractEditpartManager.class);

	/**
	 * Returns the edit part for the given model yElement.
	 * 
	 * @param <A> an instance of IUiElementEditpart
	 * @param yElement the model element
	 * @return editpart
	 */
	@SuppressWarnings("unchecked")
	public static <A extends IUiElementEditpart> A findEditPartFor(YUiElement yElement) {
		if (yElement == null) {
			return null;
		}

		IUiElementEditpartProvider editPartProvider = null;
		for (Adapter adapter : ((EObject) yElement).eAdapters()) {
			if (adapter instanceof IUiElementEditpartProvider) {
				editPartProvider = (IUiElementEditpartProvider) adapter;
				break;
			}
		}

		return editPartProvider != null ? (A) editPartProvider.getEditpart() : null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @param yElement
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <A extends IUiElementEditpart> A getEditpart(Object yElement) {
		IUiElementEditpart editPart = findEditpart(yElement);
		return (A) (editPart != null ? editPart : createEditpart(yElement));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @param yElement
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <A extends IUiElementEditpart> A findEditpart(Object yElement) {
		return (A) findEditPartFor((YUiElement) yElement);
	}

	/**
	 * Creates a new instance of the edit part.
	 * 
	 * @param <A> an instance of IUiElementEditpart
	 * @param yElement the model element
	 * @return editpart
	 */
	protected abstract <A extends IUiElementEditpart> A createEditpart(Object yElement);

	/**
	 * Creates a new instance of the required edit part.
	 * 
	 * @param <A> An instance of {@link IUiElementEditpart}
	 * @param type the type of the editpart to be returned
	 * @return editpart
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IUiElementEditpart> A createNewInstance(Class<? extends IUiElementEditpart> type) {
		A result = null;
		UiElementEditpart<YUiElement> editPart = null;
		try {
			editPart = (UiElementEditpart<YUiElement>) newInstance(type);
		} catch (InstantiationException e) {
			LOGGER.error("{}", e);
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			LOGGER.error("{}", e);
			throw new RuntimeException(e);
		}
		result = (A) editPart;
		return result;
	}

	/**
	 * Returns a new instance of the type.
	 * 
	 * @param type the type of the editpart to be created
	 * @return editpart
	 * 
	 * @throws InstantiationException exception
	 * @throws IllegalAccessException exception
	 */
	protected abstract IUiElementEditpart newInstance(Class<? extends IUiElementEditpart> type)
		throws InstantiationException, IllegalAccessException;

	/**
	 * Asserts that only one IUiElementEditpartProvider exists for the given element.
	 * 
	 * @param element the model element
	 */
	protected void assertOneEditpartForModelelement(Object element) {
		YUiElement yElement = (YUiElement) element;
		for (Adapter adapter : yElement.eAdapters()) {
			if (adapter instanceof IUiElementEditpartProvider) {
				LOGGER.error("For a modelelement instance only one editpart can be created!");
				throw new RuntimeException("For a modelelement instance only one editpart can be created!");
			}
		}
	}
}