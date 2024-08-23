
package com.evergent.corejava.exceptionhandling;
import java.util.*;
class AgeNotSupportException extends Exception{
	public AgeNotSupportException(String message) {
		System.out.println("Hello : "+message);
	}
}
public class ProductImpl10 {
	public void myData(int age) throws AgeNotSupportException {
		if(age >= 18)
			throw new AgeNotSupportException("Person is eligible for vote.. ");
		else
			System.out.println("Person is not eligible for vote...");
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the age : ");
			int age=sc.nextInt();
			try {
			ProductImpl10 product=new ProductImpl10();
			product.myData(age);
			}
			catch(Exception e) {
				System.out.println("I can handle : "+e);
			}
		}
	}
