package method_Array;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Write a method which accepts a String as parameter and prints the sum of the
		 * digits, present in the given string.
		 * 
		 * input : ade1r4d3
		 * 
		 * output : 8
		 * 
		 * Hint : Use Character.isDigit() Integer.valueOf()
		 */

		String str = "ade1r4d3";
		digitsSum(str);

	}

	public static void digitsSum(String str) {
		int topla = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			if (Character.isDigit(str.substring(i, i + 1).charAt(0))) {
				topla += Integer.valueOf(str.substring(i, i + 1));
			}
		}
		System.out.println("Sum of the digits : " +topla);

	}

}
