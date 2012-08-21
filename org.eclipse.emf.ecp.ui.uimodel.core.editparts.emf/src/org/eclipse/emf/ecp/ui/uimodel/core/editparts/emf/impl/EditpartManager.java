package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.common.IEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.common.AbstractEditpartManager;

/**
 * An implementation of {@link IEditPartManager} for eObjects with nsURI=http://eclipse.org/emf/emfclient/uimodel
 */
public class EditpartManager extends AbstractEditpartManager {

	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			String uriString = ((EObject) element).eClass().getEPackage().getNsURI();
			return uriString.equals(UiModelPackage.eNS_URI);
		} else if (element instanceof String) {
			return element.equals(UiModelPackage.eNS_URI);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <A extends IUiElementEditpart> A createEditpart(Object selector, Class<A> editPartClazz) {
		UiElementEditpart<YUiElement> result = null;
		if (editPartClazz.isAssignableFrom(IUiViewEditpart.class)) {
			result = createNewInstance(UiViewEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IUiLayoutEditpart.class)) {
			result = createNewInstance(UiLayoutEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IUiFieldEditpart.class)) {
			result = createNewInstance(UiFieldEditpart.class);
		} else if (editPartClazz.isAssignableFrom(IUiViewSetEditpart.class)) {
			result = createNewInstance(UiViewSetEditpart.class);
		}

		if (result != null) {
			result.initialize();
		}

		return (A) result;
	}

	/**
	 * Creates a new instance of the edit part.
	 * 
	 * @param yElement
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected <A extends IUiElementEditpart> A createEditpart(Object yElement) {
		// asserts that no editpart was created already for the given element
		assertOneEditpartForModelelement(yElement);

		UiElementEditpart<YUiElement> result = null;
		if (yElement instanceof YUiView) {
			result = createNewInstance(UiViewEditpart.class);
		} else if (yElement instanceof YUiLayout) {
			result = createNewInstance(UiLayoutEditpart.class);
		} else if (yElement instanceof YUiField) {
			result = createNewInstance(UiFieldEditpart.class);
		} else if (yElement instanceof YUiViewSet) {
			result = createNewInstance(UiViewSetEditpart.class);
		}

		if (result != null) {
			result.initialize((YUiElement) yElement);
		}

		return (A) result;
	}

	/**
	 * Returns a new instance of the type
	 * 
	 * @param type
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	protected IUiElementEditpart newInstance(Class<? extends IUiElementEditpart> type) throws InstantiationException,
		IllegalAccessException {
		return type.newInstance();
	}

}
