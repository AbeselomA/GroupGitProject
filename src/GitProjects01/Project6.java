package GitProjects01;

import java.util.Scanner;

public class Project6 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		
		int num=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number");
		String result = "";
		 num=input.nextInt();
		
		for (int i=2; i<=num/2; i++) {
			
			if(num%i==0) {
				
				result=num+" is not a prime number";
				break;
				
			}else if (num%i!=0) {
				result=num+" is a prime number";
				
				
			}
			
			
		}System.out.println(result);
		
			
			
		

	}

}
