package com.evergent.corejava.studentapplication;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		int studentId=0;
		String studentName="";
		int marks=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Student ID");
		studentId=sin.nextInt();
		System.out.println(("Enter Student Name"));
		studentName = sin.next();
		System.out.println("Enter Student Marks");
		marks = sin.nextInt();
		
		StudentService studentService = new StudentService();
		
		int updeateCount=studentService.addStudentService(studentId,studentName,marks);
		//last
		  System.out.println("Inserted :"+updeateCount+" record Success");
	}
}
