package com.cts.automation.package1;

public class Monkey extends Animals{

	public void getMonkeyInfo() {
		System.out.println("I am inside MonkeyInfo Method ");
	}
	public static void main(String[] args) {
		Monkey m= new Monkey();
		m.getMonkeyInfo();
		m.animalInfo();

	}

}
