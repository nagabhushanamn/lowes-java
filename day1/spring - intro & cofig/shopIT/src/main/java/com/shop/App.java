package com.shop;

import java.util.Arrays;
import java.util.List;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init..
		BillingImpl bilComp = new BillingImpl();

		// use..
		List<String> cart = Arrays.asList(new String[] { "343546", "765432" });
		double totalPrice = bilComp.getTotalPrice(cart);
		System.out.println("Total-" + totalPrice);

		// destroy
		// ..

	}

}
