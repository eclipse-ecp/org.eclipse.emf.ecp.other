/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
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
import org.eclipse.emf.ecp.ecview.common.binding.IECViewBindingManager;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindableValueEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IValueBindingEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingUpdateStrategy;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.databinding.emf.common.ECViewUpdateValueStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of {@link IBindingSetEditpart}.
 * 
 * @param <M>
 */
public class ValueBindingEditpart extends ElementEditpart<YValueBinding>
		implements IValueBindingEditpart {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ValueBindingEditpart.class);
	private IBindableValueEndpointEditpart targetValue;
	private IBindableValueEndpointEditpart modelValue;
	private boolean bound;
	private Binding binding;

	/**
	 * A default constructor.
	 */
	public ValueBindingEditpart() {
	}

	@Override
	protected YValueBinding createModel() {
		checkDisposed();

		return BindingFactory.eINSTANCE.createYValueBinding();
	}

	@Override
	protected void handleModelSet(int featureId, Notification notification) {
		checkDisposed();

		switch (featureId) {
		case BindingPackage.YVALUE_BINDING__TARGET_ENDPOINT:
			YBindingEndpoint YBindingEndpoint = (YBindingEndpoint) notification
					.getNewValue();

			IBindableValueEndpointEditpart editPart = (IBindableValueEndpointEditpart) getEditpart(YBindingEndpoint);
			internalSetTargetValue(editPart);
			break;
		case BindingPackage.YVALUE_BINDING__MODEL_ENDPOINT:
			YBindingEndpoint = (YBindingEndpoint) notification.getNewValue();

			editPart = (IBindableValueEndpointEditpart) getEditpart(YBindingEndpoint);
			internalSetModelValue(editPart);
			break;
		default:
			break;
		}
	}

	public void setTargetEndpoint(IBindableValueEndpointEditpart target) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			YValueBinding yBinding = getModel();
			YValueBindingEndpoint yElement = target != null ? (YValueBindingEndpoint) target
					.getModel() : null;
			yBinding.setTargetEndpoint(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public IBindableValueEndpointEditpart getTargetEndpoint() {
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
			YBindingEndpoint yValue = getModel().getTargetEndpoint();
			internalSetTargetValue((IBindableValueEndpointEditpart) getEditpart(yValue));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param targetValue
	 *            The content to be set
	 */
	protected void internalSetTargetValue(
			IBindableValueEndpointEditpart targetValue) {
		this.targetValue = targetValue;
	}

	public void setModelEndpoint(IBindableValueEndpointEditpart model) {
		try {
			checkDisposed();

			// set the element by using the model
			//
			YValueBinding yBinding = getModel();
			YValueBindingEndpoint yElement = model != null ? (YValueBindingEndpoint) model
					.getModel() : null;
			yBinding.setModelEndpoint(yElement);
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (RuntimeException e) {
			// END SUPRESS CATCH EXCEPTION
			LOGGER.error("{}", e);
			throw e;
		}
	}

	public IBindableValueEndpointEditpart getModelEndpoint() {
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
			YBindingEndpoint yValue = getModel().getModelEndpoint();
			internalSetModelValue((IBindableValueEndpointEditpart) getEditpart(yValue));
		}
	}

	/**
	 * May be invoked by a model change and the content of the edit part should
	 * be set.
	 * 
	 * @param modelValue
	 *            The content to be set
	 */
	protected void internalSetModelValue(
			IBindableValueEndpointEditpart modelValue) {
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
			IECViewBindingManager bindingManager = getBindindSet()
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

				ECViewUpdateValueStrategy modelToTargetStrategy = getValueUpdateStrategy(getModel()
						.getModelToTargetStrategy());
				ECViewUpdateValueStrategy targetToModelStrategy = getValueUpdateStrategy(getModel()
						.getTargetToModelStrategy());
				binding = bindingManager.bindValue(target, model,
						targetToModelStrategy, modelToTargetStrategy);
				binding.updateTargetToModel();

				// getTargetEndpoint().setRefreshProvider(
				// new IBindableEndpointEditpart.RefreshProvider() {
				// @Override
				// public void refresh() {
				// binding.updateTargetToModel();
				// }
				// });
				//
				// getModelEndpoint().setRefreshProvider(
				// new IBindableEndpointEditpart.RefreshProvider() {
				// @Override
				// public void refresh() {
				// binding.updateModelToTarget();
				// }
				// });

			} else {
				LOGGER.error("BindingManager is null!. No bindings processed!");
			}
		} finally {
			bound = true;
		}
	}

	private ECViewUpdateValueStrategy getValueUpdateStrategy(
			YBindingUpdateStrategy strategy) {
		ECViewUpdateValueStrategy result = null;
		switch (strategy) {
		case UPDATE:
			result = new ECViewUpdateValueStrategy(
					ECViewUpdateValueStrategy.POLICY_UPDATE);
			break;
		case NEVER:
			result = new ECViewUpdateValueStrategy(
					ECViewUpdateValueStrategy.POLICY_NEVER);
			break;
		case ON_REQUEST:
			result = new ECViewUpdateValueStrategy(
					ECViewUpdateValueStrategy.POLICY_ON_REQUEST);
			break;
		default:
			result = new ECViewUpdateValueStrategy(
					ECViewUpdateValueStrategy.POLICY_UPDATE);
		}
		return result;
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
			if (modelValue != null) {
				modelValue.dispose();
				modelValue = null;
			}
			if (targetValue != null) {
				targetValue.dispose();
				targetValue = null;
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
			if (modelValue != null) {
				modelValue.dispose();
				modelValue = null;
			}
			if (targetValue != null) {
				targetValue.dispose();
				targetValue = null;
			}
		} finally {
			super.internalDispose();
		}
	}

	@Override
	public Binding getBinding() {
		return binding;
	}
}
