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
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.tests.css;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecp.ecview.common.context.ContextException;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.tests.Activator;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the CSS margins.
 * @author admin
 *
 */
public class MarginTest {

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
	 * Tests the margin.<br>
	 * yView.setMargin(false);
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_margin_view_settingFalse_noCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("margintests");
		yView.setMargin(false);
		YGridLayout yGridLayout = factory.createGridLayout();
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yView);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin.<br>
	 * yView.setMargin(true);
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_margin_view_settingTrue_noCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("margintests");
		// difference to test_margin_view_settingFalse_noCSS
		yView.setMargin(true);
		YGridLayout yGridLayout = factory.createGridLayout();
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yView);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin.<br>
	 * yView.setMargin(false);<br>
	 * createCssOptions() is used
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_margin_view_settingFalse_withCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("margintests");
		yView.setMargin(false);
		YGridLayout yGridLayout = factory.createGridLayout();
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, createCssOptions());
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yView);
		GridLayout layout = (GridLayout) viewComposite.getLayout();

		// margin did not change since setMargin(false)
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin.<br>
	 * yView.setMargin(true);<br>
	 * createCssOptions() is used
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_margin_view_settingTrue_withCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("margintests");
		// difference to test_margin_view_settingFalse_noCSS
		yView.setMargin(true);
		YGridLayout yGridLayout = factory.createGridLayout();
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, createCssOptions());
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yView);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(10, layout.marginLeft);
		Assert.assertEquals(20, layout.marginTop);
		Assert.assertEquals(30, layout.marginRight);
		Assert.assertEquals(40, layout.marginBottom);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin.<br>
	 * yView.setMargin(false);
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_margin_gridlayout_settingFalse_noCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("margintests");
		YGridLayout yGridLayout = factory.createGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setMargin(false);
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yGridLayout);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin.<br>
	 * yView.setMargin(true);
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_margin_gridlayout_settingTrue_noCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("margintests");
		YGridLayout yGridLayout = factory.createGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setMargin(true);
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yGridLayout);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin.<br>
	 * yView.setMargin(false);<br>
	 * createCssOptions() is used
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_margin_gridlayout_settingFalse_withCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("margintests");
		YGridLayout yGridLayout = factory.createGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setMargin(false);
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, createCssOptions());
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yGridLayout);
		GridLayout layout = (GridLayout) viewComposite.getLayout();

		// margin did not change since setMargin(false)
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin.<br>
	 * yView.setMargin(true);<br>
	 * createCssOptions() is used
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_margin_gridlayout_settingTrue_withCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("margintests");
		YGridLayout yGridLayout = factory.createGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setMargin(true);
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, createCssOptions());
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yGridLayout);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(33, layout.marginLeft);
		Assert.assertEquals(34, layout.marginTop);
		Assert.assertEquals(35, layout.marginRight);
		Assert.assertEquals(36, layout.marginBottom);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Returns the control for the given model element.
	 * @param yView the model element
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

	/**
	 * Creates the CSS options.
	 * @return CSSOptions
	 */
	protected Map<String, Object> createCssOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(ECViewSwtRenderer.RENDERING_OPTION__CSS_FILES,
			Collections.singleton(Activator.getContext().getBundle().getEntry("/theming/css/maringTests.css")));
		return options;
	}
}