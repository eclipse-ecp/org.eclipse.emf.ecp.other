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
package org.eclipse.emf.ecp.ecview.ui.example.swt;

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
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
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
public class GridLayoutLabelExample implements IApplication {

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
		YLabel yLabel1 = newLabel("Text1");
		yLayout.addElement(yLabel1);
		YLabel yLabel2 = newLabel("Text2");
		yLayout.addElement(yLabel2);
		YLabel yLabel3 = newLabel("Text3");
		yLayout.addElement(yLabel3);
		YLabel yLabel4 = newLabel("Text4");
		yLayout.addElement(yLabel4);
		YLabel yLabel5 = newLabel("Text5");
		yLayout.addElement(yLabel5);
		YLabel yLabel6 = newLabel("Text6");
		yLayout.addElement(yLabel6);
		YLabel yLabel7 = newLabel("Text7");
		yLayout.addElement(yLabel7);
		YLabel yLabel8 = newLabel("Text8");
		yLayout.addElement(yLabel8);
		YLabel yLabel9 = newLabel("Text9");
		yLayout.addElement(yLabel9);
		YLabel yLabel10 = newLabel("Text10");
		yLayout.addElement(yLabel10);

		// create the styling information
		//
		// text 1 -> alignment
		YGridLayoutCellStyle yStyle1 = yLayout.addGridLayoutCellStyle(yLabel1);
		yStyle1.setAlignment(YAlignment.TOP_LEFT);
		// text 2 -> alignment
		YGridLayoutCellStyle yStyle2 = yLayout.addGridLayoutCellStyle(yLabel2);
		yStyle2.setAlignment(YAlignment.MIDDLE_CENTER);
		// text 3 -> alignment
		YGridLayoutCellStyle yStyle3 = yLayout.addGridLayoutCellStyle(yLabel3);
		yStyle3.setAlignment(YAlignment.BOTTOM_RIGHT);
		// text 4 -> Span from (0,1) to (0,2)
		YGridLayoutCellStyle yStyle4 = yLayout.addGridLayoutCellStyle(yLabel4);
		yStyle4.setAlignment(YAlignment.FILL_LEFT);
		yStyle4.addSpanInfo(0, 1, 0, 2);
		// text 5 -> alignment
		YGridLayoutCellStyle yStyle5 = yLayout.addGridLayoutCellStyle(yLabel5);
		yStyle5.setAlignment(YAlignment.MIDDLE_FILL);
		// text 6 -> alignment
		YGridLayoutCellStyle yStyle6 = yLayout.addGridLayoutCellStyle(yLabel6);
		yStyle6.setAlignment(YAlignment.MIDDLE_FILL);
		// text 7 -> Span from (1,1) to (2,1)
		YGridLayoutCellStyle yStyle7 = yLayout.addGridLayoutCellStyle(yLabel7);
		yStyle7.setAlignment(YAlignment.FILL_FILL);
		yStyle7.addSpanInfo(1, 2, 2, 2);
		// text 8 -> alignment
		YGridLayoutCellStyle yStyle8 = yLayout.addGridLayoutCellStyle(yLabel8);
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
	 * Creates a new label.
	 * 
	 * @param label
	 *            the label to show
	 * @return label
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
}