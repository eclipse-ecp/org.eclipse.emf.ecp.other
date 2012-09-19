/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.tests.emf.context;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans.IValueBean;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ContextException;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewSetContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ViewSetContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.IDisposable;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.internal.beans.ObjectBean;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IPresentationFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IViewPresentation;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class ViewContextTest {

	private EditpartManager editpartManager = new EditpartManager();
	private DelegatingPresenterFactory presenterFactory = DelegatingPresenterFactory.getInstance();
	private ResourceSetImpl resourceSet;
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;
	private ViewContext context;

	@Before
	public void setup() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(UiModelPackage.eNS_URI, UiModelPackage.eINSTANCE);

		DelegatingEditPartManager manager = DelegatingEditPartManager.getInstance();
		manager.clear();
		manager.addFactory(new EditpartManager());

		IUiViewEditpart viewEditPart = editpartManager.createEditpart("http://eclipse.org/emf/emfclient/uimodel",
			IUiViewEditpart.class);
		context = new ViewContext(viewEditPart);

	}

	/**
	 * Tests {@link IViewContext#getValueBean(String)} and {@link IViewContext#registerValueBean(String, IValueBean)}.
	 */
	@Test
	public void test_valueBeans() {
		IValueBean valueBean1 = new IValueBean() {
			@Override
			public void setValue(Object value) {
			}

			@Override
			public Object getValue() {
				return null;
			}
		};

		IValueBean valueBean2 = new IValueBean() {
			@Override
			public void setValue(Object value) {
			}

			@Override
			public Object getValue() {
				return null;
			}
		};

		// tests root bean
		//
		IValueBean rootbean = context.getRootBean();
		Assert.assertNotNull(rootbean);
		Assert.assertSame(rootbean, context.getRootBean());

		// test internal create bean
		//
		Assert.assertNotNull(context.getValueBean("bean1"));
		Assert.assertTrue(context.getValueBean("bean1") instanceof ObjectBean);

		// tests registering bean
		//
		context.registerValueBean("bean1", valueBean1);
		Assert.assertSame(valueBean1, context.getValueBean("bean1"));

		context.registerValueBean("bean1", valueBean2);
		Assert.assertNotSame(valueBean1, context.getValueBean("bean1"));
		Assert.assertSame(valueBean2, context.getValueBean("bean1"));
	}

	@Test
	public void test_dispose() {
		Assert.assertFalse(context.isDisposed());
		context.dispose();
		Assert.assertTrue(context.isDisposed());

		try {
			context.addDisposeListener(null);
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			context.getParentContext();
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			context.getPresentationURI();
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			context.getRootBean();
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			context.getRootLayout();
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			context.getValueBean("test");
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			context.getViewEditpart();
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			context.isRendered();
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			context.registerValueBean("test", new IValueBean() {
				@Override
				public void setValue(Object value) {
				}

				@Override
				public Object getValue() {
					return null;
				}
			});
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			context.removeDisposeListener(null);
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			context.render("test", null, null);
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			context.setPresentationURI("test");
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}
	}

	@Test
	public void test_dispose_listener() {
		final int[] counter = new int[1];
		IDisposable.Listener listener = new IDisposable.Listener() {
			@Override
			public void notifyDisposed(IDisposable notifier) {
				counter[0]++;
			}
		};
		context.addDisposeListener(listener);
		Assert.assertEquals(0, counter[0]);
		context.dispose();
		Assert.assertEquals(1, counter[0]);
	}

	@Test
	public void test_dispose_removedFromParentContext() {
		YUiViewSet viewSet = modelFactory.createYUiViewSet();

		// viewSet
		// ...> view1
		// ...> view2
		YUiView view1 = modelFactory.createYUiView();
		viewSet.getViews().add(view1);

		YUiView view2 = modelFactory.createYUiView();
		viewSet.getViews().add(view2);

		// access the editparts the editpartManager
		//
		// viewSet
		IUiViewSetEditpart viewSetEditPart = editpartManager.getEditpart(viewSet);
		IUiViewEditpart view1EditPart = editpartManager.getEditpart(view1);
		IUiViewEditpart view2EditPart = editpartManager.getEditpart(view2);

		// create view set part
		//
		IViewSetContext viewSetContext = new ViewSetContext(viewSetEditPart);

		// create view parts
		//
		IViewContext viewContext1 = new ViewContext(view1EditPart);
		IViewContext viewContext2 = new ViewContext(view2EditPart);
		Assert.assertNotNull(viewContext1.getParentContext());
		Assert.assertNotNull(viewContext2.getParentContext());
		Assert.assertEquals(2, viewSetContext.getViewContexts().size());

		viewContext1.dispose();
		Assert.assertEquals(1, viewSetContext.getViewContexts().size());

		viewContext2.dispose();
		Assert.assertEquals(0, viewSetContext.getViewContexts().size());
	}

	@Test
	public void test_dispose_delegateToContentEditpart() {
		YUiViewSet viewSet = modelFactory.createYUiViewSet();

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		YUiView view1 = modelFactory.createYUiView();
		viewSet.getViews().add(view1);
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);

		// access the editparts from their parents
		//
		// view1
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.getEditpart(field1);

		// create view parts
		//
		IViewContext viewContext1 = new ViewContext(view1Editpart);
		viewContext1.dispose();
		Assert.assertTrue(viewContext1.isDisposed());
		Assert.assertTrue(layout1Editpart.isDisposed());
		Assert.assertTrue(field1Editpart.isDisposed());
	}



	@Test
	public void test_getViewEditpart() {
		IUiViewEditpart viewEditPart = editpartManager.createEditpart("http://eclipse.org/emf/emfclient/uimodel",
			IUiViewEditpart.class);
		ViewContext context = new ViewContext(viewEditPart);
		Assert.assertSame(viewEditPart, context.getViewEditpart());
	}

	@Test
	public void test_render() {
		presenterFactory.clear();
		presenterFactory.addFactory(new PresenterFactory());
		Assert.assertFalse(context.isRendered());

		try {
			context.render("test", new Object(), null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Assert.assertTrue(context.isRendered());

		try {
			context.render("test", new Object(), null);
			Assert.fail();
		} catch (Exception e) {
			Assert.assertEquals("Has already been rendered!", e.getMessage());
		}
	}

	@Test
	public void test_render_PresenterNull() {
		presenterFactory.clear();
		try {
			context.render(null, new Object(), null);
		} catch (ContextException e) {
			Assert.assertEquals("Presenter must not be null!", e.getMessage());
		}
	}

	@Test
	public void test_render_layoutNull() {
		presenterFactory.clear();
		try {
			context.render("test", null, null);
			Assert.fail();
		} catch (ContextException e) {
			Assert.assertEquals("RootLayout must not be null!", e.getMessage());
		}
	}

	@Test
	public void test_render_presentationURINull() {
		presenterFactory.clear();
		presenterFactory.addFactory(new PresenterFactory());
		try {
			context.render(null, new Object(), null);
		} catch (ContextException e) {
			Assert.fail();
		}
	}

	@Test
	public void test_getParentContext() {
		YUiViewSet viewSet = modelFactory.createYUiViewSet();

		// viewSet
		// ...> view1
		// ...> view2
		YUiView view1 = modelFactory.createYUiView();
		viewSet.getViews().add(view1);

		YUiView view2 = modelFactory.createYUiView();
		viewSet.getViews().add(view2);

		// access the editparts the editpartManager
		//
		// viewSet
		IUiViewSetEditpart viewSetEditPart = editpartManager.getEditpart(viewSet);
		IUiViewEditpart view1EditPart = editpartManager.getEditpart(view1);
		IUiViewEditpart view2EditPart = editpartManager.getEditpart(view2);

		// contexts null
		//
		Assert.assertNull(viewSetEditPart.getContext());
		Assert.assertNull(view1EditPart.getContext());
		Assert.assertNull(view2EditPart.getContext());

		// parent null
		//
		Assert.assertNull(view1EditPart.getContext());
		Assert.assertNull(view2EditPart.getContext());

		// create view part 1
		//
		IViewContext viewContext1 = new ViewContext(view1EditPart);
		Assert.assertNotNull(view1EditPart.getContext());
		Assert.assertNull(viewContext1.getParentContext());

		// create view set part
		//
		IViewSetContext viewSetContext = new ViewSetContext(viewSetEditPart);
		Assert.assertNotNull(viewSetEditPart.getContext());
		Assert.assertEquals(1, viewSetContext.getViewContexts().size());

		// test view part parents
		//
		Assert.assertNotNull(viewContext1.getParentContext());

		IViewContext viewContext2 = new ViewContext(view2EditPart);
		Assert.assertNotNull(view2EditPart.getContext());
		Assert.assertEquals(2, viewSetContext.getViewContexts().size());

		// test view part parents
		//
		Assert.assertNotNull(viewContext1.getParentContext());
		Assert.assertNotNull(viewContext2.getParentContext());
	}

	private static class PresenterFactory implements IPresentationFactory {

		@Override
		public boolean isFor(IViewContext uiContext, IUiElementEditpart editpart) {
			return true;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <A extends IWidgetPresentation<?>> A createPresentation(IViewContext uiContext,
			IUiElementEditpart editpart) {
			return (A) new Presentation();
		}
	}

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
	}
}
