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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.common.AbstractEditpartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.UiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiGridLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiTextFieldEditpart;

/**
 * An implementation of IEditPartManager for eObjects with nsURI=http://eclipse.org/emf/emfclient/uimodel.
 */
public class EditpartManager extends AbstractEditpartManager {

	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage().getNsURI();
			return uriString.equals(UimodelExtensionPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(UimodelExtensionPackage.eNS_URI);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IUiElementEditpart> A createEditpart(Object selector, Class<A> editPartClazz) {
		UiElementEditpart<YUiElement> result = null;
		if (editPartClazz.isAssignableFrom(IUiTextFieldEditpart.class)) {
			result = createNewInstance(UiTextFieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IUiGridLayoutEditpart.class)) {
			result = createNewInstance(UiGridLayoutEditpart.class);
		}

		if (result != null) {
			result.initialize();
		}

		return (A) result;
	}

	/**
	 * Creates a new instance of the edit part.
	 * 
	 * @param <A> an instance of {@link IUiElementEditpart}
	 * @param yElement the model element
	 * @return editpart
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IUiElementEditpart> A createEditpart(Object yElement) {
		// asserts that no editpart was created already for the given element
		assertOneEditpartForModelelement(yElement);

		UiElementEditpart<YUiElement> result = null;
		if (yElement instanceof YUiTextField) {
			result = createNewInstance(UiTextFieldEditpart.class);
		} else if (yElement instanceof YUiGridLayout) {
			result = createNewInstance(UiGridLayoutEditpart.class);
		}

		if (result != null) {
			result.initialize((YUiElement) yElement);
		}

		return (A) result;
	}

	/**
	 * Returns a new instance of the type.
	 * 
	 * @param type The type of the editpart for which an instance should be created.
	 * @return editPart
	 * @throws InstantiationException e
	 * @throws IllegalAccessException e
	 */
	protected IUiElementEditpart newInstance(Class<? extends IUiElementEditpart> type) throws InstantiationException,
		IllegalAccessException {
		return type.newInstance();
	}
}
