package GitProjects01;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		/*
		 *  Create an array on int values using a scanner and calculate 
		 *  the sum of all stored elements in that array.
		 */
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter length of the array");
		
		int length=input.nextInt();
		int[] numbers=new int[length];
		int sum =0;
		
		for(int i=0; i<length; i++) {
		System.out.println("Please enter values of the array");
			numbers[i]=input.nextInt();
			sum+=numbers[i];
			System.out.println("The sum of all stored elements is "+sum);
			
			
		}
		
		

	}

}
