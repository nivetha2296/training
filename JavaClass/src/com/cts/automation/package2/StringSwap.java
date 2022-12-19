package com.cts.automation.package2;

public class StringSwap {

	public static void main(String[] args) {
		String a = "Nivetha";
		String b = "Saravanan";

		a = a + b;
		b = a.substring(0, (a.length() - b.length()));
		a = a.substring(b.length());

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
