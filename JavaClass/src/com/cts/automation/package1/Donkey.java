package com.cts.automation.package1;

public class Donkey extends Animals {
	
	public void getDonkeyInfo() {
		System.out.println("I am inside DonkeyInfo Method ");
	}

	public static void main(String[] args) {
		
		Donkey d= new Donkey();
		d.getDonkeyInfo();
		d.animalInfo();
		
		
	}

}
