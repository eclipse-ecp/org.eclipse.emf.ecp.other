package org.eclipse.emf.ecp.ui.uimodel.core.editparts.uri;

import java.net.URI;

public class ViewScope implements IScope {

	public static final String SEGMENT = "view://";
	protected IScope following;

	public URI toURI() {
		return URI.create(append(""));
	}

	/**
	 * Creates a bean scope for the given selector.
	 * 
	 * @param selector
	 * @return
	 */
	BeanScope bean(String selector) {
		BeanScope following = new BeanScope(this, selector);
		this.following = following;
		return following;
	}

	/**
	 * Creates a service scope for the given selector.
	 * 
	 * @param selector
	 * @return
	 */
	ServiceScope service(String selector) {
		ServiceScope following = new ServiceScope(this, selector);
		this.following = following;
		return following;
	}

	@Override
	public String append(String lefthandToken) {
		StringBuilder builder = new StringBuilder(lefthandToken);
		builder.append(SEGMENT);
		builder.append(following.append(builder.toString()));
		return builder.toString();
	}

}
