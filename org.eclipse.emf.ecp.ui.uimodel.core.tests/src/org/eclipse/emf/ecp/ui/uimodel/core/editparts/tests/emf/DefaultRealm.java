package org.eclipse.emf.ecp.ui.uimodel.core.editparts.tests.emf;

import org.eclipse.core.databinding.observable.Realm;

public class DefaultRealm extends Realm {

	public static void setup() {
		if (getDefault() == null) {
			setDefault(new DefaultRealm());
		}
	}

	@Override
	public boolean isCurrent() {
		return true;
	}
}
