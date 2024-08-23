package com.evergent.corejava.abstract1;
/*
	5.We cannot create object to abstract class but we can create reference to abstract class.
 */

public class ProductImpl2 extends Product {
	
	public void show() {
		System.out.println("Local show methods");
	}
	public void newProduct() {
		System.out.println("My New Product");	
	}
	public static void main(String[] args) {
		Product p2=new ProductImpl2();
		//p2.show();
		p2.newProduct();
		p2.allProducts();
	}
}
