/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.tests.context;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.tests.DefaultRealm;
import org.junit.Before;

public class ViewContextTest {

	private EditpartManager editpartManager = new EditpartManager();
	private ResourceSetImpl resourceSet;
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;

	@Before
	public void setup() {
		DefaultRealm.setup();

		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(UiModelPackage.eNS_URI, UiModelPackage.eINSTANCE);

		DelegatingEditPartManager manager = DelegatingEditPartManager.getInstance();
		manager.addFactory(new EditpartManager());
	}

	// @Test
	// public void test_createByUiModel() {
	// YUiViewSet viewSet = modelFactory.createYUiViewSet();
	//
	// // viewSet
	// // ...> view1
	// // ......> layout1
	// // ...........> field1
	// // ...> view2
	// // ......> layout2
	// // ...........> field2
	// YUiView view1 = modelFactory.createYUiView();
	// viewSet.getViews().add(view1);
	//
	// YUiView view2 = modelFactory.createYUiView();
	// viewSet.getViews().add(view2);
	//
	// // access the editparts the editpartManager
	// //
	// // viewSet
	// IUiViewSetEditpart viewSetEditPart = editpartManager.getEditpart(viewSet);
	// IUiViewEditpart view1EditPart = editpartManager.getEditpart(view1);
	// IUiViewEditpart view2EditPart = editpartManager.getEditpart(view2);
	//
	// Assert.assertNull(viewSetEditPart.getContext());
	// Assert.assertNull(view1EditPart.getContext());
	// Assert.assertNull(view2EditPart.getContext());
	//
	// IViewSetContext viewSetContext = ViewSetContext.create(viewSet);
	// Assert.assertNotNull(viewSetEditPart.getContext());
	// Assert.assertEquals(0, viewSetContext.getViewContexts().size());
	// Assert.assertSame(viewSetEditPart, viewSetContext.getViewSetEditpart());
	//
	// IViewContext viewContext1 = ViewContext.create(view1);
	// Assert.assertNotNull(view1EditPart.getContext());
	// Assert.assertEquals(1, viewSetContext.getViewContexts().size());
	// Assert.assertSame(view1EditPart, viewContext1.getViewEditpart());
	//
	// IViewContext viewContext2 = ViewContext.create(view2);
	// Assert.assertNotNull(view2EditPart.getContext());
	// Assert.assertEquals(2, viewSetContext.getViewContexts().size());
	// Assert.assertSame(view2EditPart, viewContext2.getViewEditpart());
	// }
	//
	// @Test
	// public void test_createByUiModel_FromEditpart() {
	// // viewSet
	// // ...> view1
	// // ......> layout1
	// // ...........> field1
	// // ...> view2
	// // ......> layout2
	// // ...........> field2
	// String selector = "http://eclipse.org/emf/emfclient/uimodel";
	//
	// // access the editparts the editpartManager
	// //
	// // viewSet
	// IUiViewSetEditpart viewsetEditPart = editpartManager.createEditpart(selector, IUiViewSetEditpart.class);
	// // view1
	// IUiViewEditpart view1Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
	// viewsetEditPart.addView(view1Editpart);
	// // view 2
	// IUiViewEditpart view2Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
	// viewsetEditPart.addView(view2Editpart);
	//
	// YUiViewSet viewSet = (YUiViewSet) viewsetEditPart.getModel();
	// YUiView view1 = (YUiView) view1Editpart.getModel();
	// YUiView view2 = (YUiView) view2Editpart.getModel();
	//
	// Assert.assertNull(viewsetEditPart.getContext());
	// Assert.assertNull(view1Editpart.getContext());
	// Assert.assertNull(view2Editpart.getContext());
	//
	// IViewSetContext viewSetContext = ViewSetContext.create(viewSet);
	// Assert.assertNotNull(viewsetEditPart.getContext());
	// Assert.assertEquals(0, viewSetContext.getViewContexts().size());
	// Assert.assertSame(viewsetEditPart, viewSetContext.getViewSetEditpart());
	//
	// IViewContext viewContext1 = ViewContext.create(view1);
	// Assert.assertNotNull(view1Editpart.getContext());
	// Assert.assertEquals(1, viewSetContext.getViewContexts().size());
	// Assert.assertSame(view1Editpart, viewContext1.getViewEditpart());
	//
	// IViewContext viewContext2 = ViewContext.create(view2);
	// Assert.assertNotNull(view2Editpart.getContext());
	// Assert.assertEquals(2, viewSetContext.getViewContexts().size());
	// Assert.assertSame(view2Editpart, viewContext2.getViewEditpart());
	// }
	//
	// @Test
	// public void test_createByEditpart() {
	// // viewSet
	// // ...> view1
	// // ......> layout1
	// // ...........> field1
	// // ...> view2
	// // ......> layout2
	// // ...........> field2
	// String selector = "http://eclipse.org/emf/emfclient/uimodel";
	//
	// // access the editparts the editpartManager
	// //
	// // viewSet
	// IUiViewSetEditpart viewsetEditPart = editpartManager.createEditpart(selector, IUiViewSetEditpart.class);
	// // view1
	// IUiViewEditpart view1Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
	// viewsetEditPart.addView(view1Editpart);
	// // view 2
	// IUiViewEditpart view2Editpart = editpartManager.createEditpart(selector, IUiViewEditpart.class);
	// viewsetEditPart.addView(view2Editpart);
	//
	// Assert.assertNull(viewsetEditPart.getContext());
	// Assert.assertNull(view1Editpart.getContext());
	// Assert.assertNull(view2Editpart.getContext());
	//
	// IViewSetContext viewSetContext = ViewSetContext.create(viewsetEditPart);
	// Assert.assertNotNull(viewsetEditPart.getContext());
	// Assert.assertEquals(0, viewSetContext.getViewContexts().size());
	// Assert.assertSame(viewsetEditPart, viewSetContext.getViewSetEditpart());
	//
	// IViewContext viewContext1 = ViewContext.create(view1Editpart);
	// Assert.assertNotNull(view1Editpart.getContext());
	// Assert.assertEquals(1, viewSetContext.getViewContexts().size());
	// Assert.assertSame(view1Editpart, viewContext1.getViewEditpart());
	//
	// IViewContext viewContext2 = ViewContext.create(view2Editpart);
	// Assert.assertNotNull(view2Editpart.getContext());
	// Assert.assertEquals(2, viewSetContext.getViewContexts().size());
	// Assert.assertSame(view2Editpart, viewContext2.getViewEditpart());
	// }
}
