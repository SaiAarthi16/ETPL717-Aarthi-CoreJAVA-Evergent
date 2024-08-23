package com.evergent.corejava.generalprogramming;
//Swap of two variables without using temp.
public class Myname3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Numbers without swap - a is "+a+" and b is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swap - a is "+a+" and b is "+b);
	}

}
