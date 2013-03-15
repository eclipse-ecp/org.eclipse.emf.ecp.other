/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import org.eclipse.e4.ui.css.swt.CSSSWTConstants;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo;
import org.eclipse.emf.ecp.ecview.ui.css.core.dom.properties.css2.CssConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
@SuppressWarnings("restriction")
public class GridLayoutPresentation extends AbstractSWTLayoutPresenter {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(GridLayoutPresentation.class);

	private GridLayout layout;
	private Composite controlBase;
	private Composite control;
	private ModelAccess modelAccess;

	/**
	 * The constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presentation.
	 */
	public GridLayoutPresentation(IElementEditpart editpart) {
		super((ILayoutEditpart) editpart);
		this.modelAccess = new ModelAccess((YGridLayout) editpart.getModel());
	}

	@Override
	public Composite createWidget(Object parent) {
		if (controlBase == null) {
			controlBase = new Composite((Composite) parent, SWT.NONE);
			controlBase.setLayout(new GridLayout(1, true));
			if (modelAccess.isCssIdValid()) {
				setCSSId(controlBase, modelAccess.getCssID());
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}
			setCSSClass(controlBase, CSS_CLASS__CONTROL_BASE);

			if (modelAccess.isMargin()) {
				controlBase.setData(CSSSWTConstants.MARGIN_WRAPPER_KEY,
						CSSSWTConstants.MARGIN_WRAPPER_KEY);
			}

			control = new Composite(controlBase, SWT.NONE);
			control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			layout = new GridLayout(modelAccess.getColumns(), false);
			control.setLayout(layout);

			if (modelAccess.isCssClassValid()) {
				setCSSClass(control, modelAccess.getCssClass());
			} else {
				setCSSClass(control, CSS_CLASS__CONTROL);
			}

			if (modelAccess.isSpacing()) {
				control.setData(CssConstants.SPACING_ENABLED,
						CssConstants.SPACING_ENABLED);
			}

			renderChildren(false);
		}

		return controlBase;
	}

	@Override
	public Composite getWidget() {
		return controlBase;
	}

	@Override
	public boolean isRendered() {
		return controlBase != null;
	}

	@Override
	protected void internalDispose() {
		unrender();
	}

	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			control = null;

			// unrender the childs
			for (IWidgetPresentation<?> child : getChildren()) {
				child.unrender();
			}
		}
	}

	@Override
	public void renderChildren(boolean force) {
		if (force) {
			unrenderChildren();
			for (IWidgetPresentation<?> presentation : getChildren()) {
				// render the widget
				createChildWidget(presentation);
			}
		} else {
			// ensure, that the widget is inserted into its correct position
			//
			int index = -1;
			for (IWidgetPresentation<?> presentation : getChildren()) {
				index++;
				if (presentation.isRendered()) {
					continue;
				}
				internalInsert(presentation, index);
			}
		}
	}

	/**
	 * Will unrender all children.
	 */
	protected void unrenderChildren() {
		for (IWidgetPresentation<?> presentation : getChildren()) {
			if (presentation.isRendered()) {
				presentation.unrender();
			}
		}
	}

	/**
	 * Is called to create the widget for the given presentation. If the
	 * presentation is not rendered yet, null will be returned.
	 * 
	 * @param childPresentation
	 *            The presentation that should become a child presentation
	 * @return childWidget
	 */
	protected Control createChildWidget(IWidgetPresentation<?> childPresentation) {
		if (!isRendered()) {
			return null;
		}
		Control childControl = (Control) childPresentation
				.createWidget(control);
		childControl
				.setLayoutData(createGridDataForChild(findCellstyleFor(childPresentation)));
		return childControl;
	}

	/**
	 * Returns the cell style for the given presentation.
	 * 
	 * @param childPresentation
	 *            the presentation
	 * @return cellStyle
	 */
	protected YGridLayoutCellStyle findCellstyleFor(
			IWidgetPresentation<?> childPresentation) {
		YEmbeddable yEmbeddable = (YEmbeddable) childPresentation
				.getModel();
		YGridLayoutCellStyle result = null;
		for (YGridLayoutCellStyle yStyle : modelAccess.getCellStyles()) {
			if (yStyle.getTarget() == yEmbeddable) {
				result = yStyle;
				break;
			}
		}
		return result;
	}

	/**
	 * Creates an instance of grid data an adds defaults to it.
	 * 
	 * @param yStyle
	 *            the cell style
	 * @return the grid data for the component
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	protected GridData createGridDataForChild(YGridLayoutCellStyle yStyle) {
		// END SUPRESS CATCH EXCEPTION
		GridData data = new GridData();

		// calculate the spanning of the element
		//
		int col1 = -1;
		int row1 = -1;
		int col2 = -1;
		int row2 = -1;
		if (yStyle != null) {
			YSpanInfo ySpanInfo = yStyle.getSpanInfo();
			if (ySpanInfo != null) {
				col1 = ySpanInfo.getColumnFrom();
				row1 = ySpanInfo.getRowFrom();
				col2 = ySpanInfo.getColumnTo();
				row2 = ySpanInfo.getRowTo();
			}
		}

		if (col1 >= 0 && row1 >= 0 && (col1 < col2 || row1 < row2)) {
			data.horizontalSpan = col2 - col1 + 1;
			data.verticalSpan = row2 - row1 + 1;
		} else {
			LOGGER.warn("Invalid span: col1 {}, row1 {}, col2 {}, row2{}",
					new Object[] { col1, row1, col2, row2 });
		}

		// calculate and apply the alignment to be used
		//
		YAlignment yAlignment = yStyle != null
				&& yStyle.getAlignment() != null ? yStyle.getAlignment() : null;
		if (yAlignment != null) {
			// apply the alignment as specified
			applyAlignment(data, yAlignment);
		} else {
			// use default
			yAlignment = YAlignment.TOP_LEFT;

			if (modelAccess.isFillVertical()) {
				// ensure that vertical alignment is FILL
				yAlignment = mapToVerticalFill(yAlignment);
			}
			if (modelAccess.isFillHorizontal()) {
				// ensure that horizontal alignment is FILL
				yAlignment = mapToHorizontalFill(yAlignment);
			}

			// apply the alignment
			applyAlignment(data, yAlignment);
		}

		return data;
	}

	/**
	 * Sets the alignment to the component.
	 * 
	 * @param data
	 *            grid data
	 * @param yAlignment
	 *            the alignment
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	protected void applyAlignment(GridData data, YAlignment yAlignment) {
		// END SUPRESS CATCH EXCEPTION

		// reset the grab excess space settings
		data.grabExcessHorizontalSpace = false;
		data.grabExcessVerticalSpace = false;

		if (yAlignment != null) {
			switch (yAlignment) {
			case BOTTOM_CENTER:
				data.verticalAlignment = SWT.BOTTOM;
				data.horizontalAlignment = SWT.CENTER;
				break;
			case BOTTOM_FILL:
				data.verticalAlignment = SWT.BOTTOM;
				data.horizontalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				break;
			case BOTTOM_LEFT:
				data.verticalAlignment = SWT.BOTTOM;
				data.horizontalAlignment = SWT.LEFT;
				break;
			case BOTTOM_RIGHT:
				data.verticalAlignment = SWT.BOTTOM;
				data.horizontalAlignment = SWT.RIGHT;
				break;
			case MIDDLE_CENTER:
				data.verticalAlignment = SWT.CENTER;
				data.horizontalAlignment = SWT.CENTER;
				break;
			case MIDDLE_FILL:
				data.verticalAlignment = SWT.CENTER;
				data.horizontalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				break;
			case MIDDLE_LEFT:
				data.verticalAlignment = SWT.CENTER;
				data.horizontalAlignment = SWT.LEFT;
				break;
			case MIDDLE_RIGHT:
				data.verticalAlignment = SWT.CENTER;
				data.horizontalAlignment = SWT.RIGHT;
				break;
			case TOP_CENTER:
				data.verticalAlignment = SWT.TOP;
				data.horizontalAlignment = SWT.CENTER;
				break;
			case TOP_FILL:
				data.verticalAlignment = SWT.TOP;
				data.horizontalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				break;
			case TOP_LEFT:
				data.verticalAlignment = SWT.TOP;
				data.horizontalAlignment = SWT.LEFT;
				break;
			case TOP_RIGHT:
				data.verticalAlignment = SWT.TOP;
				data.horizontalAlignment = SWT.RIGHT;
				break;
			case FILL_CENTER:
				data.verticalAlignment = SWT.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = SWT.CENTER;
				break;
			case FILL_FILL:
				data.verticalAlignment = SWT.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				break;
			case FILL_LEFT:
				data.verticalAlignment = SWT.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = SWT.LEFT;
				break;
			case FILL_RIGHT:
				data.verticalAlignment = SWT.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = SWT.RIGHT;
				break;
			default:
				// nothing to do
				break;
			}
		}
	}

	/**
	 * Maps the vertical part of the alignment to FILL.
	 * 
	 * @param yAlignment
	 *            the alignment
	 * @return alignment the mapped alignment
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	protected YAlignment mapToVerticalFill(YAlignment yAlignment) {
		// END SUPRESS CATCH EXCEPTION
		if (yAlignment != null) {
			switch (yAlignment) {
			case BOTTOM_CENTER:
			case MIDDLE_CENTER:
			case TOP_CENTER:
				return YAlignment.FILL_CENTER;
			case BOTTOM_FILL:
			case MIDDLE_FILL:
			case TOP_FILL:
				return YAlignment.FILL_FILL;
			case BOTTOM_LEFT:
			case MIDDLE_LEFT:
			case TOP_LEFT:
				return YAlignment.FILL_LEFT;
			case BOTTOM_RIGHT:
			case MIDDLE_RIGHT:
			case TOP_RIGHT:
				return YAlignment.FILL_RIGHT;
			case FILL_FILL:
			case FILL_LEFT:
			case FILL_RIGHT:
			case FILL_CENTER:
				return YAlignment.FILL_FILL;
			default:
				break;
			}
		}
		return YAlignment.FILL_FILL;
	}

	/**
	 * Maps the horizontal part of the alignment to FILL.
	 * 
	 * @param yAlignment
	 *            the alignment
	 * @return alignment the mapped alignment
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	protected YAlignment mapToHorizontalFill(YAlignment yAlignment) {
		// END SUPRESS CATCH EXCEPTION
		if (yAlignment != null) {
			switch (yAlignment) {
			case BOTTOM_CENTER:
			case BOTTOM_FILL:
			case BOTTOM_LEFT:
			case BOTTOM_RIGHT:
				return YAlignment.BOTTOM_FILL;
			case MIDDLE_CENTER:
			case MIDDLE_FILL:
			case MIDDLE_LEFT:
			case MIDDLE_RIGHT:
				return YAlignment.MIDDLE_FILL;
			case TOP_CENTER:
			case TOP_FILL:
			case TOP_LEFT:
			case TOP_RIGHT:
				return YAlignment.TOP_FILL;
			case FILL_FILL:
			case FILL_LEFT:
			case FILL_RIGHT:
			case FILL_CENTER:
				return YAlignment.FILL_FILL;
			default:
				break;
			}
		}
		return YAlignment.FILL_FILL;
	}

	@Override
	protected void internalAdd(IWidgetPresentation<?> presentation) {
		// render the widget
		createChildWidget(presentation);
	}

	@Override
	protected void internalRemove(IWidgetPresentation<?> presentation) {
		// unrender the presentation
		presentation.unrender();
	}

	@Override
	protected void internalInsert(IWidgetPresentation<?> presentation, int index) {
		// render the widget
		Control childControl = (Control) createChildWidget(presentation);
		Control[] children = control.getChildren();
		if (index > children.length) {
			throw new RuntimeException(String.format(
					"Insert at index %d not possible. Children count = %d",
					index, children.length));
		}

		if (index == children.length - 1) {
			// nothing to do. Control was added at the end.
		} else {
			// determine the next control, and move the given control before it.
			Control nextControl = children[index];
			childControl.moveAbove(nextControl);
		}
	}

	@Override
	protected void internalMove(IWidgetPresentation<?> presentation,
			int oldIndex, int newIndex) {

		if (!presentation.isRendered()) {
			throw new RuntimeException(
					"Presentation is not rendered yet. Move not possible.");
		}

		if (oldIndex == newIndex) {
			return;
		}

		Control childControl = (Control) presentation.getWidget();
		Control[] children = control.getChildren();
		if (newIndex < oldIndex) {
			// determine the next control, and move the given control before it.
			Control nextControl = children[newIndex];
			childControl.moveAbove(nextControl);
		} else {
			// determine the previous control, and move the given control after
			// it.
			Control previousControl = children[newIndex];
			childControl.moveBelow(previousControl);
		}
	}

	/**
	 * An internal helper class.
	 */
	private static class ModelAccess {
		private final YGridLayout yLayout;

		public ModelAccess(YGridLayout yLayout) {
			super();
			this.yLayout = yLayout;
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yLayout.getCssClass();
		}

		/**
		 * Returns true, if the css class is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssClassValid() {
			return getCssClass() != null && !getCssClass().equals("");
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YGridLayout#isSpacing()
		 */
		public boolean isSpacing() {
			return yLayout.isSpacing();
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YCssAble#getCssID()
		 */
		public String getCssID() {
			return yLayout.getCssID();
		}

		/**
		 * Returns true, if the css id is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssIdValid() {
			return getCssID() != null && !getCssID().equals("");
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YGridLayout#isMargin()
		 */
		public boolean isMargin() {
			return yLayout.isMargin();
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YGridLayout#getColumns()
		 */
		public int getColumns() {
			int columns = yLayout.getColumns();
			return columns <= 0 ? 2 : columns;
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YGridLayout#getCellStyles()
		 */
		public EList<YGridLayoutCellStyle> getCellStyles() {
			return yLayout.getCellStyles();
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YGridLayout#isFillVertical()
		 */
		public boolean isFillHorizontal() {
			return yLayout.isFillHorizontal();
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YGridLayout#isFillVertical()
		 */
		public boolean isFillVertical() {
			return yLayout.isFillVertical();
		}

	}
}
