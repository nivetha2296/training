package ExamplePrograms;

import java.util.Scanner;

public class SumofOddNumbers {

	public static void main(String[] args) {
		int total =0;
		int odd=0;
		int count =0;
		int even =0;
		for(int i =1; i<=100;i++) {
			if(i%2==1) {
				total=total+i;//0+1=1//1+3=4//4+5=9
				odd++;
			}else if (i%2==0) {
				count = count+i;//0+2=2//2+4=6
				even++;
			}	
}	
System.out.println(total);// sum of odd numbers
System.out.println(count);// sum of even numbers
System.out.println(odd);
System.out.println(even);
 
	}
}

