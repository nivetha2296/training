package com.cts.automation.package1;

public class E extends D{

	int e = 80;
	
	public void add() {
		
		int x= a+b+c+d+e;
		System.out.println(x);
	}
	public static void main(String[] args) {
		System.out.println("the toatal for all the globla variable is :");
		E e= new E();
		e.add();

	}

}
