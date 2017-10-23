package com.sample.ce;

public class Example {

	final static double[] EXPECTED_SALES_JAN_TO_DEC = new double[] { 42.0, 45.6, 43.6, 50.2, 55.6, 54.7, 58.0, 57.3,
			62.0, 60.3, 71.2, 88.8 };

	public static void main(String[] args) {

		final FunctionOverTime sales = FunctionOverTime.monthByMoth(EXPECTED_SALES_JAN_TO_DEC);

		final FunctionOverTime incrementalCosts = FunctionOverTime.fixed(15.00);
		final FunctionOverTime fixedCosts = FunctionOverTime.line(15.00, 0.15);

//		final FunctionOverTime profit = FunctionOverTime.combinationOf3(sales, incrementalCosts, fixedCosts, (s,i,f)->s-i-f);
		final FunctionOverTime profit2 = FunctionOverTime.combinationOf3(sales, incrementalCosts, fixedCosts, (s,i,f)->s+i+f);
		double total = 0.0;

		for (int i = 1; i <= 12; i++) {
			total += profit2.valueAt(i);
		}

		System.out.println("Expected profit for this year : " + total);

	}

}
