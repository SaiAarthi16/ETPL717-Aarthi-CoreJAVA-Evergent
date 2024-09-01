package com.evergent.corejava.exceptionhandling;
/*
 *23. Handling Multiple Exceptions with throws
 */
public class ExceptionDemo18_Multiple_throws {
		String name=null;
		int k=0;
		public void myData() throws NullPointerException, ArithmeticException  {
			try {
				System.out.println("one");
				System.out.println(name.length());
				int d=10/k;
				System.out.println(d);
				System.out.println("End");
			}
			catch(Exception e) {
				System.out.println("I can handle : "+e);
			}
		}
		public static void main(String[] args) {
			try {
			ExceptionDemo18_Multiple_throws ed7=new ExceptionDemo18_Multiple_throws();
			ed7.myData();
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
		}
	}
