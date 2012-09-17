package org.eclipse.emf.ecp.ui.uimodel.core.editparts.tests.example.presentation;

import junit.framework.Assert;

import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ContextException;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.DelegatingPresenterFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.tests.emf.DefaultRealm;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.ExampleRenderer;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal.PresenterFactory;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class BuildViewTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager.getInstance();
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;
	private UimodelExtensionFactory extensionFactory = UimodelExtensionFactory.eINSTANCE;

	@Before
	public void setup() {
		DefaultRealm.setup();
		editpartManager.clear();
		editpartManager.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager());
		editpartManager
			.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl.EditpartManager());

		DelegatingPresenterFactory.getInstance().addFactory(new PresenterFactory());
	}

	/**
	 * Tests the build of a simple view without any content
	 */
	@Test
	public void build_View() {
		Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		// ...> yView
		YUiView yView = modelFactory.createYUiView();

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			ExampleRenderer renderer = new ExampleRenderer();
			renderer.render(shell, yView);
		} catch (ContextException e) {
		}

		// assert the created elements
		//
		Control[] childs = shell.getChildren();
		Assert.assertEquals(1, childs.length);

		Composite viewComposite = (Composite) childs[0];
		Assert.assertTrue(viewComposite.getLayout() instanceof FillLayout);

		// viewComposite has no childs
		//
		Assert.assertEquals(0, viewComposite.getChildren().length);

		// dispose the display
		display.dispose();
	}

	@Test
	public void build_ViewWithText() {
		Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		// build the view model
		// ...> yView
		// ......> yText
		YUiView yView = modelFactory.createYUiView();
		YUiTextField yTeyt = extensionFactory.createYUiTextField();
		yView.setContent(yTeyt);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			ExampleRenderer renderer = new ExampleRenderer();
			renderer.render(shell, yView);
		} catch (ContextException e) {
		}

		// assert the created elements
		//
		Control[] childs = shell.getChildren();
		Assert.assertEquals(1, childs.length);

		Composite viewComposite = (Composite) childs[0];
		Assert.assertTrue(viewComposite.getLayout() instanceof FillLayout);

		Control[] viewChilds = viewComposite.getChildren();
		Assert.assertEquals(1, viewChilds.length);

		Text text = (Text) viewChilds[0];
		Assert.assertNotNull(text);
		Assert.assertNull(text.getLayoutData());

		// dispose the display
		display.dispose();
	}

	@Test
	public void build_ViewWithText__replaceText() {
		Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		// build the view model
		// ...> yView
		// ......> yText
		YUiView yView = modelFactory.createYUiView();
		YUiTextField yTeyt = extensionFactory.createYUiTextField();
		yView.setContent(yTeyt);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			ExampleRenderer renderer = new ExampleRenderer();
			renderer.render(shell, yView);
		} catch (ContextException e) {
		}

		Composite viewComposite = (Composite) shell.getChildren()[0];
		// ensure that there is a control in the viewComposite
		Assert.assertEquals(1, viewComposite.getChildren().length);

		// now remove the text from the view
		//
		yView.setContent(null);

		// ensure, that no child is contained now
		Control[] viewChilds = viewComposite.getChildren();
		Assert.assertEquals(0, viewChilds.length);

		// dispose the display
		display.dispose();
	}

	@Test
	public void build_ViewWithGridlayoutAndText() {
		Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText1
		// .........> yText2
		YUiView yView = modelFactory.createYUiView();
		YUiGridLayout yGridLayout = extensionFactory.createYUiGridLayout();
		yView.setContent(yGridLayout);
		YUiTextField yText1 = extensionFactory.createYUiTextField();
		yGridLayout.getElements().add(yText1);
		YUiTextField yText2 = extensionFactory.createYUiTextField();
		yGridLayout.getElements().add(yText2);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			ExampleRenderer renderer = new ExampleRenderer();
			renderer.render(shell, yView);
		} catch (ContextException e) {
		}

		Composite viewComposite = (Composite) shell.getChildren()[0];
		// ensure that there is a control in the viewComposite
		Assert.assertEquals(1, viewComposite.getChildren().length);

		// now remove the text from the view
		//
		yView.setContent(null);

		// ensure, that no child is contained now
		Control[] viewChilds = viewComposite.getChildren();
		Assert.assertEquals(0, viewChilds.length);

		// dispose the display
		display.dispose();
	}

}
