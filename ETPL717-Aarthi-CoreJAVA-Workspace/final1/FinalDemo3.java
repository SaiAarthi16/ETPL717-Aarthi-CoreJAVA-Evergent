package com.evergent.corejava.final1;
// 5. Final classes cannot inherited.

final class Myclass1{
	final public void myProducts() {
		System.out.println("All Products");
	}
}
//The type FinalDemo2 cannot subclass the final class Myclass
//public class FinalDemo2 extends Myclass{
public class FinalDemo3{
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
		FinalDemo3 fd1=new FinalDemo3();
		fd1.myData();
		fd1.myProducts1();
		
		//By using HAS-A relation
		Myclass1 mc1=new Myclass1();
		mc1.myProducts();
	}
}
