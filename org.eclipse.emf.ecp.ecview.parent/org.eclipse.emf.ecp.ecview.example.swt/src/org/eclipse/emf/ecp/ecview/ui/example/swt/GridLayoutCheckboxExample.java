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
package org.eclipse.emf.ecp.ecview.ui.example.swt;

import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * An example demonstrating how margins can be used.
 */
public class GridLayoutCheckboxExample implements IApplication {

	private SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();

	@Override
	// BEGIN SUPRESS CATCH EXCEPTION
	public Object start(IApplicationContext context) throws Exception {
		// END SUPRESS CATCH EXCEPTION
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		// build the view model
		// ...> yView
		// ......> yLayout
		// .........> yCheckBox1
		// .........> yCheckBox2
		// .........> yCheckBox3
		// .........> yCheckBox4
		// .........> yCheckBox5
		// .........> yCheckBox6
		// .........> yCheckBox7
		// .........> yCheckBox8
		// .........> yCheckBox9
		// .........> yCheckBox10
		YView yView = factory.createView();
		yView.setCssClass("gridLayoutExample");

		// create the layout
		YGridLayout yLayout = factory.createGridLayout();
		yLayout.setCssClass("gridlayout");
		yView.setContent(yLayout);
		yLayout.setColumns(3);
		// yLayout.setPackContentHorizontal(false);
		// yLayout.setPackContentVertical(false);
		yLayout.setSpacing(true);
		yLayout.setMargin(true);

		// add some checkBox fields
		//
		// add some checkBox fields
		//
		YCheckBox yCheckBox1 = newCheckBox("CheckBox1");
		yLayout.addElement(yCheckBox1);
		YCheckBox yCheckBox2 = newCheckBox("CheckBox2");
		yLayout.addElement(yCheckBox2);
		YCheckBox yCheckBox3 = newCheckBox("CheckBox3");
		yLayout.addElement(yCheckBox3);
		YCheckBox yCheckBox4 = newCheckBox("CheckBox4");
		yLayout.addElement(yCheckBox4);
		YCheckBox yCheckBox5 = newCheckBox("CheckBox5");
		yLayout.addElement(yCheckBox5);
		YCheckBox yCheckBox6 = newCheckBox("CheckBox6");
		yLayout.addElement(yCheckBox6);
		YCheckBox yCheckBox7 = newCheckBox("CheckBox7");
		yLayout.addElement(yCheckBox7);
		YCheckBox yCheckBox8 = newCheckBox("CheckBox8");
		yLayout.addElement(yCheckBox8);
		YCheckBox yCheckBox9 = newCheckBox("CheckBox9");
		yLayout.addElement(yCheckBox9);
		YCheckBox yCheckBox10 = newCheckBox("CheckBox10");
		yLayout.addElement(yCheckBox10);

		// create the styling information
		//
		// checkBox 1 -> alignment
		YGridLayoutCellStyle yStyle1 = yLayout
				.addGridLayoutCellStyle(yCheckBox1);
		yStyle1.setAlignment(YAlignment.TOP_LEFT);
		// checkBox 2 -> alignment
		YGridLayoutCellStyle yStyle2 = yLayout
				.addGridLayoutCellStyle(yCheckBox2);
		yStyle2.setAlignment(YAlignment.MIDDLE_CENTER);
		// checkBox 3 -> alignment
		YGridLayoutCellStyle yStyle3 = yLayout
				.addGridLayoutCellStyle(yCheckBox3);
		yStyle3.setAlignment(YAlignment.BOTTOM_RIGHT);
		// checkBox 4 -> Span from (0,1) to (0,2)
		YGridLayoutCellStyle yStyle4 = yLayout
				.addGridLayoutCellStyle(yCheckBox4);
		yStyle4.setAlignment(YAlignment.FILL_LEFT);
		yStyle4.addSpanInfo(0, 1, 0, 2);
		// checkBox 5 -> alignment
		YGridLayoutCellStyle yStyle5 = yLayout
				.addGridLayoutCellStyle(yCheckBox5);
		yStyle5.setAlignment(YAlignment.MIDDLE_FILL);
		// checkBox 6 -> alignment
		YGridLayoutCellStyle yStyle6 = yLayout
				.addGridLayoutCellStyle(yCheckBox6);
		yStyle6.setAlignment(YAlignment.MIDDLE_FILL);
		// checkBox 7 -> Span from (1,1) to (2,1)
		YGridLayoutCellStyle yStyle7 = yLayout
				.addGridLayoutCellStyle(yCheckBox7);
		yStyle7.setAlignment(YAlignment.FILL_FILL);
		yStyle7.addSpanInfo(1, 2, 2, 2);
		// checkBox 8 -> alignment
		YGridLayoutCellStyle yStyle8 = yLayout
				.addGridLayoutCellStyle(yCheckBox8);
		yStyle8.setAlignment(YAlignment.BOTTOM_LEFT);

		// create the rendering options
		//
		Map<String, Object> options = new HashMap<String, Object>();
		Set<URL> cssFiles = new HashSet<URL>();
		cssFiles.add(Activator.getContext().getBundle()
				.getEntry("/theming/css/GridLayoutExample.css"));
		options.put(ECViewSwtRenderer.RENDERING_OPTION__CSS_FILES, cssFiles);

		// render view
		//
		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, options);

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
	 * Creates a new checkBox field.
	 * 
	 * @param label
	 *            the label to show
	 * @return checkBoxField
	 */
	protected YCheckBox newCheckBox(String label) {
		YCheckBox field = factory.createCheckBox();
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
}