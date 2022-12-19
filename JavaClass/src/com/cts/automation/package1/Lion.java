package com.cts.automation.package1;

public class Lion extends Animal{
	int eyes=2;
	
	public void animalInfo(int x) {
		System.out.println("Total no of eyes is "+eyes);
	}

	public static void main(String[] args) {
        Lion l1= new Lion();
        l1.animalInfo(10);
        Animal a1 = new Animal();
        a1.animalInfo(20);
        System.out.println("total no of legs is "+l1.legs);
        System.out.println("total no of legs is "+a1.legs);

	}

}
