package method_Array;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * Write a java program that calculates the average value of array elements
		 * 
		 * input[]= {1,2,3,4,5,6,7}
		 * 
		 * Output : 4
		 */
		
		int input[] = {1,2,3,4,5,6,7};
		int toplam=0;
		
		for (int i = 0; i < input.length ; i++) {
			toplam += input[i];
			
		}
		int ort=toplam/(input.length);
		System.out.println("array elementlerinin ortalamasi : " + ort);

	}

}
