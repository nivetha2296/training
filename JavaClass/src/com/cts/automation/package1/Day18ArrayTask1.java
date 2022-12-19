package com.cts.automation.package1;

import java.util.Scanner;

public class Day18ArrayTask1 {
		

	public static void main(String[] args) {
 
		int arr[]= new int[10];
		
		System.out.println("Enter "+arr.length+" int values");
		Scanner sc= new Scanner(System.in);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("Enter the value of element no:"+(i+1));
			arr[i]=sc.nextInt();
		}
		for(int w=0;w<=arr.length-1;w++) {
			System.out.println(arr[w]);
		}
	}

}
