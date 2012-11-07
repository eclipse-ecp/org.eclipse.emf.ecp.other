/**
 * 
 */
package org.eclipse.emf.ecp.editor.mecontrols.widgets;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.editor.EditorModelelementContext;
import org.eclipse.emf.ecp.editor.ModelElementChangeListener;
import org.eclipse.emf.ecp.editor.mecontrols.melinkcontrol.MEHyperLinkAdapter;
import org.eclipse.emf.ecp.editor.mecontrols.melinkcontrol.MEHyperLinkDeleteAdapter;
import org.eclipse.emf.ecp.ui.util.ShortLabelProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ImageHyperlink;

/**
 * @author Eugen Neufeld
 */
public class LinkWidget extends ECPWidget
{
  protected Composite linkComposite;

  private Hyperlink hyperlink;

  private ILabelProvider labelProvider;

  private ILabelProviderListener labelProviderListener;

  private ImageHyperlink imageHyperlink;

  private EObject modelElement;

  private EObject linkModelElement;

  private EReference eReference;

  private EditorModelelementContext context;

  /**
   * @param dbc
   */
  public LinkWidget(EObject modelElement, EObject linkModelElement, EReference eReference,
      EditorModelelementContext context)
  {

    this.modelElement = modelElement;
    this.linkModelElement = linkModelElement;
    this.eReference = eReference;
    this.context = context;
  }

  /*
   * (non-Javadoc)
   * @see
   * org.eclipse.emf.ecp.editor.mecontrols.widgets.ECPAttributeWidget#createWidget(org.eclipse.ui.forms.widgets.FormToolkit
   * , org.eclipse.swt.widgets.Composite, int)
   */
  @Override
  public Control createWidget(FormToolkit toolkit, Composite composite, int style)
  {
    linkComposite = toolkit.createComposite(composite, style);
    linkComposite.setLayout(new GridLayout(3, false));

    createHyperlink(toolkit, composite, style);
    createDeleteAction(toolkit, style);
    return linkComposite;
  }

  private void createDeleteAction(FormToolkit toolkit, int style)
  {
    ImageHyperlink deleteLink = toolkit.createImageHyperlink(linkComposite, style);
    Image deleteImage = null;

    deleteImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_TOOL_DELETE);

    deleteLink.setImage(deleteImage);

    deleteLink.addMouseListener(new MEHyperLinkDeleteAdapter(modelElement, eReference, linkModelElement, context));
  }

  private void createHyperlink(FormToolkit toolkit, final Composite parent, int style)
  {
    AdapterFactoryLabelProvider adapterFactoryLabelProvider = new AdapterFactoryLabelProvider(
        new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
    IDecoratorManager decoratorManager = PlatformUI.getWorkbench().getDecoratorManager();
    labelProvider = new DecoratingLabelProvider(adapterFactoryLabelProvider, decoratorManager.getLabelDecorator());
    labelProviderListener = new ILabelProviderListener()
    {
      public void labelProviderChanged(LabelProviderChangedEvent event)
      {
        imageHyperlink.setImage(labelProvider.getImage(linkModelElement));
      }
    };
    labelProvider.addListener(labelProviderListener);
    ModelElementChangeListener modelElementChangeListener = new ModelElementChangeListener(linkModelElement)
    {

      @Override
      public void onChange(Notification notification)
      {
        Display.getDefault().asyncExec(new Runnable()
        {

          public void run()
          {
            if (hyperlink != null && !hyperlink.isDisposed())
            {
              ShortLabelProvider shortLabelProvider = new ShortLabelProvider();
              String text = shortLabelProvider.getText(linkModelElement);
              hyperlink.setText(text);
              hyperlink.setToolTipText(text);
              linkComposite.layout(true);
              parent.getParent().layout(true);
            }
          }

        });

      }
    };

    Image image = labelProvider.getImage(linkModelElement);
    imageHyperlink = toolkit.createImageHyperlink(linkComposite, style);
    imageHyperlink.setImage(image);
    imageHyperlink.setData(linkModelElement.eClass());
    // TODO: Reactivate
    // ModelElementClassTooltip.enableFor(imageHyperlink);
    ShortLabelProvider shortLabelProvider = new ShortLabelProvider();
    hyperlink = toolkit.createHyperlink(linkComposite, shortLabelProvider.getText(linkModelElement), style);
    hyperlink.setToolTipText(shortLabelProvider.getText(linkModelElement));
    IHyperlinkListener listener = new MEHyperLinkAdapter(linkModelElement, modelElement, eReference.getName(), context);
    hyperlink.addHyperlinkListener(listener);
    imageHyperlink.addHyperlinkListener(listener);
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.emf.ecp.editor.mecontrols.widgets.ECPAttributeWidget#setEditable(boolean)
   */
  @Override
  public void setEditable(boolean isEditable)
  {
    // TODO Auto-generated method stub

  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.emf.ecp.editor.mecontrols.widgets.ECPAttributeWidget#getControl()
   */
  @Override
  public Control getControl()
  {
    return linkComposite;
  }

}