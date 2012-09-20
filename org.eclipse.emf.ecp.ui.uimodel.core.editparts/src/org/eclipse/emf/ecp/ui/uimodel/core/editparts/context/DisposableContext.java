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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.context;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans.IValueBean;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.internal.beans.ObjectBean;

/**
 * Base implementation for a disposable context.
 */
public abstract class DisposableContext extends AbstractDisposable {

	private Map<String, IValueBean> valueBeans = Collections.synchronizedMap(new HashMap<String, IValueBean>());

	/**
	 * Returns a value bean. It can be used to store transient values related to the current view. All returned beans
	 * should offer PropertyChangeSupport.<br>
	 * If an instance of a value bean for the given selector could be found, it will be returned. Otherwise a new bean
	 * will be created an registered.
	 * <p>
	 * A common use case for value beans would be the sharing of a selected value. For instance a selection event on a
	 * list may write the selection to a value bean (selector="my.personlist.selection"). And a detail component can
	 * observe this instance of the value bean and reflect its values. To observe the value change eclipse data binding
	 * may be used.
	 * 
	 * @param selector The selector string to identify the value bean instance.
	 * @return selector
	 */
	public IValueBean getValueBean(String selector) {
		checkDisposed();

		synchronized (valueBeans) {
			if (!valueBeans.containsKey(selector)) {
				registerValueBean(selector, new ObjectBean());
			}
		}
		return valueBeans.get(selector);
	}

	/**
	 * Registers an instance of value bean to the context. It can be accessed by the selector.
	 * See also {@link IValueBean} or {@link #getValueBean(String) getValueBean}.
	 * 
	 * @param selector The selector string to identify the value bean instance.
	 * @param bean The value bean.
	 * @return
	 */
	public void registerValueBean(String selector, IValueBean bean) {
		checkDisposed();

		valueBeans.put(selector, bean);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {
		if (isDisposed()) {
			return;
		}

		try {
			valueBeans = null;
		} finally {
			super.dispose();
		}
	}
}