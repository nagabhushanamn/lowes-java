package com;

@FunctionalInterface
interface StringToDoubleMapper {
	double map(String s);
}

interface StringToLengthMapper {
	int map(String s);
}

public class MethodReference_Ex {

	public static void main(String[] args) {

		// StringToDoubleMapper mapper=s->Double.parseDouble(s);
		StringToDoubleMapper mapper = Double::parseDouble; // MethodReference
		System.out.println(mapper.map("12.12"));

		StringToLengthMapper mapper2 = String::length;
		System.out.println(mapper2.map("lowes"));

	}

}
