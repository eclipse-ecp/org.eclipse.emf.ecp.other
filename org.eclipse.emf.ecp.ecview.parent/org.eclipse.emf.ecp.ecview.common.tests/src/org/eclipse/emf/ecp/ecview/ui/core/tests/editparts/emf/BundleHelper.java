package org.eclipse.emf.ecp.ecview.ui.core.tests.editparts.emf;

import java.util.HashSet;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class BundleHelper {

	public static void ensure() {
		BundleContext context = Activator.getContext();

		Set<String> required = new HashSet<String>();
		required.add("org.eclipse.equinox.common");
		required.add("org.eclipse.equinox.ds");
		required.add("org.eclipse.equinox.log");
		required.add("org.eclipse.equinox.common");
		required.add("org.eclipse.equinox.common");
		required.add("org.eclipse.equinox.common");
		required.add("org.eclipse.equinox.common");
		required.add("org.eclipse.equinox.common");
		for (Bundle bundle : context.getBundles()) {

		}
	}

}
