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

import org.eclipse.emf.ecp.ecview.common.context.ContextException;
import org.eclipse.emf.ecp.ecview.common.context.ViewContext;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests common build issues.
 */
public class BuildViewTest {

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
	 * Unwraps the control from its parent composite.
	 * 
	 * @param control
	 * @return
	 */
	private Control unwrap1(Control control) {
		if (control instanceof Composite) {
			Composite composite = (Composite) control;
			return composite.getChildren()[1];
		}
		return control;
	}

	/**
	 * Tests the build of a simple view without any content.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void build_View() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		// assert the created elements
		//
		Control[] childs = shell.getChildren();
		Assert.assertEquals(1, childs.length);

		Composite viewComposite = (Composite) unwrap(childs[0]);
		Assert.assertTrue(viewComposite.getLayout() instanceof FillLayout);

		// viewComposite has no childs
		//
		Assert.assertEquals(0, viewComposite.getChildren().length);
	}

	/**
	 * Tests a build with a text.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void build_ViewWithText() {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();
		YTextField yTeyt = factory.createTextField();
		yView.setContent(yTeyt);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		// assert the created elements
		//
		Control[] childs = shell.getChildren();
		Assert.assertEquals(1, childs.length);

		Composite viewComposite = (Composite) unwrap(childs[0]);
		Assert.assertTrue(viewComposite.getLayout() instanceof FillLayout);

		Control[] viewChilds = viewComposite.getChildren();
		Assert.assertEquals(1, viewChilds.length);

		Label label = (Label) unwrap(viewChilds[0]);
		Text text = (Text) unwrap1(viewChilds[0]);
		Assert.assertNotNull(label);
		Assert.assertNotNull(text);
		Assert.assertTrue(text.getLayoutData() instanceof GridData);
	}

	/**
	 * Test the replacing of a text.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void build_ViewWithText__replaceText() {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();
		YTextField yTeyt = factory.createTextField();
		yView.setContent(yTeyt);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) unwrap(shell.getChildren()[0]);
		// ensure that there is a control in the viewComposite
		Assert.assertEquals(1, viewComposite.getChildren().length);

		// now remove the text from the view
		//
		yView.setContent(null);

		// ensure, that no child is contained now
		Control[] viewChilds = viewComposite.getChildren();
		Assert.assertEquals(0, viewChilds.length);
	}

	/**
	 * Tests the build of a layout and text.
	 */
	@SuppressWarnings("unused")
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void build_ViewWithGridlayoutAndText() {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText1
		// .........> yText2
		YView yView = factory.createView();
		YGridLayout yGridLayout = factory.createGridLayout();
		yView.setContent(yGridLayout);
		YTextField yText1 = factory.createTextField();
		yGridLayout.getElements().add(yText1);
		YTextField yText2 = factory.createTextField();
		yGridLayout.getElements().add(yText2);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) unwrap(shell.getChildren()[0]);
		// ensure that there is a control in the viewComposite
		Assert.assertEquals(1, viewComposite.getChildren().length);

		Composite layoutComposite = (Composite) unwrap(viewComposite
				.getChildren()[0]);
		// ensure that there is a control in the viewComposite
		Assert.assertEquals(2, layoutComposite.getChildren().length);

		Label label1 = (Label) unwrap(layoutComposite.getChildren()[0]);
		Label Label2 = (Label) unwrap(layoutComposite.getChildren()[1]);
	}

	/**
	 * Tests setting the same instance twice.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_newInstance() {
		// END SUPRESS CATCH EXCEPTION
		// ...........> field2
		YView view1 = factory.createView();
		IViewEditpart view1EditPart = DelegatingEditPartManager.getInstance()
				.getEditpart(view1);

		// contexts null
		//
		Assert.assertNull(view1EditPart.getContext());

		// set context 1
		//
		ViewContext viewContext1 = new ViewContext(view1EditPart);
		Assert.assertSame(viewContext1, view1EditPart.getContext());

		ViewContext viewContext2 = new ViewContext(view1EditPart);
		Assert.assertSame(viewContext2, view1EditPart.getContext());

		// mark rendered
		//
		try {
			viewContext2.render(ECViewSwtRenderer.UI_KIT_URI, shell, null);
		} catch (ContextException e1) {
			throw new RuntimeException(e1);
		}

		// set the same instance twice
		//
		view1EditPart.setContext(viewContext2);
		Assert.assertSame(viewContext2, view1EditPart.getContext());

		try {
			// set a new instance
			//
			new ViewContext(view1EditPart);
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
	}

	/**
	 * Tests presentation URI issues.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_presentationURI() {
		// END SUPRESS CATCH EXCEPTION
		IViewEditpart viewEditPart = DelegatingEditPartManager.getInstance()
				.createEditpart(
						"http://eclipse.org/emf/ecp/ecview/common/view",
						IViewEditpart.class);
		ViewContext context = new ViewContext(viewEditPart);

		Assert.assertNull(context.getPresentationURI());
		context.setPresentationURI("test");
		Assert.assertEquals("test", context.getPresentationURI());

		try {
			context.render(ECViewSwtRenderer.UI_KIT_URI, shell, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		try {
			context.setPresentationURI("test");
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}
	}

	/**
	 * Tests root layout issues.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_rootLayout() {
		// END SUPRESS CATCH EXCEPTION
		IViewEditpart viewEditPart = DelegatingEditPartManager.getInstance()
				.createEditpart(
						"http://eclipse.org/emf/ecp/ecview/common/view",
						IViewEditpart.class);
		ViewContext context = new ViewContext(viewEditPart);

		Assert.assertNull(context.getRootLayout());

		try {
			context.render(ECViewSwtRenderer.UI_KIT_URI, shell, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Assert.assertSame(shell, context.getRootLayout());
	}
}
