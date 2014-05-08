package org.eclipse.emf.ecp.ecview.ui.common.tests.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.MaxLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus;
import org.eclipse.emf.ecp.ecview.common.validation.IStatus.Severity;
import org.eclipse.emf.ecp.ecview.common.validation.IValidationConfig;
import org.eclipse.emf.ecp.ecview.common.validation.IValidator;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.util.emf.ModelUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxLenghtValidatorEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
	private SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();

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
		YMaxLengthValidator yValidator = ValidationFactory.eINSTANCE
				.createYMaxLengthValidator();
		IValidatorEditpart validatorEditpart = editpartManager
				.getEditpart(yValidator);
		IValidator validator = validatorEditpart.getValidator();
		yValidator.setMaxLength(5);

		IStatus status = validator.validateValue("123");
		assertTrue(status.isOK());
		assertEquals(Severity.OK, status.getSeverity());
		assertEquals(null, status.getMessage());

		status = validator.validateValue("123456");
		assertFalse(status.isOK());
		assertEquals(Severity.ERROR, status.getSeverity());
		assertEquals("Maximum length is 5. Length of 123456 is 6",
				status.getMessage());

	}

	/**
	 * Tests whether updating validator parameters changes results
	 */
	@Test
	public void test_updateParameter() {
		YMaxLengthValidator yValidator = ValidationFactory.eINSTANCE
				.createYMaxLengthValidator();
		IValidatorEditpart validatorEditpart = editpartManager
				.getEditpart(yValidator);
		IValidator validator = validatorEditpart.getValidator();

		yValidator.setMaxLength(8);
		IStatus status = validator.validateValue("123456");
		assertTrue(status.isOK());
		assertEquals(Severity.OK, status.getSeverity());
		assertEquals(null, status.getMessage());

		yValidator.setMaxLength(5);
		status = validator.validateValue("123456");
		assertFalse(status.isOK());
		assertEquals(Severity.ERROR, status.getSeverity());
		assertEquals("Maximum length is 5. Length of 123456 is 6",
				status.getMessage());
	}

	@SuppressWarnings("restriction")
	@Test
	public void test_changeDatatype_Property() {
		// if the datatype was updated, the validator needs to updated too.
		YMaxLengthValidationConfig yConfig = factory.createTextDatatype();
		IValidationConfig config = ModelUtil
				.getEditpart((YTextDatatype) yConfig);

		YMaxLengthValidator yValidator = ValidationFactory.eINSTANCE
				.createYMaxLengthValidator();
		MaxLengthValidatorEditpart editpart = ModelUtil.getEditpart(yValidator);
		editpart.setConfig(config);

		assertEquals(0, yValidator.getMaxLength());

		yConfig.setMaxLength(100);
		assertEquals(100, yValidator.getMaxLength());

		yConfig.setMaxLength(-1);
		assertEquals(-1, yValidator.getMaxLength());
	}

	@Test
	@SuppressWarnings("restriction")
	public void test_dispose() {
		
		YMaxLengthValidator yValidator = ValidationFactory.eINSTANCE
				.createYMaxLengthValidator();
		MaxLengthValidatorEditpart editpart = ModelUtil.getEditpart(yValidator);
		editpart.dispose();
		
		try {
			editpart.addDisposeListener(new IDisposable.Listener() {
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
			editpart.getId();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			editpart.getModel();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			editpart.setConfig(null);
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
	}
}
