package _05_list;

import java.util.Scanner;

public class QQQ8 {
	
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
		System.out.println("Lutfen bir cumle giriniz");
		String str=scan.nextLine();
		StringBuilder sb=new StringBuilder(str);
		
		String str1=sb.reverse().toString();
		System.out.println(str1);
		
		
		if (str.equalsIgnoreCase(str1)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Palindrome degil");
		}
		
		
		
	}

}
