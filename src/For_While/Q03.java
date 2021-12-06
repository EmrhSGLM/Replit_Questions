package For_While;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazıniz.(mülakat Sorusu)
		 * 
		 * Write a code that returns the duplicate chars in a String array.(interview
		 * Question)
		 * 
		 * Input :
		 * 
		 * String str=“Javaisalsoeasy”
		 * 
		 * Output: a, s
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz : ");
		String str = scan.nextLine();
		List<String> tekrarBulma = new ArrayList<String>();

		int sayac = 0;
	
		for (int i = 0; i < str.length() - 1; i++) {
			sayac = 0;

			for (int j = i + 1; j < str.length() - 1; j++) {

				if (str.charAt(i) == str.charAt(j)) {
					sayac++;
				}
			}

			if (sayac > 1 && !tekrarBulma.contains(str.substring(i, i + 1))) {

				tekrarBulma.add(str.substring(i, i + 1));

			}

		}
		//System.out.println(tekrarBulma);
		
		for (int i = 0; i < tekrarBulma.size(); i++) {
			System.out.print(tekrarBulma.get(i)+" ");
		}
		scan.close();

	}

}
