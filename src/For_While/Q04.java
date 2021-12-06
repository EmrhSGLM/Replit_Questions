package For_While;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * 		Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi
		 * yazıniz.
		 * 
		 * 		Write a return method that accepts an integer as input and calculates
		 * factorial and prints like output.
		 *
		 * Input : 6
		 * 
		 * Output: 6!=65432*1=720
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz : ");
		int sayi = scan.nextInt();

		System.out.print(sayi + "! = ");

		int faktoriyel = 1;

		for (int i = sayi; i > 1; i--) {
			faktoriyel *= i;
			System.out.print(i + "*");

		}
		System.out.print("1 = " + faktoriyel);
		scan.close();

	}

}
