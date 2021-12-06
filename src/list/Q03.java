package list;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Get a sentence from the user. Accept the sentence received from the user as a
		 * parameter, Invert sentence using Array and write a Method that returns the
		 * result as a String to the main method.
		 * 
		 * Note: Upper and lower case letters, spaces and special characters will not be
		 * changed.
		 * 
		 * Input :
		 * 
		 * It is very nice to write code.
		 * 
		 * Output :
		 * 
		 * .edoc etirw ot ecin yrev si tI
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter a sentence");
		String str=scan.nextLine();
		
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		
		for (int i = arr.length-1; i >= 0; i--) {
			String ters="";
			String kova="";
			ters=arr[i];
			for (int j = ters.length()-1; j >= 0; j--) {
				kova+=ters.substring(j, j+1);
				
			}
			System.out.print(kova + " ");
		
			
		}
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
