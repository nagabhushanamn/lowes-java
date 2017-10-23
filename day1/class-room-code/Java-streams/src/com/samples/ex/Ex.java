package com.samples.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Ex {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(new Integer[] {12,14,12,14,15 });
		
		Optional<Integer> optional=list.stream()
				        //.parallel() 
				        .peek(n->System.out.println("filtering :"+n )) 
						.filter(n->n%2==0) // Intermidiate
						.peek(n->System.out.println("mapping :"+n))
						.map(n->n)     // Intermediate 
						.limit(3)
						.reduce((acc, next) -> {
							System.out.println("Acc:"+acc);
							System.out.println("Next:"+next);
							return acc+next;
						}) ;      // ternary operation
		
		//System.out.println(count);
		
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}else {
			System.out.println(optional.orElse(0));
		}

	}
	

}
