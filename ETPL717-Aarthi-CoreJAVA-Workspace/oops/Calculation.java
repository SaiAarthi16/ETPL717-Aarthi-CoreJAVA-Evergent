package com.evergent.corejava.oops;
public class Calculation {
	int a=20;
	int b=10;
	int c;
	public void addition() {
		c=a+b;
		System.out.println("Addition: "+c);
	}
	public void subtraction() {
		c=a-b;
		System.out.println("Subtraction: "+c);
	}
	public void multiplication() {
		c=a*b;
		System.out.println("Multiplication: "+c);
	}
	public void division() {
		c=a/b;
		System.out.println("Division: "+c);
	}
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		cal.addition();
		cal.subtraction();
		cal.multiplication();
		cal.division();

	}
}
