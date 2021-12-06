package list;


import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		/*
		 * Write a java program which accept a sentence as parameter, than reverses
		 * sentence by using StringBuilder and checks if sentence is palindrome or not
		 * (without case sensitivity).Use StringBuilder.
		 * 
		 * Input :
		 * 
		 * I love Java.
		 * 
		 * Output:
		 * 
		 * Reversed sentence : avaJ evol I. It is not a palindrome"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence : ");
		String cumle = scan.nextLine();

		String str[] = cumle.split(" ");
		String kova = "";

		for (int i = str.length - 1; i >= 0; i--) {
			String ters = "";
			ters = str[i];

			for (int j = ters.length() - 1; j >= 0; j--) {
				kova += ters.substring(j, j + 1);
				
			}
			if (i == 0) {
				break;
			}
			
			kova += " ";

		}
		
		
		if (cumle.equals(kova)) {
			System.out.println("Reversed sentence : "+kova);

			System.out.println("It is a palindrome");
			
		} else {
			System.out.println("Reversed sentence : "+kova);

			System.out.println("It is not a palindrome");

		}
		
		scan.close();
	}

}
