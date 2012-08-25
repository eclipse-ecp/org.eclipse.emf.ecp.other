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

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans.IValueBean;

public class ViewContext extends DisposableContext implements IViewContext {

	private final IUiViewEditpart viewEditpart;
	private Object rootLayout;
	private String presentationURI;

	private boolean rendered;

	public ViewContext(IUiViewEditpart viewEditpart) {
		this.viewEditpart = viewEditpart;
		this.viewEditpart.setContext(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getPresentationURI() {
		checkDisposed();

		return presentationURI;
	}

	/**
	 * Sets the URI that is used to determine the UI kit that should be used to render the UI.
	 * 
	 * @param presentationURI
	 * @throws IllegalArgumentException if was already rendered.
	 */
	public void setPresentationURI(String presentationURI) {
		checkDisposed();

		if (isRendered()) {
			throw new IllegalArgumentException("Not valid if already rendered!");
		}

		this.presentationURI = presentationURI;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IUiViewEditpart getViewEditpart() {
		checkDisposed();

		return viewEditpart;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IViewSetContext getParentContext() {
		checkDisposed();

		IUiViewSetEditpart parent = viewEditpart.getParent();
		return parent != null ? parent.getContext() : null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object getRootLayout() {
		checkDisposed();

		return rootLayout;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IValueBean getRootBean() {
		checkDisposed();

		return getValueBean("http://eclipse.org/emf/emfclient/uimodel/view/rootbean");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void render(String presentationURI, Object rootLayout) throws ContextException {
		checkDisposed();

		if (rootLayout == null) {
			throw new ContextException("RootLayout must not be null!");
		}

		if (rendered) {
			throw new ContextException("Has already been rendered!");
		}

		try {
			this.presentationURI = presentationURI;
			this.rootLayout = rootLayout;
		} finally {
			rendered = true;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isRendered() {
		checkDisposed();

		return rendered;
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
			viewEditpart.dispose();
		} finally {
			super.dispose();
		}
	}
}
