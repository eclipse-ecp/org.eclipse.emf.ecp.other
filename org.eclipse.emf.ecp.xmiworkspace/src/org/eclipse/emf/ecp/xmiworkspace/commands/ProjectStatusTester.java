/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * Technische Universitaet Muenchen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.ecp.xmiworkspace.commands;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecp.xmiworkspace.XmiUtil.PROJECT_STATUS;
import org.eclipse.emf.ecp.xmiworkspace.structure.XMIECPFileProject;
import org.eclipse.emf.ecp.xmiworkspace.structure.XMIECPProject;

/**
 * PropertyTester for checking whether the project status is "failed".
 * @author kraftm, maierma
 *
 */
public class ProjectStatusTester extends PropertyTester {
	
	/**
	 * Return true when the project is a XMIECPFilePRoject and the project's status is "failed" or "duplicated".
	 * {@inheritDoc}
	 */
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		// cast the receiver to XMIECPProject
		if (receiver instanceof XMIECPProject){
			XMIECPFileProject project = (XMIECPFileProject) receiver;
			
			// if the status is failed or duplicated tell the menu to show the "resolve" entry
			if (project.getProjectStatus() == PROJECT_STATUS.FAILED ||
					project.getProjectStatus() == PROJECT_STATUS.DUPLICATED) {
				return true;
			}
		}
		
		return false;
	}
}
