package _02_SCANNER;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		/*
		 
		 Kullanıcıdan bir Float değer girmesini isteyin, 
		 bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
		 
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir deger giriniz");
		float x=scan.nextFloat();
		short y=(short) x;
		System.out.println("Short degeri => "+y);
		scan.close();
		
	}

}
