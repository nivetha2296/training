package com.cts.automation.package2;

public class Day19Task1 {

	public static void main(String[] args) {
		int a[][]= {{2,5,5,5,5,3},{3,5,7,8,6,3},{1,3,5,2,6,7}};
		
		int b[][]= new int[3][6];
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				 b[i][j]=a[i][j]*i*j;
			}
		}
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.println(b[i][j]);
			}
}
	}
}

