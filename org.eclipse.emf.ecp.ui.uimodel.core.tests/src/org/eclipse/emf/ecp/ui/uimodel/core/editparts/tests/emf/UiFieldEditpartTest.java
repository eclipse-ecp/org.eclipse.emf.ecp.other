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
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.tests.emf;

import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.IDisposable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the ui field edit part.
 * 
 * @author admin
 * 
 */
@SuppressWarnings("restriction")
public class UiFieldEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager.getInstance();
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		editpartManager.clear();
		editpartManager.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager());
		editpartManager
			.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl.EditpartManager());
	}

	/**
	 * Tets the parent property.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_parent() {
		// END SUPRESS CATCH EXCEPTION
		// ...> layout1
		// ......> field1
		YUiLayout layout1 = modelFactory.createYUiLayout();
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		IUiFieldEditpart field1Editpart = editpartManager.getEditpart(field1);

		Assert.assertEquals(1, layout1Editpart.getElements().size());
		Assert.assertSame(layout1Editpart, field1Editpart.getParent());
		Assert.assertSame(layout1, field1.getParent());

		// dispose the field
		//
		field1Editpart.dispose();
		Assert.assertFalse(layout1Editpart.isDisposed());
		Assert.assertTrue(field1Editpart.isDisposed());

		Assert.assertEquals(0, layout1Editpart.getElements().size());
		Assert.assertNull(field1.getParent());
	}

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		// ...> layout1
		// ......> field1
		YUiField field1 = modelFactory.createYUiField();
		IUiFieldEditpart field1Editpart = editpartManager.getEditpart(field1);

		Assert.assertFalse(field1Editpart.isDisposed());
		field1Editpart.dispose();
		Assert.assertTrue(field1Editpart.isDisposed());

		field1Editpart.isDisposed();
		field1Editpart.dispose();

		try {
			field1Editpart.addDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			field1Editpart.getId();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			field1Editpart.getModel();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			field1Editpart.getParent();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			field1Editpart.getView();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			field1Editpart.removeDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
	}
}
