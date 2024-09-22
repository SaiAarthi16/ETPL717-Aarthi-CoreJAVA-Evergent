
package com.evergent.shadow.service;

import com.evergent.shadow.bean.BankBean;
import com.evergent.shadow.dao.BankDAO;

public class BankService {
	String str="";
	BankDAO bankDAO=new BankDAO();
	public int createAccount(int accountNumber,String customerName,long mobileNumber,double accountBalance)
	{
		BankBean bankBean=new BankBean();
		bankBean.setAccountNumber(accountNumber);
		bankBean.setBalance(accountBalance);
		bankBean.setCustomerName(customerName);
		bankBean.setMobileNumber(mobileNumber);
		int re=bankDAO.createAcc(bankBean);
		if(re!=0) {
		str="You Created An Account";
		bankDAO.addTran(accountNumber,str);}
		return re;
	}
	public double showBalance(int accno)
	{
		return bankDAO.showB(accno);
	}
	public double deposite(int accno,double money)
	{
		double beforeBalance=bankDAO.showB(accno);
		int a=bankDAO.dep(accno,money+beforeBalance);
		double balance=bankDAO.showB(accno);
		str="You Deposited: "+money;
		bankDAO.addTran(accno,str);
		return balance;
	}
	public int withdraw(int accno,double money)
	{
		double curBalance=bankDAO.showB(accno);
		if(money>curBalance)
		{
			return 0;
		}
		else {
			int rs=bankDAO.with(accno,curBalance-money);
			str="You Withdraw: "+money;
			bankDAO.addTran(accno,str);
			return rs;
		}
	}
	public int ftrans(int acc1,int acc2,double money)
	{
		double myBalance=bankDAO.showB(acc1);
		if(money>myBalance)
		{
			return 0;
		}
		else {
			int a=bankDAO.with(acc1,myBalance-money);
			double toBalance=bankDAO.showB(acc2);
			int b=bankDAO.dep(acc2,money+toBalance);
			str="You Transfered: "+money;
			bankDAO.addTran(acc1,str);
			return b;
		}
		
	}
	
	public String getTransaction(int accno)
	{
		String tran=bankDAO.getTrans(accno);
		return tran;
	}
}
