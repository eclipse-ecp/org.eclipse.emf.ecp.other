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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Delegates the calls to the implementing services provided by OSGi-DS.
 */
public final class DelegatingPresenterFactory implements IPresentationFactory {

	private static final Logger LOGGER = LoggerFactory.getLogger(DelegatingPresenterFactory.class);
	private static DelegatingPresenterFactory instance = new DelegatingPresenterFactory();

	private final List<IPresentationFactory> factories = Collections
		.synchronizedList(new ArrayList<IPresentationFactory>());

	private DelegatingPresenterFactory() {
	}

	/**
	 * Returns the instance of that manager.
	 * 
	 * @return the instance
	 */
	public static DelegatingPresenterFactory getInstance() {
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
	public boolean isFor(IViewContext uiContext, IUiElementEditpart editpart) {
		for (IPresentationFactory factory : factories.toArray(new IPresentationFactory[factories.size()])) {
			if (factory.isFor(uiContext, editpart)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public <A extends IWidgetPresentation<?>> A createPresentation(IViewContext uiContext, IUiElementEditpart editpart) {
		for (IPresentationFactory factory : factories.toArray(new IPresentationFactory[factories.size()])) {
			if (factory.isFor(uiContext, editpart)) {
				return factory.createPresentation(uiContext, editpart);
			}
		}
		LOGGER.error("No proper presenterFactory found for elements {} {}", new Object[] { uiContext, editpart });
		return null;
	}

	/**
	 * Adds a new factory to the manager.
	 * 
	 * @param factory Factory to be added.
	 */
	public void addFactory(IPresentationFactory factory) {
		if (!factories.contains(factory)) {
			factories.add(factory);
		}
	}

	/**
	 * Removes the factory from the manager.
	 * 
	 * @param factory Factory to be removed.
	 */
	public void removeFactory(IPresentationFactory factory) {
		if (factory == null) {
			return;
		}
		factories.remove(factory);
	}

	/**
	 * OSGi-DS component.
	 */
	public static class Component {

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context Component context
		 * @param properties Map of properties
		 */
		public void activate(ComponentContext context, Map<String, Object> properties) {
			LOGGER.debug("DelegatingPresenterFactory activated");
		}

		/**
		 * Called by OSGi-DS.
		 * 
		 * @param context Component context
		 * @param properties Map of properties
		 */
		public void deactivate(ComponentContext context, Map<String, Object> properties) {
			LOGGER.debug("DelegatingPresenterFactory deactivated");
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param factory Factory to be added
		 */
		protected void addFactory(IPresentationFactory factory) {
			DelegatingPresenterFactory.getInstance().addFactory(factory);
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param factory Factory to be added
		 */
		protected void removeFactory(IPresentationFactory factory) {
			DelegatingPresenterFactory.getInstance().removeFactory(factory);
		}
	}
}
