package com.evergent.corejava.exceptionhandling;
/*
 * 16. try followed by either catch block or finally block.
 */
public class ExceptionDemo6finally {
		String name="null";
		int k=2;
		public void myData() {
			try {
				System.out.println("one");
				System.out.println(name.length());
				int t=10/k;
				System.out.println("End");
			}
			finally {
				System.out.println("Finally Block for closing db/network connections.");
			}
		}
		public static void main(String[] args) {
			ExceptionDemo6finally ed6=new ExceptionDemo6finally();
			ed6.myData();
		}
	}
