package For_While;

import java.util.ArrayList;
import java.util.List;

public class qq {

	public static void main(String[] args) {
		
		List<String> hayvan = new ArrayList<>();
		hayvan.add("kedi");	
		hayvan.add("yilan");
		
		System.out.println(!hayvan.contains("kedi")); // true
		
		System.out.println(!hayvan.contains("tavsan")); // false 

	}

}
