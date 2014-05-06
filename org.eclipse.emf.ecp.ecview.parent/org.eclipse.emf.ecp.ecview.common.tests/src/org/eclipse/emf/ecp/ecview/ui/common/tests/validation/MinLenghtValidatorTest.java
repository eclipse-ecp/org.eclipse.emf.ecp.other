package org.eclipse.emf.ecp.ecview.ui.common.tests.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus.Severity;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinLenghtValidatorTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
	private SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();
	private CoreModelFactory modelFactory = CoreModelFactory.eINSTANCE;

	/**
	 * Setup.
	 */
	@SuppressWarnings("restriction")
	@Before
	public void setup() {
		editpartManager.clear();
		editpartManager
				.addDelegate(new org.eclipse.emf.ecp.ecview.common.editpart.emf.EditpartManager());
		editpartManager
				.addDelegate(new org.eclipse.emf.ecp.ecview.extension.editpart.emf.EditpartManager());
	}

	/**
	 * Tests the validator result status
	 */
	@Test
	public void test_minLength() {
		YMinLengthValidator yValidator = ValidationFactory.eINSTANCE
				.createYMinLengthValidator();
		IValidatorEditpart validatorEditpart = editpartManager
				.getEditpart(yValidator);
		IValidator validator = validatorEditpart.getValidator();
		yValidator.setMinLength(5);

		IStatus status = validator.validateValue("123456");
		assertTrue(status.isOK());
		assertEquals(Severity.OK, status.getSeverity());
		assertEquals(null, status.getMessage());

		status = validator.validateValue("123");
		assertFalse(status.isOK());
		assertEquals(Severity.ERROR, status.getSeverity());
		assertEquals("Minimum length is 5. Length of 123 is 3",
				status.getMessage());

	}

	/**
	 * Tests whether updating validator parameters changes results
	 */
	@Test
	public void test_updateParameter() {
		YMinLengthValidator yValidator = ValidationFactory.eINSTANCE
				.createYMinLengthValidator();
		IValidatorEditpart validatorEditpart = editpartManager
				.getEditpart(yValidator);
		IValidator validator = validatorEditpart.getValidator();

		yValidator.setMinLength(5);
		IStatus status = validator.validateValue("123456");
		assertTrue(status.isOK());
		assertEquals(Severity.OK, status.getSeverity());
		assertEquals(null, status.getMessage());

		yValidator.setMinLength(8);
		status = validator.validateValue("123456");
		assertFalse(status.isOK());
		assertEquals(Severity.ERROR, status.getSeverity());
		assertEquals("Minimum length is 8. Length of 123456 is 6",
				status.getMessage());
	}

	@Test
	public void test_setConfig() {
		Assert.fail();
	}

	@Test
	public void test_changeDatatype_Property() {
		// if a datatype property is changed, the validator must be updated
		// internally.
		Assert.fail();
	}

	@Test
	public void test_dispose() {
		// if a datatype property is changed, the validator must be updated
		// internally.
		Assert.fail();
	}

}
