package org.eclipse.emf.ecp.ui.uimodel.core.editparts.uri;

public class ServiceScope implements IScope {

	private static final String SEGMENT_SERVICE = "/service/";
	private String selector;
	private ViewScope viewScope;

	public ServiceScope(ViewScope viewScope, String selector) {
		this.viewScope = viewScope;
		this.selector = selector;
	}

	@Override
	public String append(String lefthandToken) {
		StringBuilder builder = new StringBuilder(lefthandToken);
		builder.append(SEGMENT_SERVICE);
		builder.append(selector);
		return builder.toString();
	}
}
