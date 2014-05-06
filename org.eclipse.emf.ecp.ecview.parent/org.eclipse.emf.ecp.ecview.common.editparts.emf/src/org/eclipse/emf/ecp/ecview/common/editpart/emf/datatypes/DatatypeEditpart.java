package org.eclipse.emf.ecp.ecview.common.editpart.emf.datatypes;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecp.ecview.common.editpart.IEmbeddableEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IFieldEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.datatypes.IDatatypeEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.emf.ElementEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YField;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.YDatatype;
import org.eclipse.emf.ecp.ecview.common.model.validation.YValidator;

/**
 * The datatype editpart is responsible to observe the {@link YDatatype} model
 * element and to update all UI elements that are registered at this instance.
 */
public abstract class DatatypeEditpart<M extends YDatatype> extends
		ElementEditpart<M> implements IDatatypeEditpart {

	private Set<IEmbeddableEditpart> uiElements = Collections
			.synchronizedSet(new HashSet<IEmbeddableEditpart>());

	@Override
	public void register(IEmbeddableEditpart yEmbeddable) {
		uiElements.add(yEmbeddable);

		if (yEmbeddable instanceof IFieldEditpart) {
			YField yField = (YField) yEmbeddable;
			internalUpdateValidators(yField);
		}
	}

	/**
	 * Updates the given field with the internal validators.
	 * 
	 * @param yField
	 */
	protected void internalUpdateValidators(YField yField) {
		// remove all internal validator
		// TODO later only remove the validators that have been added
		yField.getInternalValidators().clear();
		// add the new created validators
		yField.getInternalValidators().addAll(internalGetValidators());
	}

	@Override
	public void unregister(IEmbeddableEditpart yEmbeddable) {
		if (yEmbeddable instanceof IFieldEditpart) {
			YField yField = (YField) yEmbeddable;
			yField.getInternalValidators().clear();
		}

		uiElements.remove(yEmbeddable);
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

	/**
	 * Returns the UI elements.
	 * 
	 * @return
	 */
	public Set<IEmbeddableEditpart> getUiElements() {
		return uiElements;
	}

	@Override
	protected void internalDispose() {
		try {
			uiElements = null;
		} finally {
			super.internalDispose();
		}
	}

}
