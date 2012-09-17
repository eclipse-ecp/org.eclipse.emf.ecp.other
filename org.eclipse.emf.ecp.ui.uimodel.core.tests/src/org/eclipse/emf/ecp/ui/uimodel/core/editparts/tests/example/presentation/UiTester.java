/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.tests.example.presentation;

/*
 * GridLayout snippet: align widgets in a GridLayout
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 * @since 3.0
 */
import junit.framework.Assert;

import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ContextException;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.tests.emf.DefaultRealm;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.ExampleRenderer;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal.PresenterFactory;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;

public class UiTester {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager.getInstance();
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;
	private UimodelExtensionFactory extensionFactory = UimodelExtensionFactory.eINSTANCE;

	@SuppressWarnings("restriction")
	public void setup() {
		DefaultRealm.setup();
		editpartManager.clear();
		editpartManager.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager());
		editpartManager
			.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl.EditpartManager());

		DelegatingPresenterFactory.getInstance().addFactory(new PresenterFactory());
	}

	public void build() {
		setup();
		
		
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText1
		// .........> yText2
		YUiView yView = modelFactory.createYUiView();
		YUiGridLayout yGridLayout = extensionFactory.createYUiGridLayout();
		yView.setContent(yGridLayout);
		YUiTextField yText1 = extensionFactory.createYUiTextField();
		yGridLayout.getElements().add(yText1);
		YUiTextField yText2 = extensionFactory.createYUiTextField();
		yGridLayout.getElements().add(yText2);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			ExampleRenderer renderer = new ExampleRenderer();
			renderer.render(shell, yView);
		} catch (ContextException e) {
		}

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();

	}

	public static void main(String[] args) {
		new UiTester().build();
	}
}