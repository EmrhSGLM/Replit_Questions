package For_While;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
		 * 
		 * Input :
		 * 
		 * 30
		 * 
		 * 40
		 * 
		 * Beklenen Cikti:
		 * 
		 * 30 ve 40 icin GCD = 10
		 * 
		 * 30 ve 40 icin LCM = 120
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("2 tamsayi giriniz : ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		int kucuk = 0;
		int buyuk = 0;
		int lcm = 1;
		int gcd = 1;

		if (a > b) {
			buyuk = a;
			kucuk = b;

		} else if (a < b) {
			buyuk = b;
			kucuk = a;

		} else {

			buyuk = a;
			kucuk = a;
		}

		

		for (int i = 1; i <= buyuk; i++) {

			if (kucuk % i == 0 && buyuk % i == 0) {
				kucuk = kucuk / i;
				buyuk = buyuk / i;
				gcd *= i;

			}
		}
			
			System.out.println(kucuk);
			System.out.println(buyuk);

			
			lcm = kucuk * buyuk * gcd ;

			System.out.println("gcd =" + gcd);
			System.out.println("lcm =" + lcm);
			
			scan.close();
			

		}

	}

