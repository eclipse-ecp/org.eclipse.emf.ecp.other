/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.presenter;

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
public class DelegatingPresenterFactory implements IPresenterFactory {

	private static final Logger logger = LoggerFactory.getLogger(DelegatingPresenterFactory.class);
	private static DelegatingPresenterFactory instance = new DelegatingPresenterFactory();

	private final List<IPresenterFactory> factories = Collections.synchronizedList(new ArrayList<IPresenterFactory>());

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
		for (IPresenterFactory factory : factories.toArray(new IPresenterFactory[factories.size()])) {
			if (factory.isFor(uiContext, editpart)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public <A extends IPresenter> A createPresenter(IViewContext uiContext, IUiElementEditpart editpart) {
		for (IPresenterFactory factory : factories.toArray(new IPresenterFactory[factories.size()])) {
			if (factory.isFor(uiContext, editpart)) {
				return factory.createPresenter(uiContext, editpart);
			}
		}
		logger.error("No proper presenterFactory found for elements {} {}", new Object[] { uiContext, editpart });
		return null;
	}

	/**
	 * Adds a new factory to the manager.
	 * 
	 * @param service
	 */
	public void addFactory(IPresenterFactory factory) {
		if (!factories.contains(factory)) {
			factories.add(factory);
		}
	}

	/**
	 * Removes the factory from the manager.
	 * 
	 * @param service
	 */
	public void removeFactory(IPresenterFactory factory) {
		if (factory == null) {
			return;
		}
		factories.remove(factory);
	}

	public static class Component {

		/**
		 * Called by OSGi-DS
		 * 
		 * @param context
		 * @param properties
		 */
		public void activate(ComponentContext context, Map<String, Object> properties) {
			logger.debug("DelegatingPresenterFactory activated");
		}

		/**
		 * Called by OSGi-DS
		 * 
		 * @param context
		 * @param properties
		 */
		public void deactivate(ComponentContext context, Map<String, Object> properties) {
			logger.debug("DelegatingPresenterFactory deactivated");
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param service
		 */
		protected void addFactory(IPresenterFactory factory) {
			DelegatingPresenterFactory.getInstance().addFactory(factory);
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param service
		 */
		protected void removeFactory(IPresenterFactory factory) {
			DelegatingPresenterFactory.getInstance().removeFactory(factory);
		}
	}
}
