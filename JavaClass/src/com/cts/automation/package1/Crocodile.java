package com.cts.automation.package1;

public class Crocodile extends Animals{

	public void getcrocodileInfo() {
		
		System.out.println("I am inside CrocodileInfo");
	}
	public static void main(String[] args) {
		
		Crocodile c = new Crocodile();
		c.getcrocodileInfo();
		System.out.println("Limbs:"+ c.limbs);
		System.out.println("Eyes :"+c.eyes);
		System.out.println("Brain:"+c.brain);

	}

}
