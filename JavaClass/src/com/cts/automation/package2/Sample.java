package com.cts.automation.package2;

public class Sample {
//public static char [] b;
	public  static int t =0;
	public static int e=0;
	public  static int s=0;
	public static int a=0;
	public static int u=0;
	public static int o=0;
	public static int m=0;
	public static int i1=0;
	public static int n=0;
	public static void main(String[] args) {
		Sample s1= new Sample();
		String test="TestAutomation";
		char[] ch= new char[test.length()];
		for (int i=0; i<test.length();i++) {
			ch[i] = test.charAt(i);
			
		}
		System.out.println(ch[0]);
//		for(char c:ch) {
//			System.out.println(c);	
//			
//		}
		for(int i=0;i<ch.length;i++) {
			  char value = ch[i];
			if(value == 't') {
			
				t++;
			}
			else if(value =='e')
			{
				
				e++;
			}else if(value == 's')
			{
				
				s++;
			}else if(value == 'a')
			{
				
				a++;
			}else if(value =='u')
			{
				
				u++;
			}else if(value == 'o')
			{
				
				o++;
			}else if(value =='m')
			{
				
				m++;
			}else if(value =='i')
			{
				
				i1++;
			}else if(value =='n')
			{
				
				n++;
			}
			

		}
		System.out.printf("The Count of T is : " +(s1.t)+"%n");
		System.out.printf("The Count of E is : " +(s1.e)+"%n");
		System.out.printf("The Count of S is : " +(s1.s)+"%n");
		System.out.printf("The Count of A is : "+(s1.a)+"%n");
		System.out.printf("The Count of U is : "+(s1.u)+"%n");
		System.out.printf("The Count of O is : "+(s1.o)+"%n");
		System.out.printf("The Count of M is : "+(s1.m)+"%n");
		System.out.printf("The Count of I is : "+(s1.i1)+"%n");
		System.out.printf("The Count of N is : "+(s1.n)+"%n");
		
	}



}
