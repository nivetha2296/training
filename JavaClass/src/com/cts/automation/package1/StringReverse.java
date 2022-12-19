package com.cts.automation.package1;

public class StringReverse {

	public static void main(String[] args) {

		String s= "Nivetha Saravanan";
		int num= s.length();
		num =num-1;
		int i=num;
		while(i>=0) {
			System.out.print(s.charAt(i));
			i--;
		}
	}

}
