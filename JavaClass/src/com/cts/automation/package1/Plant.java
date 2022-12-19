package com.cts.automation.package1;

public class Plant extends Tree {
	
	int Branch =20;
	int Leaves =30;

	public Plant(int a) {
		super(a);
		System.out.println("plant needs sunlight");
	}
  
	public void protein() {
		
		System.out.println("plant need less space to grow");
		System.out.println(this.branch);
		System.out.println(super.branch);
		System.out.println(this.Leaves);
		System.out.println(super.leaves);
	
	}
	

}
