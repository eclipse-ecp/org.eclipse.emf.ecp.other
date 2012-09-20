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
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.util.SimpleModelFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiTextFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.SimpleSwtRenderer;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal.AbstractSWTWidgetPresenter;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal.TextFieldPresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link TextFieldPresentation}.
 */
@SuppressWarnings("restriction")
public class TextFieldPresentationTests {

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
		// .........> yText
		YUiView yView = factory.createYView();
		YUiGridLayout yGridlayout = factory.createYGridLayout();
		yView.setContent(yGridlayout);
		YUiTextField yText = factory.createYTextField();
		yGridlayout.getElements().add(yText);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		IUiTextFieldEditpart textEditpart = DelegatingEditPartManager.getInstance().getEditpart(yText);
		IWidgetPresentation<Control> presentation = textEditpart.getPresentation();
		Assert.assertTrue(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());

		yGridlayout.getElements().remove(yText);
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
		// ......> yText
		YUiView yView = factory.createYView();
		YUiTextField yText = factory.createYTextField();
		yView.setContent(yText);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		IUiTextFieldEditpart textEditpart = DelegatingEditPartManager.getInstance().getEditpart(yText);
		IWidgetPresentation<Control> presentation = textEditpart.getPresentation();
		Composite baseComposite = (Composite) presentation.getWidget();
		Text text = (Text) unwrap(baseComposite);

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

		GridData data = (GridData) text.getLayoutData();
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
		// ......> yText
		YUiView yView = factory.createYView();
		YUiGridLayout yLayout = factory.createYGridLayout();
		yView.setContent(yLayout);
		YUiTextField yText1 = factory.createYTextField();
		yText1.setCssID("ID_0815");
		yText1.setCssClass("anyOtherClass");
		yLayout.getElements().add(yText1);
		YUiTextField yText2 = factory.createYTextField();
		yLayout.getElements().add(yText2);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		IUiTextFieldEditpart text1Editpart = DelegatingEditPartManager.getInstance().getEditpart(yText1);
		IUiTextFieldEditpart text2Editpart = DelegatingEditPartManager.getInstance().getEditpart(yText2);
		IWidgetPresentation<Control> text1Presentation = text1Editpart.getPresentation();
		IWidgetPresentation<Control> text2Presentation = text2Editpart.getPresentation();
		Composite text1BaseComposite = (Composite) text1Presentation.getWidget();
		Composite text2BaseComposite = (Composite) text2Presentation.getWidget();
		Text text1 = (Text) unwrap(text1BaseComposite);
		Text text2 = (Text) unwrap(text2BaseComposite);

		// assert css class
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
			WidgetElement.getCSSClass(text1BaseComposite));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
			WidgetElement.getCSSClass(text2BaseComposite));
		Assert.assertEquals("anyOtherClass", WidgetElement.getCSSClass(text1));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL, WidgetElement.getCSSClass(text2));

		// assert css id
		Assert.assertNull(WidgetElement.getID(text1BaseComposite));
		Assert.assertEquals("ID_0815", WidgetElement.getID(text1));
		Assert.assertNull(WidgetElement.getID(text2BaseComposite));
		Assert.assertEquals(text2Editpart.getId(), WidgetElement.getID(text2));
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
	protected Control getControl(YUiElement yView) {
		IUiElementEditpart editpart = DelegatingEditPartManager.getInstance().getEditpart(yView);

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
