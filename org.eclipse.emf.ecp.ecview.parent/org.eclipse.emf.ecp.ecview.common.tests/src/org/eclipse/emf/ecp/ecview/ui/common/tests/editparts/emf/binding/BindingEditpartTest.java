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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindableValueEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IValueBindingEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBeanBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link ViewEditpart}.
 */
@SuppressWarnings("restriction")
public class BindingEditpartTest {

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
	}

	/**
	 * Tests the bind method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind_withoutBindingSet() {
		// END SUPRESS CATCH EXCEPTION
		YBinding yBinding = bindingFactory.createYValueBinding();
		IValueBindingEditpart bindingEditpart = editpartManager
				.getEditpart(yBinding);

		assertFalse(bindingEditpart.isBound());
		try {
			bindingEditpart.bind();
			fail();
		} catch (RuntimeException e) {
			// expected
		}
		assertTrue(bindingEditpart.isBound());

		bindingEditpart.dispose();
	}

	/**
	 * Tests the bind method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind_exception() {
		// END SUPRESS CATCH EXCEPTION
		YValueBinding yBinding = bindingFactory.createYValueBinding();
		IValueBindingEditpart bindingEditpart = editpartManager
				.getEditpart(yBinding);

		Bean bean1 = new Bean("value");
		Bean bean2 = new Bean("value");
		YBeanBindingEndpoint ep1 = bindingFactory.createYBeanBindingEndpoint();
		YBeanBindingEndpoint ep2 = bindingFactory.createYBeanBindingEndpoint();
		ep1.setBean(bean1);
		ep2.setBean(bean2);
		yBinding.setModelEndpoint(ep1);
		yBinding.setTargetEndpoint(ep2);

		try {
			bindingEditpart.bind();
			Assert.fail();
		} catch (RuntimeException e) {
			// expected
		}

		bindingEditpart.dispose();
	}

	/**
	 * Tests the activation.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind_unbind() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet yBindingSet = bindingFactory.createYBindingSet();
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(yBindingSet);
		bindingSetEditpart.setBindingManager(new DefaultBindingManager());

		YValueBinding yBinding = bindingFactory.createYValueBinding();
		IValueBindingEditpart bindingEditpart = editpartManager
				.getEditpart(yBinding);

		Bean bean1 = new Bean("value");
		Bean bean2 = new Bean("value");
		YBeanBindingEndpoint ep1 = bindingFactory.createYBeanBindingEndpoint();
		YBeanBindingEndpoint ep2 = bindingFactory.createYBeanBindingEndpoint();
		ep1.setBean(bean1);
		ep1.setPropertyPath("value");
		ep2.setBean(bean2);
		ep2.setPropertyPath("value");
		yBinding.setModelEndpoint(ep1);
		yBinding.setTargetEndpoint(ep2);

		assertFalse(bindingEditpart.isBound());
		bindingSetEditpart.addBinding(bindingEditpart);
		assertTrue(bindingEditpart.isBound());

		bean1.setValue("test1");
		assertEquals("test1", bean1.getValue());
		assertEquals("test1", bean2.getValue());

		bean2.setValue("test2");
		assertEquals("test2", bean1.getValue());
		assertEquals("test2", bean2.getValue());

		bindingEditpart.unbind();
		assertFalse(bindingEditpart.isBound());
		bean1.setValue("test3");
		assertEquals("test3", bean1.getValue());
		assertEquals("test2", bean2.getValue());
		bean2.setValue("test4");
		assertEquals("test4", bean2.getValue());
		assertEquals("test3", bean1.getValue());

		bindingEditpart.bind();
		assertTrue(bindingEditpart.isBound());
		assertEquals("test3", bean1.getValue());
		assertEquals("test3", bean2.getValue());

		bindingSetEditpart.removeBinding(bindingEditpart);
		assertTrue(bindingEditpart.isDisposed());

		bean1.setValue("test5");
		assertEquals("test5", bean1.getValue());
		assertEquals("test3", bean2.getValue());
	}

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		YBinding yBinding = bindingFactory.createYValueBinding();
		IValueBindingEditpart bindingEditpart = editpartManager
				.getEditpart(yBinding);

		assertFalse(bindingEditpart.isDisposed());
		bindingEditpart.dispose();
		assertTrue(bindingEditpart.isDisposed());

		bindingEditpart.isDisposed();
		bindingEditpart.dispose();

		try {
			bindingEditpart.addDisposeListener(new IDisposable.Listener() {
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
			bindingEditpart.bind();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			bindingEditpart.isBound();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			bindingEditpart.unbind();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			bindingEditpart.getModelEndpoint();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			bindingEditpart.getTargetEndpoint();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			bindingEditpart.setModelEndpoint(null);
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			bindingEditpart.setTargetEndpoint(null);
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			bindingEditpart.getId();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			bindingEditpart.getModel();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			bindingEditpart.removeDisposeListener(new IDisposable.Listener() {
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
	 * Tests setEndpoint by model.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setEndpoint_byModel() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YValueBinding binding = bindingFactory.createYValueBinding();
		YValueBindingEndpoint targetEndpoint = factory
				.createYContextBindingEndpoint();
		YValueBindingEndpoint modelEndpoint = factory
				.createYContextBindingEndpoint();
		IValueBindingEditpart bindingEditpart = editpartManager.getEditpart(binding);
		IBindableValueEndpointEditpart targetEndpointEditpart = editpartManager
				.getEditpart(targetEndpoint);
		IBindableValueEndpointEditpart modelEndpointEditpart = editpartManager
				.getEditpart(modelEndpoint);

		// set the value
		//
		binding.setTargetEndpoint(targetEndpoint);
		assertSame(targetEndpointEditpart, bindingEditpart.getTargetEndpoint());
		assertFalse(targetEndpointEditpart.isDisposed());
		assertNull(bindingEditpart.getModelEndpoint());

		binding.setModelEndpoint(modelEndpoint);
		assertSame(modelEndpointEditpart, bindingEditpart.getModelEndpoint());
		assertFalse(modelEndpointEditpart.isDisposed());

		binding.setTargetEndpoint(null);
		assertNull(bindingEditpart.getTargetEndpoint());
		assertSame(modelEndpointEditpart, bindingEditpart.getModelEndpoint());
		assertFalse(targetEndpointEditpart.isDisposed());

		binding.setModelEndpoint(null);
		assertNull(bindingEditpart.getTargetEndpoint());
		assertNull(bindingEditpart.getModelEndpoint());
		assertFalse(targetEndpointEditpart.isDisposed());

	}

	/**
	 * Tests setEndpoint by editPart.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setEndpoint_byEditPart() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YBinding binding = bindingFactory.createYValueBinding();
		YBindingEndpoint targetEndpoint = factory
				.createYContextBindingEndpoint();
		YBindingEndpoint modelEndpoint = factory
				.createYContextBindingEndpoint();
		IValueBindingEditpart bindingEditpart = editpartManager.getEditpart(binding);
		IBindableValueEndpointEditpart targetEndpointEditpart = editpartManager
				.getEditpart(targetEndpoint);
		IBindableValueEndpointEditpart modelEndpointEditpart = editpartManager
				.getEditpart(modelEndpoint);

		// set the value
		//
		bindingEditpart.setTargetEndpoint(targetEndpointEditpart);
		assertSame(targetEndpoint, binding.getTargetEndpoint());
		assertFalse(targetEndpointEditpart.isDisposed());
		assertNull(binding.getModelEndpoint());

		bindingEditpart.setModelEndpoint(modelEndpointEditpart);
		assertSame(modelEndpoint, binding.getModelEndpoint());
		assertFalse(modelEndpointEditpart.isDisposed());

		bindingEditpart.setTargetEndpoint(null);
		assertNull(binding.getTargetEndpoint());
		assertSame(modelEndpoint, binding.getModelEndpoint());
		assertFalse(targetEndpointEditpart.isDisposed());

		bindingEditpart.setModelEndpoint(null);
		assertNull(binding.getTargetEndpoint());
		assertNull(binding.getModelEndpoint());
		assertFalse(targetEndpointEditpart.isDisposed());

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
