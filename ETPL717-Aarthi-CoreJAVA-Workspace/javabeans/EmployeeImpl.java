package com.evergent.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		// Store the values to Bean
		Employee emp=new Employee();
		emp.setEno(100);
		emp.setEname("Klaus");
		emp.setSal(55000);
		
		//Retrieve values from Bean
		System.out.println("Employee No: "+emp.getEno());
		System.out.println("Employee Name: "+emp.getEname());
		System.out.println("Employee Salaray: "+emp.getSal());

	}
}
