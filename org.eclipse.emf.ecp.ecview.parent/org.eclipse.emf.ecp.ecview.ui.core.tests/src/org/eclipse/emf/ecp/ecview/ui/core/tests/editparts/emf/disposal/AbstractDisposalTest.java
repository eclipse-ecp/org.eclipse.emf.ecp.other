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
package org.eclipse.emf.ecp.ecview.ui.core.tests.editparts.emf.disposal;

import org.eclipse.emf.ecp.ecview.ui.core.editparts.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.disposal.IDisposable;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the {@link AbstractDisposable}.
 */
public class AbstractDisposalTest {

	/**
	 * Tests dispose.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		AbstractDisposable disposable = new AbstractDisposable() {
			@Override
			protected void internalDispose() {
			}
		};

		Listener listener = new Listener();
		disposable.addDisposeListener(listener);
		disposable.removeDisposeListener(listener);

		Assert.assertFalse(disposable.isDisposed());
		disposable.dispose();
		Assert.assertTrue(disposable.isDisposed());

		try {
			disposable.addDisposeListener(listener);
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		try {
			disposable.removeDisposeListener(listener);
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}
	}

	/**
	 * Tests that the internalDispose method is called.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_callInternalDispose() {
		// END SUPRESS CATCH EXCEPTION
		final boolean[] called = new boolean[] { false };
		AbstractDisposable disposable = new AbstractDisposable() {
			@Override
			protected void internalDispose() {
				called[0] = true;
			}
		};

		Assert.assertFalse(called[0]);
		disposable.dispose();
		Assert.assertTrue(called[0]);
	}

	/**
	 * Tests that the internalDispose method is called.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_callInternalDispose_BeforeSetDisposed() {
		// END SUPRESS CATCH EXCEPTION
		AbstractDisposable disposable = new AbstractDisposable() {
			@Override
			protected void internalDispose() {
				Assert.assertFalse(isDisposed());
			}
		};
		disposable.dispose();
	}

	/**
	 * Tests that the internalDispose method is called.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_callListener() {
		// END SUPRESS CATCH EXCEPTION
		AbstractDisposable disposable = new AbstractDisposable() {
			@Override
			protected void internalDispose() {
			}
		};

		Listener listener1 = new Listener();
		Listener listener2 = new Listener();
		Listener listener3 = new Listener();

		disposable.addDisposeListener(listener1);
		disposable.addDisposeListener(listener2);

		// add and remove listener3
		disposable.addDisposeListener(listener3);
		disposable.removeDisposeListener(listener3);

		disposable.dispose();

		Assert.assertEquals(1, listener1.callCounter);
		Assert.assertEquals(1, listener2.callCounter);
		Assert.assertEquals(0, listener3.callCounter);
	}

	/**
	 * A helper class.
	 */
	private static class Listener implements IDisposable.Listener {
		private int callCounter;

		@Override
		public void notifyDisposed(IDisposable notifier) {
			callCounter++;
		}
	}
}
