package method_Array;

public class Q06 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an integer array as input and prints the minimum
		 * and the maximum numbers from given array
		 * 
		 * Input : {-1,3,2,5,4,1,6,-2}
		 * 
		 * Output :
		 * 
		 * min: 1
		 * 
		 * max: 6
		 */
		
		int input[] = {3,2,5,4,1,6};
		
		
		
		minMax(input);
		

	}

	private static void minMax(int[] input) {
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < input.length; i++) {
			
			if (input[i] > max) {
				max = input[i];				
			}	
			if (input[0] > input[i]) {
				min = input[i];	
			}
			
			}		
		
		System.out.println("min : " + min + "\n\nmax : "+ max);
		
	}

	

}
