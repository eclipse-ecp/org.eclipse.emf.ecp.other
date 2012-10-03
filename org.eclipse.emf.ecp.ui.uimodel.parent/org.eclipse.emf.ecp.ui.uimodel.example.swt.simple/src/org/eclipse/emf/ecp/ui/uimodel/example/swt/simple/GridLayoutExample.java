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

import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;
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
public class GridLayoutExample implements IApplication {

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
		// .........> yText1
		// .........> yText2
		// .........> yText3
		// .........> yText4
		// .........> yText5
		// .........> yText6
		// .........> yText7
		// .........> yText8
		// .........> yText9
		// .........> yText10
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

		// add some text fields
		//
		// add some text fields
		//
		YUiTextField yText1 = newText("Text1");
		yLayout.getElements().add(yText1);
		YUiTextField yText2 = newText("Text2");
		yLayout.getElements().add(yText2);
		YUiTextField yText3 = newText("Text3");
		yLayout.getElements().add(yText3);
		YUiTextField yText4 = newText("Text4");
		yLayout.getElements().add(yText4);
		YUiTextField yText5 = newText("Text5");
		yLayout.getElements().add(yText5);
		YUiTextField yText6 = newText("Text6");
		yLayout.getElements().add(yText6);
		YUiTextField yText7 = newText("Text7");
		yLayout.getElements().add(yText7);
		YUiTextField yText8 = newText("Text8");
		yLayout.getElements().add(yText8);
		YUiTextField yText9 = newText("Text9");
		yLayout.getElements().add(yText9);
		YUiTextField yText10 = newText("Text10");
		yLayout.getElements().add(yText10);

		// create the styling information
		//
		// text 1 -> alignment
		YUiGridLayoutCellStyle yStyle1 = createCellStyle(yLayout, yText1);
		yStyle1.setAlignment(YUiAlignment.TOP_LEFT);
		// text 2 -> alignment
		YUiGridLayoutCellStyle yStyle2 = createCellStyle(yLayout, yText2);
		yStyle2.setAlignment(YUiAlignment.MIDDLE_CENTER);
		// text 3 -> alignment
		YUiGridLayoutCellStyle yStyle3 = createCellStyle(yLayout, yText3);
		yStyle3.setAlignment(YUiAlignment.BOTTOM_RIGHT);
		// text 4 -> Span from (0,1) to (0,2)
		YUiGridLayoutCellStyle yStyle4 = createCellStyle(yLayout, yText4);
		yStyle4.setAlignment(YUiAlignment.FILL_LEFT);
		factory.createSpanInfo(yStyle4, 0, 1, 0, 2);
		// text 5 -> alignment
		YUiGridLayoutCellStyle yStyle5 = createCellStyle(yLayout, yText5);
		yStyle5.setAlignment(YUiAlignment.MIDDLE_FILL);
		// text 6 -> alignment
		YUiGridLayoutCellStyle yStyle6 = createCellStyle(yLayout, yText6);
		yStyle6.setAlignment(YUiAlignment.MIDDLE_FILL);
		// text 7 -> Span from (1,1) to (2,1)
		YUiGridLayoutCellStyle yStyle7 = createCellStyle(yLayout, yText7);
		yStyle7.setAlignment(YUiAlignment.FILL_FILL);
		factory.createSpanInfo(yStyle7, 1, 2, 2, 2);
		// text 8 -> alignment
		YUiGridLayoutCellStyle yStyle8 = createCellStyle(yLayout, yText8);
		yStyle8.setAlignment(YUiAlignment.BOTTOM_LEFT);

		// create the rendering options
		//
		Map<String, Object> options = new HashMap<String, Object>();
		Set<URL> cssFiles = new HashSet<URL>();
		cssFiles.add(Activator.getContext().getBundle().getEntry("/theming/css/GridLayoutExample.css"));
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
	 * @param yGridLayout the grid layout
	 * @param yText1 the text
	 * @return a new cell style
	 */
	protected YUiGridLayoutCellStyle createCellStyle(YUiGridLayout yGridLayout, YUiTextField yText1) {
		return factory.createGridLayoutCellStyle(yText1, yGridLayout);
	}

	/**
	 * Creates a new text field.
	 * 
	 * @param label the label to show
	 * @return textField
	 */
	protected YUiTextField newText(String label) {
		YUiTextField field = factory.createTextField();
		if (label != null) {
			YTextDDesc dtd = factory.createTextDatadescription();
			field.setDatadescription(dtd);
			dtd.setLabel(label);
		}
		return field;
	}

	@Override
	public void stop() {

	}
}