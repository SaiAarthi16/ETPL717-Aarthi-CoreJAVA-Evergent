package com.evergent.corejava.oops;
public class Person {
	String name="Klaus";
	int age=200;
	String address="NewOrleans";	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.display();
	}
}
