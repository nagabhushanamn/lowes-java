package com.sample.ce;

public class Example {
	
    final static double[] EXPECTED_SALES_JAN_TO_DEC =
            new double[] { 42.0, 45.6, 43.6, 50.2, 55.6, 54.7,58.0, 57.3, 62.0, 60.3, 71.2, 88.8};

	public static void main(String[] args) {

		
		final Sales sales=new Sales(EXPECTED_SALES_JAN_TO_DEC);
		
		final IncrementalCosts incrementalCosts=new IncrementalCosts(15,0.15);
		final FixedCosts fixedCosts=new FixedCosts(15.0);
		
		final Profit profit = new Profit(sales, incrementalCosts, fixedCosts);

		double total = 0.0;
		
		for (int i = 1; i <= 12; i++) {
			total += profit.valueAt(i);
		}
		
		System.out.println("Expected profit for this year : " + total);

	}

}
