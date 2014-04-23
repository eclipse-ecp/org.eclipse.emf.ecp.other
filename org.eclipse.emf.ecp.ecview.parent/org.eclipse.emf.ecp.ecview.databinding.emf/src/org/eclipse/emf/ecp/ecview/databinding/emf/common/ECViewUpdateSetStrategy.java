package org.eclipse.emf.ecp.ecview.databinding.emf.common;

import org.eclipse.core.databinding.UpdateSetStrategy;

public class ECViewUpdateSetStrategy extends UpdateSetStrategy {

	public ECViewUpdateSetStrategy() {
		super();
	}

	public ECViewUpdateSetStrategy(boolean provideDefaults, int updatePolicy) {
		super(provideDefaults, updatePolicy);
	}

	public ECViewUpdateSetStrategy(int updatePolicy) {
		super(updatePolicy);
	}

}
