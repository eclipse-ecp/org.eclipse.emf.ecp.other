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
package org.eclipse.emf.ecp.xmiworkspace;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.common.model.AbstractECPMetaModelElementContext;
import org.eclipse.emf.ecp.common.model.ECPAssociationClassElement;
import org.eclipse.emf.emfstore.common.CommonUtil;

/**
 * Context each project is in. The context manages the models used for each
 * project. They can be configured by the user with the "Configure Models..."
 * menu-entry in the popupmenu when the user right-clicks on the project.
 * @author matti, markus
 *
 */
public class XMIMetaModelElementContext extends AbstractECPMetaModelElementContext {
	
	/**
	 * Project specific model.
	 */
	private List<String> model;

	/**
	 * Context of the project containing related model.
	 * @param project
	 */
	public XMIMetaModelElementContext() {
		this.model = new ArrayList<String>();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Set<EClass> getAllModelElementEClassesImpl() {
		// filter all classes for the registered ones.
		Set<EClass> result = new HashSet<EClass>();
		
		Set<EClass> allModels = CommonUtil.getAllModelElementEClasses();
		Iterator<EClass> iterator = allModels.iterator();
		
		while(iterator.hasNext()) {
			EClass next = iterator.next();
			
			if(this.model.contains(next.getEPackage().getNsPrefix())) {
				result.add(next);
			}
		}
		
		// if there is no package registered, just return all packages
		if(result.size() == 0) {
			// filter our own package and remove it from the result set
			Set<EClass> allModelClasses = CommonUtil.getAllModelElementEClasses();
			Iterator<EClass> it = allModelClasses.iterator();
			while(it.hasNext()) {
				EClass clazz = it.next();
				if(clazz.getEPackage().getNsPrefix() != XmiUtil.XMI_MODELNAME) {
					result.add(clazz);
				}
			}
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isNonDomainElement(EClass eClass) {
		return false; // CAUTION: this feature is not supported by this plugin!
	}
	
	/**
	 * Adds a model to the model context of the project.
	 * @param model URI of the model
	 */
	public void addModel(String model) {
		if(!this.model.contains(model)) {
			this.model.add(model);
		}
	}
	
	/**
	 * Removes a model from the model context of the project.
	 * @param model URI of the model
	 */
	public void removeModel(String model) {
		this.model.remove(model);
	}
	
	/**
	 * Returns a list of all models registered in this project.
	 * @return List of all models as strings.
	 */
	public List<String> getModels() {
		List<String> result = new ArrayList<String>();
		result.addAll(this.model);
		return result;
	}
	
	/**
	 * Removes all models from context.
	 */
	public void clearModels() {
		this.model.clear();
	}

	/**
	 * {@inheritDoc}
	 */
	public ECPAssociationClassElement getAssociationClassElement(EObject eObject) {
		return null;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public boolean isAssociationClassElement(EClass clazz) {
		// CAUTION: this feature is not supported by this plugin!
		return false;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public boolean isAssociationClassElement(EObject eObject) {
		// CAUTION: this feature is not supported by this plugin!
		return false;
	}
}
