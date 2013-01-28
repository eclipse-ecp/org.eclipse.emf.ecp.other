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

import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.databinding.beans.BeanBindingDelegate;
import org.eclipse.emf.ecp.ecview.databinding.tests.bean.model.Address;
import org.eclipse.emf.ecp.ecview.databinding.tests.bean.model.Country;
import org.eclipse.emf.ecp.ecview.databinding.tests.bean.model.Person;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class BeanBindingDelegateTests {

	private boolean changed;
	private BeanBindingDelegate binder;
	private IViewContext context;

	@Before
	public void setup() {
		new TestRealm();
		binder = new BeanBindingDelegate();
		context = new TestViewContext();
	}

	/**
	 * Tests the binding of values.
	 */
	@Test
	public void test_bindValue() {
		Person person = Person.newInstance("AT");
		context.setBean("input", person);

		IObservableValue value = binder.observeValue(context,
				URI.create("view://bean/input#value"));

		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});

		context.getBeanSlot("input").setValue(new Person());
		Assert.assertTrue(changed);
	}

	/**
	 * Tests what happens if a binding is done, but no bean slot was prepared so
	 * far.
	 */
	@Test
	public void test_bindValue_NoSlotAvailable() {
		IObservableValue value = binder.observeValue(context,
				URI.create("view://bean/input#value"));

		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});
		Assert.assertTrue(changed);
	}

	/**
	 * Test changing the bean in the slot.
	 */
	@Test
	public void test_bindValue_nested() {
		Person person = Person.newInstance("AT");
		context.setBean("input", person);

		IObservableValue value = binder.observeValue(context,
				URI.create("view://bean/input#value.address"));

		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});
		context.setBean("input", new Person());
		Assert.assertTrue(changed);
	}

	/**
	 * Tests changing the observed element.
	 */
	@Test
	public void test_bindValue_nested_target() {
		Person person = Person.newInstance("AT");
		context.setBean("input", person);

		IObservableValue value = binder.observeValue(context,
				URI.create("view://bean/input#value.address.country.isoCode"));

		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});

		person.getAddress().getCountry().setIsoCode("EN");
		Assert.assertTrue(changed);
	}

	/**
	 * Tests changing an object in the observer chain.
	 */
	@Test
	public void test_bindValue_nested_middleOfChain() {
		Person person = Person.newInstance("AT");
		context.setBean("input", person);

		IObservableValue value = binder.observeValue(context,
				URI.create("view://bean/input#value.address.country.isoCode"));

		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});

		// change the address in person
		//
		Address address = new Address();
		Country country = new Country();
		country.setIsoCode("EN");
		address.setCountry(country);

		person.setAddress(address);
		Assert.assertTrue(changed);
	}

	@Test
	public void test_bindValue_nested_property() {
		Person person = Person.newInstance("AT");
		IObservableValue value = BeanProperties.value(Person.class,
				"address.country").observe(person);
		Assert.assertSame(person.getAddress().getCountry(), value.getValue());

		Country other = new Country();
		other.setIsoCode("Other");
		person.getAddress().setCountry(other);
		Assert.assertSame(person.getAddress().getCountry(), value.getValue());

		Address address = new Address();
		Country another = new Country();
		another.setIsoCode("Another");
		address.setCountry(another);
		person.setAddress(address);
		Assert.assertSame(person.getAddress().getCountry(), value.getValue());

	}

	@Test
	public void test_bindValue_observeDetail() {
		Person person = Person.newInstance("AT");

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
