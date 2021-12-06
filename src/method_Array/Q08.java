package method_Array;

import java.util.Arrays;

public class Q08 {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts 2 integer Arrays as parameters And adds 2
		 * array into a new Array and prints it.
		 * 
		 * Input1={1,2,3,4}
		 * 
		 * Input2={5,6}
		 * 
		 * Output={1,2,3,4,5,6}
		 */

		int input1[] = { 1, 2, 3, 4 };
		int input2[] = { 5, 6 };
		
		int yeniArray[] = new int[6];
		

		for (int i = 0; i < input1.length; i++) {
			yeniArray[i] = input1[i];			
		}
		for (int i = 0; i < input2.length; i++) {
			yeniArray[i+input1.length] = input2[i];			
		}
		System.out.println(Arrays.toString(yeniArray));
		

	}

}
