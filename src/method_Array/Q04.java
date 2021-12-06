package method_Array;

import java.util.Arrays;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * Create a custom return type method accepts a name as parameter and prints the
		 * name as a char array.
		 * 
		 * (do not use toCharArray() method)
		 * 
		 * 
		 * Input : John
		 * 
		 * Output :[J, o, h, n]
		 */
		
		String str="John";
				
		System.out.println(Arrays.toString(krkDizisi(str)));

	}

	private static String[] krkDizisi(String str) {
		String kelimeler[] = new String[str.length()];
		kelimeler=str.split("");
				
		
	return kelimeler ;}

}
