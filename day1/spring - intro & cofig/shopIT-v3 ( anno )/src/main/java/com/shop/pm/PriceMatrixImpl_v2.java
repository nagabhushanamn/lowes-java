package com.shop.pm;

import org.springframework.stereotype.Component;

@Component("priceMatrixV2")
public class PriceMatrixImpl_v2 implements PriceMatrix{
	
	public double getPrice(String item) {
		//  DB call | ws-call
		return 200.00;
	}

}
