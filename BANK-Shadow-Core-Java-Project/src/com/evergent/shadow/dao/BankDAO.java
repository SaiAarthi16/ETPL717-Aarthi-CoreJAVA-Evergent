package com.evergent.shadow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.evergent.shadow.bean.BankBean;


public class BankDAO {

	Connection con=null;
	PreparedStatement pstmt=null;
	public int createAcc(BankBean obj)
	{
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  	{
			  con=BankDBConnection.getConnection(); 
			  
			  String ins_str ="insert into bank_database values(?,?,?,?)";
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,obj.getAccountNumber());
			  pstmt.setString(2,obj.getCustomerName());
			  pstmt.setLong(3, obj.getMobileNumber());
			  pstmt.setDouble(4,obj.getBalance());
			  int updateCount = pstmt.executeUpdate();
			  con.close();
			  return updateCount;
		  	}
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }  
	}
	public double showB(int accno)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			double balance=0;
			con=BankDBConnection.getConnection();
			String ins_str="select balance from bank_database where accno=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setInt(1, accno);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				{
					balance=rs.getDouble(1);
				}
			con.close();
			return balance;
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return 0;
		}
		
	}
	public int dep(int accno,double money)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=BankDBConnection.getConnection();
			String ins_str="update bank_database set balance=? where accno=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setInt(2, accno);
			pstmt.setDouble(1, money);
			int rs=pstmt.executeUpdate();
			con.close();
			return rs;
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return 0;
		}
	}
	
	public int with(int accno,double money)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=BankDBConnection.getConnection();
			String ins_str="update bank_database set balance=? where accno=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setInt(2, accno);
			pstmt.setDouble(1, money);
			int rs=pstmt.executeUpdate();
			con.close();
			return rs;
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return 0;
		}
	}
	
	public String getTrans(int accno)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			String trann="";
			con=BankDBConnection.getConnection();
			String ins_str="select transaction from transactions where accno=?";
			pstmt=con.prepareStatement(ins_str);
			pstmt.setInt(1, accno);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				{
					trann+=rs.getString(1)+"\n";
				}
			con.close();
			return trann;
			}
		catch(Exception e)
		{
			System.out.println(e.toString());
			return "0";
		}
	}
	
	public void addTran(int accno,String tran)
	{
	Connection con=null;
	PreparedStatement pstmt=null;
	
		  try
		  	{
			  con=BankDBConnection.getConnection(); 
			  
			  String ins_str ="insert into transactions values(?,?)";
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,accno);
			  pstmt.setString(2,tran);
			  pstmt.executeUpdate();
			  con.close();
		  	}
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
		  }  
	
	}
}
