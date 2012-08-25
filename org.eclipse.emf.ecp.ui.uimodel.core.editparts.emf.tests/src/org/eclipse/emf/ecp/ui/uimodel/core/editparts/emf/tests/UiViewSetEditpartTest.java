package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.tests;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class UiViewSetEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager.getInstance();

	@Before
	public void setup() {
		DefaultRealm.setup();

		editpartManager.clear();
		editpartManager.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager());
		editpartManager
			.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl.EditpartManager());
	}

	@Test
	public void test_context() {
		Assert.fail();
	}

	@Test
	public void test_addView() {
		Assert.fail();
	}

	@Test
	public void test_removeView() {
		Assert.fail();
	}

	@Test
	public void test_moveView() {
		Assert.fail();
	}

	@Test
	public void test_disposeView() {
		Assert.fail();
	}

	@Test
	public void test_dispose() {
		Assert.fail();
	}
}
