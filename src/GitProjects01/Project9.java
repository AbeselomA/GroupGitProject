package GitProjects01;

public class Project9 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		
		int[] numbers= {36,23,56,15,5,78,30};
		
		int largestNumber = numbers[0];
		int secondLargest= numbers[0];
		
		for (int i=0; i<numbers.length; i++) {
			
			if(numbers[i]>largestNumber) {
				secondLargest=largestNumber;
				largestNumber=numbers[i];
				
			}else if (numbers[i]>secondLargest) {
				secondLargest=numbers[i];
				
			}
		}
		System.out.println("The second largest number is "+secondLargest);

	}

}
