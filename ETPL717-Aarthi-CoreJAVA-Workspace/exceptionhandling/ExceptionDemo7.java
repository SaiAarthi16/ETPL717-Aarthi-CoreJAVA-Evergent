package com.evergent.corejava.exceptionhandling;
/*
 * 14. throws an exception will be executed method by method. 
 */
public class ExceptionDemo7 {
		String name=null;
		public void myData() throws NullPointerException {
			try {
				System.out.println("one");
				System.out.println(name.length());
				System.out.println("End");
			}
			catch(NullPointerException e) {
				System.out.println("I can handle : "+e);
			}
		}
		public static void main(String[] args) {
			try {
			ExceptionDemo7 ed7=new ExceptionDemo7();
			ed7.myData();
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
		}
	}
