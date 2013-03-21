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

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertSame;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.listeners.YValueChangeListener;
import org.eclipse.emf.ecp.ecview.common.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ecview.common.presentation.IPresentationFactory;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.IGridLayoutEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ITextFieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.ECViewSwtRenderer;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.FieldPresentation;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.GridLayoutPresentation;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.TextFieldPresentation;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.Util;
import org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal.ViewPresentation;
import org.eclipse.riena.ui.ridgets.IMarkableRidget;
import org.eclipse.riena.ui.ridgets.ITextRidget;
import org.eclipse.riena.ui.ridgets.swt.SwtRidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link TextFieldPresentation}.
 */
@SuppressWarnings("restriction")
public class FieldPresentationTests {

	private SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();
	private Display display = Display.getCurrent();
	private Shell shell;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		DelegatingPresenterFactory.getInstance().stash();
		DelegatingPresenterFactory.getInstance().clear();
		DelegatingPresenterFactory.getInstance().addDelegate(
				new PresentationFactory());
		shell = new Shell(display);
		shell.setLayout(new FillLayout());
	}

	@After
	public void shutdown() {
		DelegatingPresenterFactory.getInstance().unstash();
	}

	/**
	 * Tests rendering issues.
	 * 
	 * @throws Exception
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_valueChangeAdapter_firesEvent() throws Exception {
		// END SUPRESS CATCH EXCEPTION
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText
		YView yView = factory.createView();
		YGridLayout yGridlayout = factory.createGridLayout();
		yView.setContent(yGridlayout);
		final YTextField yText = factory.createTextField();
		yGridlayout.getElements().add(yText);

		ECViewSwtRenderer renderer = new ECViewSwtRenderer();
		renderer.render(shell, yView, null);

		ITextFieldEditpart textEditpart = DelegatingEditPartManager
				.getInstance().getEditpart(yText);
		TestTextFieldPresentation presentation = textEditpart.getPresentation();

		final int[] counter = new int[1];
		final String[] toVerify = new String[1];
		yText.addValueChangeListener(new YValueChangeListener() {
			@Override
			public void valueChanged(Event event) {
				counter[0] = counter[0] + 1;

				assertSame(yText, event.getField());

				if (toVerify[0] != null) {
					assertEquals(toVerify[0], event.getNewValue());
				}
			}
		});

		assertEquals(0, counter[0]);

		ITextRidget ridget = presentation.textRidget;
		toVerify[0] = "Test";
		ridget.setText("Test");
		assertEquals(1, counter[0]);

		toVerify[0] = "Test 1";
		ridget.setText("Test 1");
		assertEquals(2, counter[0]);

		yText.removeAllValueChangListeners();
		toVerify[0] = "Test 2";
		ridget.setText("Test 2");
		assertEquals(2, counter[0]);

	}

	/**
	 * Returns the control for the given model element.
	 * 
	 * @param yView
	 *            model element
	 * @return control
	 */
	protected TextFieldPresentation getPresentation(YElement yView) {
		IElementEditpart editpart = DelegatingEditPartManager.getInstance()
				.getEditpart(yView);

		IWidgetPresentation<Control> presentation = null;
		if (editpart instanceof IViewEditpart) {
			presentation = ((IViewEditpart) editpart).getPresentation();
		} else {
			presentation = ((IEmbeddableEditpart) editpart).getPresentation();
		}
		return (TextFieldPresentation) presentation;
	}

	private static class TestTextFieldPresentation extends FieldPresentation {

		private final YTextField yTextField;
		private Composite controlBase;
		private Text text;
		private ITextRidget textRidget;

		/**
		 * Constructor.
		 * 
		 * @param editpart
		 *            The editpart of that presenter
		 */
		public TestTextFieldPresentation(IElementEditpart editpart) {
			super((ITextFieldEditpart) editpart);
			this.yTextField = (YTextField) editpart.getModel();
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public Control createWidget(Object parent) {
			if (controlBase == null) {
				controlBase = new Composite((Composite) parent, SWT.NONE);
				controlBase.setLayout(new GridLayout(1, false));
				setCSSClass(controlBase, CSS_CLASS__CONTROL_BASE);
				if (Util.isCssIdValid(yTextField)) {
					setCSSId(controlBase, Util.getCssID(yTextField));
				} else {
					setCSSId(controlBase, getEditpart().getId());
				}

				text = new Text(controlBase, SWT.BORDER);
				textRidget = (ITextRidget) SwtRidgetFactory.createRidget(text);
				text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				// update style attributes
				//
				updateStyle();
			}
			return controlBase;
		}

		/**
		 * Updates the control style attributes.
		 */
		private void updateStyle() {
			// creates the binding for the field
			createBindings(yTextField, textRidget);
		}

		/**
		 * Creates the bindings for the given elements.
		 * 
		 * @param yField
		 * @param ridget
		 */
		protected void createBindings(YTextField yField, IMarkableRidget ridget) {
			// bind the value of yText to textRidget
			if (getBindingManager() != null) {
				IObservableValue modelObservable = EMFObservables.observeValue(
						castEObject(getModel()),
						ExtensionModelPackage.Literals.YTEXT_FIELD__VALUE);
				IObservableValue uiObservable = BeansObservables.observeValue(
						ridget, ITextRidget.PROPERTY_TEXT);
				getBindingManager().bind(uiObservable, modelObservable);
			}
			// do further bindings
			super.createBindings(yField, ridget);
		}

		@Override
		public Control getWidget() {
			return controlBase;
		}

		@Override
		public boolean isRendered() {
			return controlBase != null;
		}

		@Override
		protected void internalDispose() {
			super.internalDispose();
		}

		@Override
		public void unrender() {

		}
	}

	private static class PresentationFactory implements IPresentationFactory {

		@Override
		public boolean isFor(IViewContext uiContext, IElementEditpart editpart) {
			return true;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <A extends IWidgetPresentation<?>> A createPresentation(
				IViewContext uiContext, IElementEditpart editpart) {
			if (editpart instanceof IViewEditpart) {
				return (A) new ViewPresentation((IViewEditpart) editpart);
			} else if (editpart instanceof IGridLayoutEditpart) {
				return (A) new GridLayoutPresentation(editpart);
			}
			return (A) new TestTextFieldPresentation(editpart);
		}

	}
}
