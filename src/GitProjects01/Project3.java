package GitProjects01;

public class Project3 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store odd and even numbers. 
		//Develop a program which will identify/print the even numbers only.
		
		int [] [] numbers= {
				{20,53,32,45},
				{65,76,87,98}
		};
		for(int i=0; i<=numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				
				String result = null;
				if (numbers[i][j]%2==0) {
					result=numbers[i][j]+" is even number";
					
				}else if (numbers[i][j]%2!=0) {
					result=numbers[i][j]+" is an odd number";
					
				}
				System.out.println(result);	
			}
		}

	}

}
