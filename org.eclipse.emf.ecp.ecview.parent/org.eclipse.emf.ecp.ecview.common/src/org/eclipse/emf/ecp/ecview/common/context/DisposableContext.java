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
package org.eclipse.emf.ecp.ecview.common.context;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.eclipse.emf.ecp.ecview.common.beans.IBeanRegistry;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.beans.ObjectBean;
import org.eclipse.emf.ecp.ecview.common.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ecview.common.services.DelegatingServiceProviderManager;
import org.eclipse.emf.ecp.ecview.common.services.IServiceRegistry;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base implementation for a disposable context.
 */
public abstract class DisposableContext extends AbstractDisposable implements
		IBeanRegistry, IServiceRegistry, IContext {

	private static final Logger logger = LoggerFactory
			.getLogger(DisposableContext.class);

	private Map<String, ISlot> valueBeans = Collections
			.synchronizedMap(new HashMap<String, ISlot>());

	private Map<String, Object> services = Collections
			.synchronizedMap(new HashMap<String, Object>());

	private Locale locale = Locale.getDefault();

	@Override
	public void setLocale(Locale locale) {
		Locale oldLocale = this.locale;
		this.locale = locale;

		if (oldLocale != this.locale) {
			updateLocale(this.locale);
		}
	}

	/**
	 * The locale changed and needs to become updated.
	 * 
	 * @param locale
	 */
	protected abstract void updateLocale(Locale locale);

	@Override
	public Locale getLocale() {
		return locale;
	}

	/**
	 * {@inheritDoc}
	 */
	public Object getBean(String selector) {
		checkDisposed();

		ISlot slot = getBeanSlot(selector);
		return slot != null ? slot.getValue() : null;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setBean(String selector, Object bean) {
		checkDisposed();

		ISlot slot = getBeanSlot(selector);
		if (slot == null && bean == null) {
			throw new IllegalArgumentException(
					"Can not create a slot for bean that is null!");
		}

		if (slot == null) {
			slot = createBeanSlot(selector, bean.getClass());
		} else {
			if (bean != null
					&& !slot.getValueType().isAssignableFrom(bean.getClass())) {
				throw new IllegalArgumentException(String.format(
						"%s is not a valid class for slot with type %s", bean
								.getClass().getName(), slot.getValueType()
								.getName()));
			}
		}

		valueBeans.get(selector).setValue(bean);
		logger.debug("Bean registered: {}", selector);
	}

	@Override
	public ISlot getBeanSlot(String selector) {
		checkDisposed();
		ISlot slot = valueBeans.get(selector);
		return slot;
	}

	@Override
	public ISlot createBeanSlot(String selector, Class<?> type) {
		ISlot slot = getBeanSlot(selector);
		if (slot == null) {
			slot = new ObjectBean(type);
			valueBeans.put(selector, slot);
		}
		return slot;
	}

	public void registerService(String selector, Object service) {
		checkDisposed();
		synchronized (services) {
			logger.debug("Service registered: {}", selector);
			services.put(selector, service);
		}
	}

	public void unregisterService(String selector) {
		checkDisposed();
		synchronized (services) {
			logger.debug("Service unregistered: {}", selector);
			services.remove(selector);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <S> S getService(String selector) {
		checkDisposed();

		synchronized (services) {
			if (!services.containsKey(selector)) {
				S service = DelegatingServiceProviderManager.getInstance()
						.createService(selector, this);
				if (service != null) {
					registerService(selector, service);
				}
			}
		}

		// now try to access the view set
		S service = (S) services.get(selector);

		// use the strategy of the subclass to find the service
		if (service == null) {
			service = delegateGetService(selector);
		}

		// access the OSGi service registry to find the service
		if (service == null) {
			BundleContext bundleContext = FrameworkUtil.getBundle(getClass())
					.getBundleContext();
			ServiceReference<?> serviceRef = bundleContext
					.getServiceReference(selector);
			if (serviceRef != null) {
				service = (S) bundleContext.getService(serviceRef);
			}
		}

		return service;
	}

	/**
	 * If no service was found in the current context, sub classes may specify a
	 * different strategy to find it.
	 * 
	 * @param selector
	 * @return
	 */
	protected <S> S delegateGetService(String selector) {
		return null;
	}

	@Override
	protected void internalDispose() {
		valueBeans = null;
		services = null;
	}

}