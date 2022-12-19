package com.cts.automation.package2;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Day22MapTask1 {

	public static void main(String[] args) {
		Map<Integer,String> values = new LinkedHashMap<Integer,String>();
		values.put(1, "Nivetha");
		values.put(2,"Kalavathi");
		values.put(3, "Saravanan");
		values.put(4, "are");
		values.put(5, "one");
		values.put(6, "family");
		Set<Integer> keys= values.keySet();
		int total =0;
		for(Integer a: keys) {
			total =total+a;
		}

		System.out.println(total);
		
		Collection<String> value = values.values();
		 //System.out.println(value);
		 String singleString= "";
		 for(String b: value) {
			 singleString= singleString+b;
		 }
		 
		 System.out.println(singleString);
	}
	

}
