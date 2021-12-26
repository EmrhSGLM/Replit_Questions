package _02_SCANNER;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		/*
		 
		  Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının 
		  toplamını bulmasını isteyin.
   
			   Örnek Çıktı:
			
			  Verilen tamsayının rakamları toplamı 10'dur.
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Uc basamakli bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int birler=sayi%10;
		int onlar=(sayi/10)%10;
		int yuzler=sayi/100;
		
		System.out.println("Verilen tamsayının rakamları toplamı "+(birler+onlar+yuzler)+"'dur");
		
		
		
		

	}

}
