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
package org.eclipse.emf.ecp.ecview.ui.common.tests.editparts.emf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
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
public class FieldEditpartTest {

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
	 * Tets the parent property.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_parent() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yLayout1
		// ......> yField1
		YLayout yLayout1 = modelFactory.createYLayout();
		YField yField1 = modelFactory.createYField();
		yLayout1.getElements().add(yField1);
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(yLayout1);
		IFieldEditpart field1Editpart = editpartManager.getEditpart(yField1);

		Assert.assertEquals(1, layout1Editpart.getElements().size());
		Assert.assertSame(layout1Editpart, field1Editpart.getParent());
		Assert.assertSame(yLayout1, yField1.getParent());

		// dispose the field
		//
		field1Editpart.dispose();
		Assert.assertFalse(layout1Editpart.isDisposed());
		Assert.assertTrue(field1Editpart.isDisposed());

		Assert.assertEquals(0, layout1Editpart.getElements().size());
		Assert.assertNull(yField1.getParent());
	}

	/**
	 * Tests the disposal.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_dispose() {
		// END SUPRESS CATCH EXCEPTION
		// ...> yLayout1
		// ......> yField1
		YField yField1 = modelFactory.createYField();
		IFieldEditpart field1Editpart = editpartManager.getEditpart(yField1);

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

		try {
			field1Editpart.getValidators();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			field1Editpart.addValidator(DelegatingEditPartManager.getInstance()
					.createEditpart(ValidationPackage.eNS_URI,
							IValidatorEditpart.class));
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			field1Editpart.removeValidator(DelegatingEditPartManager
					.getInstance().createEditpart(ValidationPackage.eNS_URI,
							IValidatorEditpart.class));
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
	}

	/**
	 * Tests the automatic disposal of validators.
	 */
	@Test
	public void test_validatorsDisposed_AfterDispose() {
		// ...> yLayout1
		// ......> yField1
		YLayout yLayout1 = modelFactory.createYLayout();
		YField yField1 = modelFactory.createYField();
		yLayout1.getElements().add(yField1);
		IFieldEditpart fieldEditpart = editpartManager.getEditpart(yField1);
		assertFalse(fieldEditpart.isDisposed());

		// create and add validator
		//
		YMinLengthValidator yValidator = ValidationFactory.eINSTANCE
				.createYMinLengthValidator();
		YMinLengthValidator yValidator2 = ValidationFactory.eINSTANCE
				.createYMinLengthValidator();
		IValidatorEditpart validatorEditpart = editpartManager
				.getEditpart(yValidator);
		IValidatorEditpart validatorEditpart2 = editpartManager
				.getEditpart(yValidator2);
		fieldEditpart.addValidator(validatorEditpart);
		fieldEditpart.addValidator(validatorEditpart2);
		assertFalse(validatorEditpart.isDisposed());
		assertFalse(validatorEditpart2.isDisposed());

		// dispose parent
		//
		fieldEditpart.dispose();
		assertTrue(fieldEditpart.isDisposed());
		assertTrue(validatorEditpart.isDisposed());
		assertTrue(validatorEditpart2.isDisposed());
	}

	/**
	 * Tests the addition and removal of validators by the edit parts.
	 */
	@Test
	public void test_addRemoveValidator() {

		// ...> yLayout1
		// ......> yField1
		YLayout yLayout1 = modelFactory.createYLayout();
		YField yField1 = modelFactory.createYField();
		yLayout1.getElements().add(yField1);
		IFieldEditpart field1Editpart = editpartManager.getEditpart(yField1);

		// create and add validator by editpart
		//
		YMinLengthValidator yValidator = ValidationFactory.eINSTANCE
				.createYMinLengthValidator();
		IValidatorEditpart validatorEditpart = editpartManager
				.getEditpart(yValidator);

		assertEquals(0, field1Editpart.getValidators().size());
		assertEquals(0, yField1.getValidators().size());

		// add
		field1Editpart.addValidator(validatorEditpart);

		assertEquals(1, field1Editpart.getValidators().size());
		assertEquals(1, yField1.getValidators().size());
		assertSame(validatorEditpart, field1Editpart.getValidators().get(0));

		// add twice -> no effect
		field1Editpart.addValidator(validatorEditpart);

		assertEquals(1, field1Editpart.getValidators().size());
		assertEquals(1, yField1.getValidators().size());

		// remove validator by editpart
		//
		field1Editpart.removeValidator(validatorEditpart);

		assertEquals(0, field1Editpart.getValidators().size());
		assertEquals(0, yField1.getValidators().size());

		// remove twice
		//
		field1Editpart.removeValidator(validatorEditpart);

		assertEquals(0, field1Editpart.getValidators().size());
		assertEquals(0, yField1.getValidators().size());
	}

	/**
	 * Tests the addition and removal of validators by the model.
	 */
	@Test
	public void test_addRemoveValidatorByModel() {
		// ...> yLayout1
		// ......> yField1
		YLayout yLayout1 = modelFactory.createYLayout();
		YField yField1 = modelFactory.createYField();
		yLayout1.getElements().add(yField1);
		ILayoutEditpart layout1Editpart = (ILayoutEditpart) editpartManager
				.getEditpart(yLayout1);
		IFieldEditpart field1Editpart = editpartManager.getEditpart(yField1);

		Assert.assertEquals(1, layout1Editpart.getElements().size());
		Assert.assertSame(yLayout1, yField1.getParent());

		// create validator
		//
		ValidationFactory vf = ValidationFactory.eINSTANCE;
		YMinLengthValidator yValidator = vf.createYMinLengthValidator();
		assertEquals(0, yField1.getValidators().size());
		assertEquals(0, field1Editpart.getValidators().size());

		// add by model

		yField1.getValidators().add(yValidator);

		assertEquals(1, yField1.getValidators().size());
		assertEquals(1, field1Editpart.getValidators().size());
		assertSame(yValidator, yField1.getValidators().get(0));

		// add twice -> no effect
		//
		yField1.getValidators().add(yValidator);

		assertEquals(1, yField1.getValidators().size());
		assertEquals(1, field1Editpart.getValidators().size());
		assertSame(yValidator, yField1.getValidators().get(0));

		// remove validator by model
		//
		yField1.getValidators().remove(yValidator);

		assertEquals(0, yField1.getValidators().size());
		assertEquals(0, field1Editpart.getValidators().size());

		// remove twice
		//
		yField1.getValidators().remove(yValidator);

		assertEquals(0, yField1.getValidators().size());
		assertEquals(0, field1Editpart.getValidators().size());

	}

	@Test
	public void test_addRemoveInternalValidator() {
		Assert.fail();
	}

	@Test
	public void test_addRemoveInternalValidatorByModel() {
		Assert.fail();
	}

	@Test
	public void test_getDatatypeValidators() {
		Assert.fail();
	}

	/**
	 * Tests whether the list of validators for an editpart is unmodifiable
	 * (only the list within the model may be modified).
	 */
	@Test
	public void test_Validators_unmodifiable() {
		YField yField1 = modelFactory.createYField();
		IFieldEditpart field1Editpart = editpartManager.getEditpart(yField1);

		ValidationFactory vf = ValidationFactory.eINSTANCE;
		YMinLengthValidator yValidator = vf.createYMinLengthValidator();
		IValidatorEditpart validatorEditpart = editpartManager
				.getEditpart(yValidator);

		try {
			field1Editpart.getValidators().add(validatorEditpart);
			Assert.fail("Must be unmodifieable");
		} catch (Exception e) {
		}
	}

	@Test
	public void test_setNewDatatypeToText() {
		Assert.fail();
	}

	@Test
	public void test_internalValidatorEditparts_Disposed() {
		// ensure that the internal validators are disposed after disposing the
		// field editpart
		Assert.fail();
	}

	@Test
	public void test_fieldEditpart_unregisteredFromDatatypeEditpart_AfterDispose() {
		// ensure that the fieldEditpart was unregistered as a bridge at the
		// datatype editpart
		Assert.fail();
	}

	@Test
	public void test_disposeDatatypeEditpart_whileFieldEditpart_registeredAsBridge() {
		// test proper functionality if the datatype editpart was disposed while
		// the field editpart is registered as a ValidationBridge at the
		// datatype editpart. No idea for now what should happen :)
		Assert.fail();
	}

}
