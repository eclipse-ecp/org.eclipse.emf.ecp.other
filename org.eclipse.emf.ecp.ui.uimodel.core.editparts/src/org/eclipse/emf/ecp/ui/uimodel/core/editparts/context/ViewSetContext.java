/*******************************************************************************
 * Copyright (c) 2012 Florian Pirchner and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans.IValueBean;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.internal.beans.ObjectBean;

public class ViewSetContext extends DisposableContext implements IViewSetContext {

	private Map<String, IValueBean> valueBeans = Collections.synchronizedMap(new HashMap<String, IValueBean>());
	private final IUiViewSetEditpart editPart;

	public ViewSetContext(IUiViewSetEditpart editPart) {
		this.editPart = editPart;
		this.editPart.setContext(this);
	}

	@Override
	public IUiViewSetEditpart getViewSetEditpart() {
		return editPart;
	}

	public List<IViewContext> getViewContexts() {
		List<IViewContext> childContexts = new ArrayList<IViewContext>();
		for (IUiViewEditpart child : editPart.getViews()) {
			IViewContext childContext = child.getContext();
			if (childContext != null) {
				childContexts.add(childContext);
			}
		}
		return childContexts;
	}

	@Override
	public IValueBean getValueBean(String selector) {
		checkDisposed();

		synchronized (valueBeans) {
			if (!valueBeans.containsKey(selector)) {
				valueBeans.put(selector, new ObjectBean());
			}
		}
		return valueBeans.get(selector);
	}

	@Override
	public IValueBean getRootBean() {
		return getValueBean("org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.viewset.rootbean");
	}

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
