package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * Write a program that accepts an integer as input and prints first 10 prime
		 * numbers greater than input Check numbers if they are even or not in a return
		 * method.
		 * 
		 * Input : 5
		 * 
		 * Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a check number");
		int check=scan.nextInt();
		List<Integer> primeNumber = new ArrayList<>();
		
		tenNum(primeNumber,check);
		System.out.println(primeNumber);
		scan.close();
		
		
		
		
	}

	public static List<Integer> tenNum(List<Integer> primeNumber, int check) {
		int sayac=0;
		for (int i = check+1 ; i > 0; i++) {
			
			if (sayac == 10) {
				break;				
			}
			
			if (i%2!=0 && i%3!=0 && i%5!=0) {
				primeNumber.add(i);
				sayac++;
			}
			
		}
		
		
		
		
	return primeNumber ;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
