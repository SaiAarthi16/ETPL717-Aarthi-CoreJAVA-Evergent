package com.evergent.corejava.exceptionhandling;
/*
 * 25. In java, try inside a try is called Nested Try.
 */
public class Exception_NestedTryCatch20 {
		String name=null;
		int k=0;
		public void myData() {
			try {
				System.out.println("one");
				System.out.println(name.length());
				try {
					int t=10/k;
				}
				catch(ArithmeticException e) {
					System.out.println("Nested Try: "+e);
				}
				finally {
					System.out.println("finally block: Inner Try");
				}
				System.out.println("End");
			}
			catch(NullPointerException | ArithmeticException e) {
				System.out.println("I can handle : "+e);
			}
			finally {
				System.out.println("Outer finally block");
			}
		}
		public static void main(String[] args) {
			Exception_NestedTryCatch20 ed20=new Exception_NestedTryCatch20();
			ed20.myData();
		}
	}