package if_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri
		 * gerçekleştiren bir switch ifadesi yazın:
		 * 
		 * 			yanıt a ise,
		 * 
		 * "Talebiniz işleniyor" mesajı yazdırılır
		 * 
		 * 			yanıt b ise,
		 * 
		 * "yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır 
		 * 	
		 * 			yanıt c ise,
		 * 
		 * "Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
		 * 
		 * 			başka herhangi bir yanıt değeri için,
		 * 
		 * "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter a name");
				
		char chr=scan.next().charAt(0);
		
		switch(chr) {
		case 'a':
			System.out.println("Talebiniz isleniyor");
			break;
		case 'b':
			System.out.println("yine de ilgilendiginiz için tesekkur ederiz");
			break;	
		case 'c':
			System.out.println("Uzgunuz, su anda herhangi bir yardim yok");
			break;		
		default :
			System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
					
		}
		
		 
		scan.close();
		

	}

}
