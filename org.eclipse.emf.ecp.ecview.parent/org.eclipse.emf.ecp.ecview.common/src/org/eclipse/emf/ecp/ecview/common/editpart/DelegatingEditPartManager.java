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
package org.eclipse.emf.ecp.ecview.common.editpart;

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

	private final List<IEditPartManager> delegates = Collections.synchronizedList(new ArrayList<IEditPartManager>());

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
		delegates.clear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isFor(Object element) {
		for (IEditPartManager factory : delegates.toArray(new IEditPartManager[delegates.size()])) {
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
		for (IEditPartManager factory : delegates.toArray(new IEditPartManager[delegates.size()])) {
			if (factory.isFor(element)) {
				return factory.findEditpart(element);
			}
		}
		LOGGER.error("No proper editPartFactory found for element {}", element);
		return null;
	}

	@Override
	public <A extends IElementEditpart> A getEditpart(Object element) {
		for (IEditPartManager factory : delegates.toArray(new IEditPartManager[delegates.size()])) {
			if (factory.isFor(element)) {
				return factory.getEditpart(element);
			}
		}
		LOGGER.error("No proper editPartFactory found for element {}", element);
		return null;
	}

	@Override
	public <A extends IElementEditpart> A createEditpart(Object selector, Class<A> editPartClazz) {
		for (IEditPartManager factory : delegates.toArray(new IEditPartManager[delegates.size()])) {
			if (factory.isFor(selector)) {
				return factory.createEditpart(selector, editPartClazz);
			}
		}
		LOGGER.error("No proper editPartFactory found for element {}", selector);
		return null;
	}

	/**
	 * Adds a new delegate to the manager.
	 * 
	 * @param delegate delegate to be added
	 */
	public void addDelegate(IEditPartManager delegate) {
		if (!delegates.contains(delegate)) {
			delegates.add(delegate);
		}
	}

	/**
	 * Removes the delegate from the manager.
	 * 
	 * @param delegate delegate to be removed
	 */
	public void removeDelegate(IEditPartManager delegate) {
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
		 * @param delegate Manager to be added.
		 */
		protected void addDelegate(IEditPartManager delegate) {
			DelegatingEditPartManager.getInstance().addDelegate(delegate);
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param delegate Manager to be removed.
		 */
		protected void removeDelegate(IEditPartManager delegate) {
			DelegatingEditPartManager.getInstance().removeDelegate(delegate);
		}
	}
}
