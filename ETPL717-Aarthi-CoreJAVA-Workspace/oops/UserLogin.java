package com.evergent.corejava.oops;
public class UserLogin {
	public void logindetails() {
		System.out.println("Login Details");
	}
	public void logindetails(String username, String pass){
		System.out.println("Username: "+username);
		System.out.println("Password: "+pass);
	}
	public void logindetails(String username, String pass, String captcha){
		System.out.println("Username: "+username);
		System.out.println("Password: "+pass);
		System.out.println("Captcha: "+captcha);
	}
	public int logindetails(int mobile, String address){
		System.out.println("Mobile: "+mobile);
		System.out.println("Address: "+address);
		return 0;
	}
	public void show() {
		System.out.println("Method");
	}
	public static void main(String[] args) {
		UserLogin ulogin=new UserLogin();
		ulogin.logindetails();
		ulogin.logindetails("Damon","dam123");
		ulogin.logindetails("Klaus","k123","okook");
		ulogin.logindetails(12345678, "NewOrleans");
		ulogin.show();
	}
}