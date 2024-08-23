package com.evergent.corejava.oops;
class MyPerson{
	public void PersonInfo() {
		System.out.println("Catherine");
	}
}
class PersonDetails extends MyPerson{
	public void PersonData() {
		System.out.println("Mystic Falls");
	}
}
public class MultiLevelInheritance extends PersonDetails {
	public void show() {
		System.out.println("Local Methods");
	}
	public static void main(String[] args) {
		MultiLevelInheritance mi=new MultiLevelInheritance();
		mi.PersonInfo();
		mi.PersonData();
		mi.show();
	}
}
