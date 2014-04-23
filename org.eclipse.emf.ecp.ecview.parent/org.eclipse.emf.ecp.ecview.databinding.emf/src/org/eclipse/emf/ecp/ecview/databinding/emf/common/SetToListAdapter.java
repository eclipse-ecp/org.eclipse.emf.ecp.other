package org.eclipse.emf.ecp.ecview.databinding.emf.common;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.list.ObservableList;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.ISetChangeListener;
import org.eclipse.core.databinding.observable.set.SetChangeEvent;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class SetToListAdapter extends ObservableList {

	private final IObservableSet set;

	private ISetChangeListener listener = new ISetChangeListener() {

		public void handleSetChange(SetChangeEvent event) {
			List originalList = new ArrayList(wrappedList);
			for (Object addedElement : event.diff.getAdditions()) {
				if (!wrappedList.contains(addedElement)) {
					wrappedList.add(addedElement);
				}
			}
			for (Object removedElement : event.diff.getRemovals()) {
				wrappedList.remove(removedElement);
			}
			fireListChange(Diffs.computeListDiff(originalList, wrappedList));
		}
	};

	/**
	 * @param list
	 */
	public SetToListAdapter(IObservableSet set) {
		super(set.getRealm(), new ArrayList(), set.getElementType());
		this.set = set;
		wrappedList.addAll(set);
		this.set.addSetChangeListener(listener);
	}

	public synchronized void dispose() {
		super.dispose();
		if (set != null && listener != null) {
			set.removeSetChangeListener(listener);
			listener = null;
		}
	}

}
