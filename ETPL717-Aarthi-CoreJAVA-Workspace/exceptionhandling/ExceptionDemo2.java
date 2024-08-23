package com.evergent.corejava.exceptionhandling;
/*
 * 3. All Exception are executed while abnormal conditions only.
 * 4. Normal flow it won't execute any exceptions.(won't execute catch block).
 */
public class ExceptionDemo2 {
		String name="null";
		public void myData() {
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
			ExceptionDemo2 ed2=new ExceptionDemo2();
			ed2.myData();
		}
	}
