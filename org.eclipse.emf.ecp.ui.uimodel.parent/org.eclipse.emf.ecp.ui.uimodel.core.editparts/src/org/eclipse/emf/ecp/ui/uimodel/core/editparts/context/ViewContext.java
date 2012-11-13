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

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans.IValueBean;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IViewPresentation;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation of the {@link IViewContext}.
 */
public class ViewContext extends DisposableContext implements IViewContext {

	private static final Logger logger = LoggerFactory
			.getLogger(ViewContext.class);

	private final IUiViewEditpart viewEditpart;
	private Object rootLayout;
	private String presentationURI;

	private boolean rendered;
	private Map<String, IWidgetPresentation<?>> presentations = new HashMap<String, IWidgetPresentation<?>>();

	/**
	 * Constructor.
	 * 
	 * @param viewEditpart
	 *            The view editpart
	 */
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
			IUiViewEditpart editPart = getViewEditpart();
			IViewPresentation<?> presentation = editPart.getPresentation();
			if (presentation == null) {
				throw new ContextException("Presenter must not be null!");
			}
			presentation.render(parameter);

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
	public void internalDispose() {
		try {
			viewEditpart.dispose();
		} finally {

		}
	}

	// TODO add unit tests
	@Override
	public void registerPresentation(String id, IWidgetPresentation<?> widget)
			throws RuntimeException {
		if (presentations.containsKey(id)) {
			logger.error(String.format(
					"Already a widget registered under the id %s", id));
			throw new RuntimeException(String.format(
					"Already a widget registered under the id %s", id));
		}
		presentations.put(id, widget);
	}

	// TODO add unit tests
	@Override
	public void unregisterPresentation(String id) {
		presentations.remove(id);
	}

	// TODO add unit tests
	@SuppressWarnings("unchecked")
	@Override
	public <C> IWidgetPresentation<C> getPresentation(String id) {
		return (IWidgetPresentation<C>) presentations.get(id);
	}

	// TODO add unit tests
	@Override
	public Set<String> getPresentationIds() {
		return presentations.keySet();
	}
}
