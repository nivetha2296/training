package com.cts.automation.package1;

import java.util.Scanner;

public class Day18TaskArray2 {

	public static void main(String[] args) {
  
		int v[]= new int[10];
		System.out.println("Enter "+v.length+" int values");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<=v.length-1;i++) {
			System.out.println("Enter the value of element no:"+(i+1));
			v[i]=sc.nextInt()*5;
		}
		for(int w=0;w<=v.length-1;w++) {
			System.out.println(v[w]);
		}
	}

}
