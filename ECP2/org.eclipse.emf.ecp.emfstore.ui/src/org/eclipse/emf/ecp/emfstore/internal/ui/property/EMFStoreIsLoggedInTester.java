/*******************************************************************************
 * Copyright (c) 2011-2012 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eugen Neufeld - initial API and implementation
 * 
 *******************************************************************************/

package org.eclipse.emf.ecp.emfstore.internal.ui.property;

import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProvider;
import org.eclipse.emf.ecp.spi.core.InternalRepository;
import org.eclipse.emf.emfstore.internal.client.model.ServerInfo;
import org.eclipse.emf.emfstore.internal.client.model.Usersession;
import org.eclipse.emf.emfstore.internal.client.model.util.EMFStoreCommandWithResult;

import org.eclipse.core.expressions.PropertyTester;

/**
 * This tests whether a user is loggedIn to a specific repository.
 * 
 * @author Eugen Neufeld
 */
public class EMFStoreIsLoggedInTester extends PropertyTester {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[],
	 *      java.lang.Object)
	 */
	public boolean test(Object receiver, String property, Object[] args, final Object expectedValue) {
		if (receiver instanceof ECPRepository && expectedValue instanceof Boolean) {
			final ECPRepository ecpRepository = (ECPRepository) receiver;
			final ServerInfo serverInfo = EMFStoreProvider.INSTANCE.getServerInfo((InternalRepository) ecpRepository);
			EMFStoreCommandWithResult<Boolean> command = new EMFStoreCommandWithResult<Boolean>() {
				@Override
				protected Boolean doRun() {
					Usersession usersession = serverInfo.getLastUsersession();
					Boolean ret = new Boolean(usersession != null && usersession.isLoggedIn());
					return ret.equals(expectedValue);
				}
			};
			Boolean result = command.run(false);
			return result;
		}
		return false;
	}

}
