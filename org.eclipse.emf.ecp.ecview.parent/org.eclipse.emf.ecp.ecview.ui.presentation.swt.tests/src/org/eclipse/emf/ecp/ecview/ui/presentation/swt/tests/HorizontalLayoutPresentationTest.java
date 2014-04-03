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
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.tests;

import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.presentation.ILayoutPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IHorizontalLayoutEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITextFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.AbstractSWTWidgetPresenter;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.HorizontalLayoutPresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link HorizontalLayoutPresentation}.
 */
@SuppressWarnings("restriction")
public class HorizontalLayoutPresentationTest {

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
	 * Test rendering issues.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_unrender_layout_and_render_byModel() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText1
		// .........> yText2
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText2);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNotNull(presLayout.getWidget());
		Assert.assertEquals(2, presLayout.getChildren().size());

		// text1
		ITextFieldEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText1);
		IWidgetPresentation<Control> presText1 = text1Editpart
				.getPresentation();
		Assert.assertTrue(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNotNull(presText1.getWidget());

		// text2
		ITextFieldEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText2);
		IWidgetPresentation<Control> presText2 = text2Editpart
				.getPresentation();
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
		YHorizontalLayout.getElements().remove(yText1);
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
		YHorizontalLayout.getElements().add(yText1);
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
		YHorizontalLayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());

		// now set the horizontallayout as the content -> Should be rendered
		// again
		yView.setContent(YHorizontalLayout);
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
		YHorizontalLayout.getElements().add(yText1);

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
	 * Test the getChildren method.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getChildren() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText1
		// .........> yText2
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText2);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		Assert.assertEquals(2, presLayout.getChildren().size());

		// unrender the layout and its childs
		yView.setContent(null);
		// layout
		Assert.assertEquals(2, presLayout.getChildren().size());

		// remove from unrendered layout
		YHorizontalLayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());

		// add to unrendered layout
		YHorizontalLayout.getElements().add(yText1);
		Assert.assertEquals(2, presLayout.getChildren().size());

		//
		//
		// remove again from unrendered layout
		YHorizontalLayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());

		// now set the horizontallayout as the content -> Should be rendered
		// again
		yView.setContent(YHorizontalLayout);

		//
		//
		// at least add the text1 again
		YHorizontalLayout.getElements().add(yText1);
		Assert.assertEquals(2, presLayout.getChildren().size());

	}

	/**
	 * Tests the containsChildren method.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_containsChildren() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText1
		// .........> yText2
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText2);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ITextFieldEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText1);
		ITextFieldEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText2);

		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		IWidgetPresentation<Control> presText1 = text1Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText2 = text2Editpart
				.getPresentation();
		Assert.assertTrue(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));

		// unrender the layout and its childs
		yView.setContent(null);
		// layout
		Assert.assertTrue(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));

		// remove from unrendered layout
		YHorizontalLayout.getElements().remove(yText1);
		Assert.assertFalse(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));

		// add to unrendered layout
		YHorizontalLayout.getElements().add(yText1);
		Assert.assertTrue(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));

		//
		//
		// remove again from unrendered layout
		YHorizontalLayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());
		Assert.assertFalse(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));

		// now set the horizontallayout as the content -> Should be rendered
		// again
		yView.setContent(YHorizontalLayout);

		//
		//
		// at least add the text1 again
		YHorizontalLayout.getElements().add(yText1);
		Assert.assertTrue(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));
	}

	/**
	 * Tests the order of children after remove and add.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_orderOfChildren_remove_add() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText1
		// .........> yText2
		// .........> yText3
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText2);
		YTextField yText3 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText3);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ITextFieldEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText1);
		ITextFieldEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText2);
		ITextFieldEditpart text3Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText3);

		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		IWidgetPresentation<Control> presText1 = text1Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText2 = text2Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText3 = text3Editpart
				.getPresentation();

		Composite composite = (Composite) unwrap(presLayout.getWidget());
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

		// remove text1
		//
		YHorizontalLayout.getElements().remove(yText1);
		Assert.assertFalse(presText1.isRendered());

		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[1]);

		Assert.assertEquals(presText2, presLayout.getChildren().get(0));
		Assert.assertEquals(presText3, presLayout.getChildren().get(1));

		// add text1 again
		//
		YHorizontalLayout.getElements().add(yText1);
		Assert.assertTrue(presText1.isRendered());

		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[2]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[1]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(2));
		Assert.assertEquals(presText2, presLayout.getChildren().get(0));
		Assert.assertEquals(presText3, presLayout.getChildren().get(1));
	}

	/**
	 * Tests the order of children after insert.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_orderOfChildren_insert() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText1
		// .........> yText2
		// .........> yText3
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText2);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ITextFieldEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText1);
		ITextFieldEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText2);

		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		IWidgetPresentation<Control> presText1 = text1Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText2 = text2Editpart
				.getPresentation();

		Composite composite = (Composite) unwrap(presLayout.getWidget());
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));

		//
		// create text3 and insert at index 1
		//
		YTextField yText3 = factory.createTextField();
		YHorizontalLayout.getElements().add(1, yText3);

		ITextFieldEditpart text3Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText3);
		IWidgetPresentation<Control> presText3 = text3Editpart
				.getPresentation();

		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[2]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[1]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(2));
		Assert.assertEquals(presText3, presLayout.getChildren().get(1));
	}

	/**
	 * Tests the order of children after adding a child twice.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_orderOfChildren_insert_twice() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText1
		// .........> yText2
		// .........> yText3
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText2);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		try {
			YHorizontalLayout.getElements().add(0, yText2);
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
	}

	/**
	 * Test the order of children after a move in the same parent.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_orderOfChildren_move_inSameParent() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText1
		// .........> yText2
		// .........> yText3
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText2);
		YTextField yText3 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText3);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ITextFieldEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText1);
		ITextFieldEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText2);
		ITextFieldEditpart text3Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText3);

		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		IWidgetPresentation<Control> presText1 = text1Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText2 = text2Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText3 = text3Editpart
				.getPresentation();

		Composite composite = (Composite) unwrap(presLayout.getWidget());
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

		// move text1 to index 1
		//
		YHorizontalLayout.getElements().move(1, yText1);
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(1));
		Assert.assertEquals(presText2, presLayout.getChildren().get(0));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

	}

	/**
	 * Tests the order of children after a move to a different parent.
	 * 
	 * @throws Exception
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	@Test
	public void test_orderOfChildren_move_toDifferentParent() throws Exception {
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout1
		// .........> yText1
		// .........> yText2
		// .........> yText3
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout1 = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout1);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout1.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout1.getElements().add(yText2);
		YTextField yText3 = factory.createTextField();
		YHorizontalLayout1.getElements().add(yText3);

		// the target horizontalLayout1_1
		YHorizontalLayout YHorizontalLayout1_1 = factory
				.createHorizontalLayout();
		YHorizontalLayout1.getElements().add(YHorizontalLayout1_1);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IHorizontalLayoutEditpart layoutEditpart1 = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout1);
		ITextFieldEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText1);
		ITextFieldEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText2);
		ITextFieldEditpart text3Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText3);
		IHorizontalLayoutEditpart layoutEditpart1_1 = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout1_1);

		ILayoutPresentation<Control> presLayout1 = layoutEditpart1
				.getPresentation();
		IWidgetPresentation<Control> presText1 = text1Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText2 = text2Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText3 = text3Editpart
				.getPresentation();
		ILayoutPresentation<Control> presLayout1_1 = layoutEditpart1_1
				.getPresentation();

		Composite composite = (Composite) unwrap(presLayout1.getWidget());
		Composite composite_gl_1_1 = (Composite) unwrap(presLayout1_1
				.getWidget());
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);
		Assert.assertEquals(presLayout1_1.getWidget(),
				composite.getChildren()[3]);
		Assert.assertEquals(0, composite_gl_1_1.getChildren().length);

		Assert.assertEquals(presText1, presLayout1.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout1.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout1.getChildren().get(2));
		Assert.assertEquals(presLayout1_1, presLayout1.getChildren().get(3));

		// move text1 for YHorizontalLayout1 to YHorizontalLayout1_1
		//
		YHorizontalLayout1_1.getElements().add(yText1);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presLayout1_1.getWidget(),
				composite.getChildren()[2]);
		Assert.assertEquals(presText1.getWidget(),
				composite_gl_1_1.getChildren()[0]);

		Assert.assertEquals(presText2, presLayout1.getChildren().get(0));
		Assert.assertEquals(presText3, presLayout1.getChildren().get(1));
		Assert.assertEquals(presLayout1_1.getWidget(),
				composite.getChildren()[2]);
		Assert.assertEquals(presText1, presLayout1_1.getChildren().get(0));
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Test the order of children after a renderChildren(true).
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_orderOfChildren_renderChildren_forceTrue()
			throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText1
		// .........> yText2
		// .........> yText3
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText2);
		YTextField yText3 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText3);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ITextFieldEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText1);
		ITextFieldEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText2);
		ITextFieldEditpart text3Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText3);

		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		IWidgetPresentation<Control> presText1 = text1Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText2 = text2Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText3 = text3Editpart
				.getPresentation();

		Composite composite = (Composite) unwrap(presLayout.getWidget());
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

		// unrender text1
		//
		presText1.unrender();
		Assert.assertEquals(2, composite.getChildren().length);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[1]);

		// NOTE: Unrender does not remove the elements!
		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

		// render again
		presLayout.renderChildren(true);
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));
	}

	/**
	 * Tests order of children.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_orderOfChildren_renderChildren_forceFalse_1()
			throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText1
		// .........> yText2
		// .........> yText3
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText2);
		YTextField yText3 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText3);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ITextFieldEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText1);
		ITextFieldEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText2);
		ITextFieldEditpart text3Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText3);

		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		IWidgetPresentation<Control> presText1 = text1Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText2 = text2Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText3 = text3Editpart
				.getPresentation();

		Composite composite = (Composite) unwrap(presLayout.getWidget());
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

		// unrender text1
		//
		presText1.unrender();
		Assert.assertEquals(2, composite.getChildren().length);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[1]);

		// NOTE: Unrender does not remove the elements!
		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

		presLayout.renderChildren(false);
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

	}

	/**
	 * Tests the order of children.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_orderOfChildren_renderChildren_forceFalse_2()
			throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText1
		// .........> yText2
		// .........> yText3
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText2);
		YTextField yText3 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText3);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ITextFieldEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText1);
		ITextFieldEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText2);
		ITextFieldEditpart text3Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText3);

		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		IWidgetPresentation<Control> presText1 = text1Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText2 = text2Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText3 = text3Editpart
				.getPresentation();

		Composite composite = (Composite) unwrap(presLayout.getWidget());
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

		// unrender text1
		//
		presText2.unrender();
		Assert.assertEquals(2, composite.getChildren().length);
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[1]);

		// NOTE: Unrender does not remove the elements!
		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

		presLayout.renderChildren(false);
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));
	}

	/**
	 * Test the order of children.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_orderOfChildren_renderChildren_forceFalse_3()
			throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText1
		// .........> yText2
		// .........> yText3
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText1 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText2);
		YTextField yText3 = factory.createTextField();
		YHorizontalLayout.getElements().add(yText3);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ITextFieldEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText1);
		ITextFieldEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText2);
		ITextFieldEditpart text3Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText3);

		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		IWidgetPresentation<Control> presText1 = text1Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText2 = text2Editpart
				.getPresentation();
		IWidgetPresentation<Control> presText3 = text3Editpart
				.getPresentation();

		Composite composite = (Composite) unwrap(presLayout.getWidget());
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

		// unrender text1
		//
		presText3.unrender();
		Assert.assertEquals(2, composite.getChildren().length);
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));

		presLayout.renderChildren(false);
		Assert.assertEquals(presText1.getWidget(), composite.getChildren()[0]);
		Assert.assertEquals(presText2.getWidget(), composite.getChildren()[1]);
		Assert.assertEquals(presText3.getWidget(), composite.getChildren()[2]);

		Assert.assertEquals(presText1, presLayout.getChildren().get(0));
		Assert.assertEquals(presText2, presLayout.getChildren().get(1));
		Assert.assertEquals(presText3, presLayout.getChildren().get(2));

	}

	/**
	 * Tests the renderChildren(false).
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_renderChildren_forceFalse() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText = factory.createTextField();
		YHorizontalLayout.getElements().add(yText);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ITextFieldEditpart textEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText);

		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		IWidgetPresentation<Control> presText = textEditpart.getPresentation();

		Control layout = presLayout.getWidget();
		Control text = presText.getWidget();

		// render the text again by the parent
		presLayout.renderChildren(false);
		Control newLayout = presLayout.getWidget();
		Control newText = presText.getWidget();

		Assert.assertSame(layout, newLayout);
		Assert.assertSame(text, newText);
	}

	/**
	 * Test the renderChildren(true).
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_renderChildren_forceTrue() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> YHorizontalLayout
		// .........> yText
		YView yView = factory.createView();
		YHorizontalLayout YHorizontalLayout = factory.createHorizontalLayout();
		yView.setContent(YHorizontalLayout);
		YTextField yText = factory.createTextField();
		YHorizontalLayout.getElements().add(yText);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(YHorizontalLayout);
		ITextFieldEditpart textEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText);

		ILayoutPresentation<Control> presLayout = layoutEditpart
				.getPresentation();
		IWidgetPresentation<Control> presText = textEditpart.getPresentation();

		Control layout = presLayout.getWidget();
		Control text = presText.getWidget();

		// render the text again by the parent
		presLayout.renderChildren(true);
		Control newLayout = presLayout.getWidget();
		Control newText = presText.getWidget();

		Assert.assertSame(layout, newLayout);
		// NOT SAME
		//
		Assert.assertNotSame(text, newText);
	}

	/**
	 * Tests the internal structur of the control.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_InternalStructure() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();
		YHorizontalLayout yLayout = factory.createHorizontalLayout();
		yView.setContent(yLayout);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yLayout);
		ILayoutPresentation<Control> presentation = layoutEditpart
				.getPresentation();
		Composite baseComposite = (Composite) presentation.getWidget();
		Composite content = (Composite) unwrap(baseComposite);

		Assert.assertEquals(1, baseComposite.getChildren().length);

		// assert layout and layout data
		GridLayout layout = (GridLayout) baseComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);

		GridData data = (GridData) content.getLayoutData();
		Assert.assertEquals(SWT.FILL, data.horizontalAlignment);
		Assert.assertEquals(SWT.FILL, data.verticalAlignment);
		Assert.assertEquals(true, data.grabExcessHorizontalSpace);
		Assert.assertEquals(true, data.grabExcessHorizontalSpace);
		Assert.assertEquals(false, data.exclude);
		Assert.assertEquals(0, data.horizontalIndent);
		Assert.assertEquals(1, data.horizontalSpan);
		Assert.assertEquals(0, data.minimumHeight);
		Assert.assertEquals(0, data.minimumWidth);
		Assert.assertEquals(0, data.verticalIndent);
		Assert.assertEquals(1, data.verticalSpan);
		Assert.assertEquals(-1, data.widthHint);

		RowLayout cLayout = (RowLayout) content.getLayout();
		Assert.assertEquals(3, cLayout.spacing);
		Assert.assertEquals(false, cLayout.center);
		Assert.assertEquals(false, cLayout.justify);
		Assert.assertEquals(false, cLayout.pack);
		Assert.assertEquals(true, cLayout.fill);
		Assert.assertEquals(SWT.HORIZONTAL, cLayout.type);
	}
	
	/**
	 * Tests the internal structure of the control.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_InternalStructure_2() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();
		YHorizontalLayout yLayout = factory.createHorizontalLayout();
		yLayout.setFillHorizontal(false); // applied to the row layout -> pack is true
		yLayout.setSpacing(false); // applied to the parent grid layout
		yView.setContent(yLayout);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IHorizontalLayoutEditpart layoutEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yLayout);
		ILayoutPresentation<Control> presentation = layoutEditpart
				.getPresentation();
		Composite baseComposite = (Composite) presentation.getWidget();
		Composite content = (Composite) unwrap(baseComposite);

		Assert.assertEquals(1, baseComposite.getChildren().length);

		RowLayout cLayout = (RowLayout) content.getLayout();
		Assert.assertEquals(3, cLayout.spacing);
		Assert.assertEquals(false, cLayout.center);
		Assert.assertEquals(false, cLayout.justify);
		Assert.assertEquals(true, cLayout.pack);
		Assert.assertEquals(false, cLayout.fill);
		Assert.assertEquals(SWT.HORIZONTAL, cLayout.type);
	}

	/**
	 * Tests the internal structure of css classes and IDs.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_InternalStructure__CSS() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();
		YHorizontalLayout yLayout = factory.createHorizontalLayout();
		yView.setContent(yLayout);
		YHorizontalLayout yInternalLayout1 = factory.createHorizontalLayout();
		yInternalLayout1.setCssID("ID_0815");
		yInternalLayout1.setCssClass("anyOtherClass");
		yLayout.addElement(yInternalLayout1);
		YHorizontalLayout yInternalLayout2 = factory.createHorizontalLayout();
		yLayout.addElement(yInternalLayout2);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IHorizontalLayoutEditpart internalLayout1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yInternalLayout1);
		IHorizontalLayoutEditpart internalLayout2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yInternalLayout2);
		ILayoutPresentation<Control> internalLayout1Presentation = internalLayout1Editpart
				.getPresentation();
		ILayoutPresentation<Control> internalLayout2Presentation = internalLayout2Editpart
				.getPresentation();
		Composite internalLayout1BaseComposite = (Composite) internalLayout1Presentation
				.getWidget();
		Composite internalLayout2BaseComposite = (Composite) internalLayout2Presentation
				.getWidget();
		Composite internalLayout1 = (Composite) unwrap(internalLayout1BaseComposite);
		Composite internalLayout2 = (Composite) unwrap(internalLayout2BaseComposite);

		// assert css class
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
				WidgetElement.getCSSClass(internalLayout1BaseComposite));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
				WidgetElement.getCSSClass(internalLayout2BaseComposite));
		Assert.assertEquals("anyOtherClass",
				WidgetElement.getCSSClass(internalLayout1));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL,
				WidgetElement.getCSSClass(internalLayout2));

		// assert css id
		Assert.assertNull(WidgetElement.getID(internalLayout1));
		Assert.assertEquals("ID_0815",
				WidgetElement.getID(internalLayout1BaseComposite));
		Assert.assertNull(WidgetElement.getID(internalLayout2));
		Assert.assertEquals(internalLayout2Editpart.getId(),
				WidgetElement.getID(internalLayout2BaseComposite));
	}

	/**
	 * Unwraps the control from its parent composite.
	 * 
	 * @param control
	 * @return
	 */
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
	 * @param yView
	 *            model element
	 * @return control
	 */
	@SuppressWarnings("unchecked")
	protected Control getControl(YElement yView) {
		IElementEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yView);

		IWidgetPresentation<Control> presentation = null;
		if (editpart instanceof IViewEditpart) {
			presentation = (IWidgetPresentation<Control>) ((IViewEditpart) editpart)
					.getPresentation();
		} else {
			presentation = ((IEmbeddableEditpart) editpart).getPresentation();
		}
		Control widget = presentation.getWidget();
		return widget;
	}
}
