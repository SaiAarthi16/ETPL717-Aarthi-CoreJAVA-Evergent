package com.evergent.corejava.wrapperclasses;
import java.util.ArrayList;

public class WrapperClassesDemo4_ArrayList {
	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();

		int a=100;
		Integer i1=new Integer(a);
		mylist.add(i1);
		System.out.println(mylist);
		
		Integer i2=new Integer(200);
		mylist.add(i2);
		System.out.println(mylist);
		
		mylist.add(new Integer(45));
		System.out.println(mylist);
		System.out.println(mylist.get(1));
		
		//JDK 1.5
		ArrayList mylist1=new ArrayList();
		mylist1.add(100);
		System.out.println(mylist1.get(0));
	}
}
