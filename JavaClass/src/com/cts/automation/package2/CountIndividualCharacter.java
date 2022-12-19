package com.cts.automation.package2;

import java.util.HashMap;
import java.util.Map;

public class CountIndividualCharacter {
	public void count(String value) {
	Map<Character,Integer> charCount= new HashMap<Character,Integer>();
	char[] ch= value.toCharArray();
	for(char total: ch) {
		if (charCount.containsKey(total)) {
			 charCount.put(total, charCount.get(total) + 1);
        }
        else {
        	charCount.put(total, 1);
        }
    }
    for (Map.Entry input : charCount.entrySet()) {
        System.out.println(input.getKey() + " " + input.getValue());
    }
}
	
	
	public static void main(String[] args) {
		
		String str= "TestAutomation";
		CountIndividualCharacter c1= new CountIndividualCharacter();
		c1.count(str);


	}

}
