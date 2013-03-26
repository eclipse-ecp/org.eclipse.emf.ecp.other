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
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.tests.binding;

import java.util.Locale;

import junit.framework.Assert;

import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YDecimalDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.DecimalFieldPresentation;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.TextFieldPresentation;
import org.eclipse.riena.ui.ridgets.IDecimalTextRidget;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link TextFieldPresentation}.
 */
@SuppressWarnings("restriction")
public class DecimalFieldBindingTest {

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

		Locale.setDefault(Locale.GERMANY);

		// build the view model
		// ...> yView
		// ......> yDecimal
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YDecimalField yDecimal1 = factory.createDecimalField();
		yLayout.addElement(yDecimal1);
		YDecimalField yDecimal2 = factory.createDecimalField();
		yLayout.addElement(yDecimal2);

		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yDecimal1.createValueEndpoint(),
				yDecimal2.createValueEndpoint());

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IDecimalTextRidget text1 = getText(yDecimal1);
		IDecimalTextRidget text2 = getText(yDecimal2);

		text1.setText("1234,12");
		text2.updateFromModel();
		Assert.assertEquals(1234.12, yDecimal1.getValue());
		Assert.assertEquals(1234.12, yDecimal2.getValue());
		Assert.assertEquals("1.234,12", text2.getText());

		text2.setText("4321,09");
		text1.updateFromModel();
		Assert.assertEquals("4.321,09", text1.getText());
		Assert.assertEquals(4321.09, yDecimal1.getValue());
		Assert.assertEquals(4321.09, yDecimal2.getValue());
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
		YDecimalField yDecimal1 = factory.createDecimalField();
		yLayout.addElement(yDecimal1);
		YDecimalField yDecimal2 = factory.createDecimalField();
		yLayout.addElement(yDecimal2);

		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yDecimal1.createValueEndpoint(),
				yDecimal2.createValueEndpoint());

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IDecimalTextRidget ridget1 = getText(yDecimal1);
		IDecimalTextRidget ridget2 = getText(yDecimal2);

		yDecimal1.setValue(1234.12);
		ridget1.updateFromModel();
		ridget2.updateFromModel();
		Assert.assertEquals(1234.12, yDecimal2.getValue());
		Assert.assertEquals("1.234,12", ridget1.getText());
		Assert.assertEquals("1.234,12", ridget2.getText());

		yDecimal2.setValue(6543.21);
		ridget1.updateFromModel();
		ridget2.updateFromModel();
		Assert.assertEquals(6543.21, yDecimal1.getValue());
		Assert.assertEquals("6.543,21", ridget1.getText());
		Assert.assertEquals("6.543,21", ridget2.getText());
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
		YDecimalField yNumeric1 = factory.createDecimalField();
		yLayout.addElement(yNumeric1);
		YDecimalField yNumeric2 = factory.createDecimalField();
		yLayout.addElement(yNumeric2);

		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yNumeric1.createValueEndpoint(),
				yNumeric2.createValueEndpoint());

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IDecimalTextRidget ridget1 = getText(yNumeric1);
		IDecimalTextRidget ridget2 = getText(yNumeric2);

		yNumeric1.setValue(123456);
		ridget1.updateFromModel();
		ridget2.updateFromModel();
		Assert.assertEquals(123456.0, yNumeric2.getValue());
		Assert.assertEquals("123.456", ridget1.getText());
		Assert.assertEquals("123.456", ridget2.getText());

		YDecimalDatatype decimalDt = factory.createDecimalDatatype();
		decimalDt.setGrouping(false);
		yNumeric1.setDatatype(decimalDt);

		Assert.assertEquals("123456", ridget1.getText().trim());
		Assert.assertEquals("123.456", ridget2.getText());

		decimalDt.setGrouping(true);
		Assert.assertEquals("123.456", ridget1.getText());
		Assert.assertEquals("123.456", ridget2.getText());
	}

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
		YDecimalField yDecimal1 = factory.createDecimalField();
		yLayout.addElement(yDecimal1);
		YDecimalField yDecimal2 = factory.createDecimalField();
		yLayout.addElement(yDecimal2);

		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yDecimal1.createValueEndpoint(),
				yDecimal2.createValueEndpoint());

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IDecimalTextRidget ridget1 = getText(yDecimal1);
		IDecimalTextRidget ridget2 = getText(yDecimal2);

		yDecimal1.setValue(123456);
		ridget1.updateFromModel();
		ridget2.updateFromModel();
		Assert.assertTrue(ridget1.isMarkNegative());
		Assert.assertTrue(ridget2.isMarkNegative());

		YDecimalDatatype decimalDt = factory.createDecimalDatatype();
		decimalDt.setMarkNegative(false);
		yDecimal1.setDatatype(decimalDt);

		Assert.assertFalse(ridget1.isMarkNegative());
		Assert.assertTrue(ridget2.isMarkNegative());

		decimalDt.setMarkNegative(true);
		Assert.assertTrue(ridget1.isMarkNegative());
		Assert.assertTrue(ridget2.isMarkNegative());
	}

	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind__precision() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YDecimalField yDecimal1 = factory.createDecimalField();
		yLayout.addElement(yDecimal1);
		YDecimalField yDecimal2 = factory.createDecimalField();
		yLayout.addElement(yDecimal2);

		YBindingSet yBindingSet = yView.getOrCreateBindingSet();
		yBindingSet.addBinding(yDecimal1.createValueEndpoint(),
				yDecimal2.createValueEndpoint());

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IDecimalTextRidget ridget1 = getText(yDecimal1);
		IDecimalTextRidget ridget2 = getText(yDecimal2);

		yDecimal1.setValue(123456.12);
		ridget1.updateFromModel();
		ridget2.updateFromModel();
		Assert.assertEquals(123456.12, yDecimal2.getValue());
		Assert.assertEquals(2, ridget1.getPrecision());
		Assert.assertEquals(2, ridget2.getPrecision());
		Assert.assertEquals("123.456,12", ridget1.getText());
		Assert.assertEquals("123.456,12", ridget2.getText());

		YDecimalDatatype decimalDt = factory.createDecimalDatatype();
		decimalDt.setPrecision(1);
		yDecimal1.setDatatype(decimalDt);
		Assert.assertEquals("123.456,1", ridget1.getText());
		Assert.assertEquals(123456.1, yDecimal1.getValue());
		Assert.assertEquals(123456.1, yDecimal2.getValue());
		Assert.assertEquals(1, ridget1.getPrecision());
		Assert.assertEquals(2, ridget2.getPrecision());

		Assert.assertEquals("123.456,1", ridget2.getText());

		decimalDt.setPrecision(3);
		Assert.assertEquals(123456.1, yDecimal1.getValue());
		Assert.assertEquals(123456.1, yDecimal2.getValue());
		Assert.assertEquals(3, ridget1.getPrecision());
		Assert.assertEquals(2, ridget2.getPrecision());
		Assert.assertEquals("123.456,1", ridget1.getText());
		Assert.assertEquals("123.456,1", ridget2.getText());

		yDecimal1.setValue(123456.1234);
		Assert.assertEquals(123456.123, yDecimal1.getValue());
		Assert.assertEquals(123456.12, yDecimal2.getValue());
		Assert.assertEquals("123.456,123", ridget1.getText());
		Assert.assertEquals("123.456,12", ridget2.getText());

	}

	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind__simpleBinding() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YDecimalField yDecimal1 = factory.createDecimalField();
		yLayout.addElement(yDecimal1);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IDecimalTextRidget ridget1 = getText(yDecimal1);

		yDecimal1.setValue(123456.12);
		ridget1.updateFromModel();
		Assert.assertEquals(2, ridget1.getPrecision());
		Assert.assertEquals("123.456,12", ridget1.getText());
		Assert.assertEquals(123456.12, yDecimal1.getValue());

		// clean ridget
		yDecimal1.setValue(0);
		Assert.assertEquals("0", ridget1.getText());

		yDecimal1.setValue(123456.123);
		Assert.assertEquals("123.456,12", ridget1.getText());
		Assert.assertEquals(123456.12, yDecimal1.getValue());

		// change the value at ridget and update proceeds
		ridget1.setText("123.456,11");
		Assert.assertEquals(123456.11, yDecimal1.getValue());

		YDecimalDatatype decimalDt = factory.createDecimalDatatype();
		decimalDt.setPrecision(1);
		yDecimal1.setDatatype(decimalDt);
		Assert.assertEquals("123.456,1", ridget1.getText());
		Assert.assertEquals(123456.1, yDecimal1.getValue());
		Assert.assertEquals(1, ridget1.getPrecision());

		decimalDt.setPrecision(3);
		Assert.assertEquals(123456.1, yDecimal1.getValue());
		Assert.assertEquals(3, ridget1.getPrecision());
		Assert.assertEquals("123.456,1", ridget1.getText());

		decimalDt.setPrecision(2);
		yDecimal1.setValue(123456.1234);
		Assert.assertEquals("123.456,12", ridget1.getText());
		Assert.assertEquals(123456.12, yDecimal1.getValue());

	}

	/**
	 * Returns the control for the given model element.
	 * 
	 * @param yView
	 *            model element
	 * @return control
	 */
	protected IDecimalTextRidget getText(YElement yView) {
		IElementEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yView);

		DecimalFieldPresentation presentation = null;
		if (editpart instanceof IViewEditpart) {
			presentation = ((IViewEditpart) editpart).getPresentation();
		} else {
			presentation = ((IEmbeddableEditpart) editpart).getPresentation();
		}
		return presentation.getRidget();
	}
}
