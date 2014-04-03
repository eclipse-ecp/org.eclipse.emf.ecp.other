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
package org.eclipse.emf.ecp.ecview.common.model.core.impl;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.junit.Test;

public class YLayoutTest {

	private CoreModelFactory factory = CoreModelFactory.eINSTANCE;

	@Test
	public void test_addElement() {
		YLayout layout = factory.createYLayout();
		assertEquals(0, layout.getElements().size());
		YField field1 = factory.createYField();
		assertTrue(layout.addElement(field1));
		assertEquals(1, layout.getElements().size());
		YField field2 = factory.createYField();
		assertTrue(layout.addElement(field2));
		assertEquals(2, layout.getElements().size());

		// add same field twice
		assertFalse(layout.addElement(field2));
		assertEquals(2, layout.getElements().size());
	}

	@Test
	public void test_insertElement() {
		YLayout layout = factory.createYLayout();
		assertEquals(0, layout.getElements().size());

		YField field1 = factory.createYField();
		layout.insertElement(0, field1);
		assertEquals(1, layout.getElements().size());

		YField field2 = factory.createYField();
		layout.insertElement(0, field2);
		assertEquals(2, layout.getElements().size());
		assertEquals(0, layout.getElements().indexOf(field2));
		assertEquals(1, layout.getElements().indexOf(field1));

		YField field3 = factory.createYField();
		layout.insertElement(99, field3);
		assertEquals(3, layout.getElements().size());
		assertEquals(2, layout.getElements().indexOf(field3));
		assertEquals(0, layout.getElements().indexOf(field2));
		assertEquals(1, layout.getElements().indexOf(field1));

		// add same field twice
		try {
			layout.insertElement(0, field2);
			fail();
		} catch (IllegalArgumentException e) {
			// expected
		}
	}

	@Test
	public void test_moveElement() {
		YLayout layout = factory.createYLayout();
		assertEquals(0, layout.getElements().size());

		YField field1 = factory.createYField();
		layout.addElement(field1);
		YField field2 = factory.createYField();
		layout.addElement(field2);
		YField field3 = factory.createYField();
		layout.addElement(field3);
		assertEquals(0, layout.getElements().indexOf(field1));
		assertEquals(1, layout.getElements().indexOf(field2));
		assertEquals(2, layout.getElements().indexOf(field3));

		// move field1 to between field2 and field3
		layout.moveElement(1, field1);
		assertEquals(0, layout.getElements().indexOf(field2));
		assertEquals(1, layout.getElements().indexOf(field1));
		assertEquals(2, layout.getElements().indexOf(field3));

		// move field1 to its current place
		layout.moveElement(0, field2);
		assertEquals(0, layout.getElements().indexOf(field2));
		assertEquals(1, layout.getElements().indexOf(field1));
		assertEquals(2, layout.getElements().indexOf(field3));
	}

	@Test
	public void test_removeElement() {
		YLayout layout = factory.createYLayout();
		assertEquals(0, layout.getElements().size());

		YField field1 = factory.createYField();
		layout.addElement(field1);
		YField field2 = factory.createYField();
		layout.addElement(field2);
		YField field3 = factory.createYField();
		layout.addElement(field3);
		assertEquals(3, layout.getElements().size());

		// move field1 to between field2 and field3
		layout.removeElement(field1);
		assertEquals(2, layout.getElements().size());
		assertFalse(layout.getElements().contains(field1));
	}

	@Test
	public void test_getIndex() {
		YLayout layout = factory.createYLayout();
		assertEquals(0, layout.getElements().size());

		YField field1 = factory.createYField();
		layout.addElement(field1);
		YField field2 = factory.createYField();
		layout.addElement(field2);
		YField field3 = factory.createYField();
		layout.addElement(field3);
		assertEquals(3, layout.getElements().size());

		assertEquals(0, layout.getIndex(field1));
		assertEquals(1, layout.getIndex(field2));
		assertEquals(2, layout.getIndex(field3));
	}

	@Test
	public void test_getElement() {
		YLayout layout = factory.createYLayout();
		assertEquals(0, layout.getElements().size());

		YField field1 = factory.createYField();
		layout.addElement(field1);
		YField field2 = factory.createYField();
		layout.addElement(field2);
		YField field3 = factory.createYField();
		layout.addElement(field3);
		assertEquals(3, layout.getElements().size());

		assertSame(field1, layout.getElement(0));
		assertSame(field2, layout.getElement(1));
		assertSame(field3, layout.getElement(2));
	}

}
