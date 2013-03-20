/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.common.tests.editparts.emf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.emf.ecp.ecview.common.context.ConfigurationAdapter;
import org.eclipse.emf.ecp.ecview.common.context.ContextException;
import org.eclipse.emf.ecp.ecview.common.context.IContext;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.context.ViewContext;
import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ecview.common.presentation.IPresentationFactory;
import org.eclipse.emf.ecp.ecview.common.presentation.IViewPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link ViewEditpart}.
 */
@SuppressWarnings("restriction")
public class ViewEditpartTest {

	private DelegatingPresenterFactory presenterFactory = DelegatingPresenterFactory
			.getInstance();
	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
	private CoreModelFactory modelFactory = CoreModelFactory.eINSTANCE;
	private BindingFactory bindingFactory = BindingFactory.eINSTANCE;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		editpartManager.clear();
		editpartManager
				.addDelegate(new org.eclipse.emf.ecp.ecview.common.editpart.emf.EditpartManager());
		editpartManager
				.addDelegate(new org.eclipse.emf.ecp.ecview.extension.editpart.emf.EditpartManager());
		presenterFactory.clear();
		presenterFactory.addDelegate(new PresenterFactory());
	}

	/**
	 * Tests the context.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_context() {
		// END SUPRESS CATCH EXCEPTION
		IViewEditpart viewEditpart = (IViewEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);
		assertNull(viewEditpart.getContext());

		ViewContext context = new ViewContext(viewEditpart);
		assertSame(context, viewEditpart.getContext());
		assertSame(viewEditpart, context.getViewEditpart());
	}

	/**
	 * Tests setContent by model.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setContent_byModel() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		// ......> layout1
		YView view1 = modelFactory.createYView();
		YLayout layout1 = modelFactory.createYLayout();
		view1.setContent(layout1);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);

		assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view1Editpart, layout1Editpart.getView());

		// unset the layout
		//
		view1.setContent(null);
		assertNull(view1Editpart.getContent());
		assertNull(layout1Editpart.getParent());
		assertNull(layout1Editpart.getView());

	}

	/**
	 * Tests setContent by editPart.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setContent_byEditPart() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		// ......> layout1
		YView view1 = modelFactory.createYView();
		YLayout layout1 = modelFactory.createYLayout();
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		view1Editpart.setContent(layout1Editpart);

		assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view1Editpart, layout1Editpart.getView());

		// unset the layout
		//
		view1.setContent(null);
		assertNull(view1Editpart.getContent());
		assertNull(layout1Editpart.getParent());
		assertNull(layout1Editpart.getView());

	}

	/**
	 * Tests move content by model.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_moveContent_byModel() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		// ......> layout1
		YView view1 = modelFactory.createYView();
		YLayout layout1 = modelFactory.createYLayout();
		view1.setContent(layout1);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);

		assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view1Editpart, layout1Editpart.getView());

		// ...> view2
		// ......> layout1
		YView view2 = modelFactory.createYView();
		view2.setContent(layout1);
		IViewEditpart view2Editpart = editpartManager.getEditpart(view2);

		assertSame(layout1Editpart, view2Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view2Editpart, layout1Editpart.getView());
	}

	/**
	 * Tests move content by edit part.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_moveContent_byEditPart() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		// ......> layout1
		YView view1 = modelFactory.createYView();
		YLayout layout1 = modelFactory.createYLayout();
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		view1Editpart.setContent(layout1Editpart);

		assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view1Editpart, layout1Editpart.getView());

		// ...> view2
		// ......> layout1
		YView view2 = modelFactory.createYView();
		IViewEditpart view2Editpart = editpartManager.getEditpart(view2);
		view2Editpart.setContent(layout1Editpart);

		assertSame(layout1Editpart, view2Editpart.getContent());
		// parent is null if it is the view
		assertNull(layout1Editpart.getParent());
		assertSame(view2Editpart, layout1Editpart.getView());
	}

	/**
	 * Tests dispose content.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_disposeContent() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		// ......> layout1
		YView view1 = modelFactory.createYView();
		YLayout layout1 = modelFactory.createYLayout();
		view1.setContent(layout1);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);

		assertSame(layout1Editpart, view1Editpart.getContent());
		assertSame(view1Editpart, layout1Editpart.getView());
		assertSame(view1, layout1.getView());

		// dispose the layout
		//
		layout1Editpart.dispose();
		assertFalse(view1Editpart.isDisposed());
		assertTrue(layout1Editpart.isDisposed());

		assertNull(view1Editpart.getContent());
		assertNull(layout1.getParent());
	}

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		YView view1 = modelFactory.createYView();
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);

		assertFalse(view1Editpart.isDisposed());
		view1Editpart.dispose();
		assertTrue(view1Editpart.isDisposed());

		view1Editpart.isDisposed();
		view1Editpart.dispose();

		try {
			view1Editpart.addDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			view1Editpart.setContent(null);
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			view1Editpart.getContent();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			view1Editpart.getId();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			view1Editpart.getModel();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			view1Editpart.removeDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
	}

	/**
	 * Tests setContent by model.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setBindingSet_byModel() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YView view1 = modelFactory.createYView();
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		view1.setBindingSet(bindingSet);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		assertFalse(bindingSetEditpart.isActive());

		assertSame(bindingSetEditpart, view1Editpart.getBindingSet());
		// parent is null if it is the view
		assertSame(view1Editpart, bindingSetEditpart.getView());
		assertTrue(bindingSetEditpart.isActive());

		// unset the binding set
		//
		view1.setBindingSet(null);
		assertNull(view1Editpart.getBindingSet());
		assertTrue(bindingSetEditpart.isDisposed());
	}

	/**
	 * Tests setContent by editPart.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setBindingSet_byEditPart() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YView view1 = modelFactory.createYView();
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		assertFalse(bindingSetEditpart.isActive());

		view1Editpart.setBindingSet(bindingSetEditpart);
		assertSame(bindingSetEditpart, view1Editpart.getBindingSet());
		// parent is null if it is the view
		assertSame(view1Editpart, bindingSetEditpart.getView());
		assertTrue(bindingSetEditpart.isActive());

		// unset the layout
		//
		view1.setBindingSet(null);
		assertNull(view1Editpart.getBindingSet());
		assertTrue(bindingSetEditpart.isDisposed());
	}

	/**
	 * Tests setContent by editPart.
	 * 
	 * @throws ContextException
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_configuration() throws ContextException {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YView view1 = modelFactory.createYView();
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);

		final List<String> callOrder = new ArrayList<String>();
		view1Editpart.setConfiguration(new ConfigurationAdapter() {
			@Override
			public void beforeUiRendering(IContext context) {
				callOrder.add("beforeUiRendering");
			}

			@Override
			public void afterUiRendering(IContext context) {
				callOrder.add("afterUiRendering");
			}

			@Override
			public void beforeBind(IContext context) {
				callOrder.add("beforeBind");
			}

			@Override
			public void afterBind(IContext context) {
				callOrder.add("afterBind");
			}
		});

		view1Editpart.render(null);

		assertEquals("beforeUiRendering", callOrder.get(0));
		assertEquals("afterUiRendering", callOrder.get(1));
		assertEquals("beforeBind", callOrder.get(2));
		assertEquals("afterBind", callOrder.get(3));

	}

	/**
	 * A helper presentation.
	 */
	@SuppressWarnings("rawtypes")
	private static class Presentation implements IViewPresentation {

		@Override
		public boolean isDisposed() {
			return false;
		}

		@Override
		public void dispose() {

		}

		@Override
		public void addDisposeListener(Listener listener) {

		}

		@Override
		public void removeDisposeListener(Listener listener) {

		}

		@Override
		public void unrender() {

		}

		@Override
		public Object createWidget(Object parent) {
			return null;
		}

		@Override
		public Object getWidget() {
			return null;
		}

		@Override
		public boolean isRendered() {
			return false;
		}

		@Override
		public void setContent(IWidgetPresentation presentation) {

		}

		@Override
		public void render(Map options) {

		}

		@Override
		public IWidgetPresentation getContent() {
			return null;
		}

		@Override
		public Object getModel() {
			return null;
		}

		@Override
		public IViewContext getViewContext() {
			return null;
		}

		@Override
		public IObservable getObservableValue(Object model) {
			return null;
		}
	}

	/**
	 * A helper presenter factory.
	 */
	private static class PresenterFactory implements IPresentationFactory {

		@Override
		public boolean isFor(IViewContext uiContext, IElementEditpart editpart) {
			return true;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <A extends IWidgetPresentation<?>> A createPresentation(
				IViewContext uiContext, IElementEditpart editpart) {
			return (A) new Presentation();
		}
	}
}
