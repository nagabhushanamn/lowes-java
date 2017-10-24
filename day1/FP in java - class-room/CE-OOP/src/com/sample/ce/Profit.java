package com.sample.ce;

public class Profit implements QuantityOfInterest {

	final Sales sales;
	final IncrementalCosts incrementalCosts;
	final FixedCosts fixedCosts;

	public Profit(Sales sales, IncrementalCosts incrementalCosts, FixedCosts fixedCosts) {
		this.sales = sales;
		this.incrementalCosts = incrementalCosts;
		this.fixedCosts = fixedCosts;
	}

	@Override
	public String getName() {
		return "Expected Profit";
	}

	@Override
	public double valueAt(int time) {
		return sales.valueAt(time)-incrementalCosts.valueAt(time)+fixedCosts.valueAt(time);
	}

}
