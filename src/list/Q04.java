package list;

import java.util.ArrayList;
import java.util.List;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * Write a program that deletes the letters 'a' from the names in the list given
		 * as input.
		 * 
		 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
		 * 
		 * OUTPUT :
		 * 
		 * [Veli,Omer]
		 */
		
		String list[] = {"Ali","Veli","Ayse","Fatma","Omer"};
		
		List <String> list1 = new ArrayList <>();
		
		
		for (int i = 0; i < list.length; i++) {
			list1.add(list[i]);	
								
		}
		
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).contains("a") || list1.get(i).contains("A")) {
				list1.remove(i);
				i--;				
			}
			
		}
		System.out.println(list1);
		
		
		
		

	}

}
