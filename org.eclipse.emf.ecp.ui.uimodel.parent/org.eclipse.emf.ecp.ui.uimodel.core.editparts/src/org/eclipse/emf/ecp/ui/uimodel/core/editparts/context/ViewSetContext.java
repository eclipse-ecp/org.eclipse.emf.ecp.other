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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;

/**
 * Implementation of {@link IViewSetContext}.
 */
public class ViewSetContext extends DisposableContext implements IViewSetContext {

	private final IUiViewSetEditpart editPart;

	/**
	 * Constructor.
	 * 
	 * @param editPart The viewSetEditpart
	 */
	public ViewSetContext(IUiViewSetEditpart editPart) {
		this.editPart = editPart;
		this.editPart.setContext(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IUiViewSetEditpart getViewSetEditpart() {
		checkDisposed();

		return editPart;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<IViewContext> getViewContexts() {
		checkDisposed();

		List<IViewContext> childContexts = new ArrayList<IViewContext>();
		for (IUiViewEditpart child : editPart.getViews()) {
			IViewContext childContext = child.getContext();
			if (childContext != null) {
				childContexts.add(childContext);
			}
		}
		return childContexts;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void internalDispose() {
		try {
			List<IViewContext> temp = getViewContexts();
			for (IViewContext childContext : temp.toArray(new IViewContext[temp.size()])) {
				childContext.dispose();
			}

		} finally {
		}
	}

}
