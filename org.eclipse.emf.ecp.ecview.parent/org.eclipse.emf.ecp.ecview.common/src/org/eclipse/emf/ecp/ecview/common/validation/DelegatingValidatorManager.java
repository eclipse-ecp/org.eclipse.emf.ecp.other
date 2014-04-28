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
package org.eclipse.emf.ecp.ecview.common.validation;

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
public final class DelegatingValidatorManager implements IValidatorManager {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(DelegatingValidatorManager.class);
	private static DelegatingValidatorManager instance = new DelegatingValidatorManager();

	private final List<IValidatorManager> delegates = Collections
			.synchronizedList(new ArrayList<IValidatorManager>());

	private DelegatingValidatorManager() {
	}

	/**
	 * Returns the instance of that manager.
	 * 
	 * @return the instance
	 */
	public static DelegatingValidatorManager getInstance() {
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
		for (IValidatorManager factory : delegates
				.toArray(new IValidatorManager[delegates.size()])) {
			if (factory.isFor(element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public <A extends IValidator> A createValidator(Object modelElement) {
		for (IValidatorManager factory : delegates
				.toArray(new IValidatorManager[delegates.size()])) {
			if (factory.isFor(modelElement)) {
				return factory.createValidator(modelElement);
			}
		}
		LOGGER.error("No proper validatorFactory found for element {}",
				modelElement);
		return null;
	}

	/**
	 * Adds a new delegate to the manager.
	 * 
	 * @param delegate
	 *            delegate to be added
	 */
	public void addDelegate(IValidatorManager delegate) {
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
	public void removeDelegate(IValidatorManager delegate) {
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
			LOGGER.debug("ValidatorManager activated");
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
			LOGGER.debug("ValidatorManager deactivated");
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param delegate
		 *            Manager to be added.
		 */
		protected void addDelegate(IValidatorManager delegate) {
			DelegatingValidatorManager.getInstance().addDelegate(delegate);
		}

		/**
		 * Called by OSGi DS.
		 * 
		 * @param delegate
		 *            Manager to be removed.
		 */
		protected void removeDelegate(IValidatorManager delegate) {
			DelegatingValidatorManager.getInstance().removeDelegate(delegate);
		}
	}
}
