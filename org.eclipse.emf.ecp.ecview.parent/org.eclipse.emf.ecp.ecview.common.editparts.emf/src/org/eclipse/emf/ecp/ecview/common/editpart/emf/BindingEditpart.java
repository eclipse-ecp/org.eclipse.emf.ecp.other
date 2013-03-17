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

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.IBindableValueEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IBindingEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindableValue;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
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
	private boolean active;
	private List<IBindingEditpart> bindings;
	private IBindableValueEditpart targetValue;
	private IBindableValueEditpart modelValue;
	private boolean bound;

	/**
	 * A default constructor.
	 */
	protected BindingEditpart() {
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
			YBindableValue yBindableValue = (YBindableValue) notification.getNewValue();

			IBindableValueEditpart editPart = (IBindableValueEditpart) getEditpart(yBindableValue);
			internalSetTargetValue(editPart);
			break;
		case BindingPackage.YBINDING__MODEL_VALUE:
			yBindableValue = (YBindableValue) notification.getNewValue();

			editPart = (IBindableValueEditpart) getEditpart(yBindableValue);
			internalSetModelValue(editPart);
			break;
		default:
			break;
		}
	}

	public void setTargetValue(IBindableValueEditpart target) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			YBinding yBinding = getModel();
			YBindableValue yElement = target != null ? (YBindableValue) target
					.getModel() : null;
			yBinding.setTargetValue(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public IBindableValueEditpart getTargetValue() {
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
			YBindableValue yValue = getModel().getTargetValue();
			internalSetTargetValue((IBindableValueEditpart) getEditpart(yValue));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param targetValue
	 *            The content to be set
	 */
	protected void internalSetTargetValue(IBindableValueEditpart targetValue) {
		this.targetValue = targetValue;
	}

	public void setModelValue(IBindableValueEditpart model) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			YBinding yBinding = getModel();
			YBindableValue yElement = model != null ? (YBindableValue) model
					.getModel() : null;
			yBinding.setModelValue(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public IBindableValueEditpart getModelValue() {
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
			YBindableValue yValue = getModel().getModelValue();
			internalSetModelValue((IBindableValueEditpart) getEditpart(yValue));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param modelValue
	 *            The content to be set
	 */
	protected void internalSetModelValue(IBindableValueEditpart modelValue) {
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

		} finally {
			bound = true;
		}
	}

	@Override
	public void unbind() {
		checkDisposed();

		if (!bound) {
			return;
		}

		try {

		} finally {
			bound = false;
		}
	}

	@Override
	protected void internalDispose() {
		try {
		} finally {
			super.internalDispose();
		}
	}
}
