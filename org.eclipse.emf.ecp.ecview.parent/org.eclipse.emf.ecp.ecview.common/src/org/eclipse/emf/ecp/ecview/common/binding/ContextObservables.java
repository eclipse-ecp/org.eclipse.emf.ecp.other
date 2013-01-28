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
package org.eclipse.emf.ecp.ecview.common.binding;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Delegates the calls to the implementing services provided by OSGi-DS.
 */
public final class ContextObservables {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ContextObservables.class);
	private static ContextObservables instance = new ContextObservables();

	private final List<IContextBindingDelegate> delegates = Collections
			.synchronizedList(new ArrayList<IContextBindingDelegate>());

	private ContextObservables() {
	}

	/**
	 * Returns the instance of that manager.
	 * 
	 * @return the instance
	 */
	public static ContextObservables getInstance() {
		return instance;
	}

	/**
	 * Removes all factories. Should only be used very carefully
	 */
	public void clear() {
		delegates.clear();
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param context
	 *            the view context.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	public static IObservableValue observeValue(IViewContext context,
			URI bindingURI) {
		return ContextObservables.getInstance().doObserveValue(context,
				bindingURI);
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param realm
	 *            the realm
	 * @param context
	 *            the view context.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	public static IObservableValue observeValue(Realm realm,
			IViewContext context, URI bindingURI) {
		return ContextObservables.getInstance().doObserveValue(realm, context,
				bindingURI);
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param context
	 *            the view context.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	protected IObservableValue doObserveValue(IViewContext context,
			URI bindingURI) {
		for (IContextBindingDelegate delegate : delegates
				.toArray(new IContextBindingDelegate[delegates.size()])) {
			if (delegate.isFor(context, bindingURI)) {
				return delegate.observeValue(context, bindingURI);
			}
		}
		LOGGER.error("No proper binding delegate found for element {}",
				bindingURI);
		return null;
	}

	/**
	 * Returns an observable value tracking the value of the context described
	 * by the binding URI.
	 * 
	 * @param realm
	 *            the realm
	 * @param context
	 *            the view context.
	 * @param bindingURI
	 *            the URI that keeps the binding target information.
	 * @return an observable value tracking the value of the context described
	 *         by the binding URI
	 * @throw IllegalArgumentException if the {@link ISlot bean slot} was not
	 *        created yet.
	 */
	protected IObservableValue doObserveValue(Realm realm,
			IViewContext context, URI bindingURI) {
		for (IContextBindingDelegate delegate : delegates
				.toArray(new IContextBindingDelegate[delegates.size()])) {
			if (delegate.isFor(context, bindingURI)) {
				return delegate.observeValue(realm, context, bindingURI);
			}
		}
		LOGGER.error("No proper binding delegate found for element {}",
				bindingURI);
		return null;
	}

	/**
	 * Adds a new delegate to the manager.
	 * 
	 * @param delegate
	 *            delegate to be added
	 */
	public void addDelegate(IContextBindingDelegate delegate) {
		if (!delegates.contains(delegate)) {
			delegates.add(delegate);
		}
	}

	/**
	 * Removes the delegate from the manager.
	 * 
	 * @param delegate
	 *            delegate to be removed
	 */
	public void removeDelegate(IContextBindingDelegate delegate) {
		if (delegate == null) {
			return;
		}
		delegates.remove(delegate);
	}

	/**
	 * The OSGi component.
	 */
	public static class Component {

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context
		 *            ComponentContext
		 * @param properties
		 *            Map of properties
		 */
		public void activate(ComponentContext context,
				Map<String, Object> properties) {
			LOGGER.debug("EditPartFactoryManager activated");
		}

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context
		 *            ComponentContext
		 * @param properties
		 *            Map of properties
		 */
		public void deactivate(ComponentContext context,
				Map<String, Object> properties) {
			LOGGER.debug("EditPartFactoryManager deactivated");
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param delegate
		 *            Manager to be added.
		 */
		protected void addDelegate(IContextBindingDelegate delegate) {
			ContextObservables.getInstance().addDelegate(delegate);
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param delegate
		 *            Manager to be removed.
		 */
		protected void removeDelegate(IContextBindingDelegate delegate) {
			ContextObservables.getInstance().removeDelegate(delegate);
		}
	}
}
