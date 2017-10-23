package com.sample.ce;

public class Sales extends MonthByMonthQuantity {

	public Sales(final double[] values) {
		super(values);
	}

	@Override
	public String getName() {
		return "Sales";
	}

}
