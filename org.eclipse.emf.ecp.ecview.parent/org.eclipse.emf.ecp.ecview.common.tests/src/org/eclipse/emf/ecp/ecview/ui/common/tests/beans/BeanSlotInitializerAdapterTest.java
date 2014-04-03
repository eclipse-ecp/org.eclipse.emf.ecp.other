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
package org.eclipse.emf.ecp.ecview.ui.common.tests.beans;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.eclipse.emf.ecp.ecview.common.beans.BeanSlotInitializerAdapter;
import org.eclipse.emf.ecp.ecview.common.beans.ISlot;
import org.eclipse.emf.ecp.ecview.common.context.ViewContext;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.presentation.DelegatingPresenterFactory;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class BeanSlotInitializerAdapterTest {

	private DelegatingPresenterFactory presenterFactory = DelegatingPresenterFactory
			.getInstance();
	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();

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
		presenterFactory.clear();
	}

	/**
	 * Tests the context.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test() {
		IViewEditpart viewEditpart = (IViewEditpart) editpartManager
				.createEditpart(CoreModelPackage.eNS_URI, IViewEditpart.class);
		assertNull(viewEditpart.getContext());

		ViewContext context = new ViewContext(viewEditpart);

		assertNull(context.getBeanSlot("bean1"));

		new BeanSlotInitializerAdapter() {
			@Override
			protected void doIntialize() {
				createBeanSlot("view://bean/bean1", String.class);
			}
		}.intialize(context);

		ISlot slot = context.getBeanSlot("bean1");
		assertSame(String.class, slot.getValueType());
	}
}
