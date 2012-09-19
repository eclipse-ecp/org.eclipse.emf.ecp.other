package org.eclipse.emf.ecp.ui.uimodel.core.editparts.tests.emf;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpartProvider;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class EditpartManagerTest {

	private EditpartManager editpartManager = new EditpartManager();
	private ResourceSetImpl resourceSet;
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;

	@Before
	public void setup() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(UiModelPackage.eNS_URI, UiModelPackage.eINSTANCE);

		DelegatingEditPartManager manager = DelegatingEditPartManager.getInstance();
		manager.clear();
		manager.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager());
		manager.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl.EditpartManager());
	}

	/**
	 * Tests that the editpart manager always returns the same instance on calling getInstance()
	 */
	@Test
	public void test_getInstance() {
		Resource resource = resourceSet.createResource(URI.createURI("http://eclipse.org/emf/emfclient/uimodel"));
		YUiViewSet viewSet = modelFactory.createYUiViewSet();
		resource.getContents().add(viewSet);

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		YUiView view1 = modelFactory.createYUiView();
		resource.getContents().add(view1);
		viewSet.getViews().add(view1);
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);

		YUiView view2 = modelFactory.createYUiView();
		resource.getContents().add(view2);
		viewSet.getViews().add(view2);
		YUiLayout layout2 = modelFactory.createYUiLayout();
		view2.setContent(layout2);
		YUiField field2 = modelFactory.createYUiField();
		layout2.getElements().add(field2);

		// access the editparts the editpartManager
		//
		// viewSet
		IUiViewSetEditpart viewsetEditPart = editpartManager.getEditpart(viewSet);
		// view1
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.getEditpart(field1);
		// view 2
		IUiViewEditpart view2Editpart = editpartManager.getEditpart(view2);
		// layout2
		IUiLayoutEditpart layout2Editpart = editpartManager.getEditpart(layout2);
		// field2
		IUiFieldEditpart field2Editpart = editpartManager.getEditpart(field2);

		// ensure that the editpartManager also returns the singleton instance
		//
		Assert.assertSame(viewsetEditPart, editpartManager.getEditpart(viewSet));
		Assert.assertSame(view1Editpart, editpartManager.getEditpart(view1));
		Assert.assertSame(layout1Editpart, editpartManager.getEditpart(layout1));
		Assert.assertSame(field1Editpart, editpartManager.getEditpart(field1));
		Assert.assertSame(view2Editpart, editpartManager.getEditpart(view2));
		Assert.assertSame(layout2Editpart, editpartManager.getEditpart(layout2));
		Assert.assertSame(field2Editpart, editpartManager.getEditpart(field2));
	}

	/**
	 * Tests that no edit part is created for findEditpart(modelObject)
	 */
	@Test
	public void test_findEditpart() {
		Resource resource = resourceSet.createResource(URI.createURI("http://eclipse.org/emf/emfclient/uimodel"));
		YUiViewSet viewSet = modelFactory.createYUiViewSet();
		resource.getContents().add(viewSet);

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		YUiView view1 = modelFactory.createYUiView();
		resource.getContents().add(view1);
		viewSet.getViews().add(view1);
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);

		YUiView view2 = modelFactory.createYUiView();
		resource.getContents().add(view2);
		viewSet.getViews().add(view2);
		YUiLayout layout2 = modelFactory.createYUiLayout();
		view2.setContent(layout2);
		YUiField field2 = modelFactory.createYUiField();
		layout2.getElements().add(field2);

		// try to find the editparts from the editpartManager
		//
		// viewSet
		Assert.assertNull(editpartManager.findEditpart(viewSet));
		// view1
		Assert.assertNull(editpartManager.findEditpart(view1));
		// layout1
		Assert.assertNull(editpartManager.findEditpart(layout1));
		// field1
		Assert.assertNull(editpartManager.findEditpart(field1));
		// view 2
		Assert.assertNull(editpartManager.findEditpart(view2));
		// layout2
		Assert.assertNull(editpartManager.findEditpart(layout2));
		// field2
		Assert.assertNull(editpartManager.findEditpart(field2));
	}

	/**
	 * Tests that the findEditpart(modelObject) will find the same instance as getInstance
	 */
	@Test
	public void test_findEditpart_afterGetEditpart() {
		Resource resource = resourceSet.createResource(URI.createURI("http://eclipse.org/emf/emfclient/uimodel"));
		YUiViewSet viewSet = modelFactory.createYUiViewSet();
		resource.getContents().add(viewSet);

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		YUiView view1 = modelFactory.createYUiView();
		resource.getContents().add(view1);
		viewSet.getViews().add(view1);
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);

		YUiView view2 = modelFactory.createYUiView();
		resource.getContents().add(view2);
		viewSet.getViews().add(view2);
		YUiLayout layout2 = modelFactory.createYUiLayout();
		view2.setContent(layout2);
		YUiField field2 = modelFactory.createYUiField();
		layout2.getElements().add(field2);

		// access the editparts the editpartManager
		//
		// viewSet
		IUiViewSetEditpart viewsetEditPart = editpartManager.getEditpart(viewSet);
		// view1
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.getEditpart(field1);
		// view 2
		IUiViewEditpart view2Editpart = editpartManager.getEditpart(view2);
		// layout2
		IUiLayoutEditpart layout2Editpart = editpartManager.getEditpart(layout2);
		// field2
		IUiFieldEditpart field2Editpart = editpartManager.getEditpart(field2);

		// ensure that the editpartManager also finds the singleton instance
		//
		Assert.assertSame(viewsetEditPart, editpartManager.findEditpart(viewSet));
		Assert.assertSame(view1Editpart, editpartManager.findEditpart(view1));
		Assert.assertSame(layout1Editpart, editpartManager.findEditpart(layout1));
		Assert.assertSame(field1Editpart, editpartManager.findEditpart(field1));
		Assert.assertSame(view2Editpart, editpartManager.findEditpart(view2));
		Assert.assertSame(layout2Editpart, editpartManager.findEditpart(layout2));
		Assert.assertSame(field2Editpart, editpartManager.findEditpart(field2));
	}

	/**
	 * Tests that the findEditpart(modelObject) finds the edit part that was created by createEditpart
	 */
	@Test
	public void test_findEditpart_afterCreateEditpart() {
		String selector = "http://eclipse.org/emf/emfclient/uimodel";

		// access the editparts the editpartManager
		//
		// viewSet
		IUiViewSetEditpart viewsetEditPart = editpartManager.createEditpart(selector, IUiViewSetEditpart.class);
		// view1
		IUiViewEditpart view1Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager.createEditpart(selector, IUiLayoutEditpart.class);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.createEditpart(selector, IUiFieldEditpart.class);
		// view 2
		IUiViewEditpart view2Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
		// layout2
		IUiLayoutEditpart layout2Editpart = editpartManager.createEditpart(selector, IUiLayoutEditpart.class);
		// field2
		IUiFieldEditpart field2Editpart = editpartManager.createEditpart(selector, IUiFieldEditpart.class);

		YUiViewSet viewSet = (YUiViewSet) viewsetEditPart.getModel();
		YUiView view1 = (YUiView) view1Editpart.getModel();
		YUiLayout layout1 = (YUiLayout) layout1Editpart.getModel();
		YUiField field1 = (YUiField) field1Editpart.getModel();
		YUiView view2 = (YUiView) view2Editpart.getModel();
		YUiLayout layout2 = (YUiLayout) layout2Editpart.getModel();
		YUiField field2 = (YUiField) field2Editpart.getModel();

		// ensure that the editpartManager also finds the singleton instance
		//
		Assert.assertSame(viewsetEditPart, editpartManager.findEditpart(viewSet));
		Assert.assertSame(view1Editpart, editpartManager.findEditpart(view1));
		Assert.assertSame(layout1Editpart, editpartManager.findEditpart(layout1));
		Assert.assertSame(field1Editpart, editpartManager.findEditpart(field1));
		Assert.assertSame(view2Editpart, editpartManager.findEditpart(view2));
		Assert.assertSame(layout2Editpart, editpartManager.findEditpart(layout2));
		Assert.assertSame(field2Editpart, editpartManager.findEditpart(field2));
	}

	/**
	 * Tests that no ADDITIONAL {@link IUiElementEditpartProvider} is registered on the model object for calling
	 * getEditpart(modelObject). Just one for the first create.
	 */
	@Test
	public void test_getInstance_justOneAdapterInstanceRegistered() {
		Resource resource = resourceSet.createResource(URI.createURI("http://eclipse.org/emf/emfclient/uimodel"));
		YUiViewSet viewSet = modelFactory.createYUiViewSet();
		resource.getContents().add(viewSet);

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		YUiView view1 = modelFactory.createYUiView();
		resource.getContents().add(view1);
		viewSet.getViews().add(view1);
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);

		YUiView view2 = modelFactory.createYUiView();
		resource.getContents().add(view2);
		viewSet.getViews().add(view2);
		YUiLayout layout2 = modelFactory.createYUiLayout();
		view2.setContent(layout2);
		YUiField field2 = modelFactory.createYUiField();
		layout2.getElements().add(field2);

		// access the editparts the editpartManager
		//
		// viewSet
		editpartManager.getEditpart(viewSet);
		editpartManager.getEditpart(viewSet);
		editpartManager.getEditpart(viewSet);
		editpartManager.findEditpart(viewSet);
		assertIUiElementEditpartProviderCount(1, viewSet);
		// view1
		editpartManager.getEditpart(view1);
		editpartManager.getEditpart(view1);
		editpartManager.findEditpart(view1);
		assertIUiElementEditpartProviderCount(1, view1);
		// layout1
		editpartManager.getEditpart(layout1);
		assertIUiElementEditpartProviderCount(1, layout1);
		// field1
		editpartManager.getEditpart(field1);
		editpartManager.getEditpart(field1);
		editpartManager.getEditpart(field1);
		editpartManager.getEditpart(field1);
		assertIUiElementEditpartProviderCount(1, field1);
		// view 2
		editpartManager.getEditpart(view2);
		assertIUiElementEditpartProviderCount(1, view2);
		// layout2
		editpartManager.getEditpart(layout2);
		editpartManager.getEditpart(layout2);
		assertIUiElementEditpartProviderCount(1, layout2);
		// field2
		editpartManager.getEditpart(field2);
		assertIUiElementEditpartProviderCount(1, field2);
	}

	/**
	 * Tests that no edit part is created for findEditpart(modelObject)
	 */
	@Test
	public void test_createEditpart() {
		String selector = "http://eclipse.org/emf/emfclient/uimodel";

		// access the editparts the editpartManager
		//
		// viewSet
		IUiViewSetEditpart viewsetEditPart = editpartManager.createEditpart(selector, IUiViewSetEditpart.class);
		// view1
		IUiViewEditpart view1Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager.createEditpart(selector, IUiLayoutEditpart.class);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.createEditpart(selector, IUiFieldEditpart.class);
		// view 2
		IUiViewEditpart view2Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
		// layout2
		IUiLayoutEditpart layout2Editpart = editpartManager.createEditpart(selector, IUiLayoutEditpart.class);
		// field2
		IUiFieldEditpart field2Editpart = editpartManager.createEditpart(selector, IUiFieldEditpart.class);

		Assert.assertNotNull(viewsetEditPart);
		Assert.assertNotNull(viewsetEditPart.getModel());
		Assert.assertNotNull(view1Editpart);
		Assert.assertNotNull(view1Editpart.getModel());
		Assert.assertNotNull(layout1Editpart);
		Assert.assertNotNull(layout1Editpart.getModel());
		Assert.assertNotNull(field1Editpart);
		Assert.assertNotNull(field1Editpart.getModel());
		Assert.assertNotNull(view2Editpart);
		Assert.assertNotNull(view2Editpart.getModel());
		Assert.assertNotNull(layout2Editpart);
		Assert.assertNotNull(layout2Editpart.getModel());
		Assert.assertNotNull(field2Editpart);
		Assert.assertNotNull(field2Editpart.getModel());
	}

	/**
	 * Asserts that the number of added editpartProvider adapter equals the given one.
	 * 
	 * @param expectedCount
	 * @param eObject
	 */
	private void assertIUiElementEditpartProviderCount(int expectedCount, EObject eObject) {
		int count = 0;
		for (Adapter adapter : eObject.eAdapters()) {
			if (adapter instanceof IUiElementEditpartProvider) {
				count++;
			}
		}

		Assert.assertEquals(expectedCount, count);
	}
}
