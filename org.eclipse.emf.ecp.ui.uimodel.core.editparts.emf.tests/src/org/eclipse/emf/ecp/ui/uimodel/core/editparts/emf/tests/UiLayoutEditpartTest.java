package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.tests;

import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class UiLayoutEditpartTest {

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
	public void test_parent() {
		Assert.fail();
	}

	@Test
	public void test_addEmbedded() {
		Assert.fail();
	}
	
	@Test
	public void test_removeEmbedded() {
		Assert.fail();
	}
	
	@Test
	public void test_moveEmbedded() {
		Assert.fail();
	}
	
	@Test
	public void test_disposeEmbedded() {
		Assert.fail();
	}

	@Test
	public void test_dispose() {
		Assert.fail();
	}
}
