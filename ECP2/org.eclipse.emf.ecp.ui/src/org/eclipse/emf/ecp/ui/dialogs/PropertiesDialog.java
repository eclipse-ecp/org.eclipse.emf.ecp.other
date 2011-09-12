/**
 * Copyright (c) 2011 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.dialogs;

import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.internal.ui.Activator;
import org.eclipse.emf.ecp.ui.widgets.PropertiesComposite;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author Eike Stepper
 */
public class PropertiesDialog extends TitleAreaDialog
{
  private final String title;

  private final String message;

  private final boolean editable;

  private final ECPProperties properties;

  public PropertiesDialog(Shell parentShell, String title, String message, boolean editable, ECPProperties properties)
  {
    super(parentShell);
    setShellStyle(SWT.RESIZE | SWT.TITLE | SWT.APPLICATION_MODAL);

    this.title = title;
    this.message = message;
    this.editable = editable;
    this.properties = properties;
  }

  public final boolean isEditable()
  {
    return editable;
  }

  public final ECPProperties getProperties()
  {
    return properties;
  }

  @Override
  protected void configureShell(Shell newShell)
  {
    super.configureShell(newShell);
    newShell.setText("Properties");
  }

  @Override
  protected Control createDialogArea(Composite parent)
  {
    setTitle(title);
    setTitleImage(Activator.getImage("icons/properties_wiz.png"));
    setMessage(message);

    Composite area = (Composite)super.createDialogArea(parent);
    Composite container = new Composite(area, SWT.NONE);
    container.setLayout(new GridLayout(1, false));
    container.setLayoutData(new GridData(GridData.FILL_BOTH));

    Composite specialProperties = new Composite(container, SWT.NONE);
    specialProperties.setLayout(new FillLayout(SWT.HORIZONTAL));
    specialProperties.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

    createSpecialProperties(specialProperties);
    PropertiesComposite propertiesComposite = new PropertiesComposite(container, editable, properties);
    propertiesComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

    if (!editable)
    {
      propertiesComposite.setFocus();
    }

    return area;
  }

  protected void createSpecialProperties(Composite parent)
  {
    // Can be overridden in subclasses
  }

  @Override
  protected void createButtonsForButtonBar(Composite parent)
  {
    createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);

    if (editable)
    {
      createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
    }
  }

  @Override
  protected Point getInitialSize()
  {
    return new Point(450, 500);
  }

  protected Text addTextProperty(Composite composite, String key, String value)
  {
    Label label = new Label(composite, SWT.NONE);
    label.setText(key == null ? "" : key);
    label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

    Text text = new Text(composite, SWT.NONE);
    text.setText(value == null ? "" : value);
    text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
    text.setEditable(isEditable());
    return text;
  }
}
