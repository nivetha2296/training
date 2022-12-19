package com.cts.automation.package2;

public class Day19Task2 {

	public static void main(String[] args) {
		int a[][]= {{2,5,5,5,5,3},{3,5,7,8,6,3},{1,3,5,2,6,7}};
		int b[][]= {{1,1,1,1,1,1},{5,4,5,4,5,4},{2,4,6,7,8,2}};
		int c[][]= new int[3][6];
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				 c[i][j]=a[i][j]*b[i][j];
			}
		}
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.println(c[i][j]);
			}
	}

	}
}
