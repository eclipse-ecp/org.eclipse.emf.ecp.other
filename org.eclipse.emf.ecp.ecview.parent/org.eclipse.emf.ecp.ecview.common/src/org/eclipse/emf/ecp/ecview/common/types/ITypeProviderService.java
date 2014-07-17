package org.eclipse.emf.ecp.ecview.common.types;

/**
 * This service is responsible to load classes which are not in the bundle
 * space. Therefore it delegates to registered parties.
 */
public interface ITypeProviderService {

	/**
	 * Returns the class for the given qualified name and type. For emf pass the EClass as clazz.
	 * 
	 * @param qualifiedName
	 * @return
	 */
	Class<?> forName(Object clazz, String qualifiedName);

}
