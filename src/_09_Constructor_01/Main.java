package _09_Constructor_01;

import java.util.Scanner;

class Oyuncu1 {
	
	static String kelime1;
	static int puan1;
	

	Oyuncu1(){
	
	}
	
	Oyuncu1(String kelime){
		this.kelime1=kelime;
	}
}

class Oyuncu2 {
	static int puan2;
	
	Oyuncu2() {
		Scanner scan = new Scanner (System.in);
		//Oyuncu1 kontrol=new Oyuncu1();
		System.out.println(Oyuncu1.kelime1+" kelimesi gecerli ise 1'i, gecersiz ise 2'yi giriniz");
		int tercih=scan.nextInt();
		if (tercih == 1) {
			for (int i = 0; i < Oyuncu1.kelime1.length(); i++) {
				Oyuncu1.puan1++;
			}			
		} else {
			for (int i = 0; i < Oyuncu1.kelime1.length(); i++) {
				puan2++;
			}			
			System.out.println("Gecersiz kelime Kaybettiniz");
		}
	}
	
		

}

public class Main {

	public static void main(String[] args) {
		
		char crc='F';
		while(!(crc == 'B')) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a word to start the play");
		String kelime=scan.next();
		Oyuncu1 oyuncu1 = new Oyuncu1(kelime);		
		Oyuncu2 oyuncu2 = new Oyuncu2();
		
		System.out.println("Please enter 'D' If want to continue ,  'B'  for finish ");
		crc=scan.next().toUpperCase().charAt(0);
		}
		
		
		System.out.print("\n***** OYUN SONA ERDİ *****\n\n KAZANAN : ");
		if (Oyuncu1.puan1 > Oyuncu2.puan2) {
			System.out.print("Oyuncu 1 ");
		} else System.out.print("Oyuncu 2 ");
		

	}

}
