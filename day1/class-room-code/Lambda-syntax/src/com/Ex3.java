package com;

interface Adder {
	double add(double a, double b);
}

interface Joiner {
	String join(String a, String b);
}

class Util {
	
	public void test(Adder adder) {
		// inp
		double inp1 = 12;
		double inp2 = 13;
		double result = adder.add(inp1, inp2);
		System.out.println(result);
	}

	public void test(Joiner joiner) {
		// inp
		String inp1 = "Hello";
		String inp2 = "Lowes";
		String result = joiner.join(inp1, inp2);
		System.out.println(result);
	}
}

public class Ex3 {

	public static void main(String[] args) {

		Util util = new Util();

		// Adder adder = (p1, p2) -> p1 + p2;
		util.test((double p1, double p2) -> p1 + p2);

		// Joiner joiner = (p1, p2) -> p1 +" "+ p2;
		util.test((Joiner) (p1, p2) -> p1 + " " + p2);

	}

}
