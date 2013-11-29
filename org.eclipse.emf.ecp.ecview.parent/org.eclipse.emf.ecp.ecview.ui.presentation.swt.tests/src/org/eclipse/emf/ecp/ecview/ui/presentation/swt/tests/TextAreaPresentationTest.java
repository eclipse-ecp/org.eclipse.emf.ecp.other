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
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITextAreaEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.AbstractSWTWidgetPresenter;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.TextFieldPresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link TextFieldPresentation}.
 */
@SuppressWarnings("restriction")
public class TextAreaPresentationTest {

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
		// .........> yText
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YTextArea yText = factory.createTextArea();
		yGridlayout.getElements().add(yText);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		ITextAreaEditpart textAreaEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText);
		IWidgetPresentation<Control> presentation = textAreaEditpart
				.getPresentation();
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
		YView yView = factory.createView();
		YTextArea yText = factory.createTextArea();
		yView.setContent(yText);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		ITextAreaEditpart textAreaEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText);
		IWidgetPresentation<Control> presentation = textAreaEditpart
				.getPresentation();
		Composite baseComposite = (Composite) presentation.getWidget();

		Label label = (Label) unwrapLabel(baseComposite);
		Text textArea = (Text) unwrapText(baseComposite);

		Assert.assertEquals(2, baseComposite.getChildren().length);

		// assert layout and layout data
		GridLayout layout = (GridLayout) baseComposite.getLayout();
		Assert.assertEquals(2, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);

		GridData labelData = (GridData) label.getLayoutData();
		Assert.assertEquals(SWT.BEGINNING, labelData.horizontalAlignment);
		Assert.assertEquals(SWT.TOP, labelData.verticalAlignment);
		Assert.assertEquals(false, labelData.grabExcessHorizontalSpace);
		Assert.assertEquals(true, labelData.grabExcessVerticalSpace);
		Assert.assertEquals(false, labelData.exclude);
		Assert.assertEquals(0, labelData.horizontalIndent);
		Assert.assertEquals(1, labelData.horizontalSpan);
		Assert.assertEquals(0, labelData.minimumHeight);
		Assert.assertEquals(0, labelData.minimumWidth);
		Assert.assertEquals(0, labelData.verticalIndent);
		Assert.assertEquals(1, labelData.verticalSpan);
		Assert.assertEquals(-1, labelData.widthHint);

		GridData data = (GridData) textArea.getLayoutData();
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
		// ......> yText
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YTextArea yText1 = factory.createTextArea();
		yText1.setCssID("ID_0815");
		yText1.setCssClass("anyOtherClass");
		yLayout.addElement(yText1);
		YTextArea yText2 = factory.createTextArea();
		yLayout.addElement(yText2);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		ITextAreaEditpart textArea1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText1);
		ITextAreaEditpart textArea2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText2);
		IWidgetPresentation<Control> textArea1Presentation = textArea1Editpart
				.getPresentation();
		IWidgetPresentation<Control> textArea2Presentation = textArea2Editpart
				.getPresentation();
		Composite textArea1BaseComposite = (Composite) textArea1Presentation
				.getWidget();
		Composite textArea2BaseComposite = (Composite) textArea2Presentation
				.getWidget();

		Label label1 = (Label) unwrapLabel(textArea1BaseComposite);
		Text textArea1 = (Text) unwrapText(textArea1BaseComposite);
		Label label2 = (Label) unwrapLabel(textArea2BaseComposite);
		Text textArea2 = (Text) unwrapText(textArea2BaseComposite);

		// assert css class
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
				WidgetElement.getCSSClass(textArea1BaseComposite));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
				WidgetElement.getCSSClass(textArea2BaseComposite));

		Assert.assertEquals("anyOtherClass",
				WidgetElement.getCSSClass(textArea1));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL,
				WidgetElement.getCSSClass(textArea2));

		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__LABEL,
				WidgetElement.getCSSClass(label1));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__LABEL,
				WidgetElement.getCSSClass(label2));

		// assert css id
		Assert.assertEquals("ID_0815",
				WidgetElement.getID(textArea1BaseComposite));
		Assert.assertNull(WidgetElement.getID(textArea1));
		Assert.assertEquals(textArea2Editpart.getId(),
				WidgetElement.getID(textArea2BaseComposite));
		Assert.assertNull(WidgetElement.getID(textArea2));

		Assert.assertNull(WidgetElement.getID(label1));
		Assert.assertNull(WidgetElement.getID(label2));
	}

	/**
	 * Unwraps the label from its parent composite.
	 * 
	 * @param control
	 * @return
	 */
	private Control unwrapLabel(Control control) {
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
	private Control unwrapText(Control control) {
		if (control instanceof Composite) {
			Composite composite = (Composite) control;
			return composite.getChildren()[1];
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
			presentation = (IWidgetPresentation<Control>) ((IViewEditpart) editpart).getPresentation();
		} else {
			presentation = ((IEmbeddableEditpart) editpart).getPresentation();
		}
		Control widget = presentation.getWidget();
		return widget;
	}
}
