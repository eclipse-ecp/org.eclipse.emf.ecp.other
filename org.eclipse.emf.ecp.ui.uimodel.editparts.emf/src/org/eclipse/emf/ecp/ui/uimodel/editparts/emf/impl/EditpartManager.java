package org.eclipse.emf.ecp.ui.uimodel.editparts.emf.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiViewSet;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiElementEditpart;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiFieldEditpart;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiViewSetEditpart;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.editparts.emf.common.IResourceSetManager;
import org.eclipse.emf.ecp.ui.uimodel.editparts.util.IEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.editparts.util.IUiElementEditpartProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An implementation of {@link IEditPartManager} for eObjects with nsURI=http://eclipse.org/emf/emfclient/uimodel
 */
public class EditpartManager implements IEditPartManager {
	private static final Logger logger = LoggerFactory.getLogger(EditpartManager.class);

	@Override
	public boolean isFor(Object element) {
		if (element instanceof EObject) {
			Resource resource = ((EObject) element).eResource();
			if (resource != null) {
				String uriString = resource.getURI().toString();
				return uriString.equals(UiModelPackage.eNS_URI)
					|| uriString.equals(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING);
			}
		} else if (element instanceof String) {
			return element.equals(UiModelPackage.eNS_URI);
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @param yElement
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <A extends IUiElementEditpart> A getEditpart(Object yElement) {
		IUiElementEditpart editPart = findEditpart(yElement);
		return (A) (editPart != null ? editPart : createEditpart(yElement));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @param yElement
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <A extends IUiElementEditpart> A findEditpart(Object yElement) {
		return (A) findEditPartFor((YUiElement) yElement);
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
	 * Creates a new instance of the required edit part.
	 * 
	 * @param <A>
	 * @param type
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private <A extends IUiElementEditpart> A createNewInstance(Class<? extends IUiElementEditpart> type) {
		A result = null;
		UiElementEditpart<YUiElement> editPart = null;
		try {
			editPart = (UiElementEditpart<YUiElement>) type.newInstance();
		} catch (InstantiationException e) {
			logger.error("{}", e);
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			logger.error("{}", e);
			throw new RuntimeException(e);
		}
		result = (A) editPart;
		return result;
	}

	private void assertOneEditpartForModelelement(Object element) {
		YUiElement yElement = (YUiElement) element;
		for (Adapter adapter : yElement.eAdapters()) {
			if (adapter instanceof IUiElementEditpartProvider) {
				logger.error("For a modelelement instance only one editpart can be created!");
				throw new RuntimeException("For a modelelement instance only one editpart can be created!");
			}
		}
	}

	/**
	 * Returns the edit part for the given model yElement.
	 * 
	 * @param yElement
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <A extends IUiElementEditpart> A findEditPartFor(YUiElement yElement) {
		if (yElement == null) {
			return null;
		}

		IUiElementEditpartProvider editPartProvider = null;
		for (Adapter adapter : ((EObject) yElement).eAdapters()) {
			if (adapter instanceof IUiElementEditpartProvider) {
				editPartProvider = (IUiElementEditpartProvider) adapter;
				break;
			}
		}

		return editPartProvider != null ? (A) editPartProvider.getEditpart() : null;
	}
}
