package com.shop;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// init..
		// PriceMatrix priceMatrixV1 = new PriceMatrixImpl_v1();
		// PriceMatrix priceMatrixV2 = new PriceMatrixImpl_v2();
		// Billing bilComp = new BillingImpl(priceMatrixV2);

		ConfigurableApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// use..
		Billing billingComp = applicationContext.getBean("billComp1", Billing.class);
		List<String> cart = Arrays.asList(new String[] { "343546", "765432" });
		double totalPrice = billingComp.getTotalPrice(cart);
		System.out.println("Total-" + totalPrice);

		// destroy
		applicationContext.close();

	}

}
