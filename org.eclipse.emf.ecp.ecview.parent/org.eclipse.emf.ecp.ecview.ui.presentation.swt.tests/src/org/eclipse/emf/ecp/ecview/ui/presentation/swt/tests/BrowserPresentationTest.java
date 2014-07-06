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

import static org.junit.Assert.assertEquals;

import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IBrowserEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.AbstractSWTWidgetPresenter;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.BrowserPresentation;
import org.eclipse.riena.ui.ridgets.IBrowserRidget;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link BrowserPresentation}.
 */
@SuppressWarnings("restriction")
public class BrowserPresentationTest {

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
	 * Tests rendering issues.
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
		// .........> yBrowser
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YBrowser yBrowser = factory.createBrowser();
		yGridlayout.getElements().add(yBrowser);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IBrowserEditpart browserEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yBrowser);
		IWidgetPresentation<Control> presentation = browserEditpart
				.getPresentation();
		Assert.assertTrue(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());

		yGridlayout.getElements().remove(yBrowser);
		Assert.assertFalse(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());
	}

	/**
	 * Tests the internal structure.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_InternalStructure() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yBrowser
		YView yView = factory.createView();
		YBrowser yBrowser = factory.createBrowser();
		yView.setContent(yBrowser);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IBrowserEditpart browserEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yBrowser);
		IWidgetPresentation<Control> presentation = browserEditpart
				.getPresentation();
		Composite baseComposite = (Composite) presentation.getWidget();

		Browser browser = (Browser) unwrapBrowser(baseComposite);

		Assert.assertEquals(1, baseComposite.getChildren().length);

		// assert layout and layout data
		GridLayout layout = (GridLayout) baseComposite.getLayout();
		Assert.assertEquals(2, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);

//		GridData labelData = (GridData) label.getLayoutData();
//		Assert.assertEquals(SWT.BEGINNING, labelData.horizontalAlignment);
//		Assert.assertEquals(SWT.TOP, labelData.verticalAlignment);
//		Assert.assertEquals(false, labelData.grabExcessHorizontalSpace);
//		Assert.assertEquals(true, labelData.grabExcessVerticalSpace);
//		Assert.assertEquals(false, labelData.exclude);
//		Assert.assertEquals(0, labelData.horizontalIndent);
//		Assert.assertEquals(1, labelData.horizontalSpan);
//		Assert.assertEquals(0, labelData.minimumHeight);
//		Assert.assertEquals(0, labelData.minimumWidth);
//		Assert.assertEquals(0, labelData.verticalIndent);
//		Assert.assertEquals(1, labelData.verticalSpan);
//		Assert.assertEquals(-1, labelData.widthHint);

		GridData data = (GridData) browser.getLayoutData();
		Assert.assertEquals(SWT.FILL, data.horizontalAlignment);
		Assert.assertEquals(SWT.FILL, data.verticalAlignment);
		Assert.assertEquals(true, data.grabExcessHorizontalSpace);
		Assert.assertEquals(true, data.grabExcessVerticalSpace);
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
	 * Test the internal structure based on CSS.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_InternalStructure__CSS() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yBrowser
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YBrowser yBrowser1 = factory.createBrowser();
		yBrowser1.setCssID("ID_0815");
		yBrowser1.setCssClass("anyOtherClass");
		yLayout.addElement(yBrowser1);
		YBrowser yBrowser2 = factory.createBrowser();
		yLayout.addElement(yBrowser2);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IBrowserEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yBrowser1);
		IBrowserEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yBrowser2);
		IWidgetPresentation<Control> text1Presentation = text1Editpart
				.getPresentation();
		IWidgetPresentation<Control> text2Presentation = text2Editpart
				.getPresentation();
		Composite browser1BaseComposite = (Composite) text1Presentation
				.getWidget();
		Composite browser2BaseComposite = (Composite) text2Presentation
				.getWidget();

//		Label label1 = (Label) unwrapLabel(text1BaseComposite);
		Browser browser1 = (Browser) unwrapBrowser(browser1BaseComposite);
//		Label label2 = (Label) unwrapLabel(text2BaseComposite);
		Browser browser2 = (Browser) unwrapBrowser(browser2BaseComposite);

		// assert css class
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS_CONTROL_BASE,
				WidgetElement.getCSSClass(browser1BaseComposite));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS_CONTROL_BASE,
				WidgetElement.getCSSClass(browser2BaseComposite));

		Assert.assertEquals("anyOtherClass", WidgetElement.getCSSClass(browser1));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS_CONTROL,
				WidgetElement.getCSSClass(browser2));

//		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__LABEL,
//				WidgetElement.getCSSClass(label1));
//		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__LABEL,
//				WidgetElement.getCSSClass(label2));

		// assert css id
		Assert.assertEquals("ID_0815", WidgetElement.getID(browser1BaseComposite));
		Assert.assertNull(WidgetElement.getID(browser1));
		Assert.assertEquals(text2Editpart.getId(),
				WidgetElement.getID(browser2BaseComposite));
		Assert.assertNull(WidgetElement.getID(browser2));

//		Assert.assertNull(WidgetElement.getID(label1));
//		Assert.assertNull(WidgetElement.getID(label2));
	}

	/**
	 * Tests rendering issues.
	 * 
	 * @throws Exception
	 */
	// TODO - implement with binding
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_valueChangeAdapter_firesEvent() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yBrowser
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YBrowser yBrowser = factory.createBrowser();
		yGridlayout.getElements().add(yBrowser);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IBrowserEditpart browserEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yBrowser);
		BrowserPresentation presentation = browserEditpart.getPresentation();

		final int[] counter = new int[1];
		yBrowser.addValueChangeListener(new YValueChangeListener() {
			@Override
			public void valueChanged(Event event) {
				counter[0] = counter[0] + 1;
			}
		});

		assertEquals(0, counter[0]);

		IBrowserRidget ridget = presentation.getBrowserRidget();
		ridget.setUrl("Test");
		assertEquals(1, counter[0]);

		ridget.setText("Test 1");
		assertEquals(2, counter[0]);

		yBrowser.removeAllValueChangListeners();
		ridget.setText("Test 2");
		assertEquals(2, counter[0]);

	}

	/**
	 * Unwraps the control from its parent composite.
	 * 
	 * @param control
	 * @return
	 */
	private Control unwrapBrowser(Control control) {
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
