/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.uimodel.example.swt.simple;

import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
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
public class MarginAndSpacingExample implements IApplication {

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
		// ......> yGridLayout
		// .........> yText1
		// .........> yText2
		// .........> yText3
		// .........> yText4
		// .........> yText5
		// .........> yText6
		YUiView yView = factory.createYView();
		yView.setCssClass("marginAndSpacingExample");
		yView.setMargin(true);

		YUiGridLayout yGridLayout = factory.createYGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setMargin(true);
		yGridLayout.setSpacing(true);

		yView.setContent(yGridLayout);
		YUiTextField yText1 = factory.createYTextField();
		yGridLayout.getElements().add(yText1);
		YUiTextField yText2 = factory.createYTextField();
		yGridLayout.getElements().add(yText2);
		YUiTextField yText3 = factory.createYTextField();
		yGridLayout.getElements().add(yText3);
		YUiTextField yText4 = factory.createYTextField();
		yGridLayout.getElements().add(yText4);
		YUiTextField yText5 = factory.createYTextField();
		yGridLayout.getElements().add(yText5);
		YUiTextField yText6 = factory.createYTextField();
		yGridLayout.getElements().add(yText6);

		// create the rendering options
		//
		Map<String, Object> options = new HashMap<String, Object>();
		Set<URL> cssFiles = new HashSet<URL>();
		cssFiles.add(Activator.getContext().getBundle().getEntry("/theming/css/example.css"));
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

	@Override
	public void stop() {

	}
}