package _03_For_While;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
		 * 
		 * Input : 30      40
		
		 * Beklenen Cikti:
		 * 
		 * 30 ve 40 icin GCD => 10   	30 ve 40 icin LCM => 120		 
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Iki tamsayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int buyuk=0;
		int kucuk=0;
		
		if(sayi1>sayi2) {
			buyuk=sayi1;
			kucuk=sayi2;
		}else if(sayi1<sayi2) {
			buyuk=sayi2;
			kucuk=sayi1;
		} else {
			buyuk=sayi1;
			kucuk=sayi2;
		}
		
		int ebob=1;
		int ekok=1;
		
		for (int i = 1; i < buyuk; i++) {
			
			if(buyuk%i==0 && kucuk%i==0) {
				buyuk = buyuk/i;
				kucuk = kucuk/i;
				ebob *= i;
			}
			
		}
		ekok = buyuk * kucuk * ebob ;
		System.out.println("Ebob => " + ebob);
		System.out.println("Ekok => "+ ekok);
		
		

		}

	}

