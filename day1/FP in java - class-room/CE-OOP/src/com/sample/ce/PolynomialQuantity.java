package com.sample.ce;

public abstract class PolynomialQuantity implements QuantityOfInterest {

	private final double[] values;

	public PolynomialQuantity(final double[] values) {
		this.values = values;
	}

	@Override
	public double valueAt(int time) {
		double value = 0.0;
		for (int i = 0; i < values.length; i++) {
			value += value * Math.pow(time, i);
		}
		return value;
	}

}
