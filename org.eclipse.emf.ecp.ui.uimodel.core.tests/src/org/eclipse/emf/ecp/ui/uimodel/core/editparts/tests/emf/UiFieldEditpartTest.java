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

@SuppressWarnings("restriction")
public class UiFieldEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager.getInstance();
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;

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

	@Test
	public void test_dispose() {
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
		} catch (Exception e) {
			// expected
		}

		try {
			field1Editpart.getId();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			field1Editpart.getModel();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			field1Editpart.getParent();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			field1Editpart.getView();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			field1Editpart.removeDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
		} catch (Exception e) {
			// expected
		}
	}
}
