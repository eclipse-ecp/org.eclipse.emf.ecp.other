/*******************************************************************************
 * Copyright (c) 2011-2012 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Eike Stepper - initial API and implementation
 * Eugen Neufeld - JavaDoc
 *******************************************************************************/
package org.eclipse.emf.ecp.reflective.handlers;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecp.reflective.Activator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * 
 * @author Tobias Verhoeven
 */
public class ReflectiveEPackageHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public ReflectiveEPackageHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
	
		FileDialog fileDialog = new FileDialog(window.getShell(), SWT.OPEN);
		fileDialog.setText("Open");
		fileDialog.setFilterExtensions(new String[]{"ecore"});
		//fileDialog.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());

		String path = fileDialog.open();
		if (path != null) {
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new EcoreResourceFactoryImpl());
			Resource resource = resourceSet.getResource(URI.createFileURI(path), true);
			EPackage ePackage = (EPackage) resource.getContents().get(0);		
			registerEPackage(ePackage,window.getShell());
		}
		return null;
	}
	
	public void registerEPackage(EPackage ePackage,Shell shell)  {
			List<EPackage> packages = EPackageHelper.getAllSubPackages(ePackage);
			Set<EPackage> rmPackages = new LinkedHashSet<EPackage>();
			packages.add(ePackage);

			// check for subpackages that are already registered
			for (EPackage subPkg : packages) {
				if (EPackage.Registry.INSTANCE.getEPackage(subPkg.getNsURI()) != null) {
					rmPackages.add(subPkg);
				}
			}
			packages.removeAll(rmPackages);

			// remove subpackages that are already registered from
			// input-EPackage, the diff-package is registered and saved.
			EPackageHelper.removeSubPackages(ePackage, rmPackages);

			if (packages.isEmpty()) {
				MessageDialog.openError(shell,"Error",
					"Registration failed: Package(s) with supplied NsUris(s) is/are already registred!");
				return;
			}

			// Save the EPackages to disc as an "ecore"-file
			String uriFileName = null;
			try {
				uriFileName = URLEncoder.encode(ePackage.getNsURI(), "UTF-8");
			} catch (UnsupportedEncodingException e1) {
				MessageDialog.openError(shell,"Error","Registration failed: Could not convert NsUri to filename!");
				return;
			}
			
			
			URI fileUri = URI.createFileURI(Activator.getDefault().location + "/" + uriFileName
				+ (uriFileName.endsWith(".ecore") ? "" : ".ecore"));

			// create a resource to save the file to disc
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new EcoreResourceFactoryImpl());
			Resource resource = resourceSet.createResource(fileUri);
			resource.getContents().add(ePackage);

			try {
				resource.save(null);
			} catch (IOException e) {
				e.printStackTrace();
				MessageDialog.openError(shell,"Error","Cannot save imported Ecore! Import canceled.");
				return;
			}		
			// Finally register EPackages in global EPackage-registry.
			for (EPackage registerPackage : packages) {
				EPackage.Registry.INSTANCE.put(registerPackage.getNsURI(), registerPackage);
			}
			MessageDialog.openInformation(shell, "Info", "EPackage \"" + ePackage.getNsURI() + "\" registered and saved.");
	}
}
