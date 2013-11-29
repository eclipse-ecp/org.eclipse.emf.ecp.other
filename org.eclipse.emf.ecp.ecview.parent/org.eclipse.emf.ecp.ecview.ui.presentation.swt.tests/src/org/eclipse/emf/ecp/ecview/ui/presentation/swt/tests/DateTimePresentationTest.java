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
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDateTime;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IDateTimeEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.AbstractSWTWidgetPresenter;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.DateTimePresentation;
import org.eclipse.riena.ui.ridgets.IDateTimeRidget;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link DateTimePresentation}.
 */
@SuppressWarnings("restriction")
public class DateTimePresentationTest {

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
		// .........> yDateTime
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YDateTime yDateTime = factory.createDateTime();
		yGridlayout.getElements().add(yDateTime);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IDateTimeEditpart browserEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yDateTime);
		IWidgetPresentation<Control> presentation = browserEditpart
				.getPresentation();
		Assert.assertTrue(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());

		yGridlayout.getElements().remove(yDateTime);
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
		// ......> yDateTime
		YView yView = factory.createView();
		YDateTime yDateTime = factory.createDateTime();
		yView.setContent(yDateTime);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IDateTimeEditpart browserEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yDateTime);
		IWidgetPresentation<Control> presentation = browserEditpart
				.getPresentation();
		Composite baseComposite = (Composite) presentation.getWidget();

		Label label = (Label) unwrapLabel(baseComposite);
		DateTime text = (DateTime) unwrapText(baseComposite);

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

		GridData data = (GridData) text.getLayoutData();
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
		// ......> yDateTime
		YView yView = factory.createView();
		YGridLayout yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		YDateTime yDateTime1 = factory.createDateTime();
		yDateTime1.setCssID("ID_0815");
		yDateTime1.setCssClass("anyOtherClass");
		yLayout.addElement(yDateTime1);
		YDateTime yDateTime2 = factory.createDateTime();
		yLayout.addElement(yDateTime2);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IDateTimeEditpart text1Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yDateTime1);
		IDateTimeEditpart text2Editpart = DelegatingEditPartManager
				.getInstance().getEditpart(yDateTime2);
		IWidgetPresentation<Control> text1Presentation = text1Editpart
				.getPresentation();
		IWidgetPresentation<Control> text2Presentation = text2Editpart
				.getPresentation();
		Composite text1BaseComposite = (Composite) text1Presentation
				.getWidget();
		Composite text2BaseComposite = (Composite) text2Presentation
				.getWidget();

		Label label1 = (Label) unwrapLabel(text1BaseComposite);
		DateTime dateTime1 = (DateTime) unwrapText(text1BaseComposite);
		Label label2 = (Label) unwrapLabel(text2BaseComposite);
		DateTime dateTime2 = (DateTime) unwrapText(text2BaseComposite);

		// assert css class
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
				WidgetElement.getCSSClass(text1BaseComposite));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
				WidgetElement.getCSSClass(text2BaseComposite));

		Assert.assertEquals("anyOtherClass", WidgetElement.getCSSClass(dateTime1));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL,
				WidgetElement.getCSSClass(dateTime2));

		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__LABEL,
				WidgetElement.getCSSClass(label1));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__LABEL,
				WidgetElement.getCSSClass(label2));

		// assert css id
		Assert.assertEquals("ID_0815", WidgetElement.getID(text1BaseComposite));
		Assert.assertNull(WidgetElement.getID(dateTime1));
		Assert.assertEquals(text2Editpart.getId(),
				WidgetElement.getID(text2BaseComposite));
		Assert.assertNull(WidgetElement.getID(dateTime2));

		Assert.assertNull(WidgetElement.getID(label1));
		Assert.assertNull(WidgetElement.getID(label2));
	}

	/**
	 * Tests rendering issues.
	 * 
	 * @throws Exception
	 */
	// TODO implement with binding
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_valueChangeAdapter_firesEvent() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yDateTime
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		YDateTime yDateTime = factory.createDateTime();
		yGridlayout.getElements().add(yDateTime);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		IDateTimeEditpart browserEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yDateTime);
		DateTimePresentation presentation = browserEditpart.getPresentation();

		final int[] counter = new int[1];
		yDateTime.addValueChangeListener(new YValueChangeListener() {
			@Override
			public void valueChanged(Event event) {
				counter[0] = counter[0] + 1;
			}
		});

		assertEquals(0, counter[0]);

		IDateTimeRidget ridget = presentation.getRidget();
		ridget.setText("Test");
		assertEquals(1, counter[0]);

		ridget.setText("Test 1");
		assertEquals(2, counter[0]);

		yDateTime.removeAllValueChangListeners();
		ridget.setText("Test 2");
		assertEquals(2, counter[0]);

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
			presentation = (IWidgetPresentation<Control>) ((IViewEditpart) editpart)
					.getPresentation();
		} else {
			presentation = ((IEmbeddableEditpart) editpart).getPresentation();
		}
		Control widget = presentation.getWidget();
		return widget;
	}
}
