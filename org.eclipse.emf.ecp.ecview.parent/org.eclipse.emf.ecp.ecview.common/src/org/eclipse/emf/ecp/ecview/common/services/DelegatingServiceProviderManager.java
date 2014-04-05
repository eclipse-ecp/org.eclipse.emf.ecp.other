/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecp.ecview.common.context.IContext;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.context.IViewSetContext;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Delegates the calls to the implementing services provided by OSGi-DS.
 */
public final class DelegatingServiceProviderManager implements IServiceProvider {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(DelegatingServiceProviderManager.class);
	private static DelegatingServiceProviderManager instance = new DelegatingServiceProviderManager();

	private final List<IServiceProvider> viewDelegates = Collections
			.synchronizedList(new ArrayList<IServiceProvider>());
	private final List<IServiceProvider> viewSetDelegates = Collections
			.synchronizedList(new ArrayList<IServiceProvider>());

	private DelegatingServiceProviderManager() {
	}

	/**
	 * Returns the instance of that manager.
	 * 
	 * @return the instance
	 */
	public static DelegatingServiceProviderManager getInstance() {
		return instance;
	}

	/**
	 * Removes all factories. Should only be used very carefully
	 */
	public void clear() {
		viewDelegates.clear();
		viewSetDelegates.clear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(String selector, IContext context) {
		if (context instanceof IViewContext) {
			for (IServiceProvider factory : viewDelegates
					.toArray(new IServiceProvider[viewDelegates.size()])) {
				if (factory.isFor(selector, context)) {
					return true;
				}
			}
		} else if (context instanceof IViewSetContext) {
			for (IServiceProvider factory : viewSetDelegates
					.toArray(new IServiceProvider[viewSetDelegates.size()])) {
				if (factory.isFor(selector, context)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public <A extends Object> A createService(String selector, IContext context) {
		if (context instanceof IViewContext) {
			for (IServiceProvider factory : viewDelegates
					.toArray(new IServiceProvider[viewDelegates.size()])) {
				if (factory.isFor(selector, context)) {
					return factory.createService(selector, context);
				}
			}
		} else if (context instanceof IViewSetContext) {
			for (IServiceProvider factory : viewSetDelegates
					.toArray(new IServiceProvider[viewSetDelegates.size()])) {
				if (factory.isFor(selector, context)) {
					return factory.createService(selector, context);
				}
			}
		}
		LOGGER.error("No proper serviceProvider found for element {}", selector);
		return null;
	}

	/**
	 * Adds a new delegate to the manager.
	 * 
	 * @param delegate
	 *            delegate to be added
	 * @param properties
	 */
	public void addDelegate(IServiceProvider delegate,
			Map<String, Object> properties) {

		if (properties == null
				|| !properties.containsKey(IServiceProvider.OSGI_PROPERTY)
				|| properties.get(IServiceProvider.OSGI_PROPERTY).equals(
						IServiceProvider.LEVEL_VIEW)) {
			if (!viewDelegates.contains(delegate)) {
				viewDelegates.add(delegate);
			}
		} else {
			if (!viewSetDelegates.contains(delegate)) {
				viewSetDelegates.add(delegate);
			}
		}
	}

	/**
	 * Removes the delegate from the manager.
	 * 
	 * @param delegate
	 *            delegate to be removed
	 * @param properties
	 */
	public void removeDelegate(IServiceProvider delegate,
			Map<String, Object> properties) {
		if (delegate == null) {
			return;
		}
		viewDelegates.remove(delegate);
		viewSetDelegates.remove(delegate);
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
			LOGGER.debug("ServiceProviderFactoryManager activated");
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
			LOGGER.debug("ServiceProviderFactoryManager deactivated");
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param delegate
		 *            Manager to be added.
		 */
		protected void addDelegate(IServiceProvider delegate,
				Map<String, Object> properties) {
			DelegatingServiceProviderManager.getInstance().addDelegate(
					delegate, properties);
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param delegate
		 *            Manager to be removed.
		 */
		protected void removeDelegate(IServiceProvider delegate,
				Map<String, Object> properties) {
			DelegatingServiceProviderManager.getInstance().removeDelegate(
					delegate, properties);
		}
	}
}