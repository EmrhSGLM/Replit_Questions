package _05_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q071 {

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
		int arr[]= {1,2,3,4,5,6,6};
		System.out.println("Silinecek eleman giriniz");
		int silinecekEleman=scan.nextInt();
		List<Integer> list=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		int sayac=0;
		for (int i = 0; i <list.size(); i++) {
			if (list.get(i) == silinecekEleman) {
				list.remove(i);
				i--;
				sayac++;
			}			
		}
		if (sayac==0) {
			System.out.println("List icinde boyle bir eleman yok");
		} else {
			System.out.println("Girmis oldugunuz eleman silindi yeni list : "+list);
		}
		//System.out.println(list);
		
		
		

	}

}
