package com.evergent.corejava.exceptionhandling;
/*
 * 11. try is for business logic.
 * 12. catch for handling exceptions.
 * 13. finally is a block, if exceptions occurs or not finally block will be executed.
 */
public class ExceptionDemo5finally {
		String name="null";
		int k=0;
		public void myData() {
			try {
				System.out.println("one");
				System.out.println(name.length());
				int t=10/k;
				System.out.println("End");
			}
			catch(NullPointerException e) {
				System.out.println("I can handle : "+e);
			}
			catch(ArithmeticException e) {
				System.out.println("I can handle : "+e);
			}
			catch(Exception e) {
				System.out.println("I can handle : "+e);
			}
			finally {
				System.out.println("Finally Block for closing db/network connections.");
			}
		}
		public static void main(String[] args) {
			ExceptionDemo5finally ed5=new ExceptionDemo5finally();
			ed5.myData();
		}
	}
