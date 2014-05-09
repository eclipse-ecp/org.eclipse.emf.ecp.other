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
package org.eclipse.emf.ecp.ecview.common.editpart.visibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Delegates the calls to the implementing services provided by OSGi-DS.
 */
public final class DelegatingVisibilityFactory implements IVisibilityFactory {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(DelegatingVisibilityFactory.class);
	private static DelegatingVisibilityFactory instance = new DelegatingVisibilityFactory();

	private final List<IVisibilityFactory> delegates = Collections
			.synchronizedList(new ArrayList<IVisibilityFactory>());
	private List<IVisibilityFactory> stashed;

	private DelegatingVisibilityFactory() {
	}

	/**
	 * Returns the instance of that manager.
	 * 
	 * @return the instance
	 */
	public static DelegatingVisibilityFactory getInstance() {
		return instance;
	}

	/**
	 * Removes all factories. Should only be used very carefully
	 */
	public void clear() {
		delegates.clear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(Object element) {
		for (IVisibilityFactory factory : delegates
				.toArray(new IVisibilityFactory[delegates.size()])) {
			if (factory.isFor(element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public <A extends IVisibilityRule> A createRule(Object element) {
		for (IVisibilityFactory factory : delegates
				.toArray(new IVisibilityFactory[delegates.size()])) {
			if (factory.isFor(element)) {
				return factory.createRule(element);
			}
		}
		LOGGER.error("No proper presenterFactory found for elements {}",
				element);
		return null;
	}

	/**
	 * Will stash the current state. ONLY FOR TESTS!
	 */
	public void stash() {
		if (stashed != null) {
			return;
		}
		stashed = new ArrayList<IVisibilityFactory>(delegates);
	}

	/**
	 * Will unstash the stashed state. ONLY FOR TESTS!
	 */
	public void unstash() {
		if (stashed == null) {
			return;
		}
		delegates.clear();
		delegates.addAll(stashed);
		stashed = null;
	}

	/**
	 * Adds a new factory to the manager.
	 * 
	 * @param factory
	 *            Factory to be added.
	 */
	public void addDelegate(IVisibilityFactory factory) {
		if (!delegates.contains(factory)) {
			delegates.add(factory);
		}
	}

	/**
	 * Removes the factory from the manager.
	 * 
	 * @param factory
	 *            Factory to be removed.
	 */
	public void removeDelegate(IVisibilityFactory factory) {
		if (factory == null) {
			return;
		}
		delegates.remove(factory);
	}

	/**
	 * OSGi-DS component.
	 */
	public static class Component {

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context
		 *            Component context
		 * @param properties
		 *            Map of properties
		 */
		public void activate(ComponentContext context,
				Map<String, Object> properties) {
			LOGGER.debug("DelegatingPresenterFactory activated");
		}

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context
		 *            Component context
		 * @param properties
		 *            Map of properties
		 */
		public void deactivate(ComponentContext context,
				Map<String, Object> properties) {
			LOGGER.debug("DelegatingPresenterFactory deactivated");
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param factory
		 *            Factory to be added
		 */
		protected void addDelegate(IVisibilityFactory factory) {
			DelegatingVisibilityFactory.getInstance().addDelegate(factory);
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param factory
		 *            Factory to be added
		 */
		protected void removeDelegate(IVisibilityFactory factory) {
			DelegatingVisibilityFactory.getInstance().removeDelegate(factory);
		}
	}
}
