package For_While;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {

		/*
		 * Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		 * 
		 * Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi
		 * bir sayı Mükemmel Sayı olarak bilinir. 
		 * 
		 *  Write java code checking the number is Perfect number or not.
		 * 
		 * Any number can be a Java Perfect Number if the sum of its positive divisors
		 * excluding the number itself is equal to that number.
		 * 
		 * Input :6 
		 * 
		 * 		 * Output:6 is Perfect Number 
		 * 
		 * Input :7
		 * 
		 *  Output:7 is not Perfect Number
		 * 
		 * Input :
		 * 
		 * 6
		 * 
		 * Output:
		 * 
		 * 6 Mukemmel Sayidir.
		 * 
		 * ======================
		 * 
		 * Input
		 * 
		 * 7
		 * 
		 * Output:
		 * 
		 * 7 Mukemmel Sayidir degildir.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		int sayi = scan.nextInt();

		int toplama = 0;

		for (int i = 1; i < sayi; i++) {

			if (sayi % i == 0) {
				System.out.print(i + " ");
				toplama += i;

			}

		}
		System.out.println("");
		System.out.println("Bolenler toplami :" + toplama);

		if (sayi == toplama) {
			System.out.println(sayi + " mukemmei bir sayidir");

		} else {
			System.out.println(sayi + " mukemmel bir sayi degildir");

		}
		scan.close();

	}

}
