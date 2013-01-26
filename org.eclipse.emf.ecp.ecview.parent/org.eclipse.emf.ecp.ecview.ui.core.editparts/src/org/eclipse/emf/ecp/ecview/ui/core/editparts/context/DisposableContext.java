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
package org.eclipse.emf.ecp.ecview.ui.core.editparts.context;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecp.ecview.ui.core.editparts.beans.IValueBean;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.internal.beans.ObjectBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base implementation for a disposable context.
 */
public abstract class DisposableContext extends AbstractDisposable implements
		IBeanRegistry, IServiceRegistry {

	private static final Logger logger = LoggerFactory
			.getLogger(DisposableContext.class);

	private Map<String, IValueBean> valueBeans = Collections
			.synchronizedMap(new HashMap<String, IValueBean>());

	private Map<String, Object> services = Collections
			.synchronizedMap(new HashMap<String, Object>());

	/**
	 * Returns a value bean. It can be used to store transient values related to
	 * the current view. All returned beans should offer PropertyChangeSupport.<br>
	 * If an instance of a value bean for the given selector could be found, it
	 * will be returned. Otherwise a new bean will be created an registered.
	 * <p>
	 * A common use case for value beans would be the sharing of a selected
	 * value. For instance a selection event on a list may write the selection
	 * to a value bean (selector="my.personlist.selection"). And a detail
	 * component can observe this instance of the value bean and reflect its
	 * values. To observe the value change eclipse data binding may be used.
	 * 
	 * @param selector
	 *            The selector string to identify the value bean instance.
	 * @return selector
	 */
	public IValueBean getBean(String selector) {
		checkDisposed();

		synchronized (valueBeans) {
			if (!valueBeans.containsKey(selector)) {
				registerBean(selector, new ObjectBean());
			}
		}
		return valueBeans.get(selector);
	}

	/**
	 * Registers an instance of value bean to the context. It can be accessed by
	 * the selector. See also {@link IValueBean} or
	 * {@link #getValueBean(String) getValueBean}.
	 * 
	 * @param selector
	 *            The selector string to identify the value bean instance.
	 * @param bean
	 *            The value bean.
	 * @return
	 */
	public void registerBean(String selector, IValueBean bean) {
		checkDisposed();
		logger.debug("Bean registered: {}", selector);
		valueBeans.put(selector, bean);
	}

	public void registerService(String selector, Object service) {
		checkDisposed();
		logger.debug("Service registered: {}", selector);
		services.put(selector, service);
	}

	public void unregisterService(String selector) {
		checkDisposed();
		logger.debug("Service unregistered: {}", selector);
		services.remove(selector);
	}

	/**
	 * {@inheritDoc}
	 */
	public IValueBean getRootBean() {
		checkDisposed();
		return getBean(ROOTBEAN_SELECTOR);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <S> S getService(String selector) {
		checkDisposed();
		return (S) services.get(selector);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {
		if (isDisposed()) {
			return;
		}

		internalDispose();

		try {
			valueBeans = null;
			services = null;
		} finally {
			super.dispose();
		}
	}

}