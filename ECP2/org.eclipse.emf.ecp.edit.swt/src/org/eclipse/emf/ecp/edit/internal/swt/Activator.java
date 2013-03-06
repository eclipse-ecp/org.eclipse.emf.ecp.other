/*******************************************************************************
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
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
package org.eclipse.emf.ecp.edit.internal.swt;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import org.osgi.framework.BundleContext;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The activator class controls the plug-in life cycle.
 */
public class Activator extends Plugin {

	/** The plug-in ID. **/
	public static final String PLUGIN_ID = "org.eclipse.emf.ecp.edit.swt"; //$NON-NLS-1$

	/** The shared instance. **/
	private static Activator plugin;

	/**
	 * The constructor.
	 */
	public Activator() {
	}

	// BEGIN SUPRESS CATCH EXCEPTION
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
		for (ImageDescriptorToImage descriptorToImage : imageRegistry.values()) {
			descriptorToImage.getImage().dispose();
		}
	}

	// END SUPRESS CATCH EXCEPTION
	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Logs exception.
	 * 
	 * @param e the {@link Exception} to log
	 */
	public static void logException(Exception e) {
		getDefault().getLog().log(
			new Status(IStatus.ERROR, Activator.getDefault().getBundle().getSymbolicName(), e.getMessage(), e));
	}

	// TODO check if necessary
	private Map<String, ImageDescriptorToImage> imageRegistry = new LinkedHashMap<String, ImageDescriptorToImage>(20,
		.8F, true) {
		// This method is called just after a new entry has been added
		@Override
		public boolean removeEldestEntry(Map.Entry eldest) {
			return size() > 20;
		}

		@Override
		public ImageDescriptorToImage remove(Object arg0) {
			ImageDescriptorToImage image = super.remove(arg0);
			image.getImage().dispose();
			return image;
		}

	};

	public static Image getImage(String path) {
		if (!getDefault().imageRegistry.containsKey(path)) {
			getDefault().imageRegistry.put(path,
				new ImageDescriptorToImage(ImageDescriptor.createFromURL(getDefault().getBundle().getResource(path))));
		}
		return getDefault().imageRegistry.get(path).getImage();

	}

	public static Image getImage(URL url) {
		if (!getDefault().imageRegistry.containsKey(url.toExternalForm())) {
			getDefault().imageRegistry.put(url.toExternalForm(),
				new ImageDescriptorToImage(ImageDescriptor.createFromURL(url)));
		}
		return getDefault().imageRegistry.get(url.toExternalForm()).getImage();

	}

	public static ImageDescriptor getImageDescriptor(String path) {
		if (!getDefault().imageRegistry.containsKey(path)) {
			getDefault().imageRegistry.put(path,
				new ImageDescriptorToImage(ImageDescriptor.createFromURL(getDefault().getBundle().getResource(path))));
		}
		return getDefault().imageRegistry.get(path).getImageDescriptor();

	}
}
