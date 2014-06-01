/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.eclipse.emf.ecp.ecview.common.model.binding.BindingFactory;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YValueBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelFactory;
import org.junit.Test;

public class YBindingSetTest {
	private BindingFactory factory = BindingFactory.eINSTANCE;

	@Test
	public void test_addBinding() {
		YBindingSet set = factory.createYBindingSet();
		assertEquals(0, set.getBindings().size());

		YValueBindingEndpoint value1 = CoreModelFactory.eINSTANCE
				.createYContextValueBindingEndpoint();
		YValueBindingEndpoint value2 = CoreModelFactory.eINSTANCE
				.createYContextValueBindingEndpoint();

		YBinding binding = set.addBinding(value1, value2);
		assertEquals(1, set.getBindings().size());
		assertSame(value1, binding.getTargetEndpoint());
		assertSame(value2, binding.getModelEndpoint());

	}
}
