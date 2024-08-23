package com.evergent.corejava.constructor;
public class Employee3 {
	int eno;
	String ename;
	double sal;
	Employee3() {
		System.out.println("Default Constructor");
	}
	Employee3(int eno, String ename, double sal){
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Employee No: "+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Sal: "+sal);
	}
	public static void main(String[] args) {
		new Employee3();
		Employee3 emp3=new Employee3(123,"Stefan",55000);
		emp3.display();
	}
}
