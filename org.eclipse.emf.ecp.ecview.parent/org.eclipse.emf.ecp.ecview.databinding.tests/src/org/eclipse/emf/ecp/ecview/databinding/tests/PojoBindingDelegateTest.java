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
import org.eclipse.emf.ecp.ecview.databinding.beans.context.ContextPojoBindingDelegate;
import org.eclipse.emf.ecp.ecview.databinding.tests.bean.model.BAddress;
import org.eclipse.emf.ecp.ecview.databinding.tests.bean.model.BCountry;
import org.eclipse.emf.ecp.ecview.databinding.tests.bean.model.BPerson;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class PojoBindingDelegateTest {

	private boolean changed;
	private ContextPojoBindingDelegate binder;
	private IViewContext context;

	@Before
	public void setup() {
		new TestRealm();
		binder = new ContextPojoBindingDelegate();
		context = new TestViewContext();
	}

	/**
	 * Tests the binding of bean slot.
	 */
	@Test
	public void test_bindSlot() {
		BPerson person = BPerson.newInstance("AT");
		context.setBean("input", person);

		IObservableValue value = binder.observeValue(context,
				URI.create("view://bean/input"));
		Assert.assertNull(value);
	}

	/**
	 * Tests the binding of values.
	 */
	@Test
	public void test_bindValue() {
		BPerson person = BPerson.newInstance("AT");
		context.setBean("input", person);

		IObservableValue value = binder.observeValue(context,
				URI.create("view://bean/input#value"));
		Assert.assertSame(person, value.getValue());

		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});

		context.getBeanSlot("input").setValue(new BPerson());
		Assert.assertFalse(changed);
	}

	/**
	 * Tests what happens if a binding is done, but no bean slot was prepared so
	 * far.
	 */
	@SuppressWarnings("unused")
	@Test
	public void test_bindValue_NoSlotAvailable() {
		try {
			IObservableValue value = binder.observeValue(context,
					URI.create("view://bean/input#value"));
			Assert.fail();
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Test changing the bean in the slot.
	 */
	@Test
	public void test_bindValue_nested() {
		BPerson person = BPerson.newInstance("AT");
		context.setBean("input", person);

		IObservableValue value = binder.observeValue(context,
				URI.create("view://bean/input#value.address"));
		Assert.assertSame(person.getAddress(), value.getValue());

		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});

		context.setBean("input", new BPerson());

		// Pojo-Binding does not notified observables
		Assert.assertFalse(changed);
	}

	/**
	 * Tests changing the observed element.
	 */
	@Test
	public void test_bindValue_nested_target() {
		BPerson person = BPerson.newInstance("AT");
		context.setBean("input", person);
		IObservableValue value = binder.observeValue(context,
				URI.create("view://bean/input#value.address.country.isoCode"));
		Assert.assertSame("AT", value.getValue());
		
		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});

		person.getAddress().getCountry().setIsoCode("EN");
		Assert.assertFalse(changed);
	}

	/**
	 * Tests changing an object in the observer chain.
	 */
	@Test
	public void test_bindValue_nested_middleOfChain() {
		BPerson person = BPerson.newInstance("AT");
		context.setBean("input", person);

		IObservableValue value = binder.observeValue(context,
				URI.create("view://bean/input#value.address.country.isoCode"));
		Assert.assertSame("AT", value.getValue());
		
		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});

		// change the address in person
		//
		BAddress address = new BAddress();
		BCountry country = new BCountry();
		country.setIsoCode("EN");
		address.setCountry(country);

		person.setAddress(address);
		Assert.assertFalse(changed);
	}

	/**
	 * Tests bind value of nested property
	 */
	@Test
	public void test_bindValue_nested_property() {
		BPerson person = BPerson.newInstance("AT");
		IObservableValue value = BeanProperties.value(BPerson.class,
				"address.country").observe(person);
		Assert.assertSame(person.getAddress().getCountry(), value.getValue());

		BCountry other = new BCountry();
		other.setIsoCode("Other");
		person.getAddress().setCountry(other);
		Assert.assertSame(person.getAddress().getCountry(), value.getValue());

		BAddress address = new BAddress();
		BCountry another = new BCountry();
		another.setIsoCode("Another");
		address.setCountry(another);
		person.setAddress(address);
		Assert.assertSame(person.getAddress().getCountry(), value.getValue());

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
