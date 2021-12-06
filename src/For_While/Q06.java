package For_While;

public class Q06 {

	public static void main(String[] args) {
		/*
		 * Konsolda Alfabeyi Yazdıran programi yaziniz.
		 * 
		 * OUTPUT :
		 * 
		 * a b c .. .. .. .. y z
		 */
		
		System.out.println(" ***** For Dongusu ***** ");
		
		for (int i = 0; i < 300 ; i++) {
			
			char krk=(char) i;
			
			if ( krk >= 'a' && krk <= 'z' ) {
				
				System.out.print(krk+" ");	
			}
			
			
			
		}
		System.out.println("");
		System.out.println(" ***** While Dongusu ***** ");
		
		int i = 0;
		
		
		
		while ( i < 300) {
			
			char krk=(char) i;
						
			if ( krk >= 'a' && krk <= 'z' ) {
				
				System.out.print(krk+" ");	
			}
				
			i++;			
			
		}

	}

}
