/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */

package org.eclipse.emf.ecp.ecview.ui.common.tests.uri;

import java.net.URI;

import org.eclipse.emf.ecp.ecview.common.uri.URIMapper;
import org.eclipse.emf.ecp.ecview.common.uri.URIMapper.Mapping;
import org.junit.Assert;
import org.junit.Test;

public class URIMapperTest {

	@Test
	public void testURI() {
		String uriStr = "view://bean/root/invoiceInfo#value.customer.address.country";
		URI uri = URI.create(uriStr);
		URIMapper uriMapper = new URIMapper();
		Mapping mapping = uriMapper.addURI(uri);
		Assert.assertEquals(
				URI.create("view://bean/root#value.invoiceInfo.customer.address.country"),
				mapping.getFragmentedURI());
		Assert.assertEquals(
				URI.create("view://bean/root/invoiceInfo/customer/address#value.country"),
				mapping.getPathedURI());
	}
}
