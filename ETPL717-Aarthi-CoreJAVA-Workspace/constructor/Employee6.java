package com.evergent.corejava.constructor;
class MyEmployee{
	int eno;
	public MyEmployee() {
		
	}
	MyEmployee(int eno){
		this.eno=eno;
		System.out.println("Employee No Super Class: " +eno);
	}
}
public class Employee6 extends MyEmployee{
	int eno;
	String ename;
	double sal;
	Employee6() {
		System.out.println("Default Constructor");
	}
	Employee6(int eno, String ename, double sal){
		super(eno);
		this.ename=ename;
		this.sal=sal;
	}
	public void display() {
		System.out.println("Employee No: "+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Sal: "+sal);
	}
	public static void main(String[] args) {
		new Employee6();
		Employee6 emp6=new Employee6(123,"Stefan",55000);
		emp6.display();
	}
}
