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
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YNumericDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.NumericFieldPresentation;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.TextFieldPresentation;
import org.eclipse.riena.ui.ridgets.INumericTextRidget;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link TextFieldPresentation}.
 */
@SuppressWarnings("restriction")
public class NumericFieldBindingTest {

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

	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind__testRidget() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yNumeric
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YNumericField yNumeric1 = factory.createNumericField();
		yLayout.addElement(yNumeric1);
		YNumericField yNumeric2 = factory.createNumericField();
		yLayout.addElement(yNumeric2);

		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yNumeric1.createValueEndpoint(),
				yNumeric2.createValueEndpoint());

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		INumericTextRidget text1 = getText(yNumeric1);
		INumericTextRidget text2 = getText(yNumeric2);

		text1.setText("1234");
		text2.updateFromModel();
		Assert.assertEquals("1.234", text2.getText());
		Assert.assertEquals(1234, yNumeric1.getValue());
		Assert.assertEquals(1234, yNumeric2.getValue());

		text2.setText("4321");
		text1.updateFromModel();
		Assert.assertEquals("4.321", text1.getText());
		Assert.assertEquals(4321, yNumeric1.getValue());
		Assert.assertEquals(4321, yNumeric2.getValue());
	}

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
		YNumericField yNumeric1 = factory.createNumericField();
		yLayout.addElement(yNumeric1);
		YNumericField yNumeric2 = factory.createNumericField();
		yLayout.addElement(yNumeric2);

		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yNumeric1.createValueEndpoint(),
				yNumeric2.createValueEndpoint());

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		INumericTextRidget ridget1 = getText(yNumeric1);
		INumericTextRidget ridget2 = getText(yNumeric2);

		yNumeric1.setValue(123456);
		ridget1.updateFromModel();
		ridget2.updateFromModel();
		Assert.assertEquals(123456, yNumeric2.getValue());
		Assert.assertEquals("123.456", ridget1.getText());
		Assert.assertEquals("123.456", ridget2.getText());

		yNumeric2.setValue(654321);
		ridget1.updateFromModel();
		ridget2.updateFromModel();
		Assert.assertEquals(654321, yNumeric1.getValue());
		Assert.assertEquals("654.321", ridget1.getText());
		Assert.assertEquals("654.321", ridget2.getText());
	}

	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind__grouping() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YNumericField yNumeric1 = factory.createNumericField();
		yLayout.addElement(yNumeric1);
		YNumericField yNumeric2 = factory.createNumericField();
		yLayout.addElement(yNumeric2);

		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yNumeric1.createValueEndpoint(),
				yNumeric2.createValueEndpoint());

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		INumericTextRidget ridget1 = getText(yNumeric1);
		INumericTextRidget ridget2 = getText(yNumeric2);

		yNumeric1.setValue(123456);
		ridget1.updateFromModel();
		ridget2.updateFromModel();
		Assert.assertEquals(123456, yNumeric2.getValue());
		Assert.assertEquals("123.456", ridget1.getText());
		Assert.assertEquals("123.456", ridget2.getText());

		YNumericDatatype numericDt = factory.createNumericDatatype();
		numericDt.setGrouping(false);
		yNumeric1.setDatatype(numericDt);

		Assert.assertEquals("123456", ridget1.getText());
		Assert.assertEquals("123.456", ridget2.getText());

		numericDt.setGrouping(true);
		Assert.assertEquals("123.456", ridget1.getText());
		Assert.assertEquals("123.456", ridget2.getText());
	}

	/**
	 * Test the internal structure based on CSS.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind__markNegative() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YNumericField yNumeric1 = factory.createNumericField();
		yLayout.addElement(yNumeric1);
		YNumericField yNumeric2 = factory.createNumericField();
		yLayout.addElement(yNumeric2);

		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yNumeric1.createValueEndpoint(),
				yNumeric2.createValueEndpoint());

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		INumericTextRidget ridget1 = getText(yNumeric1);
		INumericTextRidget ridget2 = getText(yNumeric2);

		yNumeric1.setValue(123456);
		ridget1.updateFromModel();
		ridget2.updateFromModel();
		Assert.assertTrue(ridget1.isMarkNegative());
		Assert.assertTrue(ridget2.isMarkNegative());

		YNumericDatatype numericDt = factory.createNumericDatatype();
		numericDt.setMarkNegative(false);
		yNumeric1.setDatatype(numericDt);

		Assert.assertFalse(ridget1.isMarkNegative());
		Assert.assertTrue(ridget2.isMarkNegative());

		numericDt.setMarkNegative(true);
		Assert.assertTrue(ridget1.isMarkNegative());
		Assert.assertTrue(ridget2.isMarkNegative());
	}

	/**
	 * Returns the control for the given model element.
	 * 
	 * @param yView
	 *            model element
	 * @return control
	 */
	protected INumericTextRidget getText(YElement yView) {
		IElementEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yView);

		NumericFieldPresentation presentation = null;
		if (editpart instanceof IViewEditpart) {
			presentation = ((IViewEditpart) editpart).getPresentation();
		} else {
			presentation = ((IEmbeddableEditpart) editpart).getPresentation();
		}
		return presentation.getRidget();
	}
}
