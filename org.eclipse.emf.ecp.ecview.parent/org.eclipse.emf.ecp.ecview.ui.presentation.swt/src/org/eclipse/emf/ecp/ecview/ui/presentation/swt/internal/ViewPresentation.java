/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.eclipse.e4.ui.css.core.engine.CSSErrorHandler;
import org.eclipse.e4.ui.css.swt.CSSSWTConstants;
import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.e4.ui.css.swt.engine.CSSSWTEngineImpl;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.presentation.IViewPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.Activator;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.IConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.osgi.framework.Bundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
@SuppressWarnings("restriction")
public class ViewPresentation extends AbstractDisposable implements
		IViewPresentation<Control> {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ViewPresentation.class);

	private ModelAccess modelAccess;
	private final IViewEditpart editpart;
	private Composite controlBase;
	private Composite control;
	private IWidgetPresentation<?> contentPresentation;
	private CSSEngine cssEngine;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart for that presentation.
	 */
	public ViewPresentation(IViewEditpart editpart) {
		this.editpart = editpart;
		this.modelAccess = new ModelAccess((YView) editpart.getModel());
	}

	@Override
	public Object getModel() {
		return editpart.getModel();
	}

	@Override
	public IViewContext getViewContext() {
		return editpart.getContext();
	}

	/**
	 * Returns the editpart the presenter will render for.
	 * 
	 * @return editpart
	 */
	public IElementEditpart getEditpart() {
		checkDisposed();
		return editpart;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void render(Map<String, Object> options) {
		checkDisposed();

		if (editpart.getContent() != null) {
			contentPresentation = editpart.getContent().getPresentation();
		}
		Composite parent = (Composite) editpart.getContext().getRootLayout();
		createWidget(parent);

		// apply CSS style
		if (cssEngine == null) {
			setupCSSEngine(options != null ? (Set<URL>) options
					.get(ECViewSwtRenderer.RENDERING_OPTION__CSS_FILES)
					: Collections.<URL> emptySet());
		}
		applyCssStyle();
	}

	/**
	 * Applies the CSS styles to the UI elements.
	 */
	protected void applyCssStyle() {
		cssEngine.applyStyles(controlBase.getShell(), true);
	}

	/**
	 * Instantiates the CSS engine.
	 * 
	 * @param cssFiles
	 *            The cssFiles to be used
	 */
	protected void setupCSSEngine(Set<URL> cssFiles) {
		cssEngine = new CSSSWTEngineImpl(controlBase.getDisplay());
		try {
			Bundle bundle = Activator.getContext().getBundle();
			bundle.getBundleId();
			cssEngine.parseStyleSheet(bundle.getEntry("/theming/css/theme.css")
					.openStream());
			if (cssFiles != null) {
				for (URL url : cssFiles) {
					cssEngine.parseStyleSheet(url.openStream());
				}
			}
		} catch (IOException e) {
			LOGGER.error("{}", e);
		}
		cssEngine.setErrorHandler(new CSSErrorHandler() {
			public void error(Exception e) {
				LOGGER.error("{}", e);
			}
		});
	}

	/**
	 * Is called to render the content.
	 */
	protected void renderContent() {
		if (!isRendered()) {
			return;
		}

		if (contentPresentation != null) {
			Control contentControl = (Control) contentPresentation
					.createWidget(control);
			contentControl.setLayoutData(null);
		} else {
			LOGGER.warn("Content is null");
		}
	}

	/**
	 * Applies the layout to the "control" composite.
	 * 
	 * @param composite
	 */
	protected void applyViewLayout(Composite composite) {
		composite.setLayout(new FillLayout());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Control createWidget(Object parent) {
		if (controlBase == null) {
			// create control base with grid layout to enable margins
			//
			controlBase = new Composite((Composite) parent, SWT.NONE);
			WidgetElement.setCSSClass(controlBase,
					IConstants.CSS_CLASS__CONTROL_BASE);

			GridLayout layout = new GridLayout(1, true);
			controlBase.setLayout(layout);

			if (modelAccess.isMargin()) {
				controlBase.setData(CSSSWTConstants.MARGIN_WRAPPER_KEY,
						CSSSWTConstants.MARGIN_WRAPPER_KEY);
			}

			// create the control with grid data to fill out whole area
			control = new Composite(controlBase, SWT.NONE);
			GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
			control.setLayoutData(layoutData);
			applyViewLayout(control);

			if (modelAccess.isCssIdValid()) {
				WidgetElement.setID(control, modelAccess.getCssID());
			} else {
				WidgetElement.setID(control, editpart.getId());
			}

			if (modelAccess.isCssClassValid()) {
				WidgetElement.setCSSClass(control, modelAccess.getCssClass());
			} else {
				WidgetElement.setCSSClass(control,
						IConstants.CSS_CLASS__CONTROL);
			}

			// render the content
			//
			renderContent();
		}
		return controlBase;
	}

	@Override
	public Control getWidget() {
		return controlBase;
	}

	@Override
	public boolean isRendered() {
		return controlBase != null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;

			IWidgetPresentation<?> childPresentation = getContent();
			if (childPresentation != null) {
				childPresentation.unrender();
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		if (controlBase != null) {
			unrender();

			cssEngine.dispose();
			cssEngine = null;
		}
	}

	@Override
	public void setContent(IWidgetPresentation<?> presentation) {
		IWidgetPresentation<?> oldPresentation = this.contentPresentation;

		this.contentPresentation = presentation;

		if (oldPresentation != null) {
			oldPresentation.unrender();
		}

		renderContent();
	}

	@Override
	public IWidgetPresentation<?> getContent() {
		return contentPresentation;
	}

	/**
	 * An internal helper class.
	 */
	private static class ModelAccess {
		private final YView yView;

		public ModelAccess(YView yView) {
			super();
			this.yView = yView;
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yView.getCssClass();
		}

		/**
		 * Returns true, if the css class is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssClassValid() {
			return getCssClass() != null && !getCssClass().equals("");
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YCssAble#getCssID()
		 */
		public String getCssID() {
			return yView.getCssID();
		}

		/**
		 * Returns true, if the css id is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssIdValid() {
			return getCssID() != null && !getCssID().equals("");
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YGridLayout#isMargin()
		 */
		public boolean isMargin() {
			return yView.isMargin();
		}
	}

	@Override
	public IObservable getObservableValue(Object model) {
		throw new UnsupportedOperationException("Must be overridden!");
	}
}
