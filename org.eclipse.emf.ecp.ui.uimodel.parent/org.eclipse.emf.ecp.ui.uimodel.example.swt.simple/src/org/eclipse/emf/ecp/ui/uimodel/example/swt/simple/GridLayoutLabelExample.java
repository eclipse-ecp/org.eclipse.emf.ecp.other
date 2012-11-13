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

import org.eclipse.emf.ecp.ui.model.core.datatypes.YLabelDDesc;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiAlignment;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel;
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
public class GridLayoutLabelExample implements IApplication {

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
		// .........> yLabel1
		// .........> yLabel2
		// .........> yLabel3
		// .........> yLabel4
		// .........> yLabel5
		// .........> yLabel6
		// .........> yLabel7
		// .........> yLabel8
		// .........> yLabel9
		// .........> yLabel10
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
		YUiLabel yLabel1 = newLabel("Text1");
		yLayout.getElements().add(yLabel1);
		YUiLabel yLabel2 = newLabel("Text2");
		yLayout.getElements().add(yLabel2);
		YUiLabel yLabel3 = newLabel("Text3");
		yLayout.getElements().add(yLabel3);
		YUiLabel yLabel4 = newLabel("Text4");
		yLayout.getElements().add(yLabel4);
		YUiLabel yLabel5 = newLabel("Text5");
		yLayout.getElements().add(yLabel5);
		YUiLabel yLabel6 = newLabel("Text6");
		yLayout.getElements().add(yLabel6);
		YUiLabel yLabel7 = newLabel("Text7");
		yLayout.getElements().add(yLabel7);
		YUiLabel yLabel8 = newLabel("Text8");
		yLayout.getElements().add(yLabel8);
		YUiLabel yLabel9 = newLabel("Text9");
		yLayout.getElements().add(yLabel9);
		YUiLabel yLabel10 = newLabel("Text10");
		yLayout.getElements().add(yLabel10);

		// create the styling information
		//
		// text 1 -> alignment
		YUiGridLayoutCellStyle yStyle1 = createCellStyle(yLayout, yLabel1);
		yStyle1.setAlignment(YUiAlignment.TOP_LEFT);
		// text 2 -> alignment
		YUiGridLayoutCellStyle yStyle2 = createCellStyle(yLayout, yLabel2);
		yStyle2.setAlignment(YUiAlignment.MIDDLE_CENTER);
		// text 3 -> alignment
		YUiGridLayoutCellStyle yStyle3 = createCellStyle(yLayout, yLabel3);
		yStyle3.setAlignment(YUiAlignment.BOTTOM_RIGHT);
		// text 4 -> Span from (0,1) to (0,2)
		YUiGridLayoutCellStyle yStyle4 = createCellStyle(yLayout, yLabel4);
		yStyle4.setAlignment(YUiAlignment.FILL_LEFT);
		factory.createSpanInfo(yStyle4, 0, 1, 0, 2);
		// text 5 -> alignment
		YUiGridLayoutCellStyle yStyle5 = createCellStyle(yLayout, yLabel5);
		yStyle5.setAlignment(YUiAlignment.MIDDLE_FILL);
		// text 6 -> alignment
		YUiGridLayoutCellStyle yStyle6 = createCellStyle(yLayout, yLabel6);
		yStyle6.setAlignment(YUiAlignment.MIDDLE_FILL);
		// text 7 -> Span from (1,1) to (2,1)
		YUiGridLayoutCellStyle yStyle7 = createCellStyle(yLayout, yLabel7);
		yStyle7.setAlignment(YUiAlignment.FILL_FILL);
		factory.createSpanInfo(yStyle7, 1, 2, 2, 2);
		// text 8 -> alignment
		YUiGridLayoutCellStyle yStyle8 = createCellStyle(yLayout, yLabel8);
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
	 * @param yLabel1
	 *            the text
	 * @return a new cell style
	 */
	protected YUiGridLayoutCellStyle createCellStyle(YUiGridLayout yGridLayout,
			YUiLabel yLabel1) {
		return factory.createGridLayoutCellStyle(yLabel1, yGridLayout);
	}

	/**
	 * Creates a new label.
	 * 
	 * @param label
	 *            the label to show
	 * @return label
	 */
	protected YUiLabel newLabel(String label) {
		YUiLabel field = factory.createLabel();
		if (label != null) {
			YLabelDDesc dtd = factory.createLabelDatadescription();
			field.setDatadescription(dtd);
			dtd.setLabel(label);
		}
		return field;
	}

	@Override
	public void stop() {

	}
}