package com.shop.pm;

import org.springframework.stereotype.Component;

public class PriceMatrixImpl_v1 implements PriceMatrix{
	
	public double getPrice(String item) {
		//  DB call | ws-call
		return 100.00;
	}

}
