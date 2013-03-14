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
package org.eclipse.emf.ecp.ecview.ui.example.swt.simple;

import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatadescription;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.simple.SimpleSwtRenderer;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * An example demonstrating how margins can be used.
 */
public class GridLayoutTextAreaExample implements IApplication {

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
		// .........> yTextAreaArea1
		// .........> yTextArea2
		// .........> yTextArea3
		// .........> yTextArea4
		// .........> yTextArea5
		// .........> yTextArea6
		// .........> yTextArea7
		// .........> yTextArea8
		// .........> yTextArea9
		// .........> yTextArea10
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

		// add some text fields
		//
		// add some text fields
		//
		YTextArea yTextArea1 = newTextArea("Text1");
		yLayout.getElements().add(yTextArea1);
		YTextArea yTextArea2 = newTextArea("Text2");
		yLayout.getElements().add(yTextArea2);
		YTextArea yTextArea3 = newTextArea("Text3");
		yLayout.getElements().add(yTextArea3);
		YTextArea yTextArea4 = newTextArea("Text4");
		yLayout.getElements().add(yTextArea4);
		YTextArea yTextArea5 = newTextArea("Text5");
		yLayout.getElements().add(yTextArea5);
		YTextArea yTextArea6 = newTextArea("Text6");
		yLayout.getElements().add(yTextArea6);
		YTextArea yTextArea7 = newTextArea("Text7");
		yLayout.getElements().add(yTextArea7);
		YTextArea yTextArea8 = newTextArea("Text8");
		yLayout.getElements().add(yTextArea8);
		YTextArea yTextArea9 = newTextArea("Text9");
		yLayout.getElements().add(yTextArea9);
		YTextArea yTextArea10 = newTextArea("Text10");
		yLayout.getElements().add(yTextArea10);

		// create the styling information
		//
		// text 1 -> alignment
		YGridLayoutCellStyle yStyle1 = createCellStyle(yLayout, yTextArea1);
		yStyle1.setAlignment(YAlignment.TOP_LEFT);
		// text 2 -> alignment
		YGridLayoutCellStyle yStyle2 = createCellStyle(yLayout, yTextArea2);
		yStyle2.setAlignment(YAlignment.MIDDLE_CENTER);
		// text 3 -> alignment
		YGridLayoutCellStyle yStyle3 = createCellStyle(yLayout, yTextArea3);
		yStyle3.setAlignment(YAlignment.BOTTOM_RIGHT);
		// text 4 -> Span from (0,1) to (0,2)
		YGridLayoutCellStyle yStyle4 = createCellStyle(yLayout, yTextArea4);
		yStyle4.setAlignment(YAlignment.FILL_LEFT);
		factory.createSpanInfo(yStyle4, 0, 1, 0, 2);
		// text 5 -> alignment
		YGridLayoutCellStyle yStyle5 = createCellStyle(yLayout, yTextArea5);
		yStyle5.setAlignment(YAlignment.MIDDLE_FILL);
		// text 6 -> alignment
		YGridLayoutCellStyle yStyle6 = createCellStyle(yLayout, yTextArea6);
		yStyle6.setAlignment(YAlignment.MIDDLE_FILL);
		// text 7 -> Span from (1,1) to (2,1)
		YGridLayoutCellStyle yStyle7 = createCellStyle(yLayout, yTextArea7);
		yStyle7.setAlignment(YAlignment.FILL_FILL);
		factory.createSpanInfo(yStyle7, 1, 2, 2, 2);
		// text 8 -> alignment
		YGridLayoutCellStyle yStyle8 = createCellStyle(yLayout, yTextArea8);
		yStyle8.setAlignment(YAlignment.BOTTOM_LEFT);

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
	 * @param yTextArea1
	 *            the text
	 * @return a new cell style
	 */
	protected YGridLayoutCellStyle createCellStyle(YGridLayout yGridLayout,
			YTextArea yTextArea1) {
		return factory.createGridLayoutCellStyle(yTextArea1, yGridLayout);
	}

	/**
	 * Creates a new text area.
	 * 
	 * @param label
	 *            the label to show
	 * @return textField
	 */
	protected YTextArea newTextArea(String label) {
		YTextArea field = factory.createTextArea();
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