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
package org.eclipse.emf.ecp.ecview.databinding.tests.bean.model;

public class BPerson extends AbstractBean {

	private BAddress address;

	/**
	 * @return the address
	 */
	public BAddress getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(BAddress address) {
		firePropertyChanged("address", this.address, this.address = address);
	}

	/**
	 * Creates a new instance of person. All references are properly setup and
	 * the isoCode of the country is set to the given value.
	 * 
	 * @param isoCode
	 * @return
	 */
	public static BPerson newInstance(String isoCode) {
		BPerson person = new BPerson();
		BAddress address = new BAddress();
		person.setAddress(address);
		BCountry country = new BCountry();
		country.setIsoCode(isoCode);
		address.setCountry(country);
		return person;
	}

}
