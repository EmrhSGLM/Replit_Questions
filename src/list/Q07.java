package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * write a Java program to removes a specific element from an array and put the
		 * remaining elements in a new array and prints the new array
		 * 
		 * Input :{1,2,3,4,5,6}
		 * 
		 * element:6
		 * 
		 * Output : [1,2,3,4,5]
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen girilecek eleman sayisini giriniz : ");
		int elemanSayisi=scan.nextInt();
		
		List <Integer> kume = new ArrayList <>();
		
		for (int i = 1; i <= elemanSayisi; i++) {
			System.out.print("Lutfen " +i+ ". elemani giriniz : ");
			int sayi=scan.nextInt();
			kume.add(sayi);			
		}
		
		System.out.println("Lutfen silinecek elemani giriniz : ");
		int silinecekEleman=scan.nextInt();
		int index=0;
		
		for (int i = 0; i < kume.size(); i++) {
			if (kume.get(i) == silinecekEleman) {
				index=i;				
			}
			
		}
		
		kume.remove(index);
		System.out.println(kume);
		scan.close();		
		
		

	}

}
