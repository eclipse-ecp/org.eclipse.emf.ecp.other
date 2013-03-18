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
import org.eclipse.emf.ecp.ecview.common.context.IViewContext;
import org.eclipse.emf.ecp.ecview.databinding.emf.context.ContextEMFBindingDelegate;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TAddress;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TCountry;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TPerson;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TestmodelFactory;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class EMFBindingDelegateTests {

	private TestmodelFactory factory = TestmodelFactory.eINSTANCE;
	private boolean changed;
	private ContextEMFBindingDelegate binder;
	private IViewContext context;

	@Before
	public void setup() {
		new TestRealm();
		binder = new ContextEMFBindingDelegate();
		context = new TestViewContext();
	}

	/**
	 * Tests the binding of values.
	 */
	@Test
	public void test_bindValue() {
		TPerson person = newPerson("AT");
		context.setBean("input", person);

		IObservableValue value = binder.observeValue(Realm.getDefault(),
				context, URI.create("view://bean/input#value"));

		value.getValue();
		changed = false;
		value.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				changed = true;
			}
		});

		context.getBeanSlot("input").setValue(newPerson("EN"));
		Assert.assertTrue(changed);
	}

	/**
	 * Tests what happens if a binding is done, but no bean slot was prepared so
	 * far.
	 */
	@Test
	public void test_bindValue_NoSlotAvailable() {
		try {
			binder.observeValue(context, URI.create("view://bean/input#value"));
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Test changing the bean in the slot.
	 */
	@Test
	public void test_bindValue_nested() {
		TPerson person = newPerson("AT");
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
		context.setBean("input", newPerson("DE"));
		Assert.assertTrue(changed);
	}

	/**
	 * Test changing the bean in the slot.
	 */
	@Test
	public void test_bindValue_nested2() {
		TPerson person = newPerson("AT");
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

		person.getAddress().getCountry().setIsoCode("DE");
		Assert.assertTrue(changed);
	}

	/**
	 * Tests changing the observed element.
	 */
	@Test
	public void test_bindValue_nested_target() {
		TPerson person = newPerson("AT");
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
		TPerson person = newPerson("AT");
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
		TAddress address = factory.createTAddress();
		TCountry country = factory.createTCountry();
		country.setIsoCode("EN");
		address.setCountry(country);

		person.setAddress(address);
		Assert.assertTrue(changed);
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
