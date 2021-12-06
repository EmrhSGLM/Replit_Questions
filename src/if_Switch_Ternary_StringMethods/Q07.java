package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * 2 kelime oluşturun: isim1 ve isim2
		 * 
		 * // isim1 çift sayıda karakter içeriyorsa,
		 * 
		 * // ikinci kelimeyi ilk adın ortasına yerleştirin
		 * 
		 * // ilk kelime tek sayida karakter iceriyorsa
		 * 
		 * // “isim1, isim2 ye eklenemiyor” yazdırın
		 * 
		 * // Örneğin: // isim1= mehmet // isim2= ahmet // Yazdır ==> mehahmetmet
		 * 
		 * // isim1= memet // isim2= ahmet // Yazdır ==> isim1, isim2 ye eklenemiyor
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter two names: ");
		String name1=scan.next();
		String name2=scan.next();
		System.out.println("name1= "+name1+"\nname2= "+name2);
		
		if (name1.length() % 2 == 0) {
			 System.out.println("yazdir ==> "+name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2));
		} else {
			System.out.println("yazdir ==> cannot add name1 to name2");

		}
		scan.close();
		
		
		
		
	}

}
