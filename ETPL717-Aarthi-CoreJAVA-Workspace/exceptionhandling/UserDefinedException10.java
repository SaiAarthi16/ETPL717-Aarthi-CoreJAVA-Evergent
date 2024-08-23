package com.evergent.corejava.exceptionhandling;
class InvalidAgeException extends Exception{
	public InvalidAgeException (String message) {
		super(message);
	}
}
public class UserDefinedException10 {
	public static void checkAge(int age) throws InvalidAgeException {
		if(age < 18)
			throw new InvalidAgeException("Age must be 18 or older...");
		else
			System.out.println("Access granted, you are old enough!...");
		}
		public static void main(String[] args) {
			try {
			checkAge(16);
			}
			catch(InvalidAgeException e) {
				System.out.println("Caught the exception : "+e.getMessage());
			}
			System.out.println("Program continuues after handling the exception..");
		}
	}
