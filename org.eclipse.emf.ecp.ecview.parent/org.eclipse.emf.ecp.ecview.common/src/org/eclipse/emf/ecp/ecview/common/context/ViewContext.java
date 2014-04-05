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

import java.util.Map;
import java.util.concurrent.Future;

import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewSetEditpart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of the {@link IViewContext}.
 */
public class ViewContext extends DisposableContext implements IViewContext {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory
			.getLogger(ViewContext.class);

	private final IViewEditpart viewEditpart;
	private Object rootLayout;
	private String presentationURI;

	private boolean rendered;

	/**
	 * Default Constructor for tests only! Do not use.
	 */
	protected ViewContext() {
		this.viewEditpart = null;
	}

	/**
	 * Constructor.
	 * 
	 * @param viewEditpart
	 *            The view editpart
	 */
	public ViewContext(IViewEditpart viewEditpart) {
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
	 * Delegates the service request to the view set.
	 * 
	 * @param selector
	 * @return
	 */
	protected <S> S delegateGetService(String selector) {
		IViewSetContext parentContext = getParentContext();
		if (parentContext != null) {
			return parentContext.getService(selector);
		}
		return null;
	}

	/**
	 * Sets the URI that is used to determine the UI kit that should be used to
	 * render the UI.
	 * 
	 * @param presentationURI
	 *            URI selecting the UI-Kit
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
	public IViewEditpart getViewEditpart() {
		checkDisposed();

		return viewEditpart;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IViewSetContext getParentContext() {
		checkDisposed();

		IViewSetEditpart parent = viewEditpart.getParent();
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
	public void render(String presentationURI, Object rootLayout,
			Map<String, Object> parameter) throws ContextException {
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

			// start to render
			//
			IViewEditpart editPart = getViewEditpart();
			editPart.render(parameter);

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

	@Override
	public void exec(Runnable runnable) {
		checkDisposed();

		getViewEditpart().exec(runnable);
	}

	@Override
	public Future<?> execAsync(Runnable runnable) {
		checkDisposed();

		return getViewEditpart().execAsync(runnable);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void internalDispose() {
		viewEditpart.dispose();
	}
}
