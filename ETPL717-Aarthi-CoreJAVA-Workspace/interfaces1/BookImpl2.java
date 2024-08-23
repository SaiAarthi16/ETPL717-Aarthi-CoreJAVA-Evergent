package com.evergent.corejava.interfaces1;
/*
  5.  We cannot create object to interface but we can create reference to interface.
 */
public class BookImpl2 implements Book {
	public void bookTitle() {
		System.out.println("Core JAVA");
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
		//Cannot instantiate the type Book
		//Book b1=new Book();
		Book b1=new BookImpl2();
		b1.bookTitle();
		b1.bookAuthor();
		b1.bookPrice();
		//The method show() is undefined for the type Book
		//b1.show();
	}
}
