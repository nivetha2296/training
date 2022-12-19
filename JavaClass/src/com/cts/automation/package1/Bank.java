package com.cts.automation.package1;

public class Bank {

	public void bankInfo(int a) {
		System.out.println("The account number is "+a);
	}
	
	public void bankInfo(String b) {
		System.out.println("The Pan number is " +b); 
	}
	public void bankInfo(Boolean c) {
		if (c==true)
		{
			System.out.println("the account is active in status");
		}else
		{
			System.out.println("Account is inactive");
		}
	}
		
	public static void main(String[] args) {
		
		Bank b1= new Bank();
		b1.bankInfo(123456789);
		b1.bankInfo("Aen1234567J");
		b1.bankInfo(true);
		
		

	}

}
