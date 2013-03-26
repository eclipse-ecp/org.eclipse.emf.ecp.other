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
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.tests;

import junit.framework.Assert;

import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.presentation.ILayoutPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IGridLayoutEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITextFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;

/**
 * Test common presentation issues.
 */
public class CommonPresentationTest {

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
	 * Test the rendering and unrendering by the model.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_isRendered_unrender_byModel() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YTextField yText = factory.createTextField();
		yGridlayout.getElements().add(yText);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		ITextFieldEditpart textEditpart = DelegatingEditPartManager.getInstance().getEditpart(yText);
		IWidgetPresentation<Control> presentation = textEditpart.getPresentation();
		Assert.assertTrue(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());

		yGridlayout.getElements().remove(yText);
		Assert.assertFalse(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());
	}

	/**
	 * Tests render, unrender and render again by the model.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_isRendered__unrender_and_render_byModel() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YTextField yText = factory.createTextField();
		yGridlayout.getElements().add(yText);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		ITextFieldEditpart textEditpart = DelegatingEditPartManager.getInstance().getEditpart(yText);
		IWidgetPresentation<Control> presentation = textEditpart.getPresentation();
		Assert.assertTrue(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());
		Assert.assertNotNull(presentation.getWidget());

		yGridlayout.getElements().remove(yText);
		Assert.assertFalse(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());
		Assert.assertNull(presentation.getWidget());

		yGridlayout.getElements().add(yText);
		Assert.assertTrue(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());
		Assert.assertNotNull(presentation.getWidget());
	}

	/**
	 * Tests the rendering and unrendering with a layout.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_isRendered_unrender_layout_and_render_byModel() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText1
		// .........> yText2
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YTextField yText1 = factory.createTextField();
		yGridlayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		yGridlayout.getElements().add(yText2);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IGridLayoutEditpart layoutEditpart = DelegatingEditPartManager.getInstance().getEditpart(yGridlayout);
		ILayoutPresentation<Control> presLayout = layoutEditpart.getPresentation();
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNotNull(presLayout.getWidget());
		Assert.assertEquals(2, presLayout.getChildren().size());

		// text1
		ITextFieldEditpart text1Editpart = DelegatingEditPartManager.getInstance().getEditpart(yText1);
		IWidgetPresentation<Control> presText1 = text1Editpart.getPresentation();
		Assert.assertTrue(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNotNull(presText1.getWidget());

		// text2
		ITextFieldEditpart text2Editpart = DelegatingEditPartManager.getInstance().getEditpart(yText2);
		IWidgetPresentation<Control> presText2 = text2Editpart.getPresentation();
		Assert.assertTrue(presText2.isRendered());
		Assert.assertFalse(presText2.isDisposed());
		Assert.assertNotNull(presText2.getWidget());

		// unrender the layout and its childs
		yView.setContent(null);
		// layout
		Assert.assertFalse(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNull(presLayout.getWidget());
		Assert.assertEquals(2, presLayout.getChildren().size());
		// text1
		Assert.assertFalse(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNull(presText1.getWidget());
		// text2
		Assert.assertFalse(presText2.isRendered());
		Assert.assertFalse(presText2.isDisposed());
		Assert.assertNull(presText2.getWidget());

		// remove from unrendered layout
		yGridlayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());

		// check text1
		// layout
		Assert.assertFalse(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNull(presLayout.getWidget());
		// text1
		Assert.assertFalse(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNull(presText1.getWidget());

		// add to unrendered layout
		yGridlayout.getElements().add(yText1);
		Assert.assertEquals(2, presLayout.getChildren().size());

		// layout
		Assert.assertFalse(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNull(presLayout.getWidget());
		// text1
		Assert.assertFalse(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNull(presText1.getWidget());

		//
		//
		// remove again from unrendered layout
		yGridlayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());

		// now set the gridlayout as the content -> Should be rendered again
		yView.setContent(yGridlayout);
		// layout
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNotNull(presLayout.getWidget());
		// text1 --> Is null and not rendered
		Assert.assertFalse(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNull(presText1.getWidget());
		// text2
		Assert.assertTrue(presText2.isRendered());
		Assert.assertFalse(presText2.isDisposed());
		Assert.assertNotNull(presText2.getWidget());

		//
		//
		// at least add the text1 again
		yGridlayout.getElements().add(yText1);

		// layout
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNotNull(presLayout.getWidget());
		// text1
		Assert.assertTrue(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNotNull(presText1.getWidget());
		// text2
		Assert.assertTrue(presText2.isRendered());
		Assert.assertFalse(presText2.isDisposed());
		Assert.assertNotNull(presText2.getWidget());

	}

	/**
	 * Tests unrendering of child presentations.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_isRendered_unrender_childByPresentation() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YTextField yText = factory.createTextField();
		yGridlayout.getElements().add(yText);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IGridLayoutEditpart layoutEditpart = DelegatingEditPartManager.getInstance().getEditpart(yGridlayout);
		ITextFieldEditpart textEditpart = DelegatingEditPartManager.getInstance().getEditpart(yText);

		ILayoutPresentation<Control> presLayout = layoutEditpart.getPresentation();
		IWidgetPresentation<Control> presText = textEditpart.getPresentation();
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertNotNull(presLayout.getWidget());
		Assert.assertTrue(presText.isRendered());
		Assert.assertNotNull(presText.getWidget());

		presText.unrender();
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertNotNull(presLayout.getWidget());
		Assert.assertFalse(presText.isRendered());
		Assert.assertNull(presText.getWidget());

		// render the text again by the parent
		presLayout.renderChildren(false);
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertNotNull(presLayout.getWidget());
		Assert.assertTrue(presText.isRendered());
		Assert.assertNotNull(presText.getWidget());
	}

	/**
	 * Unwraps the control from its parent composite.
	 * 
	 * @param control
	 * @return
	 */
	@SuppressWarnings("unused")
	private Control unwrap(Control control) {
		if (control instanceof Composite) {
			Composite composite = (Composite) control;
			return composite.getChildren()[0];
		}
		return control;
	}

	/**
	 * Returns the control for the given model element.
	 * 
	 * @param yView model element
	 * @return control
	 */
	protected Control getControl(YElement yView) {
		IElementEditpart editpart = DelegatingEditPartManager.getInstance().getEditpart(yView);

		IWidgetPresentation<Control> presentation = null;
		if (editpart instanceof IViewEditpart) {
			presentation = ((IViewEditpart) editpart).getPresentation();
		} else {
			presentation = ((IEmbeddableEditpart) editpart).getPresentation();
		}
		Control widget = presentation.getWidget();
		return widget;
	}
}
