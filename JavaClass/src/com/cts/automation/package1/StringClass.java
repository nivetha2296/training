package com.cts.automation.package1;

public class StringClass {

	public static void main(String[] args) {
		String s= "Saravanan@123";
		String s1= "Saravanan@1234";
		String s2="saravanan@123";
		
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println(s.charAt(8));
		if (s.equals(s1)) {
			System.out.println("both Strings are equal");
		}else
		{
			System.out.println("Both Strings are not equal");
		}
		if(s.equalsIgnoreCase(s2)) {
			System.out.println("both Strings are equal");
		}else
		{
			System.out.println("Both Strings are not equal");
		}
		if(s.contains("rav")) {
			System.out.println("contains");
		}else
		{
			System.out.println("not contains");
		}
		String s3= s.toLowerCase();
		String s4= s.toUpperCase();
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s.isEmpty());
		

	}

}
