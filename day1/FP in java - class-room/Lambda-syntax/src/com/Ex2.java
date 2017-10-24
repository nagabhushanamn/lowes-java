package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {

	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

public class Ex2 {

	public static void main(String[] args) {

		Product product1 = new Product(64532, "item1", 12000.00);
		Product product2 = new Product(12343, "item2", 42000.00);
		Product product3 = new Product(54323, "item3", 22000.00);
		Product product4 = new Product(34556, "item4", 82000.00);

		List<Product> list = new ArrayList<>();
		list.add(product1);
		list.add(product2);
		list.add(product3);
		list.add(product4);

		// ---------------------------------------------
		
		//		Collections.sort(list, new Comparator<Product>() {
		//			@Override
		//			public int compare(Product o1, Product o2) {
		//				if (o1.getId() > o2.getId())
		//					return 1;
		//				if (o1.getId() < o2.getId())
		//					return -1;
		//				else
		//					return 0;
		//			}
		//		});
		
		//---------------------------------------------------
		
		Comparator<Product> idComparator=(Product p1,Product p2)->p1.getId()-p2.getId();
		Comparator<Product> nameComparator=(p1,p2)->p1.getName().compareTo(p2.getName());
		
		Collections.sort(list,nameComparator);
		
		//------------------------------------------------
		
		
		display(list);

		// ----------------------------------------------
		
		
		Thread thread=new Thread(()->{});
		thread.start();

	}

	private static void display(List<Product> list) {
		for (Product product : list)
			System.out.println(product);
	}

}
