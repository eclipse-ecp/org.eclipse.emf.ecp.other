package org.eclipse.emf.ecp.ui.uimodel.presentation.swt.simple.tests;

import junit.framework.Assert;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.util.SimpleModelFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ContextException;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ViewContext;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.SimpleSwtRenderer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.junit.Before;
import org.junit.Test;

public class PresentationTests {

	private SimpleModelFactory factory = new SimpleModelFactory();
	private Display display = Display.getCurrent();
	private Shell shell;

	@Before
	public void setup() {
		shell = new Shell(display);
		shell.setLayout(new FillLayout());
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

	/**
	 * Tests the build of a simple view without any content
	 */
	@Test
	public void build_View() {
		// ...> yView
		YUiView yView = factory.createYView();

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
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
		YUiView yView = factory.createYView();
		YUiTextField yTeyt = factory.createYTextField();
		yView.setContent(yTeyt);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
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
		Assert.assertTrue(text.getLayoutData() instanceof GridData);
	}

	@Test
	public void build_ViewWithText__replaceText() {
		// build the view model
		// ...> yView
		// ......> yText
		YUiView yView = factory.createYView();
		YUiTextField yTeyt = factory.createYTextField();
		yView.setContent(yTeyt);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
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
		YUiView yView = factory.createYView();
		YUiGridLayout yGridLayout = factory.createYGridLayout();
		yView.setContent(yGridLayout);
		YUiTextField yText1 = factory.createYTextField();
		yGridLayout.getElements().add(yText1);
		YUiTextField yText2 = factory.createYTextField();
		yGridLayout.getElements().add(yText2);

		Assert.assertEquals(0, shell.getChildren().length);
		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
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

	@Test
	public void test_newInstance() {
		// ...........> field2
		YUiView view1 = factory.createYView();
		IUiViewEditpart view1EditPart = DelegatingEditPartManager.getInstance().getEditpart(view1);

		// contexts null
		//
		Assert.assertNull(view1EditPart.getContext());

		// set context 1
		//
		ViewContext viewContext1 = new ViewContext(view1EditPart);
		Assert.assertSame(viewContext1, view1EditPart.getContext());

		ViewContext viewContext2 = new ViewContext(view1EditPart);
		Assert.assertSame(viewContext2, view1EditPart.getContext());

		// mark rendered
		//
		try {
			viewContext2.render(SimpleSwtRenderer.UI_KIT_URI, shell, null);
		} catch (ContextException e1) {
			throw new RuntimeException(e1);
		}

		// set the same instance twice
		//
		view1EditPart.setContext(viewContext2);
		Assert.assertSame(viewContext2, view1EditPart.getContext());

		try {
			// set a new instance
			//
			new ViewContext(view1EditPart);
			Assert.fail();
		} catch (Exception e) {
			// expected
		}
	}

	@Test
	public void test_presentationURI() {
		IUiViewEditpart viewEditPart = DelegatingEditPartManager.getInstance().createEditpart(
			"http://eclipse.org/emf/emfclient/uimodel", IUiViewEditpart.class);
		ViewContext context = new ViewContext(viewEditPart);

		Assert.assertNull(context.getPresentationURI());
		context.setPresentationURI("test");
		Assert.assertEquals("test", context.getPresentationURI());

		try {
			context.render(SimpleSwtRenderer.UI_KIT_URI, shell, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		try {
			context.setPresentationURI("test");
			Assert.fail();
		} catch (Exception e) {
		}
	}

	@Test
	public void test_rootLayout() {
		IUiViewEditpart viewEditPart = DelegatingEditPartManager.getInstance().createEditpart(
			"http://eclipse.org/emf/emfclient/uimodel", IUiViewEditpart.class);
		ViewContext context = new ViewContext(viewEditPart);

		Assert.assertNull(context.getRootLayout());

		try {
			context.render(SimpleSwtRenderer.UI_KIT_URI, shell, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Assert.assertSame(shell, context.getRootLayout());
	}
}
