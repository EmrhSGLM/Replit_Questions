package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir
		 * program yazın (BMI)
		 * 
		 * IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
		 * 
		 * BMI 18,5'in altındaysa zayıfsınız
		 * 
		 * BMI 18,5 ile 25 arasında ise kilonuz idealdir
		 * 
		 * BMI 25-30 arasındaysa şişmansınız
		 * 
		 * BMI 30'dan büyük veya eşitse, obez
		 * 
		 * Input:
		 * 
		 * Output:
		 * 
		 * Agirlik : 71
		 * 
		 * Boy : 1,72
		 * 
		 * BMI : 23.99945916711736
		 * 
		 * Zayifsiniz.
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("Kilonuzu giriniz :");
		double kilo=scan.nextDouble();
		System.out.println("Boyunuzu giriniz : ");
		double boy=scan.nextDouble();
		
		
		double bmi=kilo/(boy*boy);
		
		
		System.out.println("BMI: "+bmi);
		System.out.print( bmi < 18.5 ? "Zayifsiniz" : bmi > 18.5 && bmi < 25 ? "Kilonuz idealdir" : 
			bmi > 25 && bmi < 30 ? " şişmansiniz" : bmi >= 30 ? "obez " : "Hatali giris") ;
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
