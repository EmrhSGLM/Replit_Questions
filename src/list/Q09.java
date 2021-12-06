package list;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string.(Ignore case sensitivity).
		 * 
		 * Input : Learning java is easy
		 * 
		 * Output: maximum occurring character is : a
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz : ");
		String cumle = scan.nextLine();
		int sayac = 0;
		int sayac1 = 0;
		char kova = 'Y';

		for (int i = 0; i < cumle.length(); i++) {
			sayac=0;

			for (int j = i + 1; j < cumle.length(); j++) {

				if (cumle.toLowerCase().charAt(i) == cumle.toLowerCase().charAt(j)) {
					sayac++;
				}

			}

			if (sayac > sayac1) {
				kova = cumle.charAt(i);
				sayac1=sayac;
			}
		}
		
		System.out.println("maximum occurring character is : " +kova);
		scan.close();
	}

}
