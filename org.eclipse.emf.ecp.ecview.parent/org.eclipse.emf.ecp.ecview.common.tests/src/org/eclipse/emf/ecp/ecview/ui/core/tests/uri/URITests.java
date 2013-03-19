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
package org.eclipse.emf.ecp.ecview.ui.core.tests.uri;

import java.net.URI;

import junit.framework.Assert;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.context.ViewContext;
import org.eclipse.emf.ecp.ecview.common.context.ViewSetContext;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.EditpartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.common.ResourceManager;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.uri.URIHelper;
import org.eclipse.emf.ecp.ecview.common.uri.ViewScope;
import org.eclipse.emf.ecp.ecview.common.uri.ViewsetScope;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link ResourceManager}.
 */
@SuppressWarnings("restriction")
public class URITests {

	private EditpartManager editpartManager = new EditpartManager();
	private ResourceSetImpl resourceSet;
	private ViewContext context;
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
		manager.addDelegate(new EditpartManager());

		IViewEditpart viewEditPart = editpartManager
				.createEditpart("http://eclipse.org/emf/emfclient/uimodel",
						IViewEditpart.class);
		IViewSetEditpart viewSetEditPart = editpartManager.createEditpart(
				"http://eclipse.org/emf/emfclient/uimodel",
				IViewSetEditpart.class);
		viewSetEditPart.addView(viewEditPart);

		context = new ViewContext(viewEditPart);
		viewSetContext = new ViewSetContext(viewSetEditPart);
	}

	/**
	 * Tests parsing.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_bean_parse() {
		URI uri = URI.create("view://bean/org.my.bean#aaa.bbb.ccc");
		Assert.assertEquals("view", uri.getScheme());
		Assert.assertEquals("bean", uri.getAuthority());
		Assert.assertEquals("/org.my.bean", uri.getPath());
		Assert.assertEquals("aaa.bbb.ccc", uri.getFragment());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests parsing.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_service_parse() {
		URI uri = URI.create("view://service/org.my.service");
		Assert.assertEquals("view", uri.getScheme());
		Assert.assertEquals("service", uri.getAuthority());
		Assert.assertEquals("/org.my.service", uri.getPath());
		Assert.assertNull(uri.getFragment());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests building and parsing.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_bean_build_and_parse() {

		ViewScope scope1_1 = URIHelper.toScope("view://bean/org.my.bean");
		ViewScope scope1_2 = URIHelper.view().bean("org.my.bean").root();
		Assert.assertEquals(scope1_1.toFullURI(), scope1_2.toFullURI());

		ViewScope scope2_1 = URIHelper
				.toScope("view://bean/org.my.bean#person.name");
		ViewScope scope2_2 = URIHelper.view().bean("org.my.bean")
				.fragment("person.name").root();
		Assert.assertEquals(scope2_1.toFullURI(), scope2_2.toFullURI());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests building and parsing.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_service_build_and_parse() {
		ViewScope scope1_1 = URIHelper.toScope("view://service/org.my.service");
		ViewScope scope1_2 = URIHelper.view().service("org.my.service").root();
		Assert.assertEquals(scope1_1.toFullURI(), scope1_2.toFullURI());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the access of the segments.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_bean_segments() {
		ViewScope viewScope = URIHelper
				.toScope("view://bean/org.my.bean#value.name");

		// test segments
		//
		Assert.assertEquals("view://", viewScope.getURISegment());
		Assert.assertEquals("bean/org.my.bean", viewScope.getBeanScope()
				.getURISegment());
		Assert.assertEquals("#value.name", viewScope.getBeanScope()
				.getFragmentScope().getURISegment());

		Assert.assertNull(viewScope.getServiceScope());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the service segments.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_service_segments() {
		ViewScope viewScope = URIHelper
				.toScope("view://service/org.my.service");

		// test segments
		//
		Assert.assertEquals("view://", viewScope.getURISegment());
		Assert.assertEquals("service/org.my.service", viewScope
				.getServiceScope().getURISegment());

		Assert.assertNull(viewScope.getBeanScope());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the toString and toURIString methods.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_bean_toString_toURIString() {
		ViewScope viewScope = URIHelper
				.toScope("view://bean/org.my.bean#value.name");

		// test segments
		//
		Assert.assertEquals("view://bean/org.my.bean#value.name",
				viewScope.toString());

		// bean
		Assert.assertEquals("view://bean/org.my.bean", viewScope.getBeanScope()
				.toString());
		Assert.assertEquals("view://bean/org.my.bean", viewScope.getBeanScope()
				.toURIString());

		// fragment
		Assert.assertEquals("view://bean/org.my.bean#value.name", viewScope
				.getBeanScope().getFragmentScope().toString());
		Assert.assertEquals("view://bean/org.my.bean#value.name", viewScope
				.getBeanScope().getFragmentScope().toURIString());

	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the service segments.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_service_toString_toURIString() {
		ViewScope viewScope = URIHelper
				.toScope("view://service/org.my.service");

		// test segments
		//
		Assert.assertEquals("view://service/org.my.service",
				viewScope.toString());

		Assert.assertEquals("view://service/org.my.service", viewScope
				.getServiceScope().toString());
		Assert.assertEquals("view://service/org.my.service", viewScope
				.getServiceScope().toURIString());
	}

	/**
	 * Tests the access of the root.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_bean_root() {
		ViewScope viewScope = URIHelper
				.toScope("view://bean/org.my.bean#value.name");

		// tests the generics in root()
		@SuppressWarnings("unused")
		ViewScope scope = viewScope.getBeanScope().root();

		Assert.assertSame(viewScope, viewScope.root());
		Assert.assertSame(viewScope, viewScope.getBeanScope().root());
		Assert.assertSame(viewScope, viewScope.getBeanScope()
				.getFragmentScope().root());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the view scope.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_service_getViewScope() {
		ViewScope viewScope = URIHelper
				.toScope("view://service/org.my.service");

		Assert.assertSame(viewScope, viewScope.root());
		Assert.assertSame(viewScope, viewScope.getServiceScope().root());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the toURI method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_bean_toURI() {
		ViewScope viewScope = URIHelper
				.toScope("view://bean/org.my.bean#value.name");

		Assert.assertEquals("view://bean/org.my.bean#value.name", viewScope
				.toFullURI().toString());
		Assert.assertEquals("view://bean/org.my.bean", viewScope.getBeanScope()
				.toURI().toString());
		Assert.assertEquals("view://bean/org.my.bean#value.name", viewScope
				.getBeanScope().getFragmentScope().toURI().toString());

		// test uri.toString == toURIString
		Assert.assertEquals(viewScope.getBeanScope().toURIString(), viewScope
				.getBeanScope().toURI().toString());
		Assert.assertEquals(viewScope.getBeanScope().getFragmentScope()
				.toURIString(), viewScope.getBeanScope().getFragmentScope()
				.toURI().toString());
	}

	/**
	 * Tests the toURI method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_bean_toURI_WithoutFragment() {
		ViewScope viewScope = URIHelper.toScope("view://bean/org.my.bean");

		Assert.assertEquals("view://bean/org.my.bean", viewScope.toFullURI()
				.toString());
		Assert.assertEquals("view://bean/org.my.bean", viewScope.getBeanScope()
				.toURI().toString());
		Assert.assertNull(viewScope.getBeanScope().getFragmentScope());

		// test uri.toString == toURIString
		Assert.assertEquals(viewScope.getBeanScope().toURIString(), viewScope
				.getBeanScope().toURI().toString());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the toURI method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_service_toURI() {
		ViewScope viewScope = URIHelper
				.toScope("view://service/org.my.service");

		Assert.assertEquals("view://service/org.my.service", viewScope
				.toFullURI().toString());
		Assert.assertEquals("view://service/org.my.service", viewScope
				.getServiceScope().toURI().toString());

		// test uri.toString == toURIString
		Assert.assertEquals(viewScope.getServiceScope().toURIString(),
				viewScope.getServiceScope().toURI().toString());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the access of beans.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_accessBean() {
		String name = "Name";
		Person person = new Person(name);
		context.setBean("org.my.bean", person);

		Assert.assertSame(context.getBeanSlot("org.my.bean"), URIHelper
				.toScope("view://bean/org.my.bean").access(context));
		Assert.assertSame(
				person,
				URIHelper.toScope("view://bean/org.my.bean#value").access(
						context));
		Assert.assertEquals(
				"Name",
				URIHelper.toScope("view://bean/org.my.bean#value.name").access(
						context));
	}

	/**
	 * Tests the access of beans by the bean scope.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_beanScope() {
		String name = "Name";
		Person person = new Person(name);
		context.setBean("org.my.bean", person);
		ISlot slot = context.getBeanSlot("org.my.bean");

		Assert.assertSame(slot, URIHelper.toScope("view://bean/org.my.bean")
				.getBeanScope().access(context));
		Assert.assertSame(person,
				URIHelper.toScope("view://bean/org.my.bean#value")
						.getBeanScope().access(context));
		Assert.assertEquals("Name",
				URIHelper.toScope("view://bean/org.my.bean#value.name")
						.getBeanScope().access(context));
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the access of beans by the bean scope.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_beanScope_accessBean() {
		String name = "Name";
		Person person = new Person(name);
		context.setBean("org.my.bean", person);

		Assert.assertSame(person, URIHelper.toScope("view://bean/org.my.bean")
				.getBeanScope().accessBean(context));
		Assert.assertSame(person,
				URIHelper.toScope("view://bean/org.my.bean#value")
						.getBeanScope().accessBean(context));
		Assert.assertEquals(person,
				URIHelper.toScope("view://bean/org.my.bean#value.name")
						.getBeanScope().accessBean(context));
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the access of beans by the bean scope.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_beanScope_accessBeanSlot() {
		String name = "Name";
		Person person = new Person(name);
		context.setBean("org.my.bean", person);
		ISlot slot = context.getBeanSlot("org.my.bean");

		Assert.assertSame(slot, URIHelper.toScope("view://bean/org.my.bean")
				.getBeanScope().accessBeanSlot(context));
		Assert.assertSame(slot,
				URIHelper.toScope("view://bean/org.my.bean#value")
						.getBeanScope().accessBeanSlot(context));
		Assert.assertEquals(slot,
				URIHelper.toScope("view://bean/org.my.bean#value.name")
						.getBeanScope().accessBeanSlot(context));
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the access of services.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_view_accessService() {
		Object service = new Object();

		context.registerService("org.my.service", service);

		Assert.assertSame(
				service,
				URIHelper.toScope("view://service/org.my.service").access(
						context));
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests parsing.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_service_parse() {
		URI uri = URI.create("viewset://service/org.my.service");
		Assert.assertEquals("viewset", uri.getScheme());
		Assert.assertEquals("service", uri.getAuthority());
		Assert.assertEquals("/org.my.service", uri.getPath());
		Assert.assertNull(uri.getFragment());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests building and parsing.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_bean_build_and_parse() {

		ViewsetScope scope1_1 = URIHelper.toScope("viewset://bean/org.my.bean");
		ViewsetScope scope1_2 = URIHelper.viewset().bean("org.my.bean").root();
		Assert.assertEquals(scope1_1.toFullURI(), scope1_2.toFullURI());

		ViewsetScope scope2_1 = URIHelper
				.toScope("viewset://bean/org.my.bean#person.name");
		ViewsetScope scope2_2 = URIHelper.viewset().bean("org.my.bean")
				.fragment("person.name").root();
		Assert.assertEquals(scope2_1.toFullURI(), scope2_2.toFullURI());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests building and parsing.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_service_build_and_parse() {
		ViewsetScope scope1_1 = URIHelper
				.toScope("viewset://service/org.my.service");
		ViewsetScope scope1_2 = URIHelper.viewset().service("org.my.service")
				.root();
		Assert.assertEquals(scope1_1.toFullURI(), scope1_2.toFullURI());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests parsing.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_bean_parse() {
		URI uri = URI.create("viewset://bean/org.my.bean#aaa.bbb.ccc");
		Assert.assertEquals("viewset", uri.getScheme());
		Assert.assertEquals("bean", uri.getAuthority());
		Assert.assertEquals("/org.my.bean", uri.getPath());
		Assert.assertEquals("aaa.bbb.ccc", uri.getFragment());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the access of the segments.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_bean_segments() {
		ViewsetScope viewsetScope = URIHelper
				.toScope("viewset://bean/org.my.bean#value.name");

		// test segments
		//
		Assert.assertEquals("viewset://", viewsetScope.getURISegment());
		Assert.assertEquals("bean/org.my.bean", viewsetScope.getBeanScope()
				.getURISegment());
		Assert.assertEquals("#value.name", viewsetScope.getBeanScope()
				.getFragmentScope().getURISegment());

		Assert.assertNull(viewsetScope.getServiceScope());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the service segments.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_service_segments() {
		ViewsetScope viewsetScope = URIHelper
				.toScope("viewset://service/org.my.service");

		// test segments
		//
		Assert.assertEquals("viewset://", viewsetScope.getURISegment());
		Assert.assertEquals("service/org.my.service", viewsetScope
				.getServiceScope().getURISegment());

		Assert.assertNull(viewsetScope.getBeanScope());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the toString and toURIString methods.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_bean_toString_toURIString() {
		ViewsetScope viewsetScope = URIHelper
				.toScope("viewset://bean/org.my.bean#value.name");

		// test segments
		//
		Assert.assertEquals("viewset://bean/org.my.bean#value.name",
				viewsetScope.toString());

		// bean
		Assert.assertEquals("viewset://bean/org.my.bean", viewsetScope
				.getBeanScope().toString());
		Assert.assertEquals("viewset://bean/org.my.bean", viewsetScope
				.getBeanScope().toURIString());

		// fragment
		Assert.assertEquals("viewset://bean/org.my.bean#value.name",
				viewsetScope.getBeanScope().getFragmentScope().toString());
		Assert.assertEquals("viewset://bean/org.my.bean#value.name",
				viewsetScope.getBeanScope().getFragmentScope().toURIString());

	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the service segments.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_service_toString_toURIString() {
		ViewsetScope viewsetScope = URIHelper
				.toScope("viewset://service/org.my.service");

		// test segments
		//
		Assert.assertEquals("viewset://service/org.my.service",
				viewsetScope.toString());

		Assert.assertEquals("viewset://service/org.my.service", viewsetScope
				.getServiceScope().toString());
		Assert.assertEquals("viewset://service/org.my.service", viewsetScope
				.getServiceScope().toURIString());
	}

	/**
	 * Tests the access of the root.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_bean_root() {
		ViewsetScope viewsetScope = URIHelper
				.toScope("viewset://bean/org.my.bean#value.name");

		// tests the generics in root()
		@SuppressWarnings("unused")
		ViewsetScope scope = viewsetScope.getBeanScope().root();

		Assert.assertSame(viewsetScope, viewsetScope.root());
		Assert.assertSame(viewsetScope, viewsetScope.getBeanScope().root());
		Assert.assertSame(viewsetScope, viewsetScope.getBeanScope()
				.getFragmentScope().root());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the viewset scope.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_service_getViewScope() {
		ViewsetScope viewsetScope = URIHelper
				.toScope("viewset://service/org.my.service");

		Assert.assertSame(viewsetScope, viewsetScope.root());
		Assert.assertSame(viewsetScope, viewsetScope.getServiceScope().root());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the toURI method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_bean_toURI() {
		ViewsetScope viewsetScope = URIHelper
				.toScope("viewset://bean/org.my.bean#value.name");

		Assert.assertEquals("viewset://bean/org.my.bean#value.name",
				viewsetScope.toFullURI().toString());
		Assert.assertEquals("viewset://bean/org.my.bean", viewsetScope
				.getBeanScope().toURI().toString());
		Assert.assertEquals("viewset://bean/org.my.bean#value.name",
				viewsetScope.getBeanScope().getFragmentScope().toURI()
						.toString());

		// test uri.toString == toURIString
		Assert.assertEquals(viewsetScope.getBeanScope().toURIString(),
				viewsetScope.getBeanScope().toURI().toString());
		Assert.assertEquals(viewsetScope.getBeanScope().getFragmentScope()
				.toURIString(), viewsetScope.getBeanScope().getFragmentScope()
				.toURI().toString());
	}

	/**
	 * Tests the toURI method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_bean_toURI_WithoutFragment() {
		ViewsetScope viewsetScope = URIHelper
				.toScope("viewset://bean/org.my.bean");

		Assert.assertEquals("viewset://bean/org.my.bean", viewsetScope
				.toFullURI().toString());
		Assert.assertEquals("viewset://bean/org.my.bean", viewsetScope
				.getBeanScope().toURI().toString());
		Assert.assertNull(viewsetScope.getBeanScope().getFragmentScope());

		// test uri.toString == toURIString
		Assert.assertEquals(viewsetScope.getBeanScope().toURIString(),
				viewsetScope.getBeanScope().toURI().toString());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the toURI method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_service_toURI() {
		ViewsetScope viewsetScope = URIHelper
				.toScope("viewset://service/org.my.service");

		Assert.assertEquals("viewset://service/org.my.service", viewsetScope
				.toFullURI().toString());
		Assert.assertEquals("viewset://service/org.my.service", viewsetScope
				.getServiceScope().toURI().toString());

		// test uri.toString == toURIString
		Assert.assertEquals(viewsetScope.getServiceScope().toURIString(),
				viewsetScope.getServiceScope().toURI().toString());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the access of beans.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_accessBean() {
		String name = "Name";
		Person person = new Person(name);
		viewSetContext.setBean("org.my.bean", person);
		ISlot slot = viewSetContext.getBeanSlot("org.my.bean");

		Assert.assertSame(slot, URIHelper.toScope("viewset://bean/org.my.bean")
				.access(viewSetContext));
		Assert.assertSame(
				person,
				URIHelper.toScope("viewset://bean/org.my.bean#value").access(
						viewSetContext));
		Assert.assertEquals("Name",
				URIHelper.toScope("viewset://bean/org.my.bean#value.name")
						.access(viewSetContext));
	}

	/**
	 * Tests the access of beans by the bean scope.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_beanScope() {
		String name = "Name";
		Person person = new Person(name);
		viewSetContext.setBean("org.my.bean", person);
		ISlot slot = viewSetContext.getBeanSlot("org.my.bean");

		Assert.assertSame(slot, URIHelper.toScope("view://bean/org.my.bean")
				.getBeanScope().access(viewSetContext));
		Assert.assertSame(person,
				URIHelper.toScope("view://bean/org.my.bean#value")
						.getBeanScope().access(viewSetContext));
		Assert.assertEquals("Name",
				URIHelper.toScope("view://bean/org.my.bean#value.name")
						.getBeanScope().access(viewSetContext));
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the access of beans by the bean scope.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_beanScope_accessBean() {
		String name = "Name";
		Person person = new Person(name);
		viewSetContext.setBean("org.my.bean", person);
		Assert.assertSame(person, URIHelper.toScope("view://bean/org.my.bean")
				.getBeanScope().accessBean(viewSetContext));
		Assert.assertSame(person,
				URIHelper.toScope("view://bean/org.my.bean#value")
						.getBeanScope().accessBean(viewSetContext));
		Assert.assertEquals(person,
				URIHelper.toScope("view://bean/org.my.bean#value.name")
						.getBeanScope().accessBean(viewSetContext));
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the access of beans by the bean scope.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_beanScope_accessBeanSlot() {
		String name = "Name";
		Person person = new Person(name);
		viewSetContext.setBean("org.my.bean", person);
		ISlot slot = viewSetContext.getBeanSlot("org.my.bean");

		Assert.assertSame(slot, URIHelper.toScope("view://bean/org.my.bean")
				.getBeanScope().accessBeanSlot(viewSetContext));
		Assert.assertSame(slot,
				URIHelper.toScope("view://bean/org.my.bean#value")
						.getBeanScope().accessBeanSlot(viewSetContext));
		Assert.assertEquals(slot,
				URIHelper.toScope("view://bean/org.my.bean#value.name")
						.getBeanScope().accessBeanSlot(viewSetContext));
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests the access of services.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_viewset_accessService() {
		Object service = new Object();

		viewSetContext.registerService("org.my.service", service);

		Assert.assertSame(
				service,
				URIHelper.toScope("viewset://service/org.my.service").access(
						viewSetContext));
	}

	public static class Person {

		String name;

		public Person(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
