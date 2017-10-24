package com.shop.bill;

import java.util.List;

import com.shop.pm.PriceMatrix;

/*
 * 
 *  OO Principles
 *  ---------------
 *  
 *   S.O.L.I.D  principles
 *   
 *   
    S — Single responsibility principle
	O — Open closed principle
	L — Liskov substitution principle
	I — Interface segregation principle
	D — Dependency Inversion principle
 * 
 * 
 * 
 *  design & performance issues
 *  -----------------------------
 *  
 *  1. too many duplicate dependency-instances created/destructed
 *  
 *  		==> slow, memory/resources usage high
 *  
 *  2. tight-coupling with specific dependency-version
 *  
 *      ==> Maintenance issues
 *  
 *  3. unit-testing not possible
 *  
 *     ==> dev/bug fix slow
 *     
 *     --------------------------------------------------------
 *     
 *     why these issues are occuring in this comp?
 *     
 *     --> dependent-obj itself creating it's own dependecy..
 *     
 *     Soln:
 *     
 *     --> Dont create dependency in dependent's class, do lookup
 *     
 *     Limitations ob lookup:
 *     
 *     --> dependecy's location tight-coupling
 *     
 *     best soln:
 *     
 *     --> Dont Create/Lookup , get/inject by 'Some-One'  ( Inversion Of Control )
 *     
 *     
 *         how to implement IOC ?
 *         
 *         -> using 'Dependency Injection' ( DI )
 *         
 *           types:
 *           
 *           -> constructor
 *           -> setter
 *           -> field
 *           -> method
 *           
 *         ----------------------------------------  
 * 
 */

public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	public double getTotalPrice(List<String> cart) {
		double total = 0.0;
		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}
		return total;

	}

}
