package com.ex;

import java.util.Date;
import java.util.Random;

import static com.ex.Timing.*;

public class Example {

	public static void main(String[] args) {

		final Double costs = timed("Costs calculation ",Example::calculateCosts,log->System.out.println(log));
		final Double revenue = timed("Revenue calculation ", Example::calculateRevenue);
		final Double profit = timed("Profit calculation ", () -> calculateProfit(costs,revenue));

		System.out.println("Profit = $" + profit);

	}

	private static Double calculateCosts() {
		pretendToWorkHard();
		return 4567.3;
	}

	private static Double calculateRevenue() {
		pretendToWorkHard();
		return 23413.2;
	}

	private static Double calculateProfit(Double costs,Double revenue) {
		pretendToWorkHard();
		return  costs;
	}

	private static final Random r = new Random();
	private static final Integer MAX_WORK_TIME_MS = 2000;

	private static void pretendToWorkHard() {
		try {
			Thread.sleep(r.nextInt(MAX_WORK_TIME_MS));
		} catch (InterruptedException e) {
		}
	}

}