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

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.ecp.ecview.common.context.ViewContext;
import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IContextBindingEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YContextBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.uri.BeanScope;
import org.eclipse.emf.ecp.ecview.common.uri.URIHelper;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link ViewEditpart}.
 */
@SuppressWarnings("restriction")
public class ContextBindingEndpointEditpartTest {

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
		YContextBindingEndpoint yEndpoint = factory
				.createYContextBindingEndpoint();
		IContextBindingEndpointEditpart editpart = editpartManager
				.getEditpart(yEndpoint);

		try {
			editpart.getObservable();
			fail();
		} catch (RuntimeException e) {
			// expected
			assertEquals("View must not be null!", e.getMessage());
		}
	}

	/**
	 * Tests the getObservable method without a valid view.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getObservable() {
		// END SUPRESS CATCH EXCEPTION
		IViewEditpart viewEditpart = (IViewEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);
		ViewContext context = new ViewContext(viewEditpart);
		context.setBean("bean1", new Bean("Test"));
		YBindingSet bs = bindingFactory.createYBindingSet();
		YView view = (YView) viewEditpart.getModel();
		view.setBindingSet(bs);
		YBinding binding = bindingFactory.createYBinding();

		YContextBindingEndpoint yEndpoint = factory
				.createYContextBindingEndpoint();
		yEndpoint.setUrlString("view://bean/bean1#value");
		binding.setModelValue(yEndpoint);
		bs.addBinding(binding);

		IContextBindingEndpointEditpart editpart = editpartManager
				.getEditpart(yEndpoint);
		IObservableValue value = editpart.getObservable();

		final int[] counter = new int[1];
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				counter[0] = counter[0] + 1;
			}
		});
		assertEquals(0, counter[0]);

		context.setBean("bean1", new Bean("Test2"));
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
		YView view = (YView) viewEditpart.getModel();
		view.setBindingSet(bs);

		// activate the bindingSet editpart
		//
		IBindingSetEditpart bsEditpart = editpartManager.getEditpart(bs);
		bsEditpart.setBindingManager(new DefaultBindingManager());
		bsEditpart.activate();

		// context endpoint
		//
		YContextBindingEndpoint yTargetEndpoint = factory
				.createYContextBindingEndpoint();
		yTargetEndpoint.setUrlString("view://bean/slo1#value");

		// bean endpoint
		//
		Bean bean = new Bean("Test");
		YBeanBindingEndpoint yModelEndpoint = BindingFactory.eINSTANCE
				.createYBeanBindingEndpoint();
		yModelEndpoint.setBean(bean);
		yModelEndpoint.setPropertyPath("value");

		bs.addBinding(yTargetEndpoint, yModelEndpoint);

		// write to bean
		BeanScope scope = URIHelper.toScope("view://bean/slo1#value")
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
		YContextBindingEndpoint yEndpoint = factory
				.createYContextBindingEndpoint();
		IContextBindingEndpointEditpart editpart = editpartManager
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

	}
}
