package com.cts.automation.package2;

import java.awt.List;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Day21SetTask {

	public static void main(String[] args) {
		Set<String> a= new LinkedHashSet<String>();
		a.add("Nivetha");
		a.add("Saravanan");
		a.add("Studying");
		a.add("working");
		a.add("Engineering");
		a.add("as Driver");
		for (String value:a) {
			System.out.println(value);
		}

		LinkedList b= new LinkedList(a);
		
		for(int i=0;i<=b.size()-1;i=i+2) {
			System.out.print(b.get(i));
			
		}
	}

	

}
