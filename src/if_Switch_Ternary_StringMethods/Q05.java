package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
		 * 
		 * INPUT:
		 * 
		 * Ay Numarasi:
		 * 
		 * 2
		 * 
		 * Yil :
		 * 
		 * 2016
		 * 
		 * OUTPUT :
		 * 
		 * Subat 2016 29 Gundur.
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter number of a month ");
		int ay=scan.nextInt();
		System.out.println("Please enter a year");
		int yil=scan.nextInt();
		
		if (ay == 2) {
			if (yil % 4 == 0) {
				System.out.println("Subat "+yil+" 29 Gundur");
			} else {
				System.out.println("Subat "+yil+" 28 Gundur");

			}
			
		}
			
		
		switch (ay) {
		case 1:
			System.out.print("Ocak "+yil+" 31 Gundurr");
			break;
		case 3:	
			System.out.print("Mart "+yil+" 31 Gundur");
			break;
		case 5:
			System.out.print("Mayis "+yil+" 31 Gundur");
			break;
		case 7:
			System.out.print("Temmuz "+yil+" 31 Gundur");
			break;
		case 8:
			System.out.print("Agustos "+yil+" 31 Gundur");
			break;
		case 10:
			System.out.print("Ekim "+yil+" 31 Gundur");
			break;
		case 12:
			System.out.print("Ocak "+yil+" 31 Gundur");
			break;
		case 4:
			System.out.print("Nisan "+yil+" 30 Gundur");
			break;
		case 6:	
			System.out.print("Haziran "+yil+" 30 Gundur");
			break;
		case 9:
			System.out.print("Eylul "+yil+" 30 Gundur");
			break;
		case 11:
			System.out.println("Kasim "+yil+" 30 Gundur");
			break;
		}
		
		scan.close();

	}

}
