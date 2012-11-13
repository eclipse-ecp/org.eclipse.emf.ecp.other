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
package org.eclipse.emf.ecp.ui.uimodel.presentation.swt.simple.tests;

import junit.framework.Assert;

import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel;
import org.eclipse.emf.ecp.ui.model.core.uimodel.util.SimpleModelFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiLabelEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.SimpleSwtRenderer;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal.AbstractSWTWidgetPresenter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link LabelFieldPresentation}.
 */
@SuppressWarnings("restriction")
public class LabelPresentationTests {

	private SimpleModelFactory factory = new SimpleModelFactory();
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
		// .........> yLabel
		YUiView yView = factory.createView();
		YUiGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YUiLabel yLabel = factory.createLabel();
		yGridlayout.getElements().add(yLabel);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		IUiLabelEditpart labelEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yLabel);
		IWidgetPresentation<Control> presentation = labelEditpart
				.getPresentation();
		Assert.assertTrue(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());

		yGridlayout.getElements().remove(yLabel);
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
		// ......> yLabel
		YUiView yView = factory.createView();
		YUiLabel yLabel = factory.createLabel();
		yView.setContent(yLabel);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		IUiLabelEditpart labelEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yLabel);
		IWidgetPresentation<Control> presentation = labelEditpart
				.getPresentation();
		Composite baseComposite = (Composite) presentation.getWidget();
		Label label = (Label) unwrap(baseComposite);

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

		GridData data = (GridData) label.getLayoutData();
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
		// ......> yLabel
		YUiView yView = factory.createView();
		YUiGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YUiLabel yLabel1 = factory.createLabel();
		yLabel1.setCssID("ID_0815");
		yLabel1.setCssClass("anyOtherClass");
		yLayout.getElements().add(yLabel1);
		YUiLabel yLabel2 = factory.createLabel();
		yLayout.getElements().add(yLabel2);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		IUiLabelEditpart label1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yLabel1);
		IUiLabelEditpart label2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yLabel2);
		IWidgetPresentation<Control> label1Presentation = label1Editpart
				.getPresentation();
		IWidgetPresentation<Control> label2Presentation = label2Editpart
				.getPresentation();
		Composite label1BaseComposite = (Composite) label1Presentation
				.getWidget();
		Composite label2BaseComposite = (Composite) label2Presentation
				.getWidget();
		Label label1 = (Label) unwrap(label1BaseComposite);
		Label label2 = (Label) unwrap(label2BaseComposite);

		// assert css class
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
				WidgetElement.getCSSClass(label1BaseComposite));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
				WidgetElement.getCSSClass(label2BaseComposite));
		Assert.assertEquals("anyOtherClass", WidgetElement.getCSSClass(label1));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL,
				WidgetElement.getCSSClass(label2));

		// assert css id
		Assert.assertEquals("ID_0815", WidgetElement.getID(label1BaseComposite));
		Assert.assertNull(WidgetElement.getID(label1));
		Assert.assertEquals(label2Editpart.getId(),
				WidgetElement.getID(label2BaseComposite));
		Assert.assertNull(WidgetElement.getID(label2));
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
	protected Control getControl(YUiElement yView) {
		IUiElementEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yView);

		IWidgetPresentation<Control> presentation = null;
		if (editpart instanceof IUiViewEditpart) {
			presentation = ((IUiViewEditpart) editpart).getPresentation();
		} else {
			presentation = ((IUiEmbeddableEditpart) editpart).getPresentation();
		}
		Control widget = presentation.getWidget();
		return widget;
	}
}
