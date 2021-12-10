package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string. (Ignore case sensitivity)
		 * 
		 * input :
		 * 
		 * Learning java is easy
		 * 
		 * output:
		 * 
		 * maximum occurring character is : a
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a sentence");
		String str=scan.nextLine();
		List<String> list = new ArrayList<>();
		str=str.replaceAll(" ", "");
		int sayac=0;
		int sayac1=0;
		for (int i = 0; i < str.length()-1; i++) {
			
			sayac=0;
			
			for (int j = 1; j < str.length(); j++) {
				
				if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
					sayac++;
				}			
				
			}
			if (sayac > sayac1 && !list.contains(str.substring(i,i+1))) {
				sayac1=sayac;
				list.add(str.substring(i,i+1));
			}
			if (list.size() == 2) {
				list.remove(0);
				
			}
		}
		System.out.println("maximum occurring character is : "+ list);
		scan.close();
		
		
	}

}
