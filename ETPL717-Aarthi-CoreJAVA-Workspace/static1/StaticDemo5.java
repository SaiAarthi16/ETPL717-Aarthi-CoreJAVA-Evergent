package com.evergent.corejava.static1;
// 7.Static Block
public class StaticDemo5 {
	static String cname="India";
	static {
		System.out.println("Static block");
	}
	static public void myData() {
		System.out.println("MyData");
	}
	public static void main(String[] args) {
		System.out.println(StaticDemo5.cname);
		StaticDemo5.myData();
	}
}
