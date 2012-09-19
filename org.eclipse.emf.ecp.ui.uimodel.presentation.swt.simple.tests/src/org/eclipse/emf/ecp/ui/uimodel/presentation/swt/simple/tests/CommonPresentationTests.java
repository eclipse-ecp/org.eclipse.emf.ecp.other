package org.eclipse.emf.ecp.ui.uimodel.presentation.swt.simple.tests;

import junit.framework.Assert;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.util.SimpleModelFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiGridLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.extension.IUiTextFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.ILayoutPresentation;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.SimpleSwtRenderer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;

public class CommonPresentationTests {

	private SimpleModelFactory factory = new SimpleModelFactory();
	private Display display = Display.getCurrent();
	private Shell shell;

	@Before
	public void setup() {
		shell = new Shell(display);
		shell.setLayout(new FillLayout());
	}

	@Test
	public void test_isRendered_unrender_byModel() throws Exception {
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText
		YUiView yView = factory.createYView();
		YUiGridLayout yGridlayout = factory.createYGridLayout();
		yView.setContent(yGridlayout);
		YUiTextField yText = factory.createYTextField();
		yGridlayout.getElements().add(yText);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		IUiTextFieldEditpart textEditpart = DelegatingEditPartManager.getInstance().getEditpart(yText);
		IWidgetPresentation<Control> presentation = textEditpart.getPresentation();
		Assert.assertTrue(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());

		yGridlayout.getElements().remove(yText);
		Assert.assertFalse(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());
	}

	@Test
	public void test_isRendered__unrender_and_render_byModel() throws Exception {
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText
		YUiView yView = factory.createYView();
		YUiGridLayout yGridlayout = factory.createYGridLayout();
		yView.setContent(yGridlayout);
		YUiTextField yText = factory.createYTextField();
		yGridlayout.getElements().add(yText);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		IUiTextFieldEditpart textEditpart = DelegatingEditPartManager.getInstance().getEditpart(yText);
		IWidgetPresentation<Control> presentation = textEditpart.getPresentation();
		Assert.assertTrue(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());
		Assert.assertNotNull(presentation.getWidget());

		yGridlayout.getElements().remove(yText);
		Assert.assertFalse(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());
		Assert.assertNull(presentation.getWidget());

		yGridlayout.getElements().add(yText);
		Assert.assertTrue(presentation.isRendered());
		Assert.assertFalse(presentation.isDisposed());
		Assert.assertNotNull(presentation.getWidget());
	}

	@Test
	public void test_isRendered_unrender_layout_and_render_byModel() throws Exception {
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText1
		// .........> yText2
		YUiView yView = factory.createYView();
		YUiGridLayout yGridlayout = factory.createYGridLayout();
		yView.setContent(yGridlayout);
		YUiTextField yText1 = factory.createYTextField();
		yGridlayout.getElements().add(yText1);
		YUiTextField yText2 = factory.createYTextField();
		yGridlayout.getElements().add(yText2);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		// layout
		IUiGridLayoutEditpart layoutEditpart = DelegatingEditPartManager.getInstance().getEditpart(yGridlayout);
		ILayoutPresentation<Control> presLayout = layoutEditpart.getPresentation();
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNotNull(presLayout.getWidget());
		Assert.assertEquals(2, presLayout.getChildren().size());

		// text1
		IUiTextFieldEditpart text1Editpart = DelegatingEditPartManager.getInstance().getEditpart(yText1);
		IWidgetPresentation<Control> presText1 = text1Editpart.getPresentation();
		Assert.assertTrue(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNotNull(presText1.getWidget());

		// text2
		IUiTextFieldEditpart text2Editpart = DelegatingEditPartManager.getInstance().getEditpart(yText2);
		IWidgetPresentation<Control> presText2 = text2Editpart.getPresentation();
		Assert.assertTrue(presText2.isRendered());
		Assert.assertFalse(presText2.isDisposed());
		Assert.assertNotNull(presText2.getWidget());

		// unrender the layout and its childs
		yView.setContent(null);
		// layout
		Assert.assertFalse(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNull(presLayout.getWidget());
		Assert.assertEquals(2, presLayout.getChildren().size());
		// text1
		Assert.assertFalse(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNull(presText1.getWidget());
		// text2
		Assert.assertFalse(presText2.isRendered());
		Assert.assertFalse(presText2.isDisposed());
		Assert.assertNull(presText2.getWidget());

		// remove from unrendered layout
		yGridlayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());

		// check text1
		// layout
		Assert.assertFalse(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNull(presLayout.getWidget());
		// text1
		Assert.assertFalse(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNull(presText1.getWidget());

		// add to unrendered layout
		yGridlayout.getElements().add(yText1);
		Assert.assertEquals(2, presLayout.getChildren().size());

		// layout
		Assert.assertFalse(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNull(presLayout.getWidget());
		// text1
		Assert.assertFalse(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNull(presText1.getWidget());

		//
		//
		// remove again from unrendered layout
		yGridlayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());

		// now set the gridlayout as the content -> Should be rendered again
		yView.setContent(yGridlayout);
		// layout
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNotNull(presLayout.getWidget());
		// text1 --> Is null and not rendered
		Assert.assertFalse(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNull(presText1.getWidget());
		// text2
		Assert.assertTrue(presText2.isRendered());
		Assert.assertFalse(presText2.isDisposed());
		Assert.assertNotNull(presText2.getWidget());

		//
		//
		// at least add the text1 again
		yGridlayout.getElements().add(yText1);

		// layout
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertFalse(presLayout.isDisposed());
		Assert.assertNotNull(presLayout.getWidget());
		// text1
		Assert.assertTrue(presText1.isRendered());
		Assert.assertFalse(presText1.isDisposed());
		Assert.assertNotNull(presText1.getWidget());
		// text2
		Assert.assertTrue(presText2.isRendered());
		Assert.assertFalse(presText2.isDisposed());
		Assert.assertNotNull(presText2.getWidget());

	}

	@Test
	public void test_isRendered_unrender_childByPresentation() throws Exception {
		// build the view model
		// ...> yView
		// ......> yGridLayout
		// .........> yText
		YUiView yView = factory.createYView();
		YUiGridLayout yGridlayout = factory.createYGridLayout();
		yView.setContent(yGridlayout);
		YUiTextField yText = factory.createYTextField();
		yGridlayout.getElements().add(yText);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		IUiGridLayoutEditpart layoutEditpart = DelegatingEditPartManager.getInstance().getEditpart(yGridlayout);
		IUiTextFieldEditpart textEditpart = DelegatingEditPartManager.getInstance().getEditpart(yText);

		ILayoutPresentation<Control> presLayout = layoutEditpart.getPresentation();
		IWidgetPresentation<Control> presText = textEditpart.getPresentation();
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertNotNull(presLayout.getWidget());
		Assert.assertTrue(presText.isRendered());
		Assert.assertNotNull(presText.getWidget());

		presText.unrender();
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertNotNull(presLayout.getWidget());
		Assert.assertFalse(presText.isRendered());
		Assert.assertNull(presText.getWidget());

		// render the text again by the parent
		presLayout.renderChildren(false);
		Assert.assertTrue(presLayout.isRendered());
		Assert.assertNotNull(presLayout.getWidget());
		Assert.assertTrue(presText.isRendered());
		Assert.assertNotNull(presText.getWidget());
	}

	/**
	 * Unwraps the control from its parent composite.
	 * 
	 * @param control
	 * @return
	 */
	@SuppressWarnings("unused")
	private Control unwrap(Control control) {
		if (control instanceof Composite) {
			Composite composite = (Composite) control;
			return composite.getChildren()[0];
		}
		return control;
	}

	protected Control getControl(YUiElement yView) {
		IUiElementEditpart editpart = DelegatingEditPartManager.getInstance().getEditpart(yView);

		IWidgetPresentation<Control> presentation = null;
		if (editpart instanceof IUiViewEditpart) {
			presentation = ((IUiViewEditpart) editpart).getPresentation();
		} else {
			presentation = ((IUiEmbeddableEditpart) editpart).getPresentation();
		}
		Control widget = presentation.getWidget();
		return widget;
	}
}
