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
package org.eclipse.emf.ecp.emfstore.internal.ui;

import org.eclipse.emf.ecp.core.util.ECPCheckoutSource;
import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProjectWrapper;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProvider;
import org.eclipse.emf.ecp.spi.ui.DefaultUIProvider;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESRemoteProject;
import org.eclipse.emf.emfstore.client.exceptions.ESCertificateStoreException;
import org.eclipse.emf.emfstore.internal.client.model.connectionmanager.KeyStoreManager;
import org.eclipse.emf.emfstore.internal.client.ui.views.emfstorebrowser.views.CertificateSelectionDialog;
import org.eclipse.emf.emfstore.server.exceptions.ESException;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import java.util.ArrayList;

/**
 * This class provides EMFStore specific UI.
 * 
 * @author Eugen Neufeld
 */
public class EMFStoreUIProvider extends DefaultUIProvider {

	/**
	 * The constructor.
	 */
	public EMFStoreUIProvider() {
		super(EMFStoreProvider.NAME);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getAdapter(Object adaptable, Class<T> adapterType) {
		if (ESRemoteProject.class.isInstance(adaptable) && adapterType.equals(ESLocalProject.class)) {
			ESRemoteProject checkoutData = (ESRemoteProject) adaptable;
			try {
				return (T) checkoutData.checkout(new NullProgressMonitor());
			} catch (ESException e) {
				Activator.log(e);
				// BEGIN SUPRESS CATCH EXCEPTION
			} catch (RuntimeException e) {
				Activator.log(e);
				// END SUPRESS CATCH EXCEPTION
			} finally {
			}
		}
		return super.getAdapter(adaptable, adapterType);
	}

	@Override
	public Control createCheckoutUI(Composite parent, ECPCheckoutSource checkoutSource, ECPProperties projectProperties) {
		return null;
	}

	@Override
	public Control createAddRepositoryUI(Composite parent, final ECPProperties repositoryProperties,
		final Text repositoryNameText, Text repositoryLabelText, Text repositoryDescriptionText) {

		GridLayout mainLayout = new GridLayout(3, false);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(mainLayout);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		// use label width of main composite as minimum label width
		Label url = new Label(composite, 0);
		url.setText("Url:");
		int mcLabelWidth = parent.getParent().getChildren()[0].getSize().x;
		if (mcLabelWidth > url.getSize().x) {
			GridData gdUrl = new GridData();
			gdUrl.widthHint = mcLabelWidth;
			url.setLayoutData(gdUrl);
		}

		final Text urlText = new Text(composite, SWT.BORDER);
		urlText.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
		urlText.addModifyListener(new ModifyListener() {
			private String oldText = "";

			public void modifyText(ModifyEvent e) {
				if (oldText.equals(repositoryNameText.getText())) {
					oldText = urlText.getText();
					repositoryNameText.setText(oldText);
					repositoryProperties.addProperty(EMFStoreProvider.PROP_REPOSITORY_URL, oldText);
				}
			}
		});

		Label port = new Label(composite, 0);
		port.setText("Port:");
		final Text portText = new Text(composite, SWT.BORDER);
		portText.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false, 2, 1));
		portText.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				repositoryProperties.addProperty(EMFStoreProvider.PROP_PORT, portText.getText());
			}

		});

		Label cert = new Label(composite, 0);
		cert.setText("Certificate:");
		final Text certificateText = new Text(composite, SWT.BORDER);
		certificateText.setEditable(false);
		certificateText.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

		Button bSelectCertificate = new Button(composite, SWT.PUSH);
		// TODO change text
		bSelectCertificate.setText("Select Certificate");
		bSelectCertificate.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				// open dialog
				String certificate = selectCertificate();
				certificateText.setText(certificate);
				repositoryProperties.addProperty(EMFStoreProvider.PROP_CERTIFICATE, certificateText.getText());

			}

			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});

		urlText.setText("localhost");
		portText.setText("8080");
		certificateText.setText(KeyStoreManager.getInstance().getDefaultCertificate());
		// else the certificate is not set
		repositoryProperties.addProperty(EMFStoreProvider.PROP_CERTIFICATE, certificateText.getText());
		return composite;
	}

	/**
	 * @return
	 */
	private String selectCertificate() {
		CertificateSelectionDialog csd = new CertificateSelectionDialog(Display.getCurrent().getActiveShell(),
			new LabelProvider() {
				@Override
				public String getText(Object element) {
					if (element instanceof String) {
						return element.toString();
					}

					return "";

				}
			});
		ArrayList<String> certificates;
		try {
			certificates = KeyStoreManager.getInstance().getCertificates();
			csd.setElements(certificates.toArray());
		} catch (ESCertificateStoreException e1) {
			csd.setErrorMessage(e1.getMessage());
		}
		csd.setBlockOnOpen(true);
		csd.setTitle("Certificate Selection Dialog");
		csd.open();
		if (csd.getReturnCode() == Window.OK) {
			return csd.getCertificateAlias();
		}
		return "";
	}

	@Override
	public String getText(Object element) {
		if (element instanceof EMFStoreProjectWrapper) {
			EMFStoreProjectWrapper emfStoreProjectWrapper = (EMFStoreProjectWrapper) element;
			return emfStoreProjectWrapper.getDefaultCheckoutName();
		}

		return super.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof EMFStoreProjectWrapper) {
			return Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/projectinfo.png").createImage();
		}

		return super.getImage(element);
	}

}
