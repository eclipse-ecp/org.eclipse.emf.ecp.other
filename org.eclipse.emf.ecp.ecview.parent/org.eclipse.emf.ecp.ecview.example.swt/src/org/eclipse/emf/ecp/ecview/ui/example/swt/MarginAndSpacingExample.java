/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.example.swt;

import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
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
public class MarginAndSpacingExample implements IApplication {

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
		// ......> yGridLayout
		// .........> yText1
		// .........> yText2
		// .........> yText3
		// .........> yText4
		// .........> yText5
		// .........> yText6
		YView yView = factory.createView();
		yView.setCssClass("marginAndSpacingExample");
		yView.setMargin(true);

		YGridLayout yLayout = factory.createGridLayout();
		yLayout.setCssClass("gridlayout");
		yLayout.setMargin(true);
		yLayout.setSpacing(true);

		yView.setContent(yLayout);
		YTextField yText1 = factory.createTextField();
		yLayout.addElement(yText1);
		YTextField yText2 = factory.createTextField();
		yLayout.addElement(yText2);
		YTextField yText3 = factory.createTextField();
		yLayout.addElement(yText3);
		YTextField yText4 = factory.createTextField();
		yLayout.addElement(yText4);
		YTextField yText5 = factory.createTextField();
		yLayout.addElement(yText5);
		YTextField yText6 = factory.createTextField();
		yLayout.addElement(yText6);

		// create the rendering options
		//
		Map<String, Object> options = new HashMap<String, Object>();
		Set<URL> cssFiles = new HashSet<URL>();
		cssFiles.add(Activator.getContext().getBundle()
				.getEntry("/theming/css/example.css"));
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

	@Override
	public void stop() {

	}
}