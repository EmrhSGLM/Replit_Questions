package _02_SCANNER;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 
		 Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız. 
		 
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Bir sayi giriniz");
		double a=scan.nextDouble();
		
		int b=(int) a;
		System.out.println("Tamsayi degeri => "+b);
		scan.close();

	}

}
