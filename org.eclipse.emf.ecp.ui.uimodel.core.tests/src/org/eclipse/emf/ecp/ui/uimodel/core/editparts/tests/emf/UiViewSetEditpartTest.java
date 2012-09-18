package org.eclipse.emf.ecp.ui.uimodel.core.editparts.tests.emf;

import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ViewSetContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.IDisposable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class UiViewSetEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager.getInstance();
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;

	@Before
	public void setup() {
		editpartManager.clear();
		editpartManager.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager());
		editpartManager
			.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl.EditpartManager());
	}

	@Test
	public void test_context() {
		IUiViewSetEditpart viewSetEditpart = (IUiViewSetEditpart) editpartManager.createEditpart(
			UiModelPackage.eNS_URI, IUiViewSetEditpart.class);
		Assert.assertNull(viewSetEditpart.getContext());

		ViewSetContext context = new ViewSetContext(viewSetEditpart);
		Assert.assertSame(context, viewSetEditpart.getContext());
		Assert.assertSame(viewSetEditpart, context.getViewSetEditpart());
	}

	@Test
	public void test_addAndRemoveView() {

		// ...> viewSet
		// ......> view1
		YUiViewSet viewSet = modelFactory.createYUiViewSet();
		YUiView view1 = modelFactory.createYUiView();
		viewSet.getViews().add(view1);
		IUiViewSetEditpart viewSetEditpart = (IUiViewSetEditpart) editpartManager.getEditpart(viewSet);
		Assert.assertEquals(1, viewSetEditpart.getViews().size());

		// ...> viewSet
		// ......> view1
		// ......> view2
		// add by model
		YUiView view2 = modelFactory.createYUiView();
		viewSet.getViews().add(view2);
		Assert.assertEquals(2, viewSetEditpart.getViews().size());

		// add model twice
		viewSet.getViews().add(view2);
		Assert.assertEquals(2, viewSet.getViews().size());
		Assert.assertEquals(2, viewSetEditpart.getViews().size());

		// ...> viewSet
		// ......> view1
		// ......> view2
		// ......> view3
		// add by edit part
		IUiViewEditpart view3Editpart = editpartManager.createEditpart(UiModelPackage.eNS_URI, IUiViewEditpart.class);
		viewSetEditpart.addView(view3Editpart);
		Assert.assertEquals(3, viewSetEditpart.getViews().size());

		// add edit part twice
		viewSetEditpart.addView(view3Editpart);
		Assert.assertEquals(3, viewSet.getViews().size());
		Assert.assertEquals(3, viewSetEditpart.getViews().size());

		// remove by model
		viewSet.getViews().remove(view2);
		Assert.assertEquals(2, viewSetEditpart.getViews().size());

		// remove by model twice
		viewSet.getViews().remove(view2);
		Assert.assertEquals(2, viewSetEditpart.getViews().size());

		// remove by edit part
		viewSetEditpart.removeView(view3Editpart);
		Assert.assertEquals(1, viewSetEditpart.getViews().size());

		// remove by edit part twice
		viewSetEditpart.removeView(view3Editpart);
		Assert.assertEquals(1, viewSetEditpart.getViews().size());

	}

	@Test
	public void test_moveEmbedded_byModel() {

		// ...> viewSet1
		// ......> view1
		// ...> viewSet2
		YUiViewSet viewSet1 = modelFactory.createYUiViewSet();
		YUiView view1 = modelFactory.createYUiView();
		YUiViewSet viewSet2 = modelFactory.createYUiViewSet();
		viewSet1.getViews().add(view1);
		IUiViewSetEditpart viewSet1Editpart = (IUiViewSetEditpart) editpartManager.getEditpart(viewSet1);
		IUiViewSetEditpart viewSet2Editpart = (IUiViewSetEditpart) editpartManager.getEditpart(viewSet2);
		Assert.assertEquals(1, viewSet1Editpart.getViews().size());
		Assert.assertEquals(0, viewSet2Editpart.getViews().size());

		// move it
		//
		viewSet2.getViews().add(view1);
		Assert.assertEquals(0, viewSet1.getViews().size());
		Assert.assertEquals(1, viewSet2.getViews().size());

		Assert.assertEquals(0, viewSet1Editpart.getViews().size());
		Assert.assertEquals(1, viewSet2Editpart.getViews().size());
	}

	@Test
	public void test_moveEmbedded_byEditpart() {

		// ...> viewSet1
		// ......> view1
		// ...> viewSet2
		YUiViewSet viewSet1 = modelFactory.createYUiViewSet();
		YUiView view1 = modelFactory.createYUiView();
		YUiViewSet viewSet2 = modelFactory.createYUiViewSet();
		viewSet1.getViews().add(view1);
		IUiViewSetEditpart viewSet1Editpart = editpartManager.getEditpart(viewSet1);
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IUiViewSetEditpart viewSet2Editpart = editpartManager.getEditpart(viewSet2);
		Assert.assertEquals(1, viewSet1Editpart.getViews().size());
		Assert.assertEquals(0, viewSet2Editpart.getViews().size());

		// move it
		//
		viewSet2Editpart.addView(view1Editpart);
		Assert.assertEquals(0, viewSet1.getViews().size());
		Assert.assertEquals(1, viewSet2.getViews().size());

		Assert.assertEquals(0, viewSet1Editpart.getViews().size());
		Assert.assertEquals(1, viewSet2Editpart.getViews().size());
	}

	@Test
	public void test_getViews_unmodifyable() {
		YUiViewSet viewSet1 = modelFactory.createYUiViewSet();
		YUiView view1 = modelFactory.createYUiView();
		IUiViewSetEditpart viewSet1Editpart = editpartManager.getEditpart(viewSet1);
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);

		try {
			viewSet1Editpart.getViews().add(view1Editpart);
			Assert.fail("Must be unmodifieable");
		} catch (Exception e) {
		}
	}

	@Test
	public void test_disposeView() {

		// ...> viewSet1
		// ......> view1
		YUiViewSet viewSet1 = modelFactory.createYUiViewSet();
		YUiView view1 = modelFactory.createYUiView();
		viewSet1.getViews().add(view1);
		IUiViewSetEditpart viewSet1Editpart = editpartManager.getEditpart(viewSet1);
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);

		Assert.assertEquals(1, viewSet1Editpart.getViews().size());
		Assert.assertSame(viewSet1Editpart, view1Editpart.getParent());
		Assert.assertSame(viewSet1, view1.getRoot());

		// dispose the view
		//
		view1Editpart.dispose();
		Assert.assertFalse(viewSet1Editpart.isDisposed());
		Assert.assertTrue(view1Editpart.isDisposed());

		Assert.assertEquals(0, viewSet1Editpart.getViews().size());
		Assert.assertNull(view1.getRoot());
	}

	@Test
	public void test_dispose() {

		// ...> viewSet1
		// ......> view1
		YUiViewSet viewSet1 = modelFactory.createYUiViewSet();
		YUiView view1 = modelFactory.createYUiView();
		viewSet1.getViews().add(view1);
		IUiViewSetEditpart viewSet1Editpart = editpartManager.getEditpart(viewSet1);
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);

		Assert.assertFalse(viewSet1Editpart.isDisposed());
		Assert.assertFalse(view1Editpart.isDisposed());
		viewSet1Editpart.dispose();
		Assert.assertTrue(viewSet1Editpart.isDisposed());
		Assert.assertTrue(view1Editpart.isDisposed());

		viewSet1Editpart.isDisposed();
		viewSet1Editpart.dispose();

		try {
			viewSet1Editpart.addDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			viewSet1Editpart.addView(view1Editpart);
			Assert.fail();
		} catch (Exception e) {
			// expected
		}
		try {
			viewSet1Editpart.getViews();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			viewSet1Editpart.getId();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			viewSet1Editpart.getModel();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			viewSet1Editpart.removeDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			viewSet1Editpart.removeView(view1Editpart);
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

	}
}
