package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QQQ9 {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string.(Ignore case sensitivity).
		 * 
		 * Input : Learning java is easy
		 * 
		 * Output: maximum occurring character is : a
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir str giriniz");
		String str=scan.nextLine();
		List<String> list= new ArrayList<>();
		 int sayac=0;
		 int sayac1=0;
		 
		 for (int i = 0; i < str.length(); i++) {
			 sayac=0;
			 for (int j = i+1; j < str.length(); j++) {
				 if (str.substring(i, i+1).toLowerCase().charAt(0) == str.substring(j, j+1).toLowerCase().charAt(0)) {
					sayac++;
				}
				
			}
			 if (sayac > sayac1) {
				sayac1=sayac;
				list.add(str.substring(i, i+1));
				if (list.size()==2) {
					list.remove(0);
				}
			}
			 if (sayac==sayac1 && !list.contains(str.substring(i,i+1))) {
				list.add(str.substring(i, i+1));
			}
			 
			
		}
		 System.out.println(list);
		

	}

}
