package com.evergent.corejava.bookapplication;
import java.util.Scanner;
public class MainController {

	public static void main(String[] args) {
		int bookId=0;
		String title="";
		float price=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Book ID");
		bookId=sin.nextInt();
		System.out.println(("Enter Book Title"));
		title = sin.next();
		System.out.println("Enter Book Price");
		price = sin.nextFloat();
		
		BookService bookService = new BookService();
		
		int updeateCount=bookService.addBookService(bookId,title,price);
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record Success");
	}
}
