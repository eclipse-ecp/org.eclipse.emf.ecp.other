/**
 * 
 */
package org.eclipse.emf.ecp.editor.mecontrols.widgets;

import org.eclipse.emf.databinding.EMFDataBindingContext;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Eugen Neufeld
 */
public abstract class AbstractTextWidget<T> extends ECPWidget
{
  private Text text;

  private boolean doVerify;

  /**
   * @param dbc
   */
  public AbstractTextWidget(EMFDataBindingContext dbc)
  {
    super(dbc);
  }

  @SuppressWarnings("unchecked")
  private Class<?> getClassType()

  {
    Class<?> clazz = getClass();

    while (!(clazz.getGenericSuperclass() instanceof ParameterizedType))
    {
      clazz = clazz.getSuperclass();
    }

    Type[] actualTypeArguments = ((ParameterizedType)clazz.getGenericSuperclass()).getActualTypeArguments();
    return (Class<T>)actualTypeArguments[0];
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.emf.ecp.editor.mecontrols.widgets.ECPWidget#getControl()
   */
  @Override
  public Control getControl()
  {
    return text;
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.emf.ecp.editor.mecontrols.widgets.ECPWidget#createWidget(org.eclipse.ui.forms.widgets.FormToolkit,
   * org.eclipse.swt.widgets.Composite, int)
   */
  @Override
  public Control createWidget(FormToolkit toolkit, Composite composite, int style)
  {
    // TODO: activate verification once again
    doVerify = false;
    text = toolkit.createText(composite, new String(), style | SWT.SINGLE | SWT.BORDER);
    text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    addFocusListener();
    addVerifyListener();
    return text;
  }

  private void addFocusListener()
  {
    text.addFocusListener(new FocusListener()
    {

      public void focusLost(FocusEvent e)
      {
        if (text.getText().equals(""))
        {
          setUnvalidatedString(convertModelToString(getDefaultValue()));
        }
        else
        {
          postValidate(text.getText());
        }

        getDbc().updateModels();
        getDbc().updateTargets();
      }

      public void focusGained(FocusEvent e)
      {
        // do nothing
      }
    });
  }

  private void addVerifyListener()
  {
    text.addVerifyListener(new VerifyListener()
    {

      public void verifyText(VerifyEvent e)
      {
        if (doVerify)
        {

          final String oldText = text.getText();
          String newText = oldText.substring(0, e.start) + e.text + oldText.substring(e.end);
          if (!validateString(newText))
          {
            e.doit = false;
            return;
          }
        }
      }
    });
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.emf.ecp.editor.mecontrols.widgets.ECPWidget#setEditable(boolean)
   */
  @Override
  public void setEditable(boolean isEditable)
  {
    text.setEditable(isEditable);
  }

  /*
   * (non-Javadoc)
   * @see
   * org.eclipse.emf.ecp.editor.mecontrols.widgets.ECPWidget#bindValue(org.eclipse.core.databinding.observable.value
   * .IObservableValue)
   */
  @Override
  public void bindValue(final IObservableValue modelValue, final ControlDecoration controlDecoration)
  {
    IObservableValue value = SWTObservables.observeText(text, SWT.FocusOut);
    getDbc().bindValue(value, modelValue, getTargetToModelStrategy(controlDecoration), getModelToTargetStrategy());
  }

  /**
   * Returns a default value if the SWT Text control should be empty.
   * 
   * @return a default value
   */
  protected abstract T getDefaultValue();

  /**
   * Sets the content of the SWT text control to the given string without calling {@link #validateString(String)}.
   * 
   * @param string
   *          the content of the SWT Text control
   */
  protected void setUnvalidatedString(String string)
  {
    boolean oldDoVerify = doVerify;
    doVerify = false;
    text.setText(string);
    doVerify = oldDoVerify;
  }

  /**
   * Validates the string entered in the text field. This method is executed whenever the user modifies the text
   * contained in the SWT Text control.
   * 
   * @param text
   *          the text to be validated
   * @return true if <code>text</code> is a valid model value
   */
  protected abstract boolean validateString(String value);

  /**
   * Called when the SWT Text control loses its focus. This is useful for cases where {@link #validateString(String)}
   * returns true but the value entered by the user is invalid. For instance, this might be the case when the user
   * enters a number that would cause a overflow. In such cases the number should be set to max value that can
   * represented by the type in question.
   * 
   * @param text
   *          the string value currently entered in the SWT Text control
   */
  protected abstract void postValidate(String text);

  private UpdateValueStrategy getTargetToModelStrategy(final ControlDecoration controlDecoration)
  {
    // Define a validator to check that only numbers are entered
    IValidator validator = new IValidator()
    {
      public IStatus validate(Object value)
      {
        boolean valid = validateString(text.getText());

        if (valid)
        {
          controlDecoration.hide();
          return ValidationStatus.ok();
        }

        controlDecoration.show();
        return ValidationStatus.error("Not a double.");
      }
    };
    UpdateValueStrategy strategy = new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE);
    strategy.setAfterGetValidator(validator);
    strategy.setConverter(new IConverter()
    {

      public Object getToType()
      {
        return getClassType();
      }

      public Object getFromType()
      {
        return String.class;
      }

      public Object convert(Object fromObject)
      {
        T convertedValue = convertStringToModel((String)fromObject);
        return convertedValue;
      }
    });

    return strategy;
  }

  private UpdateValueStrategy getModelToTargetStrategy()
  {
    UpdateValueStrategy updateValueStrategy = new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE);
    updateValueStrategy.setConverter(new IConverter()
    {

      public Object getToType()
      {
        return String.class;
      }

      public Object getFromType()
      {
        return getClassType();
      }

      public Object convert(Object fromObject)
      {
        @SuppressWarnings("unchecked")
        T val = (T)fromObject;
        return convertModelToString(val);
      }
    });
    return updateValueStrategy;
  }

  /**
   * Converts the string value to the actual model value.
   * 
   * @param s
   *          the string value to be converted
   * @return the model value of type <code>T</code>
   */
  protected abstract T convertStringToModel(String s);

  /**
   * Converts the actual model value to its textual representation.
   * 
   * @param modelValue
   *          the model value which needs to be converted to its textual representation
   * @return the string representation of the converted model value
   */
  protected abstract String convertModelToString(T modelValue);
}