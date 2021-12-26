package _02_SCANNER;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		/*
		 
		  Girilen zamanı saniyeye çeviren bir program yazınız.

			Örnek Çıktı:
					
			    1 saat 10 dakika 50 saniye ==>
					
				4250 saniye
		 
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Bulundugunuz zaman dilimini saat,dakika ve saniye degerlerini giriniz");
		int saat=scan.nextInt();
		int dakika=scan.nextInt();
		int saniye=scan.nextInt();
		
		int toplamSaniye=(saat*3600)+(dakika*60)+saniye;
		System.out.println(saat+" saat "+dakika+" dakika "+saniye+" saniye ===> \n"+toplamSaniye +" saniye");
		scan.close();
	}

}
