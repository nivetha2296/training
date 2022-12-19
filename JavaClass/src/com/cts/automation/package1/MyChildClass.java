package com.cts.automation.package1;

public class MyChildClass implements IFirstInterface{

	public void sample(int x) {
		
		System.out.println("the valuue of x is "+x);
		
	}


	public void sample(int a, String s) {
		
		System.out.println("the value of a is "+a);
		System.out.println("The value of s is "+s);
		
	}

public static void main(String[] args) {

		MyChildClass child = new MyChildClass();
		child.sample(10);
		child.sample(20, "Nivetha");
		
	}
}
