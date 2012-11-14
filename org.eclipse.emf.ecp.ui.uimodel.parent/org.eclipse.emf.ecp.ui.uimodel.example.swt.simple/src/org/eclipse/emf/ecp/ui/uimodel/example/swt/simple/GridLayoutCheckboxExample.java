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
package org.eclipse.emf.ecp.ui.uimodel.example.swt.simple;

import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecp.ui.model.core.datatypes.YCheckBoxDDesc;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiCheckBox;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.util.SimpleModelFactory;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.SimpleSwtRenderer;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * An example demonstrating how margins can be used.
 */
public class GridLayoutCheckboxExample implements IApplication {

	private SimpleModelFactory factory = new SimpleModelFactory();

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
		YUiView yView = factory.createView();
		yView.setCssClass("gridLayoutExample");

		// create the layout
		YUiGridLayout yLayout = factory.createGridLayout();
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
		YUiCheckBox yCheckBox1 = newCheckBox("CheckBox1");
		yLayout.getElements().add(yCheckBox1);
		YUiCheckBox yCheckBox2 = newCheckBox("CheckBox2");
		yLayout.getElements().add(yCheckBox2);
		YUiCheckBox yCheckBox3 = newCheckBox("CheckBox3");
		yLayout.getElements().add(yCheckBox3);
		YUiCheckBox yCheckBox4 = newCheckBox("CheckBox4");
		yLayout.getElements().add(yCheckBox4);
		YUiCheckBox yCheckBox5 = newCheckBox("CheckBox5");
		yLayout.getElements().add(yCheckBox5);
		YUiCheckBox yCheckBox6 = newCheckBox("CheckBox6");
		yLayout.getElements().add(yCheckBox6);
		YUiCheckBox yCheckBox7 = newCheckBox("CheckBox7");
		yLayout.getElements().add(yCheckBox7);
		YUiCheckBox yCheckBox8 = newCheckBox("CheckBox8");
		yLayout.getElements().add(yCheckBox8);
		YUiCheckBox yCheckBox9 = newCheckBox("CheckBox9");
		yLayout.getElements().add(yCheckBox9);
		YUiCheckBox yCheckBox10 = newCheckBox("CheckBox10");
		yLayout.getElements().add(yCheckBox10);

		// create the styling information
		//
		// checkBox 1 -> alignment
		YUiGridLayoutCellStyle yStyle1 = createCellStyle(yLayout, yCheckBox1);
		yStyle1.setAlignment(YUiAlignment.TOP_LEFT);
		// checkBox 2 -> alignment
		YUiGridLayoutCellStyle yStyle2 = createCellStyle(yLayout, yCheckBox2);
		yStyle2.setAlignment(YUiAlignment.MIDDLE_CENTER);
		// checkBox 3 -> alignment
		YUiGridLayoutCellStyle yStyle3 = createCellStyle(yLayout, yCheckBox3);
		yStyle3.setAlignment(YUiAlignment.BOTTOM_RIGHT);
		// checkBox 4 -> Span from (0,1) to (0,2)
		YUiGridLayoutCellStyle yStyle4 = createCellStyle(yLayout, yCheckBox4);
		yStyle4.setAlignment(YUiAlignment.FILL_LEFT);
		factory.createSpanInfo(yStyle4, 0, 1, 0, 2);
		// checkBox 5 -> alignment
		YUiGridLayoutCellStyle yStyle5 = createCellStyle(yLayout, yCheckBox5);
		yStyle5.setAlignment(YUiAlignment.MIDDLE_FILL);
		// checkBox 6 -> alignment
		YUiGridLayoutCellStyle yStyle6 = createCellStyle(yLayout, yCheckBox6);
		yStyle6.setAlignment(YUiAlignment.MIDDLE_FILL);
		// checkBox 7 -> Span from (1,1) to (2,1)
		YUiGridLayoutCellStyle yStyle7 = createCellStyle(yLayout, yCheckBox7);
		yStyle7.setAlignment(YUiAlignment.FILL_FILL);
		factory.createSpanInfo(yStyle7, 1, 2, 2, 2);
		// checkBox 8 -> alignment
		YUiGridLayoutCellStyle yStyle8 = createCellStyle(yLayout, yCheckBox8);
		yStyle8.setAlignment(YUiAlignment.BOTTOM_LEFT);

		// create the rendering options
		//
		Map<String, Object> options = new HashMap<String, Object>();
		Set<URL> cssFiles = new HashSet<URL>();
		cssFiles.add(Activator.getContext().getBundle()
				.getEntry("/theming/css/GridLayoutExample.css"));
		options.put(SimpleSwtRenderer.RENDERING_OPTION__CSS_FILES, cssFiles);

		// render view
		//
		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
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
	 * Creates a new cell style.
	 * 
	 * @param yGridLayout
	 *            the grid layout
	 * @param yCheckBox1
	 *            the checkBox
	 * @return a new cell style
	 */
	protected YUiGridLayoutCellStyle createCellStyle(YUiGridLayout yGridLayout,
			YUiCheckBox yCheckBox1) {
		return factory.createGridLayoutCellStyle(yCheckBox1, yGridLayout);
	}

	/**
	 * Creates a new checkBox field.
	 * 
	 * @param label
	 *            the label to show
	 * @return checkBoxField
	 */
	protected YUiCheckBox newCheckBox(String label) {
		YUiCheckBox field = factory.createCheckBox();
		if (label != null) {
			YCheckBoxDDesc dtd = factory.createCheckBoxDatadescription();
			field.setDatadescription(dtd);
			dtd.setLabel(label);
		}
		return field;
	}

	@Override
	public void stop() {

	}
}