package com.evergent.corejava.io.serialization;
import java.io.Serializable;
public class Product implements Serializable {

	private int pid;

	private String pname;
	private double price;

	 public Product() {
		
	}
	public Product(int pid, String pname, double price) {

		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public double getPrice() {
		return price;
	}

}
