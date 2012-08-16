package org.eclipse.emf.ecp.ui.uimodel.editparts.emf.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.ui.model.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiElement;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiField;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiRoot;
import org.eclipse.emf.ecp.ui.model.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.uimodel.editparts.IUiElementEditpart;
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
				return resource.getURI().toString().equals(UiModelPackage.eNS_URI);
			}
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

	/**
	 * Creates a new instance of the edit part.
	 * 
	 * @param yElement
	 * @return
	 */
	protected <A extends IUiElementEditpart> A createEditpart(Object yElement) {
		A result = null;
		if (yElement instanceof YUiView) {
			result = createNewInstance(yElement, UiViewEditpart.class);
		} else if (yElement instanceof YUiLayout) {
			result = createNewInstance(yElement, UiLayoutEditpart.class);
		} else if (yElement instanceof YUiField) {
			result = createNewInstance(yElement, UiFieldEditpart.class);
		} else if (yElement instanceof YUiRoot) {
			result = createNewInstance(yElement, UiRootEditpart.class);
		}

		return result;
	}

	/**
	 * Creates a new instance of the required edit part.
	 * 
	 * @param <A>
	 * @param element
	 * @param type
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private <A extends IUiElementEditpart> A createNewInstance(Object element, Class<? extends IUiElementEditpart> type) {

		// asserts that no editpart was created already for the given element
		assertOneEditpartForModelelement(element);

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
		editPart.initialize((YUiElement) element);
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
