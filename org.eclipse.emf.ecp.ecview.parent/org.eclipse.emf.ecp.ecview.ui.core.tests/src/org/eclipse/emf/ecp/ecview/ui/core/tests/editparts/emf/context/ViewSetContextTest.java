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
package org.eclipse.emf.ecp.ecview.ui.core.tests.editparts.emf.context;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ecview.common.beans.IValueBean;
import org.eclipse.emf.ecp.ecview.common.beans.ObjectBean;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.context.IViewSetContext;
import org.eclipse.emf.ecp.ecview.common.context.ViewContext;
import org.eclipse.emf.ecp.ecview.common.context.ViewSetContext;
import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.EditpartManager;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link ViewSetContext}.
 */
@SuppressWarnings("restriction")
public class ViewSetContextTest {

	private EditpartManager editpartManager = new EditpartManager();
	private ResourceSetImpl resourceSet;
	private CoreModelFactory modelFactory = CoreModelFactory.eINSTANCE;
	private ViewContext view1Context;
	private ViewContext view2Context;
	private ViewSetContext viewSetContext;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		resourceSet = new ResourceSetImpl();
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(CoreModelPackage.eNS_URI,
				CoreModelPackage.eINSTANCE);

		DelegatingEditPartManager manager = DelegatingEditPartManager
				.getInstance();
		manager.clear();
		manager.addDelegate(new org.eclipse.emf.ecp.ecview.common.editpart.emf.EditpartManager());
		manager.addDelegate(new org.eclipse.emf.ecp.ecview.extension.editpart.emf.EditpartManager());

		IViewEditpart viewEditPart = editpartManager
				.createEditpart("http://eclipse.org/emf/emfclient/uimodel",
						IViewEditpart.class);
		view1Context = new ViewContext(viewEditPart);
		IViewEditpart view2EditPart = editpartManager
				.createEditpart("http://eclipse.org/emf/emfclient/uimodel",
						IViewEditpart.class);
		view2Context = new ViewContext(view2EditPart);

		IViewSetEditpart viewSetEditPart = editpartManager.createEditpart(
				"http://eclipse.org/emf/emfclient/uimodel",
				IViewSetEditpart.class);
		viewSetContext = new ViewSetContext(viewSetEditPart);
		viewSetEditPart.addView(viewEditPart);
		viewSetEditPart.addView(view2EditPart);
	}

	/**
	 * Tests {@link IViewContext#getBean(String)} and
	 * {@link IViewContext#registerBean(String, IValueBean)}.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_valueBeans() {
		// END SUPRESS CATCH EXCEPTION
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
		Assert.assertNotNull(view1Context.getBean("bean1"));
		Assert.assertTrue(view1Context.getBean("bean1") instanceof ObjectBean);

		// tests registering bean
		//
		view1Context.registerBean("bean1", valueBean1);
		Assert.assertSame(valueBean1, view1Context.getBean("bean1"));

		view1Context.registerBean("bean1", valueBean2);
		Assert.assertNotSame(valueBean1, view1Context.getBean("bean1"));
		Assert.assertSame(valueBean2, view1Context.getBean("bean1"));
	}

	/**
	 * Tests {@link IViewSetContext#getBean(String)} and
	 * {@link IViewSetContext#registerBean(String, IValueBean)}.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_valueBeans_viewSet() {
		// END SUPRESS CATCH EXCEPTION
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
		IValueBean rootbean = viewSetContext.getRootBean();
		Assert.assertNotNull(rootbean);
		Assert.assertSame(rootbean, viewSetContext.getRootBean());

		// test internal create bean
		//
		Assert.assertNotNull(viewSetContext.getBean("bean1"));
		Assert.assertTrue(viewSetContext.getBean("bean1") instanceof ObjectBean);

		// tests registering bean
		//
		viewSetContext.registerBean("bean1", valueBean1);
		Assert.assertSame(valueBean1, viewSetContext.getBean("bean1"));

		viewSetContext.registerBean("bean1", valueBean2);
		Assert.assertNotSame(valueBean1, viewSetContext.getBean("bean1"));
		Assert.assertSame(valueBean2, viewSetContext.getBean("bean1"));
	}

	/**
	 * Tests {@link IViewSetContext#getService(String)} and
	 * {@link IViewSetContext#registerService(String, IValueBean)} and
	 * {@link IViewSetContext#unregisterService(String)}.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_services() {
		// END SUPRESS CATCH EXCEPTION
		Object service1 = new Object();
		Object service2 = new Object();

		// test null
		//
		Assert.assertNull(viewSetContext.getService("service1"));

		// tests registering bean
		//
		viewSetContext.registerService("service1", service1);
		Assert.assertSame(service1, viewSetContext.getService("service1"));
		viewSetContext.registerService("service2", service2);
		Assert.assertSame(service2, viewSetContext.getService("service2"));

		viewSetContext.unregisterService("service1");
		Assert.assertNull(viewSetContext.getService("service1"));
		Assert.assertSame(service2, viewSetContext.getService("service2"));

		viewSetContext.unregisterService("service2");
		Assert.assertNull(viewSetContext.getService("service2"));
	}

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		Assert.assertFalse(viewSetContext.isDisposed());
		viewSetContext.dispose();
		Assert.assertTrue(viewSetContext.isDisposed());

		try {
			viewSetContext.addDisposeListener(null);
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			viewSetContext.getViewContexts();
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			viewSetContext.getViewSetEditpart();
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			viewSetContext.getRootBean();
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			viewSetContext.getBean("test");
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			viewSetContext.registerBean("test", new IValueBean() {
				@Override
				public void setValue(Object value) {
				}

				@Override
				public Object getValue() {
					return null;
				}
			});
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			viewSetContext.getService("test");
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			viewSetContext.registerService("test", new Object());
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			viewSetContext.unregisterService("test");
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			viewSetContext.removeDisposeListener(null);
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}
	}

	/**
	 * Tests the dispose listeners.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose_listener() {
		// END SUPRESS CATCH EXCEPTION
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

	/**
	 * Tests that dispose also disposes the child containments.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose_delegateToViewsEditpart() {
		// END SUPRESS CATCH EXCEPTION
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

	/**
	 * Tests the getViewSetEditpart method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getViewSetEditpart() {
		// END SUPRESS CATCH EXCEPTION
		IViewSetEditpart viewSetEditPart = editpartManager.createEditpart(
				"http://eclipse.org/emf/emfclient/uimodel",
				IViewSetEditpart.class);
		ViewSetContext context = new ViewSetContext(viewSetEditPart);
		Assert.assertSame(viewSetEditPart, context.getViewSetEditpart());
	}

	/**
	 * Tests the getViewContexts method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getViewContexts() {
		// END SUPRESS CATCH EXCEPTION
		YViewSet viewSet = modelFactory.createYViewSet();

		// viewSet
		// ...> view1
		// ...> view2
		YView view1 = modelFactory.createYView();
		viewSet.getViews().add(view1);

		YView view2 = modelFactory.createYView();
		viewSet.getViews().add(view2);

		// access the editparts the editpartManager
		//
		// viewSet
		IViewSetEditpart viewSetEditPart = editpartManager.getEditpart(viewSet);
		IViewEditpart view1EditPart = editpartManager.getEditpart(view1);
		IViewEditpart view2EditPart = editpartManager.getEditpart(view2);

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

	/**
	 * Tests the disposal of the view contexts and that they corretly treath the
	 * viewsetContext.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_disposeViewContexts() {
		// END SUPRESS CATCH EXCEPTION
		YViewSet viewSet = modelFactory.createYViewSet();

		// viewSet
		// ...> view1
		// ...> view2
		YView view1 = modelFactory.createYView();
		viewSet.getViews().add(view1);

		YView view2 = modelFactory.createYView();
		viewSet.getViews().add(view2);

		// access the editparts the editpartManager
		//
		// viewSet
		IViewSetEditpart viewSetEditPart = editpartManager.getEditpart(viewSet);
		IViewEditpart view1EditPart = editpartManager.getEditpart(view1);
		IViewEditpart view2EditPart = editpartManager.getEditpart(view2);

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

	/**
	 * Tests the move views between viewSetContexts.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_moveViews_testContexts() {
		// END SUPRESS CATCH EXCEPTION
		YViewSet viewSet1 = modelFactory.createYViewSet();
		YViewSet viewSet2 = modelFactory.createYViewSet();

		// viewSet
		// ...> view1
		// ...> view2
		YView view1 = modelFactory.createYView();
		viewSet1.getViews().add(view1);

		YView view2 = modelFactory.createYView();
		viewSet1.getViews().add(view2);

		// access the editparts the editpartManager
		//
		// viewSet
		IViewSetEditpart viewSet1EditPart = editpartManager
				.getEditpart(viewSet1);
		IViewSetEditpart viewSet2EditPart = editpartManager
				.getEditpart(viewSet2);
		IViewEditpart view1EditPart = editpartManager.getEditpart(view1);
		IViewEditpart view2EditPart = editpartManager.getEditpart(view2);

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

	/**
	 * Tests setting the same instance twice.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_newInstance() {
		// ENDIF SUPRESS CATCH EXCEPTION
		// ...........> field2
		YViewSet viewSet = modelFactory.createYViewSet();
		IViewSetEditpart viewSetEditPart = editpartManager.getEditpart(viewSet);

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
