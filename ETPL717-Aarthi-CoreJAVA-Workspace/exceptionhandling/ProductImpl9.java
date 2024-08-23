package com.evergent.corejava.exceptionhandling;
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message) {
		System.out.println("Hello : "+message);
	}
}
public class ProductImpl9 {
	int pno=105;
	public void myData() throws ProductNotFoundException {
		if(pno > 100)
			throw new ProductNotFoundException("This product Not available...");
		else
			System.out.println("Product is available...");
		}
		public static void main(String[] args) {
			try {
			ProductImpl9 product=new ProductImpl9();
			product.myData();
			}
			catch(Exception e) {
				System.err.println("I can handle : "+e);
			}
		}
	}
