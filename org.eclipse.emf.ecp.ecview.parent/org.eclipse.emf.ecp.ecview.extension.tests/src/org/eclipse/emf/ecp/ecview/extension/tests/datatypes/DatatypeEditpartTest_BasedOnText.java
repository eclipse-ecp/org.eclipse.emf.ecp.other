package org.eclipse.emf.ecp.ecview.extension.tests.datatypes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecp.ecview.common.disposal.IDisposable;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart.DatatypeBridge;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart.DatatypeChangeEvent;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.MaxLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.MinLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.validation.RegexpValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMaxLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IMinLengthValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IRegexpValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.validation.IValidatorEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMaxLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YMinLengthValidator;
import org.eclipse.emf.ecp.ecview.common.model.validation.YRegexpValidator;
import org.eclipse.emf.ecp.ecview.extension.editpart.emf.TextFieldEditpart;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.YTextDatatype;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.util.SimpleExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.tests.datatypes.helper.HelperEditpartManager;
import org.eclipse.emf.ecp.ecview.extension.tests.datatypes.helper.HelperTextDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.util.emf.ModelUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class DatatypeEditpartTest_BasedOnText {

	private SimpleExtensionModelFactory factory = new SimpleExtensionModelFactory();
	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
	private CoreModelFactory modelFactory = CoreModelFactory.eINSTANCE;
	private YTextField yText;
	private YTextDatatype yTextDatatype;
	private TextFieldEditpart textEditpart;
	private HelperTextDatatypeEditpart textDatatypeEditpart;
	private YGridLayout yLayout;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		editpartManager.clear();
		editpartManager
				.addDelegate(new org.eclipse.emf.ecp.ecview.common.editpart.emf.EditpartManager());
		editpartManager.addDelegate(new HelperEditpartManager());

		YView yView = factory.createView();
		yLayout = factory.createGridLayout();
		yView.setContent(yLayout);
		yText = factory.createTextField();
		yLayout.getElements().add(yText);
		yTextDatatype = factory.createTextDatatype();
		yText.setDatatype(yTextDatatype);

		textEditpart = ModelUtil.getEditpart(yText);
		textDatatypeEditpart = ModelUtil.getEditpart(yTextDatatype);
	}

	@Test
	public void test_DefaultDatatype() {
		assertEquals(0, textEditpart.getValidators().size());
		assertEquals(0, yText.getValidators().size());

		// no datatype validators created since datasettings are default
		assertEquals(0, textEditpart.getDatatypeValidators().size());
		assertEquals(0, yText.getInternalValidators().size());
	}

	@Test
	public void test_datatypeIsSetFromBeginning() {
		// the problem is, that the textEditparts need to register as a bridge
		// at the datatype editpart during initializion
		// at this state, the setup must be done!

		assertEquals(1, textDatatypeEditpart.getBridges().size());

		yTextDatatype.setMinLength(10);
		yTextDatatype.setRegExpression("Huhu");
		// no datatype validators created since datasettings are default
		assertEquals(0, textEditpart.getValidators().size());
		assertEquals(0, yText.getValidators().size());
		assertEquals(2, textEditpart.getDatatypeValidators().size());
		assertEquals(2, yText.getInternalValidators().size());

	}

	@Test
	public void test_setNewDatatypeToField_AndChangeSettings() {

		// reset datatype
		yText.setDatatype(null);

		// set the datatype
		yText.setDatatype(yTextDatatype);

		yTextDatatype.setMinLength(10);
		yTextDatatype.setMaxLength(100);
		yTextDatatype.setRegExpression("Huhu");
		// no datatype validators created since datasettings are default
		assertEquals(0, textEditpart.getValidators().size());
		assertEquals(0, yText.getValidators().size());
		assertEquals(3, textEditpart.getDatatypeValidators().size());
		assertEquals(3, yText.getInternalValidators().size());

		Set<Class<?>> types = new HashSet<Class<?>>();
		Set<Class<?>> allowedTypes = new HashSet<Class<?>>();
		allowedTypes.add(MinLengthValidatorEditpart.class);
		allowedTypes.add(MaxLengthValidatorEditpart.class);
		allowedTypes.add(RegexpValidatorEditpart.class);
		for (IValidatorEditpart validator : textEditpart
				.getDatatypeValidators()) {
			Class<?> type = validator.getClass();
			if (!allowedTypes.contains(type)) {
				fail(type + " is not a valid type!");
			}

			if (!types.add(type)) {
				fail(type + " must only be defined once!");
			}
		}

		// now set minlength to -1
		// -> So the MinLengthValidator is removed
		yTextDatatype.setMinLength(-1);
		assertEquals(2, textEditpart.getDatatypeValidators().size());
		assertEquals(2, yText.getInternalValidators().size());
		types = new HashSet<Class<?>>();
		allowedTypes = new HashSet<Class<?>>();
		allowedTypes.add(MaxLengthValidatorEditpart.class);
		allowedTypes.add(RegexpValidatorEditpart.class);
		for (IValidatorEditpart validator : textEditpart
				.getDatatypeValidators()) {
			Class<?> type = validator.getClass();
			if (!allowedTypes.contains(type)) {
				fail(type + " is not a valid type!");
			}

			if (!types.add(type)) {
				fail(type + " must only be defined once!");
			}
		}

		// now set minlength to 10
		// -> So the MinLengthValidator is added again
		yTextDatatype.setMinLength(10);
		assertEquals(3, textEditpart.getDatatypeValidators().size());
		assertEquals(3, yText.getInternalValidators().size());
		types = new HashSet<Class<?>>();
		allowedTypes = new HashSet<Class<?>>();
		allowedTypes.add(MinLengthValidatorEditpart.class);
		allowedTypes.add(MaxLengthValidatorEditpart.class);
		allowedTypes.add(RegexpValidatorEditpart.class);
		for (IValidatorEditpart validator : textEditpart
				.getDatatypeValidators()) {
			Class<?> type = validator.getClass();
			if (!allowedTypes.contains(type)) {
				fail(type + " is not a valid type!");
			}

			if (!types.add(type)) {
				fail(type + " must only be defined once!");
			}
		}

		// now set all values to default
		// -> So all validators are removed again
		yTextDatatype.setMinLength(-1);
		yTextDatatype.setMaxLength(-1);
		yTextDatatype.setRegExpression("");
		types = new HashSet<Class<?>>();
		assertEquals(0, textEditpart.getDatatypeValidators().size());
		assertEquals(0, yText.getInternalValidators().size());
	}

	/**
	 * Changing the settings does not change the amount of registered
	 * validators. Updated internally.
	 */
	@Test
	public void test_changeDatatype_Settings() {

		// reset datatype
		yText.setDatatype(null);
		// set the datatype
		yTextDatatype.setMinLength(10);
		yTextDatatype.setMaxLength(100);
		yTextDatatype.setRegExpression("Huhu");
		yText.setDatatype(yTextDatatype);

		assertEquals(0, textEditpart.getValidators().size());
		assertEquals(0, yText.getValidators().size());
		assertEquals(3, textEditpart.getDatatypeValidators().size());
		assertEquals(3, yText.getInternalValidators().size());

		// set to null
		yTextDatatype.setMinLength(20);
		assertEquals(0, textEditpart.getValidators().size());
		assertEquals(0, yText.getValidators().size());
		assertEquals(3, textEditpart.getDatatypeValidators().size());
		assertEquals(3, yText.getInternalValidators().size());

		// set again
		yTextDatatype.setMaxLength(999);
		assertEquals(0, textEditpart.getValidators().size());
		assertEquals(0, yText.getValidators().size());
		assertEquals(3, textEditpart.getDatatypeValidators().size());
		assertEquals(3, yText.getInternalValidators().size());

		// now all datatypes must be removed
		yTextDatatype.setMinLength(-1);
		yTextDatatype.setMaxLength(-1);
		yTextDatatype.setRegExpression("");
		assertEquals(0, textEditpart.getDatatypeValidators().size());
		assertEquals(0, yText.getInternalValidators().size());
	}

	/**
	 * Changing the settings does not change the amount of registered
	 * validators. Updated internally.
	 */
	@Test
	public void test_internalUpdateOfValidatorsByDatatype() {

		// set the datatype
		yTextDatatype.setMinLength(10);
		yTextDatatype.setMaxLength(100);
		yTextDatatype.setRegExpression("Huhu");

		IMinLengthValidatorEditpart minLength = null;
		IMaxLengthValidatorEditpart maxLength = null;
		IRegexpValidatorEditpart regexpLength = null;
		for (IValidatorEditpart editpart : textEditpart.getDatatypeValidators()) {
			if (editpart instanceof IMinLengthValidatorEditpart) {
				minLength = (IMinLengthValidatorEditpart) editpart;
			} else if (editpart instanceof IMaxLengthValidatorEditpart) {
				maxLength = (IMaxLengthValidatorEditpart) editpart;
			} else if (editpart instanceof IRegexpValidatorEditpart) {
				regexpLength = (IRegexpValidatorEditpart) editpart;
			}
		}

		assertNotNull(minLength);
		assertNotNull(maxLength);
		assertNotNull(regexpLength);

		YMinLengthValidator yMinLength = (YMinLengthValidator) minLength
				.getModel();
		YMaxLengthValidator yMaxLength = (YMaxLengthValidator) maxLength
				.getModel();
		YRegexpValidator yRegexpLength = (YRegexpValidator) regexpLength
				.getModel();

		assertEquals(10, yMinLength.getMinLength());
		assertEquals(100, yMaxLength.getMaxLength());
		assertEquals("Huhu", yRegexpLength.getRegExpression());

		yTextDatatype.setMinLength(20);
		assertEquals(20, yMinLength.getMinLength());
		assertEquals(100, yMaxLength.getMaxLength());
		assertEquals("Huhu", yRegexpLength.getRegExpression());

		yTextDatatype.setMaxLength(999);
		assertEquals(20, yMinLength.getMinLength());
		assertEquals(999, yMaxLength.getMaxLength());
		assertEquals("Huhu", yRegexpLength.getRegExpression());

		yTextDatatype.setRegExpression("blablabla");
		assertEquals(20, yMinLength.getMinLength());
		assertEquals(999, yMaxLength.getMaxLength());
		assertEquals("blablabla", yRegexpLength.getRegExpression());
	}

	@Test
	public void test_getBridges_1() {
		// access the editpart for yText2 eager
		//
		assertEquals(1, textDatatypeEditpart.getBridges().size());
		yText.setDatatype(null);
		assertEquals(0, textDatatypeEditpart.getBridges().size());
		yText.setDatatype(yTextDatatype);
		assertEquals(1, textDatatypeEditpart.getBridges().size());

		// share the same datatype between two fields
		YTextField yText2 = factory.createTextField();
		yLayout.getElements().add(yText2);
		// eager
		ModelUtil.getEditpart(yText2);
		assertEquals(1, textDatatypeEditpart.getBridges().size());

		yText2.setDatatype(yTextDatatype);
		assertEquals(2, textDatatypeEditpart.getBridges().size());

		yText.setDatatype(null);
		assertEquals(1, textDatatypeEditpart.getBridges().size());
		yText2.setDatatype(null);
		assertEquals(0, textDatatypeEditpart.getBridges().size());

	}

	@Test
	public void test_getBridges_2() {
		// access the editpart for yText2 late
		//
		assertEquals(1, textDatatypeEditpart.getBridges().size());
		yText.setDatatype(null);
		assertEquals(0, textDatatypeEditpart.getBridges().size());
		yText.setDatatype(yTextDatatype);
		assertEquals(1, textDatatypeEditpart.getBridges().size());

		// share the same datatype between two fields
		YTextField yText2 = factory.createTextField();
		yLayout.getElements().add(yText2);
		assertEquals(1, textDatatypeEditpart.getBridges().size());

		yText2.setDatatype(yTextDatatype);
		// late
		ModelUtil.getEditpart(yText2);
		assertEquals(2, textDatatypeEditpart.getBridges().size());

		yText.setDatatype(null);
		assertEquals(1, textDatatypeEditpart.getBridges().size());
		yText2.setDatatype(null);
		assertEquals(0, textDatatypeEditpart.getBridges().size());
	}

	@Test
	public void test_getBridges_3() {
		// never access editpart for text2
		//
		assertEquals(1, textDatatypeEditpart.getBridges().size());
		yText.setDatatype(null);
		assertEquals(0, textDatatypeEditpart.getBridges().size());
		yText.setDatatype(yTextDatatype);
		assertEquals(1, textDatatypeEditpart.getBridges().size());

		// share the same datatype between two fields
		YTextField yText2 = factory.createTextField();
		yLayout.getElements().add(yText2);
		assertEquals(1, textDatatypeEditpart.getBridges().size());

		yText2.setDatatype(yTextDatatype);
		assertEquals(1, textDatatypeEditpart.getBridges().size());
	}

	@Test
	public void test_getCurrentState() {
		YTextDatatype yTextDatatype = factory.createTextDatatype();
		HelperTextDatatypeEditpart textDatatypeEditpart = ModelUtil
				.getEditpart(yTextDatatype);

		DatatypeChangeEvent state = textDatatypeEditpart.getCurrentState();
		assertEquals(0, state.getAddedValidators().size());
		assertEquals(0, state.getRemovedValidators().size());
		assertNull(state.getChangeObject());
		assertSame(textDatatypeEditpart, state.getEditpart());

		yTextDatatype.setMinLength(10);
		state = textDatatypeEditpart.getCurrentState();
		assertEquals(1, state.getAddedValidators().size());
		assertEquals(0, state.getRemovedValidators().size());
		assertNull(state.getChangeObject());
		assertSame(textDatatypeEditpart, state.getEditpart());

		yTextDatatype.setMaxLength(10);
		state = textDatatypeEditpart.getCurrentState();
		assertEquals(2, state.getAddedValidators().size());
		assertEquals(0, state.getRemovedValidators().size());
		assertNull(state.getChangeObject());
		assertSame(textDatatypeEditpart, state.getEditpart());

		yTextDatatype.setRegExpression("Huhu");
		state = textDatatypeEditpart.getCurrentState();
		assertEquals(3, state.getAddedValidators().size());
		assertEquals(0, state.getRemovedValidators().size());
		assertNull(state.getChangeObject());
		assertSame(textDatatypeEditpart, state.getEditpart());

		yTextDatatype.setMinLength(-1);
		yTextDatatype.setMaxLength(-1);
		yTextDatatype.setRegExpression("");
		state = textDatatypeEditpart.getCurrentState();
		assertEquals(0, state.getAddedValidators().size());
		assertEquals(0, state.getRemovedValidators().size());
		assertNull(state.getChangeObject());
		assertSame(textDatatypeEditpart, state.getEditpart());
	}

	@Test
	public void test_bridgeNotification() {
		YTextDatatype yTextDatatype = factory.createTextDatatype();
		HelperTextDatatypeEditpart textDatatypeEditpart = ModelUtil
				.getEditpart(yTextDatatype);

		Bridge bridge = new Bridge();
		textDatatypeEditpart.addBridge(bridge);
		assertNull(bridge.lastEvent);

		yTextDatatype.setMaxLength(10);
		assertEquals(1, bridge.validators.size());

		yTextDatatype.setMaxLength(0);
		assertEquals(0, bridge.validators.size());

		bridge.lastEvent = null;
		yTextDatatype.setMaxLength(10);
		assertNotNull(bridge.lastEvent);

		bridge.lastEvent = null;
		yTextDatatype.setMinLength(10);
		assertNotNull(bridge.lastEvent);

		bridge.lastEvent = null;
		yTextDatatype.setRegExpression("Huhu");
		assertEquals(3, bridge.validators.size());
		assertNotNull(bridge.lastEvent);
	}

	@Test
	public void test_dispose() {
		assertEquals(1, textDatatypeEditpart.getBridges().size());

		yTextDatatype.setMaxLength(10);
		assertEquals(1, yText.getInternalValidators().size());

		// dispose the datatype
		textDatatypeEditpart.dispose();
		assertEquals(0, yText.getInternalValidators().size());

		try {
			textDatatypeEditpart.addDisposeListener(new IDisposable.Listener() {
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
			textDatatypeEditpart.getId();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			textDatatypeEditpart.getModel();
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}

		try {
			textDatatypeEditpart
					.removeDisposeListener(new IDisposable.Listener() {
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
			textDatatypeEditpart.getBridges();
			fail("Is disposed!");
		} catch (Exception ex) {
		}

		try {
			textDatatypeEditpart.getCurrentState();
			fail("Is disposed!");
		} catch (Exception ex) {
		}

		try {
			textDatatypeEditpart.getValidationSettings();
			fail("Is disposed!");
		} catch (Exception ex) {
		}

		assertEquals(0, yText.getDatatype().eAdapters().size());

		// assert no events are delivered
		yTextDatatype.setMinLength(10);
		assertEquals(0, yText.getInternalValidators().size());
	}

	@Test
	public void test_internalValidatorsDisposed() {
		// set the datatype
		yTextDatatype.setMinLength(10);
		yTextDatatype.setMaxLength(100);
		yTextDatatype.setRegExpression("Huhu");

		IMinLengthValidatorEditpart minLength = null;
		IMaxLengthValidatorEditpart maxLength = null;
		IRegexpValidatorEditpart regexpLength = null;
		for (IValidatorEditpart editpart : textEditpart.getDatatypeValidators()) {
			if (editpart instanceof IMinLengthValidatorEditpart) {
				minLength = (IMinLengthValidatorEditpart) editpart;
			} else if (editpart instanceof IMaxLengthValidatorEditpart) {
				maxLength = (IMaxLengthValidatorEditpart) editpart;
			} else if (editpart instanceof IRegexpValidatorEditpart) {
				regexpLength = (IRegexpValidatorEditpart) editpart;
			}
		}

		assertNotNull(minLength);
		assertNotNull(maxLength);
		assertNotNull(regexpLength);
		assertFalse(minLength.isDisposed());
		assertFalse(maxLength.isDisposed());
		assertFalse(regexpLength.isDisposed());
		assertEquals(4, yTextDatatype.eAdapters().size());

		yTextDatatype.setMinLength(0);
		assertTrue(minLength.isDisposed());
		assertFalse(maxLength.isDisposed());
		assertFalse(regexpLength.isDisposed());
		assertEquals(3, yTextDatatype.eAdapters().size());

		yTextDatatype.setMaxLength(0);
		assertTrue(minLength.isDisposed());
		assertTrue(maxLength.isDisposed());
		assertFalse(regexpLength.isDisposed());
		assertEquals(2, yTextDatatype.eAdapters().size());

		yTextDatatype.setRegExpression("");
		assertTrue(minLength.isDisposed());
		assertTrue(maxLength.isDisposed());
		assertTrue(regexpLength.isDisposed());
		assertEquals(1, yTextDatatype.eAdapters().size());
	}

	@Test
	public void test_internalValidatorsDisposed_AfterEditpartDisposal() {
		// set the datatype
		yTextDatatype.setMinLength(10);
		yTextDatatype.setMaxLength(100);
		yTextDatatype.setRegExpression("Huhu");

		IMinLengthValidatorEditpart minLength = null;
		IMaxLengthValidatorEditpart maxLength = null;
		IRegexpValidatorEditpart regexpLength = null;
		for (IValidatorEditpart editpart : textEditpart.getDatatypeValidators()) {
			if (editpart instanceof IMinLengthValidatorEditpart) {
				minLength = (IMinLengthValidatorEditpart) editpart;
			} else if (editpart instanceof IMaxLengthValidatorEditpart) {
				maxLength = (IMaxLengthValidatorEditpart) editpart;
			} else if (editpart instanceof IRegexpValidatorEditpart) {
				regexpLength = (IRegexpValidatorEditpart) editpart;
			}
		}

		assertNotNull(minLength);
		assertNotNull(maxLength);
		assertNotNull(regexpLength);
		assertFalse(minLength.isDisposed());
		assertFalse(maxLength.isDisposed());
		assertFalse(regexpLength.isDisposed());
		assertEquals(4, yTextDatatype.eAdapters().size());

		textDatatypeEditpart.dispose();

		assertTrue(minLength.isDisposed());
		assertTrue(maxLength.isDisposed());
		assertTrue(regexpLength.isDisposed());
		assertEquals(0, yTextDatatype.eAdapters().size());
	}

	private class Bridge implements DatatypeBridge {

		private final List<IValidatorEditpart> validators = new ArrayList<IValidatorEditpart>();
		private DatatypeChangeEvent lastEvent;

		@Override
		public void notifyDatatypeChanged(DatatypeChangeEvent event) {
			validators.removeAll(event.getRemovedValidators());
			validators.addAll(event.getAddedValidators());
			lastEvent = event;

		}

		@Override
		public List<IValidatorEditpart> getDatatypeValidators() {
			return validators;
		}

	}
}
