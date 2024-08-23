package com.evergent.corejava.oops;
class MyBigData{
	public void myData() {
		System.out.println("MyBigData: class Method");
	}
}
public class MethodOverriding extends MyBigData {
	public void myData() {
		System.out.println("myData");
	}
	public void show() {
		System.out.println("Local show method");
	}
	public static void main(String[] args) {
		MethodOverriding ovr=new MethodOverriding();
		ovr.myData();
		ovr.show();
	}
}
