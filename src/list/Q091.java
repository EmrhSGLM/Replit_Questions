package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q091 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string.(Ignore case sensitivity).
		 * 
		 * Input : Learning java is easy
		 * 
		 * Output: maximum occurring character is : a
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value of ");
		String str = scan.nextLine();
		List<String> list = new ArrayList<>();
		int sayac = 0;
		int sayac1 = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			sayac = 0;
			for (int j = 1; j < str.length(); j++) {

				if (str.substring(i, i + 1).equalsIgnoreCase(str.substring(j, j + 1))) {
					sayac++;
				}
			}
			if (sayac > sayac1) {
				list.add(str.substring(i, i + 1));
				sayac1 = sayac;
			}
			if (list.size() == 2) {
				list.remove(0);
			}
		}
		System.out.println("maximum occurring character is : " + list.get(0));
		scan.close();

	}

}
