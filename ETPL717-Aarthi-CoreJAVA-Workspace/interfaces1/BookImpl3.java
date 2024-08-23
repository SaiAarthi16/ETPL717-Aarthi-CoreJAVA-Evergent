package com.evergent.corejava.interfaces1;
/*
   8. Java will support multiple Inheritance through Interface.
   9. One class implements interfaces.
 */
public class BookImpl3 implements Book, NewBook {
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
	public void addNewBook() {
		System.out.println("Java New Version");
	}
	public void myData() {
		System.out.println("My Data Interface");
	}

	public static void main(String[] args) {
		BookImpl3 book1=new BookImpl3();
		book1.bookTitle();
		book1.bookAuthor();
		book1.bookPrice();
		book1.show();
		book1.addNewBook();
		book1.myData();
	}

}
