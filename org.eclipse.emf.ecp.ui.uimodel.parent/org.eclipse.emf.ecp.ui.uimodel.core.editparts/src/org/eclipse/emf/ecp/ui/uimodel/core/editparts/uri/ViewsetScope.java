package org.eclipse.emf.ecp.ui.uimodel.core.editparts.uri;

public class ViewsetScope extends ViewScope {

	public static final String SEGMENT = "viewset://";

	@Override
	public String append(String lefthandToken) {
		StringBuilder builder = new StringBuilder(lefthandToken);
		builder.append(SEGMENT);
		builder.append(following.append(builder.toString()));
		return builder.toString();
	}

}
