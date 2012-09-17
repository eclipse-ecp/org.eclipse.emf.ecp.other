package org.eclipse.emf.ecp.ui.uimodel.core.editparts.tests.emf;

import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.IDisposable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class UiLayoutEditpartTest {

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
		YUiLayout layout1_1 = modelFactory.createYUiLayout();
		layout1.getElements().add(layout1_1);
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		IUiLayoutEditpart layout1_1Editpart = editpartManager.getEditpart(layout1_1);

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

	@Test
	public void test_addAndRemove_Embedded() {

		// ...> layout
		// ......> field1
		YUiLayout layout = modelFactory.createYUiLayout();
		YUiField field1 = modelFactory.createYUiField();
		layout.getElements().add(field1);
		IUiLayoutEditpart layoutEditpart = (IUiLayoutEditpart) editpartManager.getEditpart(layout);
		Assert.assertEquals(1, layoutEditpart.getElements().size());
		Assert.assertSame(layout, field1.getParent());

		// ...> layout
		// ......> field1
		// ......> field2
		// add by model
		YUiField field2 = modelFactory.createYUiField();
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
		IUiFieldEditpart field3Editpart = editpartManager
			.createEditpart(UiModelPackage.eNS_URI, IUiFieldEditpart.class);
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

	@Test
	public void test_moveEmbedded_byModel() {

		// ...> layout1
		// ......> field1
		// ...> layout2
		YUiLayout layout1 = modelFactory.createYUiLayout();
		YUiField field1 = modelFactory.createYUiField();
		YUiLayout layout2 = modelFactory.createYUiLayout();
		layout1.getElements().add(field1);
		IUiLayoutEditpart layout1Editpart = (IUiLayoutEditpart) editpartManager.getEditpart(layout1);
		IUiLayoutEditpart layout2Editpart = (IUiLayoutEditpart) editpartManager.getEditpart(layout2);
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

	@Test
	public void test_moveEmbedded_byEditpart() {

		// ...> layout1
		// ......> field1
		// ...> layout2
		YUiLayout layout1 = modelFactory.createYUiLayout();
		YUiField field1 = modelFactory.createYUiField();
		YUiLayout layout2 = modelFactory.createYUiLayout();
		layout1.getElements().add(field1);
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		IUiFieldEditpart field1Editpart = editpartManager.getEditpart(field1);
		IUiLayoutEditpart layout2Editpart = editpartManager.getEditpart(layout2);
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

	@Test
	public void test_getView() {
		// ...> view1
		// ......> layout1
		// .........> field1
		YUiView view1 = modelFactory.createYUiView();
		YUiLayout layout1 = modelFactory.createYUiLayout();
		YUiField field1 = modelFactory.createYUiField();
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		IUiFieldEditpart field1Editpart = editpartManager.getEditpart(field1);
		view1Editpart.setContent(layout1Editpart);
		layout1Editpart.addElement(field1Editpart);

		Assert.assertSame(view1Editpart, layout1Editpart.getView());
		Assert.assertSame(view1Editpart, field1Editpart.getView());
		Assert.assertSame(view1, layout1.getView());
		Assert.assertSame(view1, field1.getView());

		// ...> view1
		// ......> layout1
		// .........> field1
		YUiView view2 = modelFactory.createYUiView();
		IUiViewEditpart view2Editpart = editpartManager.getEditpart(view2);
		view2.setContent(layout1);

		Assert.assertSame(view2Editpart, layout1Editpart.getView());
		Assert.assertSame(view2Editpart, field1Editpart.getView());
		Assert.assertSame(view2, layout1.getView());
		Assert.assertSame(view2, field1.getView());

	}

	@Test
	public void test_getElements_unmodifyable() {
		YUiLayout layout1 = modelFactory.createYUiLayout();
		YUiField field1 = modelFactory.createYUiField();
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		IUiFieldEditpart field1Editpart = editpartManager.getEditpart(field1);

		try {
			layout1Editpart.getElements().add(field1Editpart);
			Assert.fail("Must be unmodifieable");
		} catch (Exception e) {
		}
	}

	@Test
	public void test_disposeEmbedded() {
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
		YUiLayout layout1 = modelFactory.createYUiLayout();
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		IUiFieldEditpart field1Editpart = editpartManager.getEditpart(field1);

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
		} catch (Exception e) {
			// expected
		}

		try {
			layout1Editpart.addElement(field1Editpart);
			Assert.fail();
		} catch (Exception e) {
			// expected
		}
		try {
			layout1Editpart.getElements();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			layout1Editpart.getId();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			layout1Editpart.getModel();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			layout1Editpart.getParent();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			layout1Editpart.getView();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			layout1Editpart.removeDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			layout1Editpart.removeElement(field1Editpart);
			Assert.fail();
		} catch (Exception e) {
			// expected
		}
	}
}
