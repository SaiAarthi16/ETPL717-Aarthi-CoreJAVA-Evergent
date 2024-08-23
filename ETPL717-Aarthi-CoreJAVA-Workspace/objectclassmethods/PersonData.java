package com.evergent.corejava.objectclassmethods;
class Person1{
	String name;
	int rollno;
	
	public Person1(String name, int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
	public String toString() {
		return name+rollno;
	}
}
public class PersonData {
	public static void main(String[] args) {
		Person1 p1=new Person1("Hii",48);
		System.out.println(p1);
		p1.hashCode();
	}
}
