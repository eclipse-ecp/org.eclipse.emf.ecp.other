package org.eclipse.emf.ecp.ui.uimodel.example.presentation.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.AbstractDisposable;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.ILayoutPresentation;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.presentation.IWidgetPresentation;
import org.eclipse.swt.widgets.Control;

@SuppressWarnings("restriction")
public abstract class AbstractSWTLayoutPresenter extends AbstractDisposable implements ILayoutPresentation<Control> {

	public static final String CSS_CLASS__CONTROL_BASE ="controlbase";
	public static final String CSS_CLASS__CONTROL ="control";
	
	private List<IWidgetPresentation<?>> children;

	@Override
	public List<IWidgetPresentation<?>> getChildren() {
		return children != null ? Collections.unmodifiableList(children) : Collections
			.<IWidgetPresentation<?>> emptyList();
	}

	@Override
	public boolean contains(IWidgetPresentation<?> presentation) {
		return children != null && children.contains(presentation);
	}

	@Override
	public void add(IWidgetPresentation<?> presentation) {
		ensureChildren();

		if (!children.contains(presentation)) {
			children.add(presentation);

			internalAdd(presentation);
		}
	}

	/**
	 * This method is called after the presentation was successfully added to the children collection.<br>
	 * Subclasses should handle the add of the UI element in that method.
	 * 
	 * @param presentation
	 */
	protected abstract void internalAdd(IWidgetPresentation<?> presentation);

	@Override
	public void remove(IWidgetPresentation<?> presentation) {
		if (children == null) {
			return;
		}

		if (children.remove(presentation)) {
			internalRemove(presentation);
		}
	}

	/**
	 * This method is called after the presentation was successfully removed from the children collection.<br>
	 * Subclasses should handle the unrendering of the UI element in that method.
	 * 
	 * @param presentation
	 */
	protected abstract void internalRemove(IWidgetPresentation<?> presentation);

	@Override
	public void insert(IWidgetPresentation<?> presentation, int index) {
		ensureChildren();

		int currentIndex = children.indexOf(presentation);
		if (currentIndex > -1 && currentIndex != index) {
			throw new RuntimeException(
				String.format("Insert at index %d not possible since presentation already contained at index %d",
					index, currentIndex));
		}

		children.add(index, presentation);
		internalInsert(presentation, index);
	}

	/**
	 * This method is called after the presentation was successfully inserted to the children collection.<br>
	 * Subclasses should handle the insert of the UI element in that method.
	 * 
	 * @param presentation
	 */
	protected abstract void internalInsert(IWidgetPresentation<?> presentation, int index);

	@Override
	public void move(IWidgetPresentation<?> presentation, int index) {
		if (children == null) {
			throw new RuntimeException("Move not possible. No children present.");
		}

		if (!children.contains(presentation)) {
			throw new RuntimeException(String.format("Move to index %d not possible since presentation not added yet!",
				index));
		}

		int currentIndex = children.indexOf(presentation);

		children.remove(presentation);
		children.add(index, presentation);

		internalMove(presentation, currentIndex, index);
	}

	/**
	 * This method is called after the presentation was successfully moved inside the children collection.<br>
	 * Subclasses should handle the move of the UI element in that method.
	 * 
	 * @param presentation
	 * @param oldIndex The old index where the control was located.
	 * @param newIndex The new index where the control should be located after the move operation.
	 */
	protected abstract void internalMove(IWidgetPresentation<?> presentation, int oldIndex, int newIndex);

	protected void ensureChildren() {
		if (children == null) {
			children = new ArrayList<IWidgetPresentation<?>>();
		}
	}

	/**
	 * Sets the css id at the control.
	 * 
	 * @param control
	 * @param id
	 */
	protected void setCSSId(Control control, String id) {
		WidgetElement.setID(control, id);
	}

	/**
	 * Sets the css class at the control.
	 * 
	 * @param control
	 * @param clazz
	 */
	protected void setCSSClass(Control control, String clazz) {
		WidgetElement.setCSSClass(control, clazz);
	}

	@Override
	protected void internalDispose() {
		try {
			if (children != null) {
				children.clear();
				children = null;
			}
		} finally {

		}
	}
}
