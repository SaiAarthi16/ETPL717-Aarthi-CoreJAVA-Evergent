package com.evergent.corejava.abstract1;
/*
 * 6.We can create constructor to abstract class.
 */
abstract public class Product3 {
	//abstract class constructor
	public Product3() {
		System.out.println("Product3 Constructor: abstract class");
	}
	
	abstract public void newProduct();
	public void allProducts() {
		System.out.println("All Products");
	}
}
