package org.eclipse.emf.ecp.ecview.databinding.emf.common;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;

public class ECViewDatabindingContext extends EMFDataBindingContext {

	public ECViewDatabindingContext() {
		super();
	}

	public ECViewDatabindingContext(Realm validationRealm) {
		super(validationRealm);
	}

	 @Override
	  protected UpdateValueStrategy createModelToTargetUpdateValueStrategy(IObservableValue fromValue, IObservableValue toValue)
	  {
	    return new ECViewUpdateValueStrategy();
	  }

	  @Override
	  protected UpdateValueStrategy createTargetToModelUpdateValueStrategy(IObservableValue fromValue, IObservableValue toValue)
	  {
	    return new ECViewUpdateValueStrategy();
	  }
	
	
	
}
