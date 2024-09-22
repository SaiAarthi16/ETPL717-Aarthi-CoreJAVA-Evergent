package com.evergent.corejava.studentapplication;

public class StudentService {
	public int addStudentService(int studentId,String studentName,int marks)
	{  String grade="";
	
	   if(marks>100 && marks<0)
		   System.out.println("Invalid Marks!");
	   else if(marks<=35)
	   {
		   grade = "D";
	   }
	   else if(marks<=60)
	   {
		   grade = "C";	   
	   }
	   else if(marks<=80)
	   {
		   grade = "B";	   
	   }
	   else
	   {
		   grade = "A";
	   }
		StudentDAO studentDAO = new StudentDAO();
		StudentBean studentBean=new StudentBean();
	       studentBean.setStudentId(studentId);	
	       studentBean.setStudentName(studentName);
	       studentBean.setMarks(marks);
	       studentBean.setGrade(grade);
	
		   int updateResult= studentDAO.addStudent(studentBean);
		
		return 1;
	} 
}
