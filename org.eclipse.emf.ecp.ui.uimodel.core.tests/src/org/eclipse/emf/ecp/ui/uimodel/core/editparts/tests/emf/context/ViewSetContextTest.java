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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans.IValueBean;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewSetContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ViewSetContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.IDisposable;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.internal.beans.ObjectBean;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class ViewSetContextTest {

	private EditpartManager editpartManager = new EditpartManager();
	private ResourceSetImpl resourceSet;
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;
	private ViewContext view1Context;
	private ViewContext view2Context;
	private ViewSetContext viewSetContext;

	@Before
	public void setup() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(UiModelPackage.eNS_URI, UiModelPackage.eINSTANCE);

		DelegatingEditPartManager manager = DelegatingEditPartManager.getInstance();
		manager.addFactory(new EditpartManager());

		IUiViewEditpart viewEditPart = editpartManager.createEditpart("http://eclipse.org/emf/emfclient/uimodel",
			IUiViewEditpart.class);
		view1Context = new ViewContext(viewEditPart);
		IUiViewEditpart view2EditPart = editpartManager.createEditpart("http://eclipse.org/emf/emfclient/uimodel",
			IUiViewEditpart.class);
		view2Context = new ViewContext(view2EditPart);

		IUiViewSetEditpart viewSetEditPart = editpartManager.createEditpart("http://eclipse.org/emf/emfclient/uimodel",
			IUiViewSetEditpart.class);
		viewSetContext = new ViewSetContext(viewSetEditPart);
		viewSetEditPart.addView(viewEditPart);
		viewSetEditPart.addView(view2EditPart);
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
		IValueBean rootbean = view1Context.getRootBean();
		Assert.assertNotNull(rootbean);
		Assert.assertSame(rootbean, view1Context.getRootBean());

		// test internal create bean
		//
		Assert.assertNotNull(view1Context.getValueBean("bean1"));
		Assert.assertTrue(view1Context.getValueBean("bean1") instanceof ObjectBean);

		// tests registering bean
		//
		view1Context.registerValueBean("bean1", valueBean1);
		Assert.assertSame(valueBean1, view1Context.getValueBean("bean1"));

		view1Context.registerValueBean("bean1", valueBean2);
		Assert.assertNotSame(valueBean1, view1Context.getValueBean("bean1"));
		Assert.assertSame(valueBean2, view1Context.getValueBean("bean1"));
	}

	@Test
	public void test_dispose() {
		Assert.assertFalse(viewSetContext.isDisposed());
		viewSetContext.dispose();
		Assert.assertTrue(viewSetContext.isDisposed());

		try {
			viewSetContext.addDisposeListener(null);
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			viewSetContext.getViewContexts();
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			viewSetContext.getViewSetEditpart();
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			viewSetContext.getRootBean();
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			viewSetContext.getValueBean("test");
			Assert.fail("must throw exception");
		} catch (Exception e) {
		}

		try {
			viewSetContext.registerValueBean("test", new IValueBean() {
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
			viewSetContext.removeDisposeListener(null);
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
		viewSetContext.addDisposeListener(listener);
		Assert.assertEquals(0, counter[0]);
		viewSetContext.dispose();
		Assert.assertEquals(1, counter[0]);
	}

	@Test
	public void test_dispose_delegateToViewsEditpart() {
		Assert.assertFalse(viewSetContext.isDisposed());
		Assert.assertFalse(view1Context.isDisposed());
		Assert.assertFalse(view2Context.isDisposed());

		// create view parts
		//
		viewSetContext.dispose();
		Assert.assertTrue(viewSetContext.isDisposed());
		Assert.assertTrue(view1Context.isDisposed());
		Assert.assertTrue(view2Context.isDisposed());
	}

	@Test
	public void test_getViewSetEditpart() {
		IUiViewSetEditpart viewSetEditPart = editpartManager.createEditpart("http://eclipse.org/emf/emfclient/uimodel",
			IUiViewSetEditpart.class);
		ViewSetContext context = new ViewSetContext(viewSetEditPart);
		Assert.assertSame(viewSetEditPart, context.getViewSetEditpart());
	}

	@Test
	public void test_getViewContexts() {
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

		// create view set part
		//
		IViewSetContext viewSetContext = new ViewSetContext(viewSetEditPart);
		Assert.assertSame(viewSetContext, viewSetEditPart.getContext());
		Assert.assertEquals(0, viewSetContext.getViewContexts().size());

		// create view part 1
		//
		IViewContext viewContext1 = new ViewContext(view1EditPart);
		Assert.assertSame(viewContext1, view1EditPart.getContext());
		Assert.assertEquals(1, viewSetContext.getViewContexts().size());
		Assert.assertSame(viewContext1, viewSetContext.getViewContexts().get(0));

		// create view part 2
		//
		IViewContext viewContext2 = new ViewContext(view2EditPart);
		Assert.assertSame(viewContext2, view2EditPart.getContext());
		Assert.assertEquals(2, viewSetContext.getViewContexts().size());
		Assert.assertSame(viewContext2, viewSetContext.getViewContexts().get(1));

	}

	@Test
	public void test_disposeViewContexts() {
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
		Assert.assertSame(viewSetContext, viewSetEditPart.getContext());
		Assert.assertEquals(0, viewSetContext.getViewContexts().size());

		// create view parts
		//
		IViewContext viewContext1 = new ViewContext(view1EditPart);
		IViewContext viewContext2 = new ViewContext(view2EditPart);

		Assert.assertEquals(2, viewSetContext.getViewContexts().size());
		Assert.assertSame(viewSetContext, viewContext1.getParentContext());
		Assert.assertSame(viewSetContext, viewContext2.getParentContext());

		// dispose view part 2
		//
		viewContext2.dispose();
		Assert.assertEquals(1, viewSetContext.getViewContexts().size());
		Assert.assertSame(viewSetContext, viewContext1.getParentContext());

		// dispose view part 1
		//
		viewContext1.dispose();
		Assert.assertEquals(0, viewSetContext.getViewContexts().size());

	}

	@Test
	public void test_moveViews_testContexts() {
		YUiViewSet viewSet1 = modelFactory.createYUiViewSet();
		YUiViewSet viewSet2 = modelFactory.createYUiViewSet();

		// viewSet
		// ...> view1
		// ...> view2
		YUiView view1 = modelFactory.createYUiView();
		viewSet1.getViews().add(view1);

		YUiView view2 = modelFactory.createYUiView();
		viewSet1.getViews().add(view2);

		// access the editparts the editpartManager
		//
		// viewSet
		IUiViewSetEditpart viewSet1EditPart = editpartManager.getEditpart(viewSet1);
		IUiViewSetEditpart viewSet2EditPart = editpartManager.getEditpart(viewSet2);
		IUiViewEditpart view1EditPart = editpartManager.getEditpart(view1);
		IUiViewEditpart view2EditPart = editpartManager.getEditpart(view2);

		// create view set part
		//
		IViewSetContext viewSet1Context = new ViewSetContext(viewSet1EditPart);
		IViewSetContext viewSet2Context = new ViewSetContext(viewSet2EditPart);
		IViewContext viewContext1 = new ViewContext(view1EditPart);
		IViewContext viewContext2 = new ViewContext(view2EditPart);

		Assert.assertEquals(2, viewSet1Context.getViewContexts().size());
		Assert.assertSame(viewSet1Context, viewContext1.getParentContext());
		Assert.assertSame(viewSet1Context, viewContext2.getParentContext());

		// move view2 to viewSet2
		//
		viewSet2EditPart.addView(view2EditPart);
		Assert.assertEquals(1, viewSet1Context.getViewContexts().size());
		Assert.assertSame(viewSet1Context, viewContext1.getParentContext());

		Assert.assertEquals(1, viewSet2Context.getViewContexts().size());
		Assert.assertSame(viewSet2Context, viewContext2.getParentContext());

		// remove view1 form viewSet1
		//
		viewSet1EditPart.removeView(view1EditPart);
		Assert.assertEquals(0, viewSet1Context.getViewContexts().size());
		Assert.assertNull(viewContext1.getParentContext());

		Assert.assertEquals(1, viewSet2Context.getViewContexts().size());
		Assert.assertSame(viewSet2Context, viewContext2.getParentContext());

		// add view1 to viewSet2
		//
		viewSet2EditPart.addView(view1EditPart);
		Assert.assertEquals(0, viewSet1Context.getViewContexts().size());

		Assert.assertEquals(2, viewSet2Context.getViewContexts().size());
		Assert.assertSame(viewSet2Context, viewContext1.getParentContext());
		Assert.assertSame(viewSet2Context, viewContext2.getParentContext());
	}

	@Test
	public void test_newInstance() {
		// ...........> field2
		YUiViewSet viewSet = modelFactory.createYUiViewSet();
		IUiViewSetEditpart viewSetEditPart = editpartManager.getEditpart(viewSet);

		// contexts null
		//
		Assert.assertNull(viewSetEditPart.getContext());

		// set context 1
		//
		ViewSetContext viewSetContext1 = new ViewSetContext(viewSetEditPart);
		Assert.assertSame(viewSetContext1, viewSetEditPart.getContext());

		// set the same instance twice
		//
		viewSetEditPart.setContext(viewSetContext1);
		Assert.assertSame(viewSetContext1, viewSetEditPart.getContext());

		try {
			new ViewSetContext(viewSetEditPart);
		} catch (Exception e) {
			// expected
		}
	}

}
