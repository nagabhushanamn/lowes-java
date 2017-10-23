package com.ex;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Timing {

	public static Double timed(String description, Supplier<Double> supplier) {
		double result = 0.0;
		final Date before = new Date();
		result = supplier.get();
		final Long duration = new Date().getTime() - before.getTime();
		//System.out.println(description + " took " + duration + " ms");
		return result;
	}

	public static <A> A timed(String description, Supplier<A> supplier, Consumer<String> consumer) {
		final Date before = new Date();
		A result = supplier.get();
		final Long duration = new Date().getTime() - before.getTime();
		consumer.accept(description + " took " + duration + " ms");
		return result;
	}

}
