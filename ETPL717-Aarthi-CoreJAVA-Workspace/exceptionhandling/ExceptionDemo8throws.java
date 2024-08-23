package com.evergent.corejava.exceptionhandling;
/*
 * 14. throws an exception will be executed method by method. 
 */
public class ExceptionDemo8throws {
		String name=null;
		public void myData() throws NullPointerException {
				System.out.println("one");
				System.out.println(name.length());
				System.out.println("End");
		}
		public void myInfo() throws NullPointerException{
			myData();
			System.out.println("My Info Methods");
		}
		public static void main(String[] args) {
			try {
			ExceptionDemo8throws ed8=new ExceptionDemo8throws();
			ed8.myInfo();
			}
			catch(Exception e) {
				System.err.println("I can handle : "+e);
			}
			System.out.println(" Hiiiii ");
		}
	}
