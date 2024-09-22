package com.evergent.corejava.collections;
import java.util.ArrayList;

class Book{
	String name;
	public Book(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}
	
public class CF9_ArrayList_BookObject {
	public static void main(String[] args) {
		
		Book b1=new Book("CoreJAVA");
		Book b2=new Book("Let US C");
		Book b3=new Book("JAVA Index Book");
		Book b4=new Book("JAVA Interview Book");
		
		ArrayList myList=new ArrayList();
		myList.add(b1);
		myList.add(b2);
		myList.add(b3);
		myList.add(b4);
		System.out.println(myList);
	}
}
