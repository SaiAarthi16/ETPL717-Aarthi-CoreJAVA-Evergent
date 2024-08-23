package com.evergent.corejava.javabeans;
import java.io.Serializable;

public class Employee implements Serializable{
	private int eno;
	private String ename;
	private double sal;
	
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getEno() {
		return eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEname() {
		return ename;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getSal() {
		return sal;
	}
}
