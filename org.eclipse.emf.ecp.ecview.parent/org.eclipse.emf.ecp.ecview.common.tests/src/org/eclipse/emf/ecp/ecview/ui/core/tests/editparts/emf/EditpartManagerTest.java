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
package org.eclipse.emf.ecp.ecview.ui.core.tests.editparts.emf;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ecview.common.editpart.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpartProvider;
import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewSetEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.EditpartManager;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.core.YLayout;
import org.eclipse.emf.ecp.ecview.common.model.core.YView;
import org.eclipse.emf.ecp.ecview.common.model.core.YViewSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the editpartManager.
 */
@SuppressWarnings("restriction")
public class EditpartManagerTest {

	private EditpartManager editpartManager = new EditpartManager();
	private ResourceSetImpl resourceSet;
	private CoreModelFactory modelFactory = CoreModelFactory.eINSTANCE;

	/**
	 * Casts element to eObject.
	 * 
	 * @param element
	 * @return
	 */
	protected EObject castEObject(Object element) {
		return (EObject) element;
	}

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
		resourceSet.getPackageRegistry().put(CoreModelPackage.eNS_URI,
				CoreModelPackage.eINSTANCE);

		DelegatingEditPartManager manager = DelegatingEditPartManager
				.getInstance();
		manager.clear();
		manager.addDelegate(new org.eclipse.emf.ecp.ecview.common.editpart.emf.EditpartManager());
		manager.addDelegate(new org.eclipse.emf.ecp.ecview.extension.editpart.emf.EditpartManager());
	}

	/**
	 * Tests that the editpart manager always returns the same instance on
	 * calling getInstance().
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getInstance() {
		// END SUPRESS CATCH EXCEPTION
		Resource resource = resourceSet.createResource(URI
				.createURI("http://eclipse.org/emf/emfclient/uimodel"));
		YViewSet viewSet = modelFactory.createYViewSet();
		resource.getContents().add(castEObject(viewSet));

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		YView view1 = modelFactory.createYView();
		resource.getContents().add(castEObject(view1));
		viewSet.getViews().add(view1);
		YLayout layout1 = modelFactory.createYLayout();
		view1.setContent(layout1);
		YField field1 = modelFactory.createYField();
		layout1.getElements().add(field1);

		YView view2 = modelFactory.createYView();
		resource.getContents().add(castEObject(view2));
		viewSet.getViews().add(view2);
		YLayout layout2 = modelFactory.createYLayout();
		view2.setContent(layout2);
		YField field2 = modelFactory.createYField();
		layout2.getElements().add(field2);

		// access the editparts the editpartManager
		//
		// viewSet
		IViewSetEditpart viewsetEditPart = editpartManager.getEditpart(viewSet);
		// view1
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		// layout1
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		// field1
		IFieldEditpart field1Editpart = editpartManager.getEditpart(field1);
		// view 2
		IViewEditpart view2Editpart = editpartManager.getEditpart(view2);
		// layout2
		ILayoutEditpart layout2Editpart = editpartManager.getEditpart(layout2);
		// field2
		IFieldEditpart field2Editpart = editpartManager.getEditpart(field2);

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
	 * Tests that no edit part is created for findEditpart(modelObject).
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_findEditpart() {
		// END SUPRESS CATCH EXCEPTION
		Resource resource = resourceSet.createResource(URI
				.createURI("http://eclipse.org/emf/emfclient/uimodel"));
		YViewSet viewSet = modelFactory.createYViewSet();
		resource.getContents().add(castEObject(viewSet));

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		YView view1 = modelFactory.createYView();
		resource.getContents().add(castEObject(view1));
		viewSet.getViews().add(view1);
		YLayout layout1 = modelFactory.createYLayout();
		view1.setContent(layout1);
		YField field1 = modelFactory.createYField();
		layout1.getElements().add(field1);

		YView view2 = modelFactory.createYView();
		resource.getContents().add(castEObject(view2));
		viewSet.getViews().add(view2);
		YLayout layout2 = modelFactory.createYLayout();
		view2.setContent(layout2);
		YField field2 = modelFactory.createYField();
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
	 * Tests that the findEditpart(modelObject) will find the same instance as
	 * getInstance.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_findEditpart_afterGetEditpart() {
		// END SUPRESS CATCH EXCEPTION
		Resource resource = resourceSet.createResource(URI
				.createURI("http://eclipse.org/emf/emfclient/uimodel"));
		YViewSet viewSet = modelFactory.createYViewSet();
		resource.getContents().add(castEObject(viewSet));

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		YView view1 = modelFactory.createYView();
		resource.getContents().add(castEObject(view1));
		viewSet.getViews().add(view1);
		YLayout layout1 = modelFactory.createYLayout();
		view1.setContent(layout1);
		YField field1 = modelFactory.createYField();
		layout1.getElements().add(field1);

		YView view2 = modelFactory.createYView();
		resource.getContents().add(castEObject(view2));
		viewSet.getViews().add(view2);
		YLayout layout2 = modelFactory.createYLayout();
		view2.setContent(layout2);
		YField field2 = modelFactory.createYField();
		layout2.getElements().add(field2);

		// access the editparts the editpartManager
		//
		// viewSet
		IViewSetEditpart viewsetEditPart = editpartManager.getEditpart(viewSet);
		// view1
		IViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		// layout1
		ILayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		// field1
		IFieldEditpart field1Editpart = editpartManager.getEditpart(field1);
		// view 2
		IViewEditpart view2Editpart = editpartManager.getEditpart(view2);
		// layout2
		ILayoutEditpart layout2Editpart = editpartManager.getEditpart(layout2);
		// field2
		IFieldEditpart field2Editpart = editpartManager.getEditpart(field2);

		// ensure that the editpartManager also finds the singleton instance
		//
		Assert.assertSame(viewsetEditPart,
				editpartManager.findEditpart(viewSet));
		Assert.assertSame(view1Editpart, editpartManager.findEditpart(view1));
		Assert.assertSame(layout1Editpart,
				editpartManager.findEditpart(layout1));
		Assert.assertSame(field1Editpart, editpartManager.findEditpart(field1));
		Assert.assertSame(view2Editpart, editpartManager.findEditpart(view2));
		Assert.assertSame(layout2Editpart,
				editpartManager.findEditpart(layout2));
		Assert.assertSame(field2Editpart, editpartManager.findEditpart(field2));
	}

	/**
	 * Tests that the findEditpart(modelObject) finds the edit part that was
	 * created by createEditpart.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_findEditpart_afterCreateEditpart() {
		// END SUPRESS CATCH EXCEPTION
		String selector = "http://eclipse.org/emf/emfclient/uimodel";

		// access the editparts the editpartManager
		//
		// viewSet
		IViewSetEditpart viewsetEditPart = editpartManager.createEditpart(
				selector, IViewSetEditpart.class);
		// view1
		IViewEditpart view1Editpart = editpartManager.createEditpart(selector,
				IViewEditpart.class);
		// layout1
		ILayoutEditpart layout1Editpart = editpartManager.createEditpart(
				selector, ILayoutEditpart.class);
		// field1
		IFieldEditpart field1Editpart = editpartManager.createEditpart(
				selector, IFieldEditpart.class);
		// view 2
		IViewEditpart view2Editpart = editpartManager.createEditpart(selector,
				IViewEditpart.class);
		// layout2
		ILayoutEditpart layout2Editpart = editpartManager.createEditpart(
				selector, ILayoutEditpart.class);
		// field2
		IFieldEditpart field2Editpart = editpartManager.createEditpart(
				selector, IFieldEditpart.class);

		YViewSet viewSet = (YViewSet) viewsetEditPart.getModel();
		YView view1 = (YView) view1Editpart.getModel();
		YLayout layout1 = (YLayout) layout1Editpart.getModel();
		YField field1 = (YField) field1Editpart.getModel();
		YView view2 = (YView) view2Editpart.getModel();
		YLayout layout2 = (YLayout) layout2Editpart.getModel();
		YField field2 = (YField) field2Editpart.getModel();

		// ensure that the editpartManager also finds the singleton instance
		//
		Assert.assertSame(viewsetEditPart,
				editpartManager.findEditpart(viewSet));
		Assert.assertSame(view1Editpart, editpartManager.findEditpart(view1));
		Assert.assertSame(layout1Editpart,
				editpartManager.findEditpart(layout1));
		Assert.assertSame(field1Editpart, editpartManager.findEditpart(field1));
		Assert.assertSame(view2Editpart, editpartManager.findEditpart(view2));
		Assert.assertSame(layout2Editpart,
				editpartManager.findEditpart(layout2));
		Assert.assertSame(field2Editpart, editpartManager.findEditpart(field2));
	}

	/**
	 * Tests that no ADDITIONAL {@link IElementEditpartProvider} is registered
	 * on the model object for calling getEditpart(modelObject). Just one for
	 * the first create.
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_getInstance_justOneAdapterInstanceRegistered() {
		// END SUPRESS CATCH EXCEPTION
		Resource resource = resourceSet.createResource(URI
				.createURI("http://eclipse.org/emf/emfclient/uimodel"));
		YViewSet viewSet = modelFactory.createYViewSet();
		resource.getContents().add(castEObject(viewSet));

		// viewSet
		// ...> view1
		// ......> layout1
		// ...........> field1
		// ...> view2
		// ......> layout2
		// ...........> field2
		YView view1 = modelFactory.createYView();
		resource.getContents().add(castEObject(view1));
		viewSet.getViews().add(view1);
		YLayout layout1 = modelFactory.createYLayout();
		view1.setContent(layout1);
		YField field1 = modelFactory.createYField();
		layout1.getElements().add(field1);

		YView view2 = modelFactory.createYView();
		resource.getContents().add(castEObject(view2));
		viewSet.getViews().add(view2);
		YLayout layout2 = modelFactory.createYLayout();
		view2.setContent(layout2);
		YField field2 = modelFactory.createYField();
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
	 * Tests that no edit part is created for findEditpart(modelObject).
	 */
	@Test
	// BEGIN SUPRESS CATCH EXCEPTION
	public void test_createEditpart() {
		// END SUPRESS CATCH EXCEPTION
		String selector = "http://eclipse.org/emf/emfclient/uimodel";

		// access the editparts the editpartManager
		//
		// viewSet
		IViewSetEditpart viewsetEditPart = editpartManager.createEditpart(
				selector, IViewSetEditpart.class);
		// view1
		IViewEditpart view1Editpart = editpartManager.createEditpart(selector,
				IViewEditpart.class);
		// layout1
		ILayoutEditpart layout1Editpart = editpartManager.createEditpart(
				selector, ILayoutEditpart.class);
		// field1
		IFieldEditpart field1Editpart = editpartManager.createEditpart(
				selector, IFieldEditpart.class);
		// view 2
		IViewEditpart view2Editpart = editpartManager.createEditpart(selector,
				IViewEditpart.class);
		// layout2
		ILayoutEditpart layout2Editpart = editpartManager.createEditpart(
				selector, ILayoutEditpart.class);
		// field2
		IFieldEditpart field2Editpart = editpartManager.createEditpart(
				selector, IFieldEditpart.class);

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
	 * Asserts that the number of added editpartProvider adapter equals the
	 * given one.
	 * 
	 * @param expectedCount
	 * @param eObject
	 */
	private void assertIUiElementEditpartProviderCount(int expectedCount,
			Object object) {
		int count = 0;
		for (Adapter adapter : castEObject(object).eAdapters()) {
			if (adapter instanceof IElementEditpartProvider) {
				count++;
			}
		}

		Assert.assertEquals(expectedCount, count);
	}
}
