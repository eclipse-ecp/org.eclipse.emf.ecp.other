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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans.IValueBean;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.internal.beans.ObjectBean;

public class ViewContext extends DisposableContext implements IViewContext {

	private Map<String, IValueBean> valueBeans = Collections.synchronizedMap(new HashMap<String, IValueBean>());

	private IUiViewEditpart editPart;
	private Object rootLayout;
	private String presentationURI;

	public ViewContext() {

	}

	@Override
	public String getPresentationURI() {
		return presentationURI;
	}

	/**
	 * Sets the URI that is used to determine the ui kit that should be used to render the UI.
	 * 
	 * @param presentationURI
	 */
	public void setPresentationURI(String presentationURI) {
		this.presentationURI = presentationURI;
	}

	@Override
	public IUiViewEditpart getViewEditpart() {
		return editPart;
	}

	/**
	 * Sets the view edit part.
	 * 
	 * @param editPart
	 */
	public void setViewEditpart(IUiViewEditpart editPart) {
		this.editPart = editPart;
	}

	@Override
	public IViewSetContext getParentContext() {
		IUiViewSetEditpart parent = editPart.getParent();
		return parent != null ? parent.getContext() : null;
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
	public Object getRootLayout() {
		return rootLayout;
	}

	@Override
	public void setRootLayout(Object rootLayout) throws ContextException {
		if (rootLayout != null) {
			throw new ContextException("Changing root layout not allowed!");
		}

		this.rootLayout = rootLayout;
	}

	@Override
	public IValueBean getRootBean() {
		return getValueBean("org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.view.rootbean");
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
