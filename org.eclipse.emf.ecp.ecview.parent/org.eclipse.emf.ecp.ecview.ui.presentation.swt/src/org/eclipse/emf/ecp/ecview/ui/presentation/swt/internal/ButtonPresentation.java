/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YButton;
import org.eclipse.emf.ecp.ecview.extension.model.extension.listener.IButtonClickListener;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IButtonEditpart;
import org.eclipse.riena.ui.ridgets.IActionRidget;
import org.eclipse.riena.ui.ridgets.swt.SwtRidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class ButtonPresentation extends AbstractSWTWidgetPresenter {

	private final YButton yButton;
	private Composite controlBase;
	private Button button;
	private IActionRidget buttonRidget;

	private ClickAdapter clickAdapter;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public ButtonPresentation(IElementEditpart editpart) {
		super((IButtonEditpart) editpart);
		this.yButton = (YButton) editpart.getModel();
		castEObject(yButton).eAdapters().add(new ModelObserver());
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
			if (Util.isCssIdValid(yButton)) {
				setCSSId(controlBase, Util.getCssID(yButton));
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			button = new Button(controlBase, SWT.BORDER);
			button.setText(yButton.getDatadescription().getLabel());
			button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			buttonRidget = (IActionRidget) SwtRidgetFactory
					.createRidget(button);

			// update style attributes
			//
			updateStyle();

			// install all pending click listener
			//
			for (IButtonClickListener listener : yButton.getClickListeners()) {
				getClickAdapter().addClickListener(listener);
			}
		}
		return controlBase;
	}

	/**
	 * Updates the control style attributes.
	 */
	private void updateStyle() {
		if (Util.isCssClassValid(yButton)) {
			setCSSClass(button, Util.getCssClass(yButton));
		} else {
			setCSSClass(button, CSS_CLASS__CONTROL);
		}

		createBindings(yButton, buttonRidget);
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
		return yButton.getDatadescription() != null
				&& yButton.getDatadescription().getLabel() != null;
	}

	/**
	 * Returns the label.
	 * 
	 * @return
	 */
	public String getLabel() {
		return yButton.getDatadescription().getLabel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			runLocked(new Runnable() {
				@Override
				public void run() {
					controlBase.dispose();
					controlBase = null;
					button = null;

					if (clickAdapter != null) {
						clickAdapter.dispose();
						clickAdapter = null;
					}
				}
			});

		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		// unrender the ui control
		unrender();

		if (clickAdapter != null) {
			clickAdapter.dispose();
			clickAdapter = null;
		}
	}

	/**
	 * Returns an instance of the click adapter.
	 * 
	 * @return
	 */
	protected ClickAdapter getClickAdapter() {
		if (clickAdapter == null) {
			clickAdapter = new ClickAdapter(yButton, button);
		}
		return clickAdapter;
	}

	/**
	 * Observes the model for add and remove calls. Simple properties are bound
	 * by databinding. See super.createBindings();
	 */
	private class ModelObserver extends AdapterImpl {

		@Override
		public void notifyChanged(final Notification msg) {
			super.notifyChanged(msg);

			runLocked(new Runnable() {
				@Override
				public void run() {
					switch (msg.getEventType()) {
					case Notification.ADD:
						handleAdd(msg);
						break;
					case Notification.ADD_MANY:
					case Notification.MOVE:
					case Notification.REMOVE:
						handleRemove(msg);
						break;
					case Notification.REMOVE_MANY:
					}
				}
			});
		}

		/**
		 * Handles removing eObjects.
		 * 
		 * @param msg
		 */
		private void handleRemove(Notification msg) {
			switch (msg.getFeatureID(YButton.class)) {
			case ExtensionModelPackage.YBUTTON__CLICK_LISTENERS:
				getClickAdapter().removeClickListener(
						(IButtonClickListener) msg.getOldValue());
				break;
			}
		}

		/**
		 * Handles adding eObjects.
		 * 
		 * @param msg
		 */
		private void handleAdd(Notification msg) {
			switch (msg.getFeatureID(YButton.class)) {
			case ExtensionModelPackage.YBUTTON__CLICK_LISTENERS:
				getClickAdapter().addClickListener(
						(IButtonClickListener) msg.getOldValue());
				break;
			}
		}
	}

	/**
	 * An adapter that handles the delegation of click events.
	 */
	private class ClickAdapter extends SelectionAdapter {

		private final Button button;
		private final YButton yButton;
		private Set<IButtonClickListener> delegates = new HashSet<IButtonClickListener>();

		private ClickAdapter(YButton yButton, Button button) {
			this.yButton = yButton;
			this.button = button;
			button.addSelectionListener(this);
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			super.widgetSelected(e);

			runLocked(new Runnable() {
				@Override
				public void run() {
					for (IButtonClickListener listener : delegates
							.toArray(new IButtonClickListener[delegates.size()])) {
						listener.clicked(yButton);
					}
				}
			});
		}

		/**
		 * Removes a click listener from the button.
		 * 
		 * @param listener
		 */
		public void removeClickListener(IButtonClickListener listener) {
			delegates.remove(listener);
		}

		/**
		 * Adds a click listener to the button.
		 * 
		 * @param listener
		 */
		public void addClickListener(IButtonClickListener listener) {
			delegates.add(listener);
		}

		/**
		 * Disposes the adpater.
		 */
		public void dispose() {
			button.removeSelectionListener(this);
		}
	}
}
