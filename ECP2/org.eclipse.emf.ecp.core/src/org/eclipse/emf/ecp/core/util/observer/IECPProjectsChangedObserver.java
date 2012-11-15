/**
 * 
 */
package org.eclipse.emf.ecp.core.util.observer;

import org.eclipse.emf.ecp.core.ECPProject;

/**
 * @author Edgar
 * 
 */
public interface IECPProjectsChangedObserver extends IECPObserver {

	void projectsChanged(ECPProject[] oldProjects, ECPProject[] newProjects) throws Exception;

	void projectChanged(ECPProject project, boolean opened) throws Exception;

	void objectsChanged(ECPProject project, Object[] objects) throws Exception;
}