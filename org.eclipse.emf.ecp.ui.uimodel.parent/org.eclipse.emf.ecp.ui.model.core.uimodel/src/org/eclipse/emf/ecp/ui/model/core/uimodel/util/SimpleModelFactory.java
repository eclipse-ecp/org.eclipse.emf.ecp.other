package org.eclipse.emf.ecp.ui.model.core.uimodel.util;

import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;

public class SimpleModelFactory {

	/**
	 * Creates an instance of {@link YUiGridLayout}
	 * 
	 * @return
	 */
	public YUiGridLayout createYGridLayout() {
		return UimodelExtensionFactory.eINSTANCE.createYUiGridLayout();
	}

	/**
	 * Creates an instance of {@link YUiTextField}
	 * 
	 * @return
	 */
	public YUiTextField createYTextField() {
		return UimodelExtensionFactory.eINSTANCE.createYUiTextField();
	}

	/**
	 * Creates an instance of {@link YUiView}
	 * 
	 * @return
	 */
	public YUiView createYView() {
		return UiModelFactory.eINSTANCE.createYUiView();
	}

	/**
	 * Creates an instance of {@link YUiViewSet}
	 * 
	 * @return
	 */
	public YUiViewSet createYViewSet() {
		return UiModelFactory.eINSTANCE.createYUiViewSet();
	}
}
