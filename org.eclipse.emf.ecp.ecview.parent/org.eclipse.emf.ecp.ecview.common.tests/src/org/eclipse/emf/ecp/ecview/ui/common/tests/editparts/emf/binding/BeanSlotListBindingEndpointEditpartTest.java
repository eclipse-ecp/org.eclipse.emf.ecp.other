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
package org.eclipse.emf.ecp.ecview.ui.common.tests.editparts.emf.binding;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.ecp.ecview.common.context.ViewContext;
import org.eclipse.emf.ecp.ecview.common.context.ViewSetContext;
import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IBeanSlotListBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBeanValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlot;
import org.eclipse.emf.ecp.ecview.common.model.core.YBeanSlotListBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.eclipse.emf.ecp.ecview.common.uri.BeanScope;
import org.eclipse.emf.ecp.ecview.common.uri.URIHelper;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link ViewEditpart}.
 */
@SuppressWarnings("restriction")
public class BeanSlotListBindingEndpointEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
	private BindingFactory bindingFactory = BindingFactory.eINSTANCE;
	private CoreModelFactory factory = CoreModelFactory.eINSTANCE;

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

		// initialize default realm
		new DefaultBindingManager.DefaultRealm();
	}

	/**
	 * Tests the getObservable method without a valid view.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getObservable_NPE() {
		// END SUPRESS CATCH EXCEPTION
		YBeanSlotListBindingEndpoint yEndpoint = factory
				.createYBeanSlotListBindingEndpoint();
		yEndpoint.setAttributePath("Huhu");
		yEndpoint.setBeanSlot(factory.createYBeanSlot());
		IBeanSlotListBindingEndpointEditpart editpart = editpartManager
				.getEditpart(yEndpoint);

		try {
			editpart.getObservable();
			fail();
		} catch (RuntimeException e) {
			// expected
			assertEquals("null is not a valid super type!", e.getMessage());
		}
	}

	/**
	 * Tests the getObservable method without a valid view.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getObservable_For_ViewContext() {
		// END SUPRESS CATCH EXCEPTION
		IViewEditpart viewEditpart = (IViewEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);
		ViewContext context = new ViewContext(viewEditpart);
		YView yView = (YView) viewEditpart.getModel();

		// add a bean slot
		YBeanSlot yBeanSlot = factory.createYBeanSlot();
		yBeanSlot.setName("myFoo");
		yBeanSlot.setValueType(List.class);
		yView.getBeanSlots().add(yBeanSlot);

		// create the model endpoint and register
		YBeanSlotListBindingEndpoint yEndpoint = factory
				.createYBeanSlotListBindingEndpoint();
		yEndpoint.setBeanSlot(yBeanSlot);
		yEndpoint.setAttributePath("value");
		yEndpoint.setCollectionType(Bean.class);

		IBeanSlotListBindingEndpointEditpart editpart = editpartManager
				.getEditpart(yEndpoint);
		IObservableList value = editpart.getObservable();

		final int[] counter = new int[1];
		value.addListChangeListener(new IListChangeListener() {
			@Override
			public void handleListChange(ListChangeEvent event) {
				counter[0] = counter[0] + 1;
			}
		});
		assertEquals(0, counter[0]);

		List<Bean> beans = new ArrayList<Bean>();
		beans.add(new Bean("Test1"));
		beans.add(new Bean("Test2"));

		context.setBean("myFoo", beans);
		assertEquals(1, counter[0]);
	}

	/**
	 * Tests the getObservable method without a valid view.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getNestedObservable_For_ViewContext() {
		// END SUPRESS CATCH EXCEPTION
		IViewEditpart viewEditpart = (IViewEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);
		ViewContext context = new ViewContext(viewEditpart);
		YView yView = (YView) viewEditpart.getModel();

		// add a bean slot
		YBeanSlot yBeanSlot = factory.createYBeanSlot();
		yBeanSlot.setName("myFoo");
		yBeanSlot.setValueType(Bean.class);
		yView.getBeanSlots().add(yBeanSlot);

		// create the model endpoint and register
		YBeanSlotListBindingEndpoint yEndpoint = factory
				.createYBeanSlotListBindingEndpoint();
		yEndpoint.setBeanSlot(yBeanSlot);
		yEndpoint.setAttributePath("value.values");
		yEndpoint.setCollectionType(String.class);

		IBeanSlotListBindingEndpointEditpart editpart = editpartManager
				.getEditpart(yEndpoint);
		IObservableList value = editpart.getObservable();

		final int[] counter = new int[1];
		value.addListChangeListener(new IListChangeListener() {
			@Override
			public void handleListChange(ListChangeEvent event) {
				counter[0] = counter[0] + 1;
			}
		});
		assertEquals(0, counter[0]);

		Bean bean = new Bean("Test1");
		bean.values.add("Value1");
		bean.values.add("Value2");

		context.setBean("myFoo", bean);
		assertEquals(1, counter[0]);
	}

	/**
	 * Tests the getObservable method without a valid view.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getObservable_For_ViewSetContext() {
		// END SUPRESS CATCH EXCEPTION
		IViewSetEditpart viewSetEditpart = (IViewSetEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI,
						IViewSetEditpart.class);
		ViewSetContext context = new ViewSetContext(viewSetEditpart);
		context.setBean("bean1", new Bean("Test"));
		YViewSet yViewSet = (YViewSet) viewSetEditpart.getModel();

		// add a bean slot
		YBeanSlot yBeanSlot = factory.createYBeanSlot();
		yBeanSlot.setName("myFoo");
		yBeanSlot.setValueType(Bean.class);
		yViewSet.getBeanSlots().add(yBeanSlot);

		// create the model endpoint and register
		YBeanSlotListBindingEndpoint yEndpoint = factory
				.createYBeanSlotListBindingEndpoint();
		yEndpoint.setBeanSlot(yBeanSlot);
		yEndpoint.setAttributePath("value");

		IBeanSlotListBindingEndpointEditpart editpart = editpartManager
				.getEditpart(yEndpoint);
		IObservableList value = editpart.getObservable();

		final int[] counter = new int[1];
		value.addListChangeListener(new IListChangeListener() {
			@Override
			public void handleListChange(ListChangeEvent event) {
				counter[0] = counter[0] + 1;
			}
		});
		assertEquals(0, counter[0]);

		context.setBean("myFoo", new Bean("Test2"));
		assertEquals(1, counter[0]);
	}

	/**
	 * Tests the getObservable method without a valid view.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind() {
		// END SUPRESS CATCH EXCEPTION

		IViewEditpart viewEditpart = (IViewEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);

		ViewContext context = new ViewContext(viewEditpart);
		context.createBeanSlot("slo1", String.class);
		YBindingSet bs = bindingFactory.createYBindingSet();
		YView yView = (YView) viewEditpart.getModel();
		yView.setBindingSet(bs);

		// add a bean slot
		YBeanSlot yBeanSlot = factory.createYBeanSlot();
		yBeanSlot.setName("myFoo");
		yBeanSlot.setValueType(Bean.class);
		yView.getBeanSlots().add(yBeanSlot);

		// activate the bindingSet editpart
		//
		IBindingSetEditpart bsEditpart = editpartManager.getEditpart(bs);
		bsEditpart.setBindingManager(new DefaultBindingManager());
		bsEditpart.activate();

		// context endpoint
		//
		YBeanSlotListBindingEndpoint yTargetEndpoint = factory
				.createYBeanSlotListBindingEndpoint();
		yTargetEndpoint.setBeanSlot(yBeanSlot);
		yTargetEndpoint.setAttributePath("value");

		// bean endpoint
		//
		Bean bean = new Bean("Test");
		YBeanValueBindingEndpoint yModelEndpoint = BindingFactory.eINSTANCE
				.createYBeanValueBindingEndpoint();
		yModelEndpoint.setBean(bean);
		yModelEndpoint.setPropertyPath("values");

		bs.addBinding(yTargetEndpoint, yModelEndpoint);

		// write to bean
		BeanScope scope = URIHelper.toScope("view://bean/myFoo#value")
				.getBeanScope();
		assertEquals(bean.getValue(), (String) scope.access(context));

		bean.setValue("Othervalue");
		assertEquals(bean.getValue(), (String) scope.access(context));

		// write to context
		scope.accessBeanSlot(context).setValue("FromContext");
		assertEquals(bean.getValue(), "FromContext");

	}

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION

		YBeanSlotListBindingEndpoint yEndpoint = factory
				.createYBeanSlotListBindingEndpoint();
		IBeanSlotListBindingEndpointEditpart editpart = editpartManager
				.getEditpart(yEndpoint);

		assertFalse(editpart.isDisposed());
		editpart.dispose();
		assertTrue(editpart.isDisposed());

		// call twice
		editpart.isDisposed();
		editpart.dispose();

		try {
			editpart.addDisposeListener(new IDisposable.Listener() {
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
			editpart.getObservable();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			editpart.getModel();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			editpart.getId();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			editpart.getModel();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			editpart.removeDisposeListener(new IDisposable.Listener() {
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

	public class Bean extends AbstractBean {

		private String value;
		private List<String> values = new ArrayList<String>();

		public Bean(String value) {
			super();
			this.value = value;
		}

		/**
		 * @return the value
		 */
		public String getValue() {
			return value;
		}

		/**
		 * @param value
		 *            the value to set
		 */
		public void setValue(String value) {
			firePropertyChanged("value", this.value, this.value = value);
		}

		public List<String> getValues() {
			return values;
		}

		public void setValues(List<String> values) {
			this.values = values;
		}

	}
}
