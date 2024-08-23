package com.evergent.corejava.interfaces1;
/*
   4. If any class implements interface that class should be override 
   all interface methods otherwise that class will be showing compile time error.
 */
public class BookImpl implements Book {
	public void bookTitle() {
		System.out.println("Core JAVA "+cname);
	}
	public void bookAuthor() {
		System.out.println("Oracle Crop");
	}
	public void bookPrice() {
		System.out.println("Rs. 550/-");
	}
	public void show() {
		System.out.println("show is local method");
	}
	
	public static void main(String[] args) {
		BookImpl book1=new BookImpl();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
	}
}
