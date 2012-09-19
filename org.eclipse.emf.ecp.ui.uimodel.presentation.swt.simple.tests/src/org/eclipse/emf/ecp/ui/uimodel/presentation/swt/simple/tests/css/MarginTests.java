package org.eclipse.emf.ecp.ui.uimodel.presentation.swt.simple.tests.css;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.util.SimpleModelFactory;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiEmbeddableEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ContextException;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ui.uimodel.example.presentation.SimpleSwtRenderer;
import org.eclipse.emf.ecp.ui.uimodel.presentation.swt.simple.tests.Activator;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MarginTests {

	private SimpleModelFactory factory = new SimpleModelFactory();
	private Display display = Display.getCurrent();
	private Shell shell;

	@Before
	public void setup() {
		shell = new Shell(display);
		shell.setLayout(new FillLayout());
	}

	/**
	 * Tests the margin<br>
	 * yView.setMargin(false);
	 */
	@Test
	public void test_margin_view_settingFalse_noCSS() {
		// ...> yView
		YUiView yView = factory.createYView();
		yView.setCssClass("margintests");
		yView.setMargin(false);
		YUiGridLayout yGridLayout = factory.createYGridLayout();
		yView.setContent(yGridLayout);

		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yView);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin<br>
	 * yView.setMargin(true);
	 */
	@Test
	public void test_margin_view_settingTrue_noCSS() {
		// ...> yView
		YUiView yView = factory.createYView();
		yView.setCssClass("margintests");
		// difference to test_margin_view_settingFalse_noCSS
		yView.setMargin(true);
		YUiGridLayout yGridLayout = factory.createYGridLayout();
		yView.setContent(yGridLayout);

		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yView);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin<br>
	 * yView.setMargin(false);<br>
	 * createCssOptions() is used
	 */
	@Test
	public void test_margin_view_settingFalse_withCSS() {
		// ...> yView
		YUiView yView = factory.createYView();
		yView.setCssClass("margintests");
		yView.setMargin(false);
		YUiGridLayout yGridLayout = factory.createYGridLayout();
		yView.setContent(yGridLayout);

		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, createCssOptions());
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yView);
		GridLayout layout = (GridLayout) viewComposite.getLayout();

		// margin did not change since setMargin(false)
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin<br>
	 * yView.setMargin(true);<br>
	 * createCssOptions() is used
	 */
	@Test
	public void test_margin_view_settingTrue_withCSS() {
		// ...> yView
		YUiView yView = factory.createYView();
		yView.setCssClass("margintests");
		// difference to test_margin_view_settingFalse_noCSS
		yView.setMargin(true);
		YUiGridLayout yGridLayout = factory.createYGridLayout();
		yView.setContent(yGridLayout);

		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, createCssOptions());
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yView);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(10, layout.marginLeft);
		Assert.assertEquals(20, layout.marginTop);
		Assert.assertEquals(30, layout.marginRight);
		Assert.assertEquals(40, layout.marginBottom);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin<br>
	 * yView.setMargin(false);
	 */
	@Test
	public void test_margin_gridlayout_settingFalse_noCSS() {
		// ...> yView
		YUiView yView = factory.createYView();
		yView.setCssClass("margintests");
		YUiGridLayout yGridLayout = factory.createYGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setMargin(false);
		yView.setContent(yGridLayout);

		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yGridLayout);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin<br>
	 * yView.setMargin(true);
	 */
	@Test
	public void test_margin_gridlayout_settingTrue_noCSS() {
		// ...> yView
		YUiView yView = factory.createYView();
		yView.setCssClass("margintests");
		YUiGridLayout yGridLayout = factory.createYGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setMargin(true);
		yView.setContent(yGridLayout);

		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, null);
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yGridLayout);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin<br>
	 * yView.setMargin(false);<br>
	 * createCssOptions() is used
	 */
	@Test
	public void test_margin_gridlayout_settingFalse_withCSS() {
		// ...> yView
		YUiView yView = factory.createYView();
		yView.setCssClass("margintests");
		YUiGridLayout yGridLayout = factory.createYGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setMargin(false);
		yView.setContent(yGridLayout);

		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, createCssOptions());
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yGridLayout);
		GridLayout layout = (GridLayout) viewComposite.getLayout();

		// margin did not change since setMargin(false)
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(0, layout.marginBottom);
		Assert.assertEquals(0, layout.marginLeft);
		Assert.assertEquals(0, layout.marginRight);
		Assert.assertEquals(0, layout.marginTop);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
	}

	/**
	 * Tests the margin<br>
	 * yView.setMargin(true);<br>
	 * createCssOptions() is used
	 */
	@Test
	public void test_margin_gridlayout_settingTrue_withCSS() {
		// ...> yView
		YUiView yView = factory.createYView();
		yView.setCssClass("margintests");
		YUiGridLayout yGridLayout = factory.createYGridLayout();
		yGridLayout.setCssClass("gridlayout");
		yGridLayout.setMargin(true);
		yView.setContent(yGridLayout);

		try {
			SimpleSwtRenderer renderer = new SimpleSwtRenderer();
			renderer.render(shell, yView, createCssOptions());
		} catch (ContextException e) {
			Assert.fail();
		}

		Composite viewComposite = (Composite) getControl(yGridLayout);
		GridLayout layout = (GridLayout) viewComposite.getLayout();
		Assert.assertEquals(1, layout.numColumns);
		Assert.assertEquals(33, layout.marginLeft);
		Assert.assertEquals(34, layout.marginTop);
		Assert.assertEquals(35, layout.marginRight);
		Assert.assertEquals(36, layout.marginBottom);
		Assert.assertEquals(5, layout.marginHeight);
		Assert.assertEquals(5, layout.marginWidth);
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

	protected Map<String, Object> createCssOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(SimpleSwtRenderer.RENDERING_OPTION__CSS_FILES,
			Collections.singleton(Activator.getContext().getBundle().getEntry("/theming/css/maringTests.css")));
		return options;
	}
}