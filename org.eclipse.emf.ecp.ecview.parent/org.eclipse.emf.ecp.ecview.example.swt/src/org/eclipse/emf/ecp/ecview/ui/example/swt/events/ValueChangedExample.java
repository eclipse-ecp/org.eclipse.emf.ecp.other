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
package org.eclipse.emf.ecp.ecview.ui.example.swt.events;

import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.example.swt.model.AbstractBean;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An example demonstrating how margins can be used.
 */
public class ValueChangedExample implements IApplication {

	private static final Logger logger = LoggerFactory
			.getLogger(ValueChangedExample.class);

	private SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();

	@Override
	// BEGIN SUPRESS CATCH EXCEPTION
	public Object start(IApplicationContext context) throws Exception {
		// END SUPRESS CATCH EXCEPTION
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		// build the view model
		YView view = factory.createView();

		// create the layout
		YGridLayout layout = factory.createGridLayout();
		view.setContent(layout);
		layout.setColumns(3);
		layout.setFillHorizontal(false);
		layout.setFillVertical(false);
		layout.setSpacing(true);
		layout.setMargin(true);

		// row 1 - text directly bound to label
		//
		YLabel description1 = newLabel("text bound to label value change listener");
		layout.addElement(description1);
		layout.addGridLayoutCellStyle(description1).setAlignment(
				YAlignment.MIDDLE_LEFT);

		final YTextField text1 = newText("");
		layout.addElement(text1);
		layout.addGridLayoutCellStyle(text1).setAlignment(
				YAlignment.MIDDLE_FILL);
		final YLabel info1 = newLabel("");
		layout.addElement(info1);
		layout.addGridLayoutCellStyle(info1).setAlignment(
				YAlignment.MIDDLE_FILL);
		text1.addValueChangeListener(new YValueChangeListener() {
			@Override
			public void valueChanged(YValueChangeListener.Event event) {
				info1.setValue((String) event.getNewValue());
			}
		});

		// row2
		YLabel description2 = newLabel("Just for tab");
		layout.addElement(description2);
		layout.addGridLayoutCellStyle(description2).setAlignment(
				YAlignment.MIDDLE_LEFT);
		final YTextField text2 = newText("");
		layout.addElement(text2);
		layout.addGridLayoutCellStyle(text2).setAlignment(
				YAlignment.MIDDLE_FILL);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		try {
			renderer.render(shell, view, null);
		} catch (Exception e) {
			logger.error("{}", e);
			throw e;
		}

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();

		return null;
	}

	/**
	 * Creates a new text field.
	 * 
	 * @param label
	 *            the label to show
	 * @return textField
	 */
	protected YTextField newText(String label) {
		YTextField field = factory.createTextField();
		if (label != null) {
			YDatadescription dtd = factory.createDatadescription();
			field.setDatadescription(dtd);
			dtd.setLabel(label);
		}
		return field;
	}

	/**
	 * Creates a new text field.
	 * 
	 * @param label
	 *            the label to show
	 * @return textField
	 */
	protected YLabel newLabel(String label) {
		YLabel field = factory.createLabel();
		if (label != null) {
			YDatadescription dtd = factory.createDatadescription();
			field.setDatadescription(dtd);
			dtd.setLabel(label);
		}
		return field;
	}

	@Override
	public void stop() {

	}

	public class Bean extends AbstractBean {

		private String value;

		public Bean(String value) {
			super();
			this.value = value;
		}

		/**
		 * @return the value
		 */
		public String getValue() {
			return value;
		}

		/**
		 * @param value
		 *            the value to set
		 */
		public void setValue(String value) {
			firePropertyChanged("value", this.value, this.value = value);
		}
	}
}