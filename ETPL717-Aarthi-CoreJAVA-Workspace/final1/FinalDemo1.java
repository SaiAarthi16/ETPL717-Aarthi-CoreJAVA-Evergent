package com.evergent.corejava.final1;
/* 1. Final is a Keyword.
   2. We can declare final as variable, method, class.
   3. Final variables we cannot modify.
 */

public class FinalDemo1 {
	final String cname="India";
	public void myData() {
		//The final field FinalDemo1.cname cannot be assigned
		//cname="Welcome";
		System.out.println("Cname: "+cname);
	}
	public static void main(String[] args) {
		FinalDemo1 fd=new FinalDemo1();
		fd.myData();
	}
}
