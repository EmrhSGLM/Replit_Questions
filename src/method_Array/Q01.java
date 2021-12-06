package method_Array;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Write a return method to reverse number.
		 * 
		 * Input : 12345
		 * 
		 * Output : 54321
		 */
		System.out.println("***** Solution with Arrray *****");

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number");

		String sayi = scan.next();

		String sayi1[] = sayi.split("");
		
		System.out.print("Reverse of number that  enter : ");

		for (int i = sayi1.length - 1; i >= 0; i--) {

			System.out.print(sayi1[i]);

		}
		
		
		System.out.println("\n\n");
		System.out.println("***** Solution with Method Creation *****");
		System.out.println("\nPlesae enter a number");
		
		String num = scan.next();

		
		System.out.println("Reverse of number that  enter : " + tersiniYaz(num));

	}

	public static String tersiniYaz(String num) {
		String ters = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			ters += num.substring(i, i + 1);
		}

		return ters;
	}

}
