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
package org.eclipse.emf.ecp.ecview.ui.core.editparts;

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
public final class DelegatingEditPartManager implements IEditPartManager {

	private static final Logger LOGGER = LoggerFactory.getLogger(DelegatingEditPartManager.class);
	private static DelegatingEditPartManager instance = new DelegatingEditPartManager();

	private final List<IEditPartManager> factories = Collections.synchronizedList(new ArrayList<IEditPartManager>());

	private DelegatingEditPartManager() {
	}

	/**
	 * Returns the instance of that manager.
	 * 
	 * @return the instance
	 */
	public static DelegatingEditPartManager getInstance() {
		return instance;
	}

	/**
	 * Removes all factories. Should only be used very carefully
	 */
	public void clear() {
		factories.clear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(Object element) {
		for (IEditPartManager factory : factories.toArray(new IEditPartManager[factories.size()])) {
			if (factory.isFor(element)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	public <A extends IElementEditpart> A findEditpart(Object element) {
		for (IEditPartManager factory : factories.toArray(new IEditPartManager[factories.size()])) {
			if (factory.isFor(element)) {
				return factory.findEditpart(element);
			}
		}
		LOGGER.error("No proper editPartFactory found for element {}", element);
		return null;
	}

	@Override
	public <A extends IElementEditpart> A getEditpart(Object element) {
		for (IEditPartManager factory : factories.toArray(new IEditPartManager[factories.size()])) {
			if (factory.isFor(element)) {
				return factory.getEditpart(element);
			}
		}
		LOGGER.error("No proper editPartFactory found for element {}", element);
		return null;
	}

	@Override
	public <A extends IElementEditpart> A createEditpart(Object selector, Class<A> editPartClazz) {
		for (IEditPartManager factory : factories.toArray(new IEditPartManager[factories.size()])) {
			if (factory.isFor(selector)) {
				return factory.createEditpart(selector, editPartClazz);
			}
		}
		LOGGER.error("No proper editPartFactory found for element {}", selector);
		return null;
	}

	/**
	 * Adds a new factory to the manager.
	 * 
	 * @param factory factory to be added
	 */
	public void addFactory(IEditPartManager factory) {
		if (!factories.contains(factory)) {
			factories.add(factory);
		}
	}

	/**
	 * Removes the factory from the manager.
	 * 
	 * @param factory factory to be removed
	 */
	public void removeFactory(IEditPartManager factory) {
		if (factory == null) {
			return;
		}
		factories.remove(factory);
	}

	/**
	 * The OSGi component.
	 */
	public static class Component {

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context ComponentContext
		 * @param properties Map of properties
		 */
		public void activate(ComponentContext context, Map<String, Object> properties) {
			LOGGER.debug("EditPartFactoryManager activated");
		}

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context ComponentContext
		 * @param properties Map of properties
		 */
		public void deactivate(ComponentContext context, Map<String, Object> properties) {
			LOGGER.debug("EditPartFactoryManager deactivated");
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param factory Factory to be added.
		 */
		protected void addFactory(IEditPartManager factory) {
			DelegatingEditPartManager.getInstance().addFactory(factory);
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param factory Factory to be removed.
		 */
		protected void removeFactory(IEditPartManager factory) {
			DelegatingEditPartManager.getInstance().removeFactory(factory);
		}
	}
}
