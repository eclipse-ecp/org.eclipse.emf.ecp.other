/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.uimodel.core.tests.editparts.emf;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Map;
import java.util.Set;

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
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.beans.IValueBean;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ContextException;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.IViewSetContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.common.IResourceManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.UiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiTextFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the common editparts issues.
 */
@SuppressWarnings("restriction")
public class EditpartsTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager
			.getInstance();
	private ResourceSetImpl resourceSet;
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;

	/**
	 * Setup the test.
	 */
	@Before
	public void setup() {
		resourceSet = new ResourceSetImpl();
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(UiModelPackage.eNS_URI,
				UiModelPackage.eINSTANCE);

		editpartManager.clear();
		editpartManager
				.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager());
		editpartManager
				.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl.EditpartManager());
	}

	/**
	 * Tests that only one editpart instance is created for one model instance.<br>
	 * Note that the editpartManager.getEditpart() was used.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_SingletonEdipartPerEObjectInstance__FirstAccessByParentEditpart() {
		// END SUPRESS CATCH EXCEPTION
		Resource resource = resourceSet.createResource(URI
				.createURI("http://eclipse.org/emf/emfclient/uimodel"));
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
		viewSet.getViews().add(view1);
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);

		YUiView view2 = modelFactory.createYUiView();
		viewSet.getViews().add(view2);
		YUiLayout layout2 = modelFactory.createYUiLayout();
		view2.setContent(layout2);
		YUiField field2 = modelFactory.createYUiField();
		layout2.getElements().add(field2);

		// access the editparts from their parents
		//
		// viewSet
		IUiViewSetEditpart viewSetEditPart = editpartManager
				.getEditpart(viewSet);
		// view1
		IUiViewEditpart view1Editpart = viewSetEditPart.getViews().get(0);
		// layout1
		IUiLayoutEditpart layout1Editpart = (IUiLayoutEditpart) view1Editpart
				.getContent();
		// field1
		IUiFieldEditpart field1Editpart = (IUiFieldEditpart) layout1Editpart
				.getElements().get(0);
		// view 2
		IUiViewEditpart view2Editpart = viewSetEditPart.getViews().get(1);
		// layout2
		IUiLayoutEditpart layout2Editpart = (IUiLayoutEditpart) view2Editpart
				.getContent();
		// field2
		IUiFieldEditpart field2Editpart = (IUiFieldEditpart) layout2Editpart
				.getElements().get(0);

		// ensure that the eObject of the edit part is the same
		// as the eObject from the ui model
		//
		Assert.assertSame(viewSet, viewSetEditPart.getModel());
		Assert.assertSame(view1, view1Editpart.getModel());
		Assert.assertSame(layout1, layout1Editpart.getModel());
		Assert.assertSame(field1, field1Editpart.getModel());
		Assert.assertSame(view2, view2Editpart.getModel());
		Assert.assertSame(layout2, layout2Editpart.getModel());
		Assert.assertSame(field2, field2Editpart.getModel());

		// ensure that the editpart can be accessed by its model element
		//
		Assert.assertSame(viewSetEditPart,
				UiElementEditpart.findEditPartFor(viewSet));
		Assert.assertSame(view1Editpart,
				UiElementEditpart.findEditPartFor(view1));
		Assert.assertSame(layout1Editpart,
				UiElementEditpart.findEditPartFor(layout1));
		Assert.assertSame(field1Editpart,
				UiElementEditpart.findEditPartFor(field1));
		Assert.assertSame(view2Editpart,
				UiElementEditpart.findEditPartFor(view2));
		Assert.assertSame(layout2Editpart,
				UiElementEditpart.findEditPartFor(layout2));
		Assert.assertSame(field2Editpart,
				UiElementEditpart.findEditPartFor(field2));

		// ensure that the editpartManager also returns the singleton instance
		//
		Assert.assertSame(viewSetEditPart, editpartManager.getEditpart(viewSet));
		Assert.assertSame(view1Editpart, editpartManager.getEditpart(view1));
		Assert.assertSame(layout1Editpart, editpartManager.getEditpart(layout1));
		Assert.assertSame(field1Editpart, editpartManager.getEditpart(field1));
		Assert.assertSame(view2Editpart, editpartManager.getEditpart(view2));
		Assert.assertSame(layout2Editpart, editpartManager.getEditpart(layout2));
		Assert.assertSame(field2Editpart, editpartManager.getEditpart(field2));
	}

	/**
	 * Tests that only one editpart instance is created for one model instance.<br>
	 * It's the same as {@link #test_SingletonEdipartPerEObjectInstance()} but
	 * the editpartManager.getEditpart(object) first accesses the editpart.
	 * Afterwards it is determined by the edit parts parent.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_SingletonEdipartPerEObjectInstance__FirstAccessByEditpartManager() {
		// END SUPRESS CATCH EXCEPTION
		Resource resource = resourceSet.createResource(URI
				.createURI("http://eclipse.org/emf/emfclient/uimodel"));
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
		viewSet.getViews().add(view1);
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);

		YUiView view2 = modelFactory.createYUiView();
		viewSet.getViews().add(view2);
		YUiLayout layout2 = modelFactory.createYUiLayout();
		view2.setContent(layout2);
		YUiField field2 = modelFactory.createYUiField();
		layout2.getElements().add(field2);

		// access the editparts the editpartManager
		//
		// viewSet
		IUiViewSetEditpart viewSetEditPart = editpartManager
				.getEditpart(viewSet);
		// view1
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager
				.getEditpart(layout1);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.getEditpart(field1);
		// view 2
		IUiViewEditpart view2Editpart = editpartManager.getEditpart(view2);
		// layout2
		IUiLayoutEditpart layout2Editpart = editpartManager
				.getEditpart(layout2);
		// field2
		IUiFieldEditpart field2Editpart = editpartManager.getEditpart(field2);

		// ensure that the eObject of the edit part is the same
		// as the eObject from the ui model
		//
		Assert.assertSame(viewSet, viewSetEditPart.getModel());
		Assert.assertSame(view1, view1Editpart.getModel());
		Assert.assertSame(layout1, layout1Editpart.getModel());
		Assert.assertSame(field1, field1Editpart.getModel());
		Assert.assertSame(view2, view2Editpart.getModel());
		Assert.assertSame(layout2, layout2Editpart.getModel());
		Assert.assertSame(field2, field2Editpart.getModel());

		// ensure that the editpart can be accessed by its model element
		//
		Assert.assertSame(viewSetEditPart,
				UiElementEditpart.findEditPartFor(viewSet));
		Assert.assertSame(view1Editpart,
				UiElementEditpart.findEditPartFor(view1));
		Assert.assertSame(layout1Editpart,
				UiElementEditpart.findEditPartFor(layout1));
		Assert.assertSame(field1Editpart,
				UiElementEditpart.findEditPartFor(field1));
		Assert.assertSame(view2Editpart,
				UiElementEditpart.findEditPartFor(view2));
		Assert.assertSame(layout2Editpart,
				UiElementEditpart.findEditPartFor(layout2));
		Assert.assertSame(field2Editpart,
				UiElementEditpart.findEditPartFor(field2));

		// ensure that the editpart parents also returns the singleton instance
		//
		Assert.assertSame(viewSetEditPart, editpartManager.getEditpart(viewSet));
		Assert.assertSame(view1Editpart, viewSetEditPart.getViews().get(0));
		Assert.assertSame(layout1Editpart, view1Editpart.getContent());
		Assert.assertSame(field1Editpart, layout1Editpart.getElements().get(0));
		Assert.assertSame(view2Editpart, viewSetEditPart.getViews().get(1));
		Assert.assertSame(layout2Editpart, view2Editpart.getContent());
		Assert.assertSame(field2Editpart, layout2Editpart.getElements().get(0));
	}

	/**
	 * Creates an ui model without the use of an emf model, but afterwards tests
	 * whether the emf model was internally prepared properly. The uri of the
	 * orphan elements is {@link IResourceManager#ORPHAN_VIEW_RESOURCE_URI}
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_createUiModel_WithoutEMFModel_Instances() {
		// END SUPRESS CATCH EXCEPTION
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
		IUiViewSetEditpart viewsetEditPart = editpartManager.createEditpart(
				selector, IUiViewSetEditpart.class);
		// view1
		IUiViewEditpart view1Editpart = editpartManager.createEditpart(
				selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view1Editpart);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager.createEditpart(
				selector, IUiLayoutEditpart.class);
		view1Editpart.setContent(layout1Editpart);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.createEditpart(
				selector, IUiFieldEditpart.class);
		layout1Editpart.addElement(field1Editpart);
		// view 2
		IUiViewEditpart view2Editpart = editpartManager.createEditpart(
				selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view2Editpart);
		// layout2
		IUiLayoutEditpart layout2Editpart = editpartManager.createEditpart(
				selector, IUiLayoutEditpart.class);
		view2Editpart.setContent(layout2Editpart);
		// field2
		IUiFieldEditpart field2Editpart = editpartManager.createEditpart(
				selector, IUiFieldEditpart.class);
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
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING,
		// viewSet.eResource().getURI()
		// .toString());
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING,
		// view1.eResource().getURI().toString());
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING,
		// layout1.eResource().getURI()
		// .toString());
		// Assert
		// .assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING,
		// field1.eResource().getURI().toString());
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING,
		// view2.eResource().getURI().toString());
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING,
		// layout2.eResource().getURI()
		// .toString());
		// Assert
		// .assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING,
		// field2.eResource().getURI().toString());

		// ensure that the editpart can be accessed by its model element
		//
		Assert.assertSame(viewsetEditPart,
				UiElementEditpart.findEditPartFor(viewSet));
		Assert.assertSame(view1Editpart,
				UiElementEditpart.findEditPartFor(view1));
		Assert.assertSame(layout1Editpart,
				UiElementEditpart.findEditPartFor(layout1));
		Assert.assertSame(field1Editpart,
				UiElementEditpart.findEditPartFor(field1));
		Assert.assertSame(view2Editpart,
				UiElementEditpart.findEditPartFor(view2));
		Assert.assertSame(layout2Editpart,
				UiElementEditpart.findEditPartFor(layout2));
		Assert.assertSame(field2Editpart,
				UiElementEditpart.findEditPartFor(field2));

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

	/**
	 * Test the getParent method by emf model.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getParent_WithEMFModel() {
		// END SUPRESS CATCH EXCEPTION
		Resource resource = resourceSet.createResource(URI
				.createURI("http://eclipse.org/emf/emfclient/uimodel"));
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
		viewSet.getViews().add(view1);
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);

		YUiView view2 = modelFactory.createYUiView();
		viewSet.getViews().add(view2);
		YUiLayout layout2 = modelFactory.createYUiLayout();
		view2.setContent(layout2);
		YUiField field2 = modelFactory.createYUiField();
		layout2.getElements().add(field2);

		// access the editparts from their parents
		//
		// viewSet
		IUiViewSetEditpart viewSetEditPart = editpartManager
				.getEditpart(viewSet);
		// view1
		IUiViewEditpart view1Editpart = viewSetEditPart.getViews().get(0);
		// layout1
		IUiLayoutEditpart layout1Editpart = (IUiLayoutEditpart) view1Editpart
				.getContent();
		// field1
		IUiFieldEditpart field1Editpart = (IUiFieldEditpart) layout1Editpart
				.getElements().get(0);
		// view 2
		IUiViewEditpart view2Editpart = viewSetEditPart.getViews().get(1);
		// layout2
		IUiLayoutEditpart layout2Editpart = (IUiLayoutEditpart) view2Editpart
				.getContent();
		// field2
		IUiFieldEditpart field2Editpart = (IUiFieldEditpart) layout2Editpart
				.getElements().get(0);

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

	// BEGIN SUPRESS CATCH EXCEPTION
	@Test
	public void test_getParent_WithoutEMFModel() {
		// END SUPRESS CATCH EXCEPTION

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
		IUiViewSetEditpart viewsetEditPart = editpartManager.createEditpart(
				selector, IUiViewSetEditpart.class);
		// view1
		IUiViewEditpart view1Editpart = editpartManager.createEditpart(
				selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view1Editpart);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager.createEditpart(
				selector, IUiLayoutEditpart.class);
		view1Editpart.setContent(layout1Editpart);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.createEditpart(
				selector, IUiFieldEditpart.class);
		layout1Editpart.addElement(field1Editpart);
		// view 2
		IUiViewEditpart view2Editpart = editpartManager.createEditpart(
				selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view2Editpart);
		// layout2
		IUiLayoutEditpart layout2Editpart = editpartManager.createEditpart(
				selector, IUiLayoutEditpart.class);
		view2Editpart.setContent(layout2Editpart);
		// field2
		IUiFieldEditpart field2Editpart = editpartManager.createEditpart(
				selector, IUiFieldEditpart.class);
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

	// BEGIN SUPRESS CATCH EXCEPTION
	@Test
	public void test_getView_WithEMFModel() {
		// END SUPRESS CATCH EXCEPTION
		Resource resource = resourceSet.createResource(URI
				.createURI("http://eclipse.org/emf/emfclient/uimodel"));
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
		viewSet.getViews().add(view1);
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);

		YUiView view2 = modelFactory.createYUiView();
		viewSet.getViews().add(view2);
		YUiLayout layout2 = modelFactory.createYUiLayout();
		view2.setContent(layout2);
		YUiField field2 = modelFactory.createYUiField();
		layout2.getElements().add(field2);

		// access the editparts from their parents
		//
		// viewSet
		IUiViewSetEditpart viewSetEditPart = editpartManager
				.getEditpart(viewSet);
		// view1
		IUiViewEditpart view1Editpart = viewSetEditPart.getViews().get(0);
		// layout1
		IUiLayoutEditpart layout1Editpart = (IUiLayoutEditpart) view1Editpart
				.getContent();
		// field1
		IUiFieldEditpart field1Editpart = (IUiFieldEditpart) layout1Editpart
				.getElements().get(0);
		// view 2
		IUiViewEditpart view2Editpart = viewSetEditPart.getViews().get(1);
		// layout2
		IUiLayoutEditpart layout2Editpart = (IUiLayoutEditpart) view2Editpart
				.getContent();
		// field2
		IUiFieldEditpart field2Editpart = (IUiFieldEditpart) layout2Editpart
				.getElements().get(0);

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

	// BEGIN SUPRESS CATCH EXCEPTION
	@Test
	public void test_getView_WithoutEMFModel() {
		// END SUPRESS CATCH EXCEPTION

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
		IUiViewSetEditpart viewsetEditPart = editpartManager.createEditpart(
				selector, IUiViewSetEditpart.class);
		// view1
		IUiViewEditpart view1Editpart = editpartManager.createEditpart(
				selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view1Editpart);
		// layout1
		IUiLayoutEditpart layout1Editpart = editpartManager.createEditpart(
				selector, IUiLayoutEditpart.class);
		view1Editpart.setContent(layout1Editpart);
		// field1
		IUiFieldEditpart field1Editpart = editpartManager.createEditpart(
				selector, IUiFieldEditpart.class);
		layout1Editpart.addElement(field1Editpart);
		// view 2
		IUiViewEditpart view2Editpart = editpartManager.createEditpart(
				selector, IUiViewEditpart.class);
		viewsetEditPart.addView(view2Editpart);
		// layout2
		IUiLayoutEditpart layout2Editpart = editpartManager.createEditpart(
				selector, IUiLayoutEditpart.class);
		view2Editpart.setContent(layout2Editpart);
		// field2
		IUiFieldEditpart field2Editpart = editpartManager.createEditpart(
				selector, IUiFieldEditpart.class);
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
	 * It's the same as {@link #test_SingletonEdipartPerEObjectInstance()} but
	 * the editpartManager.getEditpart(object) first accesses the editpart.
	 * Afterwards it is determined by the edit parts parent.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	@Test
	public void test_ExtensionModel() {
		// END SUPRESS CATCH EXCEPTION
		YUiTextField textField = UimodelExtensionFactory.eINSTANCE
				.createYUiTextField();

		// access the editparts the editpartManager
		//
		// viewSet
		IUiEmbeddableEditpart textEditPart = editpartManager
				.getEditpart(textField);

		// ensure that the eObject of the edit part is the same
		// as the eObject from the ui model
		//
		Assert.assertSame(textField, textEditPart.getModel());

		// ensure that the editpart can be accessed by its model element
		//
		Assert.assertSame(textEditPart,
				UiElementEditpart.findEditPartFor(textField));

		// ensure that the editpart parents also returns the singleton instance
		//
		Assert.assertSame(textEditPart, editpartManager.getEditpart(textField));
	}

	/**
	 * Creates an ui model without the use of an emf model, but afterwards tests
	 * whether the emf model was internally prepared properly. The uri of the
	 * orphan elements is {@link IResourceManager#ORPHAN_VIEW_RESOURCE_URI}.
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	@Test
	public void test_ExtensionModel_createUiModel_WithoutEMFModel_Instances() {
		// END SUPRESS CATCH EXCEPTION
		// textField
		String selector = UimodelExtensionPackage.eNS_URI;

		// access the editparts the editpartManager
		//
		// viewSet
		IUiFieldEditpart textFieldEditPart = editpartManager.createEditpart(
				selector, IUiTextFieldEditpart.class);
		YUiTextField yTextField = (YUiTextField) textFieldEditPart.getModel();

		// ensure that the eObject of the edit part is the same
		// as the eObject from the ui model
		//
		Assert.assertSame(yTextField, textFieldEditPart.getModel());

		// TODO should views be added to an orphan resource?
		// // test the uris of the model elements
		// //
		// Assert.assertEquals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING,
		// yTextField.eResource().getURI()
		// .toString());

		// ensure that the editpart can be accessed by its model element
		//
		Assert.assertSame(textFieldEditPart,
				UiElementEditpart.findEditPartFor(yTextField));

		// ensure that the editpartManager also returns the singleton instance
		//
		Assert.assertSame(textFieldEditPart,
				editpartManager.getEditpart(yTextField));
	}

	// BEGIN SUPRESS CATCH EXCEPTION
	@Test
	public void test_ID() {
		// END SUPRESS CATCH EXCEPTION
		// Start with an empty id and let the edit part create one
		//
		final YUiLayout yLayout = modelFactory.createYUiLayout();
		Assert.assertNull(yLayout.getId());
		final IUiLayoutEditpart layoutEditPart = editpartManager
				.getEditpart(yLayout);
		Assert.assertEquals(yLayout.getId(), layoutEditPart.getId());
		Assert.assertNotNull(yLayout.getId());

		try {
			yLayout.setId("MyId");
			Assert.fail("Exception must be thrown!");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		// Start with an given id
		//
		final YUiLayout yLayout2 = modelFactory.createYUiLayout();
		yLayout2.setId("Huhuhu");
		final IUiLayoutEditpart layoutEditPart2 = editpartManager
				.getEditpart(yLayout2);
		Assert.assertEquals(yLayout2.getId(), layoutEditPart2.getId());
		Assert.assertEquals("Huhuhu", yLayout2.getId());

		try {
			yLayout2.setId("MyId");
			Assert.fail("Exception must be thrown!");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}

		// Create an edit part without an model element
		//
		final IUiLayoutEditpart layoutEditPart3 = editpartManager
				.createEditpart(UiModelPackage.eNS_URI, IUiLayoutEditpart.class);
		final YUiLayout yLayout3 = (YUiLayout) layoutEditPart3.getModel();
		Assert.assertEquals(yLayout3.getId(), layoutEditPart3.getId());
		Assert.assertNotNull(yLayout3.getId());

		try {
			yLayout3.setId("MyId");
			Assert.fail("Exception must be thrown!");
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
		}
	}

	/**
	 * Tests the disposal of edit parts.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_Dispose_Containements() {
		// END SUPRESS CATCH EXCEPTION
		Resource resource = resourceSet.createResource(URI
				.createURI("http://eclipse.org/emf/emfclient/uimodel"));
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
		viewSet.getViews().add(view1);
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		YUiField field1 = modelFactory.createYUiField();
		layout1.getElements().add(field1);

		YUiView view2 = modelFactory.createYUiView();
		viewSet.getViews().add(view2);
		YUiLayout layout2 = modelFactory.createYUiLayout();
		view2.setContent(layout2);
		YUiField field2 = modelFactory.createYUiField();
		layout2.getElements().add(field2);

		// access the editparts the editpartManager
		//
		IUiViewSetEditpart viewSetEditPart = editpartManager
				.getEditpart(viewSet);
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IUiLayoutEditpart layout1Editpart = editpartManager
				.getEditpart(layout1);
		IUiFieldEditpart field1Editpart = editpartManager.getEditpart(field1);
		IUiViewEditpart view2Editpart = editpartManager.getEditpart(view2);
		IUiLayoutEditpart layout2Editpart = editpartManager
				.getEditpart(layout2);
		IUiFieldEditpart field2Editpart = editpartManager.getEditpart(field2);

		Assert.assertFalse(viewSetEditPart.isDisposed());
		Assert.assertFalse(view1Editpart.isDisposed());
		Assert.assertFalse(layout1Editpart.isDisposed());
		Assert.assertFalse(field1Editpart.isDisposed());
		Assert.assertFalse(view2Editpart.isDisposed());
		Assert.assertFalse(layout2Editpart.isDisposed());
		Assert.assertFalse(field2Editpart.isDisposed());

		// dispose the root and all contained edit parts will be disposed too
		//
		viewSetEditPart.dispose();

		Assert.assertTrue(viewSetEditPart.isDisposed());
		Assert.assertTrue(view1Editpart.isDisposed());
		Assert.assertTrue(layout1Editpart.isDisposed());
		Assert.assertTrue(field1Editpart.isDisposed());
		Assert.assertTrue(view2Editpart.isDisposed());
		Assert.assertTrue(layout2Editpart.isDisposed());
		Assert.assertTrue(field2Editpart.isDisposed());
	}

	/**
	 * Tests the disposal of edit parts.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_UiViewSetEditPart_views() {
		// END SUPRESS CATCH EXCEPTION
		YUiViewSet viewSet = modelFactory.createYUiViewSet();
		// viewSet
		// ...> view1
		// ...> view2
		YUiView view1 = modelFactory.createYUiView();
		viewSet.getViews().add(view1);

		YUiView view2 = modelFactory.createYUiView();
		viewSet.getViews().add(view2);

		// access the editparts the editpartManager
		//
		IUiViewSetEditpart viewSetEditPart = editpartManager
				.getEditpart(viewSet);

		Assert.assertEquals(2, viewSetEditPart.getViews().size());
		Assert.assertEquals(viewSet.getViews().size(), viewSetEditPart
				.getViews().size());

		// add 3rd view by model
		YUiView view3 = modelFactory.createYUiView();
		viewSet.getViews().add(view3);
		Assert.assertEquals(3, viewSetEditPart.getViews().size());
		Assert.assertEquals(viewSet.getViews().size(), viewSetEditPart
				.getViews().size());

		// add 4th view by edit part
		IUiViewEditpart view4Editpart = editpartManager.createEditpart(
				UiModelPackage.eNS_URI, IUiViewEditpart.class);
		viewSetEditPart.addView(view4Editpart);
		Assert.assertEquals(4, viewSetEditPart.getViews().size());
		Assert.assertEquals(viewSet.getViews().size(), viewSetEditPart
				.getViews().size());

		// remove 3rd view by model
		viewSet.getViews().remove(view3);
		Assert.assertEquals(3, viewSetEditPart.getViews().size());
		Assert.assertEquals(viewSet.getViews().size(), viewSetEditPart
				.getViews().size());

		// remove 4rd view by edit part
		viewSetEditPart.removeView(view4Editpart);
		Assert.assertEquals(2, viewSetEditPart.getViews().size());
		Assert.assertEquals(viewSet.getViews().size(), viewSetEditPart
				.getViews().size());
	}

	/**
	 * Tests the disposal of edit parts.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_UiViewEditPart_content() {
		// END SUPRESS CATCH EXCEPTION
		// view
		// ...> layout1
		YUiView view = modelFactory.createYUiView();
		IUiViewEditpart viewEditPart = editpartManager.getEditpart(view);
		NotificationObserver observer = new NotificationObserver(
				IUiViewEditpart.PROP_CONTENT, viewEditPart);

		Assert.assertNull(view.getContent());
		Assert.assertNull(viewEditPart.getContent());

		// set layout by model
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view.setContent(layout1);
		Assert.assertSame(layout1, view.getContent());
		Assert.assertSame(editpartManager.getEditpart(layout1),
				viewEditPart.getContent());
		Assert.assertTrue(observer.isCalled());
		Assert.assertNull(observer.getEvent().getOldValue());
		Assert.assertEquals(viewEditPart.getContent(), observer.getEvent()
				.getNewValue());

		// set other layout by edit part
		observer.reset();

		IUiLayoutEditpart layout2Editpart = editpartManager.createEditpart(
				UiModelPackage.eNS_URI, IUiLayoutEditpart.class);
		viewEditPart.setContent(layout2Editpart);
		Assert.assertSame(layout2Editpart.getModel(), view.getContent());
		Assert.assertSame(layout2Editpart, viewEditPart.getContent());
		Assert.assertTrue(observer.isCalled());
		Assert.assertEquals(editpartManager.getEditpart(layout1), observer
				.getEvent().getOldValue());
		Assert.assertEquals(layout2Editpart, observer.getEvent().getNewValue());
	}

	/**
	 * Tests the disposal of edit parts.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_UiLayoutEditPart_elements() {
		// END SUPRESS CATCH EXCEPTION
		YUiLayout rootLayout = modelFactory.createYUiLayout();
		// layout
		// ...> layout1
		// ...> field1
		YUiLayout layout1 = modelFactory.createYUiLayout();
		rootLayout.getElements().add(layout1);

		YUiField field1 = modelFactory.createYUiField();
		rootLayout.getElements().add(field1);

		// access the editparts by the editpartManager
		//
		IUiLayoutEditpart rootLayoutEditPart = editpartManager
				.getEditpart(rootLayout);

		Assert.assertEquals(2, rootLayoutEditPart.getElements().size());
		Assert.assertEquals(rootLayout.getElements().size(), rootLayoutEditPart
				.getElements().size());

		// add 3rd field by model
		YUiField field3 = modelFactory.createYUiField();
		rootLayout.getElements().add(field3);
		Assert.assertEquals(3, rootLayoutEditPart.getElements().size());
		Assert.assertEquals(rootLayout.getElements().size(), rootLayoutEditPart
				.getElements().size());

		// add 4th layout by edit part
		IUiLayoutEditpart layout4Editpart = editpartManager.createEditpart(
				UiModelPackage.eNS_URI, IUiLayoutEditpart.class);
		rootLayoutEditPart.addElement(layout4Editpart);
		Assert.assertEquals(4, rootLayoutEditPart.getElements().size());
		Assert.assertEquals(rootLayout.getElements().size(), rootLayoutEditPart
				.getElements().size());

		// remove 3rd layout by model
		rootLayout.getElements().remove(field3);
		Assert.assertEquals(3, rootLayoutEditPart.getElements().size());
		Assert.assertEquals(rootLayout.getElements().size(), rootLayoutEditPart
				.getElements().size());

		// remove 4rd layout by edit part
		rootLayoutEditPart.removeElement(layout4Editpart);
		Assert.assertEquals(2, rootLayoutEditPart.getElements().size());
		Assert.assertEquals(rootLayout.getElements().size(), rootLayoutEditPart
				.getElements().size());
	}

	/**
	 * Tests the disposal of edit parts.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_NotificationObserver() {
		// END SUPRESS CATCH EXCEPTION
		YUiView view = modelFactory.createYUiView();
		IUiViewEditpart viewEditPart = editpartManager.getEditpart(view);
		NotificationObserver observer = new NotificationObserver(
				IUiViewEditpart.PROP_CONTENT, viewEditPart);
		Assert.assertFalse(observer.isCalled());

		// core test
		//
		observer.reset();
		Assert.assertFalse(observer.isCalled());

		observer.propertyChange(new PropertyChangeEvent(this, "Test", null,
				null));
		Assert.assertTrue(observer.isCalled());

		observer.reset();
		Assert.assertFalse(observer.isCalled());

		// observing test
		//

		// set layout by model
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view.setContent(layout1);
		Assert.assertTrue(observer.isCalled());

		// set other layout by edit part
		observer.reset();
		Assert.assertFalse(observer.isCalled());

		IUiLayoutEditpart layout2Editpart = editpartManager.createEditpart(
				UiModelPackage.eNS_URI, IUiLayoutEditpart.class);
		viewEditPart.setContent(layout2Editpart);
		Assert.assertTrue(observer.isCalled());
	}

	// BEGIN SUPRESS CATCH EXCEPTION
	@Test
	public void test_setContext() {
		// END SUPRESS CATCH EXCEPTION
		// ...........> field2
		YUiView view1 = modelFactory.createYUiView();
		IUiViewEditpart view1EditPart = editpartManager.getEditpart(view1);

		// contexts null
		//
		Assert.assertNull(view1EditPart.getContext());

		// set context 1
		//
		InternalViewContext viewContext1 = new InternalViewContext();
		view1EditPart.setContext(viewContext1);
		Assert.assertSame(viewContext1, view1EditPart.getContext());

		InternalViewContext viewContext2 = new InternalViewContext();
		view1EditPart.setContext(viewContext2);
		Assert.assertSame(viewContext2, view1EditPart.getContext());

		// mark rendered
		//
		viewContext2.rendered = true;

		// set the same instance twice
		//
		view1EditPart.setContext(viewContext2);
		Assert.assertSame(viewContext2, view1EditPart.getContext());

		try {
			// set a new instance
			//
			view1EditPart.setContext(new InternalViewContext());
			Assert.fail();
			// BEGIN SUPRESS CATCH EXCEPTION
		} catch (Exception e) {
			// END SUPRESS CATCH EXCEPTION
			// expected
		}
	}

	/**
	 * A implementation of {@link PropertyChangeListener}.
	 */
	private static class NotificationObserver implements PropertyChangeListener {

		private PropertyChangeEvent event;

		public NotificationObserver(String property, IUiElementEditpart editpart) {
			((UiElementEditpart<?>) editpart).addPropertyChangeListener(
					property, this);
		}

		@Override
		public void propertyChange(PropertyChangeEvent evt) {
			event = evt;
		}

		public boolean isCalled() {
			return event != null;
		}

		public void reset() {
			event = null;
		}

		public PropertyChangeEvent getEvent() {
			return event;
		}
	}

	/**
	 * Internal context for testing.
	 */
	private static class InternalViewContext implements IViewContext {

		private boolean rendered;

		@Override
		public boolean isDisposed() {
			return false;
		}

		@Override
		public void dispose() {
		}

		@Override
		public void addDisposeListener(Listener listener) {
		}

		@Override
		public void removeDisposeListener(Listener listener) {
		}

		@Override
		public String getPresentationURI() {
			return null;
		}

		@Override
		public IUiViewEditpart getViewEditpart() {
			return null;
		}

		@Override
		public IViewSetContext getParentContext() {
			return null;
		}

		@Override
		public IValueBean getBean(String selector) {
			return null;
		}

		@Override
		public void registerBean(String selector, IValueBean bean) {
		}

		@Override
		public Object getRootLayout() {
			return null;
		}

		@Override
		public IValueBean getRootBean() {
			return null;
		}

		@Override
		public void render(String presentationURI, Object rootLayout,
				Map<String, Object> parameter) throws ContextException {

		}

		@Override
		public boolean isRendered() {
			return rendered;
		}

		@Override
		public <S> S getService(String selector) {
			return null;
		}

		@Override
		public void registerService(String selector, Object service) {

		}

		@Override
		public void unregisterService(String selector) {

		}
	}
}
