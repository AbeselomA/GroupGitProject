package GitProjects01;

public class Project2 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		int sum=0;
		int[] [] numbers= {
				
				{10,30,50,70},
				{100,300,500,700,},
				{1000,5000,6000}
		};
		
		for (int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				sum+=numbers[i][j];
			}
		}
			System.out.println(sum);
	}

}
