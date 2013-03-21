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
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YAction;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.util.CoreModelUtil;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ISWTBindingManager;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.IConstants;
import org.eclipse.riena.ui.ridgets.IMarkableRidget;
import org.eclipse.riena.ui.ridgets.IRidget;
import org.eclipse.swt.widgets.Control;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An abstract implementation of the {@link IWidgetPresentation}.
 */
@SuppressWarnings("restriction")
public abstract class AbstractSWTWidgetPresenter extends AbstractDisposable
		implements IWidgetPresentation<Control> {

	/**
	 * See {@link IConstants#CSS_CLASS__CONTROL_BASE}.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public static final String CSS_CLASS__CONTROL_BASE = IConstants.CSS_CLASS__CONTROL_BASE;
	// END SUPRESS CATCH EXCEPTION

	/**
	 * See {@link IConstants#CSS_CLASS__CONTROL}.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public static final String CSS_CLASS__CONTROL = IConstants.CSS_CLASS__CONTROL;
	// END SUPRESS CATCH EXCEPTION

	/**
	 * See {@link IConstants#CSS_CLASS__LABEL}.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public static final String CSS_CLASS__LABEL = IConstants.CSS_CLASS__LABEL;
	// END SUPRESS CATCH EXCEPTION

	private static final Logger logger = LoggerFactory
			.getLogger(AbstractSWTWidgetPresenter.class);

	private final IEmbeddableEditpart editpart;

	private final Lock lock = new ReentrantLock();

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            the editpart
	 */
	public AbstractSWTWidgetPresenter(IEmbeddableEditpart editpart) {
		this.editpart = editpart;
	}

	/**
	 * Returns the editpart the presenter will render for.
	 * 
	 * @return the editpart
	 */
	protected IEmbeddableEditpart getEditpart() {
		return editpart;
	}

	/**
	 * Returns the binding manager.
	 * 
	 * @return
	 */
	protected ISWTBindingManager getBindingManager() {
		return getViewContext().getService(
				org.eclipse.emf.ecp.ecview.common.binding.IECViewBindingManager.class
						.getName());
	}

	@Override
	public Object getModel() {
		return getEditpart().getModel();
	}

	/**
	 * Returns the view context.
	 * 
	 * @return viewContext
	 */
	public IViewContext getViewContext() {
		return getEditpart().getView().getContext();
	}

	/**
	 * Sets the CSS id at the control.
	 * 
	 * @param control
	 *            The control
	 * @param id
	 *            The CSS id
	 */
	protected void setCSSId(Control control, String id) {
		WidgetElement.setID(control, id);
	}

	/**
	 * Sets the CSS class at the control.
	 * 
	 * @param control
	 *            The control
	 * @param clazz
	 *            The CSS id
	 */
	protected void setCSSClass(Control control, String clazz) {
		WidgetElement.setCSSClass(control, clazz);
	}

	/**
	 * Creates the bindings for the given elements.
	 * 
	 * @param yEmbeddable
	 * @param field
	 */
	protected void createBindings(YEmbeddable yEmbeddable, IRidget ridget) {

		// initialize the transient values
		//
		CoreModelUtil.initTransientValues(yEmbeddable);

		ISWTBindingManager bindingManager = getBindingManager();
		if (bindingManager != null) {
			// bind visible
			bindingManager.bindVisible(yEmbeddable, ridget);
		}
	}

	/**
	 * Creates the bindings for the given elements.
	 * 
	 * @param yEmbeddable
	 * @param field
	 */
	protected void createBindings(YAction yAction, IRidget ridget) {

		createBindings((YEmbeddable) yAction, ridget);

		ISWTBindingManager bindingManager = getBindingManager();
		if (bindingManager != null) {
			// bind enabled
			bindingManager.bindEnabled(yAction, ridget);
		}
	}

	/**
	 * Creates the bindings for the given elements.
	 * 
	 * @param yEmbeddable
	 * @param field
	 */
	protected void createBindings(YField yField, IMarkableRidget ridget) {

		createBindings((YEmbeddable) yField, ridget);

		ISWTBindingManager bindingManager = getBindingManager();
		if (bindingManager != null) {
			// bind enabled
			bindingManager.bindEnabled(yField, ridget);
			// bind readonly
			bindingManager.bindReadonly(yField, ridget);
		}
	}

	/**
	 * Creates the model binding from ridget to ECView-model.
	 * 
	 * @param model
	 * @param modelFeature
	 * @param uiRidget
	 * @param uiProperty
	 * @return binding
	 * @return
	 */
	protected Object createModelBinding(EObject model,
			EStructuralFeature modelFeature, IRidget uiRidget, String uiProperty) {
		return createModelBinding(model, modelFeature, uiRidget, uiProperty,
				null, null);
	}

	/**
	 * Creates the model binding from ridget to ECView-model.
	 * 
	 * @param model
	 * @param modelFeature
	 * @param uiRidget
	 * @param uiProperty
	 * @return binding
	 */
	protected Binding createModelBinding(EObject model,
			EStructuralFeature modelFeature, IRidget uiRidget,
			String uiProperty, UpdateValueStrategy targetToModel,
			UpdateValueStrategy modelToTarget) {
		ISWTBindingManager bindingManager = getBindingManager();
		if (bindingManager != null) {
			// bind the value of yText to textRidget
			IObservableValue modelObservable = EMFObservables.observeValue(
					model, modelFeature);
			IObservableValue uiObservable = BeansObservables.observeValue(
					uiRidget, uiProperty);
			return getBindingManager().bindValue(uiObservable, modelObservable,
					targetToModel, modelToTarget);
		} else {
			logger.error("No bindingmanager available");
		}
		return null;
	}

	/**
	 * Casts element to eObject.
	 * 
	 * @param element
	 * @return
	 */
	protected EObject castEObject(Object element) {
		return CoreModelUtil.castEObject(element);
	}

	/**
	 * Returns the lock object that should be used to aquire locks.
	 * 
	 * @return the lock
	 */
	protected Lock getLock() {
		return lock;
	}

	@Override
	public IObservable getObservableValue(Object model) {
		return internalGetObservableEndpoint((YEmbeddableBindingEndpoint) model);
	}

	/**
	 * Has to provide an instance of IObservable for the given bindableValue.
	 * 
	 * @param bindableValue
	 * @return
	 */
	protected IObservable internalGetObservableEndpoint(
			YEmbeddableBindingEndpoint bindableValue) {
		throw new UnsupportedOperationException("Must be overridden!");
	}

	/**
	 * Runs the runnable in the global lock of that instance.
	 * 
	 * @param runnable
	 */
	protected void runLocked(Runnable runnable) {
		lock.lock();
		try {
			runnable.run();
		} finally {
			lock.unlock();
		}
	}

}
