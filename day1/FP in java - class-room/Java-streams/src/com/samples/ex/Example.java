package com.samples.ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Example {

	final static List<String> food = Arrays.asList("Crunchy carrots", "Golden-hued bananas", "",
			"Bright orange pumpkins", "Little trees of broccoli", "meat");

	private static BinaryOperator<String> last = (other, last) -> last;

	private static Function<String, String> lastWord = (String phrase) -> Arrays.asList(phrase.split(" ")).stream()
			.reduce(last).orElse("");

	private static BinaryOperator<String> joinOn(String divider) {
		return (allSoFar, oneMore) -> allSoFar + divider + oneMore;
	}

	
	static String summarize(List<String> descriptions) {
		
		return descriptions.stream()
						   .filter(s -> !s.isEmpty())
						   .map(lastWord)
						   .reduce(joinOn(" & "))
						   .orElse("");
		
		
	}

	public static void main(String[] args) {

		final String summary = summarize(food);
		final String desired = "carrots & bananas & pumpkins & broccoli & meat";

		System.out.println(summary);
		if (summary.equals(desired))
			System.out.println("yay!");
	}

}
