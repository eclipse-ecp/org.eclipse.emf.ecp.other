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
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.tests.binding;

import junit.framework.Assert;

import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.TextFieldPresentation;
import org.eclipse.riena.ui.ridgets.ITextRidget;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link TextFieldPresentation}.
 */
@SuppressWarnings("restriction")
public class TextFieldBindingTest {

	private SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();
	private Display display = Display.getCurrent();
	private Shell shell;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		shell = new Shell(display);
		shell.setLayout(new FillLayout());
	}

	/**
	 * Test the internal structure based on CSS.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind__testRidget() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YTextField yText1 = factory.createTextField();
		yLayout.addElement(yText1);
		YTextField yText2 = factory.createTextField();
		yLayout.addElement(yText2);

		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yText1.createValueEndpoint(),
				yText2.createValueEndpoint());

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		ITextRidget text1 = getText(yText1);
		ITextRidget text2 = getText(yText2);

		text1.setText("call1");
		Assert.assertEquals("call1", text2.getText());
		Assert.assertEquals("call1", yText1.getValue());
		Assert.assertEquals("call1", yText2.getValue());

		text2.setText("call2");
		Assert.assertEquals("call2", text1.getText());
		Assert.assertEquals("call2", yText1.getValue());
		Assert.assertEquals("call2", yText2.getValue());
	}
	
	
	/**
	 * Test the internal structure based on CSS.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind__testAPI() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YTextField yText1 = factory.createTextField();
		yLayout.addElement(yText1);
		YTextField yText2 = factory.createTextField();
		yLayout.addElement(yText2);

		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yText1.createValueEndpoint(),
				yText2.createValueEndpoint());

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		ITextRidget textRidget1 = getText(yText1);
		ITextRidget textRidget2 = getText(yText2);

		yText1.setValue("call1");
		Assert.assertEquals("call1", yText2.getValue());
		Assert.assertEquals("call1", textRidget1.getText());
		Assert.assertEquals("call1", textRidget2.getText());

		yText2.setValue("call2");
		Assert.assertEquals("call2", yText1.getValue());
		Assert.assertEquals("call2", textRidget1.getText());
		Assert.assertEquals("call2", textRidget2.getText());
	}

	/**
	 * Returns the control for the given model element.
	 * 
	 * @param yView
	 *            model element
	 * @return control
	 */
	protected ITextRidget getText(YElement yView) {
		IElementEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yView);

		TextFieldPresentation presentation = null;
		if (editpart instanceof IViewEditpart) {
			presentation = ((IViewEditpart) editpart).getPresentation();
		} else {
			presentation = ((IEmbeddableEditpart) editpart).getPresentation();
		}
		return presentation.getTextRidget();
	}
}
