package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata
		 * ceviren java kodunu yaziniz.
		 * 
		 * Input :
		 * 
		 * John White
		 * 
		 * 1234234534561478
		 * 
		 * Output : Name :
		 * 
		 * J*** W****
		 * 
		 * CCN : **** **** **** 1478
		 * 
		 * Ilk Harfler Buyuk harf ile baslamalidir.
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Adinizi giriniz : ");
		String ad=scan.next();
		System.out.println("Soyadinizi giriniz : ");
		String soyad=scan.next();
		System.out.println("Kredi karti numaranizi giriniz : ");
		String no=scan.next();
		
		System.out.println(ad.toUpperCase().charAt(0)+ad.substring(1).replaceAll("\\w", "*")+" "+
							soyad.toUpperCase().charAt(0)+soyad.substring(1).replaceAll("\\w", "*"));
		
		System.out.println("**** **** **** "+no.substring(no.length()-4));
		scan.close();

	}

}
