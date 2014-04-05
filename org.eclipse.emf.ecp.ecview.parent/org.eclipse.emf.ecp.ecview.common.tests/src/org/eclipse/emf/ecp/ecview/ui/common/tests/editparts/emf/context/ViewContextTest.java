/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.common.tests.editparts.emf.context;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.concurrent.IExecutorService;
import org.eclipse.emf.ecp.ecview.common.context.ContextException;
import org.eclipse.emf.ecp.ecview.common.context.IContext;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.context.IViewSetContext;
import org.eclipse.emf.ecp.ecview.common.context.ViewContext;
import org.eclipse.emf.ecp.ecview.common.context.ViewSetContext;
import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.EditpartManager;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.notification.ILifecycleService;
import org.eclipse.emf.ecp.ecview.common.notification.LifecycleService;
import org.eclipse.emf.ecp.ecview.common.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ecview.common.presentation.IPresentationFactory;
import org.eclipse.emf.ecp.ecview.common.presentation.IViewPresentation;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.common.services.DelegatingServiceProviderManager;
import org.eclipse.emf.ecp.ecview.common.services.IServiceProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the view context.
 */
@SuppressWarnings("restriction")
public class ViewContextTest {

	private EditpartManager editpartManager = new EditpartManager();
	private DelegatingPresenterFactory presenterFactory = DelegatingPresenterFactory
			.getInstance();
	private ResourceSetImpl resourceSet;
	private CoreModelFactory modelFactory = CoreModelFactory.eINSTANCE;
	private ViewContext context;

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
		manager.addDelegate(new EditpartManager());

		IViewEditpart viewEditPart = editpartManager
				.createEditpart("http://eclipse.org/emf/emfclient/uimodel",
						IViewEditpart.class);
		context = new ViewContext(viewEditPart);

		DelegatingServiceProviderManager.getInstance().clear();
		context.registerService(ILifecycleService.class.getName(),
				new LifecycleService());
	}

	/**
	 * Tests {@link IViewContext#getBean(String)} and
	 * {@link IViewContext#setBean(String, Object)}.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_valueBeans() {
		// END SUPRESS CATCH EXCEPTION
		Object bean1 = new Object();
		Object bean2 = new Object();

		// tests root bean
		//
		// test internal create bean
		//
		Assert.assertNull(context.getBean("bean1"));

		// tests registering bean
		//
		context.setBean("bean1", bean1);
		Assert.assertSame(bean1, context.getBean("bean1"));

		context.setBean("bean1", bean2);
		Assert.assertSame(bean2, context.getBean("bean1"));
	}

	/**
	 * Tests {@link IViewContext#getBeanSlot(String)} and
	 * {@link IViewContext#setBean(String, Object)}.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_slot() {
		// END SUPRESS CATCH EXCEPTION
		Object bean1 = new Object();
		Object bean2 = new Object();

		// test internal create bean
		//
		Assert.assertNull(context.getBeanSlot("bean1"));
		ISlot slot = context.createBeanSlot("bean1", Object.class);
		Assert.assertNull(slot.getValue());

		// tests registering bean
		//
		context.setBean("bean1", bean1);
		Assert.assertSame(bean1, context.getBeanSlot("bean1").getValue());
		Assert.assertSame(bean1, slot.getValue());
		Assert.assertSame(slot, context.getBeanSlot("bean1"));

		context.setBean("bean1", bean2);
		Assert.assertSame(bean2, context.getBeanSlot("bean1").getValue());
		Assert.assertSame(bean2, slot.getValue());
		Assert.assertSame(slot, context.getBeanSlot("bean1"));
	}

	/**
	 * Tests {@link IViewContext#createBeanSlot(String, Class)}.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_createSlot() {
		// END SUPRESS CATCH EXCEPTION
		Person person1 = new Person();
		Person person2 = new Person();

		Assert.assertNull(context.getBeanSlot("person"));

		ISlot slot = context.createBeanSlot("person", Person.class);
		Assert.assertSame(Person.class, slot.getValueType());

		Assert.assertNull(slot.getValue());

		// tests registering bean
		//
		context.setBean("person", person1);
		Assert.assertSame(person1, slot.getValue());

		context.setBean("person", person2);
		Assert.assertSame(person2, slot.getValue());
	}

	/**
	 * Tests {@link IViewContext#createBeanSlot(String, Class)}.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setBean() {
		// END SUPRESS CATCH EXCEPTION
		Person person = new Person();

		Assert.assertNull(context.getBeanSlot("person"));

		context.setBean("person", person);
		ISlot slot = context.getBeanSlot("person");
		Assert.assertSame(Person.class, slot.getValueType());
		Assert.assertSame(person, slot.getValue());

	}

	/**
	 * Tests {@link IViewContext#setBean(String, Object)}.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setBean_Null_NoSlot() {
		// END SUPRESS CATCH EXCEPTION

		try {
			context.setBean("person", null);
			Assert.fail("not allowed to set null values if no slot exists!");
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Tests {@link IViewContext#setBean(String, Object)}.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setBean_Null() {
		// END SUPRESS CATCH EXCEPTION
		context.createBeanSlot("person", Person.class);

		// is valid to set null value
		context.setBean("person", null);
	}

	/**
	 * Tests {@link IViewContext#setBean(String, Object)}.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setBean_MatchingTypes() {

		Person person = new Person();

		// END SUPRESS CATCH EXCEPTION
		context.createBeanSlot("person", Person.class);

		// is valid to set null value
		context.setBean("person", person);
		context.setBean("person", null);
		context.setBean("person", new PersonExtended());
		try {
			context.setBean("person", new Object());
			Assert.fail("Type can not be set. Does not match contained type!");
		} catch (Exception e) {
		}
	}

	/**
	 * Tests {@link IViewContext#getService(String)} and
	 * {@link IViewContext#registerService(String, ISlot)} and
	 * {@link IViewContext#unregisterService(String)}.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_services() {
		// END SUPRESS CATCH EXCEPTION
		Object service1 = new Object();
		Object service2 = new Object();

		// test null
		//
		Assert.assertNull(context.getService("service1"));

		// tests registering bean
		//
		context.registerService("service1", service1);
		Assert.assertSame(service1, context.getService("service1"));
		context.registerService("service2", service2);
		Assert.assertSame(service2, context.getService("service2"));

		context.unregisterService("service1");
		Assert.assertNull(context.getService("service1"));
		Assert.assertSame(service2, context.getService("service2"));

		context.unregisterService("service2");
		Assert.assertNull(context.getService("service2"));
	}

	/**
	 * Tests dispose.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	@Test
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		Assert.assertFalse(context.isDisposed());
		context.dispose();
		Assert.assertTrue(context.isDisposed());

		try {
			context.addDisposeListener(null);
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.getParentContext();
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.getPresentationURI();
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.getRootLayout();
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.getBean("test");
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.getViewEditpart();
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.isRendered();
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.setBean("test", new Object());
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.getService("test");
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.registerService("test", new Object());
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.unregisterService("test");
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.removeDisposeListener(null);
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.render("test", null, null);
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			context.setPresentationURI("test");
			Assert.fail("must throw exception");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}
	}

	/**
	 * Test the dipose listeners.
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
		context.addDisposeListener(listener);
		Assert.assertEquals(0, counter[0]);
		context.dispose();
		Assert.assertEquals(1, counter[0]);
	}

	/**
	 * Tests the removal of the context from its parent.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose_removedFromParentContext() {
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

	/**
	 * Tests, that disposal will also dispose the containment childs.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose_delegateToContentEditpart() {
		// END SUPRESS CATCH EXCEPTION
		YViewSet viewSet = modelFactory.createYViewSet();

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		YView view1 = modelFactory.createYView();
		viewSet.getViews().add(view1);
		YLayout layout1 = modelFactory.createYLayout();
		view1.setContent(layout1);
		YField field1 = modelFactory.createYField();
		layout1.getElements().add(field1);

		// access the editparts from their parents
		//
		// view1
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		// layout1
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		// field1
		IFieldEditpart field1Editpart = editpartManager.getEditpart(field1);

		// create view parts
		//
		IViewContext viewContext1 = new ViewContext(view1Editpart);
		viewContext1.dispose();
		Assert.assertTrue(viewContext1.isDisposed());
		Assert.assertTrue(layout1Editpart.isDisposed());
		Assert.assertTrue(field1Editpart.isDisposed());
	}

	/**
	 * Tests the getViewEditpart method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getViewEditpart() {
		// END SUPRESS CATCH EXCEPTION
		IViewEditpart viewEditPart = editpartManager
				.createEditpart("http://eclipse.org/emf/emfclient/uimodel",
						IViewEditpart.class);
		ViewContext context = new ViewContext(viewEditPart);
		Assert.assertSame(viewEditPart, context.getViewEditpart());
	}

	/**
	 * Tests the render method.
	 * 
	 * @throws ContextException
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_render() throws ContextException {
		// END SUPRESS CATCH EXCEPTION
		presenterFactory.clear();
		presenterFactory.addDelegate(new PresenterFactory());
		Assert.assertFalse(context.isRendered());

		try {
			context.render("test", new Object(), null);
		} catch (ContextException e) {
			throw e;
		}

		Assert.assertTrue(context.isRendered());
		try {
			context.render("test", new Object(), null);
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			Assert.assertEquals("Has already been rendered!", e.getMessage());
		}
	}

	/**
	 * Tests the rendering with a presenter of null.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_render_PresenterNull() {
		// END SUPRESS CATCH EXCEPTION
		presenterFactory.clear();
		try {
			context.render(null, new Object(), null);
		} catch (ContextException e) {
			Assert.assertEquals("Presenter must not be null!", e.getMessage());
		}
	}

	/**
	 * Tests the rendering with a layout of null.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_render_layoutNull() {
		// END SUPRESS CATCH EXCEPTION
		presenterFactory.clear();
		try {
			context.render("test", null, null);
			Assert.fail();
		} catch (ContextException e) {
			Assert.assertEquals("RootLayout must not be null!", e.getMessage());
		}
	}

	/**
	 * Tests the rendering with a presentation URI of null.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_render_presentationURINull() {
		// END SUPRESS CATCH EXCEPTION
		presenterFactory.clear();
		presenterFactory.addDelegate(new PresenterFactory());
		try {
			context.render(null, new Object(), null);
		} catch (ContextException e) {
			Assert.fail();
		}
	}

	/**
	 * Tests the getParentContext method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getParentContext() {
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

	/**
	 * Tests the getService method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getService() {
		DelegatingServiceProviderManager manager = DelegatingServiceProviderManager
				.getInstance();
		manager.addDelegate(new ServiceProvider1(), null);
		// getting service with the same selector have to be equal
		Assert.assertNotNull(context.getService("Provider1"));
		Assert.assertEquals(context.getService("Provider1"),
				context.getService("Provider1"));
	}

	/**
	 * Tests the getService method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getOSGiService() {
		Assert.assertNotNull(context.getService(IExecutorService.class
				.getName()));
	}

	@Test
	public void testExec() {
		Assert.fail("To be implented");
	}

	@Test
	public void testAsncExec() {
		Assert.fail("To be implented");
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

		@Override
		public Future execAsync(Runnable runnable) {
			return null;
		}

		@Override
		public void exec(Runnable runnable) {

		}

		@Override
		public Set getUIBindings() {
			return null;
		}

	}

	private static class Person {
		private String name;

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

	}

	private static class PersonExtended extends Person {

	}

	private class ServiceProvider1 implements IServiceProvider {

		@Override
		public boolean isFor(String selector, IContext context) {
			return "Provider1".equals(selector);
		}

		@SuppressWarnings("unchecked")
		@Override
		public <A> A createService(String selector, IContext context) {
			return (A) new Object();
		}

	}

}
