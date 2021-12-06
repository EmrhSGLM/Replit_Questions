package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından
		 * oluşan yeni bir String yazdırın
		 * 
		 * Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
		 * 
		 * INPUT : Mustafa
		 * 
		 * OUTPUT : fafafa
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a name");
		String name = scan.next();

		if (name.length() > 2) {
			for (int i = 0; i < 3; i++) {
				System.out.print(name.substring(name.length()-2));				
			}
			

		} else {
			System.out.println("Hatali giris");

		}
		scan.close();

	}

}
