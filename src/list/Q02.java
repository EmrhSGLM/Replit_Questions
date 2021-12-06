package list;

import java.util.ArrayList;
import java.util.List;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Create a 10-element list. Swap the 8th element with the 3rd element.
		 * 
		 * INPUT : String[]
		 * names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan",
		 * "Ahmet","Ali"};
		 * 
		 * Output:
		 * 
		 * [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		 */
		String names[] = { "Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali" };

		List<String> names1 = new ArrayList<>();

		for (int i = 0; i < names.length; i++) {

			names1.add(names[i]);
		}
		names1.set(2, "Furkan");
		names1.set(7, "Kemal");

		System.out.println(names1);
		
		
	}

}
