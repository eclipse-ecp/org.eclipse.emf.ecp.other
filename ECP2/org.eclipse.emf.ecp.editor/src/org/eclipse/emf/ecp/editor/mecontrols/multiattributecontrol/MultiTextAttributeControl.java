/**
 * 
 */
package org.eclipse.emf.ecp.editor.mecontrols.multiattributecontrol;

import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.ecp.editor.mecontrols.widgets.ECPWidget;
import org.eclipse.emf.ecp.editor.mecontrols.widgets.StringWidget;

/**
 * @author Eugen Neufeld
 */
public class MultiTextAttributeControl extends MultiMEAttributeControl
{

  /*
   * (non-Javadoc)
   * @see
   * org.eclipse.emf.ecp.editor.mecontrols.multiattributecontrol.MultiMEAttributeControl#getAttributeWidget(org.eclipse
   * .emf.databinding.EMFDataBindingContext)
   */
  @Override
  protected ECPWidget getAttributeWidget(EMFDataBindingContext dbc)
  {
    return new StringWidget(dbc);
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.emf.ecp.editor.mecontrols.multiattributecontrol.MultiMEAttributeControl#getDefaultValue()
   */
  @Override
  protected Object getDefaultValue()
  {
    return "";
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.emf.ecp.editor.mecontrols.AbstractMEControl#getClassType()
   */
  @Override
  protected Class<?> getClassType()
  {
    return String.class;
  }

}