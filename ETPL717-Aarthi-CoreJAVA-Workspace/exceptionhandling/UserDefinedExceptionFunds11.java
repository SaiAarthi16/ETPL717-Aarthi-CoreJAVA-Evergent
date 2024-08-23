package com.evergent.corejava.exceptionhandling;
class InsufficientFundsException extends Exception{
	public InsufficientFundsException (String message) {
		super(message);
	}
}
public class UserDefinedExceptionFunds11 {
	public static void withdraw(double amount) throws InsufficientFundsException {
		double balance=500.00;
		if(amount > balance)
			throw new InsufficientFundsException("Insuffient Funds to withdraw...");
		else
			System.out.println("Withdraw successfull...");
		}
		public static void main(String[] args) {
			try {
			withdraw(600.00);
			}
			catch(InsufficientFundsException e) {
				System.out.println("Caught the exception : "+e.getMessage());
			}
			System.out.println("Program continuues after handling the exception..");
		}
	}
