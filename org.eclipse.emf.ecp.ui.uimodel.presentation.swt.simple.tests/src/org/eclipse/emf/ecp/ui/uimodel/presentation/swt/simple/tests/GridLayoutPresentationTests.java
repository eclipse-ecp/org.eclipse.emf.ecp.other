package org.eclipse.emf.ecp.ui.uimodel.presentation.swt.simple.tests;

import junit.framework.Assert;

import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
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
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal.AbstractSWTWidgetPresenter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class GridLayoutPresentationTests {

	private SimpleModelFactory factory = new SimpleModelFactory();
	private Display display = Display.getCurrent();
	private Shell shell;

	@Before
	public void setup() {
		shell = new Shell(display);
		shell.setLayout(new FillLayout());
	}

	@Test
	public void test_unrender_layout_and_render_byModel() throws Exception {
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
	public void test_getChildren() throws Exception {
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
		Assert.assertEquals(2, presLayout.getChildren().size());

		// unrender the layout and its childs
		yView.setContent(null);
		// layout
		Assert.assertEquals(2, presLayout.getChildren().size());

		// remove from unrendered layout
		yGridlayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());

		// add to unrendered layout
		yGridlayout.getElements().add(yText1);
		Assert.assertEquals(2, presLayout.getChildren().size());

		//
		//
		// remove again from unrendered layout
		yGridlayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());

		// now set the gridlayout as the content -> Should be rendered again
		yView.setContent(yGridlayout);

		//
		//
		// at least add the text1 again
		yGridlayout.getElements().add(yText1);
		Assert.assertEquals(2, presLayout.getChildren().size());

	}

	@Test
	public void test_containsChildren() throws Exception {
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
		IUiTextFieldEditpart text1Editpart = DelegatingEditPartManager.getInstance().getEditpart(yText1);
		IUiTextFieldEditpart text2Editpart = DelegatingEditPartManager.getInstance().getEditpart(yText2);

		ILayoutPresentation<Control> presLayout = layoutEditpart.getPresentation();
		IWidgetPresentation<Control> presText1 = text1Editpart.getPresentation();
		IWidgetPresentation<Control> presText2 = text2Editpart.getPresentation();
		Assert.assertTrue(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));

		// unrender the layout and its childs
		yView.setContent(null);
		// layout
		Assert.assertTrue(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));

		// remove from unrendered layout
		yGridlayout.getElements().remove(yText1);
		Assert.assertFalse(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));

		// add to unrendered layout
		yGridlayout.getElements().add(yText1);
		Assert.assertTrue(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));

		//
		//
		// remove again from unrendered layout
		yGridlayout.getElements().remove(yText1);
		Assert.assertEquals(1, presLayout.getChildren().size());
		Assert.assertFalse(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));

		// now set the gridlayout as the content -> Should be rendered again
		yView.setContent(yGridlayout);

		//
		//
		// at least add the text1 again
		yGridlayout.getElements().add(yText1);
		Assert.assertTrue(presLayout.contains(presText1));
		Assert.assertTrue(presLayout.contains(presText2));
	}

	@Test
	public void test_renderChildren_forceFalse() throws Exception {
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

		Control layout = presLayout.getWidget();
		Control text = presText.getWidget();

		// render the text again by the parent
		presLayout.renderChildren(false);
		Control newLayout = presLayout.getWidget();
		Control newText = presText.getWidget();

		Assert.assertSame(layout, newLayout);
		Assert.assertSame(text, newText);
	}

	@Test
	public void test_renderChildren_forceTrue() throws Exception {
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

		Control layout = presLayout.getWidget();
		Control text = presText.getWidget();

		// render the text again by the parent
		presLayout.renderChildren(true);
		Control newLayout = presLayout.getWidget();
		Control newText = presText.getWidget();

		Assert.assertSame(layout, newLayout);
		// NOT SAME
		//
		Assert.assertNotSame(text, newText);
	}

	@Test
	public void test_InternalStructure() throws Exception {
		// build the view model
		// ...> yView
		// ......> yText
		YUiView yView = factory.createYView();
		YUiGridLayout yLayout = factory.createYGridLayout();
		yView.setContent(yLayout);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		IUiGridLayoutEditpart layoutEditpart = DelegatingEditPartManager.getInstance().getEditpart(yLayout);
		ILayoutPresentation<Control> presentation = layoutEditpart.getPresentation();
		Composite baseComposite = (Composite) presentation.getWidget();
		Composite content = (Composite) unwrap(baseComposite);

		Assert.assertEquals(1, baseComposite.getChildren().length);

		// assert layout and layout data
		GridLayout layout = (GridLayout) baseComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);

		GridData data = (GridData) content.getLayoutData();
		Assert.assertEquals(SWT.FILL, data.horizontalAlignment);
		Assert.assertEquals(SWT.FILL, data.verticalAlignment);
		Assert.assertEquals(true, data.grabExcessHorizontalSpace);
		Assert.assertEquals(true, data.grabExcessHorizontalSpace);
		Assert.assertEquals(false, data.exclude);
		Assert.assertEquals(0, data.horizontalIndent);
		Assert.assertEquals(1, data.horizontalSpan);
		Assert.assertEquals(0, data.minimumHeight);
		Assert.assertEquals(0, data.minimumWidth);
		Assert.assertEquals(0, data.verticalIndent);
		Assert.assertEquals(1, data.verticalSpan);
		Assert.assertEquals(-1, data.widthHint);
	}

	@Test
	public void test_InternalStructure__CSS_Class() throws Exception {
		// build the view model
		// ...> yView
		// ......> yText
		YUiView yView = factory.createYView();
		YUiGridLayout yLayout = factory.createYGridLayout();
		yView.setContent(yLayout);
		YUiGridLayout yInternalLayout1 = factory.createYGridLayout();
		yInternalLayout1.setCssID("ID_0815");
		yInternalLayout1.setCssClass("anyOtherClass");
		yLayout.getElements().add(yInternalLayout1);
		YUiGridLayout yInternalLayout2 = factory.createYGridLayout();
		yLayout.getElements().add(yInternalLayout2);

		SimpleSwtRenderer renderer = new SimpleSwtRenderer();
		renderer.render(shell, yView, null);

		IUiGridLayoutEditpart internalLayout1Editpart = DelegatingEditPartManager.getInstance().getEditpart(
			yInternalLayout1);
		IUiGridLayoutEditpart internalLayout2Editpart = DelegatingEditPartManager.getInstance().getEditpart(
			yInternalLayout2);
		ILayoutPresentation<Control> internalLayout1Presentation = internalLayout1Editpart.getPresentation();
		ILayoutPresentation<Control> internalLayout2Presentation = internalLayout2Editpart.getPresentation();
		Composite internalLayout1BaseComposite = (Composite) internalLayout1Presentation.getWidget();
		Composite internalLayout2BaseComposite = (Composite) internalLayout2Presentation.getWidget();
		Composite internalLayout1 = (Composite) unwrap(internalLayout1BaseComposite);
		Composite internalLayout2 = (Composite) unwrap(internalLayout2BaseComposite);

		// assert css class
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
			WidgetElement.getCSSClass(internalLayout1BaseComposite));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL_BASE,
			WidgetElement.getCSSClass(internalLayout2BaseComposite));
		Assert.assertEquals("anyOtherClass", WidgetElement.getCSSClass(internalLayout1));
		Assert.assertEquals(AbstractSWTWidgetPresenter.CSS_CLASS__CONTROL, WidgetElement.getCSSClass(internalLayout2));

		// assert css id
		Assert.assertNull(WidgetElement.getID(internalLayout1BaseComposite));
		Assert.assertEquals("ID_0815", WidgetElement.getID(internalLayout1));
		Assert.assertNull(WidgetElement.getID(internalLayout2BaseComposite));
		Assert.assertEquals(internalLayout2Editpart.getId(), WidgetElement.getID(internalLayout2));
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
