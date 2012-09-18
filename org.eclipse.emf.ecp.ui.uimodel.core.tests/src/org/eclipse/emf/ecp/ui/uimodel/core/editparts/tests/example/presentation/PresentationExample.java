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
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.SimpleSwtRenderer;
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
public class PresentationExample {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager.getInstance();
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;
	private UimodelExtensionFactory extensionFactory = UimodelExtensionFactory.eINSTANCE;
	private Display display = Display.getCurrent();
	private Shell shell;

	@Before
	public void setup() {
		editpartManager.clear();
		editpartManager.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager());
		editpartManager
			.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl.EditpartManager());

		DelegatingPresenterFactory.getInstance().addFactory(new PresenterFactory());

		shell = new Shell(display);
		shell.setLayout(new FillLayout());
	}


	/**
	 * Tests the build of a simple view without any content
	 */
	@Test
	public void build_View() {
		// ...> yView
		YUiView yView = modelFactory.createYUiView();

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
		}

		// assert the created elements
		//
		Control[] childs = shell.getChildren();
		Assert.assertEquals(1, childs.length);

		Composite viewComposite = (Composite) unwrap(childs[0]);
		Assert.assertTrue(viewComposite.getLayout() instanceof FillLayout);

		// viewComposite has no childs
		//
		Assert.assertEquals(0, viewComposite.getChildren().length);
	}

	@Test
	public void build_ViewWithText() {
		// build the view model
		// ...> yView
		// ......> yText
		YUiView yView = modelFactory.createYUiView();
		YUiTextField yTeyt = extensionFactory.createYUiTextField();
		yView.setContent(yTeyt);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
		}

		// assert the created elements
		//
		Control[] childs = shell.getChildren();
		Assert.assertEquals(1, childs.length);

		Composite viewComposite = (Composite) unwrap(childs[0]);
		Assert.assertTrue(viewComposite.getLayout() instanceof FillLayout);

		Control[] viewChilds = viewComposite.getChildren();
		Assert.assertEquals(1, viewChilds.length);

		Text text = (Text) unwrap(viewChilds[0]);
		Assert.assertNotNull(text);
		Assert.assertNull(text.getLayoutData());
	}

	@Test
	public void build_ViewWithText__replaceText() {
		// build the view model
		// ...> yView
		// ......> yText
		YUiView yView = modelFactory.createYUiView();
		YUiTextField yTeyt = extensionFactory.createYUiTextField();
		yView.setContent(yTeyt);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
		}

		Composite viewComposite = (Composite) unwrap(shell.getChildren()[0]);
		// ensure that there is a control in the viewComposite
		Assert.assertEquals(1, viewComposite.getChildren().length);

		// now remove the text from the view
		//
		yView.setContent(null);

		// ensure, that no child is contained now
		Control[] viewChilds = viewComposite.getChildren();
		Assert.assertEquals(0, viewChilds.length);
	}

	@SuppressWarnings("unused")
	@Test
	public void build_ViewWithGridlayoutAndText() {
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
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
		}

		Composite viewComposite = (Composite) unwrap(shell.getChildren()[0]);
		// ensure that there is a control in the viewComposite
		Assert.assertEquals(1, viewComposite.getChildren().length);

		Composite layoutComposite = (Composite) unwrap(viewComposite.getChildren()[0]);
		// ensure that there is a control in the viewComposite
		Assert.assertEquals(2, layoutComposite.getChildren().length);

		Text text1 = (Text) unwrap(layoutComposite.getChildren()[0]);
		Text text2 = (Text) unwrap(layoutComposite.getChildren()[1]);
	}

	/**
	 * Unwraps the control from its parent composite.
	 * 
	 * @param control
	 * @return
	 */
	private Control unwrap(Control control) {
		if (control instanceof Composite) {
			Composite composite = (Composite) control;
			return composite.getChildren()[0];
		}
		return control;
	}

}
