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
package org.eclipse.emf.cdo.ecp.internal.core;

import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSessionConfigurationFactory;

import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.IPluginContainer;

import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.spi.core.InternalRepository;

/**
 * @author Eike Stepper
 */
public final class CDORepositoryData implements CDOSessionConfigurationFactory
{
  private final InternalRepository repository;

  public CDORepositoryData(InternalRepository repository)
  {
    this.repository = repository;
  }

  public final InternalRepository getRepository()
  {
    return repository;
  }

  public CDONet4jSessionConfiguration createSessionConfiguration()
  {
    ECPProperties properties = repository.getProperties();
    String connectorType = properties.getValue(CDOProvider.PROP_CONNECTOR_TYPE);
    String connectorDescription = properties.getValue(CDOProvider.PROP_CONNECTOR_DESCRIPTION);
    String repositoryName = properties.getValue(CDOProvider.PROP_REPOSITORY_NAME);

    IConnector connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, connectorType, connectorDescription);

    CDONet4jSessionConfiguration configuration = CDONet4jUtil.createNet4jSessionConfiguration();
    configuration.setConnector(connector);
    configuration.setRepositoryName(repositoryName);
    return configuration;
  }
}
