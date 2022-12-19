package com.cts.automation.package1;

public class UserChildClass implements IUserA,IUserB{

	
	public void loginB(String s2,int age) {
		
		System.out.println("The name of the userB name is :"+s2);
		System.out.println("The age of the UserB is :"+age);
		
	}

	public void loginA(String s1, int age) {
		System.out.println("The name of the userA name is :"+s1);
		System.out.println("The age of the UserA is :"+age);
		
	}
	
	public void needB(String n2) {
		
		System.out.println("userB need to add to cart :"+n2);
		
	}
	public void needA(String n1) {
		System.out.println("userA need to add to cart :"+n1);
		
	}
	public void payment(String p1) {
		System.out.println("the payment type is :"+p1);
		
	}
	
	public static void main(String[] args) {
		
		UserChildClass child = new UserChildClass();
		child.loginA("Saravanan", 50);
		child.needA("clothes");
		child.loginB("Kalavathi", 47);
		child.needB("Jewellery");
		child.payment("Cash On Delivery");

	}

}
