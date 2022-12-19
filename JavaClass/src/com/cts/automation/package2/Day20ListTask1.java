package com.cts.automation.package2;


import java.util.LinkedList;
import java.util.List;

public class Day20ListTask1 {

	public static void main(String[] args) {
		String a[][]= {{"Nivetha","Nishathi","Nimmi","Nila"},{"Shalini","Savithri","Sankari","Sangavi"},{"Durga","Dorika","Dora","Darsha"}};
		
		List<String> b= new LinkedList<String>();
		
		for (int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++)
			b.add(a[i][j]);
		}
		for (int k=0;k<=b.size()-1;k++) {
			System.out.println(b.get(k));
		}
		
	}

}
