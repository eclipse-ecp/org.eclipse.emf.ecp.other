/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.common.tests.serviceprovider;

import org.eclipse.emf.ecp.ecview.common.context.IContext;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.common.context.ViewContext;
import org.eclipse.emf.ecp.ecview.common.services.DelegatingServiceProviderManager;
import org.eclipse.emf.ecp.ecview.common.services.IServiceProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link DelegatingServiceProviderManager}.
 */
public class ServiceProviderManagerTest {

	DelegatingServiceProviderManager manager = DelegatingServiceProviderManager
			.getInstance();
	String selector;
	IViewContext context;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		manager.clear();
		context = new InternalContext();
	}

	/**
	 * Tests the add and remove delegating methods.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_serviceProvider() {
		// END SUPRESS CATCH EXCEPTION
		ServiceProvider1 serviceProvider1 = new ServiceProvider1();
		manager.addDelegate(serviceProvider1);
		Assert.assertTrue(manager.isFor("Provider1", context));
		Assert.assertFalse(manager.isFor("Provider2", context));
		Assert.assertEquals("Provider1",
				manager.createService("Provider1", context));
		Assert.assertNull(manager.createService("Provider2", context));
		ServiceProvider2 serviceProvider2 = new ServiceProvider2();
		manager.addDelegate(serviceProvider2);
		Assert.assertTrue(manager.isFor("Provider2", context));
		Assert.assertTrue(manager.isFor("Provider1", context));
		Assert.assertEquals("Provider2",
				manager.createService("Provider2", context));
		Assert.assertEquals("Provider1",
				manager.createService("Provider1", context));

		manager.removeDelegate(serviceProvider1);
		Assert.assertFalse(manager.isFor("Provider1", context));
		Assert.assertTrue(manager.isFor("Provider2", context));
		Assert.assertNull(manager.createService("Provider1", context));
		Assert.assertEquals("Provider2",
				manager.createService("Provider2", context));
		manager.removeDelegate(serviceProvider2);
		Assert.assertFalse(manager.isFor("Provider2", context));
		Assert.assertFalse(manager.isFor("Provider1", context));
		Assert.assertNull(manager.createService("Provider2", context));
		Assert.assertNull(manager.createService("Provider1", context));
	}

	private static class InternalContext extends ViewContext {
		public InternalContext() {
		}
	}

	private class ServiceProvider1 implements IServiceProvider {

		@Override
		public boolean isFor(String selector, IContext context) {
			return "Provider1".equals(selector);
		}

		@SuppressWarnings("unchecked")
		@Override
		public <A> A createService(String selector, IContext context) {
			return (A) "Provider1";
		}

	}

	private class ServiceProvider2 implements IServiceProvider {

		@Override
		public boolean isFor(String selector, IContext context) {
			return "Provider2".equals(selector);
		}

		@SuppressWarnings("unchecked")
		@Override
		public <A> A createService(String selector, IContext context) {
			return (A) "Provider2";
		}

	}

}