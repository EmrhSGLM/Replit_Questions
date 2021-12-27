package _03_For_While;

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
		 * Input :7  Output:7 is not Perfect Number(Mukemmel Sayi degildir.)
		 * 		 
		 * Input :6  Output:6 is Perfect Number (Mukemmel Sayidir .)
		 * 		  
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int i=1;
		int toplam=0;
		while(i < sayi) {
			
			if(sayi%i==0) {
				toplam += i;
			}
			i++;
		}
		System.out.println("Bolenlerin toplam ==> " +toplam);
		
		if(sayi == toplam) {
			System.out.println(sayi+" => Mukemmel bir sayidir");
		}else {
			System.out.println(sayi+" => Mukemmel bir sayi degildir");
		}
		

		

	}

}
