package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {

		/*
		 * Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve
		 * yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan fazla
		 * basamakli olursa, "OverFlow" yazdırın.
		 * 
		 * Ornek:
		 * 
		 * INPUT :
		 * 
		 * 25
		 * 
		 * 46
		 * 
		 * OUTPUT :
		 * 
		 * Numaralarin Toplami:
		 * 
		 * 71
		 */
		
		Scanner scan =new Scanner (System.in);	
		System.out.println("2 sayi giriniz : ");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		
		int toplam = sayi1 + sayi2;
		String toplam1=Integer.toString(toplam);
		
		

		if ( toplam1.length() >= 10) {
			System.out.println("OverFlow");

		} else {
			System.out.println("Numaralarin Toplami:" + toplam);

		}
		

		/*
		  System.out.println("Please enter two integer"); 
		  int num1 = scan.nextInt();
		  int num2 = scan.nextInt(); 
		  int sum = num1 + num2 ;
		   if((sum) >= 1000000000 ) {
		  System.out.println("Overflow"); 
		  } else {
		  System.out.println("Sum of the numbers: " + (num1+num2));
		  }
		 */
		
		scan.close();

	}

}
