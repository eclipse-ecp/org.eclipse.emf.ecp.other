package org.eclipse.emf.ecp.ecview.databinding.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.ecp.ecview.databinding.emf.model.ECViewModelBindable;
import org.eclipse.emf.ecp.ecview.databinding.tests.bean.model.BPerson;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TAddress;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TCountry;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TList;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TPerson;
import org.eclipse.emf.ecp.ecview.databinding.tests.emf.model.TestmodelFactory;
import org.eclipse.emf.ecp.ecview.databinding.tests.pojo.model.PPerson;
import org.junit.Before;
import org.junit.Test;

public class ECViewModelListBindableTests {

	private TestmodelFactory factory = TestmodelFactory.eINSTANCE;
	private TList tList;

	@Before
	public void setup() {
		new TestRealm();
		tList = factory.createTList();

	}

	@SuppressWarnings("restriction")
	@Test
	public void test_EMF_list_binding() {
		TPerson tPerson = factory.createTPerson();
		TAddress tAddress = factory.createTAddress();
		TCountry tCountry = factory.createTCountry();
		tCountry.setIsoCode("AT");
		tCountry.getCities().add("Vienna");
		tCountry.getCities().add("Graz");
		tCountry.getCities().add("Salzburg");
		tAddress.setCountry(tCountry);
		tPerson.setAddress(tAddress);

		IObservableList observableList = ECViewModelBindable.observeList(tList,
				ECViewModelBindable.getFeaturePath(
						"tObject.address.country.cities", tList.eClass(),
						tPerson.eClass()));
		final int[] counter = new int[1];
		observableList.addListChangeListener(new IListChangeListener() {
			@Override
			public void handleListChange(ListChangeEvent event) {
				counter[0] = counter[0] + 1;
			}
		});

		tList.setTObject(tPerson);
		assertEquals(1, counter[0]);

		TPerson tPerson2 = factory.createTPerson();
		TAddress tAddress2 = factory.createTAddress();
		TCountry tCountry2 = factory.createTCountry();
		tCountry2.setIsoCode("AT");
		tCountry2.getCities().add("Gross");
		tCountry2.getCities().add("Klein");
		tAddress2.setCountry(tCountry2);
		tPerson2.setAddress(tAddress2);
		tList.setTObject(tPerson2);
		assertEquals(2, counter[0]);

		TCountry tCountry3 = factory.createTCountry();
		tCountry3.setIsoCode("DE");
		tAddress2.setCountry(tCountry3);
		assertEquals(3, counter[0]);

		tCountry3.getCities().add("Klein");
		assertEquals(4, counter[0]);
	}

	@SuppressWarnings("restriction")
	@Test
	public void test_Bean_list_binding() {
		BPerson bPerson = BPerson.newInstance("AT");
		bPerson.getAddress().getCountry().getCities().add("Vienna");
		bPerson.getAddress().getCountry().getCities().add("Graz");
		bPerson.getAddress().getCountry().getCities().add("Salzburg");

		IObservableValue observableValue = ECViewModelBindable.observeValue(
				tList, "tObject.address.country.isoCode", BPerson.class, null);
		final int[] counter = new int[1];
		observableValue.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				counter[0] = counter[0] + 1;
			}
		});

		tList.setTObject(bPerson);
		assertEquals(1, counter[0]);

		BPerson bPerson2 = BPerson.newInstance("AT");
		bPerson2.getAddress().getCountry().getCities().add("Gross");
		bPerson2.getAddress().getCountry().getCities().add("Klein");

		tList.setTObject(bPerson2);
		assertEquals(2, counter[0]);

		bPerson2.getAddress().getCountry().setIsoCode("DE");
		assertEquals(3, counter[0]);
		
		
	}

	@SuppressWarnings("restriction")
	@Test
	public void test_Pojo_list_binding() {
		PPerson pPerson = PPerson.newInstance("AT");
		pPerson.getAddress().getCountry().getCities().add("Vienna");
		pPerson.getAddress().getCountry().getCities().add("Graz");
		pPerson.getAddress().getCountry().getCities().add("Salzburg");

		IObservableValue observableValue = ECViewModelBindable.observeValue(
				tList, "tObject.address.country.isoCode", BPerson.class, null);
		final int[] counter = new int[1];
		observableValue.addValueChangeListener(new IValueChangeListener() {
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				counter[0] = counter[0] + 1;
			}
		});

		tList.setTObject(pPerson);
		assertEquals(1, counter[0]);

		PPerson pPerson2 = PPerson.newInstance("AT");
		pPerson2.getAddress().getCountry().getCities().add("Gross");
		pPerson2.getAddress().getCountry().getCities().add("Klein");

		tList.setTObject(pPerson2);
		assertEquals(2, counter[0]);

		// POJO does not send notification -> no property change support
		pPerson2.getAddress().getCountry().setIsoCode("DE");
		assertEquals(2, counter[0]);
	}

	private static class TestRealm extends Realm {

		private TestRealm() {
			setDefault(this);
		}

		public boolean isCurrent() {
			return true;
		}

		public void asyncExec(final Runnable runnable) {
			throw new UnsupportedOperationException("Not a valid call!");
		}

		public void timerExec(int milliseconds, final Runnable runnable) {
			throw new UnsupportedOperationException("Not a valid call!");
		}
	}

}
