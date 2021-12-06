package list;

import java.util.ArrayList;
import java.util.List;

public class Q06 {

	public static void main(String[] args) {
		/*
		 * Write a program to find the common elements between two String Arrays
		 * (without case sensitivity)
		 * 
		 * Input1 : {John,Brad,Ange,Sofia,Emily}
		 * 
		 * Input2 : {sofia,brad,grace,emily,hazel}
		 * 
		 * Output : [sofia,brad,emily]
		 */

		String arr[] = { "John", "Brad", "Ange", "Sofia", "Emily" };
		String arr1[] = { "sofia", "brad", "grace", "emily", "hazel" };

		List<String> kova = new ArrayList<String>();

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				
				if (arr1[i].toLowerCase().equals(arr[j].toLowerCase()) ) {
					kova.add(arr1[i].toLowerCase());
				}

			}

		}
		System.out.println(kova);

	}

}
