package com.evergent.corejava.oops;
public class MethodsFlow {
	public void show1() {
		System.out.println("No Parameters with no return type");
	}
	public void show2(int a, int b) {
		System.out.println("Parameters with no return type: "+(a+b));
	}
	public int show3(int a, int b) {
		System.out.println("Parameters with return type");
		return a*b;
	}
	public int show4() {
		System.out.println("No Parameters with return type");
		return 100;
	}
	public static void main(String[] args) {
		MethodsFlow mf=new MethodsFlow();
		mf.show1();
		mf.show2(10, 20);
		int t=mf.show3(5, 5);
		System.out.println(t);
		int k=mf.show4();
		System.out.println(k);
	}
}
