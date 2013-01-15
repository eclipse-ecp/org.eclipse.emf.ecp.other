package org.eclipse.emf.ecp.ui.uimodel.core.editparts.uri;

public interface IScope {

	/**
	 * Appends the uri token produced by that scope to the given lefthandToken
	 * and returns it.
	 * 
	 * @param lefthandToken
	 * @return
	 */
	String append(String lefthandToken);

}
