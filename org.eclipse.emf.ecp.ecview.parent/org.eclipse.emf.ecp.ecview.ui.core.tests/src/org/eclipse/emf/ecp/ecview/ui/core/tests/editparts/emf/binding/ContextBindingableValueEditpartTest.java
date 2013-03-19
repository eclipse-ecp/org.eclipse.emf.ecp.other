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
package org.eclipse.emf.ecp.ecview.ui.core.tests.editparts.emf.binding;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindableEndpointEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.binding.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link ViewEditpart}.
 */
@SuppressWarnings("restriction")
public class ContextBindingableValueEditpartTest {

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
	public void test_bind() {
		// END SUPRESS CATCH EXCEPTION
		YBinding yBinding = bindingFactory.createYBinding();
		IBindingEditpart bindingEditpart = editpartManager
				.getEditpart(yBinding);

		assertFalse(bindingEditpart.isBound());
		bindingEditpart.bind();
		assertTrue(bindingEditpart.isBound());

		bindingEditpart.dispose();
	}

	/**
	 * Tests the activation.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_bind_bySet() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet yBindingSet = bindingFactory.createYBindingSet();
		YBinding yBinding = bindingFactory.createYBinding();
		IBindingEditpart bindingEditpart = editpartManager
				.getEditpart(yBinding);
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(yBindingSet);

		assertFalse(bindingEditpart.isBound());
		bindingSetEditpart.addBinding(bindingEditpart);
		assertTrue(bindingEditpart.isBound());
		bindingSetEditpart.removeBinding(bindingEditpart);
		assertTrue(bindingEditpart.isDisposed());
	}

	/**
	 * Tests the activation.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_unbind() {
		// END SUPRESS CATCH EXCEPTION
		YBinding yBinding = bindingFactory.createYBinding();
		IBindingEditpart bindingEditpart = editpartManager
				.getEditpart(yBinding);

		assertFalse(bindingEditpart.isBound());
		bindingEditpart.bind();
		assertTrue(bindingEditpart.isBound());
		bindingEditpart.unbind();
		assertFalse(bindingEditpart.isDisposed());
	}

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		YBinding yBinding = bindingFactory.createYBinding();
		IBindingEditpart bindingEditpart = editpartManager
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
	 * Tests setContent by model.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setValue_byModel() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YBinding binding = bindingFactory.createYBinding();
		YBindingEndpoint targetValue = factory.createYContextBindingEndpoint();
		YBindingEndpoint modelValue = factory.createYContextBindingEndpoint();
		IBindingEditpart bindingEditpart = editpartManager.getEditpart(binding);
		IBindableEndpointEditpart targetValueEditpart = editpartManager
				.getEditpart(targetValue);
		IBindableEndpointEditpart modelValueEditpart = editpartManager
				.getEditpart(modelValue);

		// set the value
		//
		binding.setTargetValue(targetValue);
		assertSame(targetValueEditpart, bindingEditpart.getTargetEndpoint());
		assertFalse(targetValueEditpart.isDisposed());
		assertNull(bindingEditpart.getModelEndpoint());

		binding.setModelValue(modelValue);
		assertSame(modelValueEditpart, bindingEditpart.getModelEndpoint());
		assertFalse(modelValueEditpart.isDisposed());

		binding.setTargetValue(null);
		assertNull(bindingEditpart.getTargetEndpoint());
		assertSame(modelValueEditpart, bindingEditpart.getModelEndpoint());
		assertFalse(targetValueEditpart.isDisposed());

		binding.setModelValue(null);
		assertNull(bindingEditpart.getTargetEndpoint());
		assertNull(bindingEditpart.getModelEndpoint());
		assertFalse(targetValueEditpart.isDisposed());

	}

	/**
	 * Tests setContent by editPart.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_setValue_byEditPart() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YBinding binding = bindingFactory.createYBinding();
		YBindingEndpoint targetValue = factory.createYContextBindingEndpoint();
		YBindingEndpoint modelValue = factory.createYContextBindingEndpoint();
		IBindingEditpart bindingEditpart = editpartManager.getEditpart(binding);
		IBindableEndpointEditpart targetValueEditpart = editpartManager
				.getEditpart(targetValue);
		IBindableEndpointEditpart modelValueEditpart = editpartManager
				.getEditpart(modelValue);

		// set the value
		//
		bindingEditpart.setTargetEndpoint(targetValueEditpart);
		assertSame(targetValue, binding.getTargetValue());
		assertFalse(targetValueEditpart.isDisposed());
		assertNull(binding.getModelValue());

		bindingEditpart.setModelEndpoint(modelValueEditpart);
		assertSame(modelValue, binding.getModelValue());
		assertFalse(modelValueEditpart.isDisposed());

		bindingEditpart.setTargetEndpoint(null);
		assertNull(binding.getTargetValue());
		assertSame(modelValue, binding.getModelValue());
		assertFalse(targetValueEditpart.isDisposed());

		bindingEditpart.setModelEndpoint(null);
		assertNull(binding.getTargetValue());
		assertNull(binding.getModelValue());
		assertFalse(targetValueEditpart.isDisposed());

	}
}
