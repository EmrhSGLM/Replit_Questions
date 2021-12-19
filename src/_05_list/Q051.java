package _05_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q051 {
	
	static List<Integer> list=new ArrayList<>();

	public static void main(String[] args) {
		
		/*
		 * Write a program that accepts an integer as input and prints first 10 prime
		 * numbers greater than input Check numbers if they are even or not in a return
		 * method.
		 * 
		 * Input : 5
		 * 
		 * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 */
				
		//asalSayi();
		System.out.println(asalSayi());
		
		

	}

	private static List<Integer> asalSayi() {
		Scanner scan = new Scanner (System.in);
		System.out.println("sayi giriniz");
		int sayi=scan.nextInt();
		
		int sayac=0;
		int kontrol=0;
		for (int i = sayi+1; i > 0; i++) {
			
			kontrol=0;
			
			for (int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					kontrol++;
				}
			}
			
			if (kontrol == 0) {
				list.add(i);
				sayac++;
			} 
			if (sayac == 10) {
				break;
			}
			
		}
		scan.close();
		return list;
		
	}

}
