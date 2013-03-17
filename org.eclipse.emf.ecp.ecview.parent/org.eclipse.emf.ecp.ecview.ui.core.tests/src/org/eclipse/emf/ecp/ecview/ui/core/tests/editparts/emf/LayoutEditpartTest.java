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

import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the ui layout edit part.
 */
@SuppressWarnings("restriction")
public class LayoutEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
	private CoreModelFactory modelFactory = CoreModelFactory.eINSTANCE;

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
	 * Tests the parent property.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_parent() {
		// ...> layout1
		// ......> field1
		YLayout layout1 = modelFactory.createYLayout();
		YLayout layout1_1 = modelFactory.createYLayout();
		layout1.getElements().add(layout1_1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		ILayoutEditpart layout1_1Editpart = editpartManager
				.getEditpart(layout1_1);

		Assert.assertEquals(1, layout1Editpart.getElements().size());
		Assert.assertSame(layout1Editpart, layout1_1Editpart.getParent());
		Assert.assertSame(layout1, layout1_1.getParent());

		// dispose the field
		//
		layout1_1Editpart.dispose();
		Assert.assertFalse(layout1Editpart.isDisposed());
		Assert.assertTrue(layout1_1Editpart.isDisposed());

		Assert.assertEquals(0, layout1Editpart.getElements().size());
		Assert.assertNull(layout1_1.getParent());
	}

	// END SUPRESS CATCH EXCEPTION

	/**
	 * Tests adding and removing embeddeables.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_addAndRemove_Embedded() {
		// END SUPRESS CATCH EXCEPTION

		// ...> layout
		// ......> field1
		YLayout layout = modelFactory.createYLayout();
		YField field1 = modelFactory.createYField();
		layout.getElements().add(field1);
		ILayoutEditpart layoutEditpart = (ILayoutEditpart) editpartManager
				.getEditpart(layout);
		Assert.assertEquals(1, layoutEditpart.getElements().size());
		Assert.assertSame(layout, field1.getParent());

		// ...> layout
		// ......> field1
		// ......> field2
		// add by model
		YField field2 = modelFactory.createYField();
		layout.getElements().add(field2);
		Assert.assertEquals(2, layoutEditpart.getElements().size());
		Assert.assertSame(layout, field2.getParent());

		// add model twice
		layout.getElements().add(field2);
		Assert.assertEquals(2, layout.getElements().size());
		Assert.assertEquals(2, layoutEditpart.getElements().size());
		Assert.assertSame(layout, field2.getParent());

		// ...> layout
		// ......> field1
		// ......> field2
		// ......> field3
		// add by edit part
		IFieldEditpart field3Editpart = editpartManager.createEditpart(
				CoreModelPackage.eNS_URI, IFieldEditpart.class);
		layoutEditpart.addElement(field3Editpart);
		Assert.assertSame(layoutEditpart, field3Editpart.getParent());
		Assert.assertEquals(3, layoutEditpart.getElements().size());

		// add edit part twice
		layoutEditpart.addElement(field3Editpart);
		Assert.assertSame(layoutEditpart, field3Editpart.getParent());
		Assert.assertEquals(3, layout.getElements().size());
		Assert.assertEquals(3, layoutEditpart.getElements().size());

		// remove by model
		layout.getElements().remove(field2);
		Assert.assertEquals(2, layoutEditpart.getElements().size());
		Assert.assertNull(field2.getParent());

		// remove by model twice
		layout.getElements().remove(field2);
		Assert.assertEquals(2, layoutEditpart.getElements().size());
		Assert.assertNull(field2.getParent());

		// remove by edit part
		layoutEditpart.removeElement(field3Editpart);
		Assert.assertEquals(1, layoutEditpart.getElements().size());
		Assert.assertNull(field3Editpart.getParent());

		// remove by edit part twice
		layoutEditpart.removeElement(field3Editpart);
		Assert.assertEquals(1, layoutEditpart.getElements().size());
		Assert.assertNull(field3Editpart.getParent());

	}

	/**
	 * Test the move of embedded elements by the model.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_moveEmbedded_byModel() {
		// END SUPRESS CATCH EXCEPTION

		// ...> layout1
		// ......> field1
		// ...> layout2
		YLayout layout1 = modelFactory.createYLayout();
		YField field1 = modelFactory.createYField();
		YLayout layout2 = modelFactory.createYLayout();
		layout1.getElements().add(field1);
		ILayoutEditpart layout1Editpart = (ILayoutEditpart) editpartManager
				.getEditpart(layout1);
		ILayoutEditpart layout2Editpart = (ILayoutEditpart) editpartManager
				.getEditpart(layout2);
		Assert.assertEquals(1, layout1Editpart.getElements().size());
		Assert.assertEquals(0, layout2Editpart.getElements().size());
		Assert.assertSame(layout1, field1.getParent());

		// move it
		//
		layout2.getElements().add(field1);
		Assert.assertEquals(0, layout1.getElements().size());
		Assert.assertEquals(1, layout2.getElements().size());
		Assert.assertSame(layout2, field1.getParent());

		Assert.assertEquals(0, layout1Editpart.getElements().size());
		Assert.assertEquals(1, layout2Editpart.getElements().size());
	}

	/**
	 * Tests the move of embeddables by the edit parts.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_moveEmbedded_byEditpart() {
		// END SUPRESS CATCH EXCEPTION

		// ...> layout1
		// ......> field1
		// ...> layout2
		YLayout layout1 = modelFactory.createYLayout();
		YField field1 = modelFactory.createYField();
		YLayout layout2 = modelFactory.createYLayout();
		layout1.getElements().add(field1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		IFieldEditpart field1Editpart = editpartManager.getEditpart(field1);
		ILayoutEditpart layout2Editpart = editpartManager.getEditpart(layout2);
		Assert.assertEquals(1, layout1Editpart.getElements().size());
		Assert.assertEquals(0, layout2Editpart.getElements().size());
		Assert.assertSame(layout1, field1.getParent());

		// move it
		//
		layout2Editpart.addElement(field1Editpart);
		Assert.assertEquals(0, layout1.getElements().size());
		Assert.assertEquals(1, layout2.getElements().size());
		Assert.assertSame(layout2Editpart, field1Editpart.getParent());
		Assert.assertSame(layout2, field1.getParent());

		Assert.assertEquals(0, layout1Editpart.getElements().size());
		Assert.assertEquals(1, layout2Editpart.getElements().size());
	}

	/**
	 * Tests the getView method.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getView() {
		// END SUPRESS CATCH EXCEPTION
		// ...> view1
		// ......> layout1
		// .........> field1
		YView view1 = modelFactory.createYView();
		YLayout layout1 = modelFactory.createYLayout();
		YField field1 = modelFactory.createYField();
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		IFieldEditpart field1Editpart = editpartManager.getEditpart(field1);
		view1Editpart.setContent(layout1Editpart);
		layout1Editpart.addElement(field1Editpart);

		Assert.assertSame(view1Editpart, layout1Editpart.getView());
		Assert.assertSame(view1Editpart, field1Editpart.getView());
		Assert.assertSame(view1, layout1.getView());
		Assert.assertSame(view1, field1.getView());

		// ...> view1
		// ......> layout1
		// .........> field1
		YView view2 = modelFactory.createYView();
		IViewEditpart view2Editpart = editpartManager.getEditpart(view2);
		view2.setContent(layout1);

		Assert.assertSame(view2Editpart, layout1Editpart.getView());
		Assert.assertSame(view2Editpart, field1Editpart.getView());
		Assert.assertSame(view2, layout1.getView());
		Assert.assertSame(view2, field1.getView());

	}

	/**
	 * Tests the unmodifyable state of getElements collection.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getElements_unmodifyable() {
		// END SUPRESS CATCH EXCEPTION
		YLayout layout1 = modelFactory.createYLayout();
		YField field1 = modelFactory.createYField();
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		IFieldEditpart field1Editpart = editpartManager.getEditpart(field1);

		try {
			layout1Editpart.getElements().add(field1Editpart);
			Assert.fail("Must be unmodifieable");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}
	}

	/**
	 * Tests the disposal of embedded elements.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_disposeEmbedded() {
		// END SUPRESS CATCH EXCEPTION
		// ...> layout1
		// ......> field1
		YLayout layout1 = modelFactory.createYLayout();
		YField field1 = modelFactory.createYField();
		layout1.getElements().add(field1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		IFieldEditpart field1Editpart = editpartManager.getEditpart(field1);

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
	 * Tests the disposal of edit parts.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	@Test
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		// ...> layout1
		// ......> field1
		YLayout layout1 = modelFactory.createYLayout();
		YField field1 = modelFactory.createYField();
		layout1.getElements().add(field1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		IFieldEditpart field1Editpart = editpartManager.getEditpart(field1);

		Assert.assertFalse(layout1Editpart.isDisposed());
		Assert.assertFalse(field1Editpart.isDisposed());
		layout1Editpart.dispose();
		Assert.assertTrue(layout1Editpart.isDisposed());
		Assert.assertTrue(field1Editpart.isDisposed());

		layout1Editpart.isDisposed();
		layout1Editpart.dispose();

		try {
			layout1Editpart.addDisposeListener(new IDisposable.Listener() {
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
			layout1Editpart.addElement(field1Editpart);
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
		try {
			layout1Editpart.getElements();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			layout1Editpart.getId();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			layout1Editpart.getModel();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			layout1Editpart.getParent();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			layout1Editpart.getView();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			layout1Editpart.removeDisposeListener(new IDisposable.Listener() {
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
			layout1Editpart.removeElement(field1Editpart);
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
	}
}
