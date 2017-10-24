package com.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

@Configuration
public class ShopConfig {

	@Bean
	public PriceMatrix priceMatrixV1() {
		return new PriceMatrixImpl_v1();
	}

	@Bean
	public PriceMatrix priceMatrixV2() {
		return new PriceMatrixImpl_v2();
	}

	@Bean("billComp")
	public Billing billing() {
		BillingImpl billing = new BillingImpl();
		billing.setPriceMatrix(priceMatrixV2());
		return billing;
	}

}
