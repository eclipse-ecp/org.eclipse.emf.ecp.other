package org.eclipse.emf.ecp.ecview.common.editpart.emf.datatypes;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart.DatatypeChangeEvent;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddable;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;

/**
 * The datatype editpart is responsible to observe the {@link YDatatype} model
 * element and to update all UI elements that are registered at this instance.
 */
public abstract class DatatypeEditpart<M extends YDatatype> extends
		ElementEditpart<M> implements IDatatypeEditpart {

	private Set<DatatypeChangeListener> listeners = Collections
			.synchronizedSet(new HashSet<DatatypeChangeListener>());

	@Override
	public DatatypeChangeEvent getInitialInformation() {
		List<YValidator> validators = internalGetValidators();
		
		return null;
	}

	@Override
	public void addListener(DatatypeChangeListener listener) {
		listeners.add(listener);
	}
	
	@Override
	public void removeListener(DatatypeChangeListener listener) {
		listeners.remove(listener);
	}

	/**
	 * Returns a list of validators that should be added as internal validators
	 * to the containing UI element. Note that for each call a new list should
	 * be returned.
	 * 
	 * @return
	 */
	protected List<YValidator> internalGetValidators() {
		return Collections.emptyList();
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

		// forward the notification to the UI elements
		for (DatatypeChangeListener listener : listeners) {
			YEmbeddable yEmbeddable = (YEmbeddable) listener.getModel();
			yEmbeddable.eNotify(notification);
		}
	}

	@Override
	protected void internalDispose() {
		try {
			listeners = null;
		} finally {
			super.internalDispose();
		}
	}

}
