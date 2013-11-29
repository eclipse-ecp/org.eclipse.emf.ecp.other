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

import org.junit.Assert;
import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.presentation.ILayoutPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IViewPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IGridLayoutEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.IConstants;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.AbstractSWTWidgetPresenter;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.ViewPresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the {@link ViewPresentation}.
 */
@SuppressWarnings("restriction")
public class ViewPresentationTest {

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
	 * Tests a complex scenario.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getChildren() throws Exception {
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
		Assert.assertEquals(2, presLayout.getChildren().size());

		// unrender the layout and its childs
		yView.setContent(null);
		// layout
		Assert.assertEquals(2, presLayout.getChildren().size());

		// remove from unrendered layout
		yGridlayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());

		// add to unrendered layout
		yGridlayout.getElements().add(yText1);
		Assert.assertEquals(2, presLayout.getChildren().size());

		//
		//
		// remove again from unrendered layout
		yGridlayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());

		// now set the gridlayout as the content -> Should be rendered again
		yView.setContent(yGridlayout);

		//
		//
		// at least add the text1 again
		yGridlayout.getElements().add(yText1);
		Assert.assertEquals(2, presLayout.getChildren().size());

	}

	/**
	 * Tests the set and unset of the content.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_content_set_unset() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yGridLayout
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IViewEditpart viewEditpart = DelegatingEditPartManager.getInstance().getEditpart(yView);
		IGridLayoutEditpart layoutEditpart = DelegatingEditPartManager.getInstance().getEditpart(yGridlayout);
		IViewPresentation<Control> presView = viewEditpart.getPresentation();
		ILayoutPresentation<Control> presLayout = layoutEditpart.getPresentation();

		Composite viewComposite = (Composite) unwrap(presView.getWidget());
		Assert.assertEquals(presLayout.getWidget(), viewComposite.getChildren()[0]);
		Assert.assertEquals(presLayout, presView.getContent());

		// unset the content
		//
		yView.setContent(null);
		Assert.assertNull(viewEditpart.getContent());
		Assert.assertNull(presView.getContent());
		Assert.assertNull(presLayout.getWidget());
		Assert.assertFalse(presLayout.isRendered());

		// set the content again
		//
		yView.setContent(yGridlayout);
		Assert.assertSame(viewEditpart.getContent(), layoutEditpart);
		Assert.assertSame(presLayout, presView.getContent());
		Assert.assertSame(presLayout.getWidget(), viewComposite.getChildren()[0]);
		Assert.assertTrue(presLayout.isRendered());
	}

	/**
	 * Test the unrendering of the view.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_unrender() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yGridLayout
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IViewEditpart viewEditpart = DelegatingEditPartManager.getInstance().getEditpart(yView);
		IGridLayoutEditpart layoutEditpart = DelegatingEditPartManager.getInstance().getEditpart(yGridlayout);
		IViewPresentation<Control> presView = viewEditpart.getPresentation();
		ILayoutPresentation<Control> presLayout = layoutEditpart.getPresentation();

		Composite viewComposite = (Composite) unwrap(presView.getWidget());
		Assert.assertEquals(presLayout.getWidget(), viewComposite.getChildren()[0]);
		Assert.assertEquals(presLayout, presView.getContent());

		// unrender the view
		//
		presView.unrender();
		Assert.assertSame(viewEditpart.getContent(), layoutEditpart);
		Assert.assertSame(presLayout, presView.getContent());
		Assert.assertNull(presView.getWidget());
		Assert.assertNull(presLayout.getWidget());
		Assert.assertFalse(presView.isRendered());
		Assert.assertFalse(presLayout.isRendered());

		// render the view again
		//
		presView.render(null);
		viewComposite = (Composite) unwrap(presView.getWidget());

		Assert.assertSame(viewEditpart.getContent(), layoutEditpart);
		Assert.assertNotNull(presView.getWidget());
		Assert.assertSame(presLayout, presView.getContent());
		Assert.assertSame(presLayout.getWidget(), viewComposite.getChildren()[0]);
		Assert.assertTrue(presView.isRendered());
		Assert.assertTrue(presLayout.isRendered());
	}

	/**
	 * Test the internal structure.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_InternalStructure() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		YView yView = factory.createView();

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IViewEditpart viewEditpart = DelegatingEditPartManager.getInstance().getEditpart(yView);
		IViewPresentation<Control> presentation = viewEditpart.getPresentation();
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
	}

	/**
	 * Tests the internal structure based on CSS.
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
		yView.setCssID("ID_0815");
		yView.setCssClass("anyOtherClass");

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IViewEditpart viewEditpart = DelegatingEditPartManager.getInstance().getEditpart(yView);
		IViewPresentation<Control> presentation = viewEditpart.getPresentation();
		Composite baseComposite = (Composite) presentation.getWidget();
		Composite content = (Composite) unwrap(baseComposite);

		// assert css class
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
			WidgetElement.getCSSClass(baseComposite));
		Assert.assertEquals("anyOtherClass", WidgetElement.getCSSClass(content));

		// assert css id
		Assert.assertNull(WidgetElement.getID(baseComposite));
		Assert.assertEquals("ID_0815", WidgetElement.getID(content));
	}

	/**
	 * Test the internal structure for CSS defaults.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_InternalStructure__CSS_default() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yText
		YView yView = factory.createView();

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IViewEditpart viewEditpart = DelegatingEditPartManager.getInstance().getEditpart(yView);
		IViewPresentation<Control> presentation = viewEditpart.getPresentation();
		Composite baseComposite = (Composite) presentation.getWidget();
		Composite content = (Composite) unwrap(baseComposite);

		// assert css class
		Assert.assertEquals(IConstants.CSS_CLASS__CONTROL_BASE, WidgetElement.getCSSClass(baseComposite));
		Assert.assertEquals(IConstants.CSS_CLASS__CONTROL, WidgetElement.getCSSClass(content));

		// assert css id
		Assert.assertNull(WidgetElement.getID(baseComposite));
		Assert.assertEquals(viewEditpart.getId(), WidgetElement.getID(content));
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
	 * @param yView model element
	 * @return control
	 */
	@SuppressWarnings("unchecked")
	protected Control getControl(YElement yView) {
		IElementEditpart editpart = DelegatingEditPartManager.getInstance().getEditpart(yView);

		IWidgetPresentation<Control> presentation = null;
		if (editpart instanceof IViewEditpart) {
			presentation = (IWidgetPresentation<Control>) ((IViewEditpart) editpart).getPresentation();
		} else {
			presentation = ((IEmbeddableEditpart) editpart).getPresentation();
		}
		Control widget = presentation.getWidget();
		return widget;
	}
}
