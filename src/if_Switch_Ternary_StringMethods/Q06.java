package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından,
		 * adın aynı karakterlere sahip olup olmadığını kontrol edin.
		 * 
		 * Eger aynı karakterlere sahipse
		 * 
		 * "isim ayni karakterlere sahiptir." yazdirin.
		 * 
		 * Eger ayni karakterlere sahip degilse
		 * 
		 * "Dizenin benzersiz karakterleri var" yazdirin.
		 * 
		 * Ternary kullanin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please write a name");
		String name = scan.next();

		String sonuc = name.length() == 3 ? name.charAt(0) == name.charAt(1) && name.charAt(1) == name.charAt(2)
				? "isim ayni karakterlere sahiptir"
				: "Dizenin benzersiz karakterleri var" : "Hatali giris yaptiniz";

		System.out.println(sonuc);

		scan.close();

	}

}
