package org.eclipse.emf.ecp.ui.model.core.uimodel.util;

import org.eclipse.emf.ecp.ui.model.core.datatypes.DatatypesFactory;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YLabelDDesc;
import org.eclipse.emf.ecp.ui.model.core.datatypes.YTextDDesc;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiViewSet;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiLabel;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiSpanInfo;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiTextField;

public class SimpleModelFactory {

	/**
	 * Creates an instance of {@link YUiGridLayout}
	 * 
	 * @return
	 */
	public YUiGridLayout createGridLayout() {
		return UimodelExtensionFactory.eINSTANCE.createYUiGridLayout();
	}

	/**
	 * Creates an instance of {@link YUiGridLayoutCellStyle}
	 * 
	 * @return
	 */
	public YUiGridLayoutCellStyle createGridLayoutCellStyle() {
		return UimodelExtensionFactory.eINSTANCE.createYUiGridLayoutCellStyle();
	}

	/**
	 * Creates an instance of {@link YUiGridLayoutCellStyle}.
	 * 
	 * @param yComponent set as target
	 * @param yLayout style added to this layout
	 * @return
	 */
	public YUiGridLayoutCellStyle createGridLayoutCellStyle(YUiEmbeddable yComponent, YUiGridLayout yLayout) {
		YUiGridLayoutCellStyle yStyle = UimodelExtensionFactory.eINSTANCE.createYUiGridLayoutCellStyle();
		yStyle.setTarget(yComponent);
		yLayout.getCellStyles().add(yStyle);
		return yStyle;
	}

	/**
	 * Creates an instance of {@link YUiSpanInfo}
	 * 
	 * @return
	 */
	public YUiSpanInfo createSpanInfo() {
		return UimodelExtensionFactory.eINSTANCE.createYUiSpanInfo();
	}

	/**
	 * Creates an instance of {@link YUiSpanInfo}
	 * 
	 * @param yStyle The style where the span info should be added to
	 * @param col1 From / To column
	 * @param row1 From / To row
	 * 
	 * @return
	 */
	public YUiSpanInfo createSpanInfo(YUiGridLayoutCellStyle yStyle, int col1, int row1) {
		return createSpanInfo(yStyle, col1, row1, col1, row1);
	}

	/**
	 * Creates an instance of {@link YUiSpanInfo}
	 * 
	 * @param yStyle The style where the span info should be added to
	 * @param col1 From column
	 * @param row1 From row
	 * @param col2 To column
	 * @param row2 To row
	 * 
	 * @return
	 */
	public YUiSpanInfo createSpanInfo(YUiGridLayoutCellStyle yStyle, int col1, int row1, int col2, int row2) {
		YUiSpanInfo yInfo = createSpanInfo();
		yStyle.setSpanInfo(yInfo);

		yInfo.setColumnFrom(col1);
		yInfo.setRowFrom(row1);
		yInfo.setColumnTo(col2);
		yInfo.setRowTo(row2);

		return yInfo;
	}

	/**
	 * Creates an instance of {@link YUiTextField}
	 * 
	 * @return
	 */
	public YUiTextField createTextField() {
		return UimodelExtensionFactory.eINSTANCE.createYUiTextField();
	}

	/**
	 * Creates an instance of {@link YUiLabel}
	 * 
	 * @return
	 */
	public YUiLabel createLabel() {
		return UimodelExtensionFactory.eINSTANCE.createYUiLabel();
	}
	
	/**
	 * Creates an instance of {@link YUiView}
	 * 
	 * @return
	 */
	public YUiView createView() {
		return UiModelFactory.eINSTANCE.createYUiView();
	}

	/**
	 * Creates an instance of {@link YUiViewSet}
	 * 
	 * @return
	 */
	public YUiViewSet createViewSet() {
		return UiModelFactory.eINSTANCE.createYUiViewSet();
	}

	/**
	 * Creates the text datadescription
	 * 
	 * @return
	 */
	public YTextDDesc createTextDatadescription() {
		return DatatypesFactory.eINSTANCE.createYTextDDesc();
	}
	
	/**
	 * Creates the text datadescription
	 * 
	 * @return
	 */
	public YLabelDDesc createLabelDatadescription() {
		return DatatypesFactory.eINSTANCE.createYLabelDDesc();
	}

}
