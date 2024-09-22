package com.evergent.corejava.studentapplication;
import java.util.ArrayList;

public class StudentDAO {
	public int addStudent(StudentBean studentBean)
	{
		try{
			ArrayList studentList=new ArrayList();
			studentList.add(studentBean.getStudentId());
			studentList.add(studentBean.getStudentName());
			studentList.add(studentBean.getMarks());
			studentList.add(studentBean.getGrade());	
			
			System.out.println(studentList);
			System.out.println("Student ID :"+studentBean.getStudentId());
			System.out.println("Student Name :"+studentBean.getStudentName());
			System.out.println("Student Marks :"+studentBean.getMarks());
			System.out.println("Student Grade :"+studentBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}
}
