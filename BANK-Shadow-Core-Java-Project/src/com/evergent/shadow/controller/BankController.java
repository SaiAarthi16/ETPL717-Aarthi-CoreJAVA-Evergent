package com.evergent.shadow.controller;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

import com.evergent.shadow.service.BankService;
public class BankController {
public static void main(String args[])
{
	int accountNumber=0;
	String customerName="";
	double accountBalance=0;
	long mobileNumber=0;
	int ch,ch1=1;
	Scanner s=new Scanner(System.in);
	System.out.println("------------------------WELCOME TO YOUR BANK---------------------");
	BankService bankService = new BankService();
	while(ch1!=0)
	{
		
		System.out.println("1.Create a New Account");
		System.out.println("2.Show Account Balance");
		System.out.println("3.Deposite Money");
		System.out.println("4.Withdraw Money");
		System.out.println("5.Fund Transfer");
		System.out.println("6.Print Transactions");
		System.out.println("Enter your choice :");
		ch=s.nextInt();
		switch(ch)
			{
			case 1:
				System.out.println("Enter Account Number");
				accountNumber = s.nextInt();
				System.out.println("Enter Name");
				customerName = s.next();	
				System.out.println("Enter Mobile Number:");
				mobileNumber=s.nextLong();
				System.out.println("Enter opening balance");
				accountBalance = s.nextDouble();
				int updateCount = bankService.createAccount(accountNumber,customerName,mobileNumber,accountBalance);	
				System.out.println(updateCount+" Account Created successfully");
				break;
				
			case 2:
				try
					{
					System.out.println("Enter your account number");
					int accno=s.nextInt();
					double balance=bankService.showBalance(accno);
					System.out.println("Your Account Balance: "+balance);
					}catch(Exception e){e.printStackTrace();}
					break;
					
			case 3:
				try
					{	
					System.out.println("Enter the account number to deposite");
					int b=s.nextInt();
					System.out.println("Enter the amount to be deposited");
					double c=s.nextDouble();
					double a =bankService.deposite(b,c);
					System.out.println("Amount deposited successfully\n Your current account balance is: "+a);
					}catch(Exception e){e.printStackTrace();}
					break;
			case 4:
				try {
					System.out.println("Enter the Account Number");
					int b=s.nextInt();
					System.out.println("Enter the amount to withdraw");
					double c = s.nextDouble();	
					int a=bankService.withdraw(b,c);
					if(a==0)
					{
						double balance=bankService.showBalance(b);
						System.out.println("You do not have sufficient fund to withdraw\n Your Account Balance is: "+balance);
					}
					else {
						double balance=bankService.showBalance(b);
						System.out.println("Collect Your Money\n Your Account Balance is: "+balance);
					}
					
				}catch(Exception e) {e.printStackTrace();}
				break;
				
			case 5:
			{
				System.out.println("Enter the account number from which you want to transfer money");
				int a=s.nextInt();
				System.out.println("Enter the account number to which you want to transfer money");
				int b=s.nextInt();
				System.out.println("Enter the amount to be transferred");
				double c=s.nextDouble();
				int rs=bankService.ftrans(a,b,c);
				if(rs!=0)
				{
					double balance=bankService.showBalance(a);
					System.out.println("Fund Transfered Successfully\n Your Account Balance is: "+balance);
				}
				else {
					double balance=bankService.showBalance(a);
					System.out.println("You do not have sufficient fund to Transfer\n Your Account Balance is: "+balance);
				}
				break;
			}
			case 6:
			{
				System.out.println("Enter the account number");
				int accno=s.nextInt();
				String tran=bankService.getTransaction(accno);
				System.out.println("---------------YOUR TRANSATIONS ARE---------------\n");
				System.out.println(tran);
				break;
			}
			default:
					System.out.println("Enter Valid Choice");
					break;
			
			}
		System.out.println("\nEnter 1 to perform More Operations and 0 for Exit :");
		ch1=s.nextInt();
		}
		
}
}
