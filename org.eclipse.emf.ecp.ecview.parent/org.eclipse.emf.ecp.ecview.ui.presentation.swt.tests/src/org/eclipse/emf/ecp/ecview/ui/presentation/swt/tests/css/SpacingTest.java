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
 * Tests the CSS spacings.
 */
public class SpacingTest {

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
	 * Tests the spacing.<br>
	 * yView.setSpacing(false);
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_spacing_gridlayout_settingFalse_noCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("spacingtests");
		YGridLayout yGridLayout = factory.createGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setSpacing(false);
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite layoutComposite = (Composite) unwrap(getControl(yGridLayout));
		GridLayout layout = (GridLayout) layoutComposite.getLayout();
		Assert.assertEquals(5, layout.horizontalSpacing);
		Assert.assertEquals(5, layout.verticalSpacing);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the spacing.<br>
	 * yView.setSpacing(true);
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_spacing_gridlayout_settingTrue_noCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("spacingtests");
		YGridLayout yGridLayout = factory.createGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setSpacing(true);
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite layoutComposite = (Composite) unwrap(getControl(yGridLayout));
		GridLayout layout = (GridLayout) layoutComposite.getLayout();
		Assert.assertEquals(5, layout.horizontalSpacing);
		Assert.assertEquals(5, layout.verticalSpacing);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the spacing.<br>
	 * yView.setSpacing(false);<br>
	 * createCssOptions() is used
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_spacing_gridlayout_settingFalse_withCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("spacingtests");
		YGridLayout yGridLayout = factory.createGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setSpacing(false);
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, createCssOptions());
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite layoutComposite = (Composite) unwrap(getControl(yGridLayout));
		GridLayout layout = (GridLayout) layoutComposite.getLayout();

		Assert.assertEquals(5, layout.horizontalSpacing);
		Assert.assertEquals(5, layout.verticalSpacing);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the spacing.<br>
	 * yView.setSpacing(true);<br>
	 * createCssOptions() is used
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_spacing_gridlayout_settingTrue_withCSS() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yView
		YView yView = factory.createView();
		yView.setCssClass("spacingtests");
		YGridLayout yGridLayout = factory.createGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setSpacing(true);
		yView.setContent(yGridLayout);

		try {
			ECViewSwtRenderer renderer = new ECViewSwtRenderer();
			renderer.render(shell, yView, createCssOptions());
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite layoutComposite = (Composite) unwrap(getControl(yGridLayout));
		GridLayout layout = (GridLayout) layoutComposite.getLayout();
		Assert.assertEquals(50, layout.horizontalSpacing);
		Assert.assertEquals(60, layout.verticalSpacing);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
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
	 * @param yView model element.
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
	 * Creates the CSSOptions.
	 * 
	 * @return CSSOptions
	 */
	protected Map<String, Object> createCssOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(ECViewSwtRenderer.RENDERING_OPTION__CSS_FILES,
			Collections.singleton(Activator.getContext().getBundle().getEntry("/theming/css/spacingTests.css")));
		return options;
	}
}