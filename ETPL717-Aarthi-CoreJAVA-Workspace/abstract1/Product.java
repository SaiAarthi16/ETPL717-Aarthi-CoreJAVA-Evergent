package com.evergent.corejava.abstract1;
/*
	1.Abstract is a Keyword.
	2.Abstract class having abstract methods and concrete methods ( implementation methods ).
	3.If any class having one abstract methods that class should be declared as a abstract keyword 
	otherwise that class will be showing compile time error.
 */
abstract public class Product {
	abstract public void newProduct();
	public void allProducts() {
		System.out.println("All Products");
	}
}
