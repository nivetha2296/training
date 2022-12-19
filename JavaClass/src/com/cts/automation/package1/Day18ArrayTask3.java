package com.cts.automation.package1;

import java.util.Scanner;

public class Day18ArrayTask3 {

	public static void main(String[] args) {

		int a[]= new int[10];
		System.out.println("Enter "+a.length+" int values");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++) {
			System.out.println("Enter the value of element no:"+(i+1));
			a[i]=sc.nextInt();
		}
		for(int w=0;w<=a.length-1;w++) {
			System.out.println(a[w]*a[w+1]);
		}
	}

}
