/*******************************************************************************
 * Copyright (c) 2011 Florian Pirchner
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.common.IResourceSetManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.common.ResourceSetManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.internal.OrphanViewsResource;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("restriction")
public class ResourceSetManagerTest {

	@Test
	public void test_getResource() {
		Resource r1_1 = ResourceSetManager.getInstance().getResource(UiModelPackage.eNS_URI);
		Resource r1_2 = ResourceSetManager.getInstance().getResource(UiModelPackage.eNS_URI);
		Assert.assertSame(r1_1, r1_2);

		Resource r2_1 = ResourceSetManager.getInstance().getResource(URI.createURI(UiModelPackage.eNS_URI));
		Resource r2_2 = ResourceSetManager.getInstance().getResource(URI.createURI(UiModelPackage.eNS_URI));
		Assert.assertSame(r2_1, r2_2);

		Resource r3_1 = ResourceSetManager.getInstance().getResource(
			IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING);
		Resource r3_2 = ResourceSetManager.getInstance().getResource(
			IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI_STRING);
		Assert.assertSame(r3_1, r3_2);
		Assert.assertTrue(r3_1 instanceof OrphanViewsResource);

		Resource r4_1 = ResourceSetManager.getInstance().getResource(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI);
		Resource r4_2 = ResourceSetManager.getInstance().getResource(IResourceSetManager.ORPHAN_VIEW_RESOURCE_URI);
		Assert.assertSame(r4_1, r4_2);
		Assert.assertTrue(r4_1 instanceof OrphanViewsResource);
	}
	
	@Test
	public void test_getResourceSet() {
		Assert.assertNotNull(ResourceSetManager.getInstance().getResourceSet());
	}
}
