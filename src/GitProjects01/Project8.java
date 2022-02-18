package GitProjects01;

public class Project8 {

	public static void main(String[] args) {
		//Maximum and minimum number in the array?
		
		int[] numbers= {36,23,56,15,5,78,30};
		
		int max=numbers[0];
		int min=numbers[0];
		
		for (int i=0; i<numbers.length; i++) {
		
			if (numbers[i]>max) {
				max=numbers[i];
				
				
			} else if (numbers[i]<min) {
				min=numbers[i];
				
			}
			
			
		
		}
		
		System.out.println("The minimum number is "+min+" and The maximum number is "+max);
		

	}

}
