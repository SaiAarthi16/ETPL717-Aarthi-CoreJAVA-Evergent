package com.evergent.corejava.javabeans;

public class StudentImpl {

	public static void main(String[] args) {
		StudentBean stu=new StudentBean();
		stu.setSno(100);
		stu.setName("Klaus");
		stu.setAddress("New Orleans");
		
		System.out.println(stu);
	}
}
