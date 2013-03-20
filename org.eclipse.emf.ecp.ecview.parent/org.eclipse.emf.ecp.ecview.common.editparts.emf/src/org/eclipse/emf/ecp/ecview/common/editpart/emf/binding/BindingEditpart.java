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
package org.eclipse.emf.ecp.ecview.common.editpart.emf.binding;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.binding.IBindingManager;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindableEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link IBindingSetEditpart}.
 * 
 * @param <M>
 */
public class BindingEditpart extends ElementEditpart<YBinding> implements
		IBindingEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(BindingEditpart.class);
	private IBindableEndpointEditpart targetValue;
	private IBindableEndpointEditpart modelValue;
	private boolean bound;
	private Binding binding;

	/**
	 * A default constructor.
	 */
	public BindingEditpart() {
	}

	@Override
	protected YBinding createModel() {
		checkDisposed();

		return BindingFactory.eINSTANCE.createYBinding();
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case BindingPackage.YBINDING__TARGET_VALUE:
			YBindingEndpoint YBindingEndpoint = (YBindingEndpoint) notification
					.getNewValue();

			IBindableEndpointEditpart editPart = (IBindableEndpointEditpart) getEditpart(YBindingEndpoint);
			internalSetTargetValue(editPart);
			break;
		case BindingPackage.YBINDING__MODEL_VALUE:
			YBindingEndpoint = (YBindingEndpoint) notification.getNewValue();

			editPart = (IBindableEndpointEditpart) getEditpart(YBindingEndpoint);
			internalSetModelValue(editPart);
			break;
		default:
			break;
		}
	}

	public void setTargetEndpoint(IBindableEndpointEditpart target) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			YBinding yBinding = getModel();
			YBindingEndpoint yElement = target != null ? (YBindingEndpoint) target
					.getModel() : null;
			yBinding.setTargetValue(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public IBindableEndpointEditpart getTargetEndpoint() {
		checkDisposed();

		if (targetValue == null) {
			loadTargetValue();
		}
		return targetValue;
	}

	/**
	 * Loads the content of the view.
	 */
	protected void loadTargetValue() {
		if (targetValue == null) {
			YBindingEndpoint yValue = getModel().getTargetValue();
			internalSetTargetValue((IBindableEndpointEditpart) getEditpart(yValue));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param targetValue
	 *            The content to be set
	 */
	protected void internalSetTargetValue(IBindableEndpointEditpart targetValue) {
		this.targetValue = targetValue;
	}

	public void setModelEndpoint(IBindableEndpointEditpart model) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			YBinding yBinding = getModel();
			YBindingEndpoint yElement = model != null ? (YBindingEndpoint) model
					.getModel() : null;
			yBinding.setModelValue(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public IBindableEndpointEditpart getModelEndpoint() {
		checkDisposed();

		if (modelValue == null) {
			loadModelValue();
		}
		return modelValue;
	}

	/**
	 * Loads the content of the view.
	 */
	protected void loadModelValue() {
		if (modelValue == null) {
			YBindingEndpoint yValue = getModel().getModelValue();
			internalSetModelValue((IBindableEndpointEditpart) getEditpart(yValue));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param modelValue
	 *            The content to be set
	 */
	protected void internalSetModelValue(IBindableEndpointEditpart modelValue) {
		this.modelValue = modelValue;
	}

	@Override
	public boolean isBound() {
		checkDisposed();

		return bound;
	}

	@Override
	public void bind() {
		checkDisposed();

		if (bound) {
			return;
		}

		try {
			IBindingManager bindingManager = getBindindSet()
					.getBindingManager();
			if (bindingManager != null) {
				IObservableValue target = getTargetEndpoint().getObservable();
				IObservableValue model = getModelEndpoint().getObservable();
				if (target == null) {
					LOGGER.error("TargetValue must never be null! {}",
							getTargetEndpoint());
					return;
				}

				if (model == null) {
					LOGGER.error("ModelValue must never be null! {}",
							getModelEndpoint());
					return;
				}

				binding = bindingManager.bind(target, model);
			} else {
				LOGGER.error("BindingManager is null!. No bindings processed!");
			}
		} finally {
			bound = true;
		}
	}

	/**
	 * Returns the binding set this binding belongs to.
	 * 
	 * @return
	 */
	protected IBindingSetEditpart getBindindSet() {
		if (getModel().getBindingSet() == null) {
			throw new RuntimeException("bindingSet must not be null!");
		}
		return DelegatingEditPartManager.getInstance().findEditpart(
				getModel().getBindingSet());
	}

	@Override
	public void unbind() {
		checkDisposed();

		if (!bound) {
			return;
		}

		try {
			if (binding != null) {
				binding.dispose();
				binding = null;
			}
		} finally {
			bound = false;
		}
	}

	@Override
	protected void internalDispose() {
		try {
			if (binding != null) {
				binding.dispose();
				binding = null;
			}
		} finally {
			super.internalDispose();
		}
	}
}
