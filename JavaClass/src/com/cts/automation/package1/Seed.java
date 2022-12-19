package com.cts.automation.package1;

public class Seed extends Plant{
	int Branch=0;
	int Leaves = 1;
	

	public Seed(int a) {
		super(a);
		System.out.println("Seed need soil and waterto grow");
		System.out.println(this.Branch);
		System.out.println(super.branch);
		
	}

	public static void main(String[] args) {

		Seed s1= new Seed(10);
		s1.protein();
	}

}
