package com.evergent.corejava.exceptionhandling;
/*
 * 24. In java, you can handle multiple exceptions by using multiple catch blocks 
 * or a multi-catch block. Start from Java 7.
 */
public class Exception19_Multi_Catch {
		String name="null";
		int k=0;
		public void myData() {
			try {
				System.out.println("one");
				System.out.println(name.length());
				int t=10/k;
				System.out.println("End");
			}
			catch(NullPointerException | ArithmeticException e) {
				System.out.println("I can handle : "+e);
			}
		}
		public static void main(String[] args) {
			Exception19_Multi_Catch ed19=new Exception19_Multi_Catch();
			ed19.myData();
		}
	}