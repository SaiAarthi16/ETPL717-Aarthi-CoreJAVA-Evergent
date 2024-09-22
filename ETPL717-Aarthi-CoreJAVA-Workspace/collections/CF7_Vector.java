package com.evergent.corejava.collections;
import java.util.Enumeration;
import java.util.Vector;

public class CF7_Vector {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Hello");
		v.add(100);
		v.add(45.5);
		System.out.println(v);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
