package com.evergent.corejava.abstract1;
/*
	4.If any class extends abstract class that class should be override all abstract methods 
	otherwise that class will be showing compile time error.
	5.We cannot create object to abstract class but we can create reference to abstract class.
 */

public class ProductImpl extends Product {
	public void show() {
		System.out.println("Local show methods");
	}
	public void newProduct() {
		System.out.println("My New Product");	
	}
	public static void main(String[] args) {
		ProductImpl product1=new ProductImpl();
		product1.show();
		product1.newProduct();
		product1.allProducts();
	}
}
