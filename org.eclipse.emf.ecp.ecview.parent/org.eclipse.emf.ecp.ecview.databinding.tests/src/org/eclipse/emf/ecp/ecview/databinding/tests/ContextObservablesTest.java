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
package org.eclipse.emf.ecp.ecview.databinding.tests;

import java.net.URI;

import junit.framework.Assert;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.ecp.ecview.common.binding.context.ContextObservables;
import org.eclipse.emf.ecp.ecview.common.context.ViewContext;
import org.eclipse.emf.ecp.ecview.databinding.beans.context.ContextBeanBindingDelegate;
import org.eclipse.emf.ecp.ecview.databinding.beans.context.ContextPojoBindingDelegate;
import org.eclipse.emf.ecp.ecview.databinding.emf.context.ContextEMFBindingDelegate;
import org.eclipse.emf.ecp.ecview.databinding.tests.bean.model.BPerson;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TAddress;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TCountry;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TPerson;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TestmodelFactory;
import org.eclipse.emf.ecp.ecview.databinding.tests.pojo.model.PPerson;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class ContextObservablesTest {

	private TestmodelFactory factory = TestmodelFactory.eINSTANCE;
	private boolean changed;

	@Before
	public void setup() {
		ContextObservables.getInstance().clear();
	}

	/**
	 * Tests the sequence.
	 */
	@Test
	public void test_getSequence() {
		ContextBeanBindingDelegate delegate10 = new ContextBeanBindingDelegate();
		ContextBeanBindingDelegate delegate20 = new ContextBeanBindingDelegate();
		ContextBeanBindingDelegate delegate30 = new ContextBeanBindingDelegate();

		ContextObservables.getInstance().addDelegate(30, delegate30);
		ContextObservables.getInstance().addDelegate(10, delegate10);
		ContextObservables.getInstance().addDelegate(20, delegate20);

		Assert.assertEquals(10,
				ContextObservables.getInstance().getSequence(delegate10));
		Assert.assertEquals(20,
				ContextObservables.getInstance().getSequence(delegate20));
		Assert.assertEquals(30,
				ContextObservables.getInstance().getSequence(delegate30));

		ContextObservables.getInstance().removeDelegate(delegate30);
		Assert.assertEquals(-1,
				ContextObservables.getInstance().getSequence(delegate30));
	}

	/**
	 * Tests the sequence.
	 */
	@Test
	public void test_addRemove() {
		ContextBeanBindingDelegate delegate10 = new ContextBeanBindingDelegate();

		ContextObservables.getInstance().addDelegate(10, delegate10);

		Assert.assertEquals(10,
				ContextObservables.getInstance().getSequence(delegate10));

		ContextObservables.getInstance().removeDelegate(delegate10);
		Assert.assertEquals(-1,
				ContextObservables.getInstance().getSequence(delegate10));
	}

	/**
	 * Tests the binding of values.
	 */
	@Test
	public void test_getBeanDelegate() {
		ContextBeanBindingDelegate expected = new ContextBeanBindingDelegate();
		ContextObservables.getInstance().addDelegate(10,
				new ContextEMFBindingDelegate());
		ContextObservables.getInstance().addDelegate(20, expected);
		ContextObservables.getInstance().addDelegate(30,
				new ContextPojoBindingDelegate());

		TestViewContext context = new TestViewContext();
		context.setBean("input", BPerson.newInstance("AT"));

		Assert.assertSame(expected, ContextObservables.getInstance()
				.getDelegate(context, URI.create("view://bean/input#value")));
	}

	/**
	 * Tests the binding of values.
	 */
	@Test
	public void test_getBeanDelegate_ButFindsPojoDelegate() {
		ContextPojoBindingDelegate expected = new ContextPojoBindingDelegate();
		ContextObservables.getInstance().addDelegate(10,
				new ContextEMFBindingDelegate());
		ContextObservables.getInstance().addDelegate(20, expected);
		ContextObservables.getInstance().addDelegate(30,
				new ContextBeanBindingDelegate());

		TestViewContext context = new TestViewContext();
		context.setBean("input", BPerson.newInstance("AT"));

		Assert.assertSame(expected, ContextObservables.getInstance()
				.getDelegate(context, URI.create("view://bean/input#value")));
	}

	/**
	 * Tests the binding of values.
	 */
	@Test
	public void test_getPojoDelegate() {
		ContextPojoBindingDelegate expected = new ContextPojoBindingDelegate();
		ContextObservables.getInstance().addDelegate(10,
				new ContextEMFBindingDelegate());
		ContextObservables.getInstance().addDelegate(20,
				new ContextBeanBindingDelegate());
		ContextObservables.getInstance().addDelegate(30, expected);

		TestViewContext context = new TestViewContext();
		context.setBean("input", PPerson.newInstance("AT"));

		Assert.assertSame(expected, ContextObservables.getInstance()
				.getDelegate(context, URI.create("view://bean/input#value")));
	}

	/**
	 * Tests the binding of values.
	 */
	@Test
	public void test_getEMFDelegate() {
		ContextEMFBindingDelegate expected = new ContextEMFBindingDelegate();
		ContextObservables.getInstance().addDelegate(10, expected);
		ContextObservables.getInstance().addDelegate(20,
				new ContextBeanBindingDelegate());
		ContextObservables.getInstance().addDelegate(30,
				new ContextPojoBindingDelegate());

		TestViewContext context = new TestViewContext();
		context.setBean("input", newPerson("AT"));

		Assert.assertSame(expected, ContextObservables.getInstance()
				.getDelegate(context, URI.create("view://bean/input#value")));
	}

	/**
	 * Test changing the bean in the slot.
	 */
	@Test
	public void test_bean_bindValue_nested() {
		ContextObservables.getInstance().addDelegate(10,
				new ContextEMFBindingDelegate());
		ContextObservables.getInstance().addDelegate(20,
				new ContextBeanBindingDelegate());
		ContextObservables.getInstance().addDelegate(30,
				new ContextPojoBindingDelegate());

		ViewContext context = new TestViewContext();
		new TestRealm();

		BPerson person = BPerson.newInstance("AT");
		context.setBean("input", person);

		IObservableValue value = ContextObservables.observeValue(context,
				URI.create("view://bean/input#value.address"));

		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});
		context.setBean("input", new BPerson());
		Assert.assertTrue(changed);
	}

	/**
	 * Test changing the bean in the slot.
	 */
	@Test
	public void test_emf_bindValue_nested() {
		ContextObservables.getInstance().addDelegate(10,
				new ContextEMFBindingDelegate());
		ContextObservables.getInstance().addDelegate(20,
				new ContextBeanBindingDelegate());
		ContextObservables.getInstance().addDelegate(30,
				new ContextPojoBindingDelegate());

		ViewContext context = new TestViewContext();
		new TestRealm();

		TPerson person = newPerson("AT");
		context.setBean("input", person);

		IObservableValue value = ContextObservables.observeValue(context,
				URI.create("view://bean/input#value.address"));

		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});
		context.setBean("input", newPerson("AT"));
		Assert.assertTrue(changed);
	}

	/**
	 * Test changing the bean in the slot.
	 */
	@Test
	public void test_pojo_bindValue_nested() {
		ContextObservables.getInstance().addDelegate(10,
				new ContextEMFBindingDelegate());
		ContextObservables.getInstance().addDelegate(20,
				new ContextBeanBindingDelegate());
		ContextObservables.getInstance().addDelegate(30,
				new ContextPojoBindingDelegate());

		ViewContext context = new TestViewContext();
		new TestRealm();

		PPerson person = PPerson.newInstance("AT");
		context.setBean("input", person);

		IObservableValue value = ContextObservables.observeValue(context,
				URI.create("view://bean/input#value.address"));

		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});
		context.setBean("input", new PPerson());
		
		// pojo binding does not send events!
		Assert.assertFalse(changed);
	}

	/**
	 * Creates a new instance of person. All references are properly setup and
	 * the isoCode of the country is set to the given value.
	 * 
	 * @param isoCode
	 * @return
	 */
	public TPerson newPerson(String isoCode) {
		TPerson person = factory.createTPerson();
		TAddress address = factory.createTAddress();
		person.setAddress(address);
		TCountry country = factory.createTCountry();
		country.setIsoCode(isoCode);
		address.setCountry(country);
		return person;
	}

	private static class TestRealm extends Realm {

		private TestRealm() {
			setDefault(this);
		}

		public boolean isCurrent() {
			return true;
		}

		public void asyncExec(final Runnable runnable) {
			throw new UnsupportedOperationException("Not a valid call!");
		}

		public void timerExec(int milliseconds, final Runnable runnable) {
			throw new UnsupportedOperationException("Not a valid call!");
		}
	}
}
