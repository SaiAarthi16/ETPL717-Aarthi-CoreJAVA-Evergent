package com.evergent.corejava.logicalprogramming;
public class SwapTempDemo1 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Original Numbers a is "+a+" and b is "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Numbers after Swap a is "+a+" and b is "+b);
	}
}
