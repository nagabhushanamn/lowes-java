package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;



public class Sample5 {

	
	public static boolean isGreaterThan3(int number){
		System.out.println("isGreaterThan3 "+number);
		return number>3;
	}
	public static boolean isEven(int number){
		System.out.println("isEven "+number);
		return number%2==0;
	}
	public static int doubleIt(int number){
		System.out.println("doubleIT "+number);
		return number*2;
	}
	
	public static void main(String[] args) {
		
		
		// find the double of the first even number greater than 3
		
		List<Integer> values=Arrays.asList(1,2,3,5,4,6,7,8,9,10);
//	
		
		// Higher-order function
		
		// lazy and composition
		
		Predicate<Integer> isGreaterThan3=number->number>3;
		
		Function<Integer, Predicate<Integer>> isGreaterThan=pivot->
		number->number>pivot;
		
		final Stream<Integer> temp=values.stream()
				.filter(isGreaterThan.apply(4))
				.filter(Sample4::isEven)
				.map(Sample4::doubleIt);
		
		System.out.println(
				temp.findFirst()
				);
		
		
		//-------------------------------------------------------
		
		
	}
}
