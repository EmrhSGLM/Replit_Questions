package method_Array;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that reverse a sentence by using Array (with all spaces
		 * and special characters).
		 * 
		 * Input : Coding is greate.
		 * 
		 * Output : .etaerg si gnidoC
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a sentence");
		String str=scan.nextLine();
		
		String arr[] = str.split(" ");
		//System.out.print("str :"+Arrays.toString(arr));
		//System.out.println("");
		
		
		for (int i = arr.length-1; i >= 0 ; i--) {
						
			for (int j = arr[i].length()-1 ; j >= 0; j--) {
				System.out.print(arr[i].substring(j, j+1));				
			}
			System.out.print(" ");
			
		}
		scan.close();
				

	}

}
