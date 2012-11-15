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
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiDecimalField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiNumericField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextArea;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.common.AbstractEditpartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.UiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiCheckboxEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiDecimalFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiGridLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiLabelEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiNumericFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiTableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiTextAreaEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiTextFieldEditpart;

/**
 * An implementation of IEditPartManager for eObjects with
 * nsURI=http://eclipse.org/emf/emfclient/uimodel.
 */
public class EditpartManager extends AbstractEditpartManager {

	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage()
					.getNsURI();
			return uriString.equals(UimodelExtensionPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(UimodelExtensionPackage.eNS_URI);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IUiElementEditpart> A createEditpart(Object selector,
			Class<A> editPartClazz) {
		UiElementEditpart<YUiElement> result = null;
		if (editPartClazz.isAssignableFrom(IUiTextFieldEditpart.class)) {
			result = createNewInstance(UiTextFieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IUiGridLayoutEditpart.class)) {
			result = createNewInstance(UiGridLayoutEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IUiTableEditpart.class)) {
			result = createNewInstance(UiTableEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IUiLabelEditpart.class)) {
			result = createNewInstance(UiLabelEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IUiTextAreaEditpart.class)) {
			result = createNewInstance(UiTextAreaEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IUiCheckboxEditpart.class)) {
			result = createNewInstance(UiCheckBoxEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IUiNumericFieldEditpart.class)) {
			result = createNewInstance(UiNumericFieldEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IUiDecimalFieldEditpart.class)) {
			result = createNewInstance(UiDecimalFieldEditpart.class);
		}

		if (result != null) {
			result.initialize();
		}

		return (A) result;
	}

	/**
	 * Creates a new instance of the edit part.
	 * 
	 * @param <A>
	 *            an instance of {@link IUiElementEditpart}
	 * @param yElement
	 *            the model element
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
		} else if (yElement instanceof YUiTable) {
			result = createNewInstance(UiTableEditpart.class);
		} else if (yElement instanceof YUiLabel) {
			result = createNewInstance(UiLabelEditpart.class);
		} else if (yElement instanceof YUiTextArea) {
			result = createNewInstance(UiTextAreaEditpart.class);
		} else if (yElement instanceof YUiCheckBox) {
			result = createNewInstance(UiCheckBoxEditpart.class);
		} else if (yElement instanceof YUiNumericField) {
			result = createNewInstance(UiNumericFieldEditpart.class);
		} else if (yElement instanceof YUiDecimalField) {
			result = createNewInstance(UiDecimalFieldEditpart.class);
		}

		if (result != null) {
			result.initialize((YUiElement) yElement);
		}

		return (A) result;
	}

	/**
	 * Returns a new instance of the type.
	 * 
	 * @param type
	 *            The type of the editpart for which an instance should be
	 *            created.
	 * @return editPart
	 * @throws InstantiationException
	 *             e
	 * @throws IllegalAccessException
	 *             e
	 */
	protected IUiElementEditpart newInstance(
			Class<? extends IUiElementEditpart> type)
			throws InstantiationException, IllegalAccessException {
		return type.newInstance();
	}
}
