package com.evergent.corejava.final1;
// 4. Final methods cannot override.

class Myclass{
	final public void myProducts() {
		System.out.println("All Products");
	}
}
public class FinalDemo2 extends Myclass{
	final String cname="India";
	//Cannot override the final method from Myclass
	/*public void myProducts() {
		
	}*/
	public void myProducts1() {
		System.out.println("Hello Products");
	}
	public void myData() {
		//The final field FinalDemo1.cname cannot be assigned
		//cname="Welcome";
		System.out.println("Cname: "+cname);
	}
	public static void main(String[] args) {
		FinalDemo2 fd=new FinalDemo2();
		fd.myData();
		fd.myProducts1();
		fd.myProducts();
	}
}