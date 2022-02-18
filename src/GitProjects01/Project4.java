package GitProjects01;

public class Project4 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum of  
		//even and odd numbers for that array.
		int evenSum=0;
		int oddSum=0;
		int [] [] numbers= {
				{22,35,52,43},
				{67,96,87,100}
		};
		for (int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				if(numbers[i][j]%2==0) {
					evenSum+=numbers[i][j];
				}else if (numbers[i][j]%2!=0) {
					oddSum+=numbers[i][j];
				}
				
			}
			
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}

}
