package _03_For_While;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri
		 * kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
		 * 
		 * (Ask user to enter a name and a character, then check how many times the
		 * character is repeated in the name using loops in the name)
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =“John came late"
		 * 
		 * Expected Output:
		 * 
		 * 
		 * Number of a = 2
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim giriniz ");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("karakter giriniz ");
		char krk=scan.next().toLowerCase().charAt(0);

		int krkSayac = 0;

		for (int i = 0; i < cumle.length() ; i++) {

			if (cumle.charAt(i) == krk) {
				krkSayac++;

			}

		}

		System.out.println("Number of " + 'a' + " = " + krkSayac);
		scan.close();

	}

}