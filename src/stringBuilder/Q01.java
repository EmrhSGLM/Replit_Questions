package stringBuilder;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		/*
		 *  Write a java program which accept a sentence as parameter, 
		 *  than reverses sentence by using StringBuilder and checks if sentence is palindrome or not 
		 *  (without case sensitivity) 
		 *  
		 *  E.g:
		 *  
		 *  input : I love Java 
		 *  Output: "Reversed sentence : avaJ evol I 
		 *   It is not a palindrome"
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter a sentence");
		String str=scan.nextLine();
		
		StringBuilder sb=new StringBuilder(str);		
		System.out.print("Reverse of sentence that enter : " + sb.reverse());
		
		if (str.equalsIgnoreCase(sb.reverse().toString())) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
		scan.close();

	}

}
