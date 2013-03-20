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
package org.eclipse.emf.ecp.ecview.ui.example.swt.binding;

import org.eclipse.emf.ecp.ecview.common.beans.BeanSlotInitializerAdapter;
import org.eclipse.emf.ecp.ecview.common.context.ConfigurationAdapter;
import org.eclipse.emf.ecp.ecview.common.context.IConfiguration;
import org.eclipse.emf.ecp.ecview.common.context.IContext;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.core.YContextBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
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
public class TextBindingExample implements IApplication {

	private static final Logger logger = LoggerFactory
			.getLogger(TextBindingExample.class);

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

		YBindingSet bindingSet = view.getOrCreateBindingSet();

		// row 1 - text directly bound to label
		//
		YLabel description1 = newLabel("text directly bound to label");
		layout.addElement(description1);
		layout.addGridLayoutCellStyle(description1).setAlignment(
				YAlignment.MIDDLE_LEFT);
		YTextField text1 = newText("");
		layout.addElement(text1);
		layout.addGridLayoutCellStyle(text1).setAlignment(
				YAlignment.MIDDLE_FILL);
		YLabel info1 = newLabel("");
		layout.addElement(info1);
		layout.addGridLayoutCellStyle(info1).setAlignment(
				YAlignment.MIDDLE_FILL);

		// bind text.valueEndpoint -> label.valueEndpoint
		bindingSet.addBinding(text1.createValueEndpoint(),
				info1.createValueEndpoint());

		// row 2 - text bound to bean and bean bound to label
		//
		YLabel description2 = newLabel("text bound to bean and bean bound to label");
		layout.addElement(description2);
		layout.addGridLayoutCellStyle(description2).setAlignment(
				YAlignment.MIDDLE_LEFT);
		YTextField text2 = newText("");
		layout.addGridLayoutCellStyle(text2).setAlignment(
				YAlignment.MIDDLE_FILL);
		layout.addElement(text2);
		YLabel info2 = newLabel("");
		layout.addElement(info2);
		layout.addGridLayoutCellStyle(info2).setAlignment(
				YAlignment.MIDDLE_FILL);

		Bean bean = new Bean("Initial value");
		// bind text.valueEndpoint -> bean.value
		YBeanBindingEndpoint beanEndpoint = factory.createBeanBindingEndpoint();
		beanEndpoint.setBean(bean);
		beanEndpoint.setPropertyPath("value");
		bindingSet.addBinding(text2.createValueEndpoint(), beanEndpoint);

		// bind bean.value -> label.valueEndpoint
		beanEndpoint = factory.createBeanBindingEndpoint();
		beanEndpoint.setBean(bean);
		beanEndpoint.setPropertyPath("value");
		bindingSet.addBinding(beanEndpoint, info2.createValueEndpoint());

		// row 3 - text bound to context and context bound to label
		//
		YLabel description3 = newLabel("text directly bound to label");
		layout.addElement(description3);
		layout.addGridLayoutCellStyle(description3).setAlignment(
				YAlignment.MIDDLE_LEFT);
		YTextField text3 = newText("");
		layout.addElement(text3);
		layout.addGridLayoutCellStyle(text3).setAlignment(
				YAlignment.MIDDLE_FILL);
		YLabel info3 = newLabel("");
		layout.addElement(info3);
		layout.addGridLayoutCellStyle(info3).setAlignment(
				YAlignment.MIDDLE_FILL);

		// bind text3 -> context
		YContextBindingEndpoint contextEndpoint = factory
				.createContextBindingEndpoint();
		contextEndpoint.setUrlString("view://bean/slot1#value");
		bindingSet.addBinding(contextEndpoint, text3.createValueEndpoint());

		// bind context -> info3
		YContextBindingEndpoint contextEndpoint2 = factory
				.createContextBindingEndpoint();
		contextEndpoint2.setUrlString("view://bean/slot1#value");
		bindingSet.addBinding(info3.createValueEndpoint(), contextEndpoint2);

		// render view
		//
		IConfiguration config = new ConfigurationAdapter() {
			@Override
			public void beforeBind(IContext context) {
				new BeanSlotInitializerAdapter() {
					@Override
					protected void doIntialize() {
						createBeanSlot("view://bean/slot1", String.class);
					}
				}.intialize(context);
			}
		};

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		try {
			renderer.render(shell, view, config, null);
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