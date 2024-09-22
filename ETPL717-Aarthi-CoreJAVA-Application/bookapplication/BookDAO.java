package com.evergent.corejava.bookapplication;

import java.util.ArrayList;

public class BookDAO {	
	                       //  100  corejava 250   c
	public int addBook(BookBean bookBean)
	{
		try{
			ArrayList bookList=new ArrayList();
			bookList.add(bookBean.getBookId());
			bookList.add(bookBean.getTitle());
			bookList.add(bookBean.getPrice());
			bookList.add(bookBean.getGrade());	
			
			System.out.println(bookList);
			
			System.out.println("Book ID :"+bookBean.getBookId());
			System.out.println("Book Title :"+bookBean.getTitle());
			System.out.println("Book Price :"+bookBean.getPrice());
			System.out.println("Book Grade :"+bookBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}
}
