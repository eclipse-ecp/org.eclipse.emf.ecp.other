package org.eclipse.emf.ecp.ecview.ui.common.tests.validation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.RegexpValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationFactory;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidationConfig;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
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

public class RegexpValidatorEditpartTest {

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
		YRegexpValidator yValidator = ValidationFactory.eINSTANCE
				.createYRegexpValidator();
		IValidatorEditpart validatorEditpart = editpartManager
				.getEditpart(yValidator);
		IValidator validator = validatorEditpart.getValidator();
		yValidator.setRegExpression("H..lo");

		IStatus status = validator.validateValue("Hello");
		assertTrue(status.isOK());
		assertEquals(Severity.OK, status.getSeverity());
		assertEquals(null, status.getMessage());

		status = validator.validateValue("World");
		assertFalse(status.isOK());
		assertEquals(Severity.ERROR, status.getSeverity());
		assertEquals("The value World does not match the pattern H..lo",
				status.getMessage());

	}

	/**
	 * Tests whether updating validator parameters changes results
	 */
	@Test
	public void test_updateParameter() {
		YRegexpValidator yValidator = ValidationFactory.eINSTANCE
				.createYRegexpValidator();
		IValidatorEditpart validatorEditpart = editpartManager
				.getEditpart(yValidator);
		IValidator validator = validatorEditpart.getValidator();

		yValidator.setRegExpression("H..lo");
		IStatus status = validator.validateValue("Hello");
		assertTrue(status.isOK());
		assertEquals(Severity.OK, status.getSeverity());
		assertEquals(null, status.getMessage());

		yValidator.setRegExpression("Worl?d");
		status = validator.validateValue("Hello");
		assertFalse(status.isOK());
		assertEquals(Severity.ERROR, status.getSeverity());
		assertEquals("The value Hello does not match the pattern Worl?d",
				status.getMessage());
	}

	@SuppressWarnings("restriction")
	@Test
	public void test_changeDatatype_Property() {
		// if the datatype was updated, the validator needs to updated too.
		YRegexpValidationConfig yConfig = factory.createTextDatatype();
		IValidationConfig config = ModelUtil
				.getEditpart((YTextDatatype) yConfig);

		YRegexpValidator yValidator = ValidationFactory.eINSTANCE
				.createYRegexpValidator();
		RegexpValidatorEditpart editpart = ModelUtil.getEditpart(yValidator);
		editpart.setConfig(config);

		assertNull(yValidator.getRegExpression());

		yConfig.setRegExpression("Huhu");
		assertEquals("Huhu", yValidator.getRegExpression());

		yConfig.setRegExpression("");
		assertEquals("", yValidator.getRegExpression());
	}

	@Test
	@SuppressWarnings("restriction")
	public void test_dispose() {
		
		YRegexpValidator yValidator = ValidationFactory.eINSTANCE
				.createYRegexpValidator();
		RegexpValidatorEditpart editpart = ModelUtil.getEditpart(yValidator);
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
