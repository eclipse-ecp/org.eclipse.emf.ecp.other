/**
 * 
 */
package org.eclipse.emf.ecp.ui.common;

import org.eclipse.emf.ecp.core.util.ECPCheckoutSource;
import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.ecp.spi.ui.UIProvider;
import org.eclipse.emf.ecp.spi.ui.UIProviderRegistry;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author Eugen Neufeld
 */
public class CheckoutProjectComposite implements CompositeUiProvider
{
  private String projectName;

  private ECPProperties projectProperties = ECPUtil.createProperties();

  private final ECPCheckoutSource checkoutSource;

  private final UIProvider uiProvider;

  public CheckoutProjectComposite(ECPCheckoutSource checkoutSource)
  {
    this.checkoutSource = checkoutSource;
    projectName = this.checkoutSource.getDefaultCheckoutName();
    if (projectName == null)
    {
      projectName = "";
    }
    uiProvider = UIProviderRegistry.INSTANCE.getUIProvider(checkoutSource);
  }

  public Composite createUI(Composite parent)
  {
    Composite composite = new Composite(parent, SWT.NONE);
    composite.setLayoutData(new GridData(GridData.FILL_BOTH));
    composite.setLayout(new GridLayout(2, false));

    Label lblNewLabel = new Label(composite, SWT.NONE);
    lblNewLabel.setText("Project name:");

    final Text projectNameText = new Text(composite, SWT.BORDER);
    projectNameText.setText(projectName);
    projectNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
    projectNameText.addModifyListener(new ModifyListener()
    {
      public void modifyText(ModifyEvent e)
      {
        projectName = projectNameText.getText();
      }
    });
    StackLayout providerStackLayout = new StackLayout();
    Composite providerStack = new Composite(composite, SWT.NONE);
    providerStack.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
    providerStack.setLayout(providerStackLayout);
    Control checkoutUI = uiProvider.createCheckoutUI(providerStack, checkoutSource, projectProperties);
    if (checkoutUI != null)
    {
      providerStackLayout.topControl = checkoutUI;
      providerStack.layout();
    }

    return composite;
  }

  /**
   * @return the project name
   */
  public String getProjectName()
  {
    return projectName;
  }

  /**
   * @return the project properties
   */
  public ECPProperties getProjectProperties()
  {
    return projectProperties;
  }

  /**
   * @return the checkoutSource
   */
  public ECPCheckoutSource getCheckoutSource()
  {
    return checkoutSource;
  }

  /**
   * @return the uiProvider
   */
  public UIProvider getUiProvider()
  {
    return uiProvider;
  }
}