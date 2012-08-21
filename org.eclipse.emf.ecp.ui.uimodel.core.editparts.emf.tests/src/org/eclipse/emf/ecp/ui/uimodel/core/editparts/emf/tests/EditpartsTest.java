package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.basicextension.IUiTextFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.common.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.common.IResourceSetManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.UiElementEditpart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class EditpartsTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager.getInstance();
	private ResourceSetImpl resourceSet;
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;

	@Before
	public void setup() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(UiModelPackage.eNS_URI, UiModelPackage.eINSTANCE);

		editpartManager.clear();
		editpartManager.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager());
		editpartManager
			.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl.EditpartManager());
	}

	/**
	 * Tests that only one editpart instance is created for one model instance.<br>
	 * Note that the editpartManager.getEditpart() was used.
	 */
	@Test
	public void test_SingletonEdipartPerEObjectInstance__FirstAccessByParentEditpart() {
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

		// access the editparts from their parents
		//
		// viewSet
		IUiViewSetEditpart rootEditPart = editpartManager.getEditpart(viewSet);
		// view1
		IUiViewEditpart view1Editpart = rootEditPart.getViews().get(0);
		// layout1
		IUiLayoutEditpart layout1Editpart = (IUiLayoutEditpart) view1Editpart.getContent();
		// field1
		IUiFieldEditpart field1Editpart = (IUiFieldEditpart) layout1Editpart.getElements().get(0);
		// view 2
		IUiViewEditpart view2Editpart = rootEditPart.getViews().get(1);
		// layout2
		IUiLayoutEditpart layout2Editpart = (IUiLayoutEditpart) view2Editpart.getContent();
		// field2
		IUiFieldEditpart field2Editpart = (IUiFieldEditpart) layout2Editpart.getElements().get(0);

		// ensure that the eObject of the edit part is the same
		// as the eObject from the ui model
		//
		Assert.assertSame(viewSet, rootEditPart.getModel());
		Assert.assertSame(view1, view1Editpart.getModel());
		Assert.assertSame(layout1, layout1Editpart.getModel());
		Assert.assertSame(field1, field1Editpart.getModel());
		Assert.assertSame(view2, view2Editpart.getModel());
		Assert.assertSame(layout2, layout2Editpart.getModel());
		Assert.assertSame(field2, field2Editpart.getModel());

		// ensure that the editpart can be accessed by its model element
		//
		Assert.assertSame(rootEditPart, UiElementEditpart.findEditPartFor(viewSet));
		Assert.assertSame(view1Editpart, UiElementEditpart.findEditPartFor(view1));
		Assert.assertSame(layout1Editpart, UiElementEditpart.findEditPartFor(layout1));
		Assert.assertSame(field1Editpart, UiElementEditpart.findEditPartFor(field1));
		Assert.assertSame(view2Editpart, UiElementEditpart.findEditPartFor(view2));
		Assert.assertSame(layout2Editpart, UiElementEditpart.findEditPartFor(layout2));
		Assert.assertSame(field2Editpart, UiElementEditpart.findEditPartFor(field2));

		// ensure that the editpartManager also returns the singleton instance
		//
		Assert.assertSame(rootEditPart, editpartManager.getEditpart(viewSet));
		Assert.assertSame(view1Editpart, editpartManager.getEditpart(view1));
		Assert.assertSame(layout1Editpart, editpartManager.getEditpart(layout1));
		Assert.assertSame(field1Editpart, editpartManager.getEditpart(field1));
		Assert.assertSame(view2Editpart, editpartManager.getEditpart(view2));
		Assert.assertSame(layout2Editpart, editpartManager.getEditpart(layout2));
		Assert.assertSame(field2Editpart, editpartManager.getEditpart(field2));
	}

	/**
	 * Tests that only one editpart instance is created for one model instance.<br>
	 * It's the same as {@link #test_SingletonEdipartPerEObjectInstance()} but the editpartManager.getEditpart(object)
	 * first accesses the editpart. Afterwards it is determined by the edit parts parent.
	 */
	@Test
	public void test_SingletonEdipartPerEObjectInstance__FirstAccessByEditpartManager() {
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
		IUiViewSetEditpart rootEditPart = editpartManager.getEditpart(viewSet);
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

		// ensure that the eObject of the edit part is the same
		// as the eObject from the ui model
		//
		Assert.assertSame(viewSet, rootEditPart.getModel());
		Assert.assertSame(view1, view1Editpart.getModel());
		Assert.assertSame(layout1, layout1Editpart.getModel());
		Assert.assertSame(field1, field1Editpart.getModel());
		Assert.assertSame(view2, view2Editpart.getModel());
		Assert.assertSame(layout2, layout2Editpart.getModel());
		Assert.assertSame(field2, field2Editpart.getModel());

		// ensure that the editpart can be accessed by its model element
		//
		Assert.assertSame(rootEditPart, UiElementEditpart.findEditPartFor(viewSet));
		Assert.assertSame(view1Editpart, UiElementEditpart.findEditPartFor(view1));
		Assert.assertSame(layout1Editpart, UiElementEditpart.findEditPartFor(layout1));
		Assert.assertSame(field1Editpart, UiElementEditpart.findEditPartFor(field1));
		Assert.assertSame(view2Editpart, UiElementEditpart.findEditPartFor(view2));
		Assert.assertSame(layout2Editpart, UiElementEditpart.findEditPartFor(layout2));
		Assert.assertSame(field2Editpart, UiElementEditpart.findEditPartFor(field2));

		// ensure that the editpart parents also returns the singleton instance
		//
		Assert.assertSame(rootEditPart, editpartManager.getEditpart(viewSet));
		Assert.assertSame(view1Editpart, rootEditPart.getViews().get(0));
		Assert.assertSame(layout1Editpart, view1Editpart.getContent());
		Assert.assertSame(field1Editpart, layout1Editpart.getElements().get(0));
		Assert.assertSame(view2Editpart, rootEditPart.getViews().get(1));
		Assert.assertSame(layout2Editpart, view2Editpart.getContent());
		Assert.assertSame(field2Editpart, layout2Editpart.getElements().get(0));
	}

	/**
	 * Creates an ui model without the use of an emf model, but afterwards tests whether the emf model was internally
	 * prepared properly. The uri of the orphan elements is {@link IResourceSetManager#ORPHAN_VIEW_RESOURCE_URI}
	 */
	@Test
	public void test_createUiModel_WithoutEMFModel_Instances() {
		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		String selector = "http://eclipse.org/emf/emfclient/uimodel";

		// access the editparts the editpartManager
		//
		// viewSet
		IUiViewSetEditpart viewsetEditPart = editpartManager.createEditpart(selector, IUiViewSetEditpart.class);
		// view1
		IUiViewEditpart view1Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view1Editpart);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager.createEditpart(selector, IUiLayoutEditpart.class);
		view1Editpart.setContent(layout1Editpart);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.createEditpart(selector, IUiFieldEditpart.class);
		layout1Editpart.addElement(field1Editpart);
		// view 2
		IUiViewEditpart view2Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view2Editpart);
		// layout2
		IUiLayoutEditpart layout2Editpart = editpartManager.createEditpart(selector, IUiLayoutEditpart.class);
		view2Editpart.setContent(layout2Editpart);
		// field2
		IUiFieldEditpart field2Editpart = editpartManager.createEditpart(selector, IUiFieldEditpart.class);
		layout2Editpart.addElement(field2Editpart);

		YUiViewSet viewSet = (YUiViewSet) viewsetEditPart.getModel();
		YUiView view1 = (YUiView) view1Editpart.getModel();
		YUiLayout layout1 = (YUiLayout) layout1Editpart.getModel();
		YUiField field1 = (YUiField) field1Editpart.getModel();
		YUiView view2 = (YUiView) view2Editpart.getModel();
		YUiLayout layout2 = (YUiLayout) layout2Editpart.getModel();
		YUiField field2 = (YUiField) field2Editpart.getModel();

		// ensure that the eObject of the edit part is the same
		// as the eObject from the ui model
		//
		Assert.assertSame(viewSet, viewsetEditPart.getModel());
		Assert.assertSame(view1, view1Editpart.getModel());
		Assert.assertSame(layout1, layout1Editpart.getModel());
		Assert.assertSame(field1, field1Editpart.getModel());
		Assert.assertSame(view2, view2Editpart.getModel());
		Assert.assertSame(layout2, layout2Editpart.getModel());
		Assert.assertSame(field2, field2Editpart.getModel());

		// TODO should views added to a orphan resource?
		// // test the uris of the model elements
		// //
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING, viewSet.eResource().getURI()
		// .toString());
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING,
		// view1.eResource().getURI().toString());
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING, layout1.eResource().getURI()
		// .toString());
		// Assert
		// .assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING, field1.eResource().getURI().toString());
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING,
		// view2.eResource().getURI().toString());
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING, layout2.eResource().getURI()
		// .toString());
		// Assert
		// .assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING, field2.eResource().getURI().toString());

		// ensure that the editpart can be accessed by its model element
		//
		Assert.assertSame(viewsetEditPart, UiElementEditpart.findEditPartFor(viewSet));
		Assert.assertSame(view1Editpart, UiElementEditpart.findEditPartFor(view1));
		Assert.assertSame(layout1Editpart, UiElementEditpart.findEditPartFor(layout1));
		Assert.assertSame(field1Editpart, UiElementEditpart.findEditPartFor(field1));
		Assert.assertSame(view2Editpart, UiElementEditpart.findEditPartFor(view2));
		Assert.assertSame(layout2Editpart, UiElementEditpart.findEditPartFor(layout2));
		Assert.assertSame(field2Editpart, UiElementEditpart.findEditPartFor(field2));

		// ensure that the editpartManager also returns the singleton instance
		//
		Assert.assertSame(viewsetEditPart, editpartManager.getEditpart(viewSet));
		Assert.assertSame(view1Editpart, editpartManager.getEditpart(view1));
		Assert.assertSame(layout1Editpart, editpartManager.getEditpart(layout1));
		Assert.assertSame(field1Editpart, editpartManager.getEditpart(field1));
		Assert.assertSame(view2Editpart, editpartManager.getEditpart(view2));
		Assert.assertSame(layout2Editpart, editpartManager.getEditpart(layout2));
		Assert.assertSame(field2Editpart, editpartManager.getEditpart(field2));

		// ensure model structure
		//
		// viewSet
		Assert.assertSame(viewSet, view1.getRoot());
		Assert.assertSame(view1, viewSet.getViews().get(0));
		Assert.assertSame(viewSet, view2.getRoot());
		Assert.assertSame(view2, viewSet.getViews().get(1));

		// view1
		Assert.assertNull(layout1.getParent());
		Assert.assertSame(view1, layout1.getView());
		Assert.assertSame(layout1, view1.getContent());

		// layout1
		Assert.assertSame(layout1, field1.getParent());
		Assert.assertSame(view1, layout1.getView());
		Assert.assertSame(field1, layout1.getElements().get(0));

		// view2
		Assert.assertNull(layout2.getParent());
		Assert.assertSame(view2, layout2.getView());
		Assert.assertSame(layout2, view2.getContent());

		// layout2
		Assert.assertSame(layout2, field2.getParent());
		Assert.assertSame(view2, layout2.getView());
		Assert.assertSame(field2, layout2.getElements().get(0));
	}

	@Test
	public void test_getParent_WithEMFModel() {
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

		// access the editparts from their parents
		//
		// viewSet
		IUiViewSetEditpart viewSetEditPart = editpartManager.getEditpart(viewSet);
		// view1
		IUiViewEditpart view1Editpart = viewSetEditPart.getViews().get(0);
		// layout1
		IUiLayoutEditpart layout1Editpart = (IUiLayoutEditpart) view1Editpart.getContent();
		// field1
		IUiFieldEditpart field1Editpart = (IUiFieldEditpart) layout1Editpart.getElements().get(0);
		// view 2
		IUiViewEditpart view2Editpart = viewSetEditPart.getViews().get(1);
		// layout2
		IUiLayoutEditpart layout2Editpart = (IUiLayoutEditpart) view2Editpart.getContent();
		// field2
		IUiFieldEditpart field2Editpart = (IUiFieldEditpart) layout2Editpart.getElements().get(0);

		// ensure that the eObject of the edit part is the same
		// as the eObject from the ui model
		//
		Assert.assertNull(layout1Editpart.getParent());
		Assert.assertSame(layout1Editpart, field1Editpart.getParent());
		Assert.assertNull(layout2Editpart.getParent());
		Assert.assertSame(layout2Editpart, field2Editpart.getParent());

		// check the parents of the emf model
		//
		Assert.assertNull(layout1.getParent());
		Assert.assertSame(layout1, field1.getParent());
		Assert.assertNull(layout2.getParent());
		Assert.assertSame(layout2, field2.getParent());
	}

	@Test
	public void test_getParent_WithoutEMFModel() {

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		String selector = "http://eclipse.org/emf/emfclient/uimodel";

		// access the editparts the editpartManager
		//
		// viewSet
		IUiViewSetEditpart viewsetEditPart = editpartManager.createEditpart(selector, IUiViewSetEditpart.class);
		// view1
		IUiViewEditpart view1Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view1Editpart);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager.createEditpart(selector, IUiLayoutEditpart.class);
		view1Editpart.setContent(layout1Editpart);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.createEditpart(selector, IUiFieldEditpart.class);
		layout1Editpart.addElement(field1Editpart);
		// view 2
		IUiViewEditpart view2Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view2Editpart);
		// layout2
		IUiLayoutEditpart layout2Editpart = editpartManager.createEditpart(selector, IUiLayoutEditpart.class);
		view2Editpart.setContent(layout2Editpart);
		// field2
		IUiFieldEditpart field2Editpart = editpartManager.createEditpart(selector, IUiFieldEditpart.class);
		layout2Editpart.addElement(field2Editpart);

		// check the parents of the edit parts
		//
		Assert.assertNull(layout1Editpart.getParent());
		Assert.assertSame(layout1Editpart, field1Editpart.getParent());
		Assert.assertNull(layout2Editpart.getParent());
		Assert.assertSame(layout2Editpart, field2Editpart.getParent());

		YUiLayout layout1 = (YUiLayout) layout1Editpart.getModel();
		YUiField field1 = (YUiField) field1Editpart.getModel();
		YUiLayout layout2 = (YUiLayout) layout2Editpart.getModel();
		YUiField field2 = (YUiField) field2Editpart.getModel();

		// check the parents of the emf model
		//
		Assert.assertNull(layout1.getParent());
		Assert.assertSame(layout1, field1.getParent());
		Assert.assertNull(layout2.getParent());
		Assert.assertSame(layout2, field2.getParent());
	}

	@Test
	public void test_getView_WithEMFModel() {
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

		// access the editparts from their parents
		//
		// viewSet
		IUiViewSetEditpart viewSetEditPart = editpartManager.getEditpart(viewSet);
		// view1
		IUiViewEditpart view1Editpart = viewSetEditPart.getViews().get(0);
		// layout1
		IUiLayoutEditpart layout1Editpart = (IUiLayoutEditpart) view1Editpart.getContent();
		// field1
		IUiFieldEditpart field1Editpart = (IUiFieldEditpart) layout1Editpart.getElements().get(0);
		// view 2
		IUiViewEditpart view2Editpart = viewSetEditPart.getViews().get(1);
		// layout2
		IUiLayoutEditpart layout2Editpart = (IUiLayoutEditpart) view2Editpart.getContent();
		// field2
		IUiFieldEditpart field2Editpart = (IUiFieldEditpart) layout2Editpart.getElements().get(0);

		// checks that all the edit parts are returning the proper view
		//
		Assert.assertSame(view1Editpart, layout1Editpart.getView());
		Assert.assertSame(view1Editpart, field1Editpart.getView());
		Assert.assertSame(view2Editpart, layout2Editpart.getView());
		Assert.assertSame(view2Editpart, field2Editpart.getView());

		// checks that all the model elements are returning the proper view
		//
		Assert.assertSame(view1, layout1.getView());
		Assert.assertSame(view1, field1.getView());
		Assert.assertSame(view2, layout2.getView());
		Assert.assertSame(view2, field2.getView());
	}

	@Test
	public void test_getView_WithoutEMFModel() {

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		String selector = "http://eclipse.org/emf/emfclient/uimodel";

		// access the editparts the editpartManager
		//
		// viewSet
		IUiViewSetEditpart viewsetEditPart = editpartManager.createEditpart(selector, IUiViewSetEditpart.class);
		// view1
		IUiViewEditpart view1Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view1Editpart);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager.createEditpart(selector, IUiLayoutEditpart.class);
		view1Editpart.setContent(layout1Editpart);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.createEditpart(selector, IUiFieldEditpart.class);
		layout1Editpart.addElement(field1Editpart);
		// view 2
		IUiViewEditpart view2Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view2Editpart);
		// layout2
		IUiLayoutEditpart layout2Editpart = editpartManager.createEditpart(selector, IUiLayoutEditpart.class);
		view2Editpart.setContent(layout2Editpart);
		// field2
		IUiFieldEditpart field2Editpart = editpartManager.createEditpart(selector, IUiFieldEditpart.class);
		layout2Editpart.addElement(field2Editpart);

		// checks that all the edit parts are returning the proper view
		//
		Assert.assertSame(view1Editpart, layout1Editpart.getView());
		Assert.assertSame(view1Editpart, field1Editpart.getView());
		Assert.assertSame(view2Editpart, layout2Editpart.getView());
		Assert.assertSame(view2Editpart, field2Editpart.getView());

		YUiView view1 = (YUiView) view1Editpart.getModel();
		YUiLayout layout1 = (YUiLayout) layout1Editpart.getModel();
		YUiField field1 = (YUiField) field1Editpart.getModel();
		YUiView view2 = (YUiView) view2Editpart.getModel();
		YUiLayout layout2 = (YUiLayout) layout2Editpart.getModel();
		YUiField field2 = (YUiField) field2Editpart.getModel();

		// checks that all the model elements are returning the proper view
		//
		Assert.assertSame(view1, layout1.getView());
		Assert.assertSame(view1, field1.getView());
		Assert.assertSame(view2, layout2.getView());
		Assert.assertSame(view2, field2.getView());
	}

	/**
	 * Tests that only one editpart instance is created for one model instance.<br>
	 * It's the same as {@link #test_SingletonEdipartPerEObjectInstance()} but the editpartManager.getEditpart(object)
	 * first accesses the editpart. Afterwards it is determined by the edit parts parent.
	 */
	@Test
	public void test_ExtensionModel() {
		YUiTextField textField = UimodelExtensionFactory.eINSTANCE.createYUiTextField();

		// access the editparts the editpartManager
		//
		// viewSet
		IUiTextFieldEditpart textEditPart = editpartManager.getEditpart(textField);

		// ensure that the eObject of the edit part is the same
		// as the eObject from the ui model
		//
		Assert.assertSame(textField, textEditPart.getModel());

		// ensure that the editpart can be accessed by its model element
		//
		Assert.assertSame(textEditPart, UiElementEditpart.findEditPartFor(textField));

		// ensure that the editpart parents also returns the singleton instance
		//
		Assert.assertSame(textEditPart, editpartManager.getEditpart(textField));
	}

	/**
	 * Creates an ui model without the use of an emf model, but afterwards tests whether the emf model was internally
	 * prepared properly. The uri of the orphan elements is {@link IResourceSetManager#ORPHAN_VIEW_RESOURCE_URI}
	 */
	@Test
	public void test_ExtensionModel_createUiModel_WithoutEMFModel_Instances() {
		// textField
		String selector = UimodelExtensionPackage.eNS_URI;

		// access the editparts the editpartManager
		//
		// viewSet
		IUiFieldEditpart textFieldEditPart = editpartManager.createEditpart(selector, IUiTextFieldEditpart.class);
		YUiTextField yTextField = (YUiTextField) textFieldEditPart.getModel();

		// ensure that the eObject of the edit part is the same
		// as the eObject from the ui model
		//
		Assert.assertSame(yTextField, textFieldEditPart.getModel());

		// TODO should views be added to an orphan resource?
		// // test the uris of the model elements
		// //
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING, yTextField.eResource().getURI()
		// .toString());

		// ensure that the editpart can be accessed by its model element
		//
		Assert.assertSame(textFieldEditPart, UiElementEditpart.findEditPartFor(yTextField));

		// ensure that the editpartManager also returns the singleton instance
		//
		Assert.assertSame(textFieldEditPart, editpartManager.getEditpart(yTextField));
	}
}
