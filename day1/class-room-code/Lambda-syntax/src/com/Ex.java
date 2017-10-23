package com;

import java.util.function.*;

@FunctionalInterface
interface StringToIntMapper {
	int map(String s);
}

public class Ex {

	public static void main(String[] args) {
		//
		// IntFunction<String> exp = (n) -> "result=" + n * n;
		// System.out.println(exp.apply(10));

		// StringToIntMapper sti = s -> s.length();
		// System.out.println(sti.map("Nag"));
		//
		// Function<Integer, Double> function = (time) -> 150.00;
		// System.out.println(function.apply(12));

		//BiFunction<Integer, Double, Boolean> biFunction = (time, maxPrice) -> maxPrice > 500.00;

	}

}
