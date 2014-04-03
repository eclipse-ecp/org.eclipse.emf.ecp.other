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
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
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
public class GridLayoutTextExample implements IApplication {

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
		YTextField yText1 = newText("Text1");
		yLayout.addElement(yText1);
		YTextField yText2 = newText("Text2");
		yLayout.addElement(yText2);
		YTextField yText3 = newText("Text3");
		yLayout.addElement(yText3);
		YTextField yText4 = newText("Text4");
		yLayout.addElement(yText4);
		YTextField yText5 = newText("Text5");
		yLayout.addElement(yText5);
		YTextField yText6 = newText("Text6");
		yLayout.addElement(yText6);
		YTextField yText7 = newText("Text7");
		yLayout.addElement(yText7);
		YTextField yText8 = newText("Text8");
		yLayout.addElement(yText8);
		YTextField yText9 = newText("Text9");
		yLayout.addElement(yText9);
		YTextField yText10 = newText("Text10");
		yLayout.addElement(yText10);

		// create the styling information
		//
		// text 1 -> alignment
		YGridLayoutCellStyle yStyle1 = yLayout.addGridLayoutCellStyle(yText1);
		yStyle1.setAlignment(YAlignment.TOP_LEFT);
		// text 2 -> alignment
		YGridLayoutCellStyle yStyle2 = yLayout.addGridLayoutCellStyle(yText2);
		yStyle2.setAlignment(YAlignment.MIDDLE_CENTER);
		// text 3 -> alignment
		YGridLayoutCellStyle yStyle3 = yLayout.addGridLayoutCellStyle(yText3);
		yStyle3.setAlignment(YAlignment.BOTTOM_RIGHT);
		// text 4 -> Span from (0,1) to (0,2)
		YGridLayoutCellStyle yStyle4 = yLayout.addGridLayoutCellStyle(yText4);
		yStyle4.setAlignment(YAlignment.FILL_LEFT);
		yStyle4.addSpanInfo(0, 1, 0, 2);
		// text 5 -> alignment
		YGridLayoutCellStyle yStyle5 = yLayout.addGridLayoutCellStyle(yText5);
		yStyle5.setAlignment(YAlignment.MIDDLE_FILL);
		// text 6 -> alignment
		YGridLayoutCellStyle yStyle6 = yLayout.addGridLayoutCellStyle(yText6);
		yStyle6.setAlignment(YAlignment.MIDDLE_FILL);
		// text 7 -> Span from (1,1) to (2,1)
		YGridLayoutCellStyle yStyle7 = yLayout.addGridLayoutCellStyle(yText7);
		yStyle7.setAlignment(YAlignment.FILL_FILL);
		yStyle7.addSpanInfo(1, 2, 2, 2);
		// text 8 -> alignment
		YGridLayoutCellStyle yStyle8 = yLayout.addGridLayoutCellStyle(yText8);
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

	@Override
	public void stop() {

	}
}