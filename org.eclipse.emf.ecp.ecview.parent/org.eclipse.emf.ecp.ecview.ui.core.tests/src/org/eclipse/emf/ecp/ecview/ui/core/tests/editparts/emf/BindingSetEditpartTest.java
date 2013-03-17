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
package org.eclipse.emf.ecp.ecview.ui.core.tests.editparts.emf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IBindingEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IBindingSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link ViewEditpart}.
 */
@SuppressWarnings("restriction")
public class BindingSetEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
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
	}

	/**
	 * Tests the activation.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_activate() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);

		assertFalse(bindingSetEditpart.isActive());
		bindingSetEditpart.activate();
		assertTrue(bindingSetEditpart.isActive());

		bindingSetEditpart.dispose();
	}

	/**
	 * Tests setContent by editPart.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getView() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YView view1 = CoreModelFactory.eINSTANCE.createYView();
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		view1.setBindingSet(bindingSet);
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		assertEquals(view1Editpart, bindingSetEditpart.getView());
	}

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);

		assertFalse(bindingSetEditpart.isDisposed());
		bindingSetEditpart.dispose();
		assertTrue(bindingSetEditpart.isDisposed());

		bindingSetEditpart.isDisposed();
		bindingSetEditpart.dispose();

		try {
			bindingSetEditpart.addDisposeListener(new IDisposable.Listener() {
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
			bindingSetEditpart.activate();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			bindingSetEditpart.isActive();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			bindingSetEditpart.getId();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			bindingSetEditpart.getModel();
			fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			bindingSetEditpart
					.removeDisposeListener(new IDisposable.Listener() {
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
	public void test_addBinding_byModel() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		YBinding binding = bindingFactory.createYBinding();
		bindingSet.addBinding(binding);
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		IBindingEditpart bindingEditpart = editpartManager.getEditpart(binding);
		assertFalse(bindingSetEditpart.isActive());
		assertEquals(1, bindingSetEditpart.getBindings().size());
		assertSame(bindingEditpart, bindingSetEditpart.getBindings().get(0));
		assertTrue(bindingEditpart.isBound());

		// remove the binding
		//
		bindingSet.removeBinding(binding);
		assertEquals(0, bindingSetEditpart.getBindings().size());
		assertFalse(bindingEditpart.isBound());
		assertTrue(bindingEditpart.isDisposed());
		// ensure that editpart was detached
		assertNull(editpartManager.findEditpart(binding));
	}

	/**
	 * Tests setContent by editPart.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_addBinding_byEditPart() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		YBindingSet bindingSet = bindingFactory.createYBindingSet();
		YBinding binding = bindingFactory.createYBinding();
		IBindingSetEditpart bindingSetEditpart = editpartManager
				.getEditpart(bindingSet);
		IBindingEditpart bindingEditpart = editpartManager.getEditpart(binding);
		assertFalse(bindingSetEditpart.isActive());

		bindingSetEditpart.addBinding(bindingEditpart);
		assertFalse(bindingSetEditpart.isActive());
		assertEquals(1, bindingSetEditpart.getBindings().size());
		assertSame(bindingEditpart, bindingSetEditpart.getBindings().get(0));
		assertTrue(bindingEditpart.isBound());

		// unset the layout
		//
		bindingSet.removeBinding(binding);
		assertEquals(0, bindingSetEditpart.getBindings().size());
		assertFalse(bindingEditpart.isBound());
		assertTrue(bindingEditpart.isDisposed());
		// ensure that editpart was detached
		assertNull(editpartManager.findEditpart(binding));
	}
}
