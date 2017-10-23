package com.shop;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = null;
		applicationContext = new AnnotationConfigApplicationContext(new String[] { "com.shop" });

		// use..
		Billing billingComp = applicationContext.getBean("billComp", Billing.class);
		List<String> cart = Arrays.asList(new String[] { "343546", "765432" });
		double totalPrice = billingComp.getTotalPrice(cart);
		System.out.println("Total-" + totalPrice);

		// destroy
		applicationContext.close();

	}

}
