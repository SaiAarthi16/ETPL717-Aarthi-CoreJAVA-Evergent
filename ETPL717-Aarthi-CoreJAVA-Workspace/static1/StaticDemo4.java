package com.evergent.corejava.static1;
// 6. Non static method can access static variables and static methods
public class StaticDemo4 {
	static String cname="India";//static variables/class variables
	String name="Klaus";//non static variables
	static public void myData() { //static methods/class methods
		//Cannot make a static reference to the non-static method show() 
		//from the type StaticDemo3
		//show();
		System.out.println("MyData");
	}
	public void show() {//non static method
		myData();
		System.out.println("show is non static method");
	}
	public static void main(String[] args) {
		myData();
		System.out.println(cname);
		StaticDemo4 sd4=new StaticDemo4();
		sd4.show();
	}
}