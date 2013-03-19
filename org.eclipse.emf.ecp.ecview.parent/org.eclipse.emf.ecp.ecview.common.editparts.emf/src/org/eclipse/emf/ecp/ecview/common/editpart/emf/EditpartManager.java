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
package org.eclipse.emf.ecp.ecview.common.editpart.emf;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.editpart.IActionEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IContextBindableEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IEmbeddableBindableEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BindingEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.binding.BindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.common.AbstractEditpartManager;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YAction;
import org.eclipse.emf.ecp.ecview.common.model.core.YContextBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;

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
			return uriString.equals(CoreModelPackage.eNS_URI)
					|| uriString.equals(BindingPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(CoreModelPackage.eNS_URI)
					|| element.equals(BindingPackage.eNS_URI);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IElementEditpart> A createEditpart(Object selector,
			Class<A> editPartClazz) {
		ElementEditpart<YElement> result = null;
		if (editPartClazz.isAssignableFrom(IViewEditpart.class)) {
			result = createNewInstance(ViewEditpart.class);
		} else if (editPartClazz.isAssignableFrom(ILayoutEditpart.class)) {
			result = createNewInstance(LayoutEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IFieldEditpart.class)) {
			result = createNewInstance(FieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IActionEditpart.class)) {
			result = createNewInstance(ActionEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IViewSetEditpart.class)) {
			result = createNewInstance(ViewSetEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IBindingSetEditpart.class)) {
			result = createNewInstance(BindingSetEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IBindingEditpart.class)) {
			result = createNewInstance(BindingEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IContextBindableEndpointEditpart.class)) {
			result = createNewInstance(ContextBindableEndpointEditpart.class);
		} else if (editPartClazz
				.isAssignableFrom(IEmbeddableBindableEndpointEditpart.class)) {
			result = createNewInstance(EmbeddableBindableEndpointEditpart.class);
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
	 *            an instance of {@link IElementEditpart}
	 * @param yElement
	 *            the model element
	 * @return editpart
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IElementEditpart> A createEditpart(Object yElement) {
		// asserts that no editpart was created already for the given element
		assertOneEditpartForModelelement(yElement);

		ElementEditpart<YElement> result = null;
		if (yElement instanceof YView) {
			result = createNewInstance(ViewEditpart.class);
		} else if (yElement instanceof YLayout) {
			result = createNewInstance(LayoutEditpart.class);
		} else if (yElement instanceof YField) {
			result = createNewInstance(FieldEditpart.class);
		} else if (yElement instanceof YAction) {
			result = createNewInstance(ActionEditpart.class);
		} else if (yElement instanceof YViewSet) {
			result = createNewInstance(ViewSetEditpart.class);
		} else if (yElement instanceof YBindingSet) {
			result = createNewInstance(BindingSetEditpart.class);
		} else if (yElement instanceof YBinding) {
			result = createNewInstance(BindingEditpart.class);
		} else if (yElement instanceof YContextBindingEndpoint) {
			result = createNewInstance(ContextBindableEndpointEditpart.class);
		} else if (yElement instanceof YEmbeddableBindingEndpoint) {
			result = createNewInstance(EmbeddableBindableEndpointEditpart.class);
		}

		if (result != null) {
			result.initialize((YElement) yElement);
		}

		return (A) result;
	}

	/**
	 * Returns a new instance of the type.
	 * 
	 * @param type
	 *            The type of the edit part to be created
	 * @return editpart
	 * @throws InstantiationException
	 *             e
	 * @throws IllegalAccessException
	 *             e
	 */
	protected IElementEditpart newInstance(
			Class<? extends IElementEditpart> type)
			throws InstantiationException, IllegalAccessException {
		return type.newInstance();
	}

}
