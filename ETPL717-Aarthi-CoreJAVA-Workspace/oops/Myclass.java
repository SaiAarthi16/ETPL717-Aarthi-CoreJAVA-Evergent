package com.evergent.corejava.oops;
public class Myclass extends Calculation{
	public void show() {
		System.out.println("Local Method");
	}
	public static void main(String[] args) {
		Myclass my=new Myclass();
		my.show();
		my.addition();
	}
}
