package For_While;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * 100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
		 * 
		 * Print even numbers from 20 to 0 but do not use decrement (i--).
		 * 
		 * OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
		 * 
		 * OUTPUT : 100 98 96 94 92 … … … … 2 0
		 */

		for (int i = -50; i <= 0; i++) {

			System.out.print((2 * i * -1) + " ");
		}

	}

}
