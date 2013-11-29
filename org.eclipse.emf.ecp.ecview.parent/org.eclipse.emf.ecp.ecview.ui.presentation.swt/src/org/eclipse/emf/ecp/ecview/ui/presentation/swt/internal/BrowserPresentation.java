/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IBrowserEditpart;
import org.eclipse.riena.ui.ridgets.IBrowserRidget;
import org.eclipse.riena.ui.ridgets.IMarkableRidget;
import org.eclipse.riena.ui.ridgets.swt.SwtRidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class BrowserPresentation extends FieldPresentation {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory
			.getLogger(BrowserPresentation.class);
	private final YBrowser yBrowser;
	private Composite controlBase;
	private Browser browser;
	private IBrowserRidget browserRidget;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public BrowserPresentation(IElementEditpart editpart) {
		super((IBrowserEditpart) editpart);
		this.yBrowser = (YBrowser) editpart.getModel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Control createWidget(Object parent) {
		if (controlBase == null) {
			controlBase = new Composite((Composite) parent, SWT.NONE);
			controlBase.setLayout(new GridLayout(2, false));
			setCSSClass(controlBase, CSS_CLASS__CONTROL_BASE);
			if (Util.isCssIdValid(yBrowser)) {
				setCSSId(controlBase, Util.getCssID(yBrowser));
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			browser = new Browser(controlBase, SWT.BORDER);
			browserRidget = (IBrowserRidget) SwtRidgetFactory
					.createRidget(browser);
			browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			// update style attributes
			//
			updateStyle();
		}
		return controlBase;
	}

	/**
	 * Updates the control style attributes.
	 */
	private void updateStyle() {
		if (Util.isCssClassValid(yBrowser)) {
			setCSSClass(browser, Util.getCssClass(yBrowser));
		} else {
			setCSSClass(browser, CSS_CLASS__CONTROL);
		}

		// creates the binding for the field
		createBindings(yBrowser, browserRidget);
	}

	/**
	 * Creates the bindings for the given elements.
	 * 
	 * @param yField
	 * @param ridget
	 */
	protected void createBindings(YBrowser yField, IMarkableRidget ridget) {
		// create the model binding from ridget to ECView-model
		createModelBinding(castEObject(getModel()),
				ExtensionModelPackage.Literals.YBROWSER__VALUE, ridget,
				IBrowserRidget.PROPERTY_URL);

		// do further bindings
		super.createBindings(yField, ridget);
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
	 * Returns true, if the label is valid.
	 * 
	 * @return
	 */
	public boolean isLabelValid() {
		return yBrowser.getDatadescription() != null
				&& yBrowser.getDatadescription().getLabel() != null;
	}

	/**
	 * Returns the label.
	 * 
	 * @return
	 */
	public String getLabel() {
		return yBrowser.getDatadescription().getLabel();
	}

	@Override
	protected IObservable internalGetObservableEndpoint(
			YEmbeddableBindingEndpoint bindableValue) {
		if (bindableValue == null) {
			throw new NullPointerException("BindableValue must not be null!");
		}

		if (bindableValue instanceof YEmbeddableValueEndpoint) {
			return internalGetValueEndpoint();
		}
		throw new IllegalArgumentException("Not a valid input: "
				+ bindableValue);
	}

	/**
	 * Returns the observable to observe value.
	 * 
	 * @return
	 */
	protected IObservableValue internalGetValueEndpoint() {
		// return the observable value for text
		return EMFObservables.observeValue(castEObject(getModel()),
				ExtensionModelPackage.Literals.YBROWSER__VALUE);
	}

	/**
	 * @return the textRidget
	 */
	public IBrowserRidget getBrowserRidget() {
		return browserRidget;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			browser = null;
			browserRidget = null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		super.internalDispose();

		// unrender the ui control
		unrender();
	}
}
