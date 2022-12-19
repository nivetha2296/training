package com.cts.automation.package1;

public class ConstructorClass {

	public ConstructorClass(String a, String b) {
		String c= a+b;
		System.out.println(c);
	}
	public ConstructorClass(int a, int b, int c) {
		int x= a+b+c;
		System.out.println(x);
	}
	public ConstructorClass(char c) {
		System.out.println(" the value of the char is :"+c);
	}
	
	public static void main(String[] args) {
		ConstructorClass c1= new ConstructorClass("Nivetha", "Saravanan");
		ConstructorClass c2= new ConstructorClass(10,20,30);
		ConstructorClass c3 = new ConstructorClass('s');

	}

}
