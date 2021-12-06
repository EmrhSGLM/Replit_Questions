package For_While;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		/*
		 * Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız.
		 * (Mulakat Sorusu)
		 * 
		 * Input :1238
		 * 
		 * Output :Girilen Numananin Tersi: 8321
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz;Please,write a number : ");
		String sayi=scan.next();
		
		String ters ="";
		
		for (int i = sayi.length()-1 ; i >= 0 ; i--) {
			ters += sayi.substring(i, i+1);
						
		}
		
		System.out.println("Girilen sayinin tersi : "+ters);
		
		scan.close();
		
	}

}
