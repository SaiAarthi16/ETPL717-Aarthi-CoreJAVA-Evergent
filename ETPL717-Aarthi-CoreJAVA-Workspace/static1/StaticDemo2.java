package com.evergent.corejava.static1;
//4. Static methods can access static methods & static variables only. 

public class StaticDemo2 {
	static String cname="India";//static variables/class variables
	String name="Klaus";//non static variables
	static public void myData() { //static methods/class methods
		System.out.println("MyData");
	}
	public void show() {//non static method
		System.out.println("show is non static method");
	}
	public static void main(String[] args) {
		myData();
		System.out.println(cname);
	}
}