package _05_list;

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
		int flag=0;
		for (int i = check+1 ; i > 0; i++) {
			flag=0;
			for (int j = 2; j  < i ; j++) {
				if (i % j == 0) {
					flag++;
					}
				
			}
			if (flag > 0) {
				continue;
			} else {
				primeNumber.add(i);
				sayac++;
			}
			
			if (sayac == 10) {
				break;		
			}						
		
		}
		
		
	return primeNumber ;}
	
}
