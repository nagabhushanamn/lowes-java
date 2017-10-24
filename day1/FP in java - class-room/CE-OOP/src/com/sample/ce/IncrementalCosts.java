package com.sample.ce;

public class IncrementalCosts extends PolynomialQuantity {

	public IncrementalCosts(double value, double slope) {
		super(new double[] { value, slope });
	}

	@Override
	public String getName() {
		return "Incremental Costs";
	}
}
