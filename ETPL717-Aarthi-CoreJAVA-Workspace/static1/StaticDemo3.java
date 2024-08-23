package com.evergent.corejava.static1;
// 5.static methods cannot access non static methods & non static variables directly
public class StaticDemo3 {
	static String cname="India";//static variables/class variables
	String name="Klaus";//non static variables
	static public void myData() { //static methods/class methods
		//Cannot make a static reference to the non-static method show() 
		//from the type StaticDemo3
		//show();
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