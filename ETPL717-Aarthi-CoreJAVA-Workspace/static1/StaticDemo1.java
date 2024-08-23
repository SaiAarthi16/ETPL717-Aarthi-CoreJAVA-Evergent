package com.evergent.corejava.static1;
/* 1. Static is a Keyword.
   2. We can declare static as variables, methods.
   3. We can access static variables and methods direct through 
       classname.methodname, classname.variablename
 */
public class StaticDemo1 {
	static String cname="India";
	static public void myData() {
		System.out.println("MyData");
	}
	public static void main(String[] args) {
		System.out.println(StaticDemo1.cname);
		StaticDemo1.myData();
	}
}
