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

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YAction;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.util.CoreModelUtil;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.common.services.IServiceRegistry;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.IBindingManager;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.IConstants;
import org.eclipse.riena.ui.ridgets.IMarkableRidget;
import org.eclipse.riena.ui.ridgets.IRidget;
import org.eclipse.swt.widgets.Control;

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

		IBindingManager bindingManager = getViewContext().getService(
				IServiceRegistry.SERVICE__BINDING_MANAGER);
		// bind visible
		bindingManager.bindVisible(yEmbeddable, ridget);
	}

	/**
	 * Creates the bindings for the given elements.
	 * 
	 * @param yEmbeddable
	 * @param field
	 */
	protected void createBindings(YAction yAction, IRidget ridget) {

		createBindings((YEmbeddable) yAction, ridget);

		IBindingManager bindingManager = getViewContext().getService(
				IServiceRegistry.SERVICE__BINDING_MANAGER);

		// bind enabled
		bindingManager.bindEnabled(yAction, ridget);
	}

	/**
	 * Creates the bindings for the given elements.
	 * 
	 * @param yEmbeddable
	 * @param field
	 */
	protected void createBindings(YField yField, IMarkableRidget ridget) {

		createBindings((YEmbeddable) yField, ridget);

		IBindingManager bindingManager = getViewContext().getService(
				IServiceRegistry.SERVICE__BINDING_MANAGER);

		// bind enabled
		bindingManager.bindEnabled(yField, ridget);

		// bind readonly
		bindingManager.bindReadonly(yField, ridget);
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
		return internalGetObservableValue((YEmbeddableBindingEndpoint) model);
	}

	/**
	 * Has to provide an instance of IObservable for the given bindableValue.
	 * 
	 * @param bindableValue
	 * @return
	 */
	protected IObservable internalGetObservableValue(
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
