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
package org.eclipse.emf.ecp.emfstorebridge;

import java.util.Arrays;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.common.model.AbstractECPMetaModelElementContext;
import org.eclipse.emf.ecp.common.model.ECPAssociationClassElement;
import org.eclipse.emf.ecp.common.model.ECPMetaModelElementContext;
import org.eclipse.emf.emfstore.common.model.AssociationClassElement;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;

/**
 * {@link AbstractECPMetaModelElementContext} for the EMFStore.
 * 
 * @author helming
 */
public class EMFStoreMetaModelElementContext extends AbstractECPMetaModelElementContext {
	
	/**
	 * Initializes the singleton instance statically.
	 */
	private static class SingletonHolder { 
		public static final EMFStoreMetaModelElementContext INSTANCE = new EMFStoreMetaModelElementContext();
	}

	/**
	 * Singleton.
	 * 
	 * @return the instance
	 */
	public static ECPMetaModelElementContext getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecp.model.ECPMetaModelElementContext#isAssociationClassElement(org.eclipse.emf.ecore.EClass)
	 */
	public boolean isAssociationClassElement(EClass eClazz) {
		return ModelUtil.isAssociationClassElement(eClazz);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecp.model.workSpaceModel.ECPProject#getAssociationClassElement(org.eclipse.emf.ecore.EObject)
	 */
	public ECPAssociationClassElement getAssociationClassElement(EObject eObject) {

		if (isAssociationClassElement(eObject)) {
			AssociationClassElement ace = (AssociationClassElement) eObject;
			return new ECPAssociationClassElement(ace.getSourceFeature(), ace.getTargetFeature(),
				ace.getAssociationFeatures());
		}

		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecp.model.ECPMetaModelElementContext#isAssociationClassElement(org.eclipse.emf.ecore.EObject)
	 */
	public boolean isAssociationClassElement(EObject eObject) {
		return isAssociationClassElement(eObject.eClass());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.ecp.model.AbstractECPMetaModelElementContext#isNonDomainElement(org.eclipse.emf.ecore.EClass)
	 */
	@Override
	public boolean isNonDomainElement(EClass eClass) {
		EClass nonDomainElementEClass = org.eclipse.emf.emfstore.common.model.ModelPackage.eINSTANCE.getNonDomainElement();
		Class<?> instanceClass = eClass.getInstanceClass();
		boolean isNonDomainElement = false;
		
		if (instanceClass != null) {
			for (Class<?> iface : Arrays.asList(instanceClass.getInterfaces())) {
				if (iface.getCanonicalName().equals(nonDomainElementEClass.getInstanceClassName())) {
					isNonDomainElement = true;
					break;
				}
			}
		}
		
		return isNonDomainElement || nonDomainElementEClass.isSuperTypeOf(eClass);
	}
}