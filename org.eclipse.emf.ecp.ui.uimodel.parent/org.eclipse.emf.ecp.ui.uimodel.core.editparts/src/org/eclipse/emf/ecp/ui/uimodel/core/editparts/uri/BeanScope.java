package org.eclipse.emf.ecp.ui.uimodel.core.editparts.uri;

public class BeanScope implements IScope {

	private static final String SEGMENT_BEAN = "/bean/";
	private ViewScope viewScope;
	private String selector;

	public BeanScope(ViewScope viewScope, String selector) {
		this.viewScope = viewScope;
		this.selector = selector;
	}

	@Override
	public String append(String lefthandToken) {
		StringBuilder builder = new StringBuilder(lefthandToken);
		builder.append(SEGMENT_BEAN);
		builder.append(selector);
		return builder.toString();
	}

}
