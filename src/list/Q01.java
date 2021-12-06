package list;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string. (Ignore case sensitivity)
		 * 
		 * input :
		 * 
		 * Learning java is easy
		 * 
		 * output:
		 * 
		 * maximum occurring character is : a
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String ");
		String str = scan.nextLine();
		
		int sayac=0;
		int sayac1=0;
		char crc='b';

		for (int i = 0; i < str.length()-1; i++) {
			
			sayac1=0;
			
			for (int j = 0; j < str.length()-1 ; j++) {
				
				if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
					sayac1++;
					
				}				
			}
		if (sayac1 > sayac) {
			sayac=sayac1;
			crc=str.toLowerCase().charAt(i);
		}	
			
			
			
		}
		//System.out.println(sayac);
		System.out.println("maximum occurring character is :"+crc);
		scan.close();
	}

}
