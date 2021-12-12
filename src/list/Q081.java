package list;

import java.util.Scanner;

public class Q081 {

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
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter value of a str");
		String str=scan.nextLine().toLowerCase();
		
		StringBuilder sb=new StringBuilder(str);
		
		if (sb == sb.reverse()) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println();
		}
		
		
		if (sb.compareTo(sb.reverse()) == 0) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println();
		}
		scan.close();

	}

}
