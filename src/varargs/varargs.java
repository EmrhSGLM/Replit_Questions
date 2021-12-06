package varargs;

public class varargs {

	public static void main(String[] args) {
		/*
		 * Write a return method that accepts more than one integer as parameter and
		 * prints the sum of integers 
		 * Method name = sum 
		 * if you call method like that
		 * sum(1,2,3) output =6
		 *  sum(1,2,3,4,5) output =15 
		 *  sum(1,2) output=3
		 */
		
		//Scanner scan = new Scanner (System.in);
		 //sum();
		sum(1,2,3);
		sum(1,2,3,4,5);
		sum(1,2);
		
	}

	public static void sum(int... sayilar) {
		
		int toplam=0;		
		
		for (int d : sayilar) {
			
			toplam += d;
			
		}
		
		System.out.println("Girilen sayilarin toplami : " + toplam);
		
	}

}
